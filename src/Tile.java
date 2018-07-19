import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tile {
	
	private int xPos;
	private int yPos;
	private String type;
	
	public Tile(int x, int y, String t){
		xPos = x;
		yPos = y;
		type = t;
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		switch(type){
		case "SE":
			g.drawLine(xPos+13, yPos, xPos+7, yPos);
			g.drawLine(xPos, yPos+13, xPos, yPos+7);
			g.drawArc(xPos,yPos,13,13,90,90);
			break;
		case "NE":
			g.drawLine(xPos+13, yPos, xPos+7, yPos);
			g.drawLine(xPos, yPos-13, xPos, yPos-7);
			g.drawArc(xPos,yPos-13,13,13,180,90);			
			break;
		case "SW":
			g.drawLine(xPos-13, yPos, xPos-7, yPos);
			g.drawLine(xPos, yPos+13, xPos, yPos+7);
			g.drawArc(xPos-13,yPos,13,13,0,90);
			break;
		case "NW":
			g.drawLine(xPos-13, yPos, xPos-7, yPos);
			g.drawLine(xPos, yPos-13, xPos, yPos-7);
			g.drawArc(xPos-13,yPos-13,13,13,0,-90);			
			break;
		case "VERT":
			g.drawLine(xPos, yPos-13, xPos, yPos+13);
			break;
		case "HORZ":
			g.drawLine(xPos-13, yPos, xPos+13, yPos);
			break;
		case "SMALL":
			g.setColor(Color.WHITE);
			g.fillOval(xPos, yPos, 6, 6);
			break;
		case "BIG":
			g.setColor(Color.WHITE);
			g.fillOval(xPos, yPos, 12, 12);
			break;
		case "CHERRY":
			try {
			BufferedImage image = ImageIO.read(getClass().getResource("/images/cherry.png"));
			g.drawImage(image, 400, 400, 26,26, null);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			break;
		}
		
	}

	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}
	
}
