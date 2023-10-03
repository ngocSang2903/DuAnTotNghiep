package com.project.DuAnTotNghiep.controller.admin;

import com.project.DuAnTotNghiep.dto.BillDtoInterface;
import com.project.DuAnTotNghiep.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/admin")
public class BillController {

    @Autowired
    private BillService billService;



    @GetMapping("/bill-list")
    public String getBill(Model model, @RequestParam(name = "page", defaultValue = "0") int page,
                           @RequestParam(name = "sort", defaultValue = "id,asc") String sortField) {
        int pageSize = 5;
        String[] sortParams = sortField.split(",");
        String sortFieldName = sortParams[0];
        Sort.Direction sortDirection = Sort.Direction.ASC;

        if (sortParams.length > 1 && sortParams[1].equalsIgnoreCase("desc")) {
            sortDirection = Sort.Direction.DESC;
        }

        Sort sort = Sort.by(sortDirection, sortFieldName);

        Pageable pageable = PageRequest.of(page, pageSize, sort);
        Page<BillDtoInterface> Bill = billService.findAll(pageable);

        model.addAttribute("sortField", sortFieldName);
        model.addAttribute("sortDirection", sortDirection);

        model.addAttribute("items", Bill);

        return "admin/bill";
    }


    @GetMapping("/bill-list-search")
    public String getSearchBill(
            Model model,
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "sort", defaultValue = "id,asc") String sortField,
            @RequestParam(name = "maHoaDon", required = false) Long maHoaDon,
            @RequestParam(name = "ngayTaoStart", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date ngayTaoStart,
            @RequestParam(name = "ngayTaoEnd", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date ngayTaoEnd,
            @RequestParam(name = "trangThai", required = false) Integer trangThai,
            @RequestParam(name = "loaiDon", required = false) Integer loaiDon
    ) {
        int pageSize = 5;
        String[] sortParams = sortField.split(",");
        String sortFieldName = sortParams[0];
        Sort.Direction sortDirection = Sort.Direction.ASC;

        if (sortParams.length > 1 && sortParams[1].equalsIgnoreCase("desc")) {
            sortDirection = Sort.Direction.DESC;
        }

        Sort sort = Sort.by(sortDirection, sortFieldName);

        Pageable pageable = PageRequest.of(page, pageSize, sort);
        Page<BillDtoInterface> Bill;


            Bill = billService.searchListBill(maHoaDon, ngayTaoStart, ngayTaoEnd, trangThai, loaiDon, pageable);


        model.addAttribute("sortField", sortFieldName);
        model.addAttribute("sortDirection", sortDirection);
        model.addAttribute("items", Bill);

        return "admin/bill";
    }

    @GetMapping("/update-bill-status/{billId}")
    public String updateBillStatus(
            @PathVariable Long billId,
            @RequestParam int status) {
        billService.updateStatus(status,billId);
        return "redirect:/admin/bill-list";
    }

}
