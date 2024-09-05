package com.id_Luis.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class Drink extends Prodotto {

    private double quantita;

    public Drink(String nome, int cal, double prezzo, double quantita) {
        super(nome, cal, prezzo);
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "nome='" + nome + '\'' +
                ", quantita=" + quantita +
                ", cal=" + cal +
                ", prezzo=" + prezzo +
                '}';
    }
}
