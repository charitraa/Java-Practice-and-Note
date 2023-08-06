
public class Regular extends Student
{
// instance variable
  private int numOfModules;
  private int numOfCreditHours;
  private double daysPresent;
  private boolean isGrantedScholarship;
  
  public Regular (String dateOfBirth,String studentName, int courseDuration, int tutionFee,String courseName,String dateOfEnrollement,int enrollmentID, int numOfModules,int numOfCreditHours,double daysPresent)
  {
      super(dateOfBirth,studentName, courseDuration,tutionFee);//calling instance variable from student class using super keywords.
      super.setEnrollmentID(enrollmentID);
      super.setCourseName(courseName);
      super.setDateOfEnrollement(dateOfEnrollement);
      this.numOfModules=numOfModules;//initializing instance variable
      this.numOfCreditHours=numOfCreditHours;
      this.daysPresent=daysPresent;
      this.isGrantedScholarship=false;
  }
  //using of the accesor/set method for given attributes.
    public int getNumOfModules()
    {
        return numOfModules;
    }
    
    public int getNumOfCreditHours()
    {
        return numOfCreditHours;
    }
    
    public double getDaysPresent()
    {
        return daysPresent;
    }
    
    public boolean getIsGrantedScholarship()
    {
         return isGrantedScholarship;
    }
    
    public String presentPercentage(int daysPresent){ //method presentPercentage to calculate the grade of the student
        double inDays = getCourseDuration() * 30.0;
        double per = (daysPresent / inDays) * 100.0;
        String grade;

        if (daysPresent > getCourseDuration() * 30) {
          
            System.out.println("number of days present is less than course duration.");
        }

        if (per >= 80) {
            grade = "A";
            this.isGrantedScholarship = true;
        } else if (per >= 60) {
            grade = "B";
        } else if (per >= 40) {
            grade = "C";
        } else if (per >= 20) {
            grade = "D";
        } else {
            grade = "E";
        }
        return grade;
    }




    
 public void grantCertificate(String courseName,int enrollmentID, String dateOfEnrollement)
    {
    System.out.println("Congratulation! for your graduation,enrollmentID=" +enrollmentID +"from the course " + courseName + "which was enrolled on date " + dateOfEnrollement);
    if(isGrantedScholarship==true)
    {
        System.out.println("The scholarship has been granted");
    }
}


public void display()
{
    super.display();//To call the method of the student class
    System.out.println("numOfModules="+numOfModules);
    System.out.println("numOfCreditHours="+numOfCreditHours);
    System.out.println("daysPresent="+daysPresent);
}
}
    

