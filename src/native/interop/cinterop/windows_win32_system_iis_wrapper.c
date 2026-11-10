#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_iis_wrapper.h"
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

int32_t windowssys_windows_win32_system_iis_getExtensionVersion(void* pver) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcproxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExtensionVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pver);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pver;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_iis_getFilterVersion(void* pver) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcproxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFilterVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pver);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pver;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_iis_httpExtensionProc(void* pecb) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcproxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpExtensionProc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pecb);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pecb;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_iis_httpFilterProc(void* pfc, uint32_t notificationtype, void* pvnotification) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcproxy.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpFilterProc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfc, notificationtype, pvnotification);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pfc;
    (void)notificationtype;
    (void)pvnotification;
    errno = ENOSYS;
    return 0;
#endif
}

