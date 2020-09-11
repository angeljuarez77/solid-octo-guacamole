package com.example.server.repository;

import com.example.server.model.Gpu;
import org.springframework.data.repository.CrudRepository;

public interface GpuRepository extends CrudRepository<Gpu, Long> {
}
