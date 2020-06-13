## 一、下载
1. [点击此处下载链接](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
2. 下载对应位数的.exe文件，我这里是64位
![image](http://youdaoyunlxx.oss-cn-hangzhou.aliyuncs.com/java/0/20200530213054.png)
> 我这里下载的是Java SE Development Kit 8u251
3. 我下载时要求创建账户，[点击这里网盘链接](https://pan.baidu.com/s/1m18yetX4KsRYo0zFiOiE7w )，提取码：4ba1
## 二、安装
1. 双击安装
2. 这个时候记录好自己的安装位置，配置环境时要用
![image](http://youdaoyunlxx.oss-cn-hangzhou.aliyuncs.com/java/0/20200530220616.png)
3. 其他的就下一步，好了就关闭
4. 安装完成了桌面什么都没有出现是正常的
5.打开终端（win+r 输入cmd），进入到安装目录的bin文件夹下
6输入java测试是否安装成功
![image](http://youdaoyunlxx.oss-cn-hangzhou.aliyuncs.com/java/0/20200530221345.png)
> 此图安装成功
## 三、配置环境变量
1. 复制安装路径下的bin文件夹路径
![image](http://youdaoyunlxx.oss-cn-hangzhou.aliyuncs.com/java/0/20200530221650.png)
2. 然后就是此电脑处右键，点击属性，点击高级系统设置，在点击环境变量，双击系统变量栏的Path，就出现了下面界面
![image](http://youdaoyunlxx.oss-cn-hangzhou.aliyuncs.com/java/0/20200530222057.png) 
3. 点击新建，粘贴上复制的路径点确定就ok了
4. 然后测试一下是否配置好了，打开命令终端，直接输入java回车，提示的类容如下图（可能会有点差异）
![image](http://youdaoyunlxx.oss-cn-hangzhou.aliyuncs.com/java/0/20200530222713.png)
> 配置环境变量是为了更便捷的使用bin文件夹下的.exe文件，就不用每次cd到指定目录
## 四、IDEA安装
1.在”软件安装管家免费版“中，按它上面的步骤安装并破解好idea，最好选2019英文版
> 软件安装管家有几个星期了一直在升级维护中，上面那个免费版可以找到那些软件破解安装的教程
2. 创建一个空工程，我操作的时候它直接就选择了相应的环境
3. 然后创建java包，编译运行
![image](http://youdaoyunlxx.oss-cn-hangzhou.aliyuncs.com/java/0/20200531055900.png)

[参考博客链接：小鑫仔](https://www.cnblogs.com/maoning/p/10701349.html)