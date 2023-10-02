package com.project.DuAnTotNghiep.repository;

import com.project.DuAnTotNghiep.dto.BillDto;
import com.project.DuAnTotNghiep.entity.Bill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

    @Query(value = "SELECT DISTINCT b.id AS maHoaDon, a.name AS hoVaTen, a.phone_number " +
            "AS soDienThoai, b.price AS tongTien, b.status AS trangThai, b.invoice_type " +
            "AS loaiDon, pm.name AS hinhThucThanhToan " +
            "FROM bill b " +
            "JOIN account a ON b.account_id = a.id " +
            "LEFT JOIN bill_detail bd ON b.id = bd.bill_id " +
            "LEFT JOIN payment_method pm ON bd.paymentmethodid = pm.id", nativeQuery = true)
    Page<BillDto> listBill(Pageable pageable);


}