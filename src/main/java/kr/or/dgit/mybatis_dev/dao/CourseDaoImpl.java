package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Course;

public class CourseDaoImpl implements CourseDao {
private SqlSession sqlSession;
	
	private static final Log Log = LogFactory.getLog(CourseDao.class);
	private String namespace="kr.or.dgit.mybatis_dev.dao.CourseDao" ;
	
	
	public CourseDaoImpl(SqlSession slqSession) {
		this.sqlSession = slqSession;
	}
	
	
	@Override
	public List<Course> selectCoursesByCondition(Map<String, Object> map) {
		Log.debug("selectCoursesByCondition()");
		return sqlSession.selectList(namespace + ".selectCoursesByCondition", map);
	}


	@Override
	public List<Course> selectCaseCourses(Map<String, Object> map) {
		Log.debug("selectCaseCourses()");
		return sqlSession.selectList(namespace + ".selectCaseCourses", map);
	}


	@Override
	public List<Course> selectWhereCourses(Map<String, Object> map) {
		Log.debug("selectWhereCourses()");
		return sqlSession.selectList(namespace + ".selectWhereCourses", map);
	}


	@Override
	public List<Course> selectTrimCourses(Map<String, Object> map) {
		Log.debug("selectTrimCourses()");
		return sqlSession.selectList(namespace + ".selectTrimCourses", map);
	}


	@Override
	public List<Course> selectCoursesForeachByTutors(Map<String, Object> map) {
		Log.debug("selectCoursesForeachByTutors()");
		return sqlSession.selectList(namespace + ".selectCoursesForeachByTutors", map);
	}

}
