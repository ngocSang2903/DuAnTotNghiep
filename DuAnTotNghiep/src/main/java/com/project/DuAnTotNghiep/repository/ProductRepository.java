package com.project.DuAnTotNghiep.repository;

import com.project.DuAnTotNghiep.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}