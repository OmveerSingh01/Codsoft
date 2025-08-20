import java.util.*;
public class student{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("***  Welcome to codsoft student grade calculator  ***");
    float[] marks = new float[8];
    float sum =0;
    System.out.print("Enter total number of subjects :");
    int tot = sc.nextInt();
    System.out.println("Enter marks obtained in "+tot+" subjects out of 100 :");
    for(int i=0;i<tot;i++){
        marks[i]=sc.nextFloat();
        sum = sum + marks[i];
    }
    // let percentage as per
    float per = sum/tot;
    String grade = " ";
    if(per >=90 && per<=100){
        grade ="A+";
    }
    else if(per >=80 && per<=90){
        grade ="A";
    }
   else  if(per >=70 && per<=80){
        grade ="B";
    }
    else if(per >=60 && per<=70){
        grade ="C";
    }
    else if(per >=50 && per<=60){
        grade ="D";
    }
    else if(per >=33 && per<=50){
        grade ="E";
    }
    else if(per >=0 && per<=33){
        grade ="F";
    }
    else{
        grade = "invalid"; 
    }
    if(grade.equals("invalid ")){
        System.out.println("INVALID");
        
    }
    else{
        System.out.println("Total marks is : " +sum );
        System.out.println("Percentage scored : "+per);
        System.out.println("Grade is : "+grade );
    }

}
}
