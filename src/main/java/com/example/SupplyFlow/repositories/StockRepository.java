
package com.example.SupplyFlow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SupplyFlow.models.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {}