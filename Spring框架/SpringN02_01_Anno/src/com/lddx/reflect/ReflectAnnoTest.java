package com.lddx.reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class ReflectAnnoTest {
	public static void main(String[] args) {
		Police.fakuan();
		//���/�ж�Police���Ƿ����澯�죬�жϵ�������Police�����Ƿ���JCZע�⣬����У�����ľ��죬��֮�Ǽٵľ���
		//���if����������˵��Police���ϵ�ע����JCZע��
		if(Police.class.isAnnotationPresent(JCZ.class)){
			//��һ���жϾ���ļ���
			//��ȡPolice����JCZ���ע��
			JCZ jczAnno=Police.class.getAnnotation(JCZ.class);
			//System.out.println(jczAnno.value());
			if(jczAnno.value().equals("����")){
				System.out.println("��磬�ٷ��㣬50�в�...");
			}else if(jczAnno.value().equals("����")){
				System.out.println("��磬����200�����㣬��������...");
			}else if(jczAnno.value().equals("�̾�")){
				System.out.println("��Ǯ�Ͻ����룬�������ɶ��....");
			}
		}else{  //Police����û��ע�����������ע��
			System.out.println("����پ��죬��һ�٣��͵��ɳ���");
		}
	}
}
//�������
@SFZ()
@JCZ("����")
class Police{
	public static void fakuan(){
		System.out.println("���������ã��������ˣ�����200Ԫ...");
	}
}
//�Զ���һ��ע�� --����֤
//@Target(value={ElementType.TYPE})
@Target(ElementType.TYPE)     //JCZע��ֻ��������ʹ��
@Retention(RetentionPolicy.RUNTIME)  //ע��Ϊȫ�׶μ��𣬿���ʹ�÷���ע��
@interface JCZ{
	//����һ������ --����ļ��𣨸������������̾���
	String value();
}


@Target(ElementType.TYPE)   //���֤
@Retention(RetentionPolicy.RUNTIME)
@interface SFZ{
	
}



