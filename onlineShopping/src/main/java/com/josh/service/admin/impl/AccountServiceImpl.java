package com.josh.service.admin.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.admin.Account;
import com.josh.service.admin.AccountService;

public class AccountServiceImpl implements AccountService {
    private static AccountServiceImpl service = null;
    private AccountRepository repository;

    private AccountServiceImpl() {
        this.repository = AccountRepositoryImpl.getRepository();
    }

    public static AccountServiceImpl getService(){
        if (service == null) service = new AccountServiceImpl();
        return service;
    }

    @Override
    public Account create(Account account) {
        return this.repository.create(account);
    }

    @Override
    public Account update(Account account) {
        return this.repository.update(account);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Account read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Account> getAll() {
        return this.repository.getAll();
    }
}
