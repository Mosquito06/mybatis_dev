package kr.or.dgit.mybatis_dev.service;

import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestStudentService {
	private static StudentService StudentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		StudentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		StudentService = null;
	}

	/*@Test
	public void test1FindStudentByNo() {
		Student std = new Student(); 
		std.setStudId(1);
		Student findeStudent = StudentService.findStudentByNo(std);
		Assert.assertEquals(std.getStudId(), findeStudent.getStudId());
	}
	
	@Test
	public void test2FindStudentByAll() {
		List<Student> findeStudent = StudentService.findStudentByAll();
		Assert.assertNotNull(findeStudent);
	}
	
	@Test
	public void test3FindStudentByNoWithAPI() {
		Student std = new Student(); 
		std.setStudId(1);
		Student findeStudent = StudentService.findStudentByNoWithAPI(std);
		Assert.assertEquals(std.getStudId(), findeStudent.getStudId());
	}
	
	@Test
	public void test4FindStudentByAllWithAPI() {
		List<Student> findeStudent = StudentService.findStudentByAllWithAPI();
		Assert.assertNotNull(findeStudent);
	}*/
	
	/*@Test
	public void test5InsertStudent() {
		Student std = new Student(); 
		std.setStudId(3);
		std.setName("mosquito");
		std.setEmail("mosquito@naver.com");
		std.setPhone(new PhoneNumber("000-0000-0000"));
		std.setDob(new Date());
		int res = StudentService.insertStudent(std);
		Assert.assertEquals(1, res);
}
	
	@Test
	public void test6InsertStudentWithAPI() {
		Student std = new Student(); 
		std.setStudId(4);
		std.setName("mosquito");
		std.setEmail("mosquito@naver.com");
		std.setPhone(new PhoneNumber("000-0000-0000"));
		std.setDob(new Date());
		int res = StudentService.insertStudentWithAPI(std);
		Assert.assertEquals(1, res);
	}*/
	
	/*@Test
	public void test7InsertStudentAutoInc() {
		Student std = new Student(); 
		
		std.setName("mosquito");
		std.setEmail("mosquito@naver.com");
		std.setPhone(new PhoneNumber("000-0000-0000"));
		std.setDob(new Date());
		int res = StudentService.insertStudentAutoInc(std);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test8UpdateStudent() {
		Student std = new Student(); 
		std.setStudId(3);
		std.setName("mosquito");
		std.setEmail("mosquito@naver.com");
		std.setPhone(new PhoneNumber("000-1111-2222"));
		std.setDob(new Date());
		int res = StudentService.updateStudent(std);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test9UpdateStudentWithAPI() {
		Student std = new Student(); 
		std.setStudId(3);
		std.setName("mosquito");
		std.setEmail("mosquito@naver.com");
		std.setPhone(new PhoneNumber("000-1111-5555"));
		std.setDob(new Date());
		int res = StudentService.updateStudentWithAPI(std);
		Assert.assertEquals(1, res);
	}*/
	
	/*@Test
	public void test10DeleteStudent() {
		int id = 4;
		int res = StudentService.deleteStudent(id);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test11DeleteStudentWithAPI() {
		int id = 5;
		int res = StudentService.deleteStudentWithAPI(id);
		Assert.assertEquals(1, res);
	}*/

	@Test
	public void test12SelectStudentByAllForResultMap() {
		List<Student> lists = StudentService.findStudentByAllForResultMap();
		List<Student> listsAPI = StudentService.findStudentByAllForResultMapWithAPI();
		Assert.assertEquals(lists.size(), listsAPI.size());
	}
	
	@Test
	public void test13SelectStudentByAllForHashMap() {
		List<Map<String, Object>> lists = StudentService.findStudentByAllForHashMap();
		List<Map<String, Object>> listsAPI = StudentService.findStudentByAllForHashMapWithAPI();
		Assert.assertEquals(lists.size(), listsAPI.size());
	}
	
	@Test
	public void test14SelectStudentByNoForResultMapExtends() {
		Student std1 = new Student();
		std1.setStudId(1);
		
		Student std2 = new Student();
		std2.setStudId(1);
		
		Student fstd1 = StudentService.findStudentByNoForResultMapExtends(std1);
		Student fstd2 = StudentService.findStudentByNoForResultMapExtendsWithAPI(std1);
		Assert.assertEquals(fstd1.getStudId(), fstd2.getStudId());
	}

}
