package manytomany.manytomanytest.service;

import manytomany.manytomanytest.model.StudentDto;

import java.util.List;

public interface StudentService {
    public StudentDto addStudent(StudentDto studentDto);
    public List<StudentDto> getAllStudents();
    public StudentDto updateStudent(Integer studentId, StudentDto student);
    public String deleteStudent(Integer studentId);
}
