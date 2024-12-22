package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity // This annotation tells JPA that this class should be treated as a database entity and mapped to a table.
        // By default, the table name is the same as the class name but in lowercase. in this case "student". However, you can customize it using the @Table annotation:
        // Every @Entity class must have a primary key defined. You typically use the @Id annotation to specify the primary key field
@Table(name = "t_student") // customized using @Table annotation
public class Student {
    //entity class

    // Every @Entity class must have a primary key defined. You typically use the @Id annotation to specify the primary key field
    @Id
    // you can change the table column name using @Column(name = "std_id, nullable = false, unique = false, length = 50)
    private Integer id; // Integer is used instead of int because when id is not provided Integer will make it null by default. If int is used then the default value for int is 0. This will cause some problems.
    private String name;
    private Integer grade;



    public Student() {
    }

    public Student(Integer id, String name, Integer grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @java.lang.Override
    public java.lang.String  toString() {
        return "domain.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
