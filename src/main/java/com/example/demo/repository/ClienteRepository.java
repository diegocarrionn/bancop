package com.example.demo.repository;

import com.example.demo.entity.ClienteEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<ClienteEntity,String> {}
