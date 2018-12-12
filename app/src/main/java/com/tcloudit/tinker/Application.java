package com.tcloudit.tinker;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

public class Application extends TinkerApplication {

    public Application() {
        super(ShareConstants.TINKER_ENABLE_ALL,
                "com.tcloudit.tinker.TinkerApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader",
                false);
    }
}
