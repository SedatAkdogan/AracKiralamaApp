package com.sedat.service;

import com.sedat.repository.KisiRepository;
import com.sedat.repository.entity.Kisi;
import com.sedat.utility.MyFactoryService;

import java.util.Optional;

public class KisiService extends MyFactoryService<KisiRepository, Kisi,Long> {
    KisiRepository kisiRepository;
    public KisiService() {
        super(new KisiRepository());
        this.kisiRepository = new KisiRepository();
    }

    public Optional<Kisi> findByUsername(String username) {
        return kisiRepository.findByUsername(username);
    }
}
