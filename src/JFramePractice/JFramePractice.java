package JFramePractice;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.font.*;
import java.awt.Color; 

public class JFramePractice {

	public static void main(String[] args) {
		
		Color brat = Color.decode("#8ACE00");
		//using color commonly known as "brat green" to color my button
		
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		//setting the frame and the layout that it uses
		
		JButton click = new JButton("CLICK ME");
		frame.add(click);
		//creating my button and adding it to the frame
		
		JOptionPane.showMessageDialog(null, "The button will appear in the top left", "title", JOptionPane.PLAIN_MESSAGE);
		
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setting the frame size and making the java program stop when I exit the frame
		
		
		JLabel label = new JLabel();
		label.setSize(20, 20);
		frame.add(label);
		//adding my label
		
		click.setBackground(brat);
		frame.setBackground(brat);
		frame.setVisible(true);
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Go Hatters!");
			}
		});
		//when the button is clicked, the text "go hatters!" will appear
		
		

	}

}
