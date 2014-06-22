package pl.Java.kalorie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

public abstract class AbstractSkladnikiComboBox  extends JComboBox<Object>{

	protected boolean on_off;
	
	public void Action(){}
	
	public void SkladnikiComboInit(){
		BazaObject.IteratorSkladniki.first();
		while (BazaObject.IteratorSkladniki.isDone()){
			this.addItem(BazaObject.IteratorSkladniki.currentItem());
			BazaObject.IteratorSkladniki.next();
		}
		
	}
	
	public <E> void SkladnikiComboUpdate(){
		on_off=false;
		this.removeAllItems();
		SkladnikiComboInit();
		on_off=true;
	}
	
}
