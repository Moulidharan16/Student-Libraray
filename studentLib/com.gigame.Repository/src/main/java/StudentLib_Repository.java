import Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
/*@EnableMongoRepositories(basePackageClasses = StudentLib_Repository.class)*/
public interface StudentLib_Repository  extends MongoRepository<Student, Integer> {

}
