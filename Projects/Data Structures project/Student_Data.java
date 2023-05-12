package finaldatastructure;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import java.util.ListIterator;
public class Student_Data {
    Scanner B = new Scanner(System.in);//Scannere to take Data from user
    protected String fsname;//to store first name of each student
    protected String mdname;//to store middle name of each student
    protected String ltname;// to store last name of each student
    protected String stdreg;//to store each student registration number
    protected static int year, term, numfaculty,numdept, stdnum, totalnumstd=0;
    protected String stdnation;// to store each student nationality
    protected String stddepenrol;// to store each student department of enrolment
    protected int crhfed, crhtrm;//crhfed refer to credit hours finished. & crhtrm refer to credit hours for a term
    protected int curtrm ;// to store each student current term
    protected double ovgpa;//to store each student Overall GPA
    protected int numofsmtrsfed ;// to store Number of semesters finished for each student
    protected int numstd;//numstd refer to number of student which the user enter it.
    protected Double[] smtrgpa = new Double[10];/*Array of type double and it is size = 10 to store individual semester GPAs for each student
                                              for loop to get and store the  individual semester had finished GPAs.*/
    protected int Enterm ;// to store first enrolment term for each student.
    protected int Enyear;// to store first enrolment year for each student.
    protected int Birthday ;//to store Day of birth for each student.
    protected int Birthmonth ;// to store month of birth for each student.
    protected int Birthyear;// to store year of birth for each student.
    protected int creditcurrent ;// to store current credit hours for each student.
    protected int credithremaining;// to store remaining credit hours for each student.
    protected LinkedList address = new LinkedList();
    protected LinkedList MailAddress = new LinkedList();
    protected LinkedList tutor = new LinkedList();
    protected LinkedList ID = new LinkedList();
    protected LinkedList IDtype = new LinkedList();
    protected long passportID;
    protected long  NationalID;
    protected int type ;
    protected LinkedList GenderType = new LinkedList();
    protected String gender ;
    protected LinkedList info1 = new LinkedList();
    protected String Email ;
    protected String personal , home;
    protected String [] details = new String [6];
    private LinkedList<Comparable> Funding = new LinkedList<Comparable>();
    protected String TypeOfFunding ;
    protected int NumberOfPaymentsDone ;
    
