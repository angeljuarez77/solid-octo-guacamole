package com.example.server.service;

import com.example.server.model.Motherboard;
import org.springframework.http.HttpStatus;

public interface MotherboardService {
    Iterable<Motherboard> listAllMotherboards();
    Motherboard createMotherboard(Motherboard mb);
    Motherboard getMbById(Long id);
    HttpStatus deleteMbById(Long id);
}
