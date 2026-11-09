#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_shutdown_wrapper.h"
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

int32_t windowssys_windows_win32_system_shutdown_AbortSystemShutdownA(void* lpmachinename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AbortSystemShutdownA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmachinename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_shutdown_AbortSystemShutdownW(void* lpmachinename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AbortSystemShutdownW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmachinename;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_shutdown_CheckForHiberboot(void* phiberboot, bool bclearflag) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckForHiberboot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phiberboot, bclearflag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phiberboot;
    (void)bclearflag;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_shutdown_ExitWindowsEx(uint32_t uflags, uint32_t dwreason) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExitWindowsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uflags, dwreason);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uflags;
    (void)dwreason;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_shutdown_InitiateShutdownA(void* lpmachinename, void* lpmessage, uint32_t dwgraceperiod, uint32_t dwshutdownflags, uint32_t dwreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitiateShutdownA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, lpmessage, dwgraceperiod, dwshutdownflags, dwreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpmachinename;
    (void)lpmessage;
    (void)dwgraceperiod;
    (void)dwshutdownflags;
    (void)dwreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_shutdown_InitiateShutdownW(void* lpmachinename, void* lpmessage, uint32_t dwgraceperiod, uint32_t dwshutdownflags, uint32_t dwreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitiateShutdownW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, lpmessage, dwgraceperiod, dwshutdownflags, dwreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpmachinename;
    (void)lpmessage;
    (void)dwgraceperiod;
    (void)dwshutdownflags;
    (void)dwreason;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_shutdown_InitiateSystemShutdownA(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitiateSystemShutdownA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, lpmessage, dwtimeout, bforceappsclosed, brebootaftershutdown);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmachinename;
    (void)lpmessage;
    (void)dwtimeout;
    (void)bforceappsclosed;
    (void)brebootaftershutdown;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_shutdown_InitiateSystemShutdownExA(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown, uint32_t dwreason) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitiateSystemShutdownExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, lpmessage, dwtimeout, bforceappsclosed, brebootaftershutdown, dwreason);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmachinename;
    (void)lpmessage;
    (void)dwtimeout;
    (void)bforceappsclosed;
    (void)brebootaftershutdown;
    (void)dwreason;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_shutdown_InitiateSystemShutdownExW(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown, uint32_t dwreason) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitiateSystemShutdownExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, lpmessage, dwtimeout, bforceappsclosed, brebootaftershutdown, dwreason);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmachinename;
    (void)lpmessage;
    (void)dwtimeout;
    (void)bforceappsclosed;
    (void)brebootaftershutdown;
    (void)dwreason;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_shutdown_InitiateSystemShutdownW(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitiateSystemShutdownW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, lpmessage, dwtimeout, bforceappsclosed, brebootaftershutdown);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmachinename;
    (void)lpmessage;
    (void)dwtimeout;
    (void)bforceappsclosed;
    (void)brebootaftershutdown;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_shutdown_LockWorkStation(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockWorkStation");
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

int32_t windowssys_windows_win32_system_shutdown_ShutdownBlockReasonCreate(void* hwnd, void* pwszreason) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShutdownBlockReasonCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pwszreason);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pwszreason;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_shutdown_ShutdownBlockReasonDestroy(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShutdownBlockReasonDestroy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_shutdown_ShutdownBlockReasonQuery(void* hwnd, void* pwszbuff, void* pcchbuff) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShutdownBlockReasonQuery");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pwszbuff, pcchbuff);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pwszbuff;
    (void)pcchbuff;
    errno = ENOSYS;
    return -1;
#endif
}

