package kr.or.dgit.mybatis_dev.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Student;

public class StudentDaoImpl implements StudentDao {
	// 본 클래스를 통해 dao을 결과를 log 폴더 내에 결과를 출력할 수 있음
	
	private SqlSession slqSession;
	
	private static final Log Log = LogFactory.getLog(StudentDao.class);
	
	
	public StudentDaoImpl(SqlSession slqSession) {
		this.slqSession = slqSession;
	}

	@Override
	public Student selectStudentByNo(Student student) {
		Log.debug("selectStudentByNo()");
		return slqSession.getMapper(StudentDao.class).selectStudentByNo(student);
	}

}
