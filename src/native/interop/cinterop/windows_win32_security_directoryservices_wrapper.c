#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_directoryservices_wrapper.h"
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

int32_t windowssysWindowsWin32SecurityDirectoryservicesDSCreateSecurityPage(void* pwszobjectpath, void* pwszobjectclass, uint32_t dwflags, void* phpage, void* pfnreadsd, void* pfnwritesd, int64_t lpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dssec.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSCreateSecurityPage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszobjectpath, pwszobjectclass, dwflags, phpage, pfnreadsd, pfnwritesd, lpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszobjectpath;
    (void)pwszobjectclass;
    (void)dwflags;
    (void)phpage;
    (void)pfnreadsd;
    (void)pfnwritesd;
    (void)lpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityDirectoryservicesDSEditSecurity(void* hwndowner, void* pwszobjectpath, void* pwszobjectclass, uint32_t dwflags, void* pwszcaption, void* pfnreadsd, void* pfnwritesd, int64_t lpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dssec.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DSEditSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, pwszobjectpath, pwszobjectclass, dwflags, pwszcaption, pfnreadsd, pfnwritesd, lpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndowner;
    (void)pwszobjectpath;
    (void)pwszobjectclass;
    (void)dwflags;
    (void)pwszcaption;
    (void)pfnreadsd;
    (void)pfnwritesd;
    (void)lpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

