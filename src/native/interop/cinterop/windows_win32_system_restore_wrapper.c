#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_restore_wrapper.h"
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

uint32_t windowssys_windows_win32_system_restore_sRRemoveRestorePoint(uint32_t dwrpnum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srclient.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SRRemoveRestorePoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwrpnum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwrpnum;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_restore_sRSetRestorePointA(void* prestoreptspec, void* psmgrstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sfc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SRSetRestorePointA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prestoreptspec, psmgrstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prestoreptspec;
    (void)psmgrstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_restore_sRSetRestorePointW(void* prestoreptspec, void* psmgrstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sfc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SRSetRestorePointW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prestoreptspec, psmgrstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prestoreptspec;
    (void)psmgrstatus;
    errno = ENOSYS;
    return -1;
#endif
}

