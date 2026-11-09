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

uint32_t windowssys_windows_win32_storage_iscsidisc_AddISNSServerA(void* address) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_AddISNSServerW(void* address) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionA(void* uniquesessionid, void* reserved, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* loginoptions, uint32_t keysize, void* key, void* connectionid) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionW(void* uniquesessionid, void* reserved, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* loginoptions, uint32_t keysize, void* key, void* connectionid) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalA(void* initiatorinstance, uint32_t initiatorportnumber, void* loginoptions, uint64_t securityflags, void* portal) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalW(void* initiatorinstance, uint32_t initiatorportnumber, void* loginoptions, uint64_t securityflags, void* portal) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetA(void* targetname, void* targetalias, uint32_t targetflags, bool persist, void* mappings, void* loginoptions, void* portalgroup) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetW(void* targetname, void* targetalias, uint32_t targetflags, bool persist, void* mappings, void* loginoptions, void* portalgroup) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceA(void* devicepath) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceW(void* devicepath) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_AddRadiusServerA(void* address) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_AddRadiusServerW(void* address) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ClearPersistentIScsiDevices(void) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionA(void* uniquesessionid, void* devicecount, void* devices) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionW(void* uniquesessionid, void* devicecount, void* devices) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoA(void* initiatorname, uint32_t initiatorportnumber, void* reserved, void* authinfo) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoW(void* initiatorname, uint32_t initiatorportnumber, void* reserved, void* authinfo) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameA(void* initiatornodename) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameW(void* initiatornodename) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListA(void* buffersize, void* sessioncount, void* sessioninfo) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListEx(void* buffersize, void* sessioncountptr, void* sessioninfo) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListW(void* buffersize, void* sessioncount, void* sessioninfo) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationA(void* targetname, void* discoverymechanism, int32_t infoclass, void* buffersize, void* buffer) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationW(void* targetname, void* discoverymechanism, int32_t infoclass, void* buffersize, void* buffer) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_GetIScsiVersionInformation(void* versioninfo) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetA(void* targetname, bool isinformationalsession, void* initiatorinstance, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* mappings, void* loginoptions, uint32_t keysize, void* key, bool ispersistent, void* uniquesessionid, void* uniqueconnectionid) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetW(void* targetname, bool isinformationalsession, void* initiatorinstance, uint32_t initiatorportnumber, void* targetportal, uint64_t securityflags, void* mappings, void* loginoptions, uint32_t keysize, void* key, bool ispersistent, void* uniquesessionid, void* uniqueconnectionid) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_LogoutIScsiTarget(void* uniquesessionid) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerA(void* address) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerW(void* address) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalA(void* initiatorinstance, uint32_t initiatorportnumber, void* portal) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalW(void* initiatorinstance, uint32_t initiatorportnumber, void* portal) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerA(void* address) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerW(void* address) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveIScsiConnection(void* uniquesessionid, void* connectionid) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetA(void* initiatorinstance, uint32_t initiatorportnumber, void* targetname, void* portal) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetW(void* initiatorinstance, uint32_t initiatorportnumber, void* targetname, void* portal) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalA(void* initiatorinstance, uint32_t initiatorportnumber, void* portal) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalW(void* initiatorinstance, uint32_t initiatorportnumber, void* portal) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetA(void* targetname) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetW(void* targetname) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceA(void* devicepath) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceW(void* devicepath) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerA(void* address) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerW(void* address) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsA(void* buffersize, void* mappingcount, void* mappings) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsW(void* buffersize, void* mappingcount, void* mappings) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListA(void* buffersizeinchar, void* buffer) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListW(void* buffersizeinchar, void* buffer) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListA(void* buffersize, void* buffer) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListW(void* buffersize, void* buffer) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsA(void* count, void* persistentlogininfo, void* buffersizeinbytes) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsW(void* count, void* persistentlogininfo, void* buffersizeinbytes) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsA(void* portalcount, void* portalinfo) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExA(void* portalcount, void* portalinfosize, void* portalinfo) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExW(void* portalcount, void* portalinfosize, void* portalinfo) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsW(void* portalcount, void* portalinfo) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsA(void* initiatorname, void* targetname, void* targetportaltag, void* elementcount, void* portals) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsW(void* initiatorname, void* targetname, void* targetportaltag, void* elementcount, void* portals) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsA(bool forceupdate, void* buffersize, void* buffer) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsW(bool forceupdate, void* buffersize, void* buffer) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesA(void* buffersizeinchar, void* buffer) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesW(void* buffersizeinchar, void* buffer) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListA(void* buffersizeinchar, void* buffer) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListW(void* buffersizeinchar, void* buffer) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_SendScsiInquiry(void* uniquesessionid, uint64_t lun, uint8_t evpdcmddt, uint8_t pagecode, void* scsistatus, void* responsesize, void* responsebuffer, void* sensesize, void* sensebuffer) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_SendScsiReadCapacity(void* uniquesessionid, uint64_t lun, void* scsistatus, void* responsesize, void* responsebuffer, void* sensesize, void* sensebuffer) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_SendScsiReportLuns(void* uniquesessionid, void* scsistatus, void* responsesize, void* responsebuffer, void* sensesize, void* sensebuffer) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiGroupPresharedKey(uint32_t keylength, void* key, bool persist) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoA(void* initiatorname, uint32_t initiatorportnumber, void* authinfo, bool persist) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoW(void* initiatorname, uint32_t initiatorportnumber, void* authinfo, bool persist) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorCHAPSharedSecret(uint32_t sharedsecretlength, void* sharedsecret) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameA(void* initiatornodename) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameW(void* initiatornodename) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorRADIUSSharedSecret(uint32_t sharedsecretlength, void* sharedsecret) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressA(void* initiatorname, uint32_t initiatorportnumber, void* destinationaddress, void* outermodeaddress, bool persist) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressW(void* initiatorname, uint32_t initiatorportnumber, void* destinationaddress, void* outermodeaddress, bool persist) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiDevices(void) {
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

uint32_t windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiVolumes(void) {
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

