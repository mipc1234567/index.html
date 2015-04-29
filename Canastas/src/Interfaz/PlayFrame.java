package Interfaz;

import java.awt.GraphicsConfiguration;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;


public class PlayFrame extends JFrame implements KeyListener {

	private HamburgerLabel[] arrayHambuerger; 
	private BaskedLabel baskedLabel;	
	private  Thread[] hilos;

	public PlayFrame(HamburgerLabel[] arrayHamburgerLabel, BaskedLabel baskedLabel) throws HeadlessException {
		setSize(500,500);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.hilos= new Thread[arrayHamburgerLabel.length];
		this.arrayHambuerger=arrayHamburgerLabel;
		for (int i = 0; i < arrayHamburgerLabel.length; i++) {
			int size=(int)(arrayHamburgerLabel[i].getWidth());
			int limite=getWidth()-size;
			arrayHamburgerLabel[i].setLocation((int)(Math.random()*(limite)), 0);
			this.add(arrayHamburgerLabel[i]);
			hilos[i]= new Thread(arrayHambuerger[i]);
			hilos[i].start();
			
		}
		
		
		this.baskedLabel=baskedLabel;
				this.baskedLabel.setLocation(getWidth()/2-baskedLabel.getWidth()/2,getWidth()-baskedLabel.getWidth() );
			
		add(baskedLabel);
		
//		add(arrayHamburgerLabel);
		setVisible(true);
		addKeyListener(this);
	}
//	public PlayFrame(HamburgerLabel HamburgerLabel, BaskedLabel baskedLabel) throws HeadlessException {
//		HamburgerLabel= new HamburgerLabel();
//		HamburgerLabel.setLocation(0,0);
////		HamburgerLabel.setLocation(0,8);
////		HamburgerLabel.setLocation(0,16);
//		this.baskedLabel=baskedLabel;
//		setSize(500,500);
//		setLayout(null);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.baskedLabel.setLocation(getWidth()/2-baskedLabel.getWidth()/2,getWidth()-baskedLabel.getWidth() );
//		add(HamburgerLabel);
//		add(HamburgerLabel);
//		add(HamburgerLabel);
//		add(baskedLabel);
//		setVisible(true);
//		addKeyListener(this);
//	}
	

	public PlayFrame(BaskedLabel baskedLabel) throws HeadlessException {
		super();
		this.baskedLabel = baskedLabel;
	}


	public BaskedLabel getBaskedLabel() {
		return baskedLabel;
	}



	public void setBaskedLabel(BaskedLabel baskedLabel) {
		this.baskedLabel = baskedLabel;
	}



	public HamburgerLabel[] getArrayHambuerger() {
		return arrayHambuerger;
	}

	public void setArrayHambuerger(HamburgerLabel[] arrayHambuerger) {
		this.arrayHambuerger = arrayHambuerger;
	}
	public void addHamburger(HamburgerLabel hamburgerLabel){

		HamburgerLabel[] auxProduct = new HamburgerLabel[arrayHambuerger.length];
		for (int i = 0; i < arrayHambuerger.length; i++) {
			auxProduct[i] = arrayHambuerger[i];
		}
		auxProduct[arrayHambuerger.length] = hamburgerLabel; 
		arrayHambuerger = auxProduct;
	}


	@Override
	public void keyPressed(KeyEvent key) {
		
		if(key.getKeyCode()==KeyEvent.VK_LEFT){
			this.baskedLabel.setLocation((baskedLabel.getX()-2),getWidth()-baskedLabel.getWidth() );
		}
		if(key.getKeyCode()==KeyEvent.VK_RIGHT){
			this.baskedLabel.setLocation((baskedLabel.getX()+2),getWidth()-baskedLabel.getWidth() );
		}
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}




}
