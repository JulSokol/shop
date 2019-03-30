package com.shop.repos;

import com.shop.domain.ProductCategory;
import com.shop.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Long> {
}
