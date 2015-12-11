# KLog

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ZhaoKaiQiang-green.svg?style=true)](https://android-arsenal.com/details/1/2782)

This is a useful log tool for Android 

Android LogCat 工具类，目前功能：

- 无参数打印
- 打印所在行号
- 打印所在函数
- AS点击方法名自动跳转
- Json格式自动解析打印
- xml格式自定解析打印
- Log信息存储到文件(6.0以上需要动态申请存储空间权限)
- 变长参数打印
- 无logcat最多4000字符打印限制

中文文档请戳[这里](http://blog.csdn.net/zhaokaiqiang1992/article/details/49837627)。

---

##Features

- Can use KLog.d() with no tag
- Print log info with line number and method name
- Jump to the position where the log is invoked, by click in the Android Studio Logcat

##Update

- Add support for Long JSON String
- KLog.file() could save the log to file
- Add support for xml format string
- Add support for long string

##Sample Usage

![](https://github.com/ZhaoKaiQiang/KLog/blob/master/image/demo.gif)

###KLog.d()

Use this method , you can get a log like follwing，default tag is current class name

![](http://i13.tietuku.com/6eac96ebfbea82cb.png)

###KLog.d(String)

you can print a String with this method ,default tag is current class name
![](http://i13.tietuku.com/95871d0388a27777.png)

###KLog.d(Tag,String)

you can set tag by youself , the result is as bollow 
![](http://i13.tietuku.com/f0286fa45f975346.png)

###KLog.json(String)

you can print a String with json format ,and it will be formated as following
![](http://i13.tietuku.com/767fa81ad27c8f9f.png)

###KLog.json(Tag,String)

as same as above , but with a tag whitch are set by yourself
![](http://i13.tietuku.com/bc9714547a4f50fe.png)

###KLog.file()

you can save the log string in to file !

```
 KLog.file(TAG, Environment.getExternalStorageDirectory(), "test.txt", JSON_LONG);
```

![](https://github.com/ZhaoKaiQiang/KLog/blob/master/image/file.png)

###KLog.xml()

print xml format string in logcat

```
 KLog.xml(XML);
```

![](https://github.com/ZhaoKaiQiang/KLog/blob/master/image/xml.png)

##JCenter

```
dependencies {
    compile 'com.github.zhaokaiqiang.klog:library:1.2.0'
}
```
##Eclipse

You need add klog.jar into your project ,because the klog dependences on dom4j，so you alse need add the dom4j-2.0.0-RC1.jar to your project . The jar file is in the library's libs .

##Notice

If you don't need the method -- KLog.xml() ，you can delete the method about it ,so that you can decrease the almost size of this library.

##License

```
Copyright 2015, 2016 ZhaoKaiQiang

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

##About me
- [Android Developer](http://weibo.com/zhaokaiqiang1992)
- [CSDN Blog](http://blog.csdn.net/zhaokaiqiang1992)
