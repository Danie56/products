package com.ecommicroservice.products.infrastructure.adapter;

import com.ecommicroservice.products.domain.entities.Product;
import com.ecommicroservice.products.domain.service.GetService;
import com.ecommicroservice.products.infrastructure.dto.ProductDto;
import com.ecommicroservice.products.infrastructure.mapper.ProductMapper;
import com.ecommicroservice.products.infrastructure.repository.ProductRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetProductAdapter implements GetService<Product> {

  private final ProductRepository productRepository;
  private final ProductMapper productMapper;

  @Override
  public List<Product> getAll() {
    List<ProductDto> products = productRepository.findAll();
    return products.stream().map(productMapper::toEntity).toList();
  }

  @Override
  public Product getById(String id) {
    Optional<ProductDto> products = productRepository.findById(id);
    return products.map(productMapper::toEntity).orElse(null);
  }
}
