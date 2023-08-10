package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.models.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{
    
}
