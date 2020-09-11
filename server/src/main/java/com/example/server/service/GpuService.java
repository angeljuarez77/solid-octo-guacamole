package com.example.server.service;

import com.example.server.model.Gpu;
import org.springframework.http.HttpStatus;

public interface GpuService {
    Iterable<Gpu> listAllGpus();
    Gpu createGpu(Gpu gpu);
    Gpu getGpuById(Long id);
    HttpStatus deleteGpu(Long id);
}
