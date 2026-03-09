
package com.example.SupplyFlow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SupplyFlow.models.HistoriqueMovment;

public interface ProduitMovementRepository extends JpaRepository<HistoriqueMovment, Integer> {}