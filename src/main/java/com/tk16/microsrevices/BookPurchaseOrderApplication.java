package com.tk16.microsrevices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BookPurchaseOrderApplication {

  public static void main(String[] args) {
    SpringApplication.run(BookPurchaseOrderApplication.class, args);
  }
}
