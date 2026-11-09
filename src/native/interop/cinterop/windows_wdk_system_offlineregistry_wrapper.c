#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_wdk_system_offlineregistry_wrapper.h"
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

uint32_t windowssys_windows_wdk_system_offlineregistry_ORCloseHive(void* handle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORCloseHive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORCloseKey(void* keyhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORCloseKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)keyhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORCreateHive(void* horkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORCreateHive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(horkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)horkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORCreateKey(void* keyhandle, void* lpsubkey, void* lpclass, uint32_t dwoptions, void* psecuritydescriptor, void* phkresult, void* pdwdisposition) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORCreateKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, lpsubkey, lpclass, dwoptions, psecuritydescriptor, phkresult, pdwdisposition);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)keyhandle;
    (void)lpsubkey;
    (void)lpclass;
    (void)dwoptions;
    (void)psecuritydescriptor;
    (void)phkresult;
    (void)pdwdisposition;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORDeleteKey(void* handle, void* lpsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORDeleteKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, lpsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)lpsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORDeleteValue(void* handle, void* lpvaluename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORDeleteValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, lpvaluename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)lpvaluename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_OREnumKey(void* handle, uint32_t dwindex, void* lpname, void* lpcname, void* lpclass, void* lpcclass, void* lpftlastwritetime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OREnumKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, dwindex, lpname, lpcname, lpclass, lpcclass, lpftlastwritetime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)dwindex;
    (void)lpname;
    (void)lpcname;
    (void)lpclass;
    (void)lpcclass;
    (void)lpftlastwritetime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_OREnumValue(void* handle, uint32_t dwindex, void* lpvaluename, void* lpcvaluename, void* lptype, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OREnumValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, dwindex, lpvaluename, lpcvaluename, lptype, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)dwindex;
    (void)lpvaluename;
    (void)lpcvaluename;
    (void)lptype;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORGetKeySecurity(void* handle, uint32_t securityinformation, void* psecuritydescriptor, void* lpcbsecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORGetKeySecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, securityinformation, psecuritydescriptor, lpcbsecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)securityinformation;
    (void)psecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORGetValue(void* handle, void* lpsubkey, void* lpvalue, void* pdwtype, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORGetValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, lpsubkey, lpvalue, pdwtype, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)lpsubkey;
    (void)lpvalue;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORGetVersion(void* pdwmajorversion, void* pdwminorversion) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORGetVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdwmajorversion, pdwminorversion);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdwmajorversion;
    (void)pdwminorversion;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORGetVirtualFlags(void* handle, void* pdwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORGetVirtualFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, pdwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)pdwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORMergeHives(void* hivehandles, uint32_t hivecount, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORMergeHives");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hivehandles, hivecount, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hivehandles;
    (void)hivecount;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_OROpenHive(void* filepath, void* horkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OROpenHive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filepath, horkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)filepath;
    (void)horkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_OROpenHiveByHandle(void* filehandle, void* horkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OROpenHiveByHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, horkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)filehandle;
    (void)horkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_OROpenKey(void* handle, void* lpsubkey, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OROpenKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, lpsubkey, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)lpsubkey;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORQueryInfoKey(void* handle, void* lpclass, void* lpcclass, void* lpcsubkeys, void* lpcmaxsubkeylen, void* lpcmaxclasslen, void* lpcvalues, void* lpcmaxvaluenamelen, void* lpcmaxvaluelen, void* lpcbsecuritydescriptor, void* lpftlastwritetime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORQueryInfoKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, lpclass, lpcclass, lpcsubkeys, lpcmaxsubkeylen, lpcmaxclasslen, lpcvalues, lpcmaxvaluenamelen, lpcmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)lpclass;
    (void)lpcclass;
    (void)lpcsubkeys;
    (void)lpcmaxsubkeylen;
    (void)lpcmaxclasslen;
    (void)lpcvalues;
    (void)lpcmaxvaluenamelen;
    (void)lpcmaxvaluelen;
    (void)lpcbsecuritydescriptor;
    (void)lpftlastwritetime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORRenameKey(void* handle, void* lpnewname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORRenameKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, lpnewname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)lpnewname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORSaveHive(void* horkey, void* hivepath, uint32_t osmajorversion, uint32_t osminorversion) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORSaveHive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(horkey, hivepath, osmajorversion, osminorversion);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)horkey;
    (void)hivepath;
    (void)osmajorversion;
    (void)osminorversion;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORSetKeySecurity(void* handle, uint32_t securityinformation, void* psecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORSetKeySecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, securityinformation, psecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORSetValue(void* handle, void* lpvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORSetValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, lpvaluename, dwtype, lpdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)lpvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORSetVirtualFlags(void* handle, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORSetVirtualFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORShutdown(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORShutdown");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_wdk_system_offlineregistry_ORStart(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("offreg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ORStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

