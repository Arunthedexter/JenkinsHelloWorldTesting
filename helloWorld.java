import javax.swing.*;
import java.awt.Color;


public class helloWorld extends JFrame
{
	int counter =0;
	int color_change=0;
	boolean state=true;
	
	public helloWorld ()
	{
		setVisible(true);
		setTitle("This is Hello World Demo");
		setSize(800,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		validate();
		
		JPanel panel = new JPanel();
		setContentPane(panel);
		JLabel label = new JLabel (counter+"!!");
		label.setForeground(Color.RED);
		label.setFont(label.getFont().deriveFont(100.0f));
		panel.add(label);
		
		while(state==true)
		{
			label.setText(counter+"!!");
			if (color_change==0)
			{
				label.setForeground(Color.BLACK);
				color_change=1;
			}
			else if(color_change==1)
			{
				label.setForeground(Color.RED);
				color_change=2;
			}
			else if(color_change==2) 
			{
				label.setForeground(Color.BLUE);
				color_change=3;
			}
			else if(color_change==3) 
			{
				label.setForeground(Color.GREEN);
				color_change=4;
			}
			else if(color_change==4) 
			{
				label.setForeground(Color.YELLOW);
				color_change=5;
			}
			else if(color_change==5) 
			{
				label.setForeground(Color.ORANGE);
				color_change=6;
			}
			else if(color_change==6) 
			{
				label.setForeground(Color.magenta);
				color_change=0;
			}
			
			
			
			counter++;
		}
	
		
		

	}
	
	public static void main ( String [] args )
	{
		helloWorld helloWorldGUI = new helloWorld();
		
	}	
}