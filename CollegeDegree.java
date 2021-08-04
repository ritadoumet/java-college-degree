public class CollegeDegree {

	private String major;
	private int numberOfCourses;
	private String[] courseNameArray;
	private int[] courseCreditArray;
	
	private static int maximumNumberOfCourses = 40;
	
	public CollegeDegree() {
		this.major = "";
		this.numberOfCourses = 0;
		this.courseNameArray = new String[maximumNumberOfCourses];
		this.courseCreditArray = new int[maximumNumberOfCourses];
	}
	
	public void setMajor(String newMajor) {
		this.major = newMajor;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public void addCourse(String courseName, int numberOfCredits) {
		if (numberOfCredits>=1 && numberOfCredits<=5 && numberOfCourses<this.courseNameArray.length) {
			courseNameArray[numberOfCourses]=courseName;
			courseCreditArray[numberOfCourses]=numberOfCredits;
			numberOfCourses++;
		}
	}
	
	public String getCourses() {
		String courses="";
		for (int i = 0; i<numberOfCourses; i++) {
			courses+=courseNameArray[i] + " ";
		}
		return courses;
	}
	
	public int getNumberOfCourses() {
		return this.numberOfCourses;
	}
	
	public int getTotalNumberOfCredits() {
		int sum = 0;
		for (int i = 0; i<numberOfCourses; i++) {
			sum+= courseCreditArray[i];
		}
		return sum;
	}
	
	public static void increaseMaximumNumberOfCourses(int nexMaximumNumberOfCourses) {
		if (nexMaximumNumberOfCourses>maximumNumberOfCourses) {
			maximumNumberOfCourses = nexMaximumNumberOfCourses;
		}
	}
	
	public static int getMaximumNumberOfCourses() {
		return maximumNumberOfCourses;
	}
}
