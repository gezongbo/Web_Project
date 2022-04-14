//完成配送地址页面的验证

//延迟加载函数
$(function(){
	var flagReceiveName=false;  //收件人
	var flagFullAddress=false;   //详细地址
	var flagPostalCode=false;   //邮政编码
	var flagPhone=false;   //电话
	var flagMobile=false;   //手机
	
	
	//1、收件人姓名验证
	//验证：是否为空
	$("#receiveName").blur(function(){
		//获取收件人姓名输入的内容
		//var receiveName=$("#receiveName").val();
		var receiveName=$(this).val();
		//alert(receiveName);
		if(receiveName.length==0){     //为空的情况
			$("#nameValidMsg").html("<img src='images/wrong.gif'/>");
			flagReceiveName=false;
		}else{    //不为空的情况
			$("#nameValidMsg").html("<img src='images/right.gif'/>");
			flagReceiveName=true;
		}
	});
	
	
	//2、收件人详细地址的验证
	//验证：是否为空
	$("#fullAddress").blur(function(){
		//获取收件人详细地址的内容
		var fullAddress=$(this).val();
		if(fullAddress.length==0){     //为空的情况
			$("#addressValidMsg").html("<img src='images/wrong.gif'/>");
			flagFullAddress=false;
		}else{    //不为空的情况
			$("#addressValidMsg").html("<img src='images/right.gif'/>");
			flagFullAddress=true;
		}
	});

	//3、邮政编码的验证
	//验证：是否为空
	//    格式验证
	$("#postalCode").blur(function(){
		//邮政编码输入框输入的内容
		var postalCode=$(this).val();
		if(postalCode.length==0){
			$("#codeValidMsg").html("<img src='images/wrong.gif'/>");
			flagPostalCode=false;
		}else{//不为空的情况下
			//验证格式是否正确
			var reg=/^[1-9]\d{5}(?!\d)$/;
			if(reg.test(postalCode)){  //正确的情况
				$("#codeValidMsg").html("<img src='images/right.gif'/>");
				flagPostalCode=true;
			}else{  //不正确的情况
				$("#codeValidMsg").html("<img src='images/wrong.gif'/>");
				flagPostalCode=false;
			}
		}
	});
	
	

	//4、电话的验证
	//验证： 格式验证
	$("#phone").blur(function(){
		//电话输入框的内容
		var phone=$(this).val();
		var reg=/^\d{3}-\d{8}|\d{4}-\d{7}$/;
		if(reg.test(phone)){   //格式正确的情况
			$("#phoneValidMsg").html("<img src='images/right.gif'/>");
			flagPhone=true;
		}else{  //格式不正确的情况
			$("#phoneValidMsg").html("<img src='images/wrong.gif'/>");
			flagPhone=false;
		}
	});

	//5、手机的验证
	//验证：是否为空
	//    格式的验证
	$("#mobile").blur(function(){
		//获取手机输入框输入的内容
		var mobile=$("#mobile").val();
		if(mobile.length==0){     //为空的情况
			$("#mobileValidMsg").html("<img src='images/wrong.gif'/>");
			flagMobile=false;
		}else{  //不为空的情况   
			var reg=/^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/;   
			if(reg.test(mobile)){  //格式正确
				$("#mobileValidMsg").html("<img src='images/right.gif'/>");
				flagMobile=true;
			}else{  //格式不正确的情况
				$("#mobileValidMsg").html("<img src='images/wrong.gif'/>");
				flagMobile=false;
			}
		}
	});
	
	//定时器，每间隔1秒检测以上验证是否都通过
	//如果都通过，可以点击下一步；否则下一步不可以点击
	window.setInterval(function(){
		if(flagReceiveName&&flagFullAddress&&flagPostalCode&&flagPhone&&flagMobile){
			$("#next").attr("disabled","");s
		}else{  
			$("#next").attr("disabled","disabled");
		}
	},1000);
	
	
	
});





