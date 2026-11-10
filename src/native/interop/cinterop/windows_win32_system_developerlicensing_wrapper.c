#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_developerlicensing_wrapper.h"
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

int32_t windowssys_windows_win32_system_developerlicensing_acquireDeveloperLicense(void* hwndparent, void* pexpiration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsclient.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcquireDeveloperLicense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, pexpiration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)pexpiration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_developerlicensing_checkDeveloperLicense(void* pexpiration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsclient.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckDeveloperLicense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pexpiration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pexpiration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_developerlicensing_removeDeveloperLicense(void* hwndparent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsclient.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveDeveloperLicense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    errno = ENOSYS;
    return -1;
#endif
}

