package com.whalet.micro1.Repository;

import com.whalet.micro1.models.Entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepo extends JpaRepository<Commande,Long> {
}
