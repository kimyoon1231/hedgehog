package test.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import test.vo.Person;

public class PersonDAO implements PersonMapper {

	@Override
	public int insertPerson(Person p) {
		SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession();
		PersonMapper pm = session.getMapper(PersonMapper.class);
		int result = 0; // sql data에 영향을 미친 수 만큼 리턴 됨
		try {
			result = pm.insertPerson(p);
			session.commit();
		} finally {
			session.close();
		}
		return result;
	}

	@Override
	public Person selectPerson(int pno) {
		SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession();
		PersonMapper pm = session.getMapper(PersonMapper.class);
		Person result = null; // sql data에 영향을 미친 수 만큼 리턴 됨
		try {
			result = pm.selectPerson(pno);
		} finally {
			session.close();
		}
		return result;
	}

	@Override
	public int updatePerson(Person p) {
		SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession();
		PersonMapper pm = session.getMapper(PersonMapper.class);
		int result = 0; // sql data에 영향을 미친 수 만큼 리턴 됨
		try {
			result = pm.updatePerson(p);
			session.commit();
		} finally {
			session.close();
		}
		return result;
	}

	@Override
	public int deletePerson(int pno) {
		SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession();
		PersonMapper pm = session.getMapper(PersonMapper.class);
		int result = 0; // sql data에 영향을 미친 수 만큼 리턴 됨
		try {
			result = pm.deletePerson(pno);
			session.commit();
		} finally {
			session.close();
		}
		return result;
	}

	@Override
	public List<Person> getPersonList() {

		SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession();
		PersonMapper pm = session.getMapper(PersonMapper.class);
		List<Person> result = null; // sql data에 영향을 미친 수 만큼 리턴 됨
		try {
			result = pm.getPersonList();
		} finally {
			session.close();
		}
		return result;
	}

}
