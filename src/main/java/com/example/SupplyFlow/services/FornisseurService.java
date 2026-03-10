package com.example.SupplyFlow.services;

import com.example.SupplyFlow.models.Fornisseur;
import com.example.SupplyFlow.repositories.FornisseurRepository;
import com.example.SupplyFlow.repositories.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FornisseurService {
    private final FornisseurRepository fornisseurRepository;

    public FornisseurService(FornisseurRepository fornisseurRepository) {
        this.fornisseurRepository = fornisseurRepository;
    }

    public List<Fornisseur> displayFornisseurs(){
      return  fornisseurRepository.findAll();
    }

    public void addFornisseur(Fornisseur f){
        fornisseurRepository.save(f);
    }



}
