package com.project.DuAnTotNghiep.repository;

import com.project.DuAnTotNghiep.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}