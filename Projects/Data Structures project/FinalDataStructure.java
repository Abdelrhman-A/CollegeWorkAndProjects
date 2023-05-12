package finaldatastructure;
import java.util.*;
public class FinalDataStructure {
static Scanner scanner = new Scanner(System.in);
static int numstd, totalnumstd;
public static void main(String[] args) {
    while(true){
    try{
/*A dynamic data structure containing the data of all the students should be defined as a local 
variable inside the “main” function. This array should be sized so it can contain the
data of the students defined in the program according to the new type implemented above. 
Dynamic allocation is used to ensure no waste of space occurs in the memory if needed.*/
  ArrayList<Student_Data> students = new ArrayList();
  Enter_Std_Data(students);
  Print_Alldata(students);
   
    }
    catch(InputMismatchException e) {
        System.out.println("Enter a valid input");
        scanner.nextLine(); 
    }
    break;
}
    }
//Method to take all data from the user OR to read data from the user
 public static void Enter_Std_Data(ArrayList<Student_Data> students){
        while(true){
        try{
       System.out.print("Enter the number of students ");
       numstd = scanner.nextInt();
       totalnumstd=0 ;
       if(totalnumstd == 0){
           totalnumstd += numstd;
           for(int i=1; i <= numstd;i++){
             System.out.println("Enter the data of student number "+i);
             Student_Data student = new Student_Data();
             student.Student_name();// call this method to take first, middle and last name of each student from the user and store these
             student.Student_regsnum();// call this method to make correct student registration number and store it
             student.Student_nationality();// call this method to take student nationality and store it in student nationality linkedlist
             student.SetID();
             student.setAddress();
             student.setMailAddress();
             student.Student_age();// call this method to get and store the day, month, year, of each student.
             student.setGender();
             student.Enrolment_term_year();//call this method to get and store the first enrol term and the first enrol year for each student separetly.
             student.Student_department_of_enrolment();/* call this method to take student department of enrolment 
                                                  and store it in student department of enrolment linkedlist*/
             student.setTutor();
             student.Current_term();/* call this method to take redit hours for a term and credit hours finished for each student
                                               and calculate the current term and the finished term for each student.*/
             student.FundingType();
             student.NumberOfPaymentsDone();
             student.TotalAmountPaid();
             student.details();
             student.SetContacts();
             student.Student_credit_hours();
             student.Student_GPA();/* call this method to get the Overall GPA and individual semester GPAs for each student 
                                                and store it in a specific data strucure.*/
             System.out.println("-------------------------------------------------------------------------------------------");// separetly line
             student.InsertData();
             students.add(student);
        }
            }
        else{
           for(int i=(totalnumstd+1); (i < (numstd+totalnumstd)) ;i++){
              System.out.println("Enter the data of student number "+i);
             Student_Data student = new Student_Data();
             student.Student_name();// call this method to take first, middle and last name of each student from the user and store these
             student.Student_regsnum();// call this method to make correct student registration number and store it
             student.Student_nationality();// call this method to take student nationality and store it in student nationality linkedlist
             student.SetID();
             student.setAddress();
             student.setMailAddress();
             student.Student_age();// call this method to get and store the day, month, year, of each student.
             student.setGender();
             student.Enrolment_term_year();//call this method to get and store the first enrol term and the first enrol year for each student separetly.
             student.Student_department_of_enrolment();/* call this method to take student department of enrolment 
                                                         and store it in student department of enrolment linkedlist*/
             student.setTutor();
             student.Current_term();/* call this method to take redit hours for a term and credit hours finished for each student 
                                               and calculate the current term and the finished term for each student.*/
             student.FundingType();
             student.NumberOfPaymentsDone();
             student.TotalAmountPaid();
             student.details();
             student.SetContacts();
             student.Student_credit_hours();
             student.Student_GPA();/* call this method to get the Overall GPA and individual semester GPAs for each student 
                                                and store it in a specific data strucure.*/
             System.out.println("-------------------------------------------------------------------------------------------");// separetly line
             student.InsertData();
             students.add(student);
        }
    totalnumstd += numstd;
          }
        }
        catch(InputMismatchException e) {
                System.out.println("Enter a valid input");
                scanner.nextLine();
    } break;
       }
        }
 
 //Method to print all data for each student
 public static void Print_Alldata(ArrayList<Student_Data> students){
     Student_Data std = new Student_Data();
     for(int i =0 ;i < students.size();i++){
    Student_Data student  = students.get(i);
    System.out.println("All data for student number "+(i+1)+" :");
    System.out.println("First name: "+student.fsname+"\n"+"Middle name: "+student.mdname+"\n"+"Last name: "+student.ltname);
    System.out.println("Student registration number: "+student.stdreg);
    System.out.println("Student nationality: "+student.stdnation);
    student.getID();
    student.printAddress();
    student.printMailingAddress();
    System.out.println("Date of birth of this student: "+student.Birthday+"/"+student.Birthmonth+"/"+student.Birthyear);
    student.getGender();
    System.out.println("The first term of enrolment: "+student.Enterm+"\n"+"The first year of enrolment: "+student.Enyear);
    System.out.println("Student department of enrolment: "+student.stddepenrol);
    student.printTutor();
    System.out.println("Student current term is: "+student.curtrm);
    student.PrintDetails();
    student.getContacts();
    System.out.println("your current credit hours: "+student.creditcurrent+"\n"+"Remaining credit hours is: "+student.credithremaining);
    System.out.println("The Overall GPA this student had attained: "+student.ovgpa);
    System.out.println("Number of semesters of this student had finished: "+student.numofsmtrsfed);
    System.out.println("The individual semester GPAs of this student: "+Arrays.toString(student.smtrgpa));
    System.out.println("-------------------------------------------------------------------------------------------");
              }
    }
}