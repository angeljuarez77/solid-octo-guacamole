package com.example.server.controller;

import com.example.server.model.Cpu;
import com.example.server.service.CpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cpus")
public class CpuController {
    @Autowired
    CpuService cpuService;

    @GetMapping
    public Iterable<Cpu> listAllCpus() {
        return cpuService.listCpus();
    }

    @PostMapping
    public Cpu createCpu(@RequestBody Cpu cpu) {
        return cpuService.createCpu(cpu);
    }

    @GetMapping("/{id}")
    public Cpu getCpuById(@PathVariable Long id) {
        return cpuService.getCpuById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteCpu(@PathVariable Long id) {
        return cpuService.deleteCpuById(id);
    }
}
