#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_correlationvector_wrapper.h"
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

uint32_t windowssys_windows_win32_system_correlationvector_rtlExtendCorrelationVector(void* correlationvector) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlExtendCorrelationVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(correlationvector);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)correlationvector;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_correlationvector_rtlIncrementCorrelationVector(void* correlationvector) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIncrementCorrelationVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(correlationvector);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)correlationvector;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_correlationvector_rtlInitializeCorrelationVector(void* correlationvector, int32_t version, void* guid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitializeCorrelationVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(correlationvector, version, guid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)correlationvector;
    (void)version;
    (void)guid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_correlationvector_rtlValidateCorrelationVector(void* vector) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlValidateCorrelationVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vector);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)vector;
    errno = ENOSYS;
    return 0;
#endif
}

