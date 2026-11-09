#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_offlinefiles_wrapper.h"
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

uint32_t windowssys_windows_win32_storage_offlinefiles_OfflineFilesEnable(int32_t benable, void* pbrebootrequired) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cscapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineFilesEnable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(benable, pbrebootrequired);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)benable;
    (void)pbrebootrequired;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_offlinefiles_OfflineFilesQueryStatus(void* pbactive, void* pbenabled) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cscapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineFilesQueryStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbactive, pbenabled);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbactive;
    (void)pbenabled;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_offlinefiles_OfflineFilesQueryStatusEx(void* pbactive, void* pbenabled, void* pbavailable) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cscapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineFilesQueryStatusEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbactive, pbenabled, pbavailable);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbactive;
    (void)pbenabled;
    (void)pbavailable;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_offlinefiles_OfflineFilesStart(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cscapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineFilesStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

