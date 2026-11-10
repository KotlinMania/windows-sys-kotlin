#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_operationrecorder_wrapper.h"
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

int32_t windowssys_windows_win32_storage_operationrecorder_operationEnd(void* operationendparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OperationEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operationendparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)operationendparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_operationrecorder_operationStart(void* operationstartparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OperationStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operationstartparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)operationstartparams;
    errno = ENOSYS;
    return -1;
#endif
}

