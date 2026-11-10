#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_portabledevices_wrapper.h"
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

int32_t windowssys_windows_win32_devices_portabledevices_dMProcessConfigXMLFiltered(void* pszxmlin, void* rgszallowedcspnodes, uint32_t dwnumallowedcspnodes, void* pbstrxmlout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dmprocessxmlfiltered.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DMProcessConfigXMLFiltered");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszxmlin, rgszallowedcspnodes, dwnumallowedcspnodes, pbstrxmlout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszxmlin;
    (void)rgszallowedcspnodes;
    (void)dwnumallowedcspnodes;
    (void)pbstrxmlout;
    errno = ENOSYS;
    return -1;
#endif
}

