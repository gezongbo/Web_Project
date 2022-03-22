# Web_Project
学习Web前端开发和JavaWeb学习笔记和代码
# Web开发基础 –HTML
# 1、HTML基础语法
## 1.1HTML概述
### 1.1.1 web的工作原理

```html
- Client客户端/Server服务器架构
- Browser浏览器/Server架构
    B     S      DB
   浏览器服务器—>数据库服务器—>浏览器
```

### 1.1.2 Web开发的相关技术

```html
- 浏览器端：
    - HTML         页面的内容
    - CSS          页面的样式
    - JavaScirpt   页面的动态交互
    - JQuery       JS的框架
- 服务器端：
   - Servlet
   - JSP
   - SSM框架
```

### 1.1.3 web浏览器

```html
- IE浏览器
- Firefox 火狐浏览器
- Chrome 谷歌浏览器
- Safari  苹果
```

### 1.1.4 什么是HTML
   **HTML（Hyper Text Markup Language）超文本标记语言。
   HTML编写的文件必须以.html结尾,由浏览器解析执行**

## 1.2 HTML基本语法
### 1.2.1 标记

```html
- HTML用于描述功能的符号称为标记，比如 p、h1
- 标记在使用时必须使用尖括号括起来
- 有封闭类型标记，也有非封闭类型的标记
   - （1）封闭类型标记
      也叫双标记，必须成对出现，
      <开始标记>内容</结束标记>
     注意：如果一个应该封闭的标记没有封闭，就会出现意想不到的错误。
   - （2）非封闭类型的标记
      也叫单标记：<标记/>
      <br/>  <!--单标记，换行的作用-->
```


### 1.2.2 元素和属性

```html
- 元素：每一对尖括号包围的部分
  		三部分构成：开始标记+内容+结束标记
  		<h1>hello</h1> 称为h1元素
  		<p>你好</p> 称为p元素
- 属性：用来修饰元素的；
       属性写在开始标记中；
       可以写多个属性，多个属性用空格隔开；
       格式是  xx属性=”” 方式
- 通用属性：绝大多数都支持
       - <a id="">
       - <a class="">
       - <style>  样式，是CSS内联样式写法
```

### 1.2.3 注释
   **语法：<!—注释的内容 -->**

## 1.3 HTML文档的结构
### 1.3.1 文档结构

```html
分为三部分：
- (1)文档类型的声明—了解
- (2)文件头 <head></head>
- (3)文件体 <body></body>
说明：HTML文档要以<html>开始，以</html>结尾
```

### 1.3.2 文件头-head   

```html
- <title>标记： 设置网页的标题的
- <meta>标记：  1设置页面显示中文的编码
                2设置页面自刷新
- <script>标记：写JavaScript代码的
- <style>标记： 写CSS代码的
- <link>标记：  1 引入外部的CSS样式
                2 设置标题中的图标
```

# 2. body体中的标记
## 2.1 body体中的标记的分类
 

```html
  - 特殊字符的标记
     	空格&nbsp; 表示一个空格
     	小于&lt;   表示一个小于号
     	大于&gt;   表示一个大于号
   - 标题标记
     	是<hn>表示，n是1-6数字组成
     	<h1>到<h6>是标题1到标题6
     	能够将内容加粗，大小h1最大,h6最小
   - 段落标记
     	用<p>表示，表示一个独立的段落
   - 换行标记
     	<br/>一个换行
   - 字体标记
     	设置元素的字体、字号和颜色
       	<font face=”” size=”” color=””></font>
   - 加粗、斜体、下划线标记
		<b></b><strong></strong><!--加粗标记 --> 
		<i></i> <em></em><!--斜体标记 -->  
		<u></u><!--下划线标记 -->
   - 居中标记 
 		<center></center>
   - 分割线标记
     	在网页中画一条水平直线
 		<hr/>
   - 分区标记
     	常用于页面的布局
		(1)块分区标记：<div><div>
		(2)行内分区标记：<span></span>
```

## 2.2 标记的另一个分类

```html
（1）块标记：会另起一行的标记
	<h1> 、、、 <h6>   <p>  <center> <div>
（2）行内标记：不会另起一行的标记
	<font> <em> <i> <strong> <u>  <span>
```

# 3. 超链接和图片  
## 3.1 超链接

```html
   标记：<a>内容</a>
   属性：
	- <a href="">        超链接的跳转地址
	- <a target="">      超链接的跳转方式
    - <a href="_blank" > 新页面打开
    - <a href="_self" >  默认，本页面打开
```

