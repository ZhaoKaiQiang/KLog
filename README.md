# KLog

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ZhaoKaiQiang-green.svg?style=true)](https://android-arsenal.com/details/1/2782)

This is a useful log tool for Android 

Android LogCat 工具类，目前功能：

- 支持显示行号
- 支持显示Log所在函数名称
- 支持无Tag快捷打印
- 支持在Android Studio开发IDE中，点击函数名称，跳转至Log所在位置
- 支持JSON字符串解析打印
- 支持XML字符串解析打印
- 支持Log信息存储到文件
- 依赖库非常小，只有不到10K
- 支持无限长字符串打印，无Logcat4000字符限制
- 支持变长参数，任意个数打印参数
- 支持设置全局Tag

中文文档请戳[这里](http://kaizige.vip/2016/06/13/klog/)。

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
    compile 'com.github.zhaokaiqiang.klog:library:1.6.0'
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
- [Blog](http://kaizige.vip/)
