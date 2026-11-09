#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_eventnotificationservice_wrapper.h"
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

int32_t windowssys_windows_win32_system_eventnotificationservice_IsDestinationReachableA(void* lpszdestination, void* lpqocinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDestinationReachableA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdestination, lpqocinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszdestination;
    (void)lpqocinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventnotificationservice_IsDestinationReachableW(void* lpszdestination, void* lpqocinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDestinationReachableW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdestination, lpqocinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszdestination;
    (void)lpqocinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_eventnotificationservice_IsNetworkAlive(void* lpdwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsNetworkAlive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwflags;
    errno = ENOSYS;
    return -1;
#endif
}

