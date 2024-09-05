package com.id_Luis.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Tavolo {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private Long id;

    private int numero_tavolo;


}
