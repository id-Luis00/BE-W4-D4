package com.id_Luis.services;

import com.id_Luis.entities.Prodotto;
import com.id_Luis.exceptions.NotFoundException;
import com.id_Luis.repositories.ProdottoRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProdottoService {

    @Autowired
    private ProdottoRepo prodottoRepo;

    // prendo in ingresso il prodotto che voglio salvare
    public void saveProduct(Prodotto prodotto) {
        // controllo se il prodotto ha il nome e il prezzo
        if (prodotto.getNome().isEmpty() || prodotto.getPrezzo() == 0.0) {
            log.info("Prodotto non valido!");

        } else {
            prodottoRepo.save(prodotto);
            log.info("Prodotto salvato con successo !\n");
        }

    }


    public Prodotto findProduct(Long id) {
        return prodottoRepo.findById(id).orElseThrow(() -> new NotFoundException(id));
    }


}
