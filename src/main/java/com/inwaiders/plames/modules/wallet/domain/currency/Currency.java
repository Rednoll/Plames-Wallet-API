package com.inwaiders.plames.modules.wallet.domain.currency;

import java.util.List;

public interface Currency {
	
	public void setName(String name);
	public String getName();
	
	public void setCode(byte code);
	public byte getCode();
	
	public void setFragmentationLevel(int level);
	public int getFragmentationLevel();
	
	public void setTag(String tag);
	public String getTag();
	
	public String getType();
	
	public void save();
	
	public Long getId();

	public void setActive(boolean active);
	public boolean isActive();
	
	public String getDisplayAmount(long amount);
	
	public long parseAmount(String rawAmount);
	
	public String getWebDescription();
	
	public static Currency create(String type) {
		
		return CurrencyHlRepository.getRepository().create(type);
	}
	
	public static Currency parseBySign(String aliase) {
		
		return CurrencyHlRepository.getRepository().parseBySign(aliase);
	}
	
	public static Currency getByTag(String tag) {
	
		return CurrencyHlRepository.getRepository().getByTag(tag);
	}
	
	public static Currency getById(Long id) {
		
		return CurrencyHlRepository.getRepository().getById(id);
	}
	
	public static List<Currency> getAll() {
		
		return CurrencyHlRepository.getRepository().getAll();
	}
	
	public static List<String> getTypes() {
	
		return CurrencyHlRepository.getRepository().getTypes();
	}
}
