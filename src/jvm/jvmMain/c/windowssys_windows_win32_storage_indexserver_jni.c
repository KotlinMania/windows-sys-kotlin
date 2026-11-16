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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_indexserver_WindowsWin32StorageIndexserverJniBridge_windowssysWindowsWin32StorageIndexserverBindIFilterFromStorage(JNIEnv* km_env, jclass km_clazz, jlong pstg, jlong punkouter, jlong ppiunk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("query.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BindIFilterFromStorage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstg, (void*)(uintptr_t)punkouter, (void*)(uintptr_t)ppiunk);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstg;
    (void)punkouter;
    (void)ppiunk;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_indexserver_WindowsWin32StorageIndexserverJniBridge_windowssysWindowsWin32StorageIndexserverBindIFilterFromStream(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong punkouter, jlong ppiunk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("query.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BindIFilterFromStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)punkouter, (void*)(uintptr_t)ppiunk);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstm;
    (void)punkouter;
    (void)ppiunk;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_indexserver_WindowsWin32StorageIndexserverJniBridge_windowssysWindowsWin32StorageIndexserverLoadIFilter(JNIEnv* km_env, jclass km_clazz, jlong pwcspath, jlong punkouter, jlong ppiunk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("query.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadIFilter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwcspath, (void*)(uintptr_t)punkouter, (void*)(uintptr_t)ppiunk);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwcspath;
    (void)punkouter;
    (void)ppiunk;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_indexserver_WindowsWin32StorageIndexserverJniBridge_windowssysWindowsWin32StorageIndexserverLoadIFilterEx(JNIEnv* km_env, jclass km_clazz, jlong pwcspath, jint dwflags, jlong riid, jlong ppiunk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("query.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadIFilterEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwcspath, (uint32_t)dwflags, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppiunk);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwcspath;
    (void)dwflags;
    (void)riid;
    (void)ppiunk;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

