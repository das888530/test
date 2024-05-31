package com.protfolio.demo.repsitory;

import com.protfolio.demo.model.Life;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LifeRepository extends JpaRepository<Life,Integer> {

}
