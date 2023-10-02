package com.project.DuAnTotNghiep.service;

import com.project.DuAnTotNghiep.dto.BillDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BillService {

    Page<BillDto> findAll(Pageable pageable);
}