    // 1
// Method to take the student first, middle and last name and store these 
    protected void Student_name(){
      System.out.print("Enter the first name for this student: ");
      fsname = B.next();//Add this student first name in first name
      System.out.print("Enter the middle name for this student: ");
      mdname = B.next();//Add this student middle name in middle name
      System.out.print("Enter the last name for this student: ");
      ltname = B.next();//Add this student last name in last name
        }
    // 2
   //Method to take (year, term, faculty number, department number and student number) to make student registration number     
    protected String Student_regsnum(){
        while (true){
            try{
        System.out.println("Enter the current year of this student");
        year = B.nextInt();
        System.out.println("Enter the current term of this student");
        term = B.nextInt();
        System.out.println("Enter the number representing the faculty of this student");
        numfaculty = B.nextInt();
        System.out.println("Enter the number representing the department of this student");
        numdept = B.nextInt();
        System.out.println("Enter the Student number");
        stdnum = B.nextInt();
        // (from line 70 to line 94) logice to make correct student registration number
        if(stdnum < 10 && numdept < 10)
            stdreg = (year+""+term+""+numfaculty+"0"+numdept+"000"+""+stdnum);/*Add this student student registration number in 
                                                                                 student registration */
        else if(stdnum < 10 && numdept > 10)
            stdreg = (year+""+term+""+numfaculty+""+numdept+"000"+""+stdnum);
           
        else if(stdnum < 100 && stdnum >= 10 && numdept < 10)
            stdreg = (year+""+term+""+numfaculty+"0"+numdept+"00"+""+stdnum);
            
        else if(stdnum < 100 && stdnum >= 10 && numdept > 10)
            stdreg = (year+""+term+""+numfaculty+""+numdept+"00"+""+stdnum);
            
        else if(stdnum < 1000 && stdnum >= 100 && numdept < 10)
            stdreg = (year+""+term+""+numfaculty+""+"0"+numdept+"0"+""+stdnum);
            
        else if(stdnum < 1000 && stdnum >= 100 && numdept > 10)
            stdreg = (year+""+term+""+numfaculty+""+numdept+"0"+""+stdnum);
            
        else if(stdnum < 10000 && stdnum >= 1000 && numdept < 10)
            stdreg = (year+""+term+""+numfaculty+""+"0"+numdept+""+stdnum);
            
        else if(stdnum < 10000 && stdnum >= 1000 && numdept > 10)
            stdreg = (year+""+term+""+numfaculty+""+numdept+""+stdnum);
            return stdreg; //return tudent registration number
        }catch(InputMismatchException e) {
                System.out.println("Enter a valid input");
                B.nextLine();
        }
    }
    }
    // 3
    //Method to save the student nationality
    protected void Student_nationality(){
        System.out.print("Enter the student nationality: ");
        stdnation = B.next();//to store the student's nationality
        }
    //4
    public void SetID ()  {
        do {
            try {
                System.out.println("Enter ur id type");
                System.out.println("national id press *1*");
                System.out.println("passport press *2*");
                type = B.nextInt();
            } catch(InputMismatchException ex) {
                System.out.println("please enter a valid number");
                B.nextLine();
            }
            switch(type)                                         // this switch statement is used to make the student choose his ip type(national ID/passport)
            {
                case 1 :
                    try {
                        IDtype.add("National ID");
                        System.out.println("Enter ur national  ID ");
                        NationalID = B.nextLong();
                        ID.add(NationalID);
                    }
                    catch(InputMismatchException ex) {
                        System.out.println("please enter a valid number");
                        B.nextLine();
                    }
                    break;
                case 2:
                    while (true) {
                        try {
                            System.out.println("Enter ur passport ID");
                            passportID = B.nextLong();
                            ID.add(passportID);
                            IDtype.add("passport");
                            break;
                        } catch(InputMismatchException ex) {
                            System.out.println("please enter a valid number");
                            B.nextLine();
                        }
                    }
                    break;
                default :
                    System.out.println("Sorry, please enter a valid number ");
                    break;
            }
        } while (type !=1 && type !=2);
        System.out.println("thx ur info are saved ");
    }                               //this method is used to set the student's id
    public void getID (){
        ListIterator iter = IDtype.listIterator(0);           //list iterator to print the ID type linked list by using
        System.out.println("your id type is : "+iter.next());                  // next() method
        ListIterator get = ID.listIterator(0);           //list iterator to print the ID linked list by using
        System.out.println("your id is : "+get.next());                  // next() method
    }
    //5
    public void setAddress() {                                       //5
        Scanner in = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Enter the Flat number: ");                        //This method will take the address from the student and
                address.add(B.nextInt());                                            //put it in the linked list
                System.out.println("Enter the House number: ");
                address.add(B.nextInt());
                System.out.println("Enter the Street name: ");
                address.add(B.next());
                System.out.println("Enter the City name: ");
                address.add(B.next());
                System.out.println("Enter the Governorate name: ");
                address.add(B.next());
                System.out.println("Enter the Country: ");
                address.add(B.next());
                System.out.println("Enter the Postal code: ");
                address.add(B.nextInt());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid data type");
                B.nextLine();
            }
        }
    }
    public void printAddress() {
        ListIterator iter = address.listIterator(0);           //list iterator to print each element in the address linked list by using
        System.out.println("The address is: ");                     // next() method
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
            }
            System.out.println(" ");
        }
    public LinkedList getAddress() {
        return address;
    } //this method is used to return the student's address
    //6
    public void setMailAddress() {
        System.out.println("Enter (1) to make your address the same as your Mailing address if not press (2) to enter a new one: ");
        switch (B.nextInt()) {
            case 1:
                this.MailAddress=getAddress();     //in this case the mailing address is the same as the student's address
                break;
            case 2:
                while (true) {
                    try {
                        System.out.println("Enter the Flat number: ");                        //in this case the mailing address is taken from the student and
                        MailAddress.add(B.nextInt());                                        //put it in the linked list
                        System.out.println("Enter the House number: ");
                        MailAddress.add(B.nextInt());
                        System.out.println("Enter the Street name: ");
                        MailAddress.add(B.next());
                        System.out.println("Enter the City name: ");
                        MailAddress.add(B.next());
                        System.out.println("Enter the Governorate name: ");
                        MailAddress.add(B.next());
                        System.out.println("Enter the Country: ");
                        MailAddress.add(B.next());
                        System.out.println("Enter the Postal code: ");
                        MailAddress.add(B.nextInt());
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid input");
                        B.nextLine();
                    }
        } break;
    }
    }
    public void printMailingAddress() {
        ListIterator iter = MailAddress.listIterator(0);           //list iterator to print each element in the mailing address linked list by using
        System.out.println("The mailing address is: ");                  // next() method
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println("");
    }
    // 7 
     //Method to get and store the day, month, year, of each student 
     public void Student_age(){
      int  birthd,birthm,birthy;
      while (true){
          try{
      System.out.println("Enter the day of birth of this student");
      birthd = B.nextInt();
      System.out.println("Enter the month of this student birth");
      birthm = B.nextInt();
      System.out.println("Enter the year of this student birth");
      birthy = B.nextInt();
      // check specific conditions
      if (birthd>=1 && birthd<=31 && birthm>=1 && birthm<=12 && birthy>=1980 && birthy<=2022){
      Birthday = birthd ;
      Birthmonth = birthm ;
      Birthyear = birthy ;
      }
      else{
          System.out.println("Please enter valid input");
          Student_age();
     }
      }catch(InputMismatchException e) {
                System.out.println("Enter a valid input");
                B.nextLine();
                continue;
      }
          break;
      }
     }//end of the method called Student_age();
      //8
    public  void setGender() {                                   // this method is used to set the student's gender
        String male = "male";
        String female = "female";
        do {
            System.out.println("Enter ur gender  female or male ");
            gender = B.next();
            switch(gender)
            {
                case "male":
                    GenderType.add("male");
                    break;
                case "female":
                    GenderType.add("female");
                    break;
                default :
                    System.out.println("Sorry, please enter a valid gender ");
                    break;
            }
        } while (gender.equals(male) == false && gender.equals(female) == false );
        System.out.println("thx ur info was saved");
    }
    public  void getGender (){                                        //this method is used to print the student's gender
        ListIterator iter = GenderType.listIterator(0);
        System.out.println("your type is : "+iter.next());
    }
  // 9
  //Method to get and store the first enrol term and the first enrol year for each student separetly.
     public void Enrolment_term_year(){
         while(true){
             try{
         System.out.println("Please enter the first enrol term of this student");
         Enterm = B.nextInt();
          System.out.println("Please enter the first enrol year of this student");
         Enyear = B.nextInt();     
     }catch(InputMismatchException e) {
                System.out.println("Enter a valid input");
                B.nextLine();
                continue;
         } break;
     } 
     }
    // 10
    //Method to take student tudent_department_of_enrolment and store it
    protected void Student_department_of_enrolment(){
        while(true){
            try{
        System.out.println("Enter the student department of enrolment: ");
        System.out.println("Please do not leave spaces between words, but separate each word with this letter _");
        stddepenrol = B.next();//store it in student department of enrolment 
        }catch(InputMismatchException e) {
                System.out.println("Enter a valid input");
                B.nextLine();
                continue;
        } break;
    }
    }
    //11
    public void setTutor() {
        Scanner sc=new Scanner(System.in);
        while (true) {                                            // this method to enter the tutor name and his code
            try {
                System.out.println("Enter the tutor's name: ");
                tutor.add(sc.nextLine());
                System.out.println("Enter the tutor's code: ");
                tutor.add(B.next());
                break;
            } catch (InputMismatchException e){
                e.printStackTrace();
                B.nextLine();
            }
        }
        }
    public void printTutor() {                                     // this method to print the tutor's add
        ListIterator iter = tutor.listIterator(0);
        System.out.println("The tutor is: ");
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println("");
    }
    // 12
