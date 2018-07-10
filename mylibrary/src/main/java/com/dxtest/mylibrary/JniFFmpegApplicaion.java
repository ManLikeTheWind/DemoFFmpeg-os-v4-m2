package com.dxtest.mylibrary;

/**
 * <br>package: com.dxtest.mylibrary  JniFFmpegApplicaion
 * <br>.author: dongxiang
 * <br>...date: 2018/7/10  9:56
 * <br>.descrp:
 * <br>..using:
 * <br>.e-mail:dongxiang_android_sdk@aliyun.com
 */

public class JniFFmpegApplicaion {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

}
