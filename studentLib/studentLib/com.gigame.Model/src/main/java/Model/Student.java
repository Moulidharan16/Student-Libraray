package Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="StuLib")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    private int id;
    private int bookId;
    private int studentId;
    private String First_Name;
    private String Last_Name;
    private String Department;
    private String PhoneNumber;
    private String email;
    private String Book_Name;
    private String Author_Name;
    private String Book_GivenDate;
    private String Book_ReturnDate;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBook_Name() {
        return Book_Name;
    }

    public void setBook_Name(String book_Name) {
        Book_Name = book_Name;
    }

    public String getAuthor_Name() {
        return Author_Name;
    }

    public void setAuthor_Name(String author_Name) {
        Author_Name = author_Name;
    }

    public String getBook_GivenDate() {
        return Book_GivenDate;
    }

    public void setBook_GivenDate(String book_GivenDate) {
        Book_GivenDate = book_GivenDate;
    }

    public String getBook_ReturnDate() {
        return Book_ReturnDate;
    }

    public void setBook_ReturnDate(String book_ReturnDate) {
        Book_ReturnDate = book_ReturnDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", studentId=" + studentId +
                ", First_Name='" + First_Name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", Department='" + Department + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", Book_Name='" + Book_Name + '\'' +
                ", Author_Name='" + Author_Name + '\'' +
                ", Book_GivenDate='" + Book_GivenDate + '\'' +
                ", Book_ReturnDate='" + Book_ReturnDate + '\'' +
                '}';
    }
}
