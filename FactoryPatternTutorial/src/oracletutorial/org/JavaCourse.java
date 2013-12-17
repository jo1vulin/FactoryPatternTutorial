package oracletutorial.org;

public class JavaCourse extends AbstractCourse {

	@Override
	protected void createCourse( ) {
		this.courseName = "Java course";
		
	}

	@Override
	protected void createShcedule( ) {
		this.courseDuration = "10 days";
		
	}

}
