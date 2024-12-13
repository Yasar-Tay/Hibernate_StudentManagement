import java.sql.*;

public class StudentRepository {
    //Repository class
    Connection connection;
    Statement statement;

    {
        try {
            connection = DriverManager.getConnection("hibernate.cfg.xml");
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void registerStudent(Student student) throws SQLException {

        String hql = "INSERT INTO Student(id, name, grade) VALUES (?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(hql);
        preparedStatement.setInt(1, student.getId());
        preparedStatement.setString(2, student.getName());
        preparedStatement.setInt(3, student.getGrade());

        System.out.println(student);
    }



}
