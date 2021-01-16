package com.anand.collections;


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Demo
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add("anand");
		a.add(1,"nandhu");
		a.add("hai");
		a.add("201");
		a.add(2, "null");
		a.add("true");
		a.add(3,"shiva");
		System.out.println(a);
		a.clear();
		System.out.println(a);
		for (int i=0;i<=20;i++)
		{
			a.add(i);
		}
	//	Enumeration e=a.elements();
		Iterator I=a.iterator();
		ListIterator itr=a.listIterator();
		System.out.println(a.getClass().getName());
		System.out.println(a.getClass().getName());
		//System.out.println(a.getClass().getName());
		while(I.hasNext())
		{
			Integer i=(Integer)I.next();
				//System.out.println(i);
				if(i%2==0)
					System.out.println(i);
				else
					I.remove();
		}
		System.out.println(a);
	/*
		while(I.hasNext())
		{
			String s=(String)I.next();
			if(s.contains("anand"))
				I.remove();
				System.out.println(s);
		}
		*/
		
				
		
	}

}
