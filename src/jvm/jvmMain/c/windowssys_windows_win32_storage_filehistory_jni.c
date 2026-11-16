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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filehistory_WindowsWin32StorageFilehistoryJniBridge_windowssysWindowsWin32StorageFilehistoryFhServiceBlockBackup(JNIEnv* km_env, jclass km_clazz, jlong arg0Pipe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fhsvcctl.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FhServiceBlockBackup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Pipe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Pipe;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filehistory_WindowsWin32StorageFilehistoryJniBridge_windowssysWindowsWin32StorageFilehistoryFhServiceClosePipe(JNIEnv* km_env, jclass km_clazz, jlong arg0Pipe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fhsvcctl.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FhServiceClosePipe");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Pipe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Pipe;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filehistory_WindowsWin32StorageFilehistoryJniBridge_windowssysWindowsWin32StorageFilehistoryFhServiceOpenPipe(JNIEnv* km_env, jclass km_clazz, jint startserviceifstopped, jlong arg1Pipe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fhsvcctl.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FhServiceOpenPipe");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)startserviceifstopped, (void*)(uintptr_t)arg1Pipe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)startserviceifstopped;
    (void)arg1Pipe;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filehistory_WindowsWin32StorageFilehistoryJniBridge_windowssysWindowsWin32StorageFilehistoryFhServiceReloadConfiguration(JNIEnv* km_env, jclass km_clazz, jlong arg0Pipe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fhsvcctl.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FhServiceReloadConfiguration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Pipe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Pipe;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filehistory_WindowsWin32StorageFilehistoryJniBridge_windowssysWindowsWin32StorageFilehistoryFhServiceStartBackup(JNIEnv* km_env, jclass km_clazz, jlong arg0Pipe, jint lowpriorityio) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fhsvcctl.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FhServiceStartBackup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Pipe, (int32_t)lowpriorityio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Pipe;
    (void)lowpriorityio;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filehistory_WindowsWin32StorageFilehistoryJniBridge_windowssysWindowsWin32StorageFilehistoryFhServiceStopBackup(JNIEnv* km_env, jclass km_clazz, jlong arg0Pipe, jint stoptracking) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fhsvcctl.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FhServiceStopBackup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Pipe, (int32_t)stoptracking);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Pipe;
    (void)stoptracking;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filehistory_WindowsWin32StorageFilehistoryJniBridge_windowssysWindowsWin32StorageFilehistoryFhServiceUnblockBackup(JNIEnv* km_env, jclass km_clazz, jlong arg0Pipe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fhsvcctl.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FhServiceUnblockBackup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Pipe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg0Pipe;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

