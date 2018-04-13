
package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;


    //Invoice - faktura
    //Items - pozycja faktury
    //Product - pozycja asortymentu itemsFromProduct


    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Onion");
        Product product2 = new Product("Potato");
        Product product3 = new Product("Meat");
        Product product4 = new Product("Cheese");

        Item item1 = new Item(new BigDecimal(120), 10);
        Item item2 = new Item(new BigDecimal(220), 2);
        Item item3 = new Item(new BigDecimal(500), 2);

        Invoice invoice1 = new Invoice("FV 1/2018");

        item1.setProduct(product1);
        item2.setProduct(product4);
        item3.setProduct(product2);

        invoice1.setItems(Arrays.asList(item1,item2,item3));

        item1.setInvoices(invoice1);
        item2.setInvoices(invoice1);
        item3.setInvoices(invoice1);

        item1.setValue(new BigDecimal(100));
        item2.setValue(new BigDecimal(10));
        item3.setValue(new BigDecimal(101));

        //When
        invoiceDao.save(invoice1);
        int invoice1id = invoice1.getId();

        //Then
        Invoice readInvoice = invoiceDao.findOne(invoice1id);
        Assert.assertEquals(invoice1id, readInvoice.getId());

        //CleanUp
        //try {
        //    invoiceDao.delete(readInvoice.getId());
        //} catch (Exception e) {

//        }
    }
}

