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

    public Long getPosId() {
        return posId;
    }

    public void setPosId(Long posId) {
        this.posId = posId;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}