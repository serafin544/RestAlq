package com.finthecoder.restAlq.repository;

import com.finthecoder.restAlq.model.Pos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends JpaRepository<Pos,Long> {
}
