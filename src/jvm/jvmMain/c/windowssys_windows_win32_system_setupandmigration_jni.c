#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdlib.h>
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_setupandmigration_WindowsWin32SystemSetupandmigrationJniBridge_windowssysWindowsWin32SystemSetupandmigrationOOBEComplete(JNIEnv* km_env, jclass km_clazz, jlong isoobecomplete) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OOBEComplete");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)isoobecomplete);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)isoobecomplete;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_setupandmigration_WindowsWin32SystemSetupandmigrationJniBridge_windowssysWindowsWin32SystemSetupandmigrationRegisterWaitUntilOOBECompleted(JNIEnv* km_env, jclass km_clazz, jlong oobecompletedcallback, jlong callbackcontext, jlong waithandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterWaitUntilOOBECompleted");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oobecompletedcallback, (void*)(uintptr_t)callbackcontext, (void*)(uintptr_t)waithandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oobecompletedcallback;
    (void)callbackcontext;
    (void)waithandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_setupandmigration_WindowsWin32SystemSetupandmigrationJniBridge_windowssysWindowsWin32SystemSetupandmigrationUnregisterWaitUntilOOBECompleted(JNIEnv* km_env, jclass km_clazz, jlong waithandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterWaitUntilOOBECompleted");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)waithandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)waithandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

