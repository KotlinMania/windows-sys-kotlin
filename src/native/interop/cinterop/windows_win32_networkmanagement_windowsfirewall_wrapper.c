#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_windowsfirewall_wrapper.h"
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

void windowssys_windows_win32_networkmanagement_windowsfirewall_ncFreeNetconProperties(void* pprops) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netshell.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NcFreeNetconProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pprops);
        return;
    }
    errno = ENOSYS;
#else
    (void)pprops;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_windowsfirewall_ncIsValidConnectionName(void* pszwname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netshell.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NcIsValidConnectionName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszwname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszwname;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationDiagnoseConnectFailureAndGetInfo(void* wszservername, void* netisoerror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationDiagnoseConnectFailureAndGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wszservername, netisoerror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)wszservername;
    (void)netisoerror;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumAppContainers(uint32_t flags, void* pdwnumpublicappcs, void* pppublicappcs) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationEnumAppContainers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, pdwnumpublicappcs, pppublicappcs);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)pdwnumpublicappcs;
    (void)pppublicappcs;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumerateAppContainerRules(void* newenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("firewallapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationEnumerateAppContainerRules");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(newenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)newenum;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationFreeAppContainers(void* ppublicappcs) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationFreeAppContainers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppublicappcs);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppublicappcs;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetAppContainerConfig(void* pdwnumpublicappcs, void* appcontainersids) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationGetAppContainerConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdwnumpublicappcs, appcontainersids);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdwnumpublicappcs;
    (void)appcontainersids;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdAsync(void* wszservername, uint32_t dwflags, void* context, void* callback, void* hoperation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("firewallapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationGetEnterpriseIdAsync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wszservername, dwflags, context, callback, hoperation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)wszservername;
    (void)dwflags;
    (void)context;
    (void)callback;
    (void)hoperation;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdClose(void* hoperation, int32_t bwaitforoperation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("firewallapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationGetEnterpriseIdClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hoperation, bwaitforoperation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hoperation;
    (void)bwaitforoperation;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationRegisterForAppContainerChanges(uint32_t flags, void* callback, void* context, void* registrationobject) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationRegisterForAppContainerChanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, callback, context, registrationobject);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)callback;
    (void)context;
    (void)registrationobject;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetAppContainerConfig(uint32_t dwnumpublicappcs, void* appcontainersids) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationSetAppContainerConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwnumpublicappcs, appcontainersids);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwnumpublicappcs;
    (void)appcontainersids;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetupAppContainerBinaries(void* applicationcontainersid, void* packagefullname, void* packagefolder, void* displayname, int32_t bbinariesfullycomputed, void* binaries, uint32_t binariescount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationSetupAppContainerBinaries");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(applicationcontainersid, packagefullname, packagefolder, displayname, bbinariesfullycomputed, binaries, binariescount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)applicationcontainersid;
    (void)packagefullname;
    (void)packagefolder;
    (void)displayname;
    (void)bbinariesfullycomputed;
    (void)binaries;
    (void)binariescount;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationUnregisterForAppContainerChanges(void* registrationobject) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationUnregisterForAppContainerChanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(registrationobject);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)registrationobject;
    errno = ENOSYS;
    return 0;
#endif
}

