package test.service;

import java.util.List;

import test.vo.Person;

public interface PersonMapper {

	// �Է�
	public int insertPerson(Person p);

	// �˻�
	public Person selectPerson(int pno);

	// ����
	public int updatePerson(Person p);

	// ����
	public int deletePerson(int pno);

	// ��ü����Ʈ
	public List<Person> getPersonList();

}
