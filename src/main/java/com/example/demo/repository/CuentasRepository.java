package com.example.demo.repository;

import com.example.demo.entity.CuentasEntity;
import org.springframework.data.repository.CrudRepository;

public interface CuentasRepository extends CrudRepository<CuentasEntity,String> {}
