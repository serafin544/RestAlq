package com.finthecoder.restAlq.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "POS")
public class Pos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "POSID")
    private Long posId;

    @Column(name = "DATE")
    private String Date;

    @Column(name = "NAME")
    private String Name;

    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )

    private List<Item> items = new ArrayList<>();

    @Column(name = "TOTALPRICE")
    private double totalPrice;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "PAYMENTTYPE")
    private String paymentType;



}