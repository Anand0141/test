package com.collection.ListIterato;

import java.util.Scanner;

public class Credit_DebitCard 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the card");
		System.out.println("1.Debit Card");
		System.out.println("2.Credit Card");
		System.out.print("Enter your choice:");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1    :	System.out.println("you have choosen card identfiation");
					System.out.print("Enter your card number:");
					String DebitCard=sc.next();
					if(DebitCard.startsWith("4236"))
					{
						System.out.println("your Debitcard is master card");
					}
					else if(DebitCard.startsWith("4237"))
					{
						System.out.println("your DebitCard is Rupay card");
					}
					else if(DebitCard.startsWith("4238"))
					{
						System.out.println("Your DebitCard is Visa card");
					}
					else
					{
						System.out.println("Invalid card");
					}
					break;
		case 2    : System.out.println("You have been choosen Credit card ");
					System.out.print("Enter your card number:");
					String Creditcard=sc.next();
					if(Creditcard.startsWith("8696"))
					{
						System.out.println("your creditcard is Master Card");
					}
					else if(Creditcard.startsWith("8697"))
					{
						System.out.println("your creditcard is Rupay card");
					}
					else if(Creditcard.startsWith("8698"))
					{
						System.out.println("your creditcard is Visa card");
					}
					else
					{
						System.out.println("Invalid number");
					}
					System.out.println("Thnak you for coming");
		}
		
	}
}
