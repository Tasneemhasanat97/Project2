// Class word is used to extract the Strings from the text file
// Class word stores data in w which is used by the sorted and unsorted list classes in the linkedlist to compare their positions in the linkedlist
// Uses the func compareTo

public class Word {
	protected String data;
	public Word(String w){
		data = w;
}

int compareTo(Word other){
	return(this.data.compareTo(other.data));
	}
}