package com.inwaiders.plames.modules.wallet.domain.wallet;

import java.util.Collection;

import com.inwaiders.plames.modules.wallet.domain.account.PrivateCurrencyAccount;
import com.inwaiders.plames.modules.wallet.domain.currency.Currency;

import enterprises.inwaiders.plames.api.user.User;

public interface Wallet {

	public void setOwner(User user);
	public User getOwner();

	public void addPrivateAccount(PrivateCurrencyAccount account);
	public PrivateCurrencyAccount getPrivateAccount(Currency currency);

	public Collection<PrivateCurrencyAccount> getPrivateAccounts();
	
	public void save();
	public void delete();
	
	public static Wallet create() {
		
		return WalletHlRepository.getInstance().create();
	}
	
	public static Wallet getByOwner(User user) {
		
		return WalletHlRepository.getInstance().getByOwner(user);
	}
}
