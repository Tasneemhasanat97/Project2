// SortedWordList class extends WordList
// Also adds words to the linkedList 
// Keeps iterating till a greater node than w and without updating the last tail of list.
// Keeps adding to the length of the linked list
// Leaving the function SortedWordList empty as arguments will be passed in other functions

public class SortedWordList extends WordList{

public SortedWordList(){}

public void add(Word w){
	
	WordNode newNode = new WordNode(w);
	WordNode current = first;
	while(current.next != null && current.next.data.data.compareTo(newNode.data.data) < 0){//itterate until find a node greater than w no need to update last
		current = current.next;
	}
	if (current.next==null){
		append(w);
	}
	
if(current.next.data.data.compareTo(newNode.data.data) > 0){
	newNode.next = current.next;
	current.next = newNode;
	}

	length++;
	}
}