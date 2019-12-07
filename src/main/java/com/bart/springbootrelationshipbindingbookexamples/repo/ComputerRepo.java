package com.bart.springbootrelationshipbindingbookexamples.repo;

import com.bart.springbootrelationshipbindingbookexamples.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepo extends JpaRepository<Computer, Long> {
}
