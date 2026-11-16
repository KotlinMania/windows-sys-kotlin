#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_windowsfilteringplatform_wrapper.h"
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

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(void* enginehandle, void* callout, void* sd, void* id) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)callout;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(void* enginehandle, uint32_t id) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(void* enginehandle, void* key) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(void* enginehandle, uint32_t id, void* callout) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)callout;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(void* enginehandle, void* key, void* callout) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    (void)callout;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
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
    return 0;
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
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscribeChanges0(void* enginehandle, void* subscription, void* callback, void* context, void* changehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutSubscribeChanges0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, subscription, callback, context, changehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscriptionsGet0(void* enginehandle, void* entries, void* numentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutSubscriptionsGet0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, entries, numentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutUnsubscribeChanges0(void* enginehandle, void* changehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmCalloutUnsubscribeChanges0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, changehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)changehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(void* enginehandle, uint64_t id, void* connection) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)connection;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSubscribe0(void* enginehandle, void* subscription, void* callback, void* context, void* eventshandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionSubscribe0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, subscription, callback, context, eventshandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionUnsubscribe0(void* enginehandle, void* eventshandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmConnectionUnsubscribe0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, eventshandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)eventshandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordSubscribe0(uint32_t flags, void* callback, void* context, void* subscriptionhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmDynamicKeywordSubscribe0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, callback, context, subscriptionhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)callback;
    (void)context;
    (void)subscriptionhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordUnsubscribe0(void* subscriptionhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmDynamicKeywordUnsubscribe0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subscriptionhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)subscriptionhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineClose0(void* enginehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
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
    return 0;
#else
    (void)enginehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(void* enginehandle, int32_t option, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)option;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(void* servername, uint32_t authnservice, void* authidentity, void* session, void* enginehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
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
    return 0;
#else
    (void)servername;
    (void)authnservice;
    (void)authidentity;
    (void)session;
    (void)enginehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(void* enginehandle, int32_t option, void* newvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)option;
    (void)newvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(void* enginehandle, void* filter, void* sd, void* id) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)filter;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(void* enginehandle, uint64_t id) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(void* enginehandle, void* key) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(void* enginehandle, uint64_t id, void* filter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)filter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(void* enginehandle, void* key, void* filter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    (void)filter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
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
    return 0;
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
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscribeChanges0(void* enginehandle, void* subscription, void* callback, void* context, void* changehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterSubscribeChanges0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, subscription, callback, context, changehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscriptionsGet0(void* enginehandle, void* entries, void* numentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterSubscriptionsGet0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, entries, numentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterUnsubscribeChanges0(void* enginehandle, void* changehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmFilterUnsubscribeChanges0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, changehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)changehandle;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(void* p) {
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

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmGetAppIdFromFileName0(void* filename, void* appid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmGetAppIdFromFileName0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, appid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)filename;
    (void)appid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* sd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)sd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* keymodkey, void* sd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
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
    return 0;
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
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* keymodkey, void* sd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
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
    return 0;
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
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(void* enginehandle, uint32_t flags, void* mainmodepolicy, void* tunnelpolicy, uint32_t numfilterconditions, void* filterconditions, void* keymodkey, void* sd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
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
    return 0;
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
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(void* enginehandle, void* key) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(void* enginehandle, uint16_t id, void* layer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)layer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(void* enginehandle, void* key, void* layer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    (void)layer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
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
    return 0;
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
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe0(void* enginehandle, void* subscription, void* callback, void* context, void* eventshandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscribe0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, subscription, callback, context, eventshandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe1(void* enginehandle, void* subscription, void* callback, void* context, void* eventshandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscribe1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, subscription, callback, context, eventshandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe2(void* enginehandle, void* subscription, void* callback, void* context, void* eventshandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscribe2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, subscription, callback, context, eventshandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe3(void* enginehandle, void* subscription, void* callback, void* context, void* eventshandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscribe3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, subscription, callback, context, eventshandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe4(void* enginehandle, void* subscription, void* callback, void* context, void* eventshandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscribe4");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, subscription, callback, context, eventshandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscriptionsGet0(void* enginehandle, void* entries, void* numentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventSubscriptionsGet0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, entries, numentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventUnsubscribe0(void* enginehandle, void* eventshandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmNetEventUnsubscribe0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, eventshandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)eventshandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(void* enginehandle, void* provider, void* sd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)provider;
    (void)sd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(void* enginehandle, void* providercontext, void* sd, void* id) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(void* enginehandle, void* providercontext, void* sd, void* id) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(void* enginehandle, void* providercontext, void* sd, void* id) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(void* enginehandle, void* providercontext, void* sd, void* id) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(void* enginehandle, uint64_t id) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(void* enginehandle, void* key) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(void* enginehandle, uint64_t id, void* providercontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(void* enginehandle, uint64_t id, void* providercontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(void* enginehandle, uint64_t id, void* providercontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(void* enginehandle, uint64_t id, void* providercontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(void* enginehandle, void* key, void* providercontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(void* enginehandle, void* key, void* providercontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(void* enginehandle, void* key, void* providercontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(void* enginehandle, void* key, void* providercontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
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
    return 0;
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
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscribeChanges0(void* enginehandle, void* subscription, void* callback, void* context, void* changehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextSubscribeChanges0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, subscription, callback, context, changehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscriptionsGet0(void* enginehandle, void* entries, void* numentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextSubscriptionsGet0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, entries, numentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextUnsubscribeChanges0(void* enginehandle, void* changehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderContextUnsubscribeChanges0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, changehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)changehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(void* enginehandle, void* key) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(void* enginehandle, void* key, void* provider) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    (void)provider;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
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
    return 0;
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
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscribeChanges0(void* enginehandle, void* subscription, void* callback, void* context, void* changehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderSubscribeChanges0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, subscription, callback, context, changehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscriptionsGet0(void* enginehandle, void* entries, void* numentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderSubscriptionsGet0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, entries, numentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderUnsubscribeChanges0(void* enginehandle, void* changehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmProviderUnsubscribeChanges0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, changehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)changehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(void* enginehandle, void* sublayer, void* sd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)sublayer;
    (void)sd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(void* enginehandle, void* key) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(void* enginehandle, void* key, void* sublayer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    (void)sublayer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
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
    return 0;
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
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(void* enginehandle, void* key, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscribeChanges0(void* enginehandle, void* subscription, void* callback, void* context, void* changehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerSubscribeChanges0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, subscription, callback, context, changehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscriptionsGet0(void* enginehandle, void* entries, void* numentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerSubscriptionsGet0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, entries, numentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerUnsubscribeChanges0(void* enginehandle, void* changehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSubLayerUnsubscribeChanges0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, changehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)changehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsGet0(void* enginehandle, void* sysports) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSystemPortsGet0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, sysports);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)sysports;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsSubscribe0(void* enginehandle, void* reserved, void* callback, void* context, void* sysportshandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSystemPortsSubscribe0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, reserved, callback, context, sysportshandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)reserved;
    (void)callback;
    (void)context;
    (void)sysportshandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsUnsubscribe0(void* enginehandle, void* sysportshandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmSystemPortsUnsubscribe0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, sysportshandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)sysportshandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(void* enginehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
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
    return 0;
#else
    (void)enginehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(void* enginehandle, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
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
    return 0;
#else
    (void)enginehandle;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(void* enginehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
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
    return 0;
#else
    (void)enginehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventSubscribe0(void* enginehandle, void* subscription, void* callback, void* context, void* subscriptionhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventSubscribe0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, subscription, callback, context, subscriptionhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)subscriptionhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventUnsubscribe0(void* enginehandle, void* subscriptionhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FwpmvSwitchEventUnsubscribe0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, subscriptionhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)subscriptionhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(void* enginehandle, void* idpstatistics) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)idpstatistics;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(void* enginehandle, void* ipsecstatistics) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(void* enginehandle, void* ipsecstatistics) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerAddAndRegister0(void* enginehandle, void* keymanager, void* keymanagercallbacks, void* keymgmthandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecKeyManagerAddAndRegister0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, keymanager, keymanagercallbacks, keymgmthandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)keymanager;
    (void)keymanagercallbacks;
    (void)keymgmthandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerGetSecurityInfoByKey0(void* enginehandle, void* reserved, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecKeyManagerGetSecurityInfoByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, reserved, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)reserved;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerSetSecurityInfoByKey0(void* enginehandle, void* reserved, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecKeyManagerSetSecurityInfoByKey0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, reserved, securityinfo, sidowner, sidgroup, dacl, sacl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)reserved;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerUnregisterAndDelete0(void* enginehandle, void* keymgmthandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecKeyManagerUnregisterAndDelete0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, keymgmthandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)keymgmthandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagersGet0(void* enginehandle, void* entries, void* numentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecKeyManagersGet0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, entries, numentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(void* enginehandle, uint64_t id, void* inboundbundle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(void* enginehandle, uint64_t id, void* inboundbundle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(void* enginehandle, uint64_t id, void* outboundbundle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(void* enginehandle, uint64_t id, void* outboundbundle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(void* enginehandle, void* outboundtraffic, void* inboundfilterid, void* id) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)inboundfilterid;
    (void)id;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(void* enginehandle, void* outboundtraffic, void* virtualiftunnelinfo, void* inboundfilterid, void* id) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)virtualiftunnelinfo;
    (void)inboundfilterid;
    (void)id;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(void* enginehandle, uint64_t id) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(void* enginehandle, uint64_t id) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(void* enginehandle, uint64_t id, void* sacontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(void* enginehandle, uint64_t id, void* sacontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(void* enginehandle, uint64_t id, void* getspi, void* inboundspi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(void* enginehandle, uint64_t id, void* getspi, void* inboundspi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(void* enginehandle, uint64_t id, void* getspi, uint32_t inboundspi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscribe0(void* enginehandle, void* subscription, void* callback, void* context, void* eventshandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextSubscribe0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, subscription, callback, context, eventshandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscriptionsGet0(void* enginehandle, void* entries, void* numentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextSubscriptionsGet0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, entries, numentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUnsubscribe0(void* enginehandle, void* eventshandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IPsecSaContextUnsubscribe0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enginehandle, eventshandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)enginehandle;
    (void)eventshandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(void* enginehandle, uint64_t flags, void* newvalues) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)flags;
    (void)newvalues;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(void* enginehandle, void* ikeextstatistics) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(void* enginehandle, void* ikeextstatistics) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(void* enginehandle, void* enumtemplate, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl, void* securitydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(void* enginehandle, uint32_t securityinfo, void* sidowner, void* sidgroup, void* dacl, void* sacl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(void* enginehandle, uint64_t id) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(void* enginehandle, void* enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum0(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum1(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum2(void* enginehandle, void* enumhandle, uint32_t numentriesrequested, void* entries, void* numentriesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById0(void* enginehandle, uint64_t id, void* sa) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)sa;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById1(void* enginehandle, uint64_t id, void* salookupcontext, void* sa) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById2(void* enginehandle, uint64_t id, void* salookupcontext, void* sa) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
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
    return 0;
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    errno = ENOSYS;
    return 0;
#endif
}

