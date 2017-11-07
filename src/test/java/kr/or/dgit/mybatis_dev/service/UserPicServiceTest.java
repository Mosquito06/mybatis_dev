package kr.or.dgit.mybatis_dev.service;

import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JFrame;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.UserPic;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserPicServiceTest {
	private static UserPicService userPicService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		userPicService = userPicService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		userPicService = null;
	}

	@Test
	public void test1InertUserPic() {
		UserPic userPic = new UserPic();
		userPic.setName("img");
		userPic.setBio("put some lengthy bio here");
		userPic.setPic(getPicFile());
	
		int result = userPicService.createUserPic(userPic);
		Assert.assertEquals(1, result);
	}

	private byte[] getPicFile() {
		byte[] pic = null;
		File file = new File(System.getProperty("user.dir") + "\\images\\person5.jpg");
		try {
			InputStream is = new FileInputStream(file);
			pic = new byte[is.available()];
			is.read(pic);
			is.close();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return pic;
	}
	
	@Test
	public void test2GetUserPic() {
		UserPic userPic = userPicService.getUserPic(2);
		Assert.assertNotNull(userPic);
	}

}
