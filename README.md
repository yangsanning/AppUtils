# AppUtils
[![](https://jitpack.io/v/yangsanning/AppUtils.svg)](https://jitpack.io/#yangsanning/AppUtils)
[![API](https://img.shields.io/badge/API-19%2B-orange.svg?style=flat)](https://android-arsenal.com/api?level=19)

| 功能 | 对应方法 |
| ---- | ---- | 
| 通过包名启动App | startApp(Context context, String appPackage) |
| 通过包名和类名启动App | startApp(Context context, String appPackage, String className) |
| 跳转到应用商店app详情界面 | startAppStore(Context context, String appPackage, String marketPackage)  |
| 打开app详情界面 | startAppDetails(Context context, String appPackage) |
| 打开浏览器搜索指定内容 | startBrowserBySearch(Context context, String search) |
| 打开指定页面 | startBrowser(Context context, String url) |
| 打开设置页面 | startSetting(Context context) |
| 打电话 | call(Context context, String phone) |
| 发短信 | sendSms(Context context, String phone, String sms) |
| 发邮件 | sendEmail(Context context, String email) |
| 打开app卸载界面 | startUninstallApp(Context context, String appPackage) |
| 判断app是否已经安装 | isInstall(Context context, String appPackage) |


### 1.添加方法

#### 1.1 添加仓库

在项目的 `build.gradle` 文件中配置仓库地址。

```android
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

#### 1.2 添加项目依赖

在需要添加依赖的 Module 下添加以下信息，使用方式和普通的远程仓库一样。

```android
implementation 'com.github.yangsanning:AppUtils:1.1.0'
```
