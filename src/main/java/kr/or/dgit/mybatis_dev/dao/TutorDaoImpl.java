package kr.or.dgit.mybatis_dev.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Tutor;

public class TutorDaoImpl implements TutorDao {

	private SqlSession sqlSession;

	private static final Log Log = LogFactory.getLog(TutorDao.class);
	private String namespace = "kr.or.dgit.mybatis_dev.dao.TutorDao";

	public TutorDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public Tutor selectTutorById(int tutorId) {
		Log.debug("selectTutorById()");
		return sqlSession.selectOne(namespace + ".selectTutorById", tutorId);
	}

	@Override
	public Tutor selectTutorByTutorId(Tutor tutor) {
		return sqlSession.getMapper(TutorDao.class).selectTutorByTutorId(tutor);
	}

}
