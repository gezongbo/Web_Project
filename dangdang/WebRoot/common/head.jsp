<%@page contentType="text/html;charset=utf-8"%>
<link href="/dang/css/book_head090107.css" rel="stylesheet" type="text/css" />
<div class="head_container">
	<div class="head_welcome">
		<div class="head_welcome_right">
			
			<span class="head_welcome_text"> </span>
			<span class="head_welcome_text"> <span class="little_n">
					| <a href="#" name="mydangdang" class="head_black12a">我的当当</a> | <a
					href="#" name="helpcenter" class="head_black12a" target="_blank">帮助</a>
					| </span> </span>
			<div class="cart gray4012">
				<a href="../cart/showcart.action">购物车</a>
			</div>
		</div>
		<span class="head_toutext" id="logininfo">
		</span>
	</div>
	<div class="head_head_list">
		<div class="head_head_list_left">
			<span class="head_logo"><a href="../main/to_main.action" name="backtobook"><img
						src="/dang/images/booksaleimg/book_logo.gif" /> </a> </span>
		</div>
		<div class="head_head_list_right">

			<div class="head_head_list_right_b">
			</div>
		</div>
	</div>
	<script type="text/javascript">
	$(function(){
	   $("#searchBtn").click(function(){
	    var str=$("#search").val();
	    var value=$.trim(str);
	    $("#searchValue").val(value);
	    if(value==""){
	    alert("输入不能为空！");
	    }else{
	      $("form:first").submit();
	    }
	  });
	});
	
	</script>
	<div class="head_search_div">
	   <div style="position: relative;float: right ;top:3px;right:3px" >
	   <form action="../main/search.action" method="post">
	      <input id="searchValue"  name="key" type="hidden" />
	      <div style="position: relative;float: left;">搜索:&nbsp;<input id="search"  name="str" type="text"  width="7px" /></div>
	      <div style="position: relative;float: right ;"><a id="searchBtn"href="#"  ><img src="../images/search.gif"/></a></div>
	   </form>
	   </div>
	</div>
	<div class="head_search_bg"></div>
</div>
