package com.sedat.service;

import com.sedat.repository.AdminRepository;
import com.sedat.repository.entity.Admin;
import com.sedat.utility.MyFactoryService;

public class AdminService extends MyFactoryService<AdminRepository, Admin,Long> {
    public AdminService(){
        super(new AdminRepository());
    }
}
