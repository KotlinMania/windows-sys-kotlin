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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_kernel_WindowsWin32SystemKernelJniBridge_windowssysWindowsWin32SystemKernelRtlFirstEntrySList(JNIEnv* km_env, jclass km_clazz, jlong listhead) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFirstEntrySList");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listhead);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)listhead;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_kernel_WindowsWin32SystemKernelJniBridge_windowssysWindowsWin32SystemKernelRtlInitializeSListHead(JNIEnv* km_env, jclass km_clazz, jlong listhead) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitializeSListHead");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)listhead);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listhead;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_kernel_WindowsWin32SystemKernelJniBridge_windowssysWindowsWin32SystemKernelRtlInterlockedFlushSList(JNIEnv* km_env, jclass km_clazz, jlong listhead) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInterlockedFlushSList");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listhead);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)listhead;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_kernel_WindowsWin32SystemKernelJniBridge_windowssysWindowsWin32SystemKernelRtlInterlockedPopEntrySList(JNIEnv* km_env, jclass km_clazz, jlong listhead) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInterlockedPopEntrySList");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listhead);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)listhead;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_kernel_WindowsWin32SystemKernelJniBridge_windowssysWindowsWin32SystemKernelRtlInterlockedPushEntrySList(JNIEnv* km_env, jclass km_clazz, jlong listhead, jlong listentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInterlockedPushEntrySList");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listhead, (void*)(uintptr_t)listentry);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)listhead;
    (void)listentry;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_kernel_WindowsWin32SystemKernelJniBridge_windowssysWindowsWin32SystemKernelRtlInterlockedPushListSListEx(JNIEnv* km_env, jclass km_clazz, jlong listhead, jlong list, jlong listend, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInterlockedPushListSListEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listhead, (void*)(uintptr_t)list, (void*)(uintptr_t)listend, (uint32_t)count);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)listhead;
    (void)list;
    (void)listend;
    (void)count;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_kernel_WindowsWin32SystemKernelJniBridge_windowssysWindowsWin32SystemKernelRtlQueryDepthSList(JNIEnv* km_env, jclass km_clazz, jlong listhead) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryDepthSList");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listhead);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)listhead;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

