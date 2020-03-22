package com.inwaiders.plames.modules.wallet.domain.account;

import java.util.Set;

import com.inwaiders.plames.api.user.User;
import com.inwaiders.plames.modules.wallet.domain.currency.Currency;

public interface CurrencyAccount {

	public Currency getCurrency();
	
	public long add(long toAdd);
	public long substract(long toSubs);
	
	public void setBalance(long amount);
	public long getBalance();
	
	public String getDisplayName();
	public String getDisplayBalance();
	
	public void setBlocked(boolean blocked);
	public boolean isBlocked();

	public void setName(String name);
	public String getName();
	
	public void setPersonal(boolean i);
	public boolean isPersonal();
	
	public Set<User> getOwners();
	
	public void save();
	
	public Long getId();
	
	public static CurrencyAccount create(Currency currency, String name) {
		
		return CurrencyAccountHlRepository.getRepository().create(currency, name);
	}
}
