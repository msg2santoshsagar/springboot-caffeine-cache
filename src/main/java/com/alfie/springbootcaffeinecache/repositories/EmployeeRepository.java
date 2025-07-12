package com.alfie.springbootcaffeinecache.repositories;

import com.alfie.springbootcaffeinecache.models.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Repository
public class EmployeeRepository {

    private final Map<Integer, Employee> employeeStore = new ConcurrentHashMap<>();

    public Collection<Employee> findAll() {
        log.info("EmployeeRepository:: findAll called");
        return employeeStore.values();
    }

    public Optional<Employee> findById(int id) {
        log.info("EmployeeRepository:: findById for {} called", id);
        return Optional.ofNullable(employeeStore.get(id));
    }

    public Employee save(Employee employee) {
        log.info("EmployeeRepository:: save for {} called", employee);
        employeeStore.put(employee.getId(), employee);
        return employee;
    }

    public void deleteById(int id) {
        log.info("EmployeeRepository:: deleteById for {} called", id);
        employeeStore.remove(id);
    }

    public boolean existsById(int id) {
        log.info("EmployeeRepository:: existsById for {} called", id);
        return employeeStore.containsKey(id);
    }

    public void clearAll() {
        log.info("EmployeeRepository:: clearAll called");
        employeeStore.clear();
    }
}
