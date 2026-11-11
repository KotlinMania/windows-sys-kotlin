#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_power_wrapper.h"
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

int32_t windowssys_windows_win32_system_power_callNtPowerInformation(int32_t informationlevel, void* inputbuffer, uint32_t inputbufferlength, void* outputbuffer, uint32_t outputbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallNtPowerInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(informationlevel, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)informationlevel;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_win32_system_power_canUserWritePwrScheme(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CanUserWritePwrScheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_deletePwrScheme(uint32_t uiid) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePwrScheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiid);
    }
    errno = ENOSYS;
    return false;
#else
    (void)uiid;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_devicePowerClose(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevicePowerClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_devicePowerEnumDevices(uint32_t queryindex, uint32_t queryinterpretationflags, uint32_t queryflags, void* preturnbuffer, void* pbuffersize) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevicePowerEnumDevices");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queryindex, queryinterpretationflags, queryflags, preturnbuffer, pbuffersize);
    }
    errno = ENOSYS;
    return false;
#else
    (void)queryindex;
    (void)queryinterpretationflags;
    (void)queryflags;
    (void)preturnbuffer;
    (void)pbuffersize;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_devicePowerOpen(uint32_t debugmask) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevicePowerOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(debugmask);
    }
    errno = ENOSYS;
    return false;
#else
    (void)debugmask;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssys_windows_win32_system_power_devicePowerSetDeviceState(void* devicedescription, uint32_t setflags, void* setdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevicePowerSetDeviceState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicedescription, setflags, setdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)devicedescription;
    (void)setflags;
    (void)setdata;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssys_windows_win32_system_power_enumPwrSchemes(void* lpfn, int64_t lparam) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPwrSchemes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfn, lparam);
    }
    errno = ENOSYS;
    return false;
#else
    (void)lpfn;
    (void)lparam;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_getActivePwrScheme(void* puiid) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetActivePwrScheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puiid);
    }
    errno = ENOSYS;
    return false;
#else
    (void)puiid;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_getCurrentPowerPolicies(void* pglobalpowerpolicy, void* ppowerpolicy) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPowerPolicies");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pglobalpowerpolicy, ppowerpolicy);
    }
    errno = ENOSYS;
    return false;
#else
    (void)pglobalpowerpolicy;
    (void)ppowerpolicy;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_system_power_getDevicePowerState(void* hdevice, void* pfon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDevicePowerState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, pfon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdevice;
    (void)pfon;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_win32_system_power_getPwrCapabilities(void* lpspc) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPwrCapabilities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpspc);
    }
    errno = ENOSYS;
    return false;
#else
    (void)lpspc;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_getPwrDiskSpindownRange(void* puimax, void* puimin) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPwrDiskSpindownRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puimax, puimin);
    }
    errno = ENOSYS;
    return false;
#else
    (void)puimax;
    (void)puimin;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_system_power_getSystemPowerStatus(void* lpsystempowerstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemPowerStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystempowerstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystempowerstatus;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_win32_system_power_isAdminOverrideActive(void* papp) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsAdminOverrideActive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(papp);
    }
    errno = ENOSYS;
    return false;
