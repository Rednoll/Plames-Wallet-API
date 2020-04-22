package com.inwaiders.plames.modules.wallet.domain.account.transaction;

import com.inwaiders.plames.modules.wallet.domain.account.CurrencyAccount;
import com.inwaiders.plames.modules.wallet.domain.currency.Currency;

import enterprises.inwaiders.plames.api.user.User;
import enterprises.inwaiders.plames.api.utils.DescribedFunctionResult;

public interface Transaction {

	public DescribedFunctionResult make();
	
	public Currency getCurrency();
	
	public User getSender();
	public CurrencyAccount getSource();
	
	public CurrencyAccount getDestination();
	
	public long getAmount();
	
	public boolean isComplete();
	
	public void setCompleteTime(long time);
	public long getCompleteTime();
	
	
	public static Transaction create() {
		
		return TransactionHlRepository.getInstance().create();
	}
}
