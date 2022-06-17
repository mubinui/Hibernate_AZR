package Student;

import jakarta.persistence.*;

@Table
//Table annotation is used for changing the details of a table
@Entity
// use to mark any class as Entity
public class Student {
    @Id
    @GeneratedValue()
    private int id;
    @Column(nullable = false,length = 128)
    private String name;
    @Column(nullable = false,unique = true)
    private String email;
    @Column
    private String dept;
    @Transient // for not using in database table .
    private String city;
    //@Temporal annotation is used for saving a date after formating
    //@Lob large objects Blob and Clob are the examples

    public Student() {
    }

    public Student(int id, String name, String email, String dept, String city) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dept = dept;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dept='" + dept + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
