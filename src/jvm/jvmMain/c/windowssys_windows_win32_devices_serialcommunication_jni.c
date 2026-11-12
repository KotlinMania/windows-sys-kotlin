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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_serialcommunication_WindowsWin32DevicesSerialcommunicationJniBridge_windowssysWindowsWin32DevicesSerialcommunicationComDBClaimNextFreePort(JNIEnv* km_env, jclass km_clazz, jlong hcomdb, jlong comnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msports.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComDBClaimNextFreePort");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcomdb, (void*)(uintptr_t)comnumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcomdb;
    (void)comnumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_serialcommunication_WindowsWin32DevicesSerialcommunicationJniBridge_windowssysWindowsWin32DevicesSerialcommunicationComDBClaimPort(JNIEnv* km_env, jclass km_clazz, jlong hcomdb, jint comnumber, jint forceclaim, jlong forced) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msports.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComDBClaimPort");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcomdb, (uint32_t)comnumber, (int32_t)forceclaim, (void*)(uintptr_t)forced);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcomdb;
    (void)comnumber;
    (void)forceclaim;
    (void)forced;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_serialcommunication_WindowsWin32DevicesSerialcommunicationJniBridge_windowssysWindowsWin32DevicesSerialcommunicationComDBClose(JNIEnv* km_env, jclass km_clazz, jlong hcomdb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msports.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComDBClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcomdb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcomdb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_serialcommunication_WindowsWin32DevicesSerialcommunicationJniBridge_windowssysWindowsWin32DevicesSerialcommunicationComDBGetCurrentPortUsage(JNIEnv* km_env, jclass km_clazz, jlong hcomdb, jlong buffer, jint buffersize, jint reporttype, jlong maxportsreported) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msports.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComDBGetCurrentPortUsage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcomdb, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (uint32_t)reporttype, (void*)(uintptr_t)maxportsreported);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcomdb;
    (void)buffer;
    (void)buffersize;
    (void)reporttype;
    (void)maxportsreported;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_serialcommunication_WindowsWin32DevicesSerialcommunicationJniBridge_windowssysWindowsWin32DevicesSerialcommunicationComDBOpen(JNIEnv* km_env, jclass km_clazz, jlong phcomdb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msports.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComDBOpen");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcomdb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcomdb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_serialcommunication_WindowsWin32DevicesSerialcommunicationJniBridge_windowssysWindowsWin32DevicesSerialcommunicationComDBReleasePort(JNIEnv* km_env, jclass km_clazz, jlong hcomdb, jint comnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msports.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComDBReleasePort");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcomdb, (uint32_t)comnumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcomdb;
    (void)comnumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_serialcommunication_WindowsWin32DevicesSerialcommunicationJniBridge_windowssysWindowsWin32DevicesSerialcommunicationComDBResizeDatabase(JNIEnv* km_env, jclass km_clazz, jlong hcomdb, jint newsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msports.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ComDBResizeDatabase");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcomdb, (uint32_t)newsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcomdb;
    (void)newsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

