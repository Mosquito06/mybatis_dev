package kr.or.dgit.mybatis_dev.service;

import static org.junit.Assert.fail;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


import kr.or.dgit.mybatis_dev.dto.Address;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AddressServiceTest {
	private static AddressService addressService;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		addressService = new AddressService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		addressService = null;
	}

	@Test
	public void test1SelectAddressByAll() {
		RowBounds rowBounds = new RowBounds(0, 3);
		List<Address> list = addressService.findAddressByAll(rowBounds);
		Assert.assertNotNull(list);
	}
	
	@Test
	public void test2SelectAddressByAllWithAPI() {
		RowBounds rowBounds = new RowBounds(2, 1);
		List<Address> list = addressService.findAddressByAllWithAPI(rowBounds);
		Assert.assertNotNull(list);
	}

}
