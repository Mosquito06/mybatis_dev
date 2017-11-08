package kr.or.dgit.mybatis_dev.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Address;

public class AddressDaoImpl implements AddressDao {
	private SqlSession sqlSession;

	private static final Log Log = LogFactory.getLog(AddressDao.class);
	private String namespace = "kr.or.dgit.mybatis_dev.dao.AddressDao";

	public AddressDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	
	@Override
	public List<Address> selectAddressByAll(RowBounds rowBounds) {
		Log.debug("selectAddressByAll()");
		return sqlSession.selectList(namespace + ".selectAddressByAll" , null, rowBounds);
	}

	@Override
	public List<Address> selectAddressByAllWithAPI(RowBounds rowBounds) {
		Log.debug("selectAddressByAllWithAPI()");
		return sqlSession.getMapper(AddressDao.class).selectAddressByAllWithAPI(rowBounds);
	}

}