## 3.2 图片

```html
   标记：<img />
   属性：
- <img src="" />     显示的图片的路径名称
- <img width="" />   设置图片的宽度
- <img height="" />  设置图片的高度
- <img title="" />   设置图片的标题
- <img border="" />  设置图片的边框
```

## 3.3 图片热点分割技术

```html
标记：
	<map>
     	<area shape="" coords=""></area>
	</map>
属性：要写在<area>标记中
   - shape=”” 区域的形状 rect矩形
   - coords=”” 坐标   
```

## 3.4 超链接的特殊使用1—返回页面顶部


```html
<a href=”#top”>xxxxx</a>
```

## 3.5 超链接的特殊使用2 –发送邮件

```html
<a href=”mailto:23434@qq.com”>xxxxx</a>
```

# 4. 列表
  

```html
 	列表是将具有相同特征或者具有先后顺序的几行文字进行对齐排列。
分类：
- （1）无序列表
	标记：无序<ul></ul>列表<li></li>
- （2）有序列表
	标记：有序<ol></ol> 列表<li></li>
```

# 5、表格
## 标记

```html
-  <table></table>表格的开始和结束
-  <tr></tr>表格的行
-  <td></td>表格的列
-  <caption></caption>表格的标题
-  <marquee></marquee>将内容飘动的效果
```

## 属性

```html
-  <tr border="" >     设置表格的边框
-  <tr cellspacing="" >设置表格行列之间的空隙
-  <tr width="" >      设置表格的宽度
-  <tr height="" >     设置表格的高度
 
- 水平对齐方式 (可用于<table> <tr>和<td>中)
	<table align="left/center/right">
- 垂直对齐方式 (只能用于<tr>或者<td>标记中)
	<tr valign="top/middle/bottom">

- 不规则表格的处理
     跨行：<tr rowspan="num">
     跨列：<tr colspan="num">
```

# 6. 表单
## 6.1 表单的作用
 

```html
用于显示、收集信息，并提交信息到服务器端，服务器接收到信息后在保存到数据库端。
    标记：<form></form>表单的开始和结束
```

## 6.2 表单项的分类
### （1）input标记系列
 

```html
 文本框     	<input type=”text” />
 密码框 		<input type=”password”/>
 单选		<input type=”radio”/>
 多选按钮	<input type=”checkbox”/>
 提交按钮	<input type=”submit” />
 重置按钮	<input type=”reset”/>
 普通按钮	<input type=”button”/>
         	--用于执行客户端的脚本，结合JS来使用
 隐藏域		<input type=”hidden”/>
         	--在表单中包含不希望用户看到的信息
 文本选择框：上传文件
       		<input type=”file”/>
```

### （2）非input标记系列
   

```html
    A  <label>标记
       --语法：<label>文本</label>
       --作用:将文本与控件绑定在一起，单击文本，效果如同单击空间一样
    B  选项框—下拉框
       	标记:<select><!--选项框的开始-->
				<option></option><!--选项框中的选项-->
			</select><!--选项框的结束-->		 
    C  多行文本框
       	标记:<textarea></textarea>
       	属性：cols指定多行文本框的列数
              rows指定行数
    D  控件分组
       	标记<fieldset></fieldset>为控件分组
           	<legend></legend>给分组指定一个标题
```

# Web开发基础---CSS

# 1 CSS概述
**概念** :CSS（Cascading Style Sheets）:层叠样式表，又叫级联样式表，简称样式表
**功能**：美化页面。

## 1.1 CSS的使用
### 1.1.1 CSS样式的使用方式

```html
 内联样式：写在开始标记中，针对单独的一个标记元素起作用
 内部样式：写在HTML页面中的<head>标记里
 外部样式：写在单独定义的一个以.css结尾的文件中，该文件要引入进来
```

### 1.1.2 CSS样式的优先级

```html
 - 浏览器默认设置样式
 - 外部样式或者内部样式  就近原则
 - 内联样式
	优先级由上往下，由低到高的
```

## 1.2 选择器(针对于外部样式或者内部样式)
### （1）元素选择器/标记选择器
### （2）类class选择器
```javascript
- 常规用法：
   先在开始标记中定义class=””属性
   选择器通过'.className{}'的方式调用
- 高级用法：
   将标记选择器和类选择器结合使用
   语法：标记选择器'.className{  }'
```

### （3）id选择器


