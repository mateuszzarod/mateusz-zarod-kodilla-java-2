
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

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Onion");
        Product product2 = new Product("Potato");
        Product product3 = new Product("Meat");

        Item item1 = new Item(new BigDecimal(120), 10);
        Item item2 = new Item(new BigDecimal(220), 2);
        Item item3 = new Item(new BigDecimal(500), 2);

        Invoice invoice1 = new Invoice("FV 1/2018");

        item1.setProduct(product1);
        item1.setProduct(product2);

        item2.setProduct(product2);
        item2.setProduct(product3);

        item3.setProduct(product3);
        item3.setProduct(product1);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        invoice1.getItems(item1);
        invoice1.getItems(item2);
        invoice1.getItems(item3);

        //When

        int invoiceId = invoice1.getId();
        Invoice readInvoice = invoiceDao.save(invoice1);
        //Then
        Assert.assertEquals(invoiceId, readInvoice);
        //CleanUp
        try {
            invoiceDao.delete(invoiceId);
        } catch (Exception e) {

        }
    }
}

