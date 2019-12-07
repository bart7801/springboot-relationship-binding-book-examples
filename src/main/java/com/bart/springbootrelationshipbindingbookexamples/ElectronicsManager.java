package com.bart.springbootrelationshipbindingbookexamples;

import com.bart.springbootrelationshipbindingbookexamples.entity.Computer;
import com.bart.springbootrelationshipbindingbookexamples.entity.Processor;
import com.bart.springbootrelationshipbindingbookexamples.repo.ComputerRepo;
import com.bart.springbootrelationshipbindingbookexamples.repo.ProcessorRepo;
import org.springframework.stereotype.Service;

@Service
public class ElectronicsManager {

    public ElectronicsManager(ComputerRepo computerRepo,
                              ProcessorRepo processorRepo) {

        Processor processor = new Processor();
        processor.setName("Intel i5");
        processorRepo.save(processor);

        Computer computer = new Computer();
        computer.setProcessor(processor);
        computerRepo.save(computer);
    }
}


