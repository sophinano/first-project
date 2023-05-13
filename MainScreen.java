import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame{
	
	private JPanel mainPanel = new JPanel();						//바탕 패널
	private JPanel topPanel = new JPanel();							//제목 패널
		private JLabel topLabel = new JLabel("메인화면");				//제목 요소
	 
			
	public MainScreen()
	{	
		//바탕 패널 설정
		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		setContentPane(mainPanel);
		
		//제목 요소
		topPanel.add(topLabel);

		//바탕 패널에 추가하기
		mainPanel.add(topPanel);
		
		//각 패널 사이즈 설정
		topPanel.setPreferredSize(new Dimension(500, 200));
		
		//바탕 패널, 전체 화면 관련 설정
		setResizable(false);
		setVisible(true);
		setSize(600,600);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}