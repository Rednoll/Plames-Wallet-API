package com.inwaiders.plames.modules.wallet.domain.wallet;

import java.util.List;

import enterprises.inwaiders.plames.api.user.User;

public abstract class WalletHlRepository {

	protected static WalletHlRepository instance = null;
	
	public abstract Wallet create();
	public abstract List<Wallet> getAll();
	public abstract Wallet getById(long id);
	public abstract Wallet getByOwner(User owner);
	
	public static void setInstance(WalletHlRepository ins) {
		
		instance = ins;
	}
	
	public static WalletHlRepository getInstance() {
		
		return instance;
	}
}
