#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_netbios_wrapper.h"
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

uint8_t windowssys_windows_win32_networkmanagement_netbios_Netbios(void* pncb) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Netbios");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pncb);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pncb;
    errno = ENOSYS;
    return 0;
#endif
}

