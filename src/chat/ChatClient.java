package chat;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient extends Frame {
	
	private static final long serialVersionUID = 1L;
	TextField msgText = new TextField();
	TextArea msgArea = new TextArea(); 
	

	public void launch() {
		//设置位置,大小
		setLocation(400,300);
		setSize(300,500);
		
		//添加窗口关闭监听
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//添加组件
		add(msgText, BorderLayout.SOUTH);
		add(msgArea, BorderLayout.NORTH);
		pack();
		
		//文本框发送事件
		msgText.addActionListener(new msgTextListener());
		
		//设置窗口可见
		setVisible(true);
	}
	
	private class msgTextListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = msgText.getText().trim();
			msgArea.setText(s);
			msgText.setText("");

			try {
				Socket socket = new Socket("127.0.0.1",7899);
				OutputStream os = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				dos.writeUTF(s);
				dos.flush();
				dos.close();
			
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}

	}
	
	public static void main(String[] args) {
		//启动窗口
		new ChatClient().launch();
		
	}
	
}

