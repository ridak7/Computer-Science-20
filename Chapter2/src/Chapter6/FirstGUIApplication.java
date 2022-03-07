package Chapter6;

import javax.swing.*;

public class FirstGUIApplication
{
	public FirstGUIApplication()
	{
		JFrame window = new JFrame("Hello World!");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1280, 720);
		window.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new FirstGUIApplication();
		
		JButton button = new JButton("You can click me!");
		window.add(button);
	}
}
