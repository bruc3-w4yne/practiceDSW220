package com.example.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.Libro;
import com.example.examen.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;


    @Override
    public List<Libro> buscarPorCategoria(String categoria) {
        // TODO Auto-generated method stub
        return libroRepository.buscarPorCategoria(categoria);
    }



}
