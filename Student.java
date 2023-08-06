public class Student {
    private String dateOfBirth, courseName, studentName, dateOfEnrollement;// initialize instance variable
    private int enrollmentID, courseDuration, tutionFee;

    public Student(String dateOfBirth, String studentName, int courseDuration, int tutionFee)// constructor for Student
                                                                                             // class with parameters.
    {

        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.courseDuration = courseDuration;
        this.tutionFee = tutionFee;
        this.courseName = "";
        this.dateOfEnrollement = "";
        this.enrollmentID = 0;

    }

    // using accessor/get method for all attributes.
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDateOfEnrollement() {
        return dateOfEnrollement;
    }

    public int getEnrollmentID() {
        return enrollmentID;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public int getTutionFee() {
        return tutionFee;
    }

    // use of the mutator/set method for all attributes.
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public void setDateOfEnrollement(String dateOfEnrollement) {
        this.dateOfEnrollement = dateOfEnrollement;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public void setTutionFee(int tutionFee) {
        this.tutionFee = tutionFee;
    }

    public void display()// method to display values
    {
        if (this.dateOfBirth.equals("") || this.studentName.equals("") ||
                this.dateOfEnrollement.equals("") || this.courseDuration == 0 || this.tutionFee == 0 ||
                courseName.equals("") || enrollmentID == 0) {
            System.out.println("ALL THE VALUES ARE NOT ENTERED.");
        } else {

            System.out.println("date of birth=" + dateOfBirth);
            System.out.println("Student Name=" + studentName);
            System.out.println("Date Of enrollement=" + dateOfEnrollement);
            System.out.println("Course Duration=" + courseDuration);
            System.out.println("Tution Fee=" + tutionFee);
            System.out.println("Course Name=" + courseName);
            System.out.println("Enrollment ID=" + enrollmentID);
        }
    }
}
