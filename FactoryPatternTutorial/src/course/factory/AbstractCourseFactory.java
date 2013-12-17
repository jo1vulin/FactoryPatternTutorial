package course.factory;

import courses.AbstractCourse;

public abstract class AbstractCourseFactory {

	public AbstractCourse createCourse(String scheduleType) {
		AbstractCourse objCourse = this.getCourse(scheduleType);
		objCourse.createCourse();
		objCourse.createShcedule();
		return objCourse;
	}

	public abstract AbstractCourse getCourse(String scheduleType);

}
