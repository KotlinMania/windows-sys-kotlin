#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_enumeration_pnp_wrapper.h"
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

void windowssys_windows_win32_devices_enumeration_pnp_SwDeviceClose(void* hswdevice) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDeviceClose");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hswdevice);
        return;
    }
    errno = ENOSYS;
#else
    (void)hswdevice;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_enumeration_pnp_SwDeviceCreate(void* pszenumeratorname, void* pszparentdeviceinstance, void* pcreateinfo, uint32_t cpropertycount, void* pproperties, void* pcallback, void* pcontext, void* phswdevice) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDeviceCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszenumeratorname, pszparentdeviceinstance, pcreateinfo, cpropertycount, pproperties, pcallback, pcontext, phswdevice);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszenumeratorname;
    (void)pszparentdeviceinstance;
    (void)pcreateinfo;
    (void)cpropertycount;
    (void)pproperties;
    (void)pcallback;
    (void)pcontext;
    (void)phswdevice;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_enumeration_pnp_SwDeviceGetLifetime(void* hswdevice, void* plifetime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDeviceGetLifetime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hswdevice, plifetime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hswdevice;
    (void)plifetime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfacePropertySet(void* hswdevice, void* pszdeviceinterfaceid, uint32_t cpropertycount, void* pproperties) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDeviceInterfacePropertySet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hswdevice, pszdeviceinterfaceid, cpropertycount, pproperties);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hswdevice;
    (void)pszdeviceinterfaceid;
    (void)cpropertycount;
    (void)pproperties;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfaceRegister(void* hswdevice, void* pinterfaceclassguid, void* pszreferencestring, uint32_t cpropertycount, void* pproperties, int32_t fenabled, void* ppszdeviceinterfaceid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDeviceInterfaceRegister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hswdevice, pinterfaceclassguid, pszreferencestring, cpropertycount, pproperties, fenabled, ppszdeviceinterfaceid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hswdevice;
    (void)pinterfaceclassguid;
    (void)pszreferencestring;
    (void)cpropertycount;
    (void)pproperties;
    (void)fenabled;
    (void)ppszdeviceinterfaceid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfaceSetState(void* hswdevice, void* pszdeviceinterfaceid, int32_t fenabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDeviceInterfaceSetState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hswdevice, pszdeviceinterfaceid, fenabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hswdevice;
    (void)pszdeviceinterfaceid;
    (void)fenabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_enumeration_pnp_SwDevicePropertySet(void* hswdevice, uint32_t cpropertycount, void* pproperties) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDevicePropertySet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hswdevice, cpropertycount, pproperties);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hswdevice;
    (void)cpropertycount;
    (void)pproperties;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_enumeration_pnp_SwDeviceSetLifetime(void* hswdevice, int32_t lifetime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwDeviceSetLifetime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hswdevice, lifetime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hswdevice;
    (void)lifetime;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_enumeration_pnp_SwMemFree(void* pmem) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwMemFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pmem);
        return;
    }
    errno = ENOSYS;
#else
    (void)pmem;
    errno = ENOSYS;
#endif
}

