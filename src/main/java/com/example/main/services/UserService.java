package com.example.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.models.User;
import com.example.main.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public Optional<User> findById(Integer id){
        return repository.findById(id);
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    public User update(User obj, Integer id) {
        User entity = repository.getReferenceById(id);
        entity.setNome(obj.getNome());
        entity.setEmail(obj.getEmail());
        return repository.save(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
