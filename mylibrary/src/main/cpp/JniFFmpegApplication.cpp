#include <jni.h>
#include <string>


extern "C" {
#include "libavcodec/avcodec.h"
#include "JniFFmpegApplication.h"
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_dxtest_mylibrary_JniFFmpegApplicaion_stringFromJNI(
        JNIEnv *env,
        jobject instance) {
/*    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());*/

    char info[10000] = { 0 };
    sprintf(info, "%s\n", avcodec_configuration());
    return env->NewStringUTF(info);
}
