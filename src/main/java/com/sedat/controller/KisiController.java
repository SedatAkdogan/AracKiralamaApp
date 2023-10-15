package com.sedat.controller;

import com.sedat.repository.entity.Kisi;
import com.sedat.service.KisiService;
import com.sedat.utility.Constants;
import com.sedat.utility.UtilityClass;

import java.util.List;
import java.util.Optional;

public class KisiController {
    KisiService kisiService;
    public KisiController(){
        this.kisiService=new KisiService();
    }

    public Kisi save(Kisi kisi){
        return kisiService.save(kisi);
    }

    public List<Kisi> findAll() {
        return kisiService.findAll();
    }

    public Optional<Kisi> findById(Long kisiId) {
        return kisiService.findById(kisiId);
    }

    public Optional<Kisi> findByUsername(String username) {
        return kisiService.findByUsername(username);
    }

    public Kisi kisiEkle() {
        String name = UtilityClass.stringDeger("İsim : ");
        String surname = UtilityClass.stringDeger("Soyisim : ");
        String username = UtilityClass.stringDeger("Kullanıcı adı : ");
        String password = UtilityClass.stringDeger("Şifre : ");
        Kisi kisi = Kisi.builder()
                .name(name)
                .surname(surname)
                .username(username)
                .password(password)
                .baseEntity(Constants.getBaseEntity())
                .build();
        return kisiService.save(kisi);
    }


    public List<Kisi> findByName(String isim) {
        return kisiService.findByColumnNameAndValue("name",isim);
    }
}
