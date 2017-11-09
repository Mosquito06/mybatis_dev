package kr.or.dgit.mybatis_dev.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentDao;
import kr.or.dgit.mybatis_dev.dao.StudentDaoImpl;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class StudentService {
	public Student findStudentByNo(Student student) {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByNo(student);
		}
	}

	public List<Student> findStudentByAll() {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByAll();
		}
	}

	public Student findStudentByNoWithAPI(Student student) {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByNoWithAPI(student);
		}
	}

	public List<Student> findStudentByAllWithAPI() {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByAllWithAPI();
		}
	}

	public int insertStudent(Student student) {
		int res = -1;

		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			res = dao.insertStudent(student);
			sqlsession.commit();
			return res;
		}
	}

	public int insertStudentWithAPI(Student student) {
		int res = -1;
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			res = dao.insertStudentWithAPI(student);
			sqlsession.commit();
			return res;
		}
	}

	public int insertStudentAutoInc(Student student) {
		int res = -1;
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			res = dao.insertStudentAutoInc(student);
			sqlsession.commit();
			return res;
		}
	}

	public int updateStudent(Student student) {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			int res = dao.updateStudent(student);
			sqlsession.commit();
			return res;
		}
	}

	public int updateStudentWithAPI(Student student) {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			int res = dao.updateStudentWithAPI(student);
			sqlsession.commit();
			return res;
		}
	}

	public int deleteStudent(int id) {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			int res = dao.deleteStudent(id);
			sqlsession.commit();
			return res;
		}
	}

	public int deleteStudentWithAPI(int id) {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			int res = dao.deleteStudentWithAPI(id);
			sqlsession.commit();
			return res;
		}
	}

	public List<Student> findStudentByAllForResultMap() {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByAllForResultMap();
		}
	}

	public List<Student> findStudentByAllForResultMapWithAPI() {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByAllForResultMapWithAPI();
		}
	}

	public List<Map<String, Object>> findStudentByAllForHashMap() {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByAllForHashMap();
		}
	}
	
	public List<Map<String, Object>> findStudentByAllForHashMapWithAPI() {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByAllForHashMapWithAPI();
		}
	}
	
	public Student findStudentByNoForResultMapExtends(Student student) {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByNoForResultMapExtends(student);
		}
	}
	
	public Student findStudentByNoForResultMapExtendsWithAPI(Student student) {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByNoForResultMapExtendsWithAPI(student);
		}
	}
	
	public Student findStudentByNoAssociation(Student student) {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByNoAssociation(student);
		}
	}
	
	public Student findStudentByNoAssociationWithAPI(Student student) {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByNoAssociationWithAPI(student);
		}
	}
	
	public int insertEnumStudent(Student student) {
		int res = -1;

		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			res = dao.insertEnumStudent(student);
			sqlsession.commit();
			return res;
		}
	}
	
	public int insertEnumStudentWithAPI(Student student) {
		int res = -1;

		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			res = dao.insertEnumStudentWithAPI(student);
			sqlsession.commit();
			return res;
		}
	}
	
	public Student findAllStudentByParam(String name, String email) {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectAllStudentByParam(name, email);
		}
	}
	
	public Student findAllStudentByStudent(Student student) {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectAllStudentByStudent(student);
		}
	}
	
	public Student findAllStudentByMap(Map<String, String> map) {
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectAllStudentByMap(map);
		}
	}
	
	public Map<Integer, String> findStudentForMap(){
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentForMap();
		}
	}
	
	public int updateSetStudent(Student student){
		try (SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlsession);
			int res = dao.updateSetStudent(student);
			sqlsession.commit();
			return res;
		}
	}
	
}
