#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_imapi_wrapper.h"
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

void windowssys_windows_win32_storage_imapi_CloseIMsgSession(int64_t lpmsgsess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseIMsgSession");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpmsgsess);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpmsgsess;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_storage_imapi_GetAttribIMsgOnIStg(void* lpobject, void* lpproptagarray, void* lpppropattrarray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAttribIMsgOnIStg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpobject, lpproptagarray, lpppropattrarray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpobject;
    (void)lpproptagarray;
    (void)lpppropattrarray;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_imapi_MapStorageSCode(int32_t stgscode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapStorageSCode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stgscode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stgscode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_imapi_OpenIMsgSession(void* lpmalloc, uint32_t ulflags, void* lppmsgsess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenIMsgSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmalloc, ulflags, lppmsgsess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmalloc;
    (void)ulflags;
    (void)lppmsgsess;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_imapi_SetAttribIMsgOnIStg(void* lpobject, void* lpproptags, void* lppropattrs, void* lpppropproblems) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAttribIMsgOnIStg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpobject, lpproptags, lppropattrs, lpppropproblems);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpobject;
    (void)lpproptags;
    (void)lppropattrs;
    (void)lpppropproblems;
    errno = ENOSYS;
    return -1;
#endif
}

