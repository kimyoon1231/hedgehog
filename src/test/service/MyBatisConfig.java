package test.service;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// sqlSessionFactory �ν��Ͻ��� �ϳ� �����ϰ�
// sqlSession�� ��ȯ���ִ� ��ƿ Ŭ����

public class MyBatisConfig {

	private static SqlSessionFactory sqlSessionFactory;

	public static SqlSessionFactory getSqlSessionFactory() {

		if (sqlSessionFactory == null) {
			String resource = "mybatis-config.xml";
			try {
				Reader reader = Resources.getResourceAsReader(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sqlSessionFactory;
	}

}