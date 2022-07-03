package data_structures;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class arrays {
	
	public static fileHandler fh = new fileHandler();
	
	public static boolean getPassengers(String username, String password) throws IOException{
		/*
		 * passengers details will be stored in  arraList of string array
		 * returns true if the login details in in the directory
		 */
		ArrayList<String []> passengers = new ArrayList<String[]>();
		passengers = fh.readPassenger();
		boolean contains = false;
		for (String[] x : passengers) {
			if(x[1].equals(username) && x[2].equals(password)) {
				contains = true;
			}
		}
		return contains;
	}
	
	public static boolean setPassengers(String name, String username, String password) throws IOException {
		/*
		 * first check if the username already used by someone
		 * if not then add to the file
		 * returns true if successfully added
		 */
		boolean set = true;
		ArrayList<String []> passengers = new ArrayList<String[]>();
		passengers = fh.readPassenger();
		
		for(String[] x : passengers) {
			if(x[1].equals(username)) {
				set = false;
			}
		}
		//if username is unique
		if(set) {
			String arr [] = {name, username, password};
			fh.writePassenger(arr);
		}
		return set;
	}
	
	public static boolean getOfficials(String username, String password) throws IOException{
		/*
		 * officials details will be stored in  arraList of string array
		 * Each passenger information is in 
		 */
		ArrayList<String []> officials = new ArrayList<String[]>();
		officials = fh.readOfficial();
		boolean contains = false;
		for (String[] x : officials) {
			if(x[0].equals(username) && x[1].equals(password)) {
				contains = true;
			}
		}
		return contains;
	}
	
	public static ArrayList<String[]> getTrains() throws IOException{
		/*
		 * returns trains list with its price and name
		 */
		ArrayList<String []> trains = new ArrayList<String[]>();
		trains = fh.readTrain();
		return trains;
	}
	
	public static void setTicket(String[] arr) throws IOException{	
		fh.writeTicket(arr);
	}

	public static String[] getTicket() throws IOException {
		ArrayList<String []> ticket = new ArrayList<String[]>();
		ticket = fh.readTicket();
		return ticket.get(0);
	}
	

}
