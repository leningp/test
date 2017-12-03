package com.lenin.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.lenin.model.Person;

public class UnitOne {
	
	public static void main(String[] str) {
		
		List<Person> people = Arrays.asList(
			new Person("p001", "Lenin", "Gowripatnam"),
			new Person("p002", "John", "Hawk"),
			new Person("p003", "Kim", "Barbara"),
			new Person("p004", "Cristhopher", "bob"),
			new Person("p005", "Alpha", "beta")
		);
		
		Collections.sort(people,new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getFirstName().compareToIgnoreCase(p2.getFirstName());
			}
				
		});
		
		System.out.println("using java 7 --- print All");
		System.out.println("-----------------------------------------------");
		printConditionally(people, p1->true);
		
		Collections.sort(people, (p1, p2) -> p2.getFirstName().compareToIgnoreCase(p1.getFirstName()));
		
		System.out.println("");
		System.out.println("using java 8 Lambda --- print All");
		System.out.println("-----------------------------------------------");
		printConditionally(people, p1->true);
		
		
		System.out.println("using java 7 --- printConditionally");
		System.out.println("-----------------------------------------------");
		
		printConditionally(people, new PeopleFilter() {

			@Override
			public boolean filter(Person p) {
				if(p.getFirstName().startsWith("L")) {
					return true;
				}
				return false;				
			}
			
		});
			
		System.out.println("using java 8 Lambda --- printConditionally");
		System.out.println("-----------------------------------------------");
		
		printConditionally(people, p -> p.getFirstName().startsWith("A"));
		
		
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("I am running...");
				
			}
		}) ;
		
		
		myThread.start();
		
		Thread myThreadL = new Thread(()->printConditionally(people, p -> p.getFirstName().startsWith("A")));
		
		myThreadL.start();
		
		
	}

	private static void printConditionally(List<Person> people, PeopleFilter peopleFilter) {
		for(Person p : people) {
			if(peopleFilter.filter(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		
		for(Person p : people) {
			System.out.println(p);
		}
		
	}
	
	

}
@FunctionalInterface
interface PeopleFilter {

	public boolean filter(Person p);
	
	 public default boolean foo(Person p) {
	  return true;	
	}
	
}