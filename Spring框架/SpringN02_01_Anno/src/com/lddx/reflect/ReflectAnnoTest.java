package com.lddx.reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class ReflectAnnoTest {
	public static void main(String[] args) {
		Police.fakuan();
		//检查/判断Police类是否是真警察，判断的依据是Police类上是否有JCZ注解，如果有，是真的警察，反之是假的警察
		//如果if条件成立，说明Police类上的注解是JCZ注解
		if(Police.class.isAnnotationPresent(JCZ.class)){
			//进一步判断警察的级别
			//获取Police类上JCZ这个注解
			JCZ jczAnno=Police.class.getAnnotation(JCZ.class);
			//System.out.println(jczAnno.value());
			if(jczAnno.value().equals("辅警")){
				System.out.println("大哥，少罚点，50行不...");
			}else if(jczAnno.value().equals("交警")){
				System.out.println("大哥，这是200，给你，不够还有...");
			}else if(jczAnno.value().equals("刑警")){
				System.out.println("交钱赶紧撤离，别查出别的啥事....");
			}
		}else{  //Police类上没有注解或者是其它注解
			System.out.println("你个假警察，揍一顿，送到派出所");
		}
	}
}
//警察对象
@SFZ()
@JCZ("辅警")
class Police{
	public static void fakuan(){
		System.out.println("敬个礼，您好，您超速了，罚款200元...");
	}
}
//自定义一个注解 --警察证
//@Target(value={ElementType.TYPE})
@Target(ElementType.TYPE)     //JCZ注解只能在类上使用
@Retention(RetentionPolicy.RUNTIME)  //注解为全阶段级别，可以使用反射注解
@interface JCZ{
	//定义一个属性 --警察的级别（辅警、交警、刑警）
	String value();
}


@Target(ElementType.TYPE)   //身份证
@Retention(RetentionPolicy.RUNTIME)
@interface SFZ{
	
}



