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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_offlinefiles_WindowsWin32StorageOfflinefilesJniBridge_windowssys_1windows_1win32_1storage_1offlinefiles_1OfflineFilesEnable(JNIEnv* km_env, jclass km_clazz, jint benable, jlong pbrebootrequired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cscapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineFilesEnable");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)benable, (void*)(uintptr_t)pbrebootrequired) : 0;
#else
    (void)benable;
    (void)pbrebootrequired;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_offlinefiles_WindowsWin32StorageOfflinefilesJniBridge_windowssys_1windows_1win32_1storage_1offlinefiles_1OfflineFilesQueryStatus(JNIEnv* km_env, jclass km_clazz, jlong pbactive, jlong pbenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cscapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineFilesQueryStatus");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbactive, (void*)(uintptr_t)pbenabled) : 0;
#else
    (void)pbactive;
    (void)pbenabled;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_offlinefiles_WindowsWin32StorageOfflinefilesJniBridge_windowssys_1windows_1win32_1storage_1offlinefiles_1OfflineFilesQueryStatusEx(JNIEnv* km_env, jclass km_clazz, jlong pbactive, jlong pbenabled, jlong pbavailable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cscapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineFilesQueryStatusEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbactive, (void*)(uintptr_t)pbenabled, (void*)(uintptr_t)pbavailable) : 0;
#else
    (void)pbactive;
    (void)pbenabled;
    (void)pbavailable;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_offlinefiles_WindowsWin32StorageOfflinefilesJniBridge_windowssys_1windows_1win32_1storage_1offlinefiles_1OfflineFilesStart(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cscapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineFilesStart");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

