package ysn.com.utlis;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;

/**
 * @Author yangsanning
 * @ClassName AppUtlis
 * @Description 一句话概括作用
 * @Date 2020/4/14
 * @History 2020/4/14 author: description:
 */
public class AppUtils {

    /**
     * 通过包名启动App
     *
     * @param appPackage app包名
     */
    public static void startApp(Context context, String appPackage) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = packageManager.getLaunchIntentForPackage(appPackage);
        context.startActivity(intent);
    }

    /**
     * 通过包名和类名启动App
     *
     * @param appPackage app包名
     * @param className  需要启动的类名
     */
    public static void startApp(Context context, String appPackage, String className) {
        Intent intent = new Intent();
        ComponentName comp = new ComponentName(appPackage, className);
        intent.setComponent(comp);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        context.startActivity(intent);
    }

    /**
     * 打开浏览器搜索指定内容
     *
     * @param search 需要搜索的内容
     */
    public static void startBrowserBySearch(Context context, String search) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, search);
        context.startActivity(intent);
    }

    /**
     * 打开指定页面
     *
     * @param url 链接
     */
    public static void startBrowser(Context context, String url) {
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        context.startActivity(intent);
    }

    /**
     * 跳转到应用商店app详情界面
     *
     * @param appPackage    app包名
     * @param marketPackage 应用市场的包名(如果为"" 则弹出应用商店列表供用户选择)
     */
    public static void startAppStore(Context context, String appPackage, String marketPackage) {
        try {
            if (TextUtils.isEmpty(appPackage)) {
                return;
            }
            Uri uri = Uri.parse("market://details?id=" + appPackage);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);

            if (!TextUtils.isEmpty(marketPackage)) {
                intent.setPackage(marketPackage);
            }
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 打开app详情界面
     *
     * @param context    context
     * @param appPackage app包名
     */
    public static void startAppDetails(Context context, String appPackage) {
        int version = Build.VERSION.SDK_INT;
        Intent intent = new Intent();
        if (version <= 7) {
            intent.setAction("android.intent.action.VIEW");
            intent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
            intent.putExtra("com.android.settings.ApplicationPkgName", appPackage);
        }
        if (version == 8) {
            intent.setAction("android.intent.action.VIEW");
            intent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
            intent.putExtra("pkg", appPackage);
        } else if (version >= 9) {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", appPackage, null));
        }
        context.startActivity(intent);
    }

    /**
     * 打开设置页面
     */
    public static void startSetting(Context context) {
        Intent intent = new Intent(android.provider.Settings.ACTION_SETTINGS);
        context.startActivity(intent);
    }

    /**
     * 打开app卸载界面
     *
     * @param appPackage app包名
     */
    public static void startUninstallApp(Context context, String appPackage) {
        Intent intent = new Intent("android.intent.action.DELETE", Uri.parse("package:" + appPackage));
        context.startActivity(intent);
    }
}
