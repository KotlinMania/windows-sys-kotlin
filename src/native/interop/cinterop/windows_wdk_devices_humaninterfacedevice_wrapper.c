#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_wdk_devices_humaninterfacedevice_wrapper.h"
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

int32_t windowssys_windows_wdk_devices_humaninterfacedevice_vhfAsyncOperationComplete(void* vhfoperationhandle, int32_t completionstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vhfum.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VhfAsyncOperationComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vhfoperationhandle, completionstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vhfoperationhandle;
    (void)completionstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_devices_humaninterfacedevice_vhfCreate(void* vhfconfig, void* vhfhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vhfum.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VhfCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vhfconfig, vhfhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vhfconfig;
    (void)vhfhandle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_wdk_devices_humaninterfacedevice_vhfDelete(void* vhfhandle, bool wait) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vhfum.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VhfDelete");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(vhfhandle, wait);
        return;
    }
    errno = ENOSYS;
#else
    (void)vhfhandle;
    (void)wait;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_wdk_devices_humaninterfacedevice_vhfReadReportSubmit(void* vhfhandle, void* hidtransferpacket) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vhfum.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VhfReadReportSubmit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vhfhandle, hidtransferpacket);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vhfhandle;
    (void)hidtransferpacket;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_wdk_devices_humaninterfacedevice_vhfStart(void* vhfhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vhfum.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VhfStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vhfhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vhfhandle;
    errno = ENOSYS;
    return -1;
#endif
}

