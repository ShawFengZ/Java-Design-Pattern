package otherPattern.DataAccessObjectPattern.dao;

import otherPattern.DataAccessObjectPattern.entity.Student;

import java.util.List;

/**
 * @author zxf
 * @date 2018/9/17 9:55
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
