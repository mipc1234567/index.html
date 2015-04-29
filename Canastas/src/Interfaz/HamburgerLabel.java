package Interfaz;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JLabel;

import Logic.Hamburger;



public class HamburgerLabel extends JLabel implements Runnable{

	private Hamburger hamburger;
	public HamburgerLabel(Hamburger hambuerger) {
		this.hamburger=hambuerger;
		this.setSize(hamburger.getSize(),hamburger.getSize());
		
	}
//	public  HamburgerLabel() {
//		super();
//		this.hamburger=new Hamburger((byte)50,null);
//		setSize(getHamburger().getSize(),getHamburger().getSize());
//	}
	

	public Hamburger getHamburger() {
		return hamburger;
	}

	public void setHamburger(Hamburger hamburger) {
		this.hamburger = hamburger;
	}
	
	public void paint(Graphics g){
		g.fillOval(0, 0,hamburger.getSize(), hamburger.getSize());
		
	}
	@Override
	public void run() {
		while(true){
			setLocation(getX(), getY()+5);
			try {
				Thread.sleep((int) (10+Math.random()*100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	



}
