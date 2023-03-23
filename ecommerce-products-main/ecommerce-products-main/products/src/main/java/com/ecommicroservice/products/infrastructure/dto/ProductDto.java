package com.ecommicroservice.products.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class ProductDto {

  @Id
  private String id;
  private String name;
  private int stock;
  private double price;

}
