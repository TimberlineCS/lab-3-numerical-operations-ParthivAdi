//Parthiv Adimulam
//Computer Science A
public class NumericalOperations{
public static void main (String args[]){
//Challenge 1
//Predicted Answers
//1
//39.13
//-1345.9
//1313
//1337
double d1 = 37.9;
double d2 = 1004.128;
int i1 = 12;
int i2 = 18;
System.out.println(57.2 * (i1 / i2) + 1	);
System.out.println(57.2 * ((double)i1 / i2) + 1);	
System.out.println( 15 - i1 * (d1 * 3) + 4 );
System.out.println( 15 - i1 * ((int)d1 * 3) + 4 );
System.out.println( 15 - i1 * (int)(d1 * 3) + 4 );

//Challenge 2
int n = 1234;
int n0 = n%10;
int n1 = n%100;
int n2 = n%1000;
int n3 = n%10000;
int n4 = n3 - n2;
int n5 = n2 - n1;
int n6 = n1 - n0;
int a1 = n0;
int a2 = n6/10;
int a3 = n5/100;
int a4 = n4/1000;

System.out.print(a1);
System.out.print(a2);
System.out.print(a3);
System.out.print(a4);
//Switch out n with the number you want to reverse.



}

}