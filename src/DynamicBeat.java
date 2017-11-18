import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	
	public DynamicBeat(){
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 프로그램 종료시 종료
		setVisible(true);
	}
}
