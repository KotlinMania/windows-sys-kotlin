#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <errno.h>
#ifdef _WIN32
#ifndef WIN32_LEAN_AND_MEAN
#define WIN32_LEAN_AND_MEAN
#endif
#include <windows.h>
#else
#include <dlfcn.h>
#ifndef RTLD_DEFAULT
#define RTLD_DEFAULT ((void*)0)
#endif
#endif

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_windowsmediaformat_WindowsWin32MediaWindowsmediaformatJniBridge_windowssys_1windows_1win32_1media_1windowsmediaformat_1wMCreateBackupRestorer(JNIEnv* km_env, jclass km_clazz, jlong pcallback, jlong ppbackup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateBackupRestorer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcallback, (void*)(uintptr_t)ppbackup) : -1;
#else
    (void)pcallback;
    (void)ppbackup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_windowsmediaformat_WindowsWin32MediaWindowsmediaformatJniBridge_windowssys_1windows_1win32_1media_1windowsmediaformat_1wMCreateEditor(JNIEnv* km_env, jclass km_clazz, jlong ppeditor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateEditor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppeditor) : -1;
#else
    (void)ppeditor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_windowsmediaformat_WindowsWin32MediaWindowsmediaformatJniBridge_windowssys_1windows_1win32_1media_1windowsmediaformat_1wMCreateIndexer(JNIEnv* km_env, jclass km_clazz, jlong ppindexer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateIndexer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppindexer) : -1;
#else
    (void)ppindexer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_windowsmediaformat_WindowsWin32MediaWindowsmediaformatJniBridge_windowssys_1windows_1win32_1media_1windowsmediaformat_1wMCreateProfileManager(JNIEnv* km_env, jclass km_clazz, jlong ppprofilemanager) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateProfileManager");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppprofilemanager) : -1;
#else
    (void)ppprofilemanager;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_windowsmediaformat_WindowsWin32MediaWindowsmediaformatJniBridge_windowssys_1windows_1win32_1media_1windowsmediaformat_1wMCreateReader(JNIEnv* km_env, jclass km_clazz, jlong punkcert, jint dwrights, jlong ppreader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateReader");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punkcert, (uint32_t)dwrights, (void*)(uintptr_t)ppreader) : -1;
#else
    (void)punkcert;
    (void)dwrights;
    (void)ppreader;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_windowsmediaformat_WindowsWin32MediaWindowsmediaformatJniBridge_windowssys_1windows_1win32_1media_1windowsmediaformat_1wMCreateSyncReader(JNIEnv* km_env, jclass km_clazz, jlong punkcert, jint dwrights, jlong ppsyncreader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateSyncReader");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punkcert, (uint32_t)dwrights, (void*)(uintptr_t)ppsyncreader) : -1;
#else
    (void)punkcert;
    (void)dwrights;
    (void)ppsyncreader;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_windowsmediaformat_WindowsWin32MediaWindowsmediaformatJniBridge_windowssys_1windows_1win32_1media_1windowsmediaformat_1wMCreateWriter(JNIEnv* km_env, jclass km_clazz, jlong punkcert, jlong ppwriter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateWriter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punkcert, (void*)(uintptr_t)ppwriter) : -1;
#else
    (void)punkcert;
    (void)ppwriter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_windowsmediaformat_WindowsWin32MediaWindowsmediaformatJniBridge_windowssys_1windows_1win32_1media_1windowsmediaformat_1wMCreateWriterFileSink(JNIEnv* km_env, jclass km_clazz, jlong ppsink) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateWriterFileSink");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppsink) : -1;
#else
    (void)ppsink;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_windowsmediaformat_WindowsWin32MediaWindowsmediaformatJniBridge_windowssys_1windows_1win32_1media_1windowsmediaformat_1wMCreateWriterNetworkSink(JNIEnv* km_env, jclass km_clazz, jlong ppsink) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateWriterNetworkSink");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppsink) : -1;
#else
    (void)ppsink;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_windowsmediaformat_WindowsWin32MediaWindowsmediaformatJniBridge_windowssys_1windows_1win32_1media_1windowsmediaformat_1wMCreateWriterPushSink(JNIEnv* km_env, jclass km_clazz, jlong ppsink) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMCreateWriterPushSink");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppsink) : -1;
#else
    (void)ppsink;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_windowsmediaformat_WindowsWin32MediaWindowsmediaformatJniBridge_windowssys_1windows_1win32_1media_1windowsmediaformat_1wMIsContentProtected(JNIEnv* km_env, jclass km_clazz, jlong pwszfilename, jlong pfisprotected) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wmvcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WMIsContentProtected");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszfilename, (void*)(uintptr_t)pfisprotected) : -1;
#else
    (void)pwszfilename;
    (void)pfisprotected;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

