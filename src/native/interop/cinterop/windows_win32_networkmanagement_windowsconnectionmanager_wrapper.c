#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_windowsconnectionmanager_wrapper.h"
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

void windowssys_windows_win32_networkmanagement_windowsconnectionmanager_freeInterfaceContextTable(void* interfacecontexttable) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ondemandconnroutehelper.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeInterfaceContextTable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(interfacecontexttable);
        return;
    }
    errno = ENOSYS;
#else
    (void)interfacecontexttable;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_windowsconnectionmanager_getInterfaceContextTableForHostName(void* hostname, void* proxyname, uint32_t flags, void* connectionprofilefilterrawdata, uint32_t connectionprofilefilterrawdatasize, void* interfacecontexttable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ondemandconnroutehelper.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInterfaceContextTableForHostName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, proxyname, flags, connectionprofilefilterrawdata, connectionprofilefilterrawdatasize, interfacecontexttable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hostname;
    (void)proxyname;
    (void)flags;
    (void)connectionprofilefilterrawdata;
    (void)connectionprofilefilterrawdatasize;
    (void)interfacecontexttable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_windowsconnectionmanager_onDemandGetRoutingHint(void* destinationhostname, void* interfaceindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ondemandconnroutehelper.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnDemandGetRoutingHint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationhostname, interfaceindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationhostname;
    (void)interfaceindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_windowsconnectionmanager_onDemandRegisterNotification(void* callback, void* callbackcontext, void* registrationhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ondemandconnroutehelper.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnDemandRegisterNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback, callbackcontext, registrationhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callback;
    (void)callbackcontext;
    (void)registrationhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_windowsconnectionmanager_onDemandUnRegisterNotification(void* registrationhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ondemandconnroutehelper.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnDemandUnRegisterNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(registrationhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)registrationhandle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmFreeMemory(void* pmemory) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wcmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcmFreeMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pmemory);
        return;
    }
    errno = ENOSYS;
#else
    (void)pmemory;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmGetProfileList(void* preserved, void* ppprofilelist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wcmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcmGetProfileList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(preserved, ppprofilelist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)preserved;
    (void)ppprofilelist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmQueryProperty(void* pinterface, void* strprofilename, int32_t property, void* preserved, void* pdwdatasize, void* ppdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wcmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcmQueryProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinterface, strprofilename, property, preserved, pdwdatasize, ppdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinterface;
    (void)strprofilename;
    (void)property;
    (void)preserved;
    (void)pdwdatasize;
    (void)ppdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmSetProfileList(void* pprofilelist, uint32_t dwposition, int32_t fignoreunknownprofiles, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wcmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcmSetProfileList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprofilelist, dwposition, fignoreunknownprofiles, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pprofilelist;
    (void)dwposition;
    (void)fignoreunknownprofiles;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmSetProperty(void* pinterface, void* strprofilename, int32_t property, void* preserved, uint32_t dwdatasize, void* pbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wcmapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcmSetProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinterface, strprofilename, property, preserved, dwdatasize, pbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinterface;
    (void)strprofilename;
    (void)property;
    (void)preserved;
    (void)dwdatasize;
    (void)pbdata;
    errno = ENOSYS;
    return 0;
#endif
}

