import java.util.*;
class Library
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int total_books=100;
System.out.println("\n");
    System.out.println("Welcome to VIGNAN central Library!!");
    String sub;
   String s;
  int a;  
System.out.println("\n");
    System.out.println("Which Department(AIDS,ECE,MECH) Books Do You Need??");
    String subName=sc.nextLine();
System.out.println("\n");
   if(subName.equals("AIDS"))
{
     System.out.println("What Subject Book You Want To Grab?");//JAVA,WEBDESIGN,STATISTICS,CO,TEC...
     sub=sc.nextLine();
System.out.println("\n");

if(sub.equals("JAVA"))
{
System.out.println("You may go straight and turn left to get "+sub+" book");
System.out.println("\n");
     System.out.println("Which Author do you : ");
String author = sc.nextLine();
System.out.println("\n");
switch(author)
{
case "KATHYSIERRA":
System.out.println("KathySierra Book edition is available");
break;
case "BLOCHJOSHUA":
System.out.println("BlochJoshua Book edition is available");
break;
case "JAVINPAUL":
System.out.println("JavinPaul Book edition is available");
default:
System.out.println(" The edition you mentioned is not available");
System.out.println(" You may try taking Kathysierra or Blochjoshua or JavinPaul editions.");
break;
}
}
if(sub.equals("CO"))
{
 System.out.println("You may go straight and turn left to get "+sub+" book");
System.out.println("\n");
    System.out.println("Enter Author Name: ");
String author =sc.nextLine();
System.out.println("\n");
switch(author)
{
case "DAVID":
System.out.println("DavidPatterson Book edition is available");
break;
case "WILLIAMS":
System.out.println("WilliamStalings Book edition is available");
break;
case "LINDANULL":
System.out.println("LindaNull Book edition is available");
default:
System.out.println(" The edition you mentioned is not available");
System.out.println(" You may try taking DavidPatterson or WilliamStalings or LindaNull editions.");
break;
}
}
System.out.println("\n");
     System.out.println("Do You Want To Borrow Home or For Reading?");//HOME OR READING
      s=sc.nextLine();
System.out.println("\n");
     if(s.equals("HOME"))
{ 
     System.out.println("Thank You for choosing " +sub+ " book");
System.out.println("\n");
    System.out.println("How many copies you need?");
    a=sc.nextInt();
if(total_books>=a)
{
System.out.println("\n");
   System.out.println("Remaining Books left are:" +(total_books-a));
System.out.println("\n");
}
else { 
System.out.println("Sorry there are no enough books");
}
System.out.println("Enter Valid Register Id");
    int id=sc.nextInt();
System.out.println("\n");
System.out.println("LIBRARY CARD");
System.out.println("\n");
System.out.println("Branch            :"+subName);
System.out.println("Register Number   :"+id);
System.out.println("Subject           :"+sub);
System.out.println("Copies            :"+a);
System.out.println("Return Date       :03-12-2024");
System.out.println("\n");
 System.out.println("Kindly return it within 14  days else you will be charged!");
}
     else { 
    System.out.println("Thank You , You may carryon!!");
}
 

}
 else if(subName.equals("ECE"))
{
    System.out.println("What Subject Book You Want To Grab?");//NA,DS,CIRCUITS....
     sub=sc.nextLine();
System.out.println("\n");
System.out.println("You may go straight and turn right to get "+sub+" book");
System.out.println("\n");
     System.out.println("Do You Want To Borrow Home or For Reading?");//HOME OR READING
      s=sc.nextLine();
System.out.println("\n");
     if(s.equals("HOME"))
{ 
     System.out.println("Thank You for choosing " +sub+ " book");
System.out.println("\n");
    System.out.println("How many copies you need?");
    a=sc.nextInt();
if(total_books>=a)
{
System.out.println("\n");
   System.out.println("Remaining Books left are:" +(total_books-a));
System.out.println("\n");
}
else { 
System.out.println("Sorry there are no enough books");
}
System.out.println("Enter Valid Register Id");
    int id=sc.nextInt();
System.out.println("\n");
System.out.println("LIBRARY CARD");
System.out.println("\n");
System.out.println("Branch            :"+subName);
System.out.println("Register Number   :"+id);
System.out.println("Subject           :"+sub);
System.out.println("Copies            : "+a);
System.out.println("Return Date       :01-08-2023");
System.out.println("\n");
 System.out.println("Kindly return it within 14  days else you will be charged!");
}
     else { 
    System.out.println("Thank You , You may carryon!!");
}
 
}
 else if(subName.equals("MECH"))
{
     System.out.println("What Subject Book You Want To Grab?");//AUTOMOBILE,THERMODYNAMICS....
     sub=sc.nextLine();
System.out.println("\n");
System.out.println("You may  turn left to get "+sub+" book");
System.out.println("\n");
     System.out.println("Do You Want To Borrow Home or For Reading?");//HOME OR READING
      s=sc.nextLine();
System.out.println("\n");
     if(s.equals("HOME"))
{ 
     System.out.println("Thank You for choosing " +sub+ " book");
System.out.println("\n");
    System.out.println("How many copies you need?");
    a=sc.nextInt();
if(total_books>=a)
{
System.out.println("\n");
   System.out.println("Remaining Books left are:" +(total_books-a));
System.out.println("\n");
}
else { 
System.out.println("Sorry there are no enough books");
}
System.out.println("Enter Valid Register Id");
    int id=sc.nextInt();
System.out.println("\n");
System.out.println("LIBRARY CARD");
System.out.println("\n");
System.out.println("Branch            :"+subName);
System.out.println("Register Number   :"+id);
System.out.println("Subject           :"+sub);
System.out.println("Copies            : "+a);
System.out.println("Return Date       :03-12-2024");
System.out.println("\n");
 System.out.println("Kindly return it within 14  days else you will be charged!");
}
     else { 
    System.out.println("Thank You , You may carryon!!");
}

}
else 
{
System.out.println("Your Required Book is not Available");
System.out.println("Remaining books are:" +total_books); 
}
}
}