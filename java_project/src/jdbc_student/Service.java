package jdbc_student;

import java.util.List;

import fishing.Inventory;

public interface Service {

	int insert(Student s);

	List<Student> getList();

	Student getStudent(String search);

	int updStudent(Student s);

	int delete(Student s);

	int admitflag(Student s);

	Student getAdmit(int admit);
}
