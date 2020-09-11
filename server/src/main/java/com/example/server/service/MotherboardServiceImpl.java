package com.example.server.service;

import com.example.server.model.Motherboard;
import com.example.server.repository.MotherboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class MotherboardServiceImpl implements MotherboardService {
    @Autowired
    MotherboardRepository motherboardRepository;

    @Override
    public Iterable<Motherboard> listAllMotherboards() {
        return motherboardRepository.findAll();
    }

    @Override
    public Motherboard createMotherboard(Motherboard mb) {
        return motherboardRepository.save(mb);
    }

    @Override
    public Motherboard getMbById(Long id) {
        return motherboardRepository.findById(id).get();
    }

    @Override
    public HttpStatus deleteMbById(Long id) {
        motherboardRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
