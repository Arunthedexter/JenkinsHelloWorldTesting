import javax.swing.*;
import java.awt.*;
import java.util.Timer;


public class helloWorld extends JFrame
{
	int countdown=1000;
	int counter =10000000;
	int color_change=0;
	boolean state=true;
	
	public helloWorld ()
	{	
		System.out.println(System.nanoTime());
		//Set properties of JFrame
		setVisible(true);
		setTitle("This is Hello World Demo");
		setSize(800,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		validate();
		
		//panel
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		setContentPane(panel);
		
		
		//panel2 
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		
		panel.add(panel2, BorderLayout.NORTH);//adds the 2nd panel inside the main panel
		
		//JLabelTESTFORMENU
		JLabel labelTest = new JLabel ("TEST");
		labelTest.setFont(labelTest.getFont().deriveFont(100.0f));
		
		JLabel labelTest2 = new JLabel ("TEST2");
		labelTest2.setFont(labelTest.getFont().deriveFont(100.0f));
		
		//adds test labels to the second panel
		panel2.add( labelTest);
		panel2.add( labelTest2);
		
		//JLabel1
		JLabel label1 = new JLabel (counter+"!!");
		panel.add(label1, BorderLayout.CENTER);
		label1.setForeground(Color.RED);
		label1.setFont(label1.getFont().deriveFont(100.0f));
		label1.setHorizontalAlignment( SwingConstants.CENTER );
		
		//Jlabel2
		JLabel songTitle = new JLabel ("\"It's My Life\"");
		panel.add(songTitle, BorderLayout.SOUTH);
		songTitle.setForeground(Color.RED);
		songTitle.setFont(songTitle.getFont().deriveFont(50.0f));
		songTitle.setHorizontalAlignment( SwingConstants.CENTER );
		
		
		//GridBag layout properties
		/*c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		panel.add(label1,c);
		//add component to JFrame
		c.gridy = 1;
		panel.add(songTitle,c);*/
		
		while(state==true)
		{
			label1.setText(counter+"!!");
			if (color_change==0)
			{
				label1.setForeground(Color.BLACK);
				color_change=1;
			}
			else if(color_change==1)
			{
				label1.setForeground(Color.RED);
				color_change=2;
			}
			else if(color_change==2) 
			{
				label1.setForeground(Color.BLUE);
				color_change=3;
			}
			else if(color_change==3) 
			{
				label1.setForeground(Color.GREEN);
				color_change=4;
			}
			else if(color_change==4) 
			{
				label1.setForeground(Color.YELLOW);
				color_change=5;
			}
			else if(color_change==5) 
			{
				label1.setForeground(Color.ORANGE);
				color_change=6;
			}
			else if(color_change==6) 
			{
				label1.setForeground(Color.magenta);
				color_change=0;
			}
			
			if(counter<0)
			{
				panel.setBackground(Color.RED);
				label1.setText("GAME OVER");
				label1.setForeground(Color.WHITE);
				state=false;
				songTitle.setText("Try Again");
				songTitle.setForeground(Color.BLACK);
			}
			counter--;
		}
	
		
		

	}
	
	
}