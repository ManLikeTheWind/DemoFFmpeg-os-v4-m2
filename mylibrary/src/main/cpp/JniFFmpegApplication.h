/*
Administrator="ADSF"
*.fileName: JniFFmpegApplication.h
*..project:DemoFFmpeg02
*.....user:dongxiang 
*.....date:2018/7/10
*..descrip:
//
*/
#ifndef DEMOFFMPEG02_JNIFFMPEGAPPLICATION_H
#define DEMOFFMPEG02_JNIFFMPEGAPPLICATION_H

#include <jni.h>

extern "C"{
JNIEXPORT jstring JNICALL
        Java_com_dxtest_mylibrary_JniFFmpegApplicaion_stringFromJNI(JNIEnv *env, jobject instance);



};


#endif //DEMOFFMPEG02_JNIFFMPEGAPPLICATION_H
