package kr.or.dgit.mybatis_dev.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Course;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CouserServiceTest {
	private static CourseService courseService;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		courseService = CourseService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		courseService = null;
	}

	/*@Test
	public void test1FindCourseByConditon() {
		GregorianCalendar cal = new GregorianCalendar(2013,1,1);
		Map<String, Object> map = new HashMap<>();
		map.put("tutorId", 1);
		map.put("courseName", "%java%");
		map.put("startDate", cal.getTime());
		
		List<Course> course = courseService.findCoursesByCondition(map);
		Assert.assertNotNull(course);
		
	}*/
	
/*	@Test
	public void test2FindCaseCourse() {
		Map<String, Object> map = new HashMap<>();
		map.put("searchBy", "Tutor");
		map.put("tutorId", 1);
		List<Course> courses = courseService.findCaseCourses(map);
		Assert.assertNotNull(courses);
		
		map.replace("searchBy" , "CourseName");
		map.remove("tutorId");
		map.put("CourseName", "%java%");
		courses = courseService.findCaseCourses(map);
		Assert.assertNotNull(courses);
		
	}*/

	/*@Test
	public void test3FindWhereCourse() {
		Map<String, Object> map = new HashMap<>();
		
		List<Course> courses = courseService.findWhereCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("tutorId", 1);
		courses = courseService.findWhereCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("courseName", "%java%");
		courses = courseService.findWhereCourses(map);
		
		
		map.clear();
		map.put("endDate", new Date());
		courses = courseService.findWhereCourses(map);
		
		
	}*/
	
	/*@Test
	public void test4FindTrimCourse() {
		Map<String, Object> map = new HashMap<>();
		
		List<Course> courses = courseService.findTrimCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("tutorId", 1);
		courses = courseService.findTrimCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("tutorId", 1);
		map.put("courseName", "%java%");
		courses = courseService.findTrimCourses(map);
		Assert.assertNotNull(courses);
	}*/
	
	@Test
	public void test5FindForEachCourse() {
		List<Integer> tutorIds = new ArrayList<>();
		tutorIds.add(1);
		tutorIds.add(2);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tutorIds", tutorIds);
		
		List<Course> courses = courseService.findTrimCourses(map);
		Assert.assertNotNull(courses);
	}
	
}
