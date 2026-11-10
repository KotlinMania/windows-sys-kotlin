#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_multicast_wrapper.h"
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

void windowssys_windows_win32_networkmanagement_multicast_mcastApiCleanup(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "McastApiCleanup");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_multicast_mcastApiStartup(void* version) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "McastApiStartup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(version);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)version;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_multicast_mcastEnumerateScopes(uint16_t addrfamily, int32_t requery, void* pscopelist, void* pscopelen, void* pscopecount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "McastEnumerateScopes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addrfamily, requery, pscopelist, pscopelen, pscopecount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)addrfamily;
    (void)requery;
    (void)pscopelist;
    (void)pscopelen;
    (void)pscopecount;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_multicast_mcastGenUID(void* prequestid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "McastGenUID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prequestid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prequestid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_multicast_mcastReleaseAddress(uint16_t addrfamily, void* prequestid, void* preleaserequest) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "McastReleaseAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addrfamily, prequestid, preleaserequest);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)addrfamily;
    (void)prequestid;
    (void)preleaserequest;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_multicast_mcastRenewAddress(uint16_t addrfamily, void* prequestid, void* prenewrequest, void* prenewresponse) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "McastRenewAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addrfamily, prequestid, prenewrequest, prenewresponse);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)addrfamily;
    (void)prequestid;
    (void)prenewrequest;
    (void)prenewresponse;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_multicast_mcastRequestAddress(uint16_t addrfamily, void* prequestid, void* pscopectx, void* paddrrequest, void* paddrresponse) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "McastRequestAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addrfamily, prequestid, pscopectx, paddrrequest, paddrresponse);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)addrfamily;
    (void)prequestid;
    (void)pscopectx;
    (void)paddrrequest;
    (void)paddrresponse;
    errno = ENOSYS;
    return 0;
#endif
}

