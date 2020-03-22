package com.inwaiders.plames.modules.wallet.domain.account.transaction;

public abstract class TransactionHlRepository {

	public static TransactionHlRepository instance = null;
	
	public abstract Transaction create();
	public abstract Transaction getById(long id);
	
	public static void setInstance(TransactionHlRepository ins) {
		
		instance = ins;
	}
	
	public static TransactionHlRepository getInstance() {
		
		return instance;
	}
}
