package com.sedat.repository;

import com.sedat.repository.entity.Admin;
import com.sedat.utility.MyFactoryRepository;

public class AdminRepository extends MyFactoryRepository<Admin,Long> {
    public AdminRepository() {
        super(new Admin());
    }
}
