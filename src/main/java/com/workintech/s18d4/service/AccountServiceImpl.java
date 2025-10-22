package com.workintech.s18d4.service;

import com.workintech.s18d4.repository.AccountRepository;

import com.workintech.s18d4.entity.Account;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class AccountServiceImpl implements AccountService{
    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account find(long id) {
        return accountRepository.findById(id).orElse(null);
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account saveAccountForCustomer(Long customerId, Account account) {
        return null;
    }

    @Override
    public Account updateAccountForCustomer(Long customerId, Account account) {
        return null;
    }

    @Override
    public Account delete(long id) {
        Account account = find(id);
        accountRepository.delete(account);
        return account;
    }

}