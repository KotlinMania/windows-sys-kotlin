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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_xboxcontroller_WindowsWin32UiInputXboxcontrollerJniBridge_windowssys_1windows_1win32_1ui_1input_1xboxcontroller_1xInputEnable(JNIEnv* km_env, jclass km_clazz, jint enable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xinput1_4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XInputEnable");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)enable);
#else
    (void)enable;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_xboxcontroller_WindowsWin32UiInputXboxcontrollerJniBridge_windowssys_1windows_1win32_1ui_1input_1xboxcontroller_1xInputGetAudioDeviceIds(JNIEnv* km_env, jclass km_clazz, jint dwuserindex, jlong prenderdeviceid, jlong prendercount, jlong pcapturedeviceid, jlong pcapturecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xinput1_4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XInputGetAudioDeviceIds");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwuserindex, (void*)(uintptr_t)prenderdeviceid, (void*)(uintptr_t)prendercount, (void*)(uintptr_t)pcapturedeviceid, (void*)(uintptr_t)pcapturecount) : 0;
#else
    (void)dwuserindex;
    (void)prenderdeviceid;
    (void)prendercount;
    (void)pcapturedeviceid;
    (void)pcapturecount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_xboxcontroller_WindowsWin32UiInputXboxcontrollerJniBridge_windowssys_1windows_1win32_1ui_1input_1xboxcontroller_1xInputGetBatteryInformation(JNIEnv* km_env, jclass km_clazz, jint dwuserindex, jbyte devtype, jlong pbatteryinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xinput1_4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XInputGetBatteryInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwuserindex, (uint8_t)devtype, (void*)(uintptr_t)pbatteryinformation) : 0;
#else
    (void)dwuserindex;
    (void)devtype;
    (void)pbatteryinformation;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_xboxcontroller_WindowsWin32UiInputXboxcontrollerJniBridge_windowssys_1windows_1win32_1ui_1input_1xboxcontroller_1xInputGetCapabilities(JNIEnv* km_env, jclass km_clazz, jint dwuserindex, jint dwflags, jlong pcapabilities) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xinput1_4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XInputGetCapabilities");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwuserindex, (uint32_t)dwflags, (void*)(uintptr_t)pcapabilities) : 0;
#else
    (void)dwuserindex;
    (void)dwflags;
    (void)pcapabilities;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_xboxcontroller_WindowsWin32UiInputXboxcontrollerJniBridge_windowssys_1windows_1win32_1ui_1input_1xboxcontroller_1xInputGetKeystroke(JNIEnv* km_env, jclass km_clazz, jint dwuserindex, jint dwreserved, jlong pkeystroke) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xinput1_4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XInputGetKeystroke");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwuserindex, (uint32_t)dwreserved, (void*)(uintptr_t)pkeystroke) : 0;
#else
    (void)dwuserindex;
    (void)dwreserved;
    (void)pkeystroke;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_xboxcontroller_WindowsWin32UiInputXboxcontrollerJniBridge_windowssys_1windows_1win32_1ui_1input_1xboxcontroller_1xInputGetState(JNIEnv* km_env, jclass km_clazz, jint dwuserindex, jlong pstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xinput1_4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XInputGetState");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwuserindex, (void*)(uintptr_t)pstate) : 0;
#else
    (void)dwuserindex;
    (void)pstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_input_xboxcontroller_WindowsWin32UiInputXboxcontrollerJniBridge_windowssys_1windows_1win32_1ui_1input_1xboxcontroller_1xInputSetState(JNIEnv* km_env, jclass km_clazz, jint dwuserindex, jlong pvibration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("xinput1_4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XInputSetState");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwuserindex, (void*)(uintptr_t)pvibration) : 0;
#else
    (void)dwuserindex;
    (void)pvibration;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

