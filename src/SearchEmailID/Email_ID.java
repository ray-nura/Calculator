package SearchEmailID;

import java.util.Scanner;
import java.util.TreeSet;

public class Email_ID {
	public static void main(String[] args) {
		search1();
		}

static void search1(){
	
	TreeSet<String> listEmail=new TreeSet<String>();	
	
	listEmail.add("abc126@gmail.com");
	listEmail.add("abc124@gmail.com");
	listEmail.add("111@yahoo.com");
	listEmail.add("bbb@hotmail.com");
	listEmail.add("abc128@gmail.com");
	listEmail.add("ccc@hotmail.com");
	listEmail.add("222@yahoo.com");
	listEmail.add("abc125@gmail.com");
	listEmail.add("333@yahoo.com");
	listEmail.add("ddd@hotmail.com");
	listEmail.add("ccc@hotmail.com");
	listEmail.add("abc127@gmail.com");
	listEmail.add("bbb@hotmail.com");
	listEmail.add("abc123@gmail.com");
	listEmail.add("aaa@hotmail.com");
		
		String Email ;
		
		Scanner scann = new Scanner(System.in);
		
		System.out.print("Please enter your email address: ");
		Email = scann.next();
		
		if(Email.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9]+[.][a-z]+"))
		{
			System.out.println(" < "+Email+" > "+ " is right email!");
			if ( listEmail.contains(Email)) {
				System.out.println(" < "+Email+" > " + " is in the List!");				
			}
			else {
				System.out.println("< "+Email+" > " + "  is NOT in the list!");
				System.out.println("Try again !");
				search1();
			}
		}
		else
		{
			System.out.println(" < "+Email+" > " + " is not valid syntax !");
			System.out.println("Try again !");
			search1();
			
		}
		
	}

}
