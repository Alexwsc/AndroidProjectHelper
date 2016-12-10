package qyh.androidprojecthelper.base;

import android.app.Application;

import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * 描述：
 * Created by qyh on 2016/12/6.
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AutoLayoutConifg.getInstance().useDeviceSize();
    }
}
