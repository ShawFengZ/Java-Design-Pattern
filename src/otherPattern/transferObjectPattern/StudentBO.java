package otherPattern.transferObjectPattern;

import otherPattern.DataAccessObjectPattern.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxf
 * @date 2018/9/19 14:13
 */
//步骤2：创建业务对象
public class StudentBO {
    List<StudentVO> students;

    public StudentBO() {
        students = new ArrayList<StudentVO>();
        StudentVO student1 = new StudentVO("Robert", 0);
        StudentVO stuednt2 = new StudentVO("John", 1);
        students.add(student1);
        students.add(stuednt2);
    }

    public void deleteStudent(StudentVO student){
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database.");
    }

    //从数据库中检索学生名单
    public List<StudentVO> getAllStudents(){
        return students;
    }

    public StudentVO getStudent(int rollNo){
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student){
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in database.");
    }
}
