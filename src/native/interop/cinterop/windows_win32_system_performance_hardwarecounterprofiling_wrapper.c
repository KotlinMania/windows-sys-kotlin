#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_performance_hardwarecounterprofiling_wrapper.h"
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

uint32_t windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingDisableThreadProfiling(void* performancedatahandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisableThreadProfiling");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(performancedatahandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)performancedatahandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingEnableThreadProfiling(void* threadhandle, uint32_t flags, uint64_t hardwarecounters, void* performancedatahandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableThreadProfiling");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle, flags, hardwarecounters, performancedatahandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)threadhandle;
    (void)flags;
    (void)hardwarecounters;
    (void)performancedatahandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingQueryThreadProfiling(void* threadhandle, void* enabled) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryThreadProfiling");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle, enabled);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)threadhandle;
    (void)enabled;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingReadThreadProfilingData(void* performancedatahandle, uint32_t flags, void* performancedata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadThreadProfilingData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(performancedatahandle, flags, performancedata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)performancedatahandle;
    (void)flags;
    (void)performancedata;
    errno = ENOSYS;
    return 0;
#endif
}

