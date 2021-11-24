import Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;


@Service
public class StudentLib_Service_IMPL implements StudentLib_Service {
    @Autowired
    private final StudentLib_Repository studentLibRepo;

    @Autowired
    public StudentLib_Service_IMPL(StudentLib_Repository studentLinRepo) {
        this.studentLibRepo = studentLinRepo;
    }

    @Override
    public Student saveStudentLib(Student student) {
        return  this.studentLibRepo.save(student);
    }

    @Override
    public List<Student> GetAllStudentLib() {
        return this.studentLibRepo.findAll();
    }

    @Override
    public Student getStudentLibById( int id) throws Throwable {
        Optional<Student>  student = this.studentLibRepo.findById(id);
        if (student.isPresent()) {
            return student.get();
        }else {
            throw new ResourceNotFoundExceptionCustome("Student", "id",id);
        }
    }

    @Override
    public Student updateStudentLib(Student student, int id) throws Throwable {
        Student existingStudent =  this.studentLibRepo.findById(id).orElseThrow(
                () -> new ResourceNotFoundExceptionCustome("Employee","id",id));
        existingStudent.setBookId(student.getBookId());
        existingStudent.setStudentId(student.getStudentId());
        existingStudent.setFirst_Name(student.getFirst_Name());
        existingStudent.setLast_Name(student.getLast_Name());
        existingStudent.setDepartment(student.getDepartment());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setPhoneNumber(student.getPhoneNumber());
        existingStudent.setBook_Name(student.getBook_Name());
        existingStudent.setAuthor_Name(student.getAuthor_Name());
        existingStudent.setBook_GivenDate(student.getBook_GivenDate());
        existingStudent.setBook_ReturnDate(student.getBook_ReturnDate());
        studentLibRepo.save(existingStudent);
        return existingStudent;

    }

    @Override
    public void deleteStudentLib(int id) {
        this.studentLibRepo.deleteById(id);

    }





}
