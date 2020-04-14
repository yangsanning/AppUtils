package ysn.com.demo.apputils;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import ysn.com.utlis.AppUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = findViewById(R.id.main_activity_layout);
        for (int i = 0; i < layout.getChildCount(); i++) {
            layout.getChildAt(i).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_activity_start_app:
                AppUtils.startApp(this, "com.tencent.mobileqq");
                break;
            case R.id.main_activity_start_app_class:
                AppUtils.startApp(this, "com.tencent.mobileqq", "com.tencent.mobileqq.activity.SplashActivity");
                break;
            case R.id.main_activity_start_browser_by_search:
                AppUtils.startBrowserBySearch(this, "QQ");
                break;
            case R.id.main_activity_start_browser:
                AppUtils.startBrowser(this, "https://www.baidu.com/");
                break;
            case R.id.main_activity_start_app_store:
                AppUtils.startAppStore(this, "com.tencent.mobileqq", "");
                break;
            case R.id.main_activity_start_app_details:
                AppUtils.startAppDetails(this, "com.tencent.mobileqq");
                break;
            case R.id.main_activity_start_setting:
                AppUtils.startSetting(this);
                break;
            case R.id.main_activity_start_uninstall_app:
                AppUtils.startUninstallApp(this, "com.tencent.mobileqq");
                break;
            default:
                break;
        }
    }
}
