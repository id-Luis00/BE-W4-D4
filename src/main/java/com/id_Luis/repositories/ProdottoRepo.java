package com.id_Luis.repositories;

import com.id_Luis.entities.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottoRepo extends JpaRepository<Prodotto, Long> {


}
