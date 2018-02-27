package databasetools;

import java.awt.BorderLayout;  
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;  
import javax.swing.JPanel;

import databasetools.util.Constants;  
  
public class Test  
{  
    public static void main(String[] args)  
    {  
        JFrame frame = new JFrame("xxx");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setLocation(400, 200);  
  
        frame.setLayout(new GridLayout());  
  
        JPanel left = new JPanel();  
        left.setPreferredSize(new Dimension(300, 100));  
//        JPanel right = new JPanel();  
//        right.setPreferredSize(new Dimension(200, 320));  
  
        left.setLayout(new GridLayout());  
        JButton InquiryContractOption = new JButton("查询合同费用");
		InquiryContractOption.setFont(Constants.BASIC_FONT5);
		InquiryContractOption.setBounds(0, 0, 0, 0);

        JButton OneTouchCreditOption = new JButton("一键生成合同");
		OneTouchCreditOption.setFont(Constants.BASIC_FONT5);
		OneTouchCreditOption.setBounds(0, 0, 0, 0);
  
        left.add(InquiryContractOption, BorderLayout.CENTER);  
        left.add(OneTouchCreditOption, BorderLayout.SOUTH);  
  
//        right.setLayout(new BorderLayout());  
//        JPanel right_1 = new JPanel();  
//        right_1.setBackground(Color.WHITE);  
//        right_1.setPreferredSize(new Dimension(200, 100));  
//  
//        JPanel right_2 = new JPanel();  
//        right_2.setBackground(Color.BLUE);  
//        right_2.setPreferredSize(new Dimension(200, 100));  
//  
//        JPanel right_3 = new JPanel();  
//        right_3.setBackground(Color.BLACK);  
//        right_3.setPreferredSize(new Dimension(200, 120));  
//  
//        right.add(right_1, BorderLayout.NORTH);  
//        right.add(right_2, BorderLayout.CENTER);  
//        right.add(right_3, BorderLayout.SOUTH);  
  
        frame.add(left, BorderLayout.CENTER);  
//        frame.add(right, BorderLayout.EAST);  
  
        frame.setVisible(true);  
        frame.pack();  
    }  
} 