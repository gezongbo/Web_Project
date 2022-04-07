//延迟加载函数
$(function(){
	
	//1、邮箱的验证
	//邮箱不能为空的验证
	//邮箱格式的验证  -- 正则表达式
	//邮箱是否已经被注册过的验证  --  访问服务器端，通过服务器查询数据库中是否已经注册过  -- ajax技术
	$("#email").blur(function(){
		//先获取邮箱输入框的内容
		var email=$("#email").val()
		if(email.length==0){   //邮箱输入框未填内容
			$("#emailInfo").text("邮箱不能为空");
			$("#emailInfo").css("color","red");
		}else{  //邮箱输入框输入内容的情况
			var reg=/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;  //邮箱的正则表达式
			if(reg.test(email)){   //邮箱格式正确的情况
				//进一步判断邮箱是否已经被注册过
				//使用ajax技术异步的访问服务器端-- jquery框架实现ajax的方式
				$.ajax({
					type:"get",        //访问服务器的方式  get方式、  post方式
					url:"checkemail",  //访问服务器端Servlet的url-pattern地址
					data:{emaildata:email}, //访问服务器时传递的参数  ...080/dangdang/checkemail?emaildata=abc@qq.com
					success:function(msg){  //接收服务器端的返回结果
						if(msg==1){
							$("#emailInfo").text("邮箱已经被注册过了");
							$("#emailInfo").css("color","red");
						}else if(msg==0){
							$("#emailInfo").text("邮箱可以使用");
							$("#emailInfo").css("color","green");
						}
					}    
				});
			}else{  //邮箱格式不正确的情况
				$("#emailInfo").text("邮箱格式不正确");
				$("#emailInfo").css("color","red");
			}
		}
	});
	

	//2、昵称的验证
	//昵称不能为空的验证
	//昵称格式的验证
	$("#txtNickName").blur(function(){
		
	});
	
	//3、密码的验证
	//密码不能为空的验证
	//密码格式的验证
	
	//4、重复密码的验证
	//重复密码不能为空的验证
	//重复密码和密码一致的验证
	
	//5、验证码的验证
	//验证码不能为空的验证
	//验证码和验证码图片内容一致性的验证
	
});