```javascript
 - 根据id的值来查找
 - 先在开始标记中定义'id'的值，一般'id'的值是要保证唯一的
 - 选择器通过'#idName{}'的方式来获取
    说明：优先级'id>class>标记'
```


### （4）选择器分组

```javascript
- 一般将一些相同的样式作用于多个标记元素中
- 语法：将多个选择器写在一起，用逗号分隔开
```

### （5）派生选择器

```javascript
- 通过依据标记元素在其位置的上下文关系来定义样式
- 语法：选择器使用空格分隔开
  例如: h3 div span p{  xxxx  }
     <h3>
           <div>
				<span>
   				 <p id=” ”></p>
				</span>
			</div>
	 </h3>
```

### （6）伪类选择器

 

```javascript
   伪类用于向某些标记添加特殊的效果
   语法：使用冒号作为分隔符，左边是选择器，右边是伪类
   选择器:'link'       未访问
   选择器:'visited'    访问后
   选择器:'hover'      鼠标指向时
   选择器:'active'     鼠标按下时
```

# 2、尺寸和边框
## 2.1 尺寸/大小（宽度 高度）
 


```javascript
  'width'     宽度
  'height'    高度
  'overflow'  当内容溢出时如何处理
  'visible'   默认，内容超出会溢出
  'hidden'    超出部分隐藏
  'scroll'    显示滚动条，不管内容会不会溢出，都有有滚动条
  'auto'      自动适应，如果内容未溢出，不显示滚动条，如果内容溢出才会显示滚动条
```

## 2.2 边框

```css
--简单写法：
   border:width style color;    线宽 样式 颜色
 --单边写法1：
   border-left/right/top/bottom:width style color;
 --单边写法2
 border-left/right/top/bottom-width:  只设置边框的线宽
 border-left/right/top/bottom-style:  只设置边框的类型
 border-left/right/top/bottom-color:  只设置边框的颜色
```

## 2.3 框模型—盒子模型
 - **框模型/盒子模型包含：外边距+边框+内边距**
### （1）内边距:内容和边框之间的距离

```css
单边写法：
padding-left/right/top/bottom:value
简单写法：
padding:v1  v2  v3  v4   top right bottom left
```

### （2）外边距:与下一个控件之间的距离

```css
单边写法：
margin-left/right/top/bottom:value值
简单写法：
margin:v1   v2   v3    v4 top  right bottom  left
```

# 4、背景
## 4.1  背景颜色

```css
background-color:red/#ff0000;
```

## 4.2  背景图片

```css
background-image:url(“图片名称”);
```

### 4.2.1 背景图片的重复问题

```javascript
  - 默认情况下，背景图片在水平和垂直方向上重复出现，创建一种称为“墙纸”的效果。
  - 可以使用'background-repeat'属性控制背景图片的平铺效果
     1）'repeat'    默认,在垂直和水平方向重复
     2）'repeat-x'  仅在水平方向上重复
     3）'repeat-y'  仅在垂直方向上重复
     4）'no-repeat' 仅显示一次
```

### 4.2.2 背景定位
   

```css
  'background-position'属性改变图片在背景中的位置
  1）x y  第一个是水平位置
        第二个是垂直位置
  2）'left'     左边显示
     'center'    居中显示
     'right'     右边显示
     'top'       顶部显示
     'bottom'    底部显示
```

### 4.2.3 背景图片的固定

```css
 'background-attachment'
 --默认情况下，背景图片会随着页面的滚动而移动
 --可以通过'background-attachment'来设置
 	1)默认值'scroll'，会随着滚动而移动
	 2)'fixed'，固定，背景图片不会移动
```

# 5、文本
## 5.1 控制字体

```css
	font-family:字体;   设置字体的
	font-size:数字;  设置字体大小
	font-weight:nomal/bold;正常/粗体
```

## 5.2 控制文本格式


```css
 - 文本颜色  color:颜色
 - 文本排列（水平对齐方式）说明：只能用于块标记
   text-align:”left/center/right”
 - 文本修饰（下划线）
   text-decoration:none/underline
 - 行高
   line-height:数字距离
 - 首行文本缩进
   text-indent:数字距离
```

# 6、定位
## 6.1 定位的概念
 **定位：定义元素内容相对于其正常位置应该出现的位置。**

## 6.2  分类

```css
- 普通流定位（默认）
- 浮动定位
- 相对定位
- 绝对定位
- 固定定位
```

## 6.3 普通流定位（默认）

```css
- 块标记:页面中的块级标记从上到下一个接一个的排列；每一个块级标记都会出现在一个新行中。
- 行内标记:将在一行中从左往右水平排列；不需要从新行开始。
```

## 6.4 浮动定位

```css
- 浮动定位是指：
   		- 1）将元素排除在普通流定位之外
   		- 2）将元素浮动以后，可以向左边或者右边移动，直到碰到边框或者另一个浮动的元素为止。
  		- 3）浮动定位一般来实现特定的定位效果
- 浮动定位的属性：在CSS中，任何元素都可以浮动
	float:none/left/right;
- clear属性，用于清除浮动带来的影响。（定义了元素的那边上不允许出现浮动元素）
   	clear:none/left/right/both;
```


## 6.5 相对定位

```css
position属性：更改定位模式为相对、绝对或者固定定位
	position:relative/absolute/fixed
 - ①设置定位模式'relative'
 - ②偏移量 
	- 'left/right'水平位置的偏移
	- 'top/bottom'垂直偏移
- ③相对定位元素原本所占的空间保留
- ④相对定位是相对于它原来位置进行偏移的距离
```

## 6.6 绝对定位

```css
对元素进行绝对定位的设置，会让该元素从普通定位流中移除，不占用空间（理解为浮起来了效果）
- ①设置定位模式为'absolute'
- ②偏移量 
	- 'left/right'水平位置的偏移
	- 'top/bottom'垂直偏移
```

**堆叠顺序**

```css
- (1)一旦修改了元素的定位方式，则元素可能会发生堆叠。
- (2)可以使用'z-index'属性来控制元素出现堆叠的顺序。
- (3)'z-index'属性
  -- 值为数值，数值越大表示堆叠顺序更高，即离用户更近
  -- 数值可以设置为负值，表示离用户更远
```

## 6.7 固定定位

```css
设置固定定位：
- (1)设置'position'的值为'fixed'
- (2)也是通过'left top right bottom'来定义元素的位置

固定定位的特点：
- (1)固定定位会将元素从普通流定位中完全移除，不占用页面的空间。
- (2)当页面向下滚动时,不会跟着一起移动
```

# 7、显示方式

```css
（1）设置元素的显示隐藏
	display:none;/*让元素不再显示，不占用文档的空间*/
（2）设置块标记为行内标记特性
	display:inline;
（3）设置行内标记为块标记特性
	display:block;
```

# 8、光标

```css
使用cursor属性来设置光标的形状，可使用的值：
	- 'default'
	- 'pointer'
	- 'crosshair'
	- 'text'
	- 'wait'
	- 'help'
```

# 9、列表样式
**list-style-type属性用于控制列表中列表项的样式**
## 1）无序列表

```css
 - 'none'    无标记
 - 'disc'    实心圆，默认
 - 'circle'  空心圆
 - 'square'  实心方块
```

## 2）有序列表

```css
 - 'none'             无标记
 - 'decimal'          数字(1,2,3..)默认的
 - 'lower-roman'      小写罗马数字
 - 'upper-roman'      大写罗马数字
 - 'list-style-image' 属性用图片来替换列表项的符号
    取值：url()
```

# 10、关于元素隐藏

```css
- 1）display:none/block/inline
       隐藏     显示
让元素不再显示，不占用文档的空间
- 2）visibility:hidden/visible
        隐藏  显示
        占位隐藏
```

# 11、关于列表的嵌套使用
  **在一个列表中可以嵌套另一个列表来使用**


# Web开发基础 --- JavaScript
# 1、什么是JavaScript
**JavaScript是一种基于对象和事件驱动的解释性脚本语言，具有与C语言和Java类似的语法，简称JS。**
- JS是一种网页编程技术，用来向HTML页面添加交互行为；
- 由浏览器解析执行
- JS是由网景公司推出的
# 2、JavaScript的特点
 - **(1)可以使用任何的文本编辑工具编写；**
 -  **(2)JS由浏览器内置的JavaScript引擎执行代码，JS代码不用编译，可以直接执行；**
 -  **(3)JS语言内置大量现成的对象可以直接使用**
 -   **(4)适用的地方：**
     - 浏览器端的数据计算
     - 浏览器端表单的合法验证
     - 浏览器端事件的触发 
     - 浏览器端显示效果的制作
     - 服务器的异步数据提交
# 3、使用JavaScirpt
  **（1）事件定义方式**
       在定义事件时直接写入JS代码
  **（2）嵌入式方式**
