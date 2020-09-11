package com.example.server.service;

import com.example.server.model.Cpu;
import org.springframework.http.HttpStatus;

public interface CpuService {
    Iterable<Cpu> listCpus();
    Cpu createCpu(Cpu cpu);
    Cpu getCpuById(Long id);
    HttpStatus deleteCpuById(Long id);
}
