package com.example.server.service;

import com.example.server.model.Cpu;
import com.example.server.repository.CpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class CpuServiceImpl implements CpuService {
    @Autowired
    CpuRepository cpuRepository;

    @Override
    public Iterable<Cpu> listCpus() {
        return cpuRepository.findAll();
    }

    @Override
    public Cpu createCpu(Cpu cpu) {
        return cpuRepository.save(cpu);
    }

    @Override
    public Cpu getCpuById(Long id) {
        return cpuRepository.findById(id).get();
    }

    @Override
    public HttpStatus deleteCpuById(Long id) {
        cpuRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
