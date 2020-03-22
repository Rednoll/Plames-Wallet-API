package com.inwaiders.plames.modules.wallet.domain.account.transaction.strategy;

import com.inwaiders.plames.api.utils.DescribedFunctionResult;
import com.inwaiders.plames.modules.wallet.domain.account.transaction.Transaction;

public interface TransactionStrategy {

	public DescribedFunctionResult process(Transaction transaction);
}
