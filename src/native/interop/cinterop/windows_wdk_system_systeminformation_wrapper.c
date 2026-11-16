#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_wdk_system_systeminformation_wrapper.h"
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

int32_t windowssysWindowsWdkSystemSysteminformationNtQuerySystemInformation(int32_t systeminformationclass, void* systeminformation, uint32_t systeminformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQuerySystemInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(systeminformationclass, systeminformation, systeminformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)systeminformationclass;
    (void)systeminformation;
    (void)systeminformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSysteminformationNtQuerySystemTime(void* systemtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQuerySystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(systemtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)systemtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSysteminformationNtQueryTimerResolution(void* maximumtime, void* minimumtime, void* currenttime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryTimerResolution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(maximumtime, minimumtime, currenttime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)maximumtime;
    (void)minimumtime;
    (void)currenttime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSysteminformationZwQuerySystemInformation(int32_t systeminformationclass, void* systeminformation, uint32_t systeminformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQuerySystemInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(systeminformationclass, systeminformation, systeminformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)systeminformationclass;
    (void)systeminformation;
    (void)systeminformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSysteminformationZwQuerySystemTime(void* systemtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQuerySystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(systemtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)systemtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemSysteminformationZwQueryTimerResolution(void* maximumtime, void* minimumtime, void* currenttime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryTimerResolution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(maximumtime, minimumtime, currenttime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)maximumtime;
    (void)minimumtime;
    (void)currenttime;
    errno = ENOSYS;
    return -1;
#endif
}

