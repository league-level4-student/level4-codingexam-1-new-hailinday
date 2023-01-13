package scheduler;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * Objective: Create a weekly scheduling application.
 * 
 * You may create any additional enums, classes, methods or variables needed
 * to accomplish the requirements below:
 * 
 * - You should use an array filled with enums for the days of the week and each
 *   enum should contain a LinkedList of Strings that includes a time and what is 
 *   happening at the String.
 * 
 * - The user should be able to to interact with your application through the
 *   console and have the option to add Strings, view Strings or remove Strings by
 *   day.
 *   
 * - Each day's Strings should be sorted by chronological order.
 *  
 * - If the user tries to add an String on the same day and time as another String
 *   throw a SchedulingConflictException(created by you) that tells the user
 *   they tried to double book a time slot.
 *   
 * - Make sure any enums or classes you create have properly encapsulated member
 *   variables.
 */
public class Scheduler {
	static LinkedList<String> mon = new LinkedList<String>();
	static LinkedList<String> teu = new LinkedList<String>();
	static LinkedList<String> wed = new LinkedList<String>();
	static LinkedList<String> thurs = new LinkedList<String>();
	static LinkedList<String> fri = new LinkedList<String>();
	static LinkedList<String> sat = new LinkedList<String>();
	static LinkedList<String> sun = new LinkedList<String>();
	static days[]wholeWeek;
    public static void main(String[] args) {
    	Scanner kb = new Scanner(System.in);
    	wholeWeek = days.values();
    	System.out.println("If you want to add an event enter A, to remove enter B, if you want to view an event enter C");
    	String choice = kb.nextLine();
    	if (choice.equals("A")) {
    		System.out.println("What do you want the event to say? And what time?");
    		String eventText = kb.nextLine();
    		System.out.println("What day do you want the String on");
    		String day = kb.nextLine();
    		addString(eventText,day);
    	} else if (choice.equals("B")) {
    		System.out.println("What time is the String you want to remove?");
    		String remTime = kb.nextLine();
    		System.out.println("What day is the String you want to remove?");
    		String day = kb.nextLine();
//    		removeString(remTime, day);
    	} else {
    		System.out.println("What day would you like to view");
    		String day = kb.nextLine();
    		viewString(day);
    	}
    }
    public enum days {
    	
