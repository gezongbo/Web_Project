//延迟加载函数
$(function(){
	
	var flagEmail=false;         //邮箱标记
	var flagNickname=false;      //昵称标记
	var flagPwd=false;           //密码标记
	var flagRepeatPwd=false;     //重复密码标记
	var flagCode=false;          //验证码标记
	
	
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
			flagEmail=false;
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
							flagEmail=false;
						}else if(msg==0){
							$("#emailInfo").text("邮箱可以使用");
							$("#emailInfo").css("color","green");
							flagEmail=true;
						}
					}    
				});
			}else{  //邮箱格式不正确的情况
				$("#emailInfo").text("邮箱格式不正确");
				$("#emailInfo").css("color","red");
				flagEmail=false;
			}
		}
	});
	

	//2、昵称的验证
	//昵称不能为空的验证
	//昵称格式的验证
	$("#txtNickName").blur(function(){
		//昵称输入框中输入的内容
		var txtNickName=$("#txtNickName").val();
		if(txtNickName.length==0){   //昵称为空的情况
			$("#nameInfo").html("昵称不能为空").css("color","red");
			flagNickname=false;
		}else{  //昵称不为空的情况
			var reg=/^[a-z0-9\u4e00-\u9fa5]{4,20}$/;
			if(reg.test(txtNickName)){  //条件成立，说明昵称格式正确
				$("#nameInfo").html("昵称可以使用").css("color","green");
				flagNickname=true;
			}else{  //条件不成立，说明昵称格式不正确
				$("#nameInfo").html("昵称格式不正确").css("color","red");
				flagNickname=false;
			}
		}
	});
	
	//3、密码的验证
	//密码不能为空的验证
	//密码格式的验证
	var p;
	$("#txtPassword").blur(function(){
		//密码输入框的内容
		var txtPassword=$('#txtPassword').val();
		p=txtPassword;
		if(txtPassword.length==0){   //密码为空的情况
			$("#passwordInfo").html("密码不能为空").css("color","red");
			flagPwd=false;
		}else{  //密码不为空的情况
			var reg=/^[a-zA-Z0-9]{6,20}$/;
			if(reg.test(txtPassword)){   //密码格式正确的情况
				$("#passwordInfo").html("密码可以使用").css("color","green");
				flagPwd=true;
			}else{  //密码格式不正确的情况
				$("#passwordInfo").html("密码格式不正确").css("color","red");
				flagPwd=false;
			}
		}
	});
	
	//4、重复密码的验证
	//重复密码不能为空的验证
	//重复密码和密码一致的验证
	$("#txtRepeatPass").blur(function(){
		//重复密码输入框的内容
		var txtRepeatPass=$("#txtRepeatPass").val();
		if(txtRepeatPass.length==0){   //重复密码为空的情况
			$("#password1Info").text("重复密码不能为空").css("color","red");
			flagRepeatPwd=false;
		}else{  //重复密码不为空的情况
			//验证重复密码和密码一致性的验证
			//p是密码的内容    txtRepeatPass是重复密码的内容
			if(p==txtRepeatPass){   //条件成立，密码和重复密码一致的情况
				$("#password1Info").text("两次密码一致").css("color","green");
				flagRepeatPwd=true;
			}else{  //条件不成立，密码和重复密码不一致的情况
				$("#password1Info").text("重复密码要和密码一致").css("color","red");
				flagRepeatPwd=false;
			}
		}
	});
	

	
	//5、验证码的验证
	//验证码不能为空的验证
	//验证码和验证码图片内容一致性的验证
	$("#validateCode").blur(function(){
		//获取验证码输入框输入的内容
		var validateCode=$("#validateCode").val();
		if(validateCode.length==0){     //验证码内容为空的情况
			$("#numberInfo").html("验证码不能为空").css("color","red");
			flagCode=false;
		}else{   //不为空的情况
			//将验证码的内容通过ajax，发送到服务器端，由服务器端来负责验证
			$.ajax({
				type:"get",
				url:"checkcode",
				data:{code:validateCode},    //xxx?code=32sd
				success:function(m){
					if(m==1){  //验证码输入正确的情况
						$("#numberInfo").html("验证码填写正确").css("color","green");
						flagCode=true;
					}
					if(m==0){  //验证码输入错误的情况
						$("#numberInfo").html("验证码不正确").css("color","red");
						flagCode=false;
					}
				}
			});
		}
	});
	
	
	//6、限制表单提交的验证
	//$("#f").submit(function(){
		//return flagEmail&&flagNickname&&flagPwd&&flagRepeatPwd&&flagCode;
	//});
	
	//7、当注册表单的全部内容验证通过，恢复注册按钮为可点击状态，否则就是默认的不可点击状态
	//每间隔1秒钟执行function函数里的内容
	window.setInterval(function(){
		var result=flagEmail&&flagNickname&&flagPwd&&flagRepeatPwd&&flagCode;
		if(result){     //表单全部内容验证通过的情况
			$("#btnClientRegister").attr("disabled","");
		}else{   //有未验证通过的情况
			$("#btnClientRegister").attr("disabled","disabled");
		}	
	},1000);
	
	
	
	
	
	
	
});

