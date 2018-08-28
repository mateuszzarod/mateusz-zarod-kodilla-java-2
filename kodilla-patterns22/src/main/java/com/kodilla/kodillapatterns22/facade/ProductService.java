package com.kodilla.kodillapatterns22.facade;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class ProductService {
    public BigDecimal getPrice(Long productId) {
        Random random = new Random();
        return new BigDecimal(random.nextInt(100000)/100);
    }
}