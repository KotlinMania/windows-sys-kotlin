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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_WindowsWin32UiInputJniBridge_windowssys_1windows_1win32_1ui_1input_1DefRawInputProc(JNIEnv* km_env, jclass km_clazz, jlong parawinput, jint ninput, jint cbsizeheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefRawInputProc");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)parawinput, (int32_t)ninput, (uint32_t)cbsizeheader) : -1;
#else
    (void)parawinput;
    (void)ninput;
    (void)cbsizeheader;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_WindowsWin32UiInputJniBridge_windowssys_1windows_1win32_1ui_1input_1GetCIMSSM(JNIEnv* km_env, jclass km_clazz, jlong inputmessagesource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCIMSSM");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inputmessagesource) : -1;
#else
    (void)inputmessagesource;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_WindowsWin32UiInputJniBridge_windowssys_1windows_1win32_1ui_1input_1GetCurrentInputMessageSource(JNIEnv* km_env, jclass km_clazz, jlong inputmessagesource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentInputMessageSource");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inputmessagesource) : -1;
#else
    (void)inputmessagesource;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_WindowsWin32UiInputJniBridge_windowssys_1windows_1win32_1ui_1input_1GetRawInputBuffer(JNIEnv* km_env, jclass km_clazz, jlong pdata, jlong pcbsize, jint cbsizeheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRawInputBuffer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdata, (void*)(uintptr_t)pcbsize, (uint32_t)cbsizeheader) : 0;
#else
    (void)pdata;
    (void)pcbsize;
    (void)cbsizeheader;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_WindowsWin32UiInputJniBridge_windowssys_1windows_1win32_1ui_1input_1GetRawInputData(JNIEnv* km_env, jclass km_clazz, jlong hrawinput, jint uicommand, jlong pdata, jlong pcbsize, jint cbsizeheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRawInputData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrawinput, (uint32_t)uicommand, (void*)(uintptr_t)pdata, (void*)(uintptr_t)pcbsize, (uint32_t)cbsizeheader) : 0;
#else
    (void)hrawinput;
    (void)uicommand;
    (void)pdata;
    (void)pcbsize;
    (void)cbsizeheader;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_WindowsWin32UiInputJniBridge_windowssys_1windows_1win32_1ui_1input_1GetRawInputDeviceInfoA(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jint uicommand, jlong pdata, jlong pcbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRawInputDeviceInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (uint32_t)uicommand, (void*)(uintptr_t)pdata, (void*)(uintptr_t)pcbsize) : 0;
#else
    (void)hdevice;
    (void)uicommand;
    (void)pdata;
    (void)pcbsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_WindowsWin32UiInputJniBridge_windowssys_1windows_1win32_1ui_1input_1GetRawInputDeviceInfoW(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jint uicommand, jlong pdata, jlong pcbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRawInputDeviceInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (uint32_t)uicommand, (void*)(uintptr_t)pdata, (void*)(uintptr_t)pcbsize) : 0;
#else
    (void)hdevice;
    (void)uicommand;
    (void)pdata;
    (void)pcbsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_WindowsWin32UiInputJniBridge_windowssys_1windows_1win32_1ui_1input_1GetRawInputDeviceList(JNIEnv* km_env, jclass km_clazz, jlong prawinputdevicelist, jlong puinumdevices, jint cbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRawInputDeviceList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prawinputdevicelist, (void*)(uintptr_t)puinumdevices, (uint32_t)cbsize) : 0;
#else
    (void)prawinputdevicelist;
    (void)puinumdevices;
    (void)cbsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_WindowsWin32UiInputJniBridge_windowssys_1windows_1win32_1ui_1input_1GetRegisteredRawInputDevices(JNIEnv* km_env, jclass km_clazz, jlong prawinputdevices, jlong puinumdevices, jint cbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRegisteredRawInputDevices");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prawinputdevices, (void*)(uintptr_t)puinumdevices, (uint32_t)cbsize) : 0;
#else
    (void)prawinputdevices;
    (void)puinumdevices;
    (void)cbsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_WindowsWin32UiInputJniBridge_windowssys_1windows_1win32_1ui_1input_1RegisterRawInputDevices(JNIEnv* km_env, jclass km_clazz, jlong prawinputdevices, jint uinumdevices, jint cbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterRawInputDevices");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prawinputdevices, (uint32_t)uinumdevices, (uint32_t)cbsize) : -1;
#else
    (void)prawinputdevices;
    (void)uinumdevices;
    (void)cbsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

