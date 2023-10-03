package com.project.DuAnTotNghiep.dto;

import java.util.Date;

public interface BillDtoInterface {
    Long getMaHoaDon();
    String getHoVaTen();
    String getSoDienThoai();

    Date getNgayTao();
    Double getTongTien();
    int getTrangThai();
    int getLoaiDon();
    String getHinhThucThanhToan();
}
