package scheduler;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Objective: Create a weekly scheduling application.
 * 
 * You may create any additional enums, classes, methods or variables needed
 * to accomplish the requirements below:
 * 
 * - You should use an array filled with enums for the days of the week and each
 *   enum should contain a LinkedList of events that includes a time and what is 
 *   happening at the event.
 * 
 * - The user should be able to to interact with your application through the
 *   console and have the option to add events, view events or remove events by
 *   day.
 *   
 * - Each day's events should be sorted by chronological order.
 *  
 * - If the user tries to add an event on the same day and time as another event
 *   throw a SchedulingConflictException(created by you) that tells the user
 *   they tried to double book a time slot.
 *   
 * - Make sure any enums or classes you create have properly encapsulated member
 *   variables.
 */
public class Scheduler {
	static LinkedList<event> mon = new LinkedList<event>();
	static LinkedList<event> teu = new LinkedList<event>();
	static LinkedList<event> wed = new LinkedList<event>();
	static LinkedList<event> thurs = new LinkedList<event>();
	static LinkedList<event> fri = new LinkedList<event>();
	static LinkedList<event> sat = new LinkedList<event>();
	static LinkedList<event> sun = new LinkedList<event>();
	static days[]wholeWeek;
    public static void main(String[] args) {
    	Scanner kb = new Scanner(System.in);
    	wholeWeek = days.values();
    	System.out.println("If you want to add an event enter A, to remove enter B");
    	String choice = kb.nextLine();
    	if (choice.equals("A")) {
    		System.out.println("What do you want the event to say?");
    		String eventText = kb.nextLine();
    		System.out.println("What time do you want the even to be?");
    		String eventTime = kb.nextLine();
    		System.out.println("What day do you want the even on");
    		String day = kb.nextLine();
    		event added = new event(eventText,eventTime);
    		addEvent(added,day);
    	} else {
    		System.out.println("What time is the event you want to remove?");
    		String remTime = kb.nextLine();
    		System.out.println("What day is the event you want to remove?");
    		String day = kb.nextLine();
    		//deleteMethod not added yet
    	}
    }
    public enum days {
    	
    	MONDAY(mon), TEUSDAY(teu), WEDNESDAY(wed),THURSDAY(thurs),FRIDAY(fri),SATURDAY(sat),SUNDAY(sun);
    	LinkedList<event> events;
		days(LinkedList<event> events) {
			this.events = events;
		}
		public LinkedList<event> getEvents () {
			return this.events;
		}
    	
    }
    public static void addEvent(event x, String day) {
    	if (day.equals("Monday")) {
			wholeWeek[0].events.add(x);
		} else if(day.equals("Teusday")) {
			wholeWeek[1].events.add(x);
		}else if(day.equals("Wednesday")) {
			wholeWeek[2].events.add(x);
		}else if(day.equals("Thursday")) {
			wholeWeek[3].events.add(x);
		}else if(day.equals("Friday")) {
			wholeWeek[4].events.add(x);
		} else if(day.equals("Saturday")) {
			wholeWeek[5].events.add(x);
		} else {
			wholeWeek[6].events.add(x);
		}
    }
}
