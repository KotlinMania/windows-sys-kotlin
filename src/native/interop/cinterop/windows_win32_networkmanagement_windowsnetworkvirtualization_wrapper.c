#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_windowsnetworkvirtualization_wrapper.h"
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

void* windowssysWindowsWin32NetworkmanagementWindowsnetworkvirtualizationWnvOpen(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wnvapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WnvOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsnetworkvirtualizationWnvRequestNotification(void* wnvhandle, void* notificationparam, void* overlapped, void* bytestransferred) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wnvapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WnvRequestNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wnvhandle, notificationparam, overlapped, bytestransferred);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)wnvhandle;
    (void)notificationparam;
    (void)overlapped;
    (void)bytestransferred;
    errno = ENOSYS;
    return 0;
#endif
}

