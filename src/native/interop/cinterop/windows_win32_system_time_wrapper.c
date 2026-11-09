#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_time_wrapper.h"
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

uint32_t windowssys_windows_win32_system_time_EnumDynamicTimeZoneInformation(uint32_t dwindex, void* lptimezoneinformation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDynamicTimeZoneInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwindex, lptimezoneinformation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwindex;
    (void)lptimezoneinformation;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_time_FileTimeToSystemTime(void* lpfiletime, void* lpsystemtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileTimeToSystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfiletime, lpsystemtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfiletime;
    (void)lpsystemtime;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_time_GetDynamicTimeZoneInformation(void* ptimezoneinformation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDynamicTimeZoneInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptimezoneinformation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ptimezoneinformation;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_time_GetDynamicTimeZoneInformationEffectiveYears(void* lptimezoneinformation, void* firstyear, void* lastyear) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDynamicTimeZoneInformationEffectiveYears");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimezoneinformation, firstyear, lastyear);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lptimezoneinformation;
    (void)firstyear;
    (void)lastyear;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_time_GetTimeZoneInformation(void* lptimezoneinformation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTimeZoneInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimezoneinformation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lptimezoneinformation;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_time_GetTimeZoneInformationForYear(uint16_t wyear, void* pdtzi, void* ptzi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTimeZoneInformationForYear");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wyear, pdtzi, ptzi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wyear;
    (void)pdtzi;
    (void)ptzi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_time_LocalFileTimeToLocalSystemTime(void* timezoneinformation, void* localfiletime, void* localsystemtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalFileTimeToLocalSystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timezoneinformation, localfiletime, localsystemtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timezoneinformation;
    (void)localfiletime;
    (void)localsystemtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_time_LocalSystemTimeToLocalFileTime(void* timezoneinformation, void* localsystemtime, void* localfiletime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalSystemTimeToLocalFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timezoneinformation, localsystemtime, localfiletime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timezoneinformation;
    (void)localsystemtime;
    (void)localfiletime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_time_SetDynamicTimeZoneInformation(void* lptimezoneinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDynamicTimeZoneInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimezoneinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptimezoneinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_time_SetTimeZoneInformation(void* lptimezoneinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTimeZoneInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimezoneinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptimezoneinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_time_SystemTimeToFileTime(void* lpsystemtime, void* lpfiletime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemTimeToFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystemtime, lpfiletime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystemtime;
    (void)lpfiletime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_time_SystemTimeToTzSpecificLocalTime(void* lptimezoneinformation, void* lpuniversaltime, void* lplocaltime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemTimeToTzSpecificLocalTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimezoneinformation, lpuniversaltime, lplocaltime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptimezoneinformation;
    (void)lpuniversaltime;
    (void)lplocaltime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_time_SystemTimeToTzSpecificLocalTimeEx(void* lptimezoneinformation, void* lpuniversaltime, void* lplocaltime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemTimeToTzSpecificLocalTimeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimezoneinformation, lpuniversaltime, lplocaltime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptimezoneinformation;
    (void)lpuniversaltime;
    (void)lplocaltime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_time_TzSpecificLocalTimeToSystemTime(void* lptimezoneinformation, void* lplocaltime, void* lpuniversaltime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TzSpecificLocalTimeToSystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimezoneinformation, lplocaltime, lpuniversaltime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptimezoneinformation;
    (void)lplocaltime;
    (void)lpuniversaltime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_time_TzSpecificLocalTimeToSystemTimeEx(void* lptimezoneinformation, void* lplocaltime, void* lpuniversaltime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TzSpecificLocalTimeToSystemTimeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimezoneinformation, lplocaltime, lpuniversaltime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptimezoneinformation;
    (void)lplocaltime;
    (void)lpuniversaltime;
    errno = ENOSYS;
    return -1;
#endif
}

