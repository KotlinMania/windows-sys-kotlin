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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_WindowsWin32NetworkmanagementWindowsnetworkvirtualizationJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsnetworkvirtualization_1WnvOpen(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wnvapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WnvOpen");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_WindowsWin32NetworkmanagementWindowsnetworkvirtualizationJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsnetworkvirtualization_1WnvRequestNotification(JNIEnv* km_env, jclass km_clazz, jlong wnvhandle, jlong notificationparam, jlong overlapped, jlong bytestransferred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wnvapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WnvRequestNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)wnvhandle, (void*)(uintptr_t)notificationparam, (void*)(uintptr_t)overlapped, (void*)(uintptr_t)bytestransferred) : 0;
#else
    (void)wnvhandle;
    (void)notificationparam;
    (void)overlapped;
    (void)bytestransferred;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

