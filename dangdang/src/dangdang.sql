drop database dang;
create database dang default charset utf8;
use dang;
DROP TABLE IF EXISTS d_book;
CREATE TABLE d_book (
  id int(12) NOT NULL auto_increment,
  product_name varchar(100) NOT NULL,
  description varchar(100) default NULL,
  fixed_price double NOT NULL,
  dang_price double NOT NULL,
  product_pic varchar(200) default NULL,
  author varchar(200) NOT NULL,
  publishing varchar(200) NOT NULL,
  publish_time long NOT NULL,
  author_summary text NOT NULL,
  catalogue text NOT NULL,

  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO d_book VALUES (1,'一个陌生女人的来信','一个男子在四十一岁生日当天收到一封没有署名和地址的信，一个临死的女人，讲述了一个刻骨铭心的爱情故事，而故事的男主人公也就是收信的这个男人对此一无所知。',26.00,15.90,'16.jpg','斯蒂芬·茨威格','上海译文出版社',1214841600000,
'斯蒂芬·茨威格(Stefan Zweig，1881－1942)是奥地利的著名作家，从二十年代起，他“以德语创作赢得了不让于英、法语作品的广泛声誉”。他善于运用各种体裁，写过诗、小说、戏剧、文论、传记，还从事过文学翻译，但他的作品中以传记和小说最为著称。',
'1一个陌生女人的来信2马来狂人3女人和大地4看不见的珍藏5奇妙的一夜6被遗忘的梦· · · · · ·');

INSERT INTO d_book VALUES (2,'鲁滨逊漂流记','主要讲述了主人公因出海遇难，漂流到无人岛（原名马萨蒂埃拉岛，后来以《鲁滨逊漂流记》中主人公鲁滨逊的名字重新命名：鲁滨逊·克鲁索岛），并坚持在岛上生活，最后回到社会的故事。',15.80,11.10 ,'17.jpg','丹尼尔·笛福','世界图书出版公司',1209571200000,
'丹尼尔·笛福，英国小说家、新闻记者、小册子作者。其作品主要为个人通过努力，靠自己的智慧和勇敢战胜困难。情节曲折，采用自述方式，可读性强。',
'Chapter 1 A Warning 告诫Chapter 2 The Storm 风暴Chapter 3 Pirates 海盗Chapter 4 Escape from Slavery 逃脱奴役Chapter 5 Brazil 巴西Chapter 6 Shipwreck 遇难');

INSERT INTO d_book VALUES (3,'老子说','老子是一位真正的智者，他不仅教人表现柔弱、愚鲁，更教人无为、无我、居下、退后、清滤、自然……他的思想很难叫人接受，因为一般人只能看到事物的外表，而老子却看到了内里。',30.00,24.60,'18.jpg','蔡志忠','地理出版社',1072886400000,
'蔡志忠（1948年2月2日～ ）出生于台湾彰化县花坛乡。15岁中途辍学后只身到台北，开始连环漫画创作；','1.道可道，非常道。名可名，非常名。无名天地之始；有名万物之母。2.天下皆知美之为美，斯恶已。皆知善之为善，斯不善已。3.有无相生，难易相成，是非相形，高低相盈，音声相和，前后相随。恒也。· · · · · ·');

INSERT INTO d_book VALUES (4,'达芬奇密码','哈佛大学的符号学专家罗伯特·兰登在法国巴黎出差期间的一个午夜接到一个紧急电话，得知卢浮宫博物馆年迈的馆长被人杀害在卢浮宫的博物馆里，人们在他的尸体旁边发现了一个难以捉摸的密码。',28.00,25.20,'19.jpg','丹.布朗 ','上海人民出版社',1072886400000,
'丹·布朗堪称今日美国最著名畅销书作家。他的小说《达·芬奇密码》自问世以来，一直高居《纽约时报》畅销书排行榜榜首。','无');

INSERT INTO d_book VALUES (5,'淘气包马小跳','马小跳和路曼曼是一对同桌冤家，路曼曼要管着马小跳。马小跳却不喜欢路曼曼总管着他，他们之间永远有吵不完的架。',13,9.9,'20.jpg','杨红樱  ','接力出版社',1136044800000,
'杨红樱，中国作家协会会员，《青年作家》杂志社副编审。所著“淘气包马小跳系列”、“杨红樱校园小说系列”、“杨红樱童话系列”已成为品牌图书，畅销校园内外。',
'1同桌冤家2两个人的战争3想引起女生的注意4帮冤家拉选票5羊肉串都白请了6路曼曼病了7路曼曼的灵丹妙病8男生女生自由组合9马小跳当官啦10马小跳过官瘾11比萨饼vs麻辣烧烤12串串香香死人......');

INSERT INTO d_book VALUES (6,'夏洛的网','本书描述一个名叫夏洛的蜘蛛如何巧妙的拯救险成火腿的小猪威伯，并化解了它的存亡问题。',28,24.36,'21.jpg',
'（美）特（White.E.B.）   ','上海译文出版社',1251734400000,'E·B·怀特（1899-1985），二十世纪美国最杰出的随笔作家。作为《纽约客》主要撰稿人，怀特一手奠定了影响深远的“《纽约客》文风”。',
'1、早饭前2、小猪威尔伯3、逃走4、孤独5、夏洛6、夏日7、坏消息8、家里的谈话9、威尔伯说大话10、臭蛋爆炸11、奇迹12、会议13、进展顺利14、多里安医生15、蟋蟀16、上集市去17、叔叔18、凉爽的晚上');

INSERT INTO d_book VALUES (7,'Servlet与JSP核心编程','本书由浅入深，全面而深入地介绍了servlet和jsp技术。',59,44.25,'22.jpg',
'（美）Marty Hall,Larry Brown   ','清华大学出版社',1086019200000,'（美）Marty Hall,Larry Brown ,美国作家',
'第1章 servlet和jsp技术概述 1．1 servlet的功用 1．2 要动态构建网页的原因 1．3 servlet代码初探 1．4 servlet相对于“传统”cgi的优点 1．5 jsp的作用 第1部分 servlet技术 第2章 服务器的安装和配置 2．1 下载和安装java软件开发工具包 2．2 为桌面计算机下载服务器 2．3 服务器的配置 2．4 配置apachetomcat 2．5 配置macromediajrun 2．6 配置cauchoresin 2．7 建立开发环境 2．8 测试系统的设置 2．9 实现简化的部署方法 2．10 默认web应用的部署目录：汇总 2．11 web应用：预览......' );

INSERT INTO d_book VALUES (8,'庐隐作品精编',' 本书收入了庐隐具有代表性的散文和小说',22.00,18.00,'23.jpg','庐隐 ','漓江出版社',1080748800000,
'庐隐(1898．5．4～1934．5．13)原名黄淑仪，又名黄英，生于福建闽侯。','散文/窗外的春光/我愿秋常驻人间/蓬莱风景线/生命的光荣——叩苍从狱中寄来的信......');

INSERT INTO d_book VALUES (9,'门口的野蛮人','再现了华尔街历史上最著名的公司争夺战——对美国RJR纳贝斯克公司的争夺战。 ',39,18,'24.jpg',
'（美）布赖恩.伯勒（Bryan Burrough）    约翰.希利亚尔（John Helyar）   ','机械工业出版社',1083340800000,
'（美）布赖恩.伯勒（Bryan Burrough）    约翰.希利亚尔（John Helyar）  ','前 言 人 物 序 幕	1 开始行动。 第 1 章罗斯·约翰逊将近40岁的时候，这个即将成为里根时代商业楷模的人物，还是芥芥无名。一家猎头公司成为了约翰逊生命的拐点，凭借这次机会，他摇身一变，成为了标牌公司的总裁，接着鲸吞了纳贝斯克公司，从此青云直上。成功之路无法复制，约翰逊终究靠的是天生的聪明能干，还是投机钻营？有人这样诠释约翰逊主义：“成功来自机会，行动无须计划。”约翰逊是一个地狱天使和现代资本的混合体。...... ');

INSERT INTO d_book VALUES (10,'童年 在人间 我的大学','《童年 在人间 我的大学(权威全译典藏版)》取材于高尔基的真实成长经历，主人公阿廖沙便是作者“我”。',30,18,'2.jpg',
'(苏)高尔基','湖南文艺',1330617600000,'高尔基(1868-1936)，苏联著名作家，原名阿列克谢·马克西莫维奇·彼什科夫。高尔基出身贫苦，幼年丧父，11岁便到社会上谋生。他顽强地自学文化知识，同时积极参加革命活动。','目录\童年\在人间\我的大学');

INSERT INTO d_book VALUES (11,'海水观赏鱼：宠物100','覆盖地球表面77%的海洋，给种类繁多的海洋生物提供了备具特色的栖息场所，世界上已查明的海洋鱼类约有2万余种。',25,19.6,'3.jpg','张词祖','中国林业出版社',1046448000000,
'张词祖 - 1940～,上海人,高级工程师,中国动物学会会员,中国摄影家协会会员,中国科普作家协会会员出版过著作、动物画册及摄影丛书,包括《中国野鸟》等','无');

INSERT INTO d_book VALUES (12,'小妇人','本书以19世纪中期美国南北战争为背景，生动描写了作者亲身经历的家庭生活',40,23.7,'4.jpg','奥尔科特','上海译文出版社',
1325347200000,'露易莎·梅·奥尔科特（1832-1888），美国作家。《小妇人》是她的代表作。','序诗第一部第一章　扮演朝圣者第二章　欢乐的圣诞节第三章　劳伦斯家的男孩第四章　负担第五章　互为芳邻第六章　贝思找到了美丽之宫第七章　艾米的屈辱之谷第八章　乔碰上了魔王第九章　梅格到繁华世界去第十章　匹克威克俱乐部和邮政局');

INSERT INTO d_book VALUES (13,'双螺旋','这本书讲述了发现dna——由两条被称为“碱基”的简单化学链相互缠绕成一个双螺旋结构——的真实故事。',35,24.7,'5.jpg','（美）沃森 ','生活·读书·新知三联书店',996595200000,'詹姆斯·沃森（james d.watson）1928年出生于芝加哥。','无');
INSERT INTO d_book VALUES (14,'简爱','《简·爱》是夏洛蒂的第二部小说。她借一个出身寒微的年轻女子奋斗的经历，抒发了自己胸中的积愫，深深打动了当时的读者。',20,18,'6.jpg',
'(英)夏洛蒂·勃朗特 ','中国画报出版社',1325347200000,'夏洛蒂·勃朗特（1816-1855），生于英国北部的一个牧师家庭，母亲早逝，家庭穷困。',
'目录第一章 盖茨海德府第二章 红房子第三章 病中第四章 勃洛克赫斯特先生第五章 来到洛伍德第六章 海伦?彭斯第七章 勃洛克赫斯特先生来访第八章 谭波儿小姐第九章 海伦之死第十章 登报求职第十一章 在桑菲尔德......');

INSERT INTO d_book VALUES (15,'java就业培训教程','本书作者张孝祥曾以技术入股清华创业园某公司，任该公司技术总监，带领导十几位清华博士、硕士组成的技术团队，开发了文件分发软件，屏幕共享软件，远程教学系统，视频监控与会议系统。',41,34.8,'7.jpg',' 张孝祥   ','清华大学出版社',1062345600000,
'张孝祥， 1995年毕业于北京理工大学，获学士学位。','目录第1章 java开发前奏 1．1 java虚拟机及java的跨平台原理 1．2 java开发环境的搭建 1．2．1 环境变量的介绍 1．2．2 如何查看系统环境变量 1．2．3 如何设置系统环境变量...... ');

INSERT INTO d_book VALUES (16,'茶花女','《茶花女》是法国亚历山大·小仲马的代表作，讲述在19世纪40年代，一个叫玛格丽特·戈蒂埃的贫苦乡下姑娘来到巴黎，走进了名利场，成了上流社会的一个社交明星。',18,12.78,
'8.jpg','[法] 亚历山大·小仲马著  ','译林出版社',1388505600000,'小仲马（1824—1895）是法国小说家、剧作家。他的文学创作大多以探讨社会道德问题为主题。','无');

INSERT INTO d_book VALUES (17,'雪莱诗选','雪莱诗选》几乎提取了雪莱众多诗篇中的全部精华，其中包括那很多人知晓、熟诵的《云雀歌》、《西风颂》',
22,18.92,'9.jpg','(英)雪莱   ','人民文学',1346428800000,'作者：（英国）雪莱（Shelley P.B.）','目录\爱尔兰人之歌 \致爱尔兰 \诗章 \无常 \咏死 \夏日黄昏的墓园 \赞精神的美...... ');

INSERT INTO d_book VALUES (18,'在人间','在人间》内容简介：阿廖沙11岁，他的母亲去世，外祖父破产，他走上社会，开始独立谋生。',20,18.40,'10.jpg',
'(俄)高尔基著 ','上海文艺出版社',1354291200000,'高尔基(1868～1936)前苏联无产阶级作家,社会主义现实主义文学的奠基人。','无');

INSERT INTO d_book VALUES (19,'飘','飘》是一部有关战争的小说，但作者玛格丽特没有把着眼点放在战场上。',25,23.5,'11.jpg','（美）米切尔','译林出版社',1275321600000,
'仅仅写了一部作品就名扬天下并在文坛上占有一席之地的作家是绝无仅有的。而美国女作家玛格丽特·米切尔便是这样一位绝无仅有的作家。','目录第一部第一章第二章第三章第四章第五章第六章第七章	......');

INSERT INTO d_book VALUES (20,'关键管理问题',' 这本书是为忙碌又缺乏培训的成功人士而设计的工具书。这并不意味着如果读者选择一页一页地阅读就不行。',
20,19.40,'12.jpg','汤姆.兰伯特（Tom Lambert）','经济管理出版社',1086019200000,
'汤姆·兰伯特具有杰出的独特特征，他是从两家美国资格认定机构获得全面质量国际证书的第一位欧洲咨询专家。',
'目录内容提要 引言 你的企业是否已为知识时代的来临做好了准备? 第一章 良好实践的应用模型 \一个模型的模型 \为什么需要模型? \模型的定义 \向其他方学习 \模型的共同语言 \第二章 战略和经营规划 \用于战略规划的模型 \应用模型作战略规划 \raise模型...... ');

INSERT INTO d_book VALUES (21,'孩子，我们一路同行','我们正在走向学习化的社会，家庭是社会的细胞，它要求家长改变过去粗放式的家庭教育理念和方式。',10.00,9.00,'13.jpg',' 王晓春 ','中国妇女出版社',1054396800000,
'王晓春，1943年生，北京人，北京教育科学研究院基础教育研究所高级教师。',
'目录第一章 什么是学习型家长一、如何对待“做学习型家长”的提法二、什么是学习型家长1.具备家庭教育的基本知识2.对子女问题采取研究的态度3.和孩子共同成长第二章 做学习型家长的学习途径一、大众传媒二、家庭教育图书1.成功个案型2.教科书型3.操作手册型4.新闻报道型5.专题研究型......');

INSERT INTO d_book VALUES (22,'傲慢与偏见','《傲慢与偏见》是简·奥斯汀的代表作。故事围绕贝内特一家几个女儿的婚姻大事展开。',25,19,'14.jpg',
'奥斯汀 ','花城',1091289600000,'《傲慢与偏见》是简·奥斯汀的代表作。小说讲述了乡绅之女伊丽莎白·班内特的爱情故事。','目录第一章第二章第三章第四章第五章第六章第七章第八章第九章......');

INSERT INTO d_book VALUES (23,'童年','《童年》讲述的是孤独孩童“我”的成长故事。小说以一个孩子的独特视角来审视整个社会及人生。',22,16,'15.jpg',
'（苏）高尔基原著   ','陕西师范大学出版社',1257004800000,'高尔基(1868～1936)前苏联无产阶级作家,社会主义现实主义文学的奠基人。','目录\编辑缘起\译者序\主要人物表\一\二\三\四\五\六\七\八\九\十\十一\十二\十三 ......');

select * from d_book;
select * from d_book limit 0,5;
select * from d_book limit 5,5;
select * from d_book limit 10,5;
select * from d_book limit 15,5;
select * from d_book limit 20,5;
select * from d_book limit 25,5;
select count(*) from d_book;
select * from d_book where id=2;


desc d_book;


DROP TABLE IF EXISTS d_item;
CREATE TABLE d_item (
  id int(12) NOT NULL auto_increment,
  order_id int(10) NOT NULL,
  book_id int(10) NOT NULL,
  book_name varchar(100) NOT NULL,
  dang_price double NOT NULL,
  fixed_price double NOT NULL,
  book_num int(10) NOT NULL,
  amount double NOT NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
select * from d_item;



DROP TABLE IF EXISTS d_order;
CREATE TABLE d_order (
  id int(10) NOT NULL auto_increment,
  user_id int(10) NOT NULL,
  order_time long NOT NULL,
  order_id int not null,
  total_price double NOT NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
select * from d_order;


DROP TABLE IF EXISTS d_user;
CREATE TABLE d_user (
  id int(12) NOT NULL auto_increment,
  email varchar(50) NOT NULL,
  nickname varchar(50) default NULL,
  password varchar(50) NOT NULL,
  PRIMARY KEY  (id),
  UNIQUE KEY email (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into d_user(email,nickname,password) values('abc@qq.com','张三','abc123');
insert into d_user(email,nickname,password) values('ls@126.com','李四','123456');
select * from d_user;
select * from d_user where email='abc@qq.com';
select * from d_user where email='123@qq.com';
select * from d_user where email='abc@qq.com' and password='abc123';

drop table if exists d_address;
create table d_address(
	id int(12) not null auto_increment,
	receive_name varchar(50) not null,
	full_address varchar(50) not null,
	postal_code int(12) not null,
	phone varchar(50),
	mobile long not null,
	primary key (id)            
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

select * from d_address;

select * from d_order;

select * from d_item;

