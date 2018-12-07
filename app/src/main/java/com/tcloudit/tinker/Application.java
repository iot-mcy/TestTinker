package com.tcloudit.tinker;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

public class Application extends TinkerApplication {

    public Application() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.tcloudit.tinker.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }

//    @Override
//    public void onCreate() {
//        super.onCreate();
//        // 这里实现SDK初始化，appId替换成你的在Bugly平台申请的appId
//        // 调试时，将第三个参数改为true
//        Bugly.init(this, "3a2d0a88ed", false);
//    }
//
//    @Override
//    protected void attachBaseContext(Context base) {
//        super.attachBaseContext(base);
//        // you must install multiDex whatever tinker is installed!
//        MultiDex.install(base);
//
//        // 安装tinker
//        Beta.installTinker();
//    }
}
