#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_wdk_system_memory_wrapper.h"
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

int32_t windowssys_windows_wdk_system_memory_ntMapViewOfSection(void* sectionhandle, void* processhandle, void* baseaddress, uint64_t zerobits, uint64_t commitsize, void* sectionoffset, void* viewsize, int32_t inheritdisposition, uint32_t allocationtype, uint32_t win32protect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint64_t, void*, void*, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtMapViewOfSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionhandle, processhandle, baseaddress, zerobits, commitsize, sectionoffset, viewsize, inheritdisposition, allocationtype, win32protect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sectionhandle;
    (void)processhandle;
    (void)baseaddress;
    (void)zerobits;
    (void)commitsize;
    (void)sectionoffset;
    (void)viewsize;
    (void)inheritdisposition;
    (void)allocationtype;
    (void)win32protect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_system_memory_ntOpenSection(void* sectionhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sectionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_system_memory_ntUnmapViewOfSection(void* processhandle, void* baseaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtUnmapViewOfSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, baseaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)baseaddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_system_memory_zwMapViewOfSection(void* sectionhandle, void* processhandle, void* baseaddress, uint64_t zerobits, uint64_t commitsize, void* sectionoffset, void* viewsize, int32_t inheritdisposition, uint32_t allocationtype, uint32_t win32protect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint64_t, void*, void*, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwMapViewOfSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionhandle, processhandle, baseaddress, zerobits, commitsize, sectionoffset, viewsize, inheritdisposition, allocationtype, win32protect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sectionhandle;
    (void)processhandle;
    (void)baseaddress;
    (void)zerobits;
    (void)commitsize;
    (void)sectionoffset;
    (void)viewsize;
    (void)inheritdisposition;
    (void)allocationtype;
    (void)win32protect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_system_memory_zwOpenSection(void* sectionhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sectionhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sectionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_system_memory_zwUnmapViewOfSection(void* processhandle, void* baseaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwUnmapViewOfSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, baseaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)baseaddress;
    errno = ENOSYS;
    return -1;
#endif
}

