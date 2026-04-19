package com.devlalit.project.uber.UberApp.services;

import com.devlalit.project.uber.UberApp.entities.Ride;
import com.devlalit.project.uber.UberApp.entities.User;
import com.devlalit.project.uber.UberApp.entities.Wallet;
import com.devlalit.project.uber.UberApp.entities.enums.TransactionMethod;

public interface WalletService {

    Wallet addMoneyToWallet(User user, Double amount, String transactionId, Ride ride, TransactionMethod transactionMethod);

    Wallet deductMoneyFromWallet(User user, Double amount, String transactionId, Ride ride, TransactionMethod transactionMethod);

    void withdrawAllMyMoneyFromWallet();

    Wallet findWalletById(Long walletId);

    Wallet createNewWallet(User user);

    Wallet findByUser(User user);
}
