package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Pension;
public interface IPensionRepository extends JpaRepository<Pension, Long> {

}