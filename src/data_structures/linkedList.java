package data_structures;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class linkedList {
	
	public static LinkedList<String[]> intialiseList() throws IOException {
		LinkedList<String[]> list = new LinkedList<String[]>();
		//object from file
		ArrayList<String[]> alist = arrays.getTrainScreen();
		//storing in linked list for further functions
		for (String[] strings : alist) {
			list.add(strings);
		}
		return list;
	}
	
	public static void saveList(LinkedList<String[]> list) throws IOException {
		ArrayList<String[]> alist = new ArrayList<String[]>();
		for(int i=0; i< list.size(); i++) {
			alist.add(list.get(i));
		}
		fileHandler.refreshTrainScreen(alist);
	}
	
	public static void deleteFromBeginning() throws IOException {
		LinkedList<String[]> list = intialiseList();
		list.remove(0);
		saveList(list);
	}
	
	public static void insertAtBack(String[] arr) throws IOException {
		LinkedList<String[]> list = intialiseList();
		list.add(arr);
		saveList(list);
	}
	
	public static String[] deleteFromMiddle(int index) throws IOException {
		LinkedList<String[]> list = intialiseList();
		String[] arr = list.get(index);
		list.remove(index);
		saveList(list);
		return arr;
		}
	
	public static void insertAtMiddle(String[] arr) throws IOException {
		LinkedList<String[]> list = intialiseList();
		list.add(arr);
		saveList(list);
	}
	
	public static boolean isEmpty() throws IOException {
		LinkedList<String[]> list = intialiseList();
		if(list.isEmpty()) {
			return true;
		}
		return false;
		
	}
	
}
