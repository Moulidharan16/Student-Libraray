import Model.Student;

import java.util.List;

public interface StudentLib_Service {

    Student saveStudentLib(Student student);                                      //post
    List<Student> GetAllStudentLib();                                            //list all
    Student getStudentLibById(int id) throws Throwable;                         //individual to be get
    Student updateStudentLib(Student student, int id) throws Throwable;          //update details
    void deleteStudentLib(int id);                                            //delete s

}
