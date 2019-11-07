package com.josh.service.payroll.impl;

import java.util.HashSet;
import java.util.Set;

import com.josh.domain.payroll.Rate;
import com.josh.service.payroll.RateService;

public class RateServiceImpl implements RateService {
    private static RateServiceImpl service = null;
    private RateRepository repository;

    private CourseServiceImpl() {
        this.repository = RateRepositoryImpl.getRepository();
    }

    public static RateServiceImpl getService(){
        if (service == null) service = new RateServiceImpl();
        return service;
    }

    @Override
    public Rate create(Rate rate) {
        return this.repository.create(rate);
    }

    @Override
    public Rate update(Rate rate) {
        return this.repository.update(rate);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Rate read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Rate> getAll() {
        return this.repository.getAll();
    }
}
