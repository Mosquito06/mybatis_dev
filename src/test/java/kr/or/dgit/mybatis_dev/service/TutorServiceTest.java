package kr.or.dgit.mybatis_dev.service;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Tutor;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TutorServiceTest {
	
	private static TutorService tutorService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		tutorService = TutorService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		tutorService = null;
	}

	@Test
	public void testFindStudent() {
		Tutor tutor = tutorService.findTutorById(1);
		
		Tutor findtutor = new Tutor();
		findtutor.setTutorId(1);
		Tutor tutor2 = tutorService.findTutorByTutorId(findtutor);
		
		Assert.assertEquals(tutor.getTutorId(), tutor2.getTutorId());
	}

}
