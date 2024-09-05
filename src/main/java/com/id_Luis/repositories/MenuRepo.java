package com.id_Luis.repositories;

import com.id_Luis.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepo extends JpaRepository<Menu, Long> {
}
