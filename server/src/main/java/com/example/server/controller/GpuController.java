package com.example.server.controller;

import com.example.server.model.Gpu;
import com.example.server.service.GpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gpus")
public class GpuController {
    @Autowired
    GpuService gpuService;

    @GetMapping
    public Iterable<Gpu> listAllGpus() {
        return gpuService.listAllGpus();
    }

    @PostMapping
    public Gpu createGpu(@RequestBody Gpu gpu) {
        return gpuService.createGpu(gpu);
    }

    @GetMapping("/{id}")
    public Gpu getGpuById(@PathVariable Long id) {
        return gpuService.getGpuById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteGpuById(@PathVariable Long id) {
        return gpuService.deleteGpu(id);
    }
}
