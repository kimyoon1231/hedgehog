package test.service;

import java.util.List;

import test.vo.Person;

public interface PersonMapper {

	// 입력
	public int insertPerson(Person p);

	// 검색
	public Person selectPerson(int pno);

	// 수정
	public int updatePerson(Person p);

	// 삭제
	public int deletePerson(int pno);

	// 전체리스트
	public List<Person> getPersonList();

}
