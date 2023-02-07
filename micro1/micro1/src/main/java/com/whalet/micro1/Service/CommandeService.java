package com.whalet.micro1.Service;

import java.util.List;
import com.whalet.micro1.models.Entity.Commande;
import org.springframework.stereotype.Service;

@Service
public interface CommandeService {

    void save (Commande commande);
    void update(Commande commande);
    void delete(Long id);
    List<Commande> findAll();
}
