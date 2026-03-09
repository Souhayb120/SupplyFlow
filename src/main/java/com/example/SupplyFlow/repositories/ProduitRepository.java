
package com.example.SupplyFlow.repositories;

import com.example.SupplyFlow.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {}