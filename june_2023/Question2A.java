package june_2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Question2A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,String> students = new HashMap<Integer,String>();		
		
		int sid=0;
		
		
		while(true) {
			System.out.println("Enter the student id : ");
			sid = sc.nextInt();
			
			
			if(sid==-99) {
				break;
			}
			System.out.println("Enter the student name:");
			String sname = sc.next();
			
			students.put(sid, sname);
			
			
		}
		
		
		System.out.println("Enter the student id to remove : ");
		int Rsid = sc.nextInt();
		
		boolean result = students.containsKey(Rsid);
		
		
		if(result) {
			students.remove(Rsid);
			System.out.println("Given sid has removed "+Rsid);
		}
		else {
			System.out.println("Given id is not available");
		}
		
		int total= students.size();
		
		System.out.println("Total : "+total);
		
		for (Integer display : students.keySet()) {
			System.out.println("Student ID : " + display +" => name : "+students.get(display));
		}
		
	}

}
