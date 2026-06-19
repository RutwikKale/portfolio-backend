package com.portfolioweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolioweb.Entity.Project;


@Repository
public interface ProjectRepo
extends JpaRepository<Project ,Long> {
}

