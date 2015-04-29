package Interfaz;

import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JLabel;

import Logic.Basked;



public class BaskedLabel extends JLabel {
	
	private Basked basked;

	public BaskedLabel() {
		super();
		this.basked=new Basked();
		setSize((int)basked.getSize(),(int)basked.getSize());
	}
	

	public BaskedLabel(Basked basked) {
		super();
		this.basked = basked;
		setSize((int)basked.getSize(),(int)basked.getSize());
	}


	public Basked getBasked() {
		return basked;
	}

	public void setBasked(Basked basked) {
		this.basked = basked;
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(0, 0, (int)basked.getSize(), (int)(basked.getSize()));
	}
	

	
}
