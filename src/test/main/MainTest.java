package test.main;

import test.service.PersonDAO;
import test.vo.Person;

public class MainTest {

	public static void main(String[] args) {

		Person p = new Person("testOne");
		PersonDAO dao = new PersonDAO();

		System.out.println(dao.insertPerson(p));
		// System.out.println(dao.insertPerson(p));
		//
		System.out.println(dao.selectPerson(11));
		//
		// System.out.println(dao.deletePerson(1));
		//
		// Person p2 = new Person("´Ù¸¥°Å");
		//
		// System.out.println(dao.updatePerson(p));

		// dao.selectPerson(0);
		// System.out.println(dao.deletePerson(1));
		System.out.println(dao.getPersonList());

		System.out.println("--");

	}

}
