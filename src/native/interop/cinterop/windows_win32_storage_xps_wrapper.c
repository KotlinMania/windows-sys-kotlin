#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_xps_wrapper.h"
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

int32_t windowssysWindowsWin32StorageXpsAbortDoc(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AbortDoc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageXpsDeviceCapabilitiesA(void* pdevice, void* pport, uint16_t fwcapability, void* poutput, void* pdevmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeviceCapabilitiesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdevice, pport, fwcapability, poutput, pdevmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdevice;
    (void)pport;
    (void)fwcapability;
    (void)poutput;
    (void)pdevmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageXpsDeviceCapabilitiesW(void* pdevice, void* pport, uint16_t fwcapability, void* poutput, void* pdevmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeviceCapabilitiesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdevice, pport, fwcapability, poutput, pdevmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdevice;
    (void)pport;
    (void)fwcapability;
    (void)poutput;
    (void)pdevmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageXpsEndDoc(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndDoc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageXpsEndPage(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndPage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageXpsEscape(void* hdc, int32_t iescape, int32_t cjin, void* pvin, void* pvout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Escape");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, iescape, cjin, pvin, pvout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)iescape;
    (void)cjin;
    (void)pvin;
    (void)pvout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageXpsExtEscape(void* hdc, int32_t iescape, int32_t cjinput, void* lpindata, int32_t cjoutput, void* lpoutdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtEscape");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, iescape, cjinput, lpindata, cjoutput, lpoutdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)iescape;
    (void)cjinput;
    (void)lpindata;
    (void)cjoutput;
    (void)lpoutdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageXpsPrintWindow(void* hwnd, void* hdcblt, uint32_t nflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrintWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hdcblt, nflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hdcblt;
    (void)nflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageXpsSetAbortProc(void* hdc, void* proc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAbortProc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, proc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)proc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageXpsStartDocA(void* hdc, void* lpdi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartDocA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpdi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpdi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageXpsStartDocW(void* hdc, void* lpdi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartDocW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpdi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpdi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageXpsStartPage(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartPage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

