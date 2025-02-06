package br.com.gabriel.desafiotodolist.controller;

import br.com.gabriel.desafiotodolist.entity.Todo;
import br.com.gabriel.desafiotodolist.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    List<Todo> create(@RequestBody @Valid Todo todo) {
        return service.create(todo);
    }

    @GetMapping
    List<Todo> list() {
        return service.listar();
    }

    @PutMapping("{id}")
    List<Todo> update(@PathVariable Long id, @RequestBody Todo todo) {
        return service.update(id, todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

}
