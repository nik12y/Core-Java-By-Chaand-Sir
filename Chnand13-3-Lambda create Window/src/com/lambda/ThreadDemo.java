package com.lambda;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ThreadDemo {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setLayout(new FlowLayout());

		// add button into jFrame
		JButton button = new JButton("Click Me!!!!!!!!!");
		frame.add(button);

		// Now Use ActionListerner for adding the value after click on Click Me!!!!!!!!!
		// 1st we do by Anonymous class then use lambda Expresion
	/*	button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button click");
				//JOptionPane.showInputDialog(null, "Hey i am using Window");
			JOptionPane.showMessageDialog(button, "Hi show Message");
			//	JOptionPane.showInternalMessageDialog(button, e, "Hi show msg", 0);
			}
		});  */
		//We use lambda expression
		button.addActionListener((e)->{
			System.out.println("Button click");
			//JOptionPane.showInputDialog(null, "Hey i am using Window");
		JOptionPane.showMessageDialog(button, "Hi show Message");
		});		
		

		// close the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
