package com.example.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.models.Tarefa;
import com.example.main.repositories.TarefaRepository;

@Service
public class TarefaService {
    @Autowired
    TarefaRepository repository;

    public List<Tarefa> findAll() {
        return repository.findAll();
    }

    public Optional<Tarefa> findById(Integer id) {
        return repository.findById(id);
    }

    public Tarefa insert(Tarefa obj) {
        return repository.save(obj);
    }

    public Tarefa update(Tarefa obj, Integer id) {
        Tarefa entity = repository.getReferenceById(id);
        entity.setDataConclusao(obj.getDataConclusao());
        entity.setDataCriacao(obj.getDataCriacao());
        entity.setPrioridade(obj.getPrioridade());
        entity.setDescricao(obj.getDescricao());
        entity.setTitulo(obj.getTitulo());
        entity.setUser(obj.getUser());
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

}
