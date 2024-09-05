package com.id_Luis.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class Topping extends Prodotto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Topping(String nome, int cal, double prezzo) {
        super(nome, cal, prezzo);
    }

    public Topping(String nome, int cal) {
        super(nome, cal);
    }

    @Override
    public String toString() {
        return "Topping{" +
                "nome='" + nome + '\'' +
                ", cal=" + cal +
                '}';
    }
}
