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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_touch_WindowsWin32UiInputTouchJniBridge_windowssys_1windows_1win32_1ui_1input_1touch_1CloseGestureInfoHandle(JNIEnv* km_env, jclass km_clazz, jlong hgestureinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseGestureInfoHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgestureinfo) : -1;
#else
    (void)hgestureinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_touch_WindowsWin32UiInputTouchJniBridge_windowssys_1windows_1win32_1ui_1input_1touch_1CloseTouchInputHandle(JNIEnv* km_env, jclass km_clazz, jlong htouchinput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseTouchInputHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htouchinput) : -1;
#else
    (void)htouchinput;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_touch_WindowsWin32UiInputTouchJniBridge_windowssys_1windows_1win32_1ui_1input_1touch_1GetGestureConfig(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwreserved, jint dwflags, jlong pcids, jlong pgestureconfig, jint cbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGestureConfig");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwreserved, (uint32_t)dwflags, (void*)(uintptr_t)pcids, (void*)(uintptr_t)pgestureconfig, (uint32_t)cbsize) : -1;
#else
    (void)hwnd;
    (void)dwreserved;
    (void)dwflags;
    (void)pcids;
    (void)pgestureconfig;
    (void)cbsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_touch_WindowsWin32UiInputTouchJniBridge_windowssys_1windows_1win32_1ui_1input_1touch_1GetGestureExtraArgs(JNIEnv* km_env, jclass km_clazz, jlong hgestureinfo, jint cbextraargs, jlong pextraargs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGestureExtraArgs");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgestureinfo, (uint32_t)cbextraargs, (void*)(uintptr_t)pextraargs) : -1;
#else
    (void)hgestureinfo;
    (void)cbextraargs;
    (void)pextraargs;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_touch_WindowsWin32UiInputTouchJniBridge_windowssys_1windows_1win32_1ui_1input_1touch_1GetGestureInfo(JNIEnv* km_env, jclass km_clazz, jlong hgestureinfo, jlong pgestureinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGestureInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgestureinfo, (void*)(uintptr_t)pgestureinfo) : -1;
#else
    (void)hgestureinfo;
    (void)pgestureinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_touch_WindowsWin32UiInputTouchJniBridge_windowssys_1windows_1win32_1ui_1input_1touch_1GetTouchInputInfo(JNIEnv* km_env, jclass km_clazz, jlong htouchinput, jint cinputs, jlong pinputs, jint cbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTouchInputInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htouchinput, (uint32_t)cinputs, (void*)(uintptr_t)pinputs, (int32_t)cbsize) : -1;
#else
    (void)htouchinput;
    (void)cinputs;
    (void)pinputs;
    (void)cbsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_touch_WindowsWin32UiInputTouchJniBridge_windowssys_1windows_1win32_1ui_1input_1touch_1IsTouchWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsTouchWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pulflags) : -1;
#else
    (void)hwnd;
    (void)pulflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_touch_WindowsWin32UiInputTouchJniBridge_windowssys_1windows_1win32_1ui_1input_1touch_1RegisterTouchWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterTouchWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)ulflags) : -1;
#else
    (void)hwnd;
    (void)ulflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_touch_WindowsWin32UiInputTouchJniBridge_windowssys_1windows_1win32_1ui_1input_1touch_1SetGestureConfig(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwreserved, jint cids, jlong pgestureconfig, jint cbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetGestureConfig");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwreserved, (uint32_t)cids, (void*)(uintptr_t)pgestureconfig, (uint32_t)cbsize) : -1;
#else
    (void)hwnd;
    (void)dwreserved;
    (void)cids;
    (void)pgestureconfig;
    (void)cbsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_touch_WindowsWin32UiInputTouchJniBridge_windowssys_1windows_1win32_1ui_1input_1touch_1UnregisterTouchWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterTouchWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

