package data_structures;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
	
	public static Queue<String> intialiseQueue() throws IOException {
		Queue<String> queue = new LinkedList<String>(); 
		//object from file
		ArrayList<String> alist = fileHandler.getTrainQueue();
		//storing in linked list for further functions
		for (String strings : alist) {
			queue.add(strings);
		}
		return queue;
	}
	
	public static void saveQueue(Queue<String> queue) throws IOException {
		ArrayList<String> alist = new ArrayList<String>();
		for (String string : queue) {
			alist.add(string);
		}
		fileHandler.setTrainQueue(alist);
	}
	
	public static void enqueue(String[] arr) throws IOException {
		Queue<String> queue = intialiseQueue();
		queue.add(arr[0]);
		saveQueue(queue);
	}
	
	public static String dequeue() throws IOException {
		Queue<String> queue = intialiseQueue();
		String returned = queue.peek();
		queue.remove();
		saveQueue(queue);
		return returned;
	}
	
	public static boolean isEmpty() throws IOException {
		Queue<String> queue = intialiseQueue();
		if(queue.isEmpty()) {
			return true;
		}
		return false;
	}

}
