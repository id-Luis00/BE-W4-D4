package com.id_Luis;

import com.id_Luis.entities.Drink;
import com.id_Luis.entities.Menu;
import com.id_Luis.entities.Pizza;
import com.id_Luis.entities.Topping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@Slf4j
public class AppConfig {


    @Bean
    public Topping mozzarella() {
        return new Topping("mozzarella", 10);
    }

    @Bean
    public Topping pomodoro() {
        return new Topping("pomodoro", 10);
    }

    @Bean
    public Topping salame() {
        return new Topping("salame", 20);
    }

    @Bean
    public Topping peperoncino() {
        return new Topping("peperoncino", 8);
    }

    @Bean
    public Pizza margherita() {
        // creazione della pizza margherita, ossia la base di tutte le pizze rosse (Toppings: mozzarella e pomodoro )
        return new Pizza("margherita", 80, 10.0, false, Arrays.asList(mozzarella(), pomodoro()));
    }

    @Bean
    public Pizza margheritaXL() {
        return new Pizza("margherita XL", 80, 10.0, true, Arrays.asList(mozzarella(), pomodoro(), pomodoro(), mozzarella()));

    }


    @Bean
    public Drink cocaCola() {
        return new Drink("coca-cola", 230, 3.0, 33.0);
    }

    @Bean
    public Drink sprite() {
        return new Drink("sprite", 230, 3.0, 33.0);
    }

    @Bean
    public Drink fanta() {
        return new Drink("fanta", 230, 3.0, 33.0);
    }

    @Bean
    public Menu menu() {
        return new Menu(Arrays.asList(margherita(),
                margheritaXL(),
                cocaCola(),
                fanta(),
                sprite(),
                pomodoro(),
                mozzarella(),
                salame(),
                peperoncino()));
    }


}
