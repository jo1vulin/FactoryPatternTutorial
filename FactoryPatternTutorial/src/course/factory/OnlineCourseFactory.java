package course.factory;

import courses.AbstractCourse;
import courses.OJavaCourse;
import courses.ONetCourse;

public class OnlineCourseFactory extends AbstractCourseFactory {

	@Override
	public AbstractCourse getCourse(String scheduleType) {

		switch (scheduleType) {
		case "N":
			return new ONetCourse();
		case "J":
			return new OJavaCourse();
		default:
			return null;
		}
	}

}
