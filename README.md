### 1.简介

仿照Everything桌面工具，基于Java语言开发的命令行文件搜索工具

### 2.背景

有时候在windows命令行下需要查询一些文件，由于for命令并不如Linux下的find命令好用，所以DIY开发一款命令行工具，用开实现Windows命令行中搜索文件。

### 3.意义

+ 解决Windows命令行下文件搜索问题
+ 基于Java开发的工具可以在Windows和Linux平台上无差异使用
+ 锻炼编码能力

### 4.技术

+ JavaSE
+ Java多线程、线程池
+ JDBC编程
+ 嵌入式数据库H2
+ Apache Commons IO库
+ 接口编程、设计模式
+ 插件Lombok

### 5.实现

+ 从上到下分层结构  

```java
 客户端->统一调度器->索引、检索、监控、拦截器->数据库访问->数据库
 ```
+ 绘图展示、文字描述

### 6.使用

+ 程序的发布包：everything-g2.zip
  + lib(依赖的库)
  + myEverything-g2-1.0.0.jar
  + everything_config_properties
+ 解压程序发布包
+ 参考如下说明，配置文件
  
  # 最大检索返回的结果数
  everything.max_return=40
  # 是否开启构建索引
  everything.enable_build_index=false
  # 检索时depth深度的排序规则
  everything.order_by_desc=false
  # 文件监控的间隔时间
  everything.interval=60000
  # 索引目录
  # 索引包含目录
  everything.handle_path.include_path=C:\\;D:\\;E:\\
  # 索引排除目录
  everything.handle_path.exclude_path=C:Windows

+ 启动程序
  
  java -jar myEverything-g2-1.0.0.jar [配置文件的路径]
  
### 7.总结

+ 学到啥
+ 有啥提升
+ 有啥困难，怎么思考，怎么解决
+ 测试结果

### 8.扩展

+ 功能的扩展：history
+ 根据拼音检索
+ JRE包含在程序的发布包中（bat sh脚本）