package com.inwaiders.plames.modules.wallet.domain.account;

import enterprises.inwaiders.plames.api.user.User;

public interface PrivateCurrencyAccount extends CurrencyAccount {

	public void setOwner(User user);
	public User getOwner();
}
