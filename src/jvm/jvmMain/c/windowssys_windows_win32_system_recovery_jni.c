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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_recovery_WindowsWin32SystemRecoveryJniBridge_windowssys_1windows_1win32_1system_1recovery_1ApplicationRecoveryFinished(JNIEnv* km_env, jclass km_clazz, jint bsuccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplicationRecoveryFinished");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)bsuccess);
#else
    (void)bsuccess;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_recovery_WindowsWin32SystemRecoveryJniBridge_windowssys_1windows_1win32_1system_1recovery_1ApplicationRecoveryInProgress(JNIEnv* km_env, jclass km_clazz, jlong pbcancelled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplicationRecoveryInProgress");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbcancelled) : -1;
#else
    (void)pbcancelled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_recovery_WindowsWin32SystemRecoveryJniBridge_windowssys_1windows_1win32_1system_1recovery_1GetApplicationRecoveryCallback(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong precoverycallback, jlong ppvparameter, jlong pdwpinginterval, jlong pdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetApplicationRecoveryCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)precoverycallback, (void*)(uintptr_t)ppvparameter, (void*)(uintptr_t)pdwpinginterval, (void*)(uintptr_t)pdwflags) : -1;
#else
    (void)hprocess;
    (void)precoverycallback;
    (void)ppvparameter;
    (void)pdwpinginterval;
    (void)pdwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_recovery_WindowsWin32SystemRecoveryJniBridge_windowssys_1windows_1win32_1system_1recovery_1GetApplicationRestartSettings(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong pwzcommandline, jlong pcchsize, jlong pdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetApplicationRestartSettings");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)pwzcommandline, (void*)(uintptr_t)pcchsize, (void*)(uintptr_t)pdwflags) : -1;
#else
    (void)hprocess;
    (void)pwzcommandline;
    (void)pcchsize;
    (void)pdwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_recovery_WindowsWin32SystemRecoveryJniBridge_windowssys_1windows_1win32_1system_1recovery_1RegisterApplicationRestart(JNIEnv* km_env, jclass km_clazz, jlong pwzcommandline, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterApplicationRestart");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzcommandline, (uint32_t)dwflags) : -1;
#else
    (void)pwzcommandline;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_recovery_WindowsWin32SystemRecoveryJniBridge_windowssys_1windows_1win32_1system_1recovery_1UnregisterApplicationRecoveryCallback(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterApplicationRecoveryCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_recovery_WindowsWin32SystemRecoveryJniBridge_windowssys_1windows_1win32_1system_1recovery_1UnregisterApplicationRestart(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterApplicationRestart");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

