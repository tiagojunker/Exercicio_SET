package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Student> students = new HashSet<>();
		
		System.out.print("How many students for a course A? ");
		int quantityA = sc.nextInt();
		addToSet(students, quantityA);
		
		System.out.print("How many students for a course B? ");
		int quantityB = sc.nextInt();
		addToSet(students, quantityB);
		
		System.out.print("How many students for a course C? ");
		int quantityC = sc.nextInt();
		addToSet(students, quantityC);
		
		System.out.print("Total Students: " + students.size());
		
	}
	
	public static void addToSet(Set<Student> set, int quantityToSet) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= quantityToSet; i++) {
			set.add(new Student(sc.nextInt()));
		}
	}

}
