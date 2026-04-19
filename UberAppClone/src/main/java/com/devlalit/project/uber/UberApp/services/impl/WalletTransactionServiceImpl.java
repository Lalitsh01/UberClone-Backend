package com.devlalit.project.uber.UberApp.services.impl;

import com.devlalit.project.uber.UberApp.entities.WalletTransaction;
import com.devlalit.project.uber.UberApp.repositories.WalletTransactionRepository;
import com.devlalit.project.uber.UberApp.services.WalletTransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletTransactionServiceImpl implements WalletTransactionService {

    private final WalletTransactionRepository walletTransactionRepository;

    private final ModelMapper modelMapper;

    @Override
    public void createNewWalletTransaction(WalletTransaction walletTransaction) {
        walletTransactionRepository.save(walletTransaction);
    }
}
