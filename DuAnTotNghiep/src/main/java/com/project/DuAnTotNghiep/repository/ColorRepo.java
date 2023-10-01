package com.project.DuAnTotNghiep.repository;

import com.project.DuAnTotNghiep.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepo extends JpaRepository<Color,Long> {
}
