package com.inwaiders.plames.modules.wallet.domain.account;

import java.util.List;

import com.inwaiders.plames.dao.HighLevelRepository;
import com.inwaiders.plames.modules.wallet.domain.currency.Currency;

public abstract class CurrencyAccountHlRepository<T extends CurrencyAccount> implements HighLevelRepository<T> {

	public static CurrencyAccountHlRepository repository = null;
	
	public abstract T create(Currency currency, String name);
	public abstract List<CurrencyAccount> getAll();
	
	public static void setRepository(CurrencyAccountHlRepository<? extends CurrencyAccount> ins) {
		
		repository = ins;
	}
	
	public static CurrencyAccountHlRepository<? extends CurrencyAccount> getRepository() {
		
		return repository;
	}
}
