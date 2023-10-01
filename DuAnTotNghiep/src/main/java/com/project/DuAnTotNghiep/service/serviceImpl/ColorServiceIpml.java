package com.project.DuAnTotNghiep.service.serviceImpl;

import com.project.DuAnTotNghiep.entity.Color;
import com.project.DuAnTotNghiep.repository.ColorRepo;
import com.project.DuAnTotNghiep.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColorServiceIpml implements ColorService {

    @Autowired
    private ColorRepo colorRepo;

    @Override
    public Color save(Color color) {
        return colorRepo.save(color);
    }

    @Override
    public void delete(Long id) {
        colorRepo.deleteById(id);
    }

    @Override
    public List<Color> findAll() {
        return colorRepo.findAll();
    }

    @Override
    public Optional<Color> findById(Long id) {
        return colorRepo.findById(id);
    }

    @Override
    public Page<Color> findAll(Integer page, Integer limit) {
        Pageable pageable= PageRequest.of(page,limit);
        return colorRepo.findAll(pageable);
    }

    @Override
    public Page<Color> findAll(Pageable pageable) {
        return colorRepo.findAll(pageable);
    }
}
