#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_kernel_wrapper.h"
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

void* windowssys_windows_win32_system_kernel_rtlFirstEntrySList(void* listhead) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFirstEntrySList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listhead);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)listhead;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_system_kernel_rtlInitializeSListHead(void* listhead) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitializeSListHead");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listhead);
        return;
    }
    errno = ENOSYS;
#else
    (void)listhead;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_system_kernel_rtlInterlockedFlushSList(void* listhead) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInterlockedFlushSList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listhead);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)listhead;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_kernel_rtlInterlockedPopEntrySList(void* listhead) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInterlockedPopEntrySList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listhead);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)listhead;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_kernel_rtlInterlockedPushEntrySList(void* listhead, void* listentry) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInterlockedPushEntrySList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listhead, listentry);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)listhead;
    (void)listentry;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_kernel_rtlInterlockedPushListSListEx(void* listhead, void* list, void* listend, uint32_t count) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInterlockedPushListSListEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listhead, list, listend, count);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)listhead;
    (void)list;
    (void)listend;
    (void)count;
    errno = ENOSYS;
    return NULL;
#endif
}

uint16_t windowssys_windows_win32_system_kernel_rtlQueryDepthSList(void* listhead) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryDepthSList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listhead);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)listhead;
    errno = ENOSYS;
    return 0;
#endif
}

