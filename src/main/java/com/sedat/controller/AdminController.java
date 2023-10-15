package com.sedat.controller;

import com.sedat.repository.entity.Admin;
import com.sedat.service.AdminService;

public class AdminController {
    AdminService adminService;

    public AdminController() {
        this.adminService = new AdminService();
    }

    public Admin save(Admin admin) {
        return adminService.save(admin);
    }
}
