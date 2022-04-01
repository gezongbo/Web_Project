package com.lddx.test;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test {
	public static void main(String[] args) {
		//Student stu=new Student();
		//stu.id=100;
		//stu.study();
		//Animal ani=new Animal();
		//∂‡Ã¨
		Animal ani=new Cat();
		ani.shout();
		ani.huxi();
		Cat cat=new Cat();
		cat.shout();
		cat.huxi();
		//Person p=new Person();
		Person p=new Teacher();
		Teacher t=new Teacher();
		
		
		MouseListener mouse=new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		
	}

	
	public class A implements WindowListener{

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
}
