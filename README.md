# myshop
在线小商城
项目描述： 一个小小购物网站，有前后台的页面管理以及增删改查功能
主要技术： Spring+Spring MVC+Mybatis，项目通过maven生成。
后台：Spring+Mybatis+SpringMVC(基于注解)。
前台：SpringMVC+JQuery+css
实现了  

用户可以从管理员登录界面进行登录，登录成功后进入到后台主页面，有四种选择【商品类型】管理，【商品】管理，【客户】管理，【管理员】管理，随意点击标签进入该
类的管理页面，会检索出所有信息，点击【添加】，填写表单后提交会将信息存入对应的数据库表中。
用户也可以从登录界面点击【注册】进入注册页面，填写信息提交后会将信息存入对应的数据库表中，其中密码以密文【md5】的形式存入。

登录功能，商品信息检索，商品管理（从数据库中添加或修改或删除商品信息），商品类别检索，商品类别管理，用户检索，用户信息管理，管理员信息检索，管理员管理 
管理员登录后可以进入管理界面，可对所有信息进行增删改。 用户注册后可以进入前台页面。
