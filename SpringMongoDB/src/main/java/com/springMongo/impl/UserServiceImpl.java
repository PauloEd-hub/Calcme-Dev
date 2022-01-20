package com.springMongo.impl;

import com.springMongo.model.User;
import com.springMongo.repository.UserRepository;
import com.springMongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> obterTodos() {
        return this.userRepository.findAll();
    }

    @Override
    public User obterPorCodigo(String codigo) {
        return this.userRepository.findById(codigo).orElseThrow(
                () -> new IllegalArgumentException("Usuário não existe."));
    }

    @Override
    public User criar(User user) {
        return this.userRepository.save(user);
    }
}
