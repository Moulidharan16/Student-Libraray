import Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value={"/StudentAPI"})
public class studentController {

    @Autowired
    private final StudentLib_Service studentLibService;
    @Autowired
    public studentController(StudentLib_Service studentLibService) {
        this.studentLibService = studentLibService;
    }

    //build create student REST API
    @PostMapping()
    public ResponseEntity<Student> saveStudentLib(@RequestBody Student student){
        return new ResponseEntity<Student>(studentLibService.saveStudentLib(student), HttpStatus.CREATED);
    }

    // build get all student REST APIU
    @GetMapping()
    public List<Student> GetAllStudentLib(){
        return studentLibService.GetAllStudentLib();
    }

    //build get student by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Student>  getStudentLibById(@PathVariable("id") int id) throws Throwable {
        return new ResponseEntity<Student>(studentLibService.getStudentLibById(id),HttpStatus.OK);
    }

    //build update student REST API
    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudentLib(@PathVariable ("id") int id,
                                                   @RequestBody Student student) throws Throwable {
        return new ResponseEntity<Student>((studentLibService).updateStudentLib(student, id ),HttpStatus.OK);
    }

    //build delete student by REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudentLib(@PathVariable("id")  int id){
        studentLibService.deleteStudentLib(id);
        return new ResponseEntity<String>("Employee deleted Successsfully....!",HttpStatus.OK);

    }


}
