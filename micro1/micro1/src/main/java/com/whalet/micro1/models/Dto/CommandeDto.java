package com.whalet.micro1.models.Dto;

import com.whalet.micro1.models.Entity.Commande;
import lombok.Builder;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Builder
@Data
@Component
public class CommandeDto {
    private Long Id;
    private String ref;
    private String price;
    private Date createdAt;

    public static CommandeDto toDto(Commande commande){
         return CommandeDto.builder()
                 .Id(commande.getId())
                 .ref(commande.getRef())
                 .price(commande.getPrice())
                 .build();
    }

    public static Commande toCommande(CommandeDto commandeDto){
        return Commande.builder()
                .Id(commandeDto.getId())
                .ref(commandeDto.getRef())
                .price(commandeDto.getPrice())
                .build();
    }
}
