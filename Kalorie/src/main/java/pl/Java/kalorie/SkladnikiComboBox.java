package pl.Java.kalorie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SkladnikiComboBox extends AbstractSkladnikiComboBox {
	
	public SkladnikiComboBox(){
		super();
		on_off=false;
		setEditable(false);
		addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(on_off)
				try
					{
					if(ActionEvent.MOUSE_EVENT_MASK== arg0.getModifiers())
					Action();
					}
				catch(NullPointerException exception)
			 	{}
			
			}
		});
		addKeyListener(new KeyListener() {
			boolean flaga=false;
			
			public void keyTyped(KeyEvent arg0) {
				System.out.println("keyTyped");
				
			}
			
			
			public void keyReleased(KeyEvent arg0) {
				System.out.println("keyReleased");
				if(flaga & on_off)
					Action();
				flaga=false;
			}
			
			
			public void keyPressed(KeyEvent arg0) {
				System.out.println("keyPressed");
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER)
					flaga=true;
			}
		});
		on_off=true;
		}
}
