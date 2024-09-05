package com.id_Luis.services;

import com.id_Luis.entities.Menu;
import com.id_Luis.repositories.MenuRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MenuService {

    @Autowired
    private MenuRepo menuRepo;


    public void saveMenu(Menu menu) {
        menuRepo.save(menu);
        log.info("Menu salvato con successo!");
    }
}
