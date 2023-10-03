package com.project.DuAnTotNghiep.service.serviceImpl;

import com.project.DuAnTotNghiep.dto.BillDtoInterface;
import com.project.DuAnTotNghiep.repository.BillRepository;
import com.project.DuAnTotNghiep.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillRepository billRepository;

    @Override
    public Page<BillDtoInterface> findAll(Pageable pageable) {
        return billRepository.listBill(pageable);
    }

    @Override
    public Page<BillDtoInterface> searchListBill(Long maHoaDon,
                                                 Date ngayTaoStart,
                                                 Date ngayTaoEnd,
                                                 Integer trangThai,
                                                 Integer loaiDon, Pageable pageable) {
        return billRepository.listSearchBill( maHoaDon,
                 ngayTaoStart,
                 ngayTaoEnd,
                 trangThai,
                 loaiDon,pageable);
    }

    @Override
    public void updateStatus(int status, Long id) {
        billRepository.updateStatus(status,id);
    }
}
