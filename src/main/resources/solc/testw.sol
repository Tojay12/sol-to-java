// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;


interface IERC20 {
    /**
     * @dev Emitted when `value` tokens are moved from one account (`from`) to
     * another (`to`).
     *
     * Note that `value` may be zero.
     */
    event Transfer(address indexed from, address indexed to, uint256 value);

    /**
     * @dev Emitted when the allowance of a `spender` for an `owner` is set by
     * a call to {approve}. `value` is the new allowance.
     */
    event Approval(address indexed owner, address indexed spender, uint256 value);

    /**
     * @dev Returns the value of tokens in existence.
     */
    function totalSupply() external view returns (uint256);

    /**
     * @dev Returns the value of tokens owned by `account`.
     */
    function balanceOf(address account) external view returns (uint256);

    /**
     * @dev Moves a `value` amount of tokens from the caller's account to `to`.
     *
     * Returns a boolean value indicating whether the operation succeeded.
     *
     * Emits a {Transfer} event.
     */
    function transfer(address to, uint256 value) external returns (bool);

    /**
     * @dev Returns the remaining number of tokens that `spender` will be
     * allowed to spend on behalf of `owner` through {transferFrom}. This is
     * zero by default.
     *
     * This value changes when {approve} or {transferFrom} are called.
     */
    function allowance(address owner, address spender) external view returns (uint256);

    /**
     * @dev Sets a `value` amount of tokens as the allowance of `spender` over the
     * caller's tokens.
     *
     * Returns a boolean value indicating whether the operation succeeded.
     *
     * IMPORTANT: Beware that changing an allowance with this method brings the risk
     * that someone may use both the old and the new allowance by unfortunate
     * transaction ordering. One possible solution to mitigate this race
     * condition is to first reduce the spender's allowance to 0 and set the
     * desired value afterwards:
     * https://github.com/ethereum/EIPs/issues/20#issuecomment-263524729
     *
     * Emits an {Approval} event.
     */
    function approve(address spender, uint256 value) external returns (bool);

    /**
     * @dev Moves a `value` amount of tokens from `from` to `to` using the
     * allowance mechanism. `value` is then deducted from the caller's
     * allowance.
     *
     * Returns a boolean value indicating whether the operation succeeded.
     *
     * Emits a {Transfer} event.
     */
    function transferFrom(address from, address to, uint256 value) external returns (bool);
}

contract MyToken {
    uint256 public airdropAmount = 20*10**18;
    uint256 constant rewardAmount=500*10**18;
    uint256 constant tokenPrice = 1 ; // Assuming USDT has 18 decimals
    uint256 public maxPresaleAmount = 63000000 * 10**18;
    uint256 constant minBuyAmount=10000*10**18;

    uint256 public purchaseAmount=1000;
    uint256 public rate=8;
    uint256 public soldPresaleAmount;
    IERC20 public usdt;
    IERC20 public bcpc;
    address public fun;

    struct User{
        address wallet;
        address referrer;
        uint256 personPurchaseAmount;
        uint256 reward;
    }




    mapping(address => bool) public airdropped;

    mapping(address => address) public referrers;

    mapping(address=>User)public users;

    mapping(address =>bool)public isPurchase;

    mapping(address=>address[])public downList;

    mapping(address=>bool)public  isReward;

    address[] public userAddrs;



    event NewUser(address indexed wallet);
    event NewPurchase(address indexed user, uint256 indexed purchaseAmount,uint256 time);
    event NewStaking(address indexed user, uint256 stakingAmount);
    event Airdropped(address indexed recipient, uint256 indexed  amount,uint256 time);
    event TokenPurchased(address indexed purchaser, uint256 indexed  amount,uint256 time);
    event Rewards(address indexed recipient,uint256 amount);
    event Set(address indexed from,address to);
    event PerReward(address indexed to,uint256 indexed  amount,uint256 time);

    constructor(address usdtAddress,address bcpcAddress,address funAddress)  {
        usdt = IERC20(usdtAddress);
        bcpc=IERC20(bcpcAddress);
        fun=funAddress;
    }
    //预售
    function purchase(uint256 bcpcAmount) external {
        require(soldPresaleAmount < maxPresaleAmount, "Presale ended");
        require(bcpcAmount>=minBuyAmount,"The purchase quantity is illegal");
        uint256 usdtAmount=bcpcAmount*tokenPrice/100;
        require(usdt.transferFrom(msg.sender, fun, usdtAmount), "Transfer failed");
        bcpc.transfer(msg.sender,bcpcAmount);
        soldPresaleAmount += bcpcAmount;

        users[msg.sender].personPurchaseAmount+=bcpcAmount;
        isPurchase[msg.sender]=true;

        address referrer=referrers[msg.sender];

        if(bcpc.balanceOf(referrer)>=20*10**18&&isReward[referrer]!=true){
            bcpc.transfer(referrer,rewardAmount);
            isReward[referrer]=true;
            users[referrer].reward=rewardAmount;
            soldPresaleAmount+=rewardAmount;
            userAddrs.push(referrer);
            emit PerReward(msg.sender,rewardAmount,block.timestamp);
        }
        userAddrs.push(msg.sender);
        emit TokenPurchased(msg.sender, bcpcAmount,block.timestamp);
    }

    function isAirDrop()external view returns(bool){
        return airdropped[msg.sender];
    }

    function getUser(address user)external view returns(User memory){
        return users[user];
    }

    function claimAirdrop() external {
        require(!airdropped[msg.sender], "Airdrop already claimed");
        airdropped[msg.sender] = true;
        bcpc.transfer(msg.sender, airdropAmount);
        soldPresaleAmount+=airdropAmount;
        if(referrers[msg.sender]!=address(0)){
            if(bcpc.balanceOf(referrers[msg.sender])>=airdropAmount){
                bcpc.transfer(referrers[msg.sender], airdropAmount/2);
                soldPresaleAmount+=airdropAmount/2;
            }

        }
        emit Airdropped(msg.sender, airdropAmount,block.timestamp);
    }

    function getSoldPresaleAmount()external view returns(uint256){
        return soldPresaleAmount;
    }



    // 设置用户的推荐人
    function setReferral(address referrer) external {
        // require(isPurchase[referrer], "referrer do not purchase");
        require(referrers[msg.sender] == address(0), "already binded");

        require(referrer!=msg.sender,"referrer!=owner");

        users[msg.sender].referrer = referrer;

        referrers[msg.sender] = referrer;

        downList[referrers[msg.sender]].push(msg.sender);


        emit Set(referrer,msg.sender);

    }

    function getAllUser()external view returns(address[]memory){
        return userAddrs;
    }

    function isReferrers()external view returns(bool){
        bool isBind =referrers[msg.sender]==address(0);
        return isBind;
    }

    function getDown(address user)external view returns(address[]memory){
        return downList[user];
    }

}
