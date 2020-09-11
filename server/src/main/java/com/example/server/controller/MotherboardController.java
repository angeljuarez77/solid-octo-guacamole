package com.example.server.controller;

import com.example.server.model.Motherboard;
import com.example.server.service.MotherboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/motherboards")
public class MotherboardController {
    @Autowired
    MotherboardService motherboardService;

    @GetMapping
    public Iterable<Motherboard> listAllMbs() {
        return motherboardService.listAllMotherboards();
    }

    @PostMapping
    public Motherboard createMb(@RequestBody Motherboard mb) {
        return motherboardService.createMotherboard(mb);
    }

    @GetMapping("/{id}")
    public Motherboard getMbById(@PathVariable Long id) {
        return motherboardService.getMbById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteMbById(@PathVariable Long id) {
        return motherboardService.deleteMbById(id);
    }
}