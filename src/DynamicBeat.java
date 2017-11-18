import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.util.*;
import java.awt.*;

public class DynamicBeat extends JFrame{
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	//단순히 이미지를 화면에 띄우면 버퍼링이 심하다. -> 더블 버퍼링(버퍼에 적합한 이미지를 매 순간 생성하는기법)을 통해서 버퍼링을 해결하자.

	public DynamicBeat(){
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 프로그램 종료시 종료
		setVisible(true);
		
		//Main.class.getResouce : Main 위치에서 리소스를 갖고온다.
		this.introBackground = new ImageIcon(Main.class.getResource("images/intro_background.jpg")).getImage();
	}
	
	//JFrame에서 가장 첫번째로 그림을 그려주는 함수
	public void paint(Graphics g){  
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics(); //image에서 그래픽을 받아옴
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null); //화면에 screenImage가 그려진다.
	}

	private void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
		
	}
}
