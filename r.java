import java.util.*;
class stu
{

String fname;


}

class uni extends stu
{

static int courses;
static String string;
String c_code;
int credits;
float marks;
String c_type;
char c_grade;

public static void main(String[] args)
{
int i,n;
Scanner sc = new Scanner(System.in);
System.out.println(" \t \t WELCOME TO STUDENT EXAMINATION SYSYTEM \t \t ");
System.out.println("PLEASE ENTER THE NO. OF COURSES THE STUDENT STUDIED");
uni.courses = sc.nextInt();
uni e[] = new uni[uni.courses];
for(i=0;i<uni.courses;i++)
{
e[i] = new uni();
}
for(i=0;i<uni.courses;i++)
{
if(i==0)
{
string = sc.nextLine();
}
System.out.println("\tEnter course code :\t");
 e[i].c_code = sc.nextLine();
System.out.println("\tEnter course type T / P /L \t");
e[i].c_type = sc.nextLine();
System.out.println("Enter credits");
 e[i].credits = sc.nextInt();
System.out.println("Enter marks");
 e[i].marks = sc.nextInt();
string = sc.nextLine();

}

System.out.println("\tCOURSECODE" +"\t"+ "CREDITS" + "\t \t" +"MARKS");
for(i=0;i<uni.courses;i++)
{
	
System.out.println("\t"+e[i].c_code +"\t\t"+e[i].credits+"\t \t"+e[i].marks);
if ( e[i].marks>=90)
{
	System.out.println("\t THIS  STUDENT HAS PASSED THE ABOVE MENTIONED COURSE & SECURED O GRADE");

}
else if(e[i].marks>=80)
{
	System.out.println("THIS  STUDENT HAS PASSED THE ABOVE MENTIONED COURSE & SECURED A+ GRADE");
}
else if(e[i].marks>=70)
{
	System.out.println("THIS STUDENT HAS PASSED THE ABOVE MENTIONED COURSE & SECURED A GRADE");
}
else if(e[i].marks>=60)
{
	System.out.println("THIS STUDENT HAS PASSED THE ABOVE MENTIONED COURSE & SECURED B GRADE");

}
else if(e[i].marks>=50)
{
	System.out.println("THIS STUDENT HAS PASSED THE ABOVE MENTIONED COURSE & SECURED C GRADE");
}
else if(e[i].marks<=40)
{
	System.out.println("THIS STUDENT HAS FAILED THE ABOVE MENTIONED COURSE & SECURED E GRADE");
}

}
}

}