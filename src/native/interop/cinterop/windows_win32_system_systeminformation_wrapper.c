#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_systeminformation_wrapper.h"
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

int32_t windowssys_windows_win32_system_systeminformation_DnsHostnameToComputerNameExW(void* hostname, void* computername, void* nsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsHostnameToComputerNameExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, computername, nsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hostname;
    (void)computername;
    (void)nsize;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_systeminformation_EnumSystemFirmwareTables(uint32_t firmwaretableprovidersignature, void* pfirmwaretableenumbuffer, uint32_t buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumSystemFirmwareTables");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(firmwaretableprovidersignature, pfirmwaretableenumbuffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)firmwaretableprovidersignature;
    (void)pfirmwaretableenumbuffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetComputerNameExA(int32_t nametype, void* lpbuffer, void* nsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerNameExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nametype, lpbuffer, nsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nametype;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetComputerNameExW(int32_t nametype, void* lpbuffer, void* nsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerNameExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nametype, lpbuffer, nsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nametype;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetDeveloperDriveEnablementState(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-6.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeveloperDriveEnablementState");
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

int32_t windowssys_windows_win32_system_systeminformation_GetFirmwareType(void* firmwaretype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFirmwareType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(firmwaretype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)firmwaretype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetIntegratedDisplaySize(void* sizeininches) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-3.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIntegratedDisplaySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sizeininches);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sizeininches;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_systeminformation_GetLocalTime(void* lpsystemtime) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLocalTime");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpsystemtime);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpsystemtime;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformation(void* buffer, void* returnedlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogicalProcessorInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer, returnedlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)buffer;
    (void)returnedlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetLogicalProcessorInformationEx(int32_t relationshiptype, void* buffer, void* returnedlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogicalProcessorInformationEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(relationshiptype, buffer, returnedlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)relationshiptype;
    (void)buffer;
    (void)returnedlength;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_systeminformation_GetNativeSystemInfo(void* lpsysteminfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNativeSystemInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpsysteminfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpsysteminfo;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetOsManufacturingMode(void* pbenabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-3.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOsManufacturingMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbenabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbenabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetOsSafeBootMode(void* flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOsSafeBootMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetPhysicallyInstalledSystemMemory(void* totalmemoryinkilobytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPhysicallyInstalledSystemMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(totalmemoryinkilobytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)totalmemoryinkilobytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetProcessorSystemCycleTime(uint16_t group, void* buffer, void* returnedlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessorSystemCycleTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(group, buffer, returnedlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)group;
    (void)buffer;
    (void)returnedlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetProductInfo(uint32_t dwosmajorversion, uint32_t dwosminorversion, uint32_t dwspmajorversion, uint32_t dwspminorversion, void* pdwreturnedproducttype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProductInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwosmajorversion, dwosminorversion, dwspmajorversion, dwspminorversion, pdwreturnedproducttype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwosmajorversion;
    (void)dwosminorversion;
    (void)dwspmajorversion;
    (void)dwspminorversion;
    (void)pdwreturnedproducttype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetSystemCpuSetInformation(void* information, uint32_t bufferlength, void* returnedlength, void* process, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemCpuSetInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(information, bufferlength, returnedlength, process, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)information;
    (void)bufferlength;
    (void)returnedlength;
    (void)process;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetSystemDEPPolicy(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemDEPPolicy");
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

uint32_t windowssys_windows_win32_system_systeminformation_GetSystemDirectoryA(void* lpbuffer, uint32_t usize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer, usize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_systeminformation_GetSystemDirectoryW(void* lpbuffer, uint32_t usize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer, usize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_systeminformation_GetSystemFirmwareTable(uint32_t firmwaretableprovidersignature, uint32_t firmwaretableid, void* pfirmwaretablebuffer, uint32_t buffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemFirmwareTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(firmwaretableprovidersignature, firmwaretableid, pfirmwaretablebuffer, buffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)firmwaretableprovidersignature;
    (void)firmwaretableid;
    (void)pfirmwaretablebuffer;
    (void)buffersize;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_system_systeminformation_GetSystemInfo(void* lpsysteminfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpsysteminfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpsysteminfo;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetSystemLeapSecondInformation(void* enabled, void* flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemLeapSecondInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enabled, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enabled;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_systeminformation_GetSystemTime(void* lpsystemtime) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpsystemtime);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpsystemtime;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustment(void* lptimeadjustment, void* lptimeincrement, void* lptimeadjustmentdisabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTimeAdjustment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimeadjustment, lptimeincrement, lptimeadjustmentdisabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptimeadjustment;
    (void)lptimeincrement;
    (void)lptimeadjustmentdisabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetSystemTimeAdjustmentPrecise(void* lptimeadjustment, void* lptimeincrement, void* lptimeadjustmentdisabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTimeAdjustmentPrecise");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimeadjustment, lptimeincrement, lptimeadjustmentdisabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptimeadjustment;
    (void)lptimeincrement;
    (void)lptimeadjustmentdisabled;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_systeminformation_GetSystemTimeAsFileTime(void* lpsystemtimeasfiletime) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTimeAsFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpsystemtimeasfiletime);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpsystemtimeasfiletime;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_systeminformation_GetSystemTimePreciseAsFileTime(void* lpsystemtimeasfiletime) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTimePreciseAsFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpsystemtimeasfiletime);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpsystemtimeasfiletime;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryA(void* lpbuffer, uint32_t usize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWindowsDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer, usize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_systeminformation_GetSystemWindowsDirectoryW(void* lpbuffer, uint32_t usize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWindowsDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer, usize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2A(void* lpbuffer, uint32_t usize, uint16_t imagefilemachinetype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-wow64-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWow64Directory2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer, usize, imagefilemachinetype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpbuffer;
    (void)usize;
    (void)imagefilemachinetype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_systeminformation_GetSystemWow64Directory2W(void* lpbuffer, uint32_t usize, uint16_t imagefilemachinetype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-wow64-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWow64Directory2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer, usize, imagefilemachinetype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpbuffer;
    (void)usize;
    (void)imagefilemachinetype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryA(void* lpbuffer, uint32_t usize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWow64DirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer, usize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_systeminformation_GetSystemWow64DirectoryW(void* lpbuffer, uint32_t usize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemWow64DirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer, usize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_systeminformation_GetTickCount(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTickCount");
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

uint64_t windowssys_windows_win32_system_systeminformation_GetTickCount64(void) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTickCount64");
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

uint32_t windowssys_windows_win32_system_systeminformation_GetVersion(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersion");
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

int32_t windowssys_windows_win32_system_systeminformation_GetVersionExA(void* lpversioninformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpversioninformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpversioninformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GetVersionExW(void* lpversioninformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpversioninformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpversioninformation;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryA(void* lpbuffer, uint32_t usize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowsDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer, usize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_systeminformation_GetWindowsDirectoryW(void* lpbuffer, uint32_t usize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowsDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer, usize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpbuffer;
    (void)usize;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_system_systeminformation_GlobalMemoryStatus(void* lpbuffer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalMemoryStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpbuffer);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpbuffer;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_GlobalMemoryStatusEx(void* lpbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalMemoryStatusEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_IsUserCetAvailableInEnvironment(uint32_t usercetenvironment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsUserCetAvailableInEnvironment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(usercetenvironment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)usercetenvironment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_IsWow64GuestMachineSupported(uint16_t wowguestmachine, void* machineissupported) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWow64GuestMachineSupported");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wowguestmachine, machineissupported);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wowguestmachine;
    (void)machineissupported;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_systeminformation_RtlConvertDeviceFamilyInfoToString(void* puldevicefamilybuffersize, void* puldeviceformbuffersize, void* devicefamily, void* deviceform) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlConvertDeviceFamilyInfoToString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puldevicefamilybuffersize, puldeviceformbuffersize, devicefamily, deviceform);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)puldevicefamilybuffersize;
    (void)puldeviceformbuffersize;
    (void)devicefamily;
    (void)deviceform;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_system_systeminformation_RtlGetDeviceFamilyInfoEnum(void* pulluapinfo, void* puldevicefamily, void* puldeviceform) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetDeviceFamilyInfoEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pulluapinfo, puldevicefamily, puldeviceform);
        return;
    }
    errno = ENOSYS;
#else
    (void)pulluapinfo;
    (void)puldevicefamily;
    (void)puldeviceform;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_win32_system_systeminformation_RtlGetProductInfo(uint32_t osmajorversion, uint32_t osminorversion, uint32_t spmajorversion, uint32_t spminorversion, void* returnedproducttype) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetProductInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(osmajorversion, osminorversion, spmajorversion, spminorversion, returnedproducttype);
    }
    errno = ENOSYS;
    return false;
#else
    (void)osmajorversion;
    (void)osminorversion;
    (void)spmajorversion;
    (void)spminorversion;
    (void)returnedproducttype;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssys_windows_win32_system_systeminformation_RtlGetSystemGlobalData(int32_t dataid, void* buffer, uint32_t size) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdllk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetSystemGlobalData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dataid, buffer, size);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dataid;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_RtlOsDeploymentState(uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlOsDeploymentState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_systeminformation_RtlSwitchedVVI(void* versioninfo, uint32_t typemask, uint64_t conditionmask) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSwitchedVVI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(versioninfo, typemask, conditionmask);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)versioninfo;
    (void)typemask;
    (void)conditionmask;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_SetComputerNameA(void* lpcomputername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetComputerNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcomputername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcomputername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_SetComputerNameEx2W(int32_t nametype, uint32_t flags, void* lpbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetComputerNameEx2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nametype, flags, lpbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nametype;
    (void)flags;
    (void)lpbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_SetComputerNameExA(int32_t nametype, void* lpbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetComputerNameExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nametype, lpbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nametype;
    (void)lpbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_SetComputerNameExW(int32_t nametype, void* lpbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetComputerNameExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nametype, lpbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nametype;
    (void)lpbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_SetComputerNameW(void* lpcomputername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetComputerNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcomputername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcomputername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_SetLocalTime(void* lpsystemtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLocalTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystemtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystemtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_SetSystemTime(void* lpsystemtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystemtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystemtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustment(uint32_t dwtimeadjustment, int32_t btimeadjustmentdisabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemTimeAdjustment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtimeadjustment, btimeadjustmentdisabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtimeadjustment;
    (void)btimeadjustmentdisabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_SetSystemTimeAdjustmentPrecise(uint64_t dwtimeadjustment, int32_t btimeadjustmentdisabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-sysinfo-l1-2-4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemTimeAdjustmentPrecise");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtimeadjustment, btimeadjustmentdisabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtimeadjustment;
    (void)btimeadjustmentdisabled;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_system_systeminformation_VerSetConditionMask(uint64_t conditionmask, uint32_t typemask, uint8_t condition) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerSetConditionMask");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(conditionmask, typemask, condition);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)conditionmask;
    (void)typemask;
    (void)condition;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_VerifyVersionInfoA(void* lpversioninformation, uint32_t dwtypemask, uint64_t dwlconditionmask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyVersionInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpversioninformation, dwtypemask, dwlconditionmask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpversioninformation;
    (void)dwtypemask;
    (void)dwlconditionmask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_systeminformation_VerifyVersionInfoW(void* lpversioninformation, uint32_t dwtypemask, uint64_t dwlconditionmask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyVersionInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpversioninformation, dwtypemask, dwlconditionmask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpversioninformation;
    (void)dwtypemask;
    (void)dwlconditionmask;
    errno = ENOSYS;
    return -1;
#endif
}