    	MONDAY(mon), TEUSDAY(teu), WEDNESDAY(wed),THURSDAY(thurs),FRIDAY(fri),SATURDAY(sat),SUNDAY(sun);
    	LinkedList<String> events;
		days(LinkedList<String> events) {
			this.events = events;
		}
		public LinkedList<String> getEvents () {
			return this.events;
		}
		public void view () {
			
		}
    	
    }
    public static void addString(String eventText, String day) {
    	if (day.equals("Monday")) {
			wholeWeek[0].events.add(eventText);
		} else if(day.equals("Teusday")) {
			wholeWeek[1].events.add(eventText);
		}else if(day.equals("Wednesday")) {
			wholeWeek[2].events.add(eventText);
		}else if(day.equals("Thursday")) {
			wholeWeek[3].events.add(eventText);
		}else if(day.equals("Friday")) {
			wholeWeek[4].events.add(eventText);
		} else if(day.equals("Saturday")) {
			wholeWeek[5].events.add(eventText);
		} else {
			wholeWeek[6].events.add(eventText);
		}
    	Scanner kb = new Scanner(System.in);
    	wholeWeek = days.values();
    	System.out.println("If you want to add another event enter A, to remove enter B, if you want to view an event enter C");
    	String choice = kb.nextLine();
    	if (choice.equals("A")) {
    		System.out.println("What do you want the event to say? And what time?");
    		String eventTexts = kb.nextLine();
    		System.out.println("What day do you want the String on");
    		String days = kb.nextLine();
    		addString(eventTexts,days);
    	} else if (choice.equals("B")) {
    		System.out.println("What time is the String you want to remove?");
    		String remTime = kb.nextLine();
    		System.out.println("What day is the String you want to remove?");
    		String days = kb.nextLine();
//    		removeString(remTime, day);
    	} else {
    		System.out.println("What day would you like to view");
    		String days = kb.nextLine();
    		viewString(days);
    	}
    }
    public static void removeString(String remTime, String day) {
    	if (day.equals("Monday")) {
			Node<String> head = wholeWeek[0].events.getHead();
			if (head.getValue().contains(remTime)) {
				wholeWeek[0].events.remove(0);
			}
			for (int i = 1; i <= wholeWeek[0].events.size(); i++) {
				if(head.getNext().getValue().contains(remTime)) {
					wholeWeek[0].events.remove(i);
				}
			}
		} else if(day.equals("Teusday")) {
			Node<String> head = wholeWeek[1].events.getHead();
			if (head.getValue().contains(remTime)) {
				wholeWeek[1].events.remove(0);
			}
			for (int i = 1; i <= wholeWeek[1].events.size(); i++) {
				if(head.getNext().getValue().contains(remTime)) {
					wholeWeek[1].events.remove(i);
				}
			}
		}else if(day.equals("Wednesday")) {
			Node<String> head = wholeWeek[1].events.getHead();
			if (head.getValue().contains(remTime)) {
				wholeWeek[1].events.remove(0);
			}
			for (int i = 1; i <= wholeWeek[1].events.size(); i++) {
				if(head.getNext().getValue().contains(remTime)) {
					wholeWeek[1].events.remove(i);
				}
			}
		}else if(day.equals("Thursday")) {
			Node<String> head = wholeWeek[1].events.getHead();
			if (head.getValue().contains(remTime)) {
				wholeWeek[1].events.remove(0);
			}
			for (int i = 1; i <= wholeWeek[1].events.size(); i++) {
				if(head.getNext().getValue().contains(remTime)) {
					wholeWeek[1].events.remove(i);
				}
			}
		}else if(day.equals("Friday")) {
			Node<String> head = wholeWeek[2].events.getHead();
			if (head.getValue().contains(remTime)) {
				wholeWeek[2].events.remove(0);
			}
			for (int i = 1; i <= wholeWeek[2].events.size(); i++) {
				if(head.getNext().getValue().contains(remTime)) {
					wholeWeek[2].events.remove(i);
				}
			}
		} else if(day.equals("Saturday")) {
			Node<String> head = wholeWeek[3].events.getHead();
			if (head.getValue().contains(remTime)) {
				wholeWeek[3].events.remove(0);
			}
			for (int i = 1; i <= wholeWeek[3].events.size(); i++) {
				if(head.getNext().getValue().contains(remTime)) {
					wholeWeek[3].events.remove(i);
				}
			}
		} else {
			Node<String> head = wholeWeek[4].events.getHead();
			if (head.getValue().contains(remTime)) {
				wholeWeek[4].events.remove(0);
			}
			for (int i = 1; i <= wholeWeek[5].events.size(); i++) {
				if(head.getNext().getValue().contains(remTime)) {
					wholeWeek[5].events.remove(i);
				}
			}
		}
    }
    public static void viewString (String day) {
    	if (day.equals("Monday")) {
			wholeWeek[0].events.print();
		} else if(day.equals("Teusday")) {
			wholeWeek[1].events.print();
		}else if(day.equals("Wednesday")) {
			wholeWeek[2].events.print();
		}else if(day.equals("Thursday")) {
			wholeWeek[3].events.print();
		}else if(day.equals("Friday")) {
			wholeWeek[4].events.print();
		} else if(day.equals("Saturday")) {
			wholeWeek[5].events.print();
		} else {
			wholeWeek[6].events.print();
		}
    	Scanner kb = new Scanner(System.in);
    	wholeWeek = days.values();
    	System.out.println("If you want to add another event enter A, to remove enter B, if you want to view an event enter C");
    	String choice = kb.nextLine();
    	if (choice.equals("A")) {
    		System.out.println("What do you want the event to say? And what time?");
    		String eventText = kb.nextLine();
    		System.out.println("What day do you want the String on");
    		String days = kb.nextLine();
    		addString(eventText,days);
    	} else if (choice.equals("B")) {
    		System.out.println("What time is the String you want to remove?");
    		String remTime = kb.nextLine();
    		System.out.println("What day is the String you want to remove?");
    		String days = kb.nextLine();
//    		removeString(remTime, day);
    	} else {
    		System.out.println("What day would you like to view");
    		String days = kb.nextLine();
    		viewString(days);
    	}
    }
}
