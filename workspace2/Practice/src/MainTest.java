import java.awt.*;
import java.awt.datatransfer.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;


public class MainTest {


	// 下面三个位图分别代表棋盘、黑子、白子
	BufferedImage table;
	BufferedImage black;
	BufferedImage white;
	// 当鼠标移动时候的选择框
	BufferedImage selected;
	// 定义棋盘的大小
	private static int BOARD_SIZE = 15;
	// 定义棋盘宽、高多少个像素
	private final int TABLE_WIDTH = 535;
	private final int TABLE_HETGHT = 536;
	// 定义棋盘坐标的像素值和棋盘数组之间的比率。
	private final int RATE = TABLE_WIDTH / BOARD_SIZE;
	// 定义棋盘坐标的像素值和棋盘数组之间的偏移距。
	private final int X_OFFSET = 5;
	private final int Y_OFFSET = 6;
	// 定义一个二维数组来充当棋盘
	private String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
	// 五子棋游戏的窗口
	JFrame f = new JFrame("五子棋游戏");
	// 五子棋游戏棋盘对应的Canvas组件
	ChessBoard chessBoard = new ChessBoard();
	// 当前选中点的坐标
	private int selectedX = -1;
	private int selectedY = -1;
	public void init()throws Exception
	{
		table = ImageIO.read(this.getClass().getResource("board.jpg"));
		black = ImageIO.read(this.getClass().getResource("black.gif"));
		white = ImageIO.read(this.getClass().getResource("white.gif"));
		selected = ImageIO.read(this.getClass().getResource("selected.gif"));
		// 把每个元素赋为"╋"，"╋"代表没有棋子
		for (int i = 0 ; i < BOARD_SIZE ; i++)
		{
			for ( int j = 0 ; j < BOARD_SIZE ; j++)
			{
				board[i][j] = "╋";
			}
		}
		chessBoard.setPreferredSize(new Dimension(
			TABLE_WIDTH , TABLE_HETGHT));
		chessBoard.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				// 将用户鼠标事件的坐标转换成棋子数组的坐标。
				int xPos = (int)((e.getX() - X_OFFSET) / RATE);
				int yPos = (int)((e.getY() - Y_OFFSET ) / RATE);
				board[xPos][yPos] = "●";
				/*
				电脑随机生成两个整数，作为电脑下棋的坐标，赋给board数组。
				还涉及:
				1.如果下棋的点已经有棋子，不能重复下棋。
				2.每次下棋后，需要扫描谁赢了
				*/
				chessBoard.repaint();
			}
			// 当鼠标退出棋盘区后，复位选中点坐标
			public void mouseExited(MouseEvent e)
			{
				selectedX = -1;
				selectedY = -1;
				chessBoard.repaint();
			}
		});
		chessBoard.addMouseMotionListener(new MouseMotionAdapter()
		{
			// 当鼠标移动时，改变选中点的坐标
			public void mouseMoved(MouseEvent e)
			{
				selectedX = (e.getX() - X_OFFSET) / RATE;
				selectedY = (e.getY() - Y_OFFSET) / RATE;
				chessBoard.repaint();
			}
		});
		f.add(new JButton("TEST"),BorderLayout.SOUTH);
		f.add(chessBoard,BorderLayout.CENTER);
		
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)throws Exception
	{ SetFont.setDefaultSize(40);
		MainTest gb = new MainTest();
		gb.init();
	}
	class ChessBoard extends JPanel
	{
		// 重写JPanel的paint方法，实现绘画
		public void paint(Graphics g)
		{
			// 将绘制五子棋棋盘
			g.drawImage(table , 0 , 0 , null);
			// 绘制选中点的红框
			if (selectedX >= 0 && selectedY >= 0)
				g.drawImage(selected , selectedX * RATE + X_OFFSET ,
			selectedY * RATE + Y_OFFSET, null);
			// 遍历数组，绘制棋子。
			for (int i = 0 ; i < BOARD_SIZE ; i++)
			{
				for ( int j = 0 ; j < BOARD_SIZE ; j++)
				{
					// 绘制黑棋
					if (board[i][j].equals("●"))
					{
						g.drawImage(black , i * RATE + X_OFFSET
							, j * RATE + Y_OFFSET, null);
					}
					// 绘制白棋
					if (board[i][j].equals("○"))
					{
						g.drawImage(white, i * RATE  + X_OFFSET
							, j * RATE  + Y_OFFSET, null);
					}
				}
			}
		}
	}

}