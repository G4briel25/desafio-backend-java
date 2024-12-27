package br.com.gabriel.desafiotodolist.repository;

import br.com.gabriel.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {}
