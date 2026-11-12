#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_stationsanddesktops_wrapper.h"
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

int32_t windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageA(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BroadcastSystemMessageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, lpinfo, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExA(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam, void* pbsminfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BroadcastSystemMessageExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, lpinfo, msg, wparam, lparam, pbsminfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)pbsminfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExW(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam, void* pbsminfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BroadcastSystemMessageExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, lpinfo, msg, wparam, lparam, pbsminfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)pbsminfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageW(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BroadcastSystemMessageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, lpinfo, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsCloseDesktop(void* hdesktop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseDesktop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdesktop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdesktop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsCloseWindowStation(void* hwinsta) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseWindowStation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwinsta);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwinsta;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopA(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDesktopA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdesktop, lpszdevice, pdevmode, dwflags, dwdesiredaccess, lpsa);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExA(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa, uint32_t ulheapsize, void* pvoid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDesktopExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdesktop, lpszdevice, pdevmode, dwflags, dwdesiredaccess, lpsa, ulheapsize, pvoid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    (void)ulheapsize;
    (void)pvoid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExW(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa, uint32_t ulheapsize, void* pvoid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDesktopExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdesktop, lpszdevice, pdevmode, dwflags, dwdesiredaccess, lpsa, ulheapsize, pvoid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    (void)ulheapsize;
    (void)pvoid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopW(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDesktopW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdesktop, lpszdevice, pdevmode, dwflags, dwdesiredaccess, lpsa);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationA(void* lpwinsta, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWindowStationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwinsta, dwflags, dwdesiredaccess, lpsa);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpwinsta;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationW(void* lpwinsta, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWindowStationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwinsta, dwflags, dwdesiredaccess, lpsa);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpwinsta;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsA(void* hwinsta, void* lpenumfunc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDesktopsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwinsta, lpenumfunc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwinsta;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsW(void* hwinsta, void* lpenumfunc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDesktopsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwinsta, lpenumfunc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwinsta;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsA(void* lpenumfunc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumWindowStationsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpenumfunc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsW(void* lpenumfunc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumWindowStationsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpenumfunc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemStationsanddesktopsGetProcessWindowStation(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessWindowStation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemStationsanddesktopsGetThreadDesktop(uint32_t dwthreadid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadDesktop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwthreadid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwthreadid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationA(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength, void* lpnlengthneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserObjectInformationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, nindex, pvinfo, nlength, lpnlengthneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationW(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength, void* lpnlengthneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserObjectInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, nindex, pvinfo, nlength, lpnlengthneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopA(void* lpszdesktop, uint32_t dwflags, int32_t finherit, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenDesktopA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdesktop, dwflags, finherit, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszdesktop;
    (void)dwflags;
    (void)finherit;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopW(void* lpszdesktop, uint32_t dwflags, int32_t finherit, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenDesktopW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdesktop, dwflags, finherit, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszdesktop;
    (void)dwflags;
    (void)finherit;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemStationsanddesktopsOpenInputDesktop(uint32_t dwflags, int32_t finherit, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenInputDesktop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, finherit, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwflags;
    (void)finherit;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationA(void* lpszwinsta, int32_t finherit, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenWindowStationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszwinsta, finherit, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszwinsta;
    (void)finherit;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationW(void* lpszwinsta, int32_t finherit, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenWindowStationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszwinsta, finherit, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszwinsta;
    (void)finherit;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsSetProcessWindowStation(void* hwinsta) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessWindowStation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwinsta);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwinsta;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsSetThreadDesktop(void* hdesktop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadDesktop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdesktop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdesktop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationA(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUserObjectInformationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, nindex, pvinfo, nlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationW(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUserObjectInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, nindex, pvinfo, nlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemStationsanddesktopsSwitchDesktop(void* hdesktop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwitchDesktop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdesktop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdesktop;
    errno = ENOSYS;
    return -1;
#endif
}

