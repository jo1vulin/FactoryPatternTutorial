package oracletutorial.org;

import course.factory.AbstractCourseFactory;
import course.factory.OnlineCourseFactory;
import courses.AbstractCourse;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Test");
		
		AbstractCourseFactory objFactory = new OnlineCourseFactory();
		AbstractCourse objCourse = objFactory.createCourse("J");
		AbstractCourse objCourseNet = objFactory.createCourse("N");

		
		System.out.println(objCourse.courseName);
		System.out.println(objCourse.courseDuration);
		
		System.out.println(objCourseNet.courseName);
		System.out.println(objCourseNet.courseDuration);

	}

	

}
