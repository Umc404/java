package jdbc_student;

import java.util.List;

public interface DAO {

	int insert(Student s);

	List<Student> list();

	Student search(String search);

	int update(Student s);

	int delete(Student s);

	int updAdmit(Student s);

	Student selectAdmit(int admit);

}
