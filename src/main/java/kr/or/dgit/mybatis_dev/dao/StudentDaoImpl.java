package kr.or.dgit.mybatis_dev.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Student;

public class StudentDaoImpl implements StudentDao {
	// 본 클래스를 통해 dao을 결과를 log 폴더 내에 결과를 출력할 수 있음
	
	private SqlSession sqlSession;
	
	private static final Log Log = LogFactory.getLog(StudentDao.class);
	private String namespace="kr.or.dgit.mybatis_dev.dao.StudentDao" ;
	
	
	public StudentDaoImpl(SqlSession slqSession) {
		this.sqlSession = slqSession;
	}


	@Override
	public Student selectStudentByNoWithAPI(Student student) {
		// log 폴더 내 결과에 selectStudentByNoWithAPI()이 출력됨
		Log.debug("selectStudentByNoWithAPI()");
		return sqlSession.selectOne(namespace + ".selectOne", student);
	}


	@Override
	public List<Student> selectStudentByAllWithAPI() {
		Log.debug("selectStudentByAllWithAPI()");
		return sqlSession.selectList(namespace + ".selectList");
	}

	@Override
	public Student selectStudentByNo(Student student) {
		Log.debug("selectStudentByNo()");
		return sqlSession.getMapper(StudentDao.class).selectStudentByNo(student);
	}

	@Override
	public List<Student> selectStudentByAll() {
		Log.debug("selectStudentByAll()");
		return sqlSession.getMapper(StudentDao.class).selectStudentByAll();
	}


	@Override
	public int insertStudent(Student student) {
		Log.debug("insertStudent()");
		return sqlSession.getMapper(StudentDao.class).insertStudent(student);
	}


	@Override
	public int insertStudentWithAPI(Student student) {
		Log.debug("insertStudentWithAPI()");
		return sqlSession.insert(namespace + ".insertStudentWithAPI", student);
	}


	@Override
	public int insertStudentAutoInc(Student student) {
		Log.debug("insertStudentAutoInc()");
		return sqlSession.getMapper(StudentDao.class).insertStudentAutoInc(student);
	}


	@Override
	public int updateStudent(Student student) {
		Log.debug("updateStudent()");
		return sqlSession.getMapper(StudentDao.class).updateStudent(student);
	}


	@Override
	public int updateStudentWithAPI(Student student) {
		Log.debug("updateStudentWithAPI()");
		return sqlSession.update(namespace + ".updateStudentWithAPI", student);
	}


	@Override
	public int deleteStudent(int id) {
		Log.debug("deleteStudent()");
		return  sqlSession.getMapper(StudentDao.class).deleteStudent(id);
	}


	@Override
	public int deleteStudentWithAPI(int id) {
		Log.debug("deleteStudentWithAPI()");
		return sqlSession.delete(namespace + ".deleteStudentWithAPI", id);
	}

}
