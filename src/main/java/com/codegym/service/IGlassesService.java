package com.codegym.service;

import com.codegym.model.Glasses;

import java.util.List;

public interface IGlassesService {
    List<Glasses> findAll();
    void save(Glasses glasses);
    Glasses findById(Long id);
    void remove(Long id);
}
