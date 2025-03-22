package com.demo.EmployeeService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
class EmployeeController
{
  @GetMapping
  public String getAllEmployees() {
      return "Welcome to Cloud";
      }
}



//
//@RestController
//@RequestMapping("/employee")
//@RequiredArgsConstructor
//@CrossOrigin("*")
//public class EmployeeController {
//
//    private final EmployeeRepository employeeRepository;
//
//    // Get all employees
//    @GetMapping
//    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//    }
//
//    // Get employee by ID
//    @GetMapping("/{id}")
//    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
//        return employeeRepository.findById(id)
//                .map(ResponseEntity::ok)
//                .orElseGet(() -> ResponseEntity.notFound().build());
//    }
//
//    // Create a new employee
//    @PostMapping
//    public Employee createEmployee(@RequestBody Employee employee) {
//        return employeeRepository.save(employee);
//    }
//
//    // Update an existing employee
//    @PutMapping("/{id}")
//    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
//        return employeeRepository.findById(id)
//                .map(employee -> {
//                    employee.setName(updatedEmployee.getName());
//                    employee.setEmail(updatedEmployee.getEmail());
//                    employee.setDepartment(updatedEmployee.getDepartment());
//                    return ResponseEntity.ok(employeeRepository.save(employee));
//                })
//                .orElseGet(() -> ResponseEntity.notFound().build());
//    }
//
//    // Delete an employee
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
//        if (employeeRepository.existsById(id)) {
//            employeeRepository.deleteById(id);
//            return ResponseEntity.noContent().build();
//        }
//        return ResponseEntity.notFound().build();
//    }
//}