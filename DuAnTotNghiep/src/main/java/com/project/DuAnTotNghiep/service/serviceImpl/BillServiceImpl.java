package com.project.DuAnTotNghiep.service.serviceImpl;

import com.project.DuAnTotNghiep.dto.BillDto;
import com.project.DuAnTotNghiep.repository.BillRepository;
import com.project.DuAnTotNghiep.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillRepository billRepository;

    @Override
    public Page<BillDto> findAll(Pageable pageable) {
        return billRepository.listBill(pageable);
    }
}
