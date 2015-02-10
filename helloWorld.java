import javax.swing.*;

public class helloWorld extends JFrame
{
	public helloWorld ()
	{
		setVisible(true);
		setTitle("This is Hello World Demo");
		setSize(800,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		validate();
		
		JPanel panel = new JPanel();
		setContentPane(panel);
		JLabel label = new JLabel ("HELLO WORLD!!!");
		panel.add(label);
		
		
	}
	
	public static void main ( String [] args )
	{
		helloWorld helloWorldGUI = new helloWorld();
	}	
}