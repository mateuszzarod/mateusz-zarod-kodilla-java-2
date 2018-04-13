package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEM")
public class Item {
    private int id;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
   // tutaj musi być lista
    private Product product;
    private Invoice invoices;

    public Item(){

    }

    public Item(BigDecimal price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ITEM_ID", unique = true)
    public int getId() {

        return id;
    }

    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() {

        return price;
    }

    @NotNull
    @Column(name = "QUANTITY")
    public int getQuantity() {

        return quantity;
    }

    @NotNull
    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {

        return product;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoices() {

        return invoices;
    }

    public void setPrice(BigDecimal price) {

        this.price = price;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {

        this.value = value;
    }

    public void setProduct(Product product) {

        this.product = product;
    }

    public void setInvoices(Invoice invoices) {

        this.invoices = invoices;
    }
}