//Method to take redit hours for a term and credit hours finished for each student and calculate the current term and the finished term for each student.
    protected void Current_term(){
        while(true){
            try{
        System.out.print("Please enter the credit hours for one term in your faculty: ");
        crhtrm = B.nextInt();
        System.out.print("Enter the credit hours finished of this student to calculate the current term for this student: ");
        crhfed = B.nextInt();
        // from line 357 to line 386 it is the logic to calculate a correct current term for each student.
        if(crhfed >= 0 && crhfed <= (crhtrm*14)){
            if(crhfed == 0 || crhfed < crhtrm)
                curtrm = 1;
            else if(crhfed == crhtrm || crhfed < (crhtrm*2))
               curtrm = 2;
            else if(crhfed == (crhtrm*2) || crhfed < (crhtrm*3))
               curtrm = 3;
            else if(crhfed == (crhtrm*3) || crhfed < (crhtrm*4))
              curtrm = 4;
            else if(crhfed == (crhtrm*4) || crhfed < (crhtrm*5))
              curtrm = 5;
            else if(crhfed == (crhtrm*5) || crhfed < (crhtrm*6))
               curtrm = 6;
            else if(crhfed == (crhtrm*6) || crhfed < (crhtrm*7))
              curtrm = 7;
            else if(crhfed == (crhtrm*7) || crhfed < (crhtrm*8))
               curtrm = 8;
            else if(crhfed == (crhtrm*8) || crhfed < (crhtrm*9))
               curtrm = 9;
            else if(crhfed == (crhtrm*9) || crhfed < (crhtrm*10))
               curtrm = 10;
            else if(crhfed == (crhtrm*10) || crhfed < (crhtrm*11))
              curtrm = 11;
            else if(crhfed == (crhtrm*11) || crhfed < (crhtrm*12))
               curtrm = 12;
            else if(crhfed == (crhtrm*12) || crhfed < (crhtrm*13))
               curtrm = 13;
            else if(crhfed == (crhtrm*13) || crhfed <= (crhtrm*14))
               curtrm = 14;
                    } 
        // if any error will occure we make the following else statement
        else
            curtrm = -110;
        }
            catch(Exception e) {
                System.out.println("Enter a valid input");
                B.nextLine();
                continue;
        } break;
        }
    }//end of Current_Finished_term() mehod;
    //13
    public  void FundingType() {
    String self_funded = "self";
    String grant_funded = "grant";
    do {
        System.out.println("Enter Type of funding (self or grant)");
        TypeOfFunding = B.next();
        switch(TypeOfFunding)
        {
            case "self":
                Funding.add("self");
                break;
            case "grant":
                Funding.add("grant");
                break;
            default :
                System.out.println("Sorry, please enter a valid Type  ");
                break;
        }
    } while (TypeOfFunding.equals(self_funded) == false && TypeOfFunding.equals(grant_funded) == false );
    System.out.println("thx ur info was saved");
}
    public void NumberOfPaymentsDone() {
        while(true){
            try {
                System.out.println("Number Of Payments Done");
                NumberOfPaymentsDone=B.nextInt();
                Funding.add(NumberOfPaymentsDone);
                break;
            }
            catch (InputMismatchException ex)
            {
                System.out.println("invalid number ");
                B.nextLine();
            }
        }
    }
    public void TotalAmountPaid() {
        try {
            System.out.println("Enter Total amount paid so far");
            Funding.add(B.nextInt());
        }catch (InputMismatchException ex) {
            System.out.println("invalid number ");
            B.nextLine();
        }
    }
    public void details() {
        System.out.println("Enter Amount paid");
        details[0]=B.next();
        System.out.println("Enter transaction number");
        details[1]=B.next();
        System.out.println("Bank of transactions");
        details[2]=B.next();
        System.out.println("Day of transactions");
        details[3]=B.next();
        System.out.println("Month of transactions");
        details[4]=B.next();
        System.out.println("Year of transactions");
        details[5]=B.next();
    }
    
    public String PrintDetails() {
        System.out.println("Amount paid "+details[0]
                + "transactions number "+details[1]+" Bank of transaction "+details[2]+
                " Day of transaction "+details[3]+" month of transaction "+
                details[4]+" year of transaction "+details[5]);
        return "";
    }
    //14
   //this method is used to take the student's contacts
    public  void SetContacts () {                                
        boolean continueInput = true ;
        Email = stdreg + "@alexu.edu.eg" ;
        info1.add(Email);
        do {
            try {
                System.out.println("Please enter ur personal phone number ");
                personal = B.next();
                info1.add(personal);
                continueInput = false ;
            } catch (InputMismatchException ex)  {
                System.out.println("invalid input  ");
                B.nextLine();
                info1.add(personal);
            }
        }while (continueInput);
        continueInput = true;
        do {
            try {
                System.out.println("Please enter ur home phone number ");
                home = B.next();
                info1.add(home);
                continueInput = false ;
            } 
            catch (InputMismatchException ex)  {
                System.out.println("invalid input  ");
                B.nextLine();
                info1.add(home);
            }
        }while (continueInput);
        System.out.println("thx ur info are saved");
    }
    //list iterator to print each element info1 linked list by using next() method
    public void getContacts (){
        ListIterator iter = info1.listIterator(0);           
        System.out.println("your e-mail : "+iter.next());                  
        ListIterator get = info1.listIterator(1);           //list iterator to print each element in the mailing address linked list by using
        while(get.hasNext()) {
            System.out.println("your contacts are : "+get.next());                  // next() method
        }
    }
    // 15
    // Method to 
    protected int Student_credit_hours() {
     int maxhours, remaininghours= 0, currenthours=0;
     while(!false){
         try{
     System.out.println("Please enter the maximum required for the degree");
     maxhours = B.nextInt();
     System.out.println("Please enter your current credit hours");
     currenthours =  B.nextInt();
     creditcurrent = currenthours;
     remaininghours= maxhours- crhfed -currenthours;
     credithremaining = remaininghours;
     }catch(InputMismatchException e) {
                System.out.println("Enter a valid input");
                B.nextLine();
                continue;
     } 
         break;
     }
     return remaininghours;
    }
    
