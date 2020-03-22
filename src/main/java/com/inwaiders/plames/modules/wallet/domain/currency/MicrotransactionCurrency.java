package com.inwaiders.plames.modules.wallet.domain.currency;

public interface MicrotransactionCurrency extends Currency {

	public void setMultiplier(long multi);
	public long getMultiplier();
	
	public int convertToReal(long amount);
}
