#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_iscsidisc_wrapper.h"
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

uint32_t windowssysWindowsWin32StorageIscsidiscAddISNSServerA(void* address) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddISNSServerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)address;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscAddISNSServerW(void* address) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddISNSServerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)address;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionA(void* uniquesessionid, void* reserved, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* loginoptions, uint32_t keysize, void* key, void* connectionid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIScsiConnectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uniquesessionid, reserved, initiatorportnumber, targetportal, securityflags, loginoptions, keysize, key, connectionid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uniquesessionid;
    (void)reserved;
    (void)initiatorportnumber;
    (void)targetportal;
    (void)securityflags;
    (void)loginoptions;
    (void)keysize;
    (void)key;
    (void)connectionid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionW(void* uniquesessionid, void* reserved, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* loginoptions, uint32_t keysize, void* key, void* connectionid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIScsiConnectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uniquesessionid, reserved, initiatorportnumber, targetportal, securityflags, loginoptions, keysize, key, connectionid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uniquesessionid;
    (void)reserved;
    (void)initiatorportnumber;
    (void)targetportal;
    (void)securityflags;
    (void)loginoptions;
    (void)keysize;
    (void)key;
    (void)connectionid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalA(void* initiatorinstance, uint32_t initiatorportnumber, void* loginoptions, uint64_t securityflags, void* portal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIScsiSendTargetPortalA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorinstance, initiatorportnumber, loginoptions, securityflags, portal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)loginoptions;
    (void)securityflags;
    (void)portal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalW(void* initiatorinstance, uint32_t initiatorportnumber, void* loginoptions, uint64_t securityflags, void* portal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIScsiSendTargetPortalW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorinstance, initiatorportnumber, loginoptions, securityflags, portal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)loginoptions;
    (void)securityflags;
    (void)portal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetA(void* targetname, void* targetalias, uint32_t targetflags, bool persist, void* mappings, void* loginoptions, void* portalgroup) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIScsiStaticTargetA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname, targetalias, targetflags, persist, mappings, loginoptions, portalgroup);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)targetname;
    (void)targetalias;
    (void)targetflags;
    (void)persist;
    (void)mappings;
    (void)loginoptions;
    (void)portalgroup;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetW(void* targetname, void* targetalias, uint32_t targetflags, bool persist, void* mappings, void* loginoptions, void* portalgroup) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIScsiStaticTargetW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname, targetalias, targetflags, persist, mappings, loginoptions, portalgroup);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)targetname;
    (void)targetalias;
    (void)targetflags;
    (void)persist;
    (void)mappings;
    (void)loginoptions;
    (void)portalgroup;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceA(void* devicepath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPersistentIScsiDeviceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicepath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)devicepath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceW(void* devicepath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPersistentIScsiDeviceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicepath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)devicepath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscAddRadiusServerA(void* address) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddRadiusServerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)address;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscAddRadiusServerW(void* address) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddRadiusServerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)address;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscClearPersistentIScsiDevices(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearPersistentIScsiDevices");
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

uint32_t windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionA(void* uniquesessionid, void* devicecount, void* devices) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDevicesForIScsiSessionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uniquesessionid, devicecount, devices);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uniquesessionid;
    (void)devicecount;
    (void)devices;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionW(void* uniquesessionid, void* devicecount, void* devices) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDevicesForIScsiSessionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uniquesessionid, devicecount, devices);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uniquesessionid;
    (void)devicecount;
    (void)devices;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoA(void* initiatorname, uint32_t initiatorportnumber, void* reserved, void* authinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiIKEInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorname, initiatorportnumber, reserved, authinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)reserved;
    (void)authinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoW(void* initiatorname, uint32_t initiatorportnumber, void* reserved, void* authinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiIKEInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorname, initiatorportnumber, reserved, authinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)reserved;
    (void)authinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameA(void* initiatornodename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiInitiatorNodeNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatornodename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatornodename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameW(void* initiatornodename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiInitiatorNodeNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatornodename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatornodename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListA(void* buffersize, void* sessioncount, void* sessioninfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiSessionListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersize, sessioncount, sessioninfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersize;
    (void)sessioncount;
    (void)sessioninfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListEx(void* buffersize, void* sessioncountptr, void* sessioninfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiSessionListEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersize, sessioncountptr, sessioninfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersize;
    (void)sessioncountptr;
    (void)sessioninfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListW(void* buffersize, void* sessioncount, void* sessioninfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiSessionListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersize, sessioncount, sessioninfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersize;
    (void)sessioncount;
    (void)sessioninfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationA(void* targetname, void* discoverymechanism, int32_t infoclass, void* buffersize, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiTargetInformationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname, discoverymechanism, infoclass, buffersize, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)targetname;
    (void)discoverymechanism;
    (void)infoclass;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationW(void* targetname, void* discoverymechanism, int32_t infoclass, void* buffersize, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiTargetInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname, discoverymechanism, infoclass, buffersize, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)targetname;
    (void)discoverymechanism;
    (void)infoclass;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscGetIScsiVersionInformation(void* versioninfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIScsiVersionInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(versioninfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)versioninfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetA(void* targetname, bool isinformationalsession, void* initiatorinstance, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* mappings, void* loginoptions, uint32_t keysize, void* key, bool ispersistent, void* uniquesessionid, void* uniqueconnectionid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, uint64_t, void*, void*, uint32_t, void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoginIScsiTargetA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname, isinformationalsession, initiatorinstance, initiatorportnumber, targetportal, securityflags, mappings, loginoptions, keysize, key, ispersistent, uniquesessionid, uniqueconnectionid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)targetname;
    (void)isinformationalsession;
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)targetportal;
    (void)securityflags;
    (void)mappings;
    (void)loginoptions;
    (void)keysize;
    (void)key;
    (void)ispersistent;
    (void)uniquesessionid;
    (void)uniqueconnectionid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetW(void* targetname, bool isinformationalsession, void* initiatorinstance, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* mappings, void* loginoptions, uint32_t keysize, void* key, bool ispersistent, void* uniquesessionid, void* uniqueconnectionid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, uint64_t, void*, void*, uint32_t, void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoginIScsiTargetW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname, isinformationalsession, initiatorinstance, initiatorportnumber, targetportal, securityflags, mappings, loginoptions, keysize, key, ispersistent, uniquesessionid, uniqueconnectionid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)targetname;
    (void)isinformationalsession;
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)targetportal;
    (void)securityflags;
    (void)mappings;
    (void)loginoptions;
    (void)keysize;
    (void)key;
    (void)ispersistent;
    (void)uniquesessionid;
    (void)uniqueconnectionid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscLogoutIScsiTarget(void* uniquesessionid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogoutIScsiTarget");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uniquesessionid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uniquesessionid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRefreshISNSServerA(void* address) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RefreshISNSServerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)address;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRefreshISNSServerW(void* address) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RefreshISNSServerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)address;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalA(void* initiatorinstance, uint32_t initiatorportnumber, void* portal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RefreshIScsiSendTargetPortalA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorinstance, initiatorportnumber, portal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)portal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalW(void* initiatorinstance, uint32_t initiatorportnumber, void* portal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RefreshIScsiSendTargetPortalW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorinstance, initiatorportnumber, portal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)portal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRemoveISNSServerA(void* address) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveISNSServerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)address;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRemoveISNSServerW(void* address) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveISNSServerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)address;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRemoveIScsiConnection(void* uniquesessionid, void* connectionid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveIScsiConnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uniquesessionid, connectionid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uniquesessionid;
    (void)connectionid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetA(void* initiatorinstance, uint32_t initiatorportnumber, void* targetname, void* portal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveIScsiPersistentTargetA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorinstance, initiatorportnumber, targetname, portal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)targetname;
    (void)portal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetW(void* initiatorinstance, uint32_t initiatorportnumber, void* targetname, void* portal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveIScsiPersistentTargetW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorinstance, initiatorportnumber, targetname, portal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)targetname;
    (void)portal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalA(void* initiatorinstance, uint32_t initiatorportnumber, void* portal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveIScsiSendTargetPortalA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorinstance, initiatorportnumber, portal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)portal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalW(void* initiatorinstance, uint32_t initiatorportnumber, void* portal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveIScsiSendTargetPortalW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorinstance, initiatorportnumber, portal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorinstance;
    (void)initiatorportnumber;
    (void)portal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetA(void* targetname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveIScsiStaticTargetA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)targetname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetW(void* targetname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveIScsiStaticTargetW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)targetname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceA(void* devicepath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePersistentIScsiDeviceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicepath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)devicepath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceW(void* devicepath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePersistentIScsiDeviceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicepath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)devicepath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerA(void* address) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveRadiusServerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)address;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerW(void* address) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveRadiusServerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)address;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsA(void* buffersize, void* mappingcount, void* mappings) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportActiveIScsiTargetMappingsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersize, mappingcount, mappings);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersize;
    (void)mappingcount;
    (void)mappings;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsW(void* buffersize, void* mappingcount, void* mappings) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportActiveIScsiTargetMappingsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersize, mappingcount, mappings);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersize;
    (void)mappingcount;
    (void)mappings;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportISNSServerListA(void* buffersizeinchar, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportISNSServerListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersizeinchar, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersizeinchar;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportISNSServerListW(void* buffersizeinchar, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportISNSServerListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersizeinchar, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersizeinchar;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListA(void* buffersize, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiInitiatorListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersize, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListW(void* buffersize, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiInitiatorListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersize, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsA(void* count, void* persistentlogininfo, void* buffersizeinbytes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiPersistentLoginsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(count, persistentlogininfo, buffersizeinbytes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)count;
    (void)persistentlogininfo;
    (void)buffersizeinbytes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsW(void* count, void* persistentlogininfo, void* buffersizeinbytes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiPersistentLoginsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(count, persistentlogininfo, buffersizeinbytes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)count;
    (void)persistentlogininfo;
    (void)buffersizeinbytes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsA(void* portalcount, void* portalinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiSendTargetPortalsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(portalcount, portalinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)portalcount;
    (void)portalinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExA(void* portalcount, void* portalinfosize, void* portalinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiSendTargetPortalsExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(portalcount, portalinfosize, portalinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)portalcount;
    (void)portalinfosize;
    (void)portalinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExW(void* portalcount, void* portalinfosize, void* portalinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiSendTargetPortalsExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(portalcount, portalinfosize, portalinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)portalcount;
    (void)portalinfosize;
    (void)portalinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsW(void* portalcount, void* portalinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiSendTargetPortalsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(portalcount, portalinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)portalcount;
    (void)portalinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsA(void* initiatorname, void* targetname, void* targetportaltag, void* elementcount, void* portals) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiTargetPortalsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorname, targetname, targetportaltag, elementcount, portals);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorname;
    (void)targetname;
    (void)targetportaltag;
    (void)elementcount;
    (void)portals;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsW(void* initiatorname, void* targetname, void* targetportaltag, void* elementcount, void* portals) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiTargetPortalsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorname, targetname, targetportaltag, elementcount, portals);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorname;
    (void)targetname;
    (void)targetportaltag;
    (void)elementcount;
    (void)portals;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsA(bool forceupdate, void* buffersize, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiTargetsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(forceupdate, buffersize, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)forceupdate;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsW(bool forceupdate, void* buffersize, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportIScsiTargetsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(forceupdate, buffersize, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)forceupdate;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesA(void* buffersizeinchar, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportPersistentIScsiDevicesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersizeinchar, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersizeinchar;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesW(void* buffersizeinchar, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportPersistentIScsiDevicesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersizeinchar, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersizeinchar;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportRadiusServerListA(void* buffersizeinchar, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportRadiusServerListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersizeinchar, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersizeinchar;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscReportRadiusServerListW(void* buffersizeinchar, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportRadiusServerListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersizeinchar, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersizeinchar;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscSendScsiInquiry(void* uniquesessionid, uint64_t lun, uint8_t evpdcmddt, uint8_t pagecode, void* scsistatus, void* responsesize, void* responsebuffer, void* sensesize, void* sensebuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint8_t, uint8_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendScsiInquiry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uniquesessionid, lun, evpdcmddt, pagecode, scsistatus, responsesize, responsebuffer, sensesize, sensebuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uniquesessionid;
    (void)lun;
    (void)evpdcmddt;
    (void)pagecode;
    (void)scsistatus;
    (void)responsesize;
    (void)responsebuffer;
    (void)sensesize;
    (void)sensebuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscSendScsiReadCapacity(void* uniquesessionid, uint64_t lun, void* scsistatus, void* responsesize, void* responsebuffer, void* sensesize, void* sensebuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendScsiReadCapacity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uniquesessionid, lun, scsistatus, responsesize, responsebuffer, sensesize, sensebuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uniquesessionid;
    (void)lun;
    (void)scsistatus;
    (void)responsesize;
    (void)responsebuffer;
    (void)sensesize;
    (void)sensebuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscSendScsiReportLuns(void* uniquesessionid, void* scsistatus, void* responsesize, void* responsebuffer, void* sensesize, void* sensebuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendScsiReportLuns");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uniquesessionid, scsistatus, responsesize, responsebuffer, sensesize, sensebuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uniquesessionid;
    (void)scsistatus;
    (void)responsesize;
    (void)responsebuffer;
    (void)sensesize;
    (void)sensebuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiGroupPresharedKey(uint32_t keylength, void* key, bool persist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiGroupPresharedKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keylength, key, persist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)keylength;
    (void)key;
    (void)persist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoA(void* initiatorname, uint32_t initiatorportnumber, void* authinfo, bool persist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiIKEInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorname, initiatorportnumber, authinfo, persist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)authinfo;
    (void)persist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoW(void* initiatorname, uint32_t initiatorportnumber, void* authinfo, bool persist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiIKEInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorname, initiatorportnumber, authinfo, persist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)authinfo;
    (void)persist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorCHAPSharedSecret(uint32_t sharedsecretlength, void* sharedsecret) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiInitiatorCHAPSharedSecret");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sharedsecretlength, sharedsecret);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sharedsecretlength;
    (void)sharedsecret;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameA(void* initiatornodename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiInitiatorNodeNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatornodename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatornodename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameW(void* initiatornodename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiInitiatorNodeNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatornodename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatornodename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorRADIUSSharedSecret(uint32_t sharedsecretlength, void* sharedsecret) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiInitiatorRADIUSSharedSecret");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sharedsecretlength, sharedsecret);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sharedsecretlength;
    (void)sharedsecret;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressA(void* initiatorname, uint32_t initiatorportnumber, void* destinationaddress, void* outermodeaddress, bool persist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiTunnelModeOuterAddressA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorname, initiatorportnumber, destinationaddress, outermodeaddress, persist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)destinationaddress;
    (void)outermodeaddress;
    (void)persist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressW(void* initiatorname, uint32_t initiatorportnumber, void* destinationaddress, void* outermodeaddress, bool persist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIScsiTunnelModeOuterAddressW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initiatorname, initiatorportnumber, destinationaddress, outermodeaddress, persist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)initiatorname;
    (void)initiatorportnumber;
    (void)destinationaddress;
    (void)outermodeaddress;
    (void)persist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiDevices(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupPersistentIScsiDevices");
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

uint32_t windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiVolumes(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iscsidsc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupPersistentIScsiVolumes");
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

