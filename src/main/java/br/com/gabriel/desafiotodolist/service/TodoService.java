package br.com.gabriel.desafiotodolist.service;

import br.com.gabriel.desafiotodolist.entity.Todo;
import br.com.gabriel.desafiotodolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository service) {
        this.repository = service;
    }

    public List<Todo> create(Todo todo) {
        repository.save(todo);
        return listar();
    }

    public List<Todo> listar() {
        Sort sort = Sort.by("prioridade").descending() // Ordena pela coluna 'prioridade' em ordem decrescente.
                .and(Sort.by("nome").ascending()); // Depois, ordena pela coluna 'nome' em ordem crescente.

        return repository.findAll(sort);
    }

    public List<Todo> update(Todo todo) {
        repository.save(todo);
        return listar();
    }

    public List<Todo> delete(Long id) {
        repository.deleteById(id);
        return listar();
    }

}
