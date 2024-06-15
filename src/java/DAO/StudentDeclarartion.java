
package DAO;

import Bean.Student;
import java.util.ArrayList;

public interface StudentDeclarartion {
    public long insertStudent(Student st);
    public long update(long id, Student st);
    public boolean delete(long id);
    public Student selectStudent(long id);
    public ArrayList selectAllStudents();
}
