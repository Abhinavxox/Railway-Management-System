package data_structures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileHandler {
	
	//main reader method
	public static ArrayList<String[]> mainRead(String filename, int noOfAttributes) throws IOException {
		File f = new File("C:/Users/abhin/Desktop/JAVA/workspace/Railway_Management_System/assets/filingSystem/"+filename);
		Scanner sc = new Scanner(f);
		ArrayList<String[]> alist = new ArrayList<String[]>();
		while(sc.hasNext()) {
			String line= sc.next();
			String[] arr = line.split(",",noOfAttributes);
			alist.add(arr);
		}
		return alist;
		
	}
	
	//main writer method
	public static void mainWrite(String filename, String data) throws IOException {
		File file = new File("C:/Users/abhin/Desktop/JAVA/workspace/Railway_Management_System/assets/filingSystem/"+filename);
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		br.write(data);
		br.write("\n");

		br.close();
		fr.close();
	}
	
	//passenger write
	public static void writePassenger(String[] arr) throws IOException {
		StringBuilder sb = new StringBuilder();
		//name
		sb.append(arr[0]);
		sb.append(",");
		//username
		sb.append(arr[1]);
		sb.append(",");
		//password
		sb.append(arr[2]);
		mainWrite("passenger.csv", sb.toString());
	}
	
	//passengerRead
	public static ArrayList<String[]> readPassenger() throws IOException {
		return mainRead("passenger.csv", 3);
	}
	
	//officialRead
	public static ArrayList<String[]> readOfficial() throws IOException {
		return mainRead("official.csv", 2);
	}
	
	//trains
	public static ArrayList<String[]> readTrain() throws IOException {
		return mainRead("trains.csv", 3);
	}
	
	//trains
	//passenger
	public static void writeTicket(String[] arr) throws IOException {
		File file = new File("C:/Users/abhin/Desktop/JAVA/workspace/Railway_Management_System/assets/filingSystem/ticket.csv");
		FileWriter fr = new FileWriter(file, false);
		StringBuilder sb = new StringBuilder();
		//name
		for(String x : arr) {
			sb.append(x);
			if(arr[arr.length-1]==x) {
				break;
			}
			sb.append(",");
		}
		fr.write(sb.toString());
		fr.close();
	}
	
	public static ArrayList<String[]> readTicket() throws IOException {
		return mainRead("ticket.csv", 7);
	}
	
	//train screen
	public static void writeTrainScreen(String[] arr) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]);
		sb.append(",");
		sb.append(arr[1]);
		mainWrite("trainScreen.csv", sb.toString());
	}
	
	public static void refreshTrainScreen(ArrayList<String[]> alist) throws IOException{
		StringBuilder sb = new StringBuilder();
		File file = new File("C:/Users/abhin/Desktop/JAVA/workspace/Railway_Management_System/assets/filingSystem/trainScreen.csv");
		FileWriter fr = new FileWriter(file, false);
		
		for (String[] arr : alist) {
			sb.append(arr[0]);
			sb.append(",");
			sb.append(arr[1]);
			sb.append("\n");
		}
		fr.write(sb.toString());
		fr.close();
	}
	
	public static ArrayList<String[]> readTrainScreen() throws IOException {
		return mainRead("trainScreen.csv", 2);
	}
	
	public static void setTrainQueue(ArrayList<String> alist) throws IOException{
		File file = new File("C:/Users/abhin/Desktop/JAVA/workspace/Railway_Management_System/assets/filingSystem/trainQueue.csv");
		FileWriter fr = new FileWriter(file,false);
		StringBuilder sb = new StringBuilder();
		for (String x : alist) {
			sb.append(x+"\n");
		}
		fr.write(sb.toString());
		fr.close();
	}
	
	public static ArrayList<String> getTrainQueue() throws IOException {
		File f = new File("C:/Users/abhin/Desktop/JAVA/workspace/Railway_Management_System/assets/filingSystem/trainQueue.csv");
		Scanner sc = new Scanner(f);
		ArrayList<String> alist = new ArrayList<String>();
		while(sc.hasNext()) {
			String line= sc.next();
			alist.add(line);
		}
		return alist;
	}
	

}
