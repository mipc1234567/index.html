package Test;

import Interfaz.BaskedLabel;
import Interfaz.HamburgerLabel;
import Interfaz.PlayFrame;
import Logic.Basked;
import Logic.Hamburger;



public class Demo {

	public static void main(String[]args){
		
		HamburgerLabel[] hamburger= new HamburgerLabel[10];
		for (int i = 0; i < hamburger.length; i++) {
			hamburger[i]= new HamburgerLabel(new Hamburger((byte)(10+Math.random()*50)));
		}
//		
//		HamburgerLabel ham= new HamburgerLabel();
		BaskedLabel basked= new BaskedLabel(new Basked(80));

		PlayFrame play= new PlayFrame(hamburger, basked);
		play.setVisible(true);
		
	}

}
