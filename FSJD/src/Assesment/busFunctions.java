package Assesment;
import java.io.*;
import java.util.*;
public class busFunctions {
	List <String>AllFiles=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	void Add() {
		
		System.out.println("Enter the File name to be Added");
		String fname=sc.next();
		File f1=new File(fname);
		try {
			boolean res=f1.createNewFile();
			System.out.println("File Created-"+res);
			AllFiles.add(fname);
		}
		catch (IOException e) {
			System.out.println("I/o exception occured");
			e.printStackTrace();
		}
		
	}
	void search() {
		System.out.println("Enter the name of the file to be searched");
		String sName=sc.next();
		boolean cont=AllFiles.contains(sName);
		System.out.println("File Found "+sName+" "+cont);
	}
	void delete() {
		System.out.println("Enter the File name to be deleted");
		String fname=sc.next();
		File f1=new File(fname);
		boolean del=f1.delete();
		AllFiles.remove(fname);
		if(del ==true)
		System.out.println("File Deleted "+fname+" "+del);
		else
			System.out.println("File Not Found");
		
	}
	void display() {
		AllFiles.sort(null);
		int c=0;
		for(String s:AllFiles) {
			c=1;
			System.out.print("\t"+s);
		}
		if(c==0)
			System.out.println("N0 file to display");
		
		System.out.println();
	}

}
