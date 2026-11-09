#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_useraccesslogging_wrapper.h"
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

int32_t windowssys_windows_win32_system_useraccesslogging_UalInstrument(void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ualapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UalInstrument");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_useraccesslogging_UalRegisterProduct(void* wszproductname, void* wszrolename, void* wszguid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ualapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UalRegisterProduct");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wszproductname, wszrolename, wszguid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wszproductname;
    (void)wszrolename;
    (void)wszguid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_useraccesslogging_UalStart(void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ualapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UalStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_useraccesslogging_UalStop(void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ualapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UalStop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

