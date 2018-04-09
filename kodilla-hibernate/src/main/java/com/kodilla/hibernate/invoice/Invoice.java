package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICE")
public class Invoice {
    int id;
    String number;
    List<Item> items = new ArrayList();

    public Invoice(){

    }

    public Invoice(String number) {
        this.number = number;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "NUMBER")
    public String getNumber() {
        return number;
    }

    //dlaczego tu nie zadziałał domyślny konstruktor
    //tylko potrzeba było argumentu Item item??
    public List<Item> getItems(Item item) {
        return items;
    }

    @OneToMany(
            targetEntity = Item.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "invoice"
    )


    public void setId(int id) {
        this.id = id;
    }


    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
