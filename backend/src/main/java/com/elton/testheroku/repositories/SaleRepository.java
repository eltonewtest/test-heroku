package com.elton.testheroku.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elton.testheroku.entities.Sale;

public interface SaleRepository  extends JpaRepository<Sale, Long>{

}
