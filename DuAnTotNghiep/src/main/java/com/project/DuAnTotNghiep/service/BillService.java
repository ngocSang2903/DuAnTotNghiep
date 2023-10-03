package com.project.DuAnTotNghiep.service;

import com.project.DuAnTotNghiep.dto.BillDtoInterface;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface BillService {

    Page<BillDtoInterface> findAll(Pageable pageable);

    public Page<BillDtoInterface> searchListBill(Long maHoaDon,
                                                 Date ngayTaoStart,
                                                 Date ngayTaoEnd,
                                                 Integer trangThai,
                                                 Integer loaiDon, Pageable pageable);

    void updateStatus(int status,Long id);
}
