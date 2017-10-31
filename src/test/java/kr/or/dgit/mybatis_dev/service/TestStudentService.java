package kr.or.dgit.mybatis_dev.service;

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

	@Test
	public void testFindStudentByNo() {
		Student std = new Student(); 
		std.setStudId(1);
		Student findeStudent = StudentService.findStudentByNo(std);
		Assert.assertEquals(std.getStudId(), findeStudent.getStudId());
	}

}
