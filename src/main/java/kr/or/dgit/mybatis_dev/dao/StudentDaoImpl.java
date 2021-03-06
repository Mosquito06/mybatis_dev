package kr.or.dgit.mybatis_dev.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
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


	@Override
	public List<Student> selectStudentByAllForResultMap() {
		Log.debug("selectStudentByAllForResultMap()");
		return sqlSession.getMapper(StudentDao.class).selectStudentByAllForResultMap();
	}


	@Override
	public List<Student> selectStudentByAllForResultMapWithAPI() {
		Log.debug("selectStudentByAllForResultMapWithAPI()");
		return sqlSession.selectList(namespace + ".selectStudentByAllForResultMap");
	}


	@Override
	public List<Map<String, Object>> selectStudentByAllForHashMap() {
		Log.debug("selectStudentByAllForHashMap()");
		return sqlSession.getMapper(StudentDao.class).selectStudentByAllForHashMap();
	}


	@Override
	public List<Map<String, Object>> selectStudentByAllForHashMapWithAPI() {
		Log.debug("selectStudentByAllForHashMapWithAPI()");
		return sqlSession.selectList(namespace + ".selectStudentByAllForHashMapWithAPI");
	}


	@Override
	public Student selectStudentByNoForResultMapExtends(Student student) {
		Log.debug("selectStudentByNoForResultMapExtends()");
		return sqlSession.getMapper(StudentDao.class).selectStudentByNoForResultMapExtends(student);
	}


	@Override
	public Student selectStudentByNoForResultMapExtendsWithAPI(Student student) {
		Log.debug("selectStudentByNoForResultMapExtendsWithAPI()");
		return sqlSession.selectOne(namespace + ".selectStudentByNoForResultMapExtendsWithAPI", student);
	}


	@Override
	public Student selectStudentByNoAssociation(Student student) {
		Log.debug("selectStudentByNoAssociation()");
		return sqlSession.getMapper(StudentDao.class).selectStudentByNoAssociation(student);
	}


	@Override
	public Student selectStudentByNoAssociationWithAPI(Student student) {
		Log.debug("selectStudentByNoAssociationWithAPI()");
		return sqlSession.selectOne(namespace + ".selectStudentByNoAssociationWithAPI", student);
	}


	@Override
	public int insertEnumStudent(Student student) {
		Log.debug("insertEnumStudent()");
		return sqlSession.getMapper(StudentDao.class).insertEnumStudent(student);
	}


	@Override
	public int insertEnumStudentWithAPI(Student student) {
		Log.debug("insertEnumStudentWithAPI()");
		return sqlSession.insert(namespace + ".insertEnumStudentWithAPI", student);
	}


	@Override
	public Student selectAllStudentByParam(String name, String email) {
		Log.debug("selectAllStudentByParam()");
		return sqlSession.getMapper(StudentDao.class).selectAllStudentByParam(name, email);
	}


	@Override
	public Student selectAllStudentByStudent(Student student) {
		Log.debug("selectAllStudentByStudent()");
		return sqlSession.selectOne(namespace + ".selectAllStudentByStudent", student);
	}


	@Override
	public Student selectAllStudentByMap(Map<String, String> map) {
		Log.debug("selectAllStudentByMap()");
		return sqlSession.selectOne(namespace + ".selectAllStudentByMap", map);
	}


	@Override
	public Map<Integer, String> selectStudentForMap() {
		Log.debug("selectStudentForMap()");
		Map<Integer, String> map = new HashMap<>();
		ResultHandler<Student> resultHandler = new ResultHandler<Student>() {
			
			@Override
			public void handleResult(ResultContext<? extends Student> resultContext) {
				Student student = resultContext.getResultObject();
				map.put(student.getStudId(), student.getName());
				
			}
		};
		sqlSession.select(namespace + ".selectStudentForMap", resultHandler);
		return map;
	}


	@Override
	public int updateSetStudent(Student student) {
		Log.debug("updateSetStudent()");
		return sqlSession.update(namespace+ ".updateSetStudent", student);
	}

}
