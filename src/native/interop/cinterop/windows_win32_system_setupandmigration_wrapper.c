#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_setupandmigration_wrapper.h"
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

int32_t windowssys_windows_win32_system_setupandmigration_oOBEComplete(void* isoobecomplete) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OOBEComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(isoobecomplete);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)isoobecomplete;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_setupandmigration_registerWaitUntilOOBECompleted(void* oobecompletedcallback, void* callbackcontext, void* waithandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterWaitUntilOOBECompleted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oobecompletedcallback, callbackcontext, waithandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oobecompletedcallback;
    (void)callbackcontext;
    (void)waithandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_setupandmigration_unregisterWaitUntilOOBECompleted(void* waithandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterWaitUntilOOBECompleted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(waithandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)waithandle;
    errno = ENOSYS;
    return -1;
#endif
}

