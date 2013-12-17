package course.factory;

import courses.AbstractCourse;
import courses.CJavaCourse;
import courses.CNetCourse;

public class CorporateCourseFactory extends AbstractCourseFactory {

	@Override
	public AbstractCourse getCourse(String scheduleType) {

		switch (scheduleType) {
		case "N":
			return new CNetCourse();
		case "J":
			return new CJavaCourse();
		default:
			return null;
		}
	}
}
