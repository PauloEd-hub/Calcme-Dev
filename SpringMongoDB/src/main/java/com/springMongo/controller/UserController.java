package com.springMongo.controller;

import com.springMongo.model.User;
import com.springMongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<?>> findAll() {
        List<?> list = userService.obterTodos();
        return ResponseEntity.ok().body(list);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        User userDT = userService.obterPorCodigo(id);
        return ResponseEntity.ok().body(userDT);
    }


    @PostMapping
    public ResponseEntity<?> save(@RequestBody User userDt) {
        User savedUserDT = userService.criar(userDt);
        return ResponseEntity.ok().body(savedUserDT);
    }


//    @PutMapping
//    public ResponseEntity<?> update(@RequestBody UserModel  userDT) {
//        UserModel updatedUserDT = userService.update(userDT);
//        return ResponseEntity.ok().body(updatedUserDT);
//    }
//
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable String id) {
//        userService.delete(id);
//        return ResponseEntity.ok().body("Deleted successfully...!");
//    }

}
