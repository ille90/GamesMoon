package tetris.model;

import java.awt.Color;
import java.awt.Rectangle;

// holds data --> essential part of which the tetromino consists of
public class TetrisBlockModel {
	// rectangle should be a square
	private int m_Length;
	private Rectangle m_Rectangle;
	private Color m_Color;
	private boolean m_Visible;

	public TetrisBlockModel() {
		m_Rectangle = new Rectangle();
	}
	
	public int getLength() {
		return m_Length;
	}

	public void setLength(int length) {
		this.m_Length = length;
		m_Rectangle.height = length;
		m_Rectangle.width = length;
	}

	public void setPosition(int x, int y) {
		m_Rectangle.x = x;
		m_Rectangle.y = y;
	}
	
	public Rectangle getRectangle() {
		return m_Rectangle;
	}
	
	public Color getColor() {
		return m_Color;
	}

	public void setColor(Color color) {
		this.m_Color = color;
	}

	public boolean isVisible() {
		return m_Visible;
	}

	public void setVisibility(boolean visibility) {
		this.m_Visible = visibility;
	}
}
