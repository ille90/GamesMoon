package tetris.model;

import java.awt.Color;
import java.awt.Point;

import static tetris.common.TetrisPlayingAreaConfiguration.*;

// holds the data of the tetrominos placed on the playing field
public class TetrisMatrixModel {
	// Width and height should be calculated relatively to the blocksize
	private int m_Width = TETRISBLOCK_WIDTH;
	private int m_Height = TETRISBLOCK_HEIGHT;
	private int m_TetrisBlockLength = TETRISBLOCK_LENGTH;
	private Color m_BackgroundColor;
	private TetrisBlockModel[][] m_TetrisBlockMatrix;
	private Point m_Position;
	
	public TetrisMatrixModel() {
		m_TetrisBlockMatrix = new TetrisBlockModel[m_Width][m_Height];
		m_BackgroundColor = Color.GRAY;
		m_Position = new Point(0,0);
	}
	
	public TetrisMatrixModel(int tetrisBlockLength, int width, int heigth, Color backgroundColor) {
		this.m_TetrisBlockLength = tetrisBlockLength;
		this.m_Width = width;
		this.m_Height = heigth;
		
		m_TetrisBlockMatrix = new TetrisBlockModel[m_Width][m_Height];
		m_BackgroundColor = backgroundColor;
	}

	public TetrisBlockModel[][] getTetrisBlockMatrix() {
		return m_TetrisBlockMatrix;
	}

	public Color getBackgroundColor() {
		return m_BackgroundColor;
	}

	public void setBackgroundColor(Color backgroundColor) {
		this.m_BackgroundColor = backgroundColor;
	}

    public Point getPosition()
    {
        return m_Position;
    }

    public void setPosition(Point position)
    {
        this.m_Position = position;
    }
}