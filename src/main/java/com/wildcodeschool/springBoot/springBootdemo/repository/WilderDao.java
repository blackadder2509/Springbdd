package com.wildcodeschool.springBoot.springBootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.springBoot.springBootdemo.entities.Wilder;

@Repository
public interface WilderDao extends JpaRepository<Wilder, Long> {

}
