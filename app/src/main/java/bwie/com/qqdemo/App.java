package bwie.com.qqdemo;

import android.app.Application;

import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

/**
 * 类描述：
 * 创建人：Liuzijun
 * 创建时间：2017/7/11 15:10
 */
public class App extends Application {
    {
        PlatformConfig.setQQZone("1106198509","Z9wLCcdD7dvmypub");
    }
    private UMShareAPI mUMShareAPI;
    @Override
    public void onCreate() {
        super.onCreate();
        mUMShareAPI = UMShareAPI.get(this);
    }

    public UMShareAPI getUMShareAPI() {
        return mUMShareAPI;
    }
}
