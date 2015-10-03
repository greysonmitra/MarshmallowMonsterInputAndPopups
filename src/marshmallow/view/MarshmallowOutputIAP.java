package marshmallow.view;

import javax.swing.JOptionPane;

public class MarshmallowOutputIAP 
{
//	public void displayMonsterConsole(String info)			//This green stuff used to be the original output work.
//	{
//		System.out.println("My monster info is: " + info);
//	}
	
	public void displayMonsterGUI(String info)											
	{
		JOptionPane.showMessageDialog(null, "My monster information is:" + info);
	    JOptionPane.showInputDialog(null, "");
	}
	
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}
	
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}	
	
}
