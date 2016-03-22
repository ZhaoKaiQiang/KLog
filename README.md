# KLog

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ZhaoKaiQiang-green.svg?style=true)](https://android-arsenal.com/details/1/2782)

This is a useful log tool for Android 

Android LogCat 工具类，目前功能：

- 全局打印开关
- 无参数快捷打印
- 打印所在行号
- 打印所在函数
- AS点击方法名自动跳转
- Json格式自动解析打印
- xml格式自定解析打印
- Log信息存储到文件(6.0以上需要动态申请存储空间权限)
- 变长参数打印
- 无logcat最多4000字符打印限制
- 只有10k，却功能强大

中文文档请戳[这里](http://blog.csdn.net/zhaokaiqiang1992/article/details/49837627)。

---

##Features

- Can use KLog.d() with no tag
- Print log info with line number and method name
- Jump to the position where the log is invoked, by click in the Android Studio Logcat
- Add support for Long JSON String
- KLog.file() could save the log to file
- Add support for xml format string
- Add support for long string

##Sample Usage

![](https://github.com/ZhaoKaiQiang/KLog/blob/master/image/demo.gif)

##JCenter

```
dependencies {
    compile 'com.github.zhaokaiqiang.klog:library:1.4.0'
}
```
##Eclipse

You need add klog.jar into your project libs

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
