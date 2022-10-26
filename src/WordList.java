import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//LinkedList.java
//
//This version uses three instance variables,
//a pointer to the first node, a pointer to
//the last node, and length, to make our
//append and getLength methods more efficient
//than the would be if our only instance
//variable were a pointer to the first node.
//
//This version uses a dummy first node.  Hence
//it needs less decision-making than it would
//need if a dummy first node were not used.
//

// Imported code form lab 16 on linkedlists
// In my class WordList 
// Initialized the first node in linkedlist, the last node and number of items in list and changed their access 


public abstract class WordList {
	protected WordNode first = new WordNode(null);
	protected WordNode last = first;
	protected int length = 0;

// This returns number of elements in the list	
	
public int getLength(){
	return length;
}

// Appends word class which compares the 2 data types

public void append(Word w){
	WordNode newNode = new WordNode(w);
	last.next = newNode;
	last = newNode;
	length++;
}

// return String representation of elements in linked list delimited by a space character

public String toString() {
	WordNode wl = first.next;
	String returnString = "";
	while (wl != null) {
		returnString += wl.data.data + " \n";
		wl = wl.next;
}
return returnString;
}

static String original = "";

// readFile function to read the original text input file


public static String readFile(String inputFile) {
	File file = new File(inputFile);
	BufferedReader br = null;
	try {
		br = new BufferedReader(new FileReader(file));
		String line;
		while((line = br.readLine()) != null) {
			original = original + line;
		}
	} catch (Exception err) {
		err.printStackTrace();
	}
	
	return original;
	
	}


}