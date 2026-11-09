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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_hardwarecounterprofiling_WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge_windowssys_1windows_1win32_1system_1performance_1hardwarecounterprofiling_1DisableThreadProfiling(JNIEnv* km_env, jclass km_clazz, jlong performancedatahandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisableThreadProfiling");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)performancedatahandle) : 0;
#else
    (void)performancedatahandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_hardwarecounterprofiling_WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge_windowssys_1windows_1win32_1system_1performance_1hardwarecounterprofiling_1EnableThreadProfiling(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jint flags, jlong hardwarecounters, jlong performancedatahandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableThreadProfiling");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadhandle, (uint32_t)flags, (uint64_t)hardwarecounters, (void*)(uintptr_t)performancedatahandle) : 0;
#else
    (void)threadhandle;
    (void)flags;
    (void)hardwarecounters;
    (void)performancedatahandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_hardwarecounterprofiling_WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge_windowssys_1windows_1win32_1system_1performance_1hardwarecounterprofiling_1QueryThreadProfiling(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jlong enabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryThreadProfiling");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadhandle, (void*)(uintptr_t)enabled) : 0;
#else
    (void)threadhandle;
    (void)enabled;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_performance_hardwarecounterprofiling_WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge_windowssys_1windows_1win32_1system_1performance_1hardwarecounterprofiling_1ReadThreadProfilingData(JNIEnv* km_env, jclass km_clazz, jlong performancedatahandle, jint flags, jlong performancedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadThreadProfilingData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)performancedatahandle, (uint32_t)flags, (void*)(uintptr_t)performancedata) : 0;
#else
    (void)performancedatahandle;
    (void)flags;
    (void)performancedata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

