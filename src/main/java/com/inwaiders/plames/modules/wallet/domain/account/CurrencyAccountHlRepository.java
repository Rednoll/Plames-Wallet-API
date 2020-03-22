package com.inwaiders.plames.modules.wallet.domain.account;

import java.util.List;

import com.inwaiders.plames.dao.EntityLink;
import com.inwaiders.plames.dao.HighLevelRepository;
import com.inwaiders.plames.modules.wallet.domain.currency.Currency;
import com.inwaiders.plames.spring.SpringUtils;

public abstract class CurrencyAccountHlRepository<T extends CurrencyAccount> implements HighLevelRepository<T> {

	public static CurrencyAccountHlRepository repository = null;
	
	public abstract T create(Currency currency, String name);
	public abstract List<CurrencyAccount> getAll();
	
	@Override
	public EntityLink getLink(T entity) {
		
		return new EntityLink(SpringUtils.getEntityName(entity.getClass()), entity.getId());
	}
	
	public static void setRepository(CurrencyAccountHlRepository<? extends CurrencyAccount> ins) {
		
		repository = ins;
	}
	
	public static CurrencyAccountHlRepository<? extends CurrencyAccount> getRepository() {
		
		return repository;
	}
}
