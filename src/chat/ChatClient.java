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
		//����λ��,��С,���ֹ�����
		setLocation(200,200);
		setSize(380,500);
		setLayout(new GridLayout(2,1));
		
		//��Ӵ��ڹرռ���
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//������
		add(msgText, BorderLayout.NORTH);
		add(msgArea, BorderLayout.SOUTH);
		pack();
		
		//���ô��ڿɼ�
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		//��������
		new ChatClient().launch();
	}
	
}

