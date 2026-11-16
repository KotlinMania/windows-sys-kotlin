#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_wmi_wrapper.h"
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

int32_t windowssysWindowsWin32SystemWmiMiApplicationInitializeV1(uint32_t flags, void* applicationid, void* extendederror, void* application) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MI_Application_InitializeV1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, applicationid, extendederror, application);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)applicationid;
    (void)extendederror;
    (void)application;
    errno = ENOSYS;
    return -1;
#endif
}

