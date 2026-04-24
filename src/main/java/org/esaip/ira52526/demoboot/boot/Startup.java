package org.esaip.ira52526.demoboot.boot;

import org.esaip.ira52526.demoboot.bo.Fournisseur;
import org.esaip.ira52526.demoboot.repository.FournisseurRepository;
import org.esaip.ira52526.demoboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Startup implements CommandLineRunner {

    private FournisseurRepository dao;

    @Autowired
    public Startup(FournisseurRepository dao) {
        this.dao = dao;
    }

    @Override
    public void run(String... args) throws Exception {
        dao.findAll().forEach(System.out::println);

        Fournisseur esaip = new Fournisseur("ESAIP Angers");
        dao.save(esaip);
    }
}