#else
    (void)papp;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_isPwrHibernateAllowed(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsPwrHibernateAllowed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_isPwrShutdownAllowed(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsPwrShutdownAllowed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_isPwrSuspendAllowed(void) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsPwrSuspendAllowed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return false;
#else
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_system_power_isSystemResumeAutomatic(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsSystemResumeAutomatic");
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

uint32_t windowssys_windows_win32_system_power_powerCanRestoreIndividualDefaultPowerScheme(void* schemeguid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerCanRestoreIndividualDefaultPowerScheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(schemeguid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)schemeguid;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_power_powerClearRequest(void* powerrequest, int32_t requesttype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerClearRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(powerrequest, requesttype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)powerrequest;
    (void)requesttype;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerCreatePossibleSetting(void* rootsystempowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerCreatePossibleSetting");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootsystempowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootsystempowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_power_powerCreateRequest(void* context) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerCreateRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)context;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerCreateSetting(void* rootsystempowerkey, void* subgroupofpowersettingsguid, void* powersettingguid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerCreateSetting");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootsystempowerkey, subgroupofpowersettingsguid, powersettingguid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootsystempowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerDeleteScheme(void* rootpowerkey, void* schemeguid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerDeleteScheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemeguid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_power_powerDeterminePlatformRole(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerDeterminePlatformRole");
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

int32_t windowssys_windows_win32_system_power_powerDeterminePlatformRoleEx(uint32_t version) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerDeterminePlatformRoleEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(version);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)version;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerDuplicateScheme(void* rootpowerkey, void* sourceschemeguid, void* destinationschemeguid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerDuplicateScheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, sourceschemeguid, destinationschemeguid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)sourceschemeguid;
    (void)destinationschemeguid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerEnumerate(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, int32_t accessflags, uint32_t arg_4_index, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerEnumerate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, accessflags, arg_4_index, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)accessflags;
    (void)arg_4_index;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerGetActiveScheme(void* userrootpowerkey, void* activepolicyguid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerGetActiveScheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(userrootpowerkey, activepolicyguid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)userrootpowerkey;
    (void)activepolicyguid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerImportPowerScheme(void* rootpowerkey, void* importfilenamepath, void* destinationschemeguid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerImportPowerScheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, importfilenamepath, destinationschemeguid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)importfilenamepath;
    (void)destinationschemeguid;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssys_windows_win32_system_power_powerIsSettingRangeDefined(void* subkeyguid, void* settingguid) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerIsSettingRangeDefined");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subkeyguid, settingguid);
    }
    errno = ENOSYS;
    return false;
#else
    (void)subkeyguid;
    (void)settingguid;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerOpenSystemPowerKey(void* phsystempowerkey, uint32_t access, int32_t openexisting) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerOpenSystemPowerKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phsystempowerkey, access, openexisting);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phsystempowerkey;
    (void)access;
    (void)openexisting;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerOpenUserPowerKey(void* phuserpowerkey, uint32_t access, int32_t openexisting) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerOpenUserPowerKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phuserpowerkey, access, openexisting);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phuserpowerkey;
    (void)access;
    (void)openexisting;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadACDefaultIndex(void* rootpowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* acdefaultindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadACDefaultIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, acdefaultindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)acdefaultindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadACValue(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* type, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadACValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, type, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadACValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* acvalueindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadACValueIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, acvalueindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)acvalueindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadDCDefaultIndex(void* rootpowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* dcdefaultindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadDCDefaultIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, dcdefaultindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)dcdefaultindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadDCValue(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* type, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadDCValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, type, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadDCValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* dcvalueindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadDCValueIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, dcvalueindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)dcvalueindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadDescription(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadDescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadFriendlyName(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadFriendlyName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadIconResourceSpecifier(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadIconResourceSpecifier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadPossibleDescription(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadPossibleDescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadPossibleFriendlyName(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadPossibleFriendlyName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadPossibleValue(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* type, uint32_t possiblesettingindex, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadPossibleValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, type, possiblesettingindex, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadSettingAttributes(void* subgroupguid, void* powersettingguid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadSettingAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subgroupguid, powersettingguid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)subgroupguid;
    (void)powersettingguid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadValueIncrement(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* valueincrement) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadValueIncrement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueincrement);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueincrement;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadValueMax(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* valuemaximum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadValueMax");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valuemaximum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valuemaximum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadValueMin(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* valueminimum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadValueMin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueminimum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueminimum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReadValueUnitsSpecifier(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReadValueUnitsSpecifier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_power_powerRegisterForEffectivePowerModeNotifications(uint32_t version, void* callback, void* context, void* registrationhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerRegisterForEffectivePowerModeNotifications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(version, callback, context, registrationhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)version;
    (void)callback;
    (void)context;
    (void)registrationhandle;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerRegisterSuspendResumeNotification(uint32_t flags, void* recipient, void* registrationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerRegisterSuspendResumeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, recipient, registrationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)recipient;
    (void)registrationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerRemovePowerSetting(void* powersettingsubkeyguid, void* powersettingguid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerRemovePowerSetting");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(powersettingsubkeyguid, powersettingguid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)powersettingsubkeyguid;
    (void)powersettingguid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerReplaceDefaultPowerSchemes(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReplaceDefaultPowerSchemes");
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

uint32_t windowssys_windows_win32_system_power_powerReportThermalEvent(void* event) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerReportThermalEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(event);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)event;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerRestoreDefaultPowerSchemes(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerRestoreDefaultPowerSchemes");
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

uint32_t windowssys_windows_win32_system_power_powerRestoreIndividualDefaultPowerScheme(void* schemeguid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerRestoreIndividualDefaultPowerScheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(schemeguid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)schemeguid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerSetActiveScheme(void* userrootpowerkey, void* schemeguid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSetActiveScheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(userrootpowerkey, schemeguid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)userrootpowerkey;
    (void)schemeguid;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_power_powerSetRequest(void* powerrequest, int32_t requesttype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSetRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(powerrequest, requesttype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)powerrequest;
    (void)requesttype;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerSettingAccessCheck(int32_t accessflags, void* powerguid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSettingAccessCheck");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(accessflags, powerguid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)accessflags;
    (void)powerguid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerSettingAccessCheckEx(int32_t accessflags, void* powerguid, uint32_t accesstype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSettingAccessCheckEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(accessflags, powerguid, accesstype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)accessflags;
    (void)powerguid;
    (void)accesstype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerSettingRegisterNotification(void* settingguid, uint32_t flags, void* recipient, void* registrationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSettingRegisterNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(settingguid, flags, recipient, registrationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)settingguid;
    (void)flags;
    (void)recipient;
    (void)registrationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerSettingUnregisterNotification(int64_t registrationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerSettingUnregisterNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(registrationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)registrationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_power_powerUnregisterFromEffectivePowerModeNotifications(void* registrationhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerUnregisterFromEffectivePowerModeNotifications");
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

uint32_t windowssys_windows_win32_system_power_powerUnregisterSuspendResumeNotification(int64_t registrationhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerUnregisterSuspendResumeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(registrationhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)registrationhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerWriteACDefaultIndex(void* rootsystempowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t defaultacindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteACDefaultIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootsystempowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, defaultacindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootsystempowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)defaultacindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerWriteACValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t acvalueindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteACValueIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, acvalueindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)acvalueindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerWriteDCDefaultIndex(void* rootsystempowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t defaultdcindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteDCDefaultIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootsystempowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, defaultdcindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootsystempowerkey;
    (void)schemepersonalityguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)defaultdcindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerWriteDCValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t dcvalueindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteDCValueIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, dcvalueindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)dcvalueindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerWriteDescription(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteDescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerWriteFriendlyName(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteFriendlyName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerWriteIconResourceSpecifier(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteIconResourceSpecifier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)schemeguid;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerWritePossibleDescription(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, uint32_t buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWritePossibleDescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerWritePossibleFriendlyName(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, uint32_t buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWritePossibleFriendlyName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerWritePossibleValue(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t type, uint32_t possiblesettingindex, void* buffer, uint32_t buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWritePossibleValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, type, possiblesettingindex, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)type;
    (void)possiblesettingindex;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerWriteSettingAttributes(void* subgroupguid, void* powersettingguid, uint32_t attributes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteSettingAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subgroupguid, powersettingguid, attributes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)subgroupguid;
    (void)powersettingguid;
    (void)attributes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerWriteValueIncrement(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t valueincrement) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteValueIncrement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueincrement);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueincrement;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerWriteValueMax(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t valuemaximum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteValueMax");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valuemaximum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valuemaximum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerWriteValueMin(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t valueminimum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteValueMin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueminimum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)valueminimum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_power_powerWriteValueUnitsSpecifier(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PowerWriteValueUnitsSpecifier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rootpowerkey;
    (void)subgroupofpowersettingsguid;
    (void)powersettingguid;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssys_windows_win32_system_power_readGlobalPwrPolicy(void* pglobalpowerpolicy) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadGlobalPwrPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pglobalpowerpolicy);
    }
    errno = ENOSYS;
    return false;
#else
    (void)pglobalpowerpolicy;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_readProcessorPwrScheme(uint32_t uiid, void* pmachineprocessorpowerpolicy) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadProcessorPwrScheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiid, pmachineprocessorpowerpolicy);
    }
    errno = ENOSYS;
    return false;
#else
    (void)uiid;
    (void)pmachineprocessorpowerpolicy;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_readPwrScheme(uint32_t uiid, void* ppowerpolicy) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadPwrScheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiid, ppowerpolicy);
    }
    errno = ENOSYS;
    return false;
#else
    (void)uiid;
    (void)ppowerpolicy;
    errno = ENOSYS;
    return false;
#endif
}

int64_t windowssys_windows_win32_system_power_registerPowerSettingNotification(void* hrecipient, void* powersettingguid, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterPowerSettingNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecipient, powersettingguid, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrecipient;
    (void)powersettingguid;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_power_registerSuspendResumeNotification(void* hrecipient, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterSuspendResumeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecipient, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrecipient;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_power_requestWakeupLatency(int32_t latency) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RequestWakeupLatency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(latency);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)latency;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_win32_system_power_setActivePwrScheme(uint32_t uiid, void* pglobalpowerpolicy, void* ppowerpolicy) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetActivePwrScheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiid, pglobalpowerpolicy, ppowerpolicy);
    }
    errno = ENOSYS;
    return false;
#else
    (void)uiid;
    (void)pglobalpowerpolicy;
    (void)ppowerpolicy;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_setSuspendState(bool bhibernate, bool bforce, bool bwakeupeventsdisabled) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSuspendState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bhibernate, bforce, bwakeupeventsdisabled);
    }
    errno = ENOSYS;
    return false;
#else
    (void)bhibernate;
    (void)bforce;
    (void)bwakeupeventsdisabled;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_system_power_setSystemPowerState(int32_t fsuspend, int32_t fforce) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemPowerState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fsuspend, fforce);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fsuspend;
    (void)fforce;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_power_setThreadExecutionState(uint32_t esflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadExecutionState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(esflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)esflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_power_unregisterPowerSettingNotification(int64_t handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterPowerSettingNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_power_unregisterSuspendResumeNotification(int64_t handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterSuspendResumeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_win32_system_power_validatePowerPolicies(void* pglobalpowerpolicy, void* ppowerpolicy) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ValidatePowerPolicies");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pglobalpowerpolicy, ppowerpolicy);
    }
    errno = ENOSYS;
    return false;
#else
    (void)pglobalpowerpolicy;
    (void)ppowerpolicy;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_writeGlobalPwrPolicy(void* pglobalpowerpolicy) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteGlobalPwrPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pglobalpowerpolicy);
    }
    errno = ENOSYS;
    return false;
#else
    (void)pglobalpowerpolicy;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_writeProcessorPwrScheme(uint32_t uiid, void* pmachineprocessorpowerpolicy) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteProcessorPwrScheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiid, pmachineprocessorpowerpolicy);
    }
    errno = ENOSYS;
    return false;
#else
    (void)uiid;
    (void)pmachineprocessorpowerpolicy;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_power_writePwrScheme(void* puiid, void* lpszschemename, void* lpszdescription, void* lpscheme) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("powrprof.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WritePwrScheme");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puiid, lpszschemename, lpszdescription, lpscheme);
    }
    errno = ENOSYS;
    return false;
#else
    (void)puiid;
    (void)lpszschemename;
    (void)lpszdescription;
    (void)lpscheme;
    errno = ENOSYS;
    return false;
#endif
}

