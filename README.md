# KLog

This is a useful log tool for Android 

Android LogCat 工具类，支持行号、所在函数、点击自动跳转、Json格式自定解析打印等功能。

中文文档请戳[这里]()。

---

##Features

- Can use KLog.d() with no tag
- Print log info with line number and method name
- Jump to the position where the log is invoked, by click in the Android Studio Logcat

##Sample Usage

The main mothod you may use

![](http://i13.tietuku.com/6975553e0ea34af7.png)

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

##License

```
Copyright 2011, 2012 Chris Banes

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