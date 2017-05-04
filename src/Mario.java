

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.util.*;

public class Mario extends MovingImage {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	
	
	private double xV, yV;
	
	
	public Mario(int x, int y) {
		super("mario.png", x, y, MARIO_WIDTH, MARIO_HEIGHT);
		
		xV = 0;
		yV = 0;
	}

	// METHODS
	public void walk(int dir) {
		super.x += 50 * dir;
		
		System.out.println("TEST II");
	}

	public void jump() {
		// JUMP!
	}

	public void act(ArrayList<Shape> obstacles) {
		// FINISH ME!
		
		yV += 0.75;
		
		super.y += 0.5 * yV;
		
		System.out.println("SOMETHING ELSE");
	}


}
