package com.example.SupplyFlow.services;

import com.example.SupplyFlow.models.Produit;
import com.example.SupplyFlow.repositories.ProduitRepository;
import org.hibernate.procedure.ProcedureOutputs;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ProduitService {

    private final ProduitRepository produitRepository;

    public ProduitService(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    public List<Produit> displayProduits(){
        return produitRepository.findAll();
    }


    public void addProduit(Produit produit){
        produitRepository.save(produit);
    }

    public void deleteProduit(Produit produit){
        produitRepository.delete(produit);
    }

    public Produit findProduitById(int id){
       return produitRepository.findById(id).orElse(null);
    }

    public Produit updateProduit(int id, Produit newData){
        Produit p = produitRepository.findById(id).orElse(null);
        if(p != null){
            p.setNom(newData.getNom());
            p.setCategory(newData.getCategory());
            p.setPrix(newData.getPrix());
            return produitRepository.save(p);
        }
        return null;
    }


    // bonus

    public Produit findByName(String produitNom){
     return  produitRepository.findByNom(produitNom);
    }
}
