package com.id_Luis.runners;

import com.id_Luis.entities.Menu;
import com.id_Luis.entities.Pizza;
import com.id_Luis.entities.Topping;
import com.id_Luis.services.MenuService;
import com.id_Luis.services.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProdottoRunner implements CommandLineRunner {

    @Autowired
    private ProdottoService prodottoService;
    @Autowired
    private MenuService menuService;

    @Autowired
    private Topping pomodoro;
    @Autowired
    private Topping mozzarella;
    @Autowired
    private Topping salame;
    @Autowired
    private Topping peperoncino;

    @Autowired
    private Pizza margherita;
    @Autowired
    private Pizza margheritaXL;

    @Autowired
    private Menu menu;


    @Override
    public void run(String... args) throws Exception {


        //  prodottoService.saveProduct(margheritaXL);

        menu.printMenu();

        menuService.saveMenu(menu);


    }
}
