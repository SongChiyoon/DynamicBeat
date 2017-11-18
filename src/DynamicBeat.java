import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.util.*;
import java.awt.*;

public class DynamicBeat extends JFrame{
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	//�ܼ��� �̹����� ȭ�鿡 ���� ���۸��� ���ϴ�. -> ���� ���۸�(���ۿ� ������ �̹����� �� ���� �����ϴ±��)�� ���ؼ� ���۸��� �ذ�����.

	public DynamicBeat(){
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // ���α׷� ����� ����
		setVisible(true);
		
		//Main.class.getResouce : Main ��ġ���� ���ҽ��� ����´�.
		this.introBackground = new ImageIcon(Main.class.getResource("images/intro_background.jpg")).getImage();
	}
	
	//JFrame���� ���� ù��°�� �׸��� �׷��ִ� �Լ�
	public void paint(Graphics g){  
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics(); //image���� �׷����� �޾ƿ�
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null); //ȭ�鿡 screenImage�� �׷�����.
	}

	private void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
		
	}
}
