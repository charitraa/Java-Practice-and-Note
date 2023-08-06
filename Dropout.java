
public class Dropout extends Student {// instance variable
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;

    public Dropout(int enrollmentID, String dateOfBirth, String courseName, String studentName,
            String dateOfEnrollement, int tutionFee, int courseDuration, int numOfRemainingModules,
            String dateOfDropout,
            int numOfMonthsAttended) {
        super(dateOfBirth, studentName, courseDuration, tutionFee);// calling attribute from super class Student using
                                                                   // super.
        super.setEnrollmentID(enrollmentID);
        super.setCourseName(courseName);
        super.setDateOfEnrollement(dateOfEnrollement);
        this.numOfRemainingModules = numOfRemainingModules;// to initialize instance variable
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.hasPaid = false;
        this.remainingAmount = 0;
    }

    // using accesor/get method to get the attribute value fro, super class
    public String getDateOfDropout() {
        return dateOfDropout;
    }

    public int getNumOfRemainingModules() {
        return numOfRemainingModules;
    }

    public int getNumOfMonthsAttended() {
        return numOfMonthsAttended;
    }

    public int getRemainingAmount() {
        return remainingAmount;
    }

    public boolean getHasPaid() {
        return hasPaid;
    }

    public void billsPayable()// to calculate the value of remainingAmount
    {
        this.remainingAmount = (super.getCourseDuration() - this.numOfMonthsAttended) * super.getTutionFee();
        hasPaid = true;
        System.out.println("Bill has been paid");
    }

    public void removeStudent()// To remove all the value of data if has Paid is true
    {
        if (hasPaid == true) {
            super.setDateOfBirth("");
            super.setCourseName("");
            super.setStudentName("");
            super.setDateOfEnrollement("");
            super.setCourseDuration(0);
            super.setTutionFee(0);
            this.dateOfDropout = ("");
            super.setEnrollmentID(0);
            this.numOfRemainingModules = 0;
            this.numOfMonthsAttended = 0;
            this.remainingAmount = 0;
            System.out.println("Student has been removed");
        } else {
            System.out.println("All bills are not cleared");
        }
    }

    public void display() {
        super.display();// To call the method of the student class
        System.out.println("numberOfRemainingModules=" + numOfRemainingModules);
        System.out.println("numberOfMonthsAttended =" + numOfMonthsAttended);
        System.out.println("dateOfDropout=" + dateOfDropout);
        System.out.println("Remaining amount=" + remainingAmount);

    }
}
