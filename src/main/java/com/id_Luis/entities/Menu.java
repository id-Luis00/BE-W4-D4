package com.id_Luis.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // a noi serve una lista di prodotti(che sarebbero le pietanze)
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "menu_prodotti",
            joinColumns = @JoinColumn(name = "menu_id"),
            inverseJoinColumns = @JoinColumn(name = "prodotto_id")
    )
    private List<Prodotto> prodotti;

    public Menu(List<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    public void printMenu() {
        /*System.out.println("Pizze:");
        pizze.forEach(System.out::println);
        System.out.println("\nDrinks:");
        drinks.forEach(System.out::println);
        System.out.println("\nToppings:");
        toppings.forEach(System.out::println);*/

        // devo differenziare i tipi

        System.out.println("Pizze:");
        prodotti.stream().filter(prodotto -> prodotto instanceof Pizza).forEach(prodotto -> System.out.println(prodotto.getNome() + " €" + prodotto.getPrezzo()));
        System.out.println("\nDrinks:");
        prodotti.stream().filter(prodotto -> prodotto instanceof Drink).forEach(System.out::println);
        System.out.println("\nToppings:");
        prodotti.stream().filter(prodotto -> prodotto instanceof Topping).forEach(System.out::println);
    }
}
