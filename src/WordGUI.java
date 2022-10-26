import java.awt.*;
import java.awt.GridLayout;
import javax.swing.*;

// Created private instance variables for the GUI class using JFrame, JTextArea, TextArea libraries

public class WordGUI {
private JFrame wordsGUI;
private Container myContentPane;
private JTextArea myTextArea0;
private TextArea myTextArea1;
private TextArea myTextArea2;

// Set up WordGui function 
// Initialized a new JFrame with title name as "Project2"
// Set GUI dimensions and layout 1 row 3 columns
// Added background and foreground colors to enhance the UI of GUI
// Set font to Times as I was getting a warning in console that fonts werent available for the java logical form, looked up the documentation for Java fonts for that
// Set visibility to true to display GUI output

public WordGUI(){
wordsGUI = new JFrame();
wordsGUI.setTitle("Project2");
wordsGUI.setBackground(Color.WHITE);
wordsGUI.setLayout(new GridLayout(1,3));
myContentPane = wordsGUI.getContentPane();
myTextArea0 = new JTextArea();
myTextArea1 = new TextArea();
myTextArea2 = new TextArea();
myTextArea0.setForeground(Color.green);
myTextArea1.setForeground(Color.green);
myTextArea2.setForeground(Color.green);
Font font = new Font("Times", Font.PLAIN, 20);
myTextArea0.setFont(font);
myTextArea1.setFont(font);
myTextArea2.setFont(font);
myTextArea0.setBackground(Color.black);
myTextArea1.setBackground(Color.black);
myTextArea2.setBackground(Color.black);
myContentPane.add(myTextArea0);
myContentPane.add(myTextArea1);
myContentPane.add(myTextArea2);

wordsGUI.setSize(400,300);

wordsGUI.setVisible(true);

wordsGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

// Made function display to output the 3 arguments tf, unsorted and sorted
// Added func setPropertyTextArea for displaying the original text file
// I initially used TextArea for all instance variable but noticed that my text file input was displayed along one line and it didnt look good like this comment 
// Changed to JTextArea which meant I would have to define another function to set property to the text 
// Appended using WordList class to display the correct columns

public void display(TextFileInput tf, WordList unsorted, WordList sorted){
	
setPropertyTextArea(myTextArea0);
	
myTextArea0.append(WordList.readFile("Input.txt"));
	
myTextArea1.append(unsorted.toString());

myTextArea2.append(sorted.toString());


}
public void setPropertyTextArea(JTextArea myTextArea0) {
	myTextArea0.setEditable(false);
	myTextArea0.setFocusable(false);
	myTextArea0.setWrapStyleWord(true);
	myTextArea0.setLineWrap(true);
	myTextArea0.setAlignmentY(JLabel.CENTER_ALIGNMENT);
}

}