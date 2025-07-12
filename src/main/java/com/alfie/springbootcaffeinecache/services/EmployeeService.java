package com.alfie.springbootcaffeinecache.services;

import com.alfie.springbootcaffeinecache.models.Employee;
import com.alfie.springbootcaffeinecache.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Collection<Employee> findAll() {
        log.info("EmployeeService:: findAll called");
        return employeeRepository.findAll();
    }

    @Cacheable(cacheNames = "employees", key = "#id")
    public Optional<Employee> findById(int id) {
        log.info("EmployeeService:: findById for {} called", id);
        return employeeRepository.findById(id);
    }

    @CacheEvict(cacheNames = "employees", key = "#employee.id")
    public Employee save(Employee employee) {
        log.info("EmployeeService:: save for {} called", employee);
        return employeeRepository.save(employee);
    }

    @CacheEvict(cacheNames = "employees", key = "#id")
    public void deleteById(int id) {
        log.info("EmployeeService:: deleteById for {} called", id);
        employeeRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        log.info("EmployeeService:: existsById for {} called", id);
        return employeeRepository.existsById(id);
    }

    @CacheEvict(cacheNames = "employees", allEntries = true)
    public void clearAll() {
        log.info("EmployeeService:: clearAll called");
        employeeRepository.clearAll();
    }
}

