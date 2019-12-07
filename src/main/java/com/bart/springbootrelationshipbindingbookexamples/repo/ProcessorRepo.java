package com.bart.springbootrelationshipbindingbookexamples.repo;

import com.bart.springbootrelationshipbindingbookexamples.entity.Processor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessorRepo extends JpaRepository<Processor, Long> {
}
