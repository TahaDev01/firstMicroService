package com.whalet.micro1.Resource;

import com.whalet.micro1.models.Dto.CommandeDto;
import com.whalet.micro1.models.Entity.Commande;
import com.whalet.micro1.Service.CommandeService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Commande")
public class CommandeResource {
    private CommandeDto commandeDto;private CommandeService commandeService;
    public CommandeResource(CommandeService commandeService,CommandeDto commandeDto){
        this.commandeDto = commandeDto;
        this.commandeService = commandeService;
    }
    @PostMapping("/save")
    public void save(@RequestBody CommandeDto commandeDto){
        Commande commandeDto1 = CommandeDto.toCommande(commandeDto);
        commandeService.save(commandeDto1);
    }
    @PutMapping("/update/{id}")
    public void update(@RequestBody CommandeDto commandeDto, @PathParam("id") Long id){
        Commande commande = CommandeDto.toCommande(commandeDto);
        commandeService.save(commande);
    }

    @GetMapping("")
    public List<CommandeDto> findAll(){
          return null;
    }

}
