package com.deepak.Employee.service.employee;

import com.deepak.Employee.model.EmployeeDto;
import com.deepak.Employee.model.GetEmployeeRequest;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface EmployeeService {

    List<EmployeeDto> getAllEmployees(GetEmployeeRequest getEmployeesRequest);

    EmployeeDto getEmployeeById(Object getEmployeesRequest);

    EmployeeDto modifyEmployee(String empId, EmployeeDto employeeDto);

    List<EmployeeDto> importEmployee(MultipartFile file);

    Resource exportEmployee(List<EmployeeDto> employeeDtoList);

}
