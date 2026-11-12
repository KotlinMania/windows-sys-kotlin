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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_imapi_WindowsWin32StorageImapiJniBridge_windowssysWindowsWin32StorageImapiCloseIMsgSession(JNIEnv* km_env, jclass km_clazz, jlong lpmsgsess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseIMsgSession");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)lpmsgsess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpmsgsess;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_imapi_WindowsWin32StorageImapiJniBridge_windowssysWindowsWin32StorageImapiGetAttribIMsgOnIStg(JNIEnv* km_env, jclass km_clazz, jlong lpobject, jlong lpproptagarray, jlong lpppropattrarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAttribIMsgOnIStg");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpobject, (void*)(uintptr_t)lpproptagarray, (void*)(uintptr_t)lpppropattrarray);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpobject;
    (void)lpproptagarray;
    (void)lpppropattrarray;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_imapi_WindowsWin32StorageImapiJniBridge_windowssysWindowsWin32StorageImapiMapStorageSCode(JNIEnv* km_env, jclass km_clazz, jint stgscode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapStorageSCode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)stgscode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stgscode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_imapi_WindowsWin32StorageImapiJniBridge_windowssysWindowsWin32StorageImapiOpenIMsgSession(JNIEnv* km_env, jclass km_clazz, jlong lpmalloc, jint ulflags, jlong lppmsgsess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenIMsgSession");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmalloc, (uint32_t)ulflags, (void*)(uintptr_t)lppmsgsess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpmalloc;
    (void)ulflags;
    (void)lppmsgsess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_imapi_WindowsWin32StorageImapiJniBridge_windowssysWindowsWin32StorageImapiSetAttribIMsgOnIStg(JNIEnv* km_env, jclass km_clazz, jlong lpobject, jlong lpproptags, jlong lppropattrs, jlong lpppropproblems) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAttribIMsgOnIStg");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpobject, (void*)(uintptr_t)lpproptags, (void*)(uintptr_t)lppropattrs, (void*)(uintptr_t)lpppropproblems);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpobject;
    (void)lpproptags;
    (void)lppropattrs;
    (void)lpppropproblems;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

