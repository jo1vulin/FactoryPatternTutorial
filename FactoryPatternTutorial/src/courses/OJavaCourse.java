package courses;


public class OJavaCourse extends AbstractCourse {

	@Override
	public void createCourse( ) {
		this.courseName = "Online java course";
	}

	@Override
	public void createShcedule( ) {
		this.courseDuration = "10 days";
	}

}