```html
写在页面<head>标记中的<script>标记里
```


  **（3）文件调用方式**

```javascript
   - 将JS代码写在xx.js结尾的文件中
   - 在<head>标记中使用<script>标记引入xx.js文件
```

# 4、JS代码编写的规范和注意事项
**（1）注释** 
    

```html
  //    单行注释
 /*  */ 多行注释
```

  **（2）JS是大小写敏感的，区分大小写
  （3）关于JS代码的调错**
# 5、变量
   **(1)声明变量使用关键字var
   (2)变量初始化**
     使用=进行赋值初始化   
--变量在声明时不需要指定具体的数据类型，是以赋值的内容为准。
--没有初始化的变量自动取值为undefined
   **(3)变量名的命名规则**
      变量名由字母、数字、_、$组成，数字不能开头
# 6、数据类型
  

```javascript
  （1）基本类型
        number:数字（整数、小数）
            科学计数写法:
            4.3e23=4.3*10^23
        string：字符串类型 ””  ‘’ 
        boolean: 布尔类型  true false
             使用true、fasle表示
             也是用1或0表示
             在运算中true=1，false=0
   （2）特殊类型
        null: 空   undefined未定义
        --null值在程序中表示”无值”或者”无对象”,可以给一个变量赋值null来清楚变量的内容。
         var a=10;
         a=null;
         a=”张三”
        --undefined是在声明一个变量以后未初始化(赋值)，该变量是undefined，表示不存在
         var a;
         alert(a);   undefined
   （3）复杂类型
        Array: 数组
        Object:对象（Date…）
```

# 7、数据类型的隐式转换
  

```javascript
JS属于松散类型的程序语言   
  --变量在声明时不需要指定数据类型    
  --变量由赋值操作后确定数据类型   
 不同类型数据在计算过程中会自动进行转换
  (1)数字+字符串：数字会转为字符串
  (2)数字+布尔值：true转为1，false转为0
  (3)字符串+布尔值：布尔值转换为字符串的true或false
  (4)布尔值+布尔值:布尔值会转换为数值1或0
```

# 8、数据类型的显示转换
  

```javascript
  （1）toString
       语法：value.toString()
     将vlaue的类型转换为字符串类型
     所有的数据类型均可以转换为string类型
  （2）parseInt
       语法: parseInt(value)
       强制转换为整数类型；如果不能转换，会返回NaN(Not a Number)
  （3）parseFloat
       强制转换为浮点数
       如果不能转换，会返回NaN
```

# 9、查看数据类型
  

```javascript
 typeof：查看数据的类型
          语法：typeof value 判断value数据类型是什么
 isNaN：判断是否为数值
	isNaN(value)：如果value是数字返回结果为false，如果value不是数字类型，返回true
```

# 10、运算符
```javascript
（1）算数运算符 
        +  -  *  /  %  ++  --
（2）关系运算符
        >   >=  <   <=  ==  !=
        关系运算符的运算结果为boolean类型
        === 全等(类型相同，数值相同)
        !==不全等(类型和数值都不等)
（3）逻辑运算符
        &&(逻辑与)   ||(逻辑或)  !(逻辑非)
         条件1 && 条件2
          true       false
          false      true
          true       true
          false      false
        !条件  !true-->false
               !false-->true
（4）条件运算符/三目运算符
       语法:条件?代码1:代码2
       如果条件为true，执行代码1
       如果为false，执行代码2
```

# 11、分支结构

```javascript
(1)一种情况的分支结构
   if(条件){
      语句
	}

(2)两种情况的分支结构
  if(条件){
     语句1
	}else{
   	 语句2
	}
(3)多种情况的分支结构
      if(){        //1次

	}else if(){   //0-n次

	}else if(){

	}else{      //0-1次

	}

(4)分支结构的第二种语法：
  switch…case语句结构
  switch(表达式){
     case 值1:
        语句1;
        break;
     case 值2:
        语句2;
        break;
     …
     default:
        其他语句;
	}
```

# 12、循环结构

```javascript
(1)for循环
	for(起始条件1;结束条件2;步进语句3){
     	循环体的内容4
	}
	1 2 4 3 2 4 3… 2 4 3…   2条件不成立
	
(2)while循环
  语法：
  循环的起始条件;
  while(结束条件){
     循环体的内容;
     步进语句;
}

(3)do…while循环
      循环的起始条件;
	do{
         循环体;
         步进语句;
	}while(结束条件);
```


























