package com.inwaiders.plames.modules.wallet.domain.currency;

import java.util.List;

import enterprises.inwaiders.plames.dao.HighLevelRepository;

public abstract class CurrencyHlRepository<T extends Currency> implements HighLevelRepository<T>{

	private static CurrencyHlRepository instance = null;
	
	public abstract T create(String type);
	public abstract T getByTag(String tag);
	public abstract List<Currency> getAll();
	
	public abstract T parseBySign(String aliase);
	
	public abstract List<String> getTypes();
	
	public static void setRepository(CurrencyHlRepository<? extends Currency> ins) {
		
		instance = ins;
	}
	
	public static CurrencyHlRepository<? extends Currency> getRepository() {
	
		return instance;
	}
}
