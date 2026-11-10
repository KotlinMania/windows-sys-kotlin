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

uint32_t windowssys_windows_win32_system_time_enumDynamicTimeZoneInformation(uint32_t dwindex, void* lptimezoneinformation) {
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

int32_t windowssys_windows_win32_system_time_fileTimeToSystemTime(void* lpfiletime, void* lpsystemtime) {
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

uint32_t windowssys_windows_win32_system_time_getDynamicTimeZoneInformation(void* ptimezoneinformation) {
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

uint32_t windowssys_windows_win32_system_time_getDynamicTimeZoneInformationEffectiveYears(void* lptimezoneinformation, void* firstyear, void* lastyear) {
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

uint32_t windowssys_windows_win32_system_time_getTimeZoneInformation(void* lptimezoneinformation) {
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

int32_t windowssys_windows_win32_system_time_getTimeZoneInformationForYear(uint16_t wyear, void* pdtzi, void* ptzi) {
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

int32_t windowssys_windows_win32_system_time_localFileTimeToLocalSystemTime(void* timezoneinformation, void* localfiletime, void* localsystemtime) {
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

int32_t windowssys_windows_win32_system_time_localSystemTimeToLocalFileTime(void* timezoneinformation, void* localsystemtime, void* localfiletime) {
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

int32_t windowssys_windows_win32_system_time_setDynamicTimeZoneInformation(void* lptimezoneinformation) {
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

int32_t windowssys_windows_win32_system_time_setTimeZoneInformation(void* lptimezoneinformation) {
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

int32_t windowssys_windows_win32_system_time_systemTimeToFileTime(void* lpsystemtime, void* lpfiletime) {
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

int32_t windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTime(void* lptimezoneinformation, void* lpuniversaltime, void* lplocaltime) {
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

int32_t windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTimeEx(void* lptimezoneinformation, void* lpuniversaltime, void* lplocaltime) {
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

int32_t windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTime(void* lptimezoneinformation, void* lplocaltime, void* lpuniversaltime) {
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

int32_t windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTimeEx(void* lptimezoneinformation, void* lplocaltime, void* lpuniversaltime) {
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

