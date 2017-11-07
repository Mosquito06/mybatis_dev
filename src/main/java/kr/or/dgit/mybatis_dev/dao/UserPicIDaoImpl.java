package kr.or.dgit.mybatis_dev.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.UserPic;

public class UserPicIDaoImpl implements UserPicDao {
	
	private SqlSession sqlSession;

	private static final Log Log = LogFactory.getLog(UserPicDao.class);
	private String namespace = "kr.or.dgit.mybatis_dev.dao.UserPicDao";

	public UserPicIDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public int insertUserPic(UserPic userPic) {
		Log.debug("insertUserPic()");
		return sqlSession.getMapper(UserPicDao.class).insertUserPic(userPic);
	}

	@Override
	public UserPic getUserPic(int id) {
		Log.debug("getUserPic()");
		return sqlSession.selectOne(namespace + ".getUserPic", id);
	}

}
