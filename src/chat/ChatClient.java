package chat;

import java.awt.Frame;

public class ChatClient extends Frame {

	public void launch() {
		//����λ��,��С
		setLocation(200,200);
		setSize(380,500);
		
		//���ô��ڿɼ�
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		//��������
		new ChatClient().launch();
	}
	
}

