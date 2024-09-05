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

public class Pizza extends Prodotto {

    private boolean isXL;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "pizza_toppings",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "topping_id")
    )
    private List<Topping> toppings;


    public Pizza(String nome, int cal, double prezzo, boolean isXL, List<Topping> toppings) {
        super(nome, cal, prezzo);
        this.isXL = isXL;
        this.toppings = toppings;
    }
}
