package com.inwaiders.plames.modules.wallet.domain.account.transaction.strategy;

import com.inwaiders.plames.modules.wallet.domain.account.transaction.Transaction;

import enterprises.inwaiders.plames.api.utils.DescribedFunctionResult;

public interface TransactionStrategy {

	public DescribedFunctionResult process(Transaction transaction);
}
