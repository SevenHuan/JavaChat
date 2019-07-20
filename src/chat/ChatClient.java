package chat;

import java.awt.Frame;

public class ChatClient extends Frame {

	public void launch() {
		//设置位置,大小
		setLocation(200,200);
		setSize(380,500);
		
		//设置窗口可见
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		//启动窗口
		new ChatClient().launch();
	}
	
}