// 16    
//Method to get the Overall GPA and individual semester GPAs for each student and store it in a specific data strucure.
    protected void Student_GPA(){
        while (!false){
            try{
                //get the Overall GPA and store it
        System.out.println("Please enter the Overall GPA this student had attained");
        ovgpa = B.nextDouble();
            // from line 541 to line 575 it is the logic to calculate a correct Number of semesters finished for each student.
        if(crhfed >= 0 && crhfed <= (crhtrm*14)){
            if(crhfed == 0 )
                numofsmtrsfed = 0;
            else if(crhfed > 0 && crhfed <= crhtrm)
              numofsmtrsfed = 1;
            else if(crhfed > crhtrm && crhfed <= (crhtrm*2))
               numofsmtrsfed = 2;
            else if(crhfed > (crhtrm*2) && crhfed <= (crhtrm*3))
               numofsmtrsfed = 3;
            else if(crhfed > (crhtrm*3) && crhfed <= (crhtrm*4))
               numofsmtrsfed = 4;
            else if(crhfed > (crhtrm*4) && crhfed <= (crhtrm*5))
               numofsmtrsfed = 5;
            else if(crhfed > (crhtrm*5) && crhfed <= (crhtrm*6))
               numofsmtrsfed = 6;
            else if(crhfed > (crhtrm*6) && crhfed <= (crhtrm*7))
              numofsmtrsfed = 7;
            else if(crhfed > (crhtrm*7) && crhfed <= (crhtrm*8))
               numofsmtrsfed = 8;
            else if(crhfed > (crhtrm*8) && crhfed <= (crhtrm*9))
               numofsmtrsfed = 9;
            else if(crhfed > (crhtrm*9) && crhfed <= (crhtrm*10))
               numofsmtrsfed = 10;
            else if(crhfed > (crhtrm*10) && crhfed <= (crhtrm*11))
              numofsmtrsfed = 11;
            else if(crhfed > (crhtrm*11) && crhfed <= (crhtrm*12))
               numofsmtrsfed = 12;
            else if(crhfed > (crhtrm*12) && crhfed <= (crhtrm*13))
               numofsmtrsfed = 13;
            else if(crhfed > (crhtrm*13) && crhfed <= (crhtrm*14))
             numofsmtrsfed = 14;
        }
        else
            numofsmtrsfed = -777;
         //get the individual semester GPAs and store these.
         System.out.println("Please enter the individual semester GPAs of this student");
         for(int i=0; i < numofsmtrsfed && i < smtrgpa.length; i++){
                 smtrgpa[i] = B.nextDouble();
        } 
        //indsmtrgpa.add(smtrgpa);//store all individual semester had finished GPAs for this student, pevious and following student.
        }
            catch(InputMismatchException e) {
                System.out.println("Enter a valid input");
                B.nextLine();
                continue;
    } break;
        }
    }// end the method which called Student_GPA();
    public void InsertData(){ //this method is used to connect us to the database and insert the student's data in it
        Connection conn;
        PreparedStatement insert;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost/prj","root","5737643a");
            insert= conn.prepareStatement("insert into students(FirstName,MiddleName,LastName,gender,ID,address,MailingAddress,Email,OverallGPA,s1GPA,s2GPA,s3GPA,s4GPA,s5GPA,s6GPA,s7GPA,s8GPA,s9GPA,s10GPA)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            insert.setString(1,this.fsname);
            insert.setString(2,this.mdname);
            insert.setString(3,this.ltname);
            insert.setString(4,this.gender);
            insert.setString(5,String.valueOf(this.stdreg));
            insert.setString(6, String.valueOf(this.address));
            insert.setString(7, String.valueOf(this.MailAddress));
            insert.setString(8,this.Email);
            insert.setString(9, String.valueOf(this.ovgpa));
            insert.setString(10, String.valueOf(this.smtrgpa[0]));
            insert.setString(11, String.valueOf(this.smtrgpa[1]));
            insert.setString(12, String.valueOf(this.smtrgpa[2]));
            insert.setString(13, String.valueOf(this.smtrgpa[3]));
            insert.setString(14, String.valueOf(this.smtrgpa[4]));
            insert.setString(15, String.valueOf(this.smtrgpa[5]));
            insert.setString(16, String.valueOf(this.smtrgpa[6]));
            insert.setString(17, String.valueOf(this.smtrgpa[7]));
            insert.setString(18, String.valueOf(this.smtrgpa[8]));
            insert.setString(19, String.valueOf(this.smtrgpa[9]));


            insert.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
   }// end of Student_Data class