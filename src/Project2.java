import java.io.*;
import java.util.StringTokenizer;
public class Project2 {

	// Main function
	// para, tf, swl, uwl are initilized in main function to be passed into GUI object
	// While loop implemented to readlines until no lines remain in text file
	// StringTokenizer obj created to parse string into tokens from text file
	// Another while loop implemented to keep adding tokens to LinkedList and sorting them into the sorted and unsorted list
	// Finally GUI obj made to display the arguments passed into the function which are the original text, unsorted list and sorted list of words
	
	
	public static void main(String[] main){
		String para = "";
		TextFileInput tf = new TextFileInput("Input.txt");
		SortedWordList sList = new SortedWordList();
		UnsortedWordList uList = new UnsortedWordList();
		String line = tf.readLine();
		while(line != null){
			para += line + " ";
			line = tf.readLine();
		}

		StringTokenizer st = new StringTokenizer(para);

		while(st.hasMoreTokens()){

			String word = st.nextToken();
			Word w = new Word(word);
			sList.add(w);
			uList.add(w);

		}


		WordGUI gui = new WordGUI();
		gui.display(tf,uList,sList);
	}
}