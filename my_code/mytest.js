function fun2(){
         		alert("hello world!");
         	}
function fun3(){
				var temp=1000
         		alert("hello world!"+temp);
         		alert(temp);
         	}
// 分支条件判断
function fun4(){
				var score=91
				score=Math.floor(score/10)
         		switch(score){
		    		case 9:
		    			alert("等价a");
		    			break;
		    		case 8:
		    			alert("等价b");
		    			break;
		}
         	}
function fun5(a,b){
	var f1=new Function("a","b","return a+b;");
	var result=f1(a,b)
	alert(result);
	var add=function(a,b){return a+b;}
	alert(add(10,100))

}