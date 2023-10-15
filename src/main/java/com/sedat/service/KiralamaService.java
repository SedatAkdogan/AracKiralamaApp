package com.sedat.service;

import com.sedat.repository.KiralamaRepository;
import com.sedat.repository.entity.Kiralama;
import com.sedat.repository.views.KiralamaSayisi;
import com.sedat.repository.views.KiralananAraclar;
import com.sedat.utility.MyFactoryService;

import java.util.List;

public class KiralamaService extends MyFactoryService<KiralamaRepository, Kiralama,Long> {
    KiralamaRepository kiralamaRepository;
    public KiralamaService() {
        super(new KiralamaRepository());
        this.kiralamaRepository=new KiralamaRepository();
    }

    public List<KiralananAraclar> raporlama() {
        return kiralamaRepository.raporlama();
    }

    public List<KiralamaSayisi> kiralamaSayisi() {
        return kiralamaRepository.kiralamaSayisi();
    }
}
