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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_wmi_WindowsWin32SystemWmiJniBridge_windowssysWindowsWin32SystemWmiMiApplicationInitializeV1(JNIEnv* km_env, jclass km_clazz, jint flags, jlong applicationid, jlong extendederror, jlong application) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MI_Application_InitializeV1");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)applicationid, (void*)(uintptr_t)extendederror, (void*)(uintptr_t)application);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)applicationid;
    (void)extendederror;
    (void)application;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

