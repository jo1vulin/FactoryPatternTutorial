package oracletutorial.org;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		
		AbstractCourse objAbstractCourse = selectCourse("J");
		
		objAbstractCourse.createCourse();
		objAbstractCourse.createShcedule();
		
		System.out.println(objAbstractCourse.courseName);
		System.out.println(objAbstractCourse.courseDuration);

	}

	public static AbstractCourse selectCourse(String strUserInput) {
		AbstractCourse objCourse = null;
		switch (strUserInput) {
		case "N":
			objCourse = new NetCourse();
			break;

		case "J":
			objCourse = new JavaCourse();
			break;

		}
		
		return objCourse;
	}

}
