package com.inwaiders.plames.modules.wallet.domain.currency;

import java.util.List;

import com.inwaiders.plames.dao.EntityLink;
import com.inwaiders.plames.dao.HighLevelRepository;
import com.inwaiders.plames.spring.SpringUtils;

public abstract class CurrencyHlRepository<T extends Currency> implements HighLevelRepository<T>{

	private static CurrencyHlRepository instance = null;
	
	public abstract T create(String type);
	public abstract T getByTag(String tag);
	public abstract List<Currency> getAll();
	
	public abstract T parseBySign(String aliase);
	
	public abstract List<String> getTypes();
	
	@Override
	public EntityLink getLink(T entity) {
		
		return new EntityLink(SpringUtils.getEntityName(entity), entity.getId());
	}
	
	public static void setRepository(CurrencyHlRepository<? extends Currency> ins) {
		
		instance = ins;
	}
	
	public static CurrencyHlRepository<? extends Currency> getRepository() {
	
		return instance;
	}
}
