package chat;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChatClient extends Frame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	TextField msgText = new TextField();
	TextField msgArea = new TextField(); 
	

	public void launch() {
		//设置位置,大小,布局管理器
		setLocation(200,200);
		setSize(380,500);
		setLayout(new GridLayout(2,1));
		
		//添加窗口关闭监听
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//添加组件
		add(msgText, BorderLayout.NORTH);
		add(msgArea, BorderLayout.SOUTH);
		pack();
		
		//设置窗口可见
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		//启动窗口
		new ChatClient().launch();
	}
	
}

