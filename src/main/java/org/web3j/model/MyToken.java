//package org.web3j.model;
//
//import io.reactivex.Flowable;
//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.concurrent.Callable;
//import org.web3j.abi.EventEncoder;
//import org.web3j.abi.FunctionEncoder;
//import org.web3j.abi.TypeReference;
//import org.web3j.abi.datatypes.Address;
//import org.web3j.abi.datatypes.Bool;
//import org.web3j.abi.datatypes.DynamicArray;
//import org.web3j.abi.datatypes.Event;
//import org.web3j.abi.datatypes.Function;
//import org.web3j.abi.datatypes.StaticStruct;
//import org.web3j.abi.datatypes.Type;
//import org.web3j.abi.datatypes.generated.Uint256;
//import org.web3j.crypto.Credentials;
//import org.web3j.protocol.Web3j;
//import org.web3j.protocol.core.DefaultBlockParameter;
//import org.web3j.protocol.core.RemoteCall;
//import org.web3j.protocol.core.RemoteFunctionCall;
//import org.web3j.protocol.core.methods.request.EthFilter;
//import org.web3j.protocol.core.methods.response.BaseEventResponse;
//import org.web3j.protocol.core.methods.response.Log;
//import org.web3j.protocol.core.methods.response.TransactionReceipt;
//import org.web3j.tuples.generated.Tuple4;
//import org.web3j.tx.Contract;
//import org.web3j.tx.TransactionManager;
//import org.web3j.tx.gas.ContractGasProvider;
//
///**
// * <p>Auto generated code.
// * <p><strong>Do not modify!</strong>
// * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
// * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the
// * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
// *
// * <p>Generated with web3j version 4.11.1.
// */
//@SuppressWarnings("rawtypes")
//public class MyToken extends Contract {
//    public static final String BINARY = "60806040526801158e460913d000005f556a341cc4d7e46e7a9f0000006001556103e86002556008600355348015610035575f80fd5b506040516110d43803806110d4833981016040819052610054916100b1565b600580546001600160a01b039485166001600160a01b0319918216179091556006805493851693821693909317909255600780549190931691161790556100f1565b80516001600160a01b03811681146100ac575f80fd5b919050565b5f805f606084860312156100c3575f80fd5b6100cc84610096565b92506100da60208501610096565b91506100e860408501610096565b90509250925092565b610fd6806100fe5f395ff3fe608060405234801561000f575f80fd5b5060043610610153575f3560e01c8063946644cd116100bf578063afadac0811610079578063afadac0814610413578063c341853f1461042a578063d0516b8214610433578063e49024001461043c578063efef39a11461044f578063fc2ea8a514610462575f80fd5b8063946644cd1461034757806395e3a3e51461035a57806396053f77146103785780639e5914da14610381578063a15c176a14610394578063a87430ba146103a7575f80fd5b80634d5ce038116101105780634d5ce038146102155780635b88349d146102375780636460467514610241578063686c89db146102545780636f77926b14610267578063797a2a5e14610325575f80fd5b806320b57614146101575780632c4e722e1461018e5780632f48ab7d146101a557806342a86ae4146101d057806347531df8146101d85780634a3b68cc146101ed575b5f80fd5b610179610165366004610e5c565b60086020525f908152604090205460ff1681565b60405190151581526020015b60405180910390f35b61019760035481565b604051908152602001610185565b6005546101b8906001600160a01b031681565b6040516001600160a01b039091168152602001610185565b600454610197565b6101e061046a565b6040516101859190610e7c565b6101b86101fb366004610e5c565b60096020525f90815260409020546001600160a01b031681565b610179610223366004610e5c565b600d6020525f908152604090205460ff1681565b61023f6104ca565b005b6006546101b8906001600160a01b031681565b6101e0610262366004610e5c565b61076e565b6102e4610275366004610e5c565b60408051608080820183525f808352602080840182905283850182905260609384018290526001600160a01b039586168252600a815290849020845192830185528054861683526001810154909516908201526002840154928101929092526003909201549181019190915290565b604051610185919081516001600160a01b03908116825260208084015190911690820152604080830151908201526060918201519181019190915260800190565b610179610333366004610e5c565b600b6020525f908152604090205460ff1681565b6007546101b8906001600160a01b031681565b335f908152600960205260409020546001600160a01b031615610179565b61019760045481565b61023f61038f366004610e5c565b6107e1565b6101b86103a2366004610ec8565b61091b565b6103e86103b5366004610e5c565b600a6020525f908152604090208054600182015460028301546003909301546001600160a01b0392831693919092169184565b604080516001600160a01b039586168152949093166020850152918301526060820152608001610185565b335f9081526008602052604090205460ff16610179565b61019760025481565b61019760015481565b6101b861044a366004610ef0565b61094f565b61023f61045d366004610ef0565b610977565b6101975f5481565b6060600e8054806020026020016040519081016040528092919081815260200182805480156104c057602002820191905f5260205f20905b81546001600160a01b031681526001909101906020018083116104a2575b5050505050905090565b335f9081526008602052604090205460ff161561052e5760405162461bcd60e51b815260206004820152601760248201527f41697264726f7020616c726561647920636c61696d656400000000000000000060448201526064015b60405180910390fd5b335f81815260086020526040808220805460ff191660011790556006549154905163a9059cbb60e01b8152600481019390935260248301526001600160a01b03169063a9059cbb906044016020604051808303815f875af1158015610595573d5f803e3d5ffd5b505050506040513d601f19601f820116820180604052508101906105b99190610f07565b505f5460045f8282546105cc9190610f3a565b9091555050335f908152600960205260409020546001600160a01b031615610735575f805460065433835260096020526040928390205492516370a0823160e01b81526001600160a01b039384166004820152919216906370a0823190602401602060405180830381865afa158015610647573d5f803e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061066b9190610f53565b1061073557600654335f9081526009602052604081205490546001600160a01b039283169263a9059cbb9216906106a490600290610f6a565b6040516001600160e01b031960e085901b1681526001600160a01b03909216600483015260248201526044016020604051808303815f875af11580156106ec573d5f803e3d5ffd5b505050506040513d601f19601f820116820180604052508101906107109190610f07565b5060025f5461071f9190610f6a565b60045f82825461072f9190610f3a565b90915550505b5f5460405142815233907f7a688d4878cbd39da9b81cf43a08dadd22473d543d60975431287ab6d22e220c9060200160405180910390a3565b6001600160a01b0381165f908152600c60209081526040918290208054835181840281018401909452808452606093928301828280156107d557602002820191905f5260205f20905b81546001600160a01b031681526001909101906020018083116107b7575b50505050509050919050565b335f908152600960205260409020546001600160a01b0316156108375760405162461bcd60e51b815260206004820152600e60248201526d185b1c9958591e48189a5b99195960921b6044820152606401610525565b336001600160a01b038216036108815760405162461bcd60e51b815260206004820152600f60248201526e3932b332b93932b9109eb7bbb732b960891b6044820152606401610525565b335f818152600a60209081526040808320600190810180546001600160a01b0388166001600160a01b03199182168117909255600985528386208054821683179055818652600c855283862080549384018155865294849020909101805490941685179093555192835290917f8719a8e02538066e68ee6b66a2a530eb3af83e204cc2bce5926ed669aec6c65b910160405180910390a250565b600c602052815f5260405f208181548110610934575f80fd5b5f918252602090912001546001600160a01b03169150829050565b600e818154811061095e575f80fd5b5f918252602090912001546001600160a01b0316905081565b600154600454106109ba5760405162461bcd60e51b815260206004820152600d60248201526c141c995cd85b1948195b991959609a1b6044820152606401610525565b69021e19e0c9bab2400000811015610a145760405162461bcd60e51b815260206004820181905260248201527f546865207075726368617365207175616e7469747920697320696c6c6567616c6044820152606401610525565b5f6064610a22600184610f89565b610a2c9190610f6a565b6005546007546040516323b872dd60e01b81523360048201526001600160a01b0391821660248201526044810184905292935016906323b872dd906064016020604051808303815f875af1158015610a86573d5f803e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610aaa9190610f07565b610ae85760405162461bcd60e51b815260206004820152600f60248201526e151c985b9cd9995c8819985a5b1959608a1b6044820152606401610525565b60065460405163a9059cbb60e01b8152336004820152602481018490526001600160a01b039091169063a9059cbb906044016020604051808303815f875af1158015610b36573d5f803e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610b5a9190610f07565b508160045f828254610b6c9190610f3a565b9091555050335f908152600a602052604081206002018054849290610b92908490610f3a565b9091555050335f908152600b60209081526040808320805460ff191660011790556009909152908190205460065491516370a0823160e01b81526001600160a01b0391821660048201819052926801158e460913d000009216906370a0823190602401602060405180830381865afa158015610c10573d5f803e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610c349190610f53565b10158015610c5f57506001600160a01b0381165f908152600d602052604090205460ff161515600114155b15610dc25760065460405163a9059cbb60e01b81526001600160a01b038381166004830152681b1ae4d6e2ef50000060248301529091169063a9059cbb906044016020604051808303815f875af1158015610cbc573d5f803e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610ce09190610f07565b506001600160a01b0381165f908152600d60209081526040808320805460ff19166001179055600a9091528120681b1ae4d6e2ef50000060039091018190556004805491929091610d32908490610f3a565b9091555050600e80546001810182555f919091527fbb7b4a454dc3493923482f07822329ed19e8244eff582cc204f8554c3620c3fd0180546001600160a01b0319166001600160a01b038316179055604051428152681b1ae4d6e2ef5000009033907f9806e03b161c4221c4c543cb588a662d70c3e9aad1bf049c39082623e9c9ce0f9060200160405180910390a35b600e80546001810182555f919091527fbb7b4a454dc3493923482f07822329ed19e8244eff582cc204f8554c3620c3fd0180546001600160a01b031916339081179091556040514281528491907f3ceffd410054fdaed44f598ff5c1fb450658778e2241892da4aa646979dee6179060200160405180910390a3505050565b80356001600160a01b0381168114610e57575f80fd5b919050565b5f60208284031215610e6c575f80fd5b610e7582610e41565b9392505050565b602080825282518282018190525f9190848201906040850190845b81811015610ebc5783516001600160a01b031683529284019291840191600101610e97565b50909695505050505050565b5f8060408385031215610ed9575f80fd5b610ee283610e41565b946020939093013593505050565b5f60208284031215610f00575f80fd5b5035919050565b5f60208284031215610f17575f80fd5b81518015158114610e75575f80fd5b634e487b7160e01b5f52601160045260245ffd5b80820180821115610f4d57610f4d610f26565b92915050565b5f60208284031215610f63575f80fd5b5051919050565b5f82610f8457634e487b7160e01b5f52601260045260245ffd5b500490565b8082028115828204841417610f4d57610f4d610f2656fea264697066735822122025d39b64c214588a2b28bfd735c50d60f283889dc3b0733ca34d28228ab6fc6764736f6c63430008140033";
//
//    private static String librariesLinkedBinary;
//
//    public static final String FUNC_AIRDROPAMOUNT = "airdropAmount";
//
//    public static final String FUNC_AIRDROPPED = "airdropped";
//
//    public static final String FUNC_BCPC = "bcpc";
//
//    public static final String FUNC_CLAIMAIRDROP = "claimAirdrop";
//
//    public static final String FUNC_DOWNLIST = "downList";
//
//    public static final String FUNC_FUN = "fun";
//
//    public static final String FUNC_GETALLUSER = "getAllUser";
//
//    public static final String FUNC_GETDOWN = "getDown";
//
//    public static final String FUNC_GETSOLDPRESALEAMOUNT = "getSoldPresaleAmount";
//
//    public static final String FUNC_GETUSER = "getUser";
//
//    public static final String FUNC_ISAIRDROP = "isAirDrop";
//
//    public static final String FUNC_ISPURCHASE = "isPurchase";
//
//    public static final String FUNC_ISREFERRERS = "isReferrers";
//
//    public static final String FUNC_ISREWARD = "isReward";
//
//    public static final String FUNC_MAXPRESALEAMOUNT = "maxPresaleAmount";
//
//    public static final String FUNC_PURCHASE = "purchase";
//
//    public static final String FUNC_PURCHASEAMOUNT = "purchaseAmount";
//
//    public static final String FUNC_RATE = "rate";
//
//    public static final String FUNC_REFERRERS = "referrers";
//
//    public static final String FUNC_SETREFERRAL = "setReferral";
//
//    public static final String FUNC_SOLDPRESALEAMOUNT = "soldPresaleAmount";
//
//    public static final String FUNC_USDT = "usdt";
//
//    public static final String FUNC_USERADDRS = "userAddrs";
//
//    public static final String FUNC_USERS = "users";
//
//    public static final Event AIRDROPPED_EVENT = new Event("Airdropped",
//            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Uint256>(true) {}, new TypeReference<Uint256>() {}));
//    ;
//
//    public static final Event NEWPURCHASE_EVENT = new Event("NewPurchase",
//            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Uint256>(true) {}, new TypeReference<Uint256>() {}));
//    ;
//
//    public static final Event NEWSTAKING_EVENT = new Event("NewStaking",
//            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
//    ;
//
//    public static final Event NEWUSER_EVENT = new Event("NewUser",
//            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}));
//    ;
//
//    public static final Event PERREWARD_EVENT = new Event("PerReward",
//            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Uint256>(true) {}, new TypeReference<Uint256>() {}));
//    ;
//
//    public static final Event REWARDS_EVENT = new Event("Rewards",
//            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
//    ;
//
//    public static final Event SET_EVENT = new Event("Set",
//            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>() {}));
//    ;
//
//    public static final Event TOKENPURCHASED_EVENT = new Event("TokenPurchased",
//            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Uint256>(true) {}, new TypeReference<Uint256>() {}));
//    ;
//
//    @Deprecated
//    protected MyToken(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
//        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
//    }
//
//    protected MyToken(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
//        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
//    }
//
//    @Deprecated
//    protected MyToken(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
//        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
//    }
//
//    protected MyToken(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
//        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
//    }
//
//    public static List<AirdroppedEventResponse> getAirdroppedEvents(TransactionReceipt transactionReceipt) {
//        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(AIRDROPPED_EVENT, transactionReceipt);
//        ArrayList<AirdroppedEventResponse> responses = new ArrayList<AirdroppedEventResponse>(valueList.size());
//        for (Contract.EventValuesWithLog eventValues : valueList) {
//            AirdroppedEventResponse typedResponse = new AirdroppedEventResponse();
//            typedResponse.log = eventValues.getLog();
//            typedResponse.recipient = (String) eventValues.getIndexedValues().get(0).getValue();
//            typedResponse.amount = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
//            typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//            responses.add(typedResponse);
//        }
//        return responses;
//    }
//
//    public static AirdroppedEventResponse getAirdroppedEventFromLog(Log log) {
//        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(AIRDROPPED_EVENT, log);
//        AirdroppedEventResponse typedResponse = new AirdroppedEventResponse();
//        typedResponse.log = log;
//        typedResponse.recipient = (String) eventValues.getIndexedValues().get(0).getValue();
//        typedResponse.amount = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
//        typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//        return typedResponse;
//    }
//
//    public Flowable<AirdroppedEventResponse> airdroppedEventFlowable(EthFilter filter) {
//        return web3j.ethLogFlowable(filter).map(log -> getAirdroppedEventFromLog(log));
//    }
//
//    public Flowable<AirdroppedEventResponse> airdroppedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
//        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
//        filter.addSingleTopic(EventEncoder.encode(AIRDROPPED_EVENT));
//        return airdroppedEventFlowable(filter);
//    }
//
//    public static List<NewPurchaseEventResponse> getNewPurchaseEvents(TransactionReceipt transactionReceipt) {
//        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(NEWPURCHASE_EVENT, transactionReceipt);
//        ArrayList<NewPurchaseEventResponse> responses = new ArrayList<NewPurchaseEventResponse>(valueList.size());
//        for (Contract.EventValuesWithLog eventValues : valueList) {
//            NewPurchaseEventResponse typedResponse = new NewPurchaseEventResponse();
//            typedResponse.log = eventValues.getLog();
//            typedResponse.user = (String) eventValues.getIndexedValues().get(0).getValue();
//            typedResponse.purchaseAmount = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
//            typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//            responses.add(typedResponse);
//        }
//        return responses;
//    }
//
//    public static NewPurchaseEventResponse getNewPurchaseEventFromLog(Log log) {
//        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(NEWPURCHASE_EVENT, log);
//        NewPurchaseEventResponse typedResponse = new NewPurchaseEventResponse();
//        typedResponse.log = log;
//        typedResponse.user = (String) eventValues.getIndexedValues().get(0).getValue();
//        typedResponse.purchaseAmount = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
//        typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//        return typedResponse;
//    }
//
//    public Flowable<NewPurchaseEventResponse> newPurchaseEventFlowable(EthFilter filter) {
//        return web3j.ethLogFlowable(filter).map(log -> getNewPurchaseEventFromLog(log));
//    }
//
//    public Flowable<NewPurchaseEventResponse> newPurchaseEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
//        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
//        filter.addSingleTopic(EventEncoder.encode(NEWPURCHASE_EVENT));
//        return newPurchaseEventFlowable(filter);
//    }
//
//    public static List<NewStakingEventResponse> getNewStakingEvents(TransactionReceipt transactionReceipt) {
//        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(NEWSTAKING_EVENT, transactionReceipt);
//        ArrayList<NewStakingEventResponse> responses = new ArrayList<NewStakingEventResponse>(valueList.size());
//        for (Contract.EventValuesWithLog eventValues : valueList) {
//            NewStakingEventResponse typedResponse = new NewStakingEventResponse();
//            typedResponse.log = eventValues.getLog();
//            typedResponse.user = (String) eventValues.getIndexedValues().get(0).getValue();
//            typedResponse.stakingAmount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//            responses.add(typedResponse);
//        }
//        return responses;
//    }
//
//    public static NewStakingEventResponse getNewStakingEventFromLog(Log log) {
//        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(NEWSTAKING_EVENT, log);
//        NewStakingEventResponse typedResponse = new NewStakingEventResponse();
//        typedResponse.log = log;
//        typedResponse.user = (String) eventValues.getIndexedValues().get(0).getValue();
//        typedResponse.stakingAmount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//        return typedResponse;
//    }
//
//    public Flowable<NewStakingEventResponse> newStakingEventFlowable(EthFilter filter) {
//        return web3j.ethLogFlowable(filter).map(log -> getNewStakingEventFromLog(log));
//    }
//
//    public Flowable<NewStakingEventResponse> newStakingEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
//        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
//        filter.addSingleTopic(EventEncoder.encode(NEWSTAKING_EVENT));
//        return newStakingEventFlowable(filter);
//    }
//
//    public static List<NewUserEventResponse> getNewUserEvents(TransactionReceipt transactionReceipt) {
//        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(NEWUSER_EVENT, transactionReceipt);
//        ArrayList<NewUserEventResponse> responses = new ArrayList<NewUserEventResponse>(valueList.size());
//        for (Contract.EventValuesWithLog eventValues : valueList) {
//            NewUserEventResponse typedResponse = new NewUserEventResponse();
//            typedResponse.log = eventValues.getLog();
//            typedResponse.wallet = (String) eventValues.getIndexedValues().get(0).getValue();
//            responses.add(typedResponse);
//        }
//        return responses;
//    }
//
//    public static NewUserEventResponse getNewUserEventFromLog(Log log) {
//        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(NEWUSER_EVENT, log);
//        NewUserEventResponse typedResponse = new NewUserEventResponse();
//        typedResponse.log = log;
//        typedResponse.wallet = (String) eventValues.getIndexedValues().get(0).getValue();
//        return typedResponse;
//    }
//
//    public Flowable<NewUserEventResponse> newUserEventFlowable(EthFilter filter) {
//        return web3j.ethLogFlowable(filter).map(log -> getNewUserEventFromLog(log));
//    }
//
//    public Flowable<NewUserEventResponse> newUserEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
//        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
//        filter.addSingleTopic(EventEncoder.encode(NEWUSER_EVENT));
//        return newUserEventFlowable(filter);
//    }
//
//    public static List<PerRewardEventResponse> getPerRewardEvents(TransactionReceipt transactionReceipt) {
//        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(PERREWARD_EVENT, transactionReceipt);
//        ArrayList<PerRewardEventResponse> responses = new ArrayList<PerRewardEventResponse>(valueList.size());
//        for (Contract.EventValuesWithLog eventValues : valueList) {
//            PerRewardEventResponse typedResponse = new PerRewardEventResponse();
//            typedResponse.log = eventValues.getLog();
//            typedResponse.to = (String) eventValues.getIndexedValues().get(0).getValue();
//            typedResponse.amount = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
//            typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//            responses.add(typedResponse);
//        }
//        return responses;
//    }
//
//    public static PerRewardEventResponse getPerRewardEventFromLog(Log log) {
//        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(PERREWARD_EVENT, log);
//        PerRewardEventResponse typedResponse = new PerRewardEventResponse();
//        typedResponse.log = log;
//        typedResponse.to = (String) eventValues.getIndexedValues().get(0).getValue();
//        typedResponse.amount = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
//        typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//        return typedResponse;
//    }
//
//    public Flowable<PerRewardEventResponse> perRewardEventFlowable(EthFilter filter) {
//        return web3j.ethLogFlowable(filter).map(log -> getPerRewardEventFromLog(log));
//    }
//
//    public Flowable<PerRewardEventResponse> perRewardEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
//        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
//        filter.addSingleTopic(EventEncoder.encode(PERREWARD_EVENT));
//        return perRewardEventFlowable(filter);
//    }
//
//    public static List<RewardsEventResponse> getRewardsEvents(TransactionReceipt transactionReceipt) {
//        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(REWARDS_EVENT, transactionReceipt);
//        ArrayList<RewardsEventResponse> responses = new ArrayList<RewardsEventResponse>(valueList.size());
//        for (Contract.EventValuesWithLog eventValues : valueList) {
//            RewardsEventResponse typedResponse = new RewardsEventResponse();
//            typedResponse.log = eventValues.getLog();
//            typedResponse.recipient = (String) eventValues.getIndexedValues().get(0).getValue();
//            typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//            responses.add(typedResponse);
//        }
//        return responses;
//    }
//
//    public static RewardsEventResponse getRewardsEventFromLog(Log log) {
//        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(REWARDS_EVENT, log);
//        RewardsEventResponse typedResponse = new RewardsEventResponse();
//        typedResponse.log = log;
//        typedResponse.recipient = (String) eventValues.getIndexedValues().get(0).getValue();
//        typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//        return typedResponse;
//    }
//
//    public Flowable<RewardsEventResponse> rewardsEventFlowable(EthFilter filter) {
//        return web3j.ethLogFlowable(filter).map(log -> getRewardsEventFromLog(log));
//    }
//
//    public Flowable<RewardsEventResponse> rewardsEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
//        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
//        filter.addSingleTopic(EventEncoder.encode(REWARDS_EVENT));
//        return rewardsEventFlowable(filter);
//    }
//
//    public static List<SetEventResponse> getSetEvents(TransactionReceipt transactionReceipt) {
//        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(SET_EVENT, transactionReceipt);
//        ArrayList<SetEventResponse> responses = new ArrayList<SetEventResponse>(valueList.size());
//        for (Contract.EventValuesWithLog eventValues : valueList) {
//            SetEventResponse typedResponse = new SetEventResponse();
//            typedResponse.log = eventValues.getLog();
//            typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
//            typedResponse.to = (String) eventValues.getNonIndexedValues().get(0).getValue();
//            responses.add(typedResponse);
//        }
//        return responses;
//    }
//
//    public static SetEventResponse getSetEventFromLog(Log log) {
//        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(SET_EVENT, log);
//        SetEventResponse typedResponse = new SetEventResponse();
//        typedResponse.log = log;
//        typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
//        typedResponse.to = (String) eventValues.getNonIndexedValues().get(0).getValue();
//        return typedResponse;
//    }
//
//    public Flowable<SetEventResponse> setEventFlowable(EthFilter filter) {
//        return web3j.ethLogFlowable(filter).map(log -> getSetEventFromLog(log));
//    }
//
//    public Flowable<SetEventResponse> setEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
//        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
//        filter.addSingleTopic(EventEncoder.encode(SET_EVENT));
//        return setEventFlowable(filter);
//    }
//
//    public static List<TokenPurchasedEventResponse> getTokenPurchasedEvents(TransactionReceipt transactionReceipt) {
//        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(TOKENPURCHASED_EVENT, transactionReceipt);
//        ArrayList<TokenPurchasedEventResponse> responses = new ArrayList<TokenPurchasedEventResponse>(valueList.size());
//        for (Contract.EventValuesWithLog eventValues : valueList) {
//            TokenPurchasedEventResponse typedResponse = new TokenPurchasedEventResponse();
//            typedResponse.log = eventValues.getLog();
//            typedResponse.purchaser = (String) eventValues.getIndexedValues().get(0).getValue();
//            typedResponse.amount = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
//            typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//            responses.add(typedResponse);
//        }
//        return responses;
//    }
//
//    public static TokenPurchasedEventResponse getTokenPurchasedEventFromLog(Log log) {
//        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(TOKENPURCHASED_EVENT, log);
//        TokenPurchasedEventResponse typedResponse = new TokenPurchasedEventResponse();
//        typedResponse.log = log;
//        typedResponse.purchaser = (String) eventValues.getIndexedValues().get(0).getValue();
//        typedResponse.amount = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
//        typedResponse.time = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//        return typedResponse;
//    }
//
//    public Flowable<TokenPurchasedEventResponse> tokenPurchasedEventFlowable(EthFilter filter) {
//        return web3j.ethLogFlowable(filter).map(log -> getTokenPurchasedEventFromLog(log));
//    }
//
//    public Flowable<TokenPurchasedEventResponse> tokenPurchasedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
//        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
//        filter.addSingleTopic(EventEncoder.encode(TOKENPURCHASED_EVENT));
//        return tokenPurchasedEventFlowable(filter);
//    }
//
//    public RemoteFunctionCall<BigInteger> airdropAmount() {
//        final Function function = new Function(FUNC_AIRDROPAMOUNT,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
//    }
//
//    public RemoteFunctionCall<Boolean> airdropped(String param0) {
//        final Function function = new Function(FUNC_AIRDROPPED,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
//        return executeRemoteCallSingleValueReturn(function, Boolean.class);
//    }
//
//    public RemoteFunctionCall<String> bcpc() {
//        final Function function = new Function(FUNC_BCPC,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
//        return executeRemoteCallSingleValueReturn(function, String.class);
//    }
//
//    public RemoteFunctionCall<TransactionReceipt> claimAirdrop() {
//        final Function function = new Function(
//                FUNC_CLAIMAIRDROP,
//                Arrays.<Type>asList(),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteFunctionCall<String> downList(String param0, BigInteger param1) {
//        final Function function = new Function(FUNC_DOWNLIST,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0),
//                new org.web3j.abi.datatypes.generated.Uint256(param1)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
//        return executeRemoteCallSingleValueReturn(function, String.class);
//    }
//
//    public RemoteFunctionCall<String> fun() {
//        final Function function = new Function(FUNC_FUN,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
//        return executeRemoteCallSingleValueReturn(function, String.class);
//    }
//
//    public RemoteFunctionCall<List> getAllUser() {
//        final Function function = new Function(FUNC_GETALLUSER,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
//        return new RemoteFunctionCall<List>(function,
//                new Callable<List>() {
//                    @Override
//                    @SuppressWarnings("unchecked")
//                    public List call() throws Exception {
//                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
//                        return convertToNative(result);
//                    }
//                });
//    }
//
//    public RemoteFunctionCall<List> getDown(String user) {
//        final Function function = new Function(FUNC_GETDOWN,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, user)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
//        return new RemoteFunctionCall<List>(function,
//                new Callable<List>() {
//                    @Override
//                    @SuppressWarnings("unchecked")
//                    public List call() throws Exception {
//                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
//                        return convertToNative(result);
//                    }
//                });
//    }
//
//    public RemoteFunctionCall<BigInteger> getSoldPresaleAmount() {
//        final Function function = new Function(FUNC_GETSOLDPRESALEAMOUNT,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
//    }
//
//    public RemoteFunctionCall<User> getUser(String user) {
//        final Function function = new Function(FUNC_GETUSER,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, user)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<User>() {}));
//        return executeRemoteCallSingleValueReturn(function, User.class);
//    }
//
//    public RemoteFunctionCall<Boolean> isAirDrop() {
//        final Function function = new Function(FUNC_ISAIRDROP,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
//        return executeRemoteCallSingleValueReturn(function, Boolean.class);
//    }
//
//    public RemoteFunctionCall<Boolean> isPurchase(String param0) {
//        final Function function = new Function(FUNC_ISPURCHASE,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
//        return executeRemoteCallSingleValueReturn(function, Boolean.class);
//    }
//
//    public RemoteFunctionCall<Boolean> isReferrers() {
//        final Function function = new Function(FUNC_ISREFERRERS,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
//        return executeRemoteCallSingleValueReturn(function, Boolean.class);
//    }
//
//    public RemoteFunctionCall<Boolean> isReward(String param0) {
//        final Function function = new Function(FUNC_ISREWARD,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
//        return executeRemoteCallSingleValueReturn(function, Boolean.class);
//    }
//
//    public RemoteFunctionCall<BigInteger> maxPresaleAmount() {
//        final Function function = new Function(FUNC_MAXPRESALEAMOUNT,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
//    }
//
//    public RemoteFunctionCall<TransactionReceipt> purchase(BigInteger bcpcAmount) {
//        final Function function = new Function(
//                FUNC_PURCHASE,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(bcpcAmount)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteFunctionCall<BigInteger> purchaseAmount() {
//        final Function function = new Function(FUNC_PURCHASEAMOUNT,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
//    }
//
//    public RemoteFunctionCall<BigInteger> rate() {
//        final Function function = new Function(FUNC_RATE,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
//    }
//
//    public RemoteFunctionCall<String> referrers(String param0) {
//        final Function function = new Function(FUNC_REFERRERS,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
//        return executeRemoteCallSingleValueReturn(function, String.class);
//    }
//
//    public RemoteFunctionCall<TransactionReceipt> setReferral(String referrer) {
//        final Function function = new Function(
//                FUNC_SETREFERRAL,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, referrer)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteFunctionCall<BigInteger> soldPresaleAmount() {
//        final Function function = new Function(FUNC_SOLDPRESALEAMOUNT,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
//    }
//
//    public RemoteFunctionCall<String> usdt() {
//        final Function function = new Function(FUNC_USDT,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
//        return executeRemoteCallSingleValueReturn(function, String.class);
//    }
//
//    public RemoteFunctionCall<String> userAddrs(BigInteger param0) {
//        final Function function = new Function(FUNC_USERADDRS,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
//        return executeRemoteCallSingleValueReturn(function, String.class);
//    }
//
//    public RemoteFunctionCall<Tuple4<String, String, BigInteger, BigInteger>> users(String param0) {
//        final Function function = new Function(FUNC_USERS,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
//        return new RemoteFunctionCall<Tuple4<String, String, BigInteger, BigInteger>>(function,
//                new Callable<Tuple4<String, String, BigInteger, BigInteger>>() {
//                    @Override
//                    public Tuple4<String, String, BigInteger, BigInteger> call() throws Exception {
//                        List<Type> results = executeCallMultipleValueReturn(function);
//                        return new Tuple4<String, String, BigInteger, BigInteger>(
//                                (String) results.get(0).getValue(),
//                                (String) results.get(1).getValue(),
//                                (BigInteger) results.get(2).getValue(),
//                                (BigInteger) results.get(3).getValue());
//                    }
//                });
//    }
//
//    @Deprecated
//    public static MyToken load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
//        return new MyToken(contractAddress, web3j, credentials, gasPrice, gasLimit);
//    }
//
//    @Deprecated
//    public static MyToken load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
//        return new MyToken(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
//    }
//
//    public static MyToken load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
//        return new MyToken(contractAddress, web3j, credentials, contractGasProvider);
//    }
//
//    public static MyToken load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
//        return new MyToken(contractAddress, web3j, transactionManager, contractGasProvider);
//    }
//
//    public static RemoteCall<MyToken> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String usdtAddress, String bcpcAddress, String funAddress) {
//        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, usdtAddress),
//                new org.web3j.abi.datatypes.Address(160, bcpcAddress),
//                new org.web3j.abi.datatypes.Address(160, funAddress)));
//        return deployRemoteCall(MyToken.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), encodedConstructor);
//    }
//
//    public static RemoteCall<MyToken> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String usdtAddress, String bcpcAddress, String funAddress) {
//        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, usdtAddress),
//                new org.web3j.abi.datatypes.Address(160, bcpcAddress),
//                new org.web3j.abi.datatypes.Address(160, funAddress)));
//        return deployRemoteCall(MyToken.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), encodedConstructor);
//    }
//
//    @Deprecated
//    public static RemoteCall<MyToken> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String usdtAddress, String bcpcAddress, String funAddress) {
//        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, usdtAddress),
//                new org.web3j.abi.datatypes.Address(160, bcpcAddress),
//                new org.web3j.abi.datatypes.Address(160, funAddress)));
//        return deployRemoteCall(MyToken.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
//    }
//
//    @Deprecated
//    public static RemoteCall<MyToken> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String usdtAddress, String bcpcAddress, String funAddress) {
//        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, usdtAddress),
//                new org.web3j.abi.datatypes.Address(160, bcpcAddress),
//                new org.web3j.abi.datatypes.Address(160, funAddress)));
//        return deployRemoteCall(MyToken.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
//    }
//
//    public static void linkLibraries(List<Contract.LinkReference> references) {
//        librariesLinkedBinary = linkBinaryWithReferences(BINARY, references);
//    }
//
//    private static String getDeploymentBinary() {
//        if (librariesLinkedBinary != null) {
//            return librariesLinkedBinary;
//        } else {
//            return BINARY;
//        }
//    }
//
//    public static class User extends StaticStruct {
//        public String wallet;
//
//        public String referrer;
//
//        public BigInteger personPurchaseAmount;
//
//        public BigInteger reward;
//
//        public User(String wallet, String referrer, BigInteger personPurchaseAmount, BigInteger reward) {
//            super(new org.web3j.abi.datatypes.Address(160, wallet),
//                    new org.web3j.abi.datatypes.Address(160, referrer),
//                    new org.web3j.abi.datatypes.generated.Uint256(personPurchaseAmount),
//                    new org.web3j.abi.datatypes.generated.Uint256(reward));
//            this.wallet = wallet;
//            this.referrer = referrer;
//            this.personPurchaseAmount = personPurchaseAmount;
//            this.reward = reward;
//        }
//
//        public User(Address wallet, Address referrer, Uint256 personPurchaseAmount, Uint256 reward) {
//            super(wallet, referrer, personPurchaseAmount, reward);
//            this.wallet = wallet.getValue();
//            this.referrer = referrer.getValue();
//            this.personPurchaseAmount = personPurchaseAmount.getValue();
//            this.reward = reward.getValue();
//        }
//    }
//
//    public static class AirdroppedEventResponse extends BaseEventResponse {
//        public String recipient;
//
//        public BigInteger amount;
//
//        public BigInteger time;
//    }
//
//    public static class NewPurchaseEventResponse extends BaseEventResponse {
//        public String user;
//
//        public BigInteger purchaseAmount;
//
//        public BigInteger time;
//    }
//
//    public static class NewStakingEventResponse extends BaseEventResponse {
//        public String user;
//
//        public BigInteger stakingAmount;
//    }
//
//    public static class NewUserEventResponse extends BaseEventResponse {
//        public String wallet;
//    }
//
//    public static class PerRewardEventResponse extends BaseEventResponse {
//        public String to;
//
//        public BigInteger amount;
//
//        public BigInteger time;
//    }
//
//    public static class RewardsEventResponse extends BaseEventResponse {
//        public String recipient;
//
//        public BigInteger amount;
//    }
//
//    public static class SetEventResponse extends BaseEventResponse {
//        public String from;
//
//        public String to;
//    }
//
//    public static class TokenPurchasedEventResponse extends BaseEventResponse {
//        public String purchaser;
//
//        public BigInteger amount;
//
//        public BigInteger time;
//    }
//}
