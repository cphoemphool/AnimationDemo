

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.util.*;

public class Mario extends MovingImage {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	
	
	private double xV, yY;
	
	
	public Mario(int x, int y) {
		super("mario.png", x, y, MARIO_WIDTH, MARIO_HEIGHT);
		
		xV = 0;
		yY = 0;
	}

	// METHODS
	public void walk(int dir) {
		super.x += 50 * dir;
	}

	public void jump() {
		// JUMP!
	}

	public void act(ArrayList<Shape> obstacles) {
		// FINISH ME!
		
		yY += 0.75;
		
		super.y += 0.5 * yY;
	}


}
