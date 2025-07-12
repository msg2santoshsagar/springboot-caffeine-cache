package com.alfie.springbootcaffeinecache.controllers;

import com.alfie.springbootcaffeinecache.models.Employee;
import com.alfie.springbootcaffeinecache.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
@Slf4j
public class EmployeeApiController {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<Collection<Employee>> getAllEmployees() {
        log.info("GET /employees called");
        return ResponseEntity.ok(employeeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
        log.info("GET /employees/{} called", id);
        return employeeService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        log.info("POST /employees called with body: {}", employee);
        return ResponseEntity.ok(employeeService.save(employee));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable int id) {
        log.info("DELETE /employees/{} called", id);
        if (!employeeService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        employeeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllEmployees() {
        log.info("DELETE /employees called");
        employeeService.clearAll();
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}/exists")
    public ResponseEntity<Boolean> checkIfEmployeeExists(@PathVariable int id) {
        log.info("GET /employees/{}/exists called", id);
        return ResponseEntity.ok(employeeService.existsById(id));
    }
}
