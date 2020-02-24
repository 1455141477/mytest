package com.service;

import com.domain.Manager;
import com.utils.BookException;

public interface ManagerService {
    public boolean login(Manager manager) throws BookException;
    public Manager findByUsername(String username) throws BookException;
    public void addManager(Manager manager) throws BookException;
}
