#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_media_wrapper.h"
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

uint32_t windowssysWindowsWin32MediaTimeBeginPeriod(uint32_t uperiod) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "timeBeginPeriod");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uperiod);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uperiod;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32MediaTimeEndPeriod(uint32_t uperiod) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "timeEndPeriod");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uperiod);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uperiod;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32MediaTimeGetDevCaps(void* ptc, uint32_t cbtc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "timeGetDevCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptc, cbtc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ptc;
    (void)cbtc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32MediaTimeGetSystemTime(void* pmmt, uint32_t cbmmt) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "timeGetSystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmmt, cbmmt);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pmmt;
    (void)cbmmt;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32MediaTimeGetTime(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "timeGetTime");
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

uint32_t windowssysWindowsWin32MediaTimeKillEvent(uint32_t utimerid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "timeKillEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(utimerid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)utimerid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32MediaTimeSetEvent(uint32_t udelay, uint32_t uresolution, void* fptc, uint64_t dwuser, uint32_t fuevent) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "timeSetEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udelay, uresolution, fptc, dwuser, fuevent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udelay;
    (void)uresolution;
    (void)fptc;
    (void)dwuser;
    (void)fuevent;
    errno = ENOSYS;
    return 0;
#endif
}

