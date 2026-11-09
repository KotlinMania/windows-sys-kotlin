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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioAcquireFocus(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioAcquireFocus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioAsyncEnumBiometricUnits(JNIEnv* km_env, jclass km_clazz, jint frameworkhandle, jint factor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioAsyncEnumBiometricUnits");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)frameworkhandle, (uint32_t)factor) : -1;
#else
    (void)frameworkhandle;
    (void)factor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioAsyncEnumDatabases(JNIEnv* km_env, jclass km_clazz, jint frameworkhandle, jint factor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioAsyncEnumDatabases");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)frameworkhandle, (uint32_t)factor) : -1;
#else
    (void)frameworkhandle;
    (void)factor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioAsyncEnumServiceProviders(JNIEnv* km_env, jclass km_clazz, jint frameworkhandle, jint factor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioAsyncEnumServiceProviders");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)frameworkhandle, (uint32_t)factor) : -1;
#else
    (void)frameworkhandle;
    (void)factor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioAsyncMonitorFrameworkChanges(JNIEnv* km_env, jclass km_clazz, jint frameworkhandle, jint changetypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioAsyncMonitorFrameworkChanges");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)frameworkhandle, (uint32_t)changetypes) : -1;
#else
    (void)frameworkhandle;
    (void)changetypes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioAsyncOpenFramework(JNIEnv* km_env, jclass km_clazz, jint notificationmethod, jlong targetwindow, jint messagecode, jlong callbackroutine, jlong userdata, jint asynchronousopen, jlong frameworkhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioAsyncOpenFramework");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)notificationmethod, (void*)(uintptr_t)targetwindow, (uint32_t)messagecode, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)userdata, (int32_t)asynchronousopen, (void*)(uintptr_t)frameworkhandle) : -1;
#else
    (void)notificationmethod;
    (void)targetwindow;
    (void)messagecode;
    (void)callbackroutine;
    (void)userdata;
    (void)asynchronousopen;
    (void)frameworkhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioAsyncOpenSession(JNIEnv* km_env, jclass km_clazz, jint factor, jint pooltype, jint flags, jlong unitarray, jlong unitcount, jlong databaseid, jint notificationmethod, jlong targetwindow, jint messagecode, jlong callbackroutine, jlong userdata, jint asynchronousopen, jlong sessionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint64_t, void*, int32_t, void*, uint32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioAsyncOpenSession");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)factor, (uint32_t)pooltype, (uint32_t)flags, (void*)(uintptr_t)unitarray, (uint64_t)unitcount, (void*)(uintptr_t)databaseid, (int32_t)notificationmethod, (void*)(uintptr_t)targetwindow, (uint32_t)messagecode, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)userdata, (int32_t)asynchronousopen, (void*)(uintptr_t)sessionhandle) : -1;
#else
    (void)factor;
    (void)pooltype;
    (void)flags;
    (void)unitarray;
    (void)unitcount;
    (void)databaseid;
    (void)notificationmethod;
    (void)targetwindow;
    (void)messagecode;
    (void)callbackroutine;
    (void)userdata;
    (void)asynchronousopen;
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioCancel(JNIEnv* km_env, jclass km_clazz, jint sessionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioCancel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle) : -1;
#else
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioCaptureSample(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jbyte purpose, jbyte flags, jlong unitid, jlong sample, jlong samplesize, jlong rejectdetail) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint8_t, uint8_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioCaptureSample");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint8_t)purpose, (uint8_t)flags, (void*)(uintptr_t)unitid, (void*)(uintptr_t)sample, (void*)(uintptr_t)samplesize, (void*)(uintptr_t)rejectdetail) : -1;
#else
    (void)sessionhandle;
    (void)purpose;
    (void)flags;
    (void)unitid;
    (void)sample;
    (void)samplesize;
    (void)rejectdetail;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioCaptureSampleWithCallback(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jbyte purpose, jbyte flags, jlong capturecallback, jlong capturecallbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint8_t, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioCaptureSampleWithCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint8_t)purpose, (uint8_t)flags, (void*)(uintptr_t)capturecallback, (void*)(uintptr_t)capturecallbackcontext) : -1;
#else
    (void)sessionhandle;
    (void)purpose;
    (void)flags;
    (void)capturecallback;
    (void)capturecallbackcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioCloseFramework(JNIEnv* km_env, jclass km_clazz, jint frameworkhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioCloseFramework");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)frameworkhandle) : -1;
#else
    (void)frameworkhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioCloseSession(JNIEnv* km_env, jclass km_clazz, jint sessionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioCloseSession");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle) : -1;
#else
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioControlUnit(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jint unitid, jint component, jint controlcode, jlong sendbuffer, jlong sendbuffersize, jlong receivebuffer, jlong receivebuffersize, jlong receivedatasize, jlong operationstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioControlUnit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint32_t)unitid, (uint32_t)component, (uint32_t)controlcode, (void*)(uintptr_t)sendbuffer, (uint64_t)sendbuffersize, (void*)(uintptr_t)receivebuffer, (uint64_t)receivebuffersize, (void*)(uintptr_t)receivedatasize, (void*)(uintptr_t)operationstatus) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    (void)component;
    (void)controlcode;
    (void)sendbuffer;
    (void)sendbuffersize;
    (void)receivebuffer;
    (void)receivebuffersize;
    (void)receivedatasize;
    (void)operationstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioControlUnitPrivileged(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jint unitid, jint component, jint controlcode, jlong sendbuffer, jlong sendbuffersize, jlong receivebuffer, jlong receivebuffersize, jlong receivedatasize, jlong operationstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioControlUnitPrivileged");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint32_t)unitid, (uint32_t)component, (uint32_t)controlcode, (void*)(uintptr_t)sendbuffer, (uint64_t)sendbuffersize, (void*)(uintptr_t)receivebuffer, (uint64_t)receivebuffersize, (void*)(uintptr_t)receivedatasize, (void*)(uintptr_t)operationstatus) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    (void)component;
    (void)controlcode;
    (void)sendbuffer;
    (void)sendbuffersize;
    (void)receivebuffer;
    (void)receivebuffersize;
    (void)receivedatasize;
    (void)operationstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioDeleteTemplate(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jint unitid, jlong identity, jbyte subfactor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioDeleteTemplate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint32_t)unitid, (void*)(uintptr_t)identity, (uint8_t)subfactor) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    (void)identity;
    (void)subfactor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioEnrollBegin(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jbyte subfactor, jint unitid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint8_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnrollBegin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint8_t)subfactor, (uint32_t)unitid) : -1;
#else
    (void)sessionhandle;
    (void)subfactor;
    (void)unitid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioEnrollCapture(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jlong rejectdetail) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnrollCapture");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (void*)(uintptr_t)rejectdetail) : -1;
#else
    (void)sessionhandle;
    (void)rejectdetail;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioEnrollCaptureWithCallback(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jlong enrollcallback, jlong enrollcallbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnrollCaptureWithCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (void*)(uintptr_t)enrollcallback, (void*)(uintptr_t)enrollcallbackcontext) : -1;
#else
    (void)sessionhandle;
    (void)enrollcallback;
    (void)enrollcallbackcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioEnrollCommit(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jlong identity, jlong isnewtemplate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnrollCommit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (void*)(uintptr_t)identity, (void*)(uintptr_t)isnewtemplate) : -1;
#else
    (void)sessionhandle;
    (void)identity;
    (void)isnewtemplate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioEnrollDiscard(JNIEnv* km_env, jclass km_clazz, jint sessionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnrollDiscard");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle) : -1;
#else
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioEnrollSelect(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jlong selectorvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnrollSelect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint64_t)selectorvalue) : -1;
#else
    (void)sessionhandle;
    (void)selectorvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioEnumBiometricUnits(JNIEnv* km_env, jclass km_clazz, jint factor, jlong unitschemaarray, jlong unitcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnumBiometricUnits");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)factor, (void*)(uintptr_t)unitschemaarray, (void*)(uintptr_t)unitcount) : -1;
#else
    (void)factor;
    (void)unitschemaarray;
    (void)unitcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioEnumDatabases(JNIEnv* km_env, jclass km_clazz, jint factor, jlong storageschemaarray, jlong storagecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnumDatabases");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)factor, (void*)(uintptr_t)storageschemaarray, (void*)(uintptr_t)storagecount) : -1;
#else
    (void)factor;
    (void)storageschemaarray;
    (void)storagecount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioEnumEnrollments(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jint unitid, jlong identity, jlong subfactorarray, jlong subfactorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnumEnrollments");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint32_t)unitid, (void*)(uintptr_t)identity, (void*)(uintptr_t)subfactorarray, (void*)(uintptr_t)subfactorcount) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    (void)identity;
    (void)subfactorarray;
    (void)subfactorcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioEnumServiceProviders(JNIEnv* km_env, jclass km_clazz, jint factor, jlong bspschemaarray, jlong bspcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnumServiceProviders");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)factor, (void*)(uintptr_t)bspschemaarray, (void*)(uintptr_t)bspcount) : -1;
#else
    (void)factor;
    (void)bspschemaarray;
    (void)bspcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioFree(JNIEnv* km_env, jclass km_clazz, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioFree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)address) : -1;
#else
    (void)address;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioGetDomainLogonSetting(JNIEnv* km_env, jclass km_clazz, jlong value, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioGetDomainLogonSetting");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)value, (void*)(uintptr_t)source);
#else
    (void)value;
    (void)source;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioGetEnabledSetting(JNIEnv* km_env, jclass km_clazz, jlong value, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioGetEnabledSetting");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)value, (void*)(uintptr_t)source);
#else
    (void)value;
    (void)source;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioGetEnrolledFactors(JNIEnv* km_env, jclass km_clazz, jlong accountowner, jlong enrolledfactors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioGetEnrolledFactors");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)accountowner, (void*)(uintptr_t)enrolledfactors) : -1;
#else
    (void)accountowner;
    (void)enrolledfactors;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioGetLogonSetting(JNIEnv* km_env, jclass km_clazz, jlong value, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioGetLogonSetting");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)value, (void*)(uintptr_t)source);
#else
    (void)value;
    (void)source;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioGetProperty(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jint propertytype, jint propertyid, jint unitid, jlong identity, jbyte subfactor, jlong propertybuffer, jlong propertybuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioGetProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint32_t)propertytype, (uint32_t)propertyid, (uint32_t)unitid, (void*)(uintptr_t)identity, (uint8_t)subfactor, (void*)(uintptr_t)propertybuffer, (void*)(uintptr_t)propertybuffersize) : -1;
#else
    (void)sessionhandle;
    (void)propertytype;
    (void)propertyid;
    (void)unitid;
    (void)identity;
    (void)subfactor;
    (void)propertybuffer;
    (void)propertybuffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioIdentify(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jlong unitid, jlong identity, jlong subfactor, jlong rejectdetail) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioIdentify");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (void*)(uintptr_t)unitid, (void*)(uintptr_t)identity, (void*)(uintptr_t)subfactor, (void*)(uintptr_t)rejectdetail) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    (void)identity;
    (void)subfactor;
    (void)rejectdetail;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioIdentifyWithCallback(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jlong identifycallback, jlong identifycallbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioIdentifyWithCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (void*)(uintptr_t)identifycallback, (void*)(uintptr_t)identifycallbackcontext) : -1;
#else
    (void)sessionhandle;
    (void)identifycallback;
    (void)identifycallbackcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioImproveBegin(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jint unitid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioImproveBegin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint32_t)unitid) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioImproveEnd(JNIEnv* km_env, jclass km_clazz, jint sessionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioImproveEnd");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle) : -1;
#else
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioLocateSensor(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jlong unitid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioLocateSensor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (void*)(uintptr_t)unitid) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioLocateSensorWithCallback(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jlong locatecallback, jlong locatecallbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioLocateSensorWithCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (void*)(uintptr_t)locatecallback, (void*)(uintptr_t)locatecallbackcontext) : -1;
#else
    (void)sessionhandle;
    (void)locatecallback;
    (void)locatecallbackcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioLockUnit(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jint unitid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioLockUnit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint32_t)unitid) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioLogonIdentifiedUser(JNIEnv* km_env, jclass km_clazz, jint sessionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioLogonIdentifiedUser");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle) : -1;
#else
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioMonitorPresence(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jint unitid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioMonitorPresence");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint32_t)unitid) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioOpenSession(JNIEnv* km_env, jclass km_clazz, jint factor, jint pooltype, jint flags, jlong unitarray, jlong unitcount, jlong databaseid, jlong sessionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioOpenSession");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)factor, (uint32_t)pooltype, (uint32_t)flags, (void*)(uintptr_t)unitarray, (uint64_t)unitcount, (void*)(uintptr_t)databaseid, (void*)(uintptr_t)sessionhandle) : -1;
#else
    (void)factor;
    (void)pooltype;
    (void)flags;
    (void)unitarray;
    (void)unitcount;
    (void)databaseid;
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioRegisterEventMonitor(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jint eventmask, jlong eventcallback, jlong eventcallbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioRegisterEventMonitor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint32_t)eventmask, (void*)(uintptr_t)eventcallback, (void*)(uintptr_t)eventcallbackcontext) : -1;
#else
    (void)sessionhandle;
    (void)eventmask;
    (void)eventcallback;
    (void)eventcallbackcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioReleaseFocus(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioReleaseFocus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioRemoveAllCredentials(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioRemoveAllCredentials");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioRemoveAllDomainCredentials(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioRemoveAllDomainCredentials");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioSetCredential(JNIEnv* km_env, jclass km_clazz, jint type, jlong credential, jlong credentialsize, jint format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioSetCredential");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)type, (void*)(uintptr_t)credential, (uint64_t)credentialsize, (int32_t)format) : -1;
#else
    (void)type;
    (void)credential;
    (void)credentialsize;
    (void)format;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioSetProperty(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jint propertytype, jint propertyid, jint unitid, jlong identity, jbyte subfactor, jlong propertybuffer, jlong propertybuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint8_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioSetProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint32_t)propertytype, (uint32_t)propertyid, (uint32_t)unitid, (void*)(uintptr_t)identity, (uint8_t)subfactor, (void*)(uintptr_t)propertybuffer, (uint64_t)propertybuffersize) : -1;
#else
    (void)sessionhandle;
    (void)propertytype;
    (void)propertyid;
    (void)unitid;
    (void)identity;
    (void)subfactor;
    (void)propertybuffer;
    (void)propertybuffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioUnlockUnit(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jint unitid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioUnlockUnit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (uint32_t)unitid) : -1;
#else
    (void)sessionhandle;
    (void)unitid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioUnregisterEventMonitor(JNIEnv* km_env, jclass km_clazz, jint sessionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioUnregisterEventMonitor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle) : -1;
#else
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioVerify(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jlong identity, jbyte subfactor, jlong unitid, jlong match, jlong rejectdetail) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint8_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioVerify");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (void*)(uintptr_t)identity, (uint8_t)subfactor, (void*)(uintptr_t)unitid, (void*)(uintptr_t)match, (void*)(uintptr_t)rejectdetail) : -1;
#else
    (void)sessionhandle;
    (void)identity;
    (void)subfactor;
    (void)unitid;
    (void)match;
    (void)rejectdetail;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioVerifyWithCallback(JNIEnv* km_env, jclass km_clazz, jint sessionhandle, jlong identity, jbyte subfactor, jlong verifycallback, jlong verifycallbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioVerifyWithCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle, (void*)(uintptr_t)identity, (uint8_t)subfactor, (void*)(uintptr_t)verifycallback, (void*)(uintptr_t)verifycallbackcontext) : -1;
#else
    (void)sessionhandle;
    (void)identity;
    (void)subfactor;
    (void)verifycallback;
    (void)verifycallbackcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_biometricframework_WindowsWin32DevicesBiometricframeworkJniBridge_windowssys_1windows_1win32_1devices_1biometricframework_1WinBioWait(JNIEnv* km_env, jclass km_clazz, jint sessionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioWait");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sessionhandle) : -1;
#else
    (void)sessionhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

