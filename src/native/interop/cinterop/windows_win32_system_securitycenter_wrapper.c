#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_securitycenter_wrapper.h"
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

int32_t windowssysWindowsWin32SystemSecuritycenterWscGetAntiMalwareUri(void* ppszuri) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wscapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WscGetAntiMalwareUri");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppszuri);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppszuri;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemSecuritycenterWscGetSecurityProviderHealth(uint32_t providers, void* phealth) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wscapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WscGetSecurityProviderHealth");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(providers, phealth);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)providers;
    (void)phealth;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemSecuritycenterWscQueryAntiMalwareUri(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wscapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WscQueryAntiMalwareUri");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemSecuritycenterWscRegisterForChanges(void* reserved, void* phcallbackregistration, void* lpcallbackaddress, void* pcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wscapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WscRegisterForChanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved, phcallbackregistration, lpcallbackaddress, pcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reserved;
    (void)phcallbackregistration;
    (void)lpcallbackaddress;
    (void)pcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemSecuritycenterWscRegisterForUserNotifications(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wscapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WscRegisterForUserNotifications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemSecuritycenterWscUnRegisterChanges(void* hregistrationhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wscapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WscUnRegisterChanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hregistrationhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hregistrationhandle;
    errno = ENOSYS;
    return -1;
#endif
}

