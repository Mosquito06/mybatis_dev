package kr.or.dgit.mybatis_dev.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentDao;
import kr.or.dgit.mybatis_dev.dao.StudentDaoImpl;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class StudentService {
	public Student findStudentByNo(Student student) {
		try(SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByNo(student);
		}
	}
	
	public List<Student> findStudentByAll(){
		try(SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByAll();
		}
	}
	
	public Student findStudentByNoWithAPI(Student student) {
		try(SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByNoWithAPI(student);
		}
	}
	
	public List<Student> findStudentByAllWithAPI(){
		try(SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlsession);
			return dao.selectStudentByAllWithAPI();
		}
	}
	
	public int insertStudent(Student student) {
		int res = -1;
		
		try(SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlsession);
			res = dao.insertStudent(student);
			sqlsession.commit();
			return res;
		}
	}
	
	public int insertStudentWithAPI(Student student) {
		int res = -1;
		try(SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlsession);
			res = dao.insertStudentWithAPI(student);
			sqlsession.commit();
			return res;
		}
	}
	
	public int insertStudentAutoInc(Student student) {
		int res = -1;
		try(SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlsession);
			res = dao.insertStudentAutoInc(student);
			sqlsession.commit();
			return res;
		}
	}
	
	public int updateStudent(Student student) {
		try(SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlsession);
			int res = dao.updateStudent(student);
			sqlsession.commit();
			return res;
		}
	}
	
	public int updateStudentWithAPI(Student student) {
		try(SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlsession);
			int res = dao.updateStudentWithAPI(student);
			sqlsession.commit();
			return res;
		}
	}
	
	public int deleteStudent(int id) {
		try(SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlsession);
			int res = dao.deleteStudent(id);
			sqlsession.commit();
			return res;
		}
	}
	
	public int deleteStudentWithAPI(int id) {
		try(SqlSession sqlsession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlsession);
			int res = dao.deleteStudentWithAPI(id);
			sqlsession.commit();
			return res;
		}
	}
}
