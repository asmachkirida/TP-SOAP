package com.example.soap.repositories;

import com.example.soap.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
    // You can add custom query methods here if needed
}
