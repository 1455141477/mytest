package com.service.impl;

import com.dao.ManagerDao;
import com.domain.Manager;
import com.service.ManagerService;
import com.utils.BookException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("managerService")
public class ManagerServiceImpl implements ManagerService{
    @Autowired
    private ManagerDao dao;
    @Override
    public boolean login(Manager manager) throws BookException {
        Manager man=dao.findByUserName(manager.getUsername());
        if(man==null){
         throw new BookException("您输入的用户名不存在!");
        }
        if(!man.getPassword().trim().isEmpty() && man.getPassword().equals(manager.getPassword())){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Manager findByUsername(String username) throws BookException{
        Manager manager=dao.findByUserName(username);
        if(manager==null){
            throw new BookException("您指定的管理员用户名不存在");
        }
        return manager;
    }

    @Override
    public void addManager(Manager manager) throws BookException {
        Manager man=dao.findByUserName(manager.getUsername());
        if(man!=null){
            throw new BookException("您要添加的用户名已存在!");
        }
        dao.addManager(manager);
    }
}
