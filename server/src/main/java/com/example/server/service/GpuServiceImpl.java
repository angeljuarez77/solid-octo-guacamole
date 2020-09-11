package com.example.server.service;

import com.example.server.model.Gpu;
import com.example.server.repository.GpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class GpuServiceImpl implements GpuService {
    @Autowired
    GpuRepository gpuRepository;

    @Override
    public Iterable<Gpu> listAllGpus() {
        return gpuRepository.findAll();
    }

    @Override
    public Gpu createGpu(Gpu gpu) {
        return gpuRepository.save(gpu);
    }

    @Override
    public Gpu getGpuById(Long id) {
        return gpuRepository.findById(id).get();
    }

    @Override
    public HttpStatus deleteGpu(Long id) {
        gpuRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
