
package com.example.SupplyFlow.repositories;

import com.example.SupplyFlow.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {
    Produit findByNom(String nom);
}