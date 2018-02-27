package databasetools.ui.frame;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import databasetools.ui.frame_1600x900.InquiryContract_1600x900;
import databasetools.ui.frame_1600x900.OneTouchCredit_1600x900;
import databasetools.ui.frame_1920x1080.InquiryContract_1920x1080;
import databasetools.ui.frame_1920x1080.OneTouchCredit_1920x1080;
import databasetools.util.*;

@SuppressWarnings("serial")
public class HomePageWindow  extends JFrame{
	
	/** 主面板 */
	private JPanel MainPanel;

	/** 查询合同费用选项 */
	private JButton InquiryContractOption;

	/** 一键生成合同选项 */
	private JButton OneTouchCreditOption;
	
	public static HomePageWindow getInstance() {
		HomePageWindow inst = new HomePageWindow();
		inst.setLocationRelativeTo(null);
		inst.setVisible(true);
		return inst;
	}
	
	public HomePageWindow() {
		super();
		initGUI();
		initListener();
	}
	
	private void initGUI() {
	    try {			
			setTitle("By:小智出品，必属精品-----欢迎使用<即有宝>信息查询系统  ");
			setSize(1200,600);
			setLocation(0,0);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			MainPanel = new JPanel() {
//			//设置背景图片	
//			private static final long serialVersionUID = 1L;
//			  protected void paintComponent(Graphics g) {
//					super.paintComponent(g);
//					g.drawImage(PictureUtil.getPicture("HomePage.png").getImage(), 0, 0, null);
//					this.setOpaque(false);
//			  }
			};
			MainPanel.setLayout(null);
			getContentPane().add(MainPanel, BorderLayout.CENTER);
			MainPanel.setBorder(Constants.GRAY_BORDER);
			
			InquiryContractOption = new JButton("查询合同费用");
			InquiryContractOption.setFont(Constants.BASIC_FONT5);
			InquiryContractOption.setBounds(350, 220, 200, 100);
			MainPanel.add(InquiryContractOption);
			
			OneTouchCreditOption = new JButton("一键生成合同");
			OneTouchCreditOption.setFont(Constants.BASIC_FONT5);
			OneTouchCreditOption.setBounds(650, 220, 200, 100);
			MainPanel.add(OneTouchCreditOption);
			
			setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void initListener() {
				
		//查询合同费用详情选项事件
		InquiryContractOption.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
//				loginButton.setIcon(PictureUtil.getPicture("login_button.png"));
				InquiryContractOption.setBorder(null);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				InquiryContractOption.setBorder(Constants.GRAY_BORDER);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Querycontrac();
			}
		});

		//一键生成合同选项事件
		OneTouchCreditOption.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
//				loginButton.setIcon(PictureUtil.getPicture("login_button.png"));
				OneTouchCreditOption.setBorder(null);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				OneTouchCreditOption.setBorder(Constants.GRAY_BORDER);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				CreateCredit();
			}
		});			
	}
	
	//查询合同详情选项按钮处理事件
	private void Querycontrac() {
		super.setVisible(false);	
		InquiryContract_1920x1080.getInstance();
//		InquiryContract_1600x900.getInstance();
	}
	
	//一键生成合同选项按钮处理事件
	private void CreateCredit() {
		super.setVisible(false);
		OneTouchCredit_1920x1080.getInstance();
//		OneTouchCredit_1600x900.getInstance();
	}	
}
