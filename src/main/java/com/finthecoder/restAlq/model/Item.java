package com.finthecoder.restAlq.model;

import javax.persistence.*;


@Entity(name = "Item")
@Table(name = "Item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POSID")
    private Pos pos;
    private String name;
    private String flavorType;
    private String Category;
    private double price;



}

