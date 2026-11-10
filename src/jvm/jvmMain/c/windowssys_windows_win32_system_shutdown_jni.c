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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_shutdown_WindowsWin32SystemShutdownJniBridge_windowssys_1windows_1win32_1system_1shutdown_1abortSystemShutdownA(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AbortSystemShutdownA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmachinename) : -1;
#else
    (void)lpmachinename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_shutdown_WindowsWin32SystemShutdownJniBridge_windowssys_1windows_1win32_1system_1shutdown_1abortSystemShutdownW(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AbortSystemShutdownW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmachinename) : -1;
#else
    (void)lpmachinename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_shutdown_WindowsWin32SystemShutdownJniBridge_windowssys_1windows_1win32_1system_1shutdown_1checkForHiberboot(JNIEnv* km_env, jclass km_clazz, jlong phiberboot, jboolean bclearflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckForHiberboot");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phiberboot, (bool)bclearflag) : 0;
#else
    (void)phiberboot;
    (void)bclearflag;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_shutdown_WindowsWin32SystemShutdownJniBridge_windowssys_1windows_1win32_1system_1shutdown_1exitWindowsEx(JNIEnv* km_env, jclass km_clazz, jint uflags, jint dwreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExitWindowsEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uflags, (uint32_t)dwreason) : -1;
#else
    (void)uflags;
    (void)dwreason;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_shutdown_WindowsWin32SystemShutdownJniBridge_windowssys_1windows_1win32_1system_1shutdown_1initiateShutdownA(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename, jlong lpmessage, jint dwgraceperiod, jint dwshutdownflags, jint dwreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitiateShutdownA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)lpmessage, (uint32_t)dwgraceperiod, (uint32_t)dwshutdownflags, (uint32_t)dwreason) : 0;
#else
    (void)lpmachinename;
    (void)lpmessage;
    (void)dwgraceperiod;
    (void)dwshutdownflags;
    (void)dwreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_shutdown_WindowsWin32SystemShutdownJniBridge_windowssys_1windows_1win32_1system_1shutdown_1initiateShutdownW(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename, jlong lpmessage, jint dwgraceperiod, jint dwshutdownflags, jint dwreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitiateShutdownW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)lpmessage, (uint32_t)dwgraceperiod, (uint32_t)dwshutdownflags, (uint32_t)dwreason) : 0;
#else
    (void)lpmachinename;
    (void)lpmessage;
    (void)dwgraceperiod;
    (void)dwshutdownflags;
    (void)dwreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_shutdown_WindowsWin32SystemShutdownJniBridge_windowssys_1windows_1win32_1system_1shutdown_1initiateSystemShutdownA(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename, jlong lpmessage, jint dwtimeout, jint bforceappsclosed, jint brebootaftershutdown) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitiateSystemShutdownA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)lpmessage, (uint32_t)dwtimeout, (int32_t)bforceappsclosed, (int32_t)brebootaftershutdown) : -1;
#else
    (void)lpmachinename;
    (void)lpmessage;
    (void)dwtimeout;
    (void)bforceappsclosed;
    (void)brebootaftershutdown;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_shutdown_WindowsWin32SystemShutdownJniBridge_windowssys_1windows_1win32_1system_1shutdown_1initiateSystemShutdownExA(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename, jlong lpmessage, jint dwtimeout, jint bforceappsclosed, jint brebootaftershutdown, jint dwreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitiateSystemShutdownExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)lpmessage, (uint32_t)dwtimeout, (int32_t)bforceappsclosed, (int32_t)brebootaftershutdown, (uint32_t)dwreason) : -1;
#else
    (void)lpmachinename;
    (void)lpmessage;
    (void)dwtimeout;
    (void)bforceappsclosed;
    (void)brebootaftershutdown;
    (void)dwreason;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_shutdown_WindowsWin32SystemShutdownJniBridge_windowssys_1windows_1win32_1system_1shutdown_1initiateSystemShutdownExW(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename, jlong lpmessage, jint dwtimeout, jint bforceappsclosed, jint brebootaftershutdown, jint dwreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitiateSystemShutdownExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)lpmessage, (uint32_t)dwtimeout, (int32_t)bforceappsclosed, (int32_t)brebootaftershutdown, (uint32_t)dwreason) : -1;
#else
    (void)lpmachinename;
    (void)lpmessage;
    (void)dwtimeout;
    (void)bforceappsclosed;
    (void)brebootaftershutdown;
    (void)dwreason;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_shutdown_WindowsWin32SystemShutdownJniBridge_windowssys_1windows_1win32_1system_1shutdown_1initiateSystemShutdownW(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename, jlong lpmessage, jint dwtimeout, jint bforceappsclosed, jint brebootaftershutdown) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitiateSystemShutdownW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)lpmessage, (uint32_t)dwtimeout, (int32_t)bforceappsclosed, (int32_t)brebootaftershutdown) : -1;
#else
    (void)lpmachinename;
    (void)lpmessage;
    (void)dwtimeout;
    (void)bforceappsclosed;
    (void)brebootaftershutdown;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_shutdown_WindowsWin32SystemShutdownJniBridge_windowssys_1windows_1win32_1system_1shutdown_1lockWorkStation(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockWorkStation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_shutdown_WindowsWin32SystemShutdownJniBridge_windowssys_1windows_1win32_1system_1shutdown_1shutdownBlockReasonCreate(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pwszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShutdownBlockReasonCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pwszreason) : -1;
#else
    (void)hwnd;
    (void)pwszreason;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_shutdown_WindowsWin32SystemShutdownJniBridge_windowssys_1windows_1win32_1system_1shutdown_1shutdownBlockReasonDestroy(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShutdownBlockReasonDestroy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_shutdown_WindowsWin32SystemShutdownJniBridge_windowssys_1windows_1win32_1system_1shutdown_1shutdownBlockReasonQuery(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pwszbuff, jlong pcchbuff) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShutdownBlockReasonQuery");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pwszbuff, (void*)(uintptr_t)pcchbuff) : -1;
#else
    (void)hwnd;
    (void)pwszbuff;
    (void)pcchbuff;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

