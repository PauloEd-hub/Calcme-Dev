package com.springMongo.service;

import com.springMongo.model.User;

import java.util.List;


public interface  UserService {

    public  List<User> obterTodos();

    public  User obterPorCodigo(String codigo);

    public  User criar(User user);

}
