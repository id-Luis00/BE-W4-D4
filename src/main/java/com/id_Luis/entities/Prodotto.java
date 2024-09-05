package com.id_Luis.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "prodotto_tipo")
public abstract class Prodotto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    protected Long id;

    protected String nome;
    protected int cal;
    protected double prezzo;

    public Prodotto(String nome, int cal, double prezzo) {
        this.nome = nome;
        this.cal = cal;
        this.prezzo = prezzo;
    }

    public Prodotto(String nome, int cal) {
        this.nome = nome;
        this.cal = cal;
    }
}
