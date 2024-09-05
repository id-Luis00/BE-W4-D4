package com.id_Luis.entities;

import com.id_Luis.enums.StatoOrdine;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long numeroOrdine;

    private List<Prodotto> listaCibo;  // dovremmo collegare?
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private int oraAcquisizione;
    //  private double totaleOrdine;  // mi serve la funzione che calcola il totale

    public Ordine(List<Prodotto> listaCibo, int numeroCoperti, int oraAcquisizione) {
        this.statoOrdine = StatoOrdine.IN_CORSO;
        this.listaCibo = listaCibo;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = oraAcquisizione;
        //  this.totaleOrdine = totaleOrdine;
    }


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tavolo")
    private Tavolo tavolo;  // dovremmo avere un collegamento @ManyToOne


}
