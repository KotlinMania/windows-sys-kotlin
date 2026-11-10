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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_mailslots_WindowsWin32SystemMailslotsJniBridge_windowssys_1windows_1win32_1system_1mailslots_1createMailslotA(JNIEnv* km_env, jclass km_clazz, jlong lpname, jint nmaxmessagesize, jint lreadtimeout, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMailslotA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpname, (uint32_t)nmaxmessagesize, (uint32_t)lreadtimeout, (void*)(uintptr_t)lpsecurityattributes);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpname;
    (void)nmaxmessagesize;
    (void)lreadtimeout;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_mailslots_WindowsWin32SystemMailslotsJniBridge_windowssys_1windows_1win32_1system_1mailslots_1createMailslotW(JNIEnv* km_env, jclass km_clazz, jlong lpname, jint nmaxmessagesize, jint lreadtimeout, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMailslotW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpname, (uint32_t)nmaxmessagesize, (uint32_t)lreadtimeout, (void*)(uintptr_t)lpsecurityattributes);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpname;
    (void)nmaxmessagesize;
    (void)lreadtimeout;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_mailslots_WindowsWin32SystemMailslotsJniBridge_windowssys_1windows_1win32_1system_1mailslots_1getMailslotInfo(JNIEnv* km_env, jclass km_clazz, jlong hmailslot, jlong lpmaxmessagesize, jlong lpnextsize, jlong lpmessagecount, jlong lpreadtimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMailslotInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmailslot, (void*)(uintptr_t)lpmaxmessagesize, (void*)(uintptr_t)lpnextsize, (void*)(uintptr_t)lpmessagecount, (void*)(uintptr_t)lpreadtimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmailslot;
    (void)lpmaxmessagesize;
    (void)lpnextsize;
    (void)lpmessagecount;
    (void)lpreadtimeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_mailslots_WindowsWin32SystemMailslotsJniBridge_windowssys_1windows_1win32_1system_1mailslots_1setMailslotInfo(JNIEnv* km_env, jclass km_clazz, jlong hmailslot, jint lreadtimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMailslotInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmailslot, (uint32_t)lreadtimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmailslot;
    (void)lreadtimeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

