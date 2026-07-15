import java.util.Scanner;

class Marks{
    int total;
    float avg;
    char grade;

//Using methods
public void Results(int m1, int m2, int m3, int m4, int m5){
// total marks
    this.total = m1+m2+m3+m4+m5;
//Average
    this.avg = this.total/5.0f;
//Grade
if(this.total>=400)
    this.grade='A';
else if(this.total>=300)
    this.grade='B';
else if(this.total>=200)
    this.grade='C';
else 
    this.grade='D';
}

//Using Constructor
public void show(){
    System.out.println("Toatl_marks = " + this.total);
    System.out.println("Average = " + this.avg);
    System.out.println("Grade = " + this.grade);
}
}

public class Calculator {
    public static void main(String[] args) {
    // Getting input from the user
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter mark1:");
        int m1=obj.nextInt();
        System.out.println("Enter mark2:");
        int m2=obj.nextInt();
        System.out.println("Enter mark3:");
        int m3=obj.nextInt();
        System.out.println("Enter mark4:");
        int m4=obj.nextInt();
        System.out.println("Enter mark5:");
        int m5=obj.nextInt();
    //Creating object for marks class
        Marks m=new Marks();
    //Calling the result method
        m.Results(m1,m2,m3,m4,m5);
    //Calling the show method
        m.show();
    //Simple validation
        if(m.avg >= 50)
            System.out.println("Pass");
        else
            System.out.println("Fail"); 
    }
}
