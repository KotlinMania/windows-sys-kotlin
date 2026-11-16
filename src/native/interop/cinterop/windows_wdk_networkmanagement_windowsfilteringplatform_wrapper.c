#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_wdk_networkmanagement_windowsfilteringplatform_wrapper.h"
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

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateGet0(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpkclnt.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmBfeStateGet0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateSubscribeChanges0(void* deviceobject, void* callback, void* context, void* changehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpkclnt.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmBfeStateSubscribeChanges0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceobject, callback, context, changehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceobject;
    (void)callback;
    (void)context;
    (void)changehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateUnsubscribeChanges0(void* changehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpkclnt.sys");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmBfeStateUnsubscribeChanges0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(changehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)changehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(void* enginehandle, void* callout, void* sd, void* id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutAdd0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, callout, sd, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)callout;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutCreateEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(void* enginehandle, uint32_t id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutDeleteById0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(void* enginehandle, void* key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutDeleteByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutDestroyEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutEnum0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(void* enginehandle, uint32_t id, void* callout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutGetById0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, callout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)callout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(void* enginehandle, void* key, void* callout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutGetByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, callout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)callout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutGetSecurityInfoByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutSetSecurityInfoByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionCreateEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionDestroyEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionEnum0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(void* enginehandle, uint64_t id, void* connection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionGetById0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, connection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)connection;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionGetSecurityInfo0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionSetSecurityInfo0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineClose0(void* enginehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineClose0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(void* enginehandle, int32_t option, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineGetOption0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, option, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)option;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineGetSecurityInfo0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(void* servername, uint32_t authnservice, void* authidentity, void* session, void* enginehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineOpen0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, authnservice, authidentity, session, enginehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)servername;
    (void)authnservice;
    (void)authidentity;
    (void)session;
    (void)enginehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(void* enginehandle, int32_t option, void* newvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineSetOption0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, option, newvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)option;
    (void)newvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmEngineSetSecurityInfo0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(void* enginehandle, void* filter, void* sd, void* id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterAdd0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, filter, sd, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)filter;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterCreateEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(void* enginehandle, uint64_t id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterDeleteById0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(void* enginehandle, void* key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterDeleteByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterDestroyEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterEnum0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(void* enginehandle, uint64_t id, void* filter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterGetById0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, filter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)filter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(void* enginehandle, void* key, void* filter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterGetByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, filter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)filter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterGetSecurityInfoByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterSetSecurityInfoByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(void* p) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFreeMemory0");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(p);
        return;
    }
    errno = ENOSYS;
#else
    (void)p;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* sd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, sd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)sd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* keymodkey, void* sd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, keymodkey, sd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* keymodkey, void* sd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, keymodkey, sd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* keymodkey, void* sd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, keymodkey, sd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(void* enginehandle, void* key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmIPsecTunnelDeleteByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerCreateEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerDestroyEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerEnum0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(void* enginehandle, uint16_t id, void* layer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerGetById0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, layer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)layer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(void* enginehandle, void* key, void* layer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerGetByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, layer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)layer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerGetSecurityInfoByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmLayerSetSecurityInfoByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventCreateEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventDestroyEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventEnum5");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventsGetSecurityInfo0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventsSetSecurityInfo0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(void* enginehandle, void* provider, void* sd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderAdd0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, provider, sd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)provider;
    (void)sd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(void* enginehandle, void* providercontext, void* sd, void* id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, providercontext, sd, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(void* enginehandle, void* providercontext, void* sd, void* id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, providercontext, sd, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(void* enginehandle, void* providercontext, void* sd, void* id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, providercontext, sd, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(void* enginehandle, void* providercontext, void* sd, void* id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextAdd3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, providercontext, sd, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextCreateEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(void* enginehandle, uint64_t id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextDeleteById0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(void* enginehandle, void* key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextDeleteByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextDestroyEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextEnum3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(void* enginehandle, uint64_t id, void* providercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, providercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(void* enginehandle, uint64_t id, void* providercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, providercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(void* enginehandle, uint64_t id, void* providercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, providercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(void* enginehandle, uint64_t id, void* providercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetById3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, providercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(void* enginehandle, void* key, void* providercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, providercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(void* enginehandle, void* key, void* providercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, providercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(void* enginehandle, void* key, void* providercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, providercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(void* enginehandle, void* key, void* providercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, providercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextGetSecurityInfoByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextSetSecurityInfoByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderCreateEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(void* enginehandle, void* key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderDeleteByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderDestroyEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderEnum0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(void* enginehandle, void* key, void* provider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderGetByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, provider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)provider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderGetSecurityInfoByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderSetSecurityInfoByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSessionCreateEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSessionDestroyEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSessionEnum0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(void* enginehandle, void* sublayer, void* sd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerAdd0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, sublayer, sd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)sublayer;
    (void)sd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerCreateEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(void* enginehandle, void* key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerDeleteByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerDestroyEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerEnum0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(void* enginehandle, void* key, void* sublayer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerGetByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, sublayer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)sublayer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerGetSecurityInfoByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerSetSecurityInfoByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(void* enginehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmTransactionAbort0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(void* enginehandle, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmTransactionBegin0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(void* enginehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmTransactionCommit0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventsGetSecurityInfo0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventsSetSecurityInfo0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospGetSecurityInfo0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(void* enginehandle, void* idpstatistics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospGetStatistics0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, idpstatistics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)idpstatistics;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospSetSecurityInfo0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospStateCreateEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospStateDestroyEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentries) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecDospStateEnum0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentries);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(void* enginehandle, void* ipsecstatistics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecGetStatistics0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, ipsecstatistics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(void* enginehandle, void* ipsecstatistics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecGetStatistics1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, ipsecstatistics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(void* enginehandle, uint64_t id, void* inboundbundle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddInbound0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, inboundbundle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(void* enginehandle, uint64_t id, void* inboundbundle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddInbound1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, inboundbundle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(void* enginehandle, uint64_t id, void* outboundbundle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddOutbound0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, outboundbundle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(void* enginehandle, uint64_t id, void* outboundbundle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextAddOutbound1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, outboundbundle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(void* enginehandle, void* outboundtraffic, void* inboundfilterid, void* id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextCreate0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, outboundtraffic, inboundfilterid, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)inboundfilterid;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(void* enginehandle, void* outboundtraffic, void* virtualiftunnelinfo, void* inboundfilterid, void* id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextCreate1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, outboundtraffic, virtualiftunnelinfo, inboundfilterid, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)virtualiftunnelinfo;
    (void)inboundfilterid;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextCreateEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(void* enginehandle, uint64_t id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextDeleteById0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextDestroyEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextEnum0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextEnum1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(void* enginehandle, uint64_t id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextExpire0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(void* enginehandle, uint64_t id, void* sacontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetById0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, sacontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(void* enginehandle, uint64_t id, void* sacontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetById1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, sacontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(void* enginehandle, uint64_t id, void* getspi, void* inboundspi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetSpi0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, getspi, inboundspi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(void* enginehandle, uint64_t id, void* getspi, void* inboundspi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextGetSpi1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, getspi, inboundspi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(void* enginehandle, uint64_t id, void* getspi, uint32_t inboundspi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextSetSpi0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, getspi, inboundspi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(void* enginehandle, uint64_t flags, void* newvalues) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextUpdate0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, flags, newvalues);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)flags;
    (void)newvalues;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaCreateEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaDbGetSecurityInfo0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaDbSetSecurityInfo0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaDestroyEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaEnum0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaEnum1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(void* enginehandle, void* ikeextstatistics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextGetStatistics0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, ikeextstatistics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(void* enginehandle, void* ikeextstatistics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextGetStatistics1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, ikeextstatistics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaCreateEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDbGetSecurityInfo0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDbSetSecurityInfo0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(void* enginehandle, uint64_t id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDeleteById0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaDestroyEnumHandle0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaEnum0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaEnum1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum2(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaEnum2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById0(void* enginehandle, uint64_t id, void* sa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaGetById0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, sa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)sa;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById1(void* enginehandle, uint64_t id, void* salookupcontext, void* sa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaGetById1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, salookupcontext, sa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById2(void* enginehandle, uint64_t id, void* salookupcontext, void* sa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IkeextSaGetById2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, id, salookupcontext, sa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    errno = ENOSYS;
    return -1;
#endif
}

