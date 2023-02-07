package com.whalet.micro1.Service.impl;

import com.whalet.micro1.models.Entity.Commande;
import com.whalet.micro1.Repository.CommandeRepo;
import com.whalet.micro1.Service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class commandeServiceImpl implements CommandeService {
    @Autowired private CommandeRepo commandeRepo;
    @Override
    public void save(Commande commande) {
        commandeRepo.save(commande);
    }

    @Override
    public void update(Commande commande) {
        if(commande==null)return;
        commandeRepo.save(commande);
    }

    @Override
    public void delete(Long id) {
         commandeRepo.deleteById(id);
    }

    @Override
    public List<Commande> findAll() {
        List<Commande> commandes = commandeRepo.findAll();
        return commandes;
    }
}
