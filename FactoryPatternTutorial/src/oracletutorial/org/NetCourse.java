package oracletutorial.org;

public class NetCourse extends AbstractCourse{

	@Override
	protected void createCourse( ) {
		this.courseName = ".Net course";
		
	}

	@Override
	protected void createShcedule( ) {
		this.courseDuration = "15 days";
		
	}

	
}
