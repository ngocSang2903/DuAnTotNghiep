package com.project.DuAnTotNghiep.repository;

import com.project.DuAnTotNghiep.dto.BillDtoInterface;
import com.project.DuAnTotNghiep.entity.Bill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

    @Query(value = "SELECT DISTINCT b.id AS maHoaDon, a.name AS hoVaTen, a.phone_number " +
            "AS soDienThoai,b.create_date AS ngayTao, b.price AS tongTien, b.status AS trangThai, b.invoice_type " +
            "AS loaiDon, pm.name AS hinhThucThanhToan " +
            "FROM bill b " +
            "JOIN account a ON b.account_id = a.id " +
            "LEFT JOIN bill_detail bd ON b.id = bd.bill_id " +
            "LEFT JOIN payment_method pm ON bd.paymentmethodid = pm.id", nativeQuery = true)
    Page<BillDtoInterface> listBill(Pageable pageable);

    @Query(value = "SELECT DISTINCT b.id AS maHoaDon, a.name AS hoVaTen, a.phone_number " +
            "AS soDienThoai, b.create_date AS ngayTao, b.price AS tongTien, b.status AS trangThai, b.invoice_type " +
            "AS loaiDon, pm.name AS hinhThucThanhToan " +
            "FROM bill b " +
            "JOIN account a ON b.account_id = a.id " +
            "LEFT JOIN bill_detail bd ON b.id = bd.bill_id " +
            "LEFT JOIN payment_method pm ON bd.paymentmethodid = pm.id " +
            "WHERE (:maHoaDon IS NULL OR b.id = :maHoaDon) " +
            "AND (:ngayTaoStart IS NULL OR :ngayTaoEnd IS NULL OR (b.create_date BETWEEN :ngayTaoStart AND :ngayTaoEnd)) " +
            "AND (:trangThai IS NULL OR b.status = :trangThai) " +
            "AND (:loaiDon IS NULL OR b.invoice_type = :loaiDon)",
            nativeQuery = true)
    Page<BillDtoInterface> listSearchBill(
            @Param("maHoaDon") Long maHoaDon,
            @Param("ngayTaoStart") Date ngayTaoStart,
            @Param("ngayTaoEnd") Date ngayTaoEnd,
            @Param("trangThai") Integer trangThai,
            @Param("loaiDon") Integer loaiDon,
            Pageable pageable);

    @Query(value = "UPDATE bill SET status=:status WHERE id=:id", nativeQuery = true)
    void updateStatus(@Param("status") int status,@Param("id") Long id);
}