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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filehistory_WindowsWin32StorageFilehistoryJniBridge_windowssys_1windows_1win32_1storage_1filehistory_1fhServiceBlockBackup(JNIEnv* km_env, jclass km_clazz, jlong arg_0_pipe) {
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
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_pipe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_pipe;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filehistory_WindowsWin32StorageFilehistoryJniBridge_windowssys_1windows_1win32_1storage_1filehistory_1fhServiceClosePipe(JNIEnv* km_env, jclass km_clazz, jlong arg_0_pipe) {
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
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_pipe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_pipe;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filehistory_WindowsWin32StorageFilehistoryJniBridge_windowssys_1windows_1win32_1storage_1filehistory_1fhServiceOpenPipe(JNIEnv* km_env, jclass km_clazz, jint startserviceifstopped, jlong arg_1_pipe) {
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
        km_res = km_fn_ptr((int32_t)startserviceifstopped, (void*)(uintptr_t)arg_1_pipe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)startserviceifstopped;
    (void)arg_1_pipe;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filehistory_WindowsWin32StorageFilehistoryJniBridge_windowssys_1windows_1win32_1storage_1filehistory_1fhServiceReloadConfiguration(JNIEnv* km_env, jclass km_clazz, jlong arg_0_pipe) {
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
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_pipe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_pipe;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filehistory_WindowsWin32StorageFilehistoryJniBridge_windowssys_1windows_1win32_1storage_1filehistory_1fhServiceStartBackup(JNIEnv* km_env, jclass km_clazz, jlong arg_0_pipe, jint lowpriorityio) {
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
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_pipe, (int32_t)lowpriorityio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_pipe;
    (void)lowpriorityio;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filehistory_WindowsWin32StorageFilehistoryJniBridge_windowssys_1windows_1win32_1storage_1filehistory_1fhServiceStopBackup(JNIEnv* km_env, jclass km_clazz, jlong arg_0_pipe, jint stoptracking) {
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
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_pipe, (int32_t)stoptracking);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_pipe;
    (void)stoptracking;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filehistory_WindowsWin32StorageFilehistoryJniBridge_windowssys_1windows_1win32_1storage_1filehistory_1fhServiceUnblockBackup(JNIEnv* km_env, jclass km_clazz, jlong arg_0_pipe) {
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
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_pipe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_pipe;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

