#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_hidpi_wrapper.h"
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

int32_t windowssysWindowsWin32UiHidpiAdjustWindowRectExForDpi(void* lprect, uint32_t dwstyle, int32_t bmenu, uint32_t dwexstyle, uint32_t dpi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdjustWindowRectExForDpi");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprect, dwstyle, bmenu, dwexstyle, dpi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprect;
    (void)dwstyle;
    (void)bmenu;
    (void)dwexstyle;
    (void)dpi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiHidpiAreDpiAwarenessContextsEqual(void* dpicontexta, void* dpicontextb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AreDpiAwarenessContextsEqual");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dpicontexta, dpicontextb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dpicontexta;
    (void)dpicontextb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiHidpiEnableNonClientDpiScaling(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableNonClientDpiScaling");
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

int32_t windowssysWindowsWin32UiHidpiGetAwarenessFromDpiAwarenessContext(void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAwarenessFromDpiAwarenessContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiHidpiGetDialogControlDpiChangeBehavior(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDialogControlDpiChangeBehavior");
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

int32_t windowssysWindowsWin32UiHidpiGetDialogDpiChangeBehavior(void* hdlg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDialogDpiChangeBehavior");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32UiHidpiGetDpiAwarenessContextForProcess(void* hprocess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDpiAwarenessContextForProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32UiHidpiGetDpiForMonitor(void* hmonitor, int32_t dpitype, void* dpix, void* dpiy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDpiForMonitor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmonitor, dpitype, dpix, dpiy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmonitor;
    (void)dpitype;
    (void)dpix;
    (void)dpiy;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32UiHidpiGetDpiForSystem(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDpiForSystem");
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

uint32_t windowssysWindowsWin32UiHidpiGetDpiForWindow(void* hwnd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDpiForWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiHidpiGetDpiFromDpiAwarenessContext(void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDpiFromDpiAwarenessContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32UiHidpiGetProcessDpiAwareness(void* hprocess, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessDpiAwareness");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32UiHidpiGetSystemDpiForProcess(void* hprocess) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemDpiForProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32UiHidpiGetSystemMetricsForDpi(int32_t nindex, uint32_t dpi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemMetricsForDpi");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nindex, dpi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nindex;
    (void)dpi;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32UiHidpiGetThreadDpiAwarenessContext(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadDpiAwarenessContext");
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

int32_t windowssysWindowsWin32UiHidpiGetThreadDpiHostingBehavior(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadDpiHostingBehavior");
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

void* windowssysWindowsWin32UiHidpiGetWindowDpiAwarenessContext(void* hwnd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowDpiAwarenessContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32UiHidpiGetWindowDpiHostingBehavior(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowDpiHostingBehavior");
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

int32_t windowssysWindowsWin32UiHidpiIsValidDpiAwarenessContext(void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidDpiAwarenessContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiHidpiLogicalToPhysicalPointForPerMonitorDPI(void* hwnd, void* lppoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogicalToPhysicalPointForPerMonitorDPI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lppoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lppoint;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWin32UiHidpiOpenThemeDataForDpi(void* hwnd, void* pszclasslist, uint32_t dpi) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenThemeDataForDpi");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszclasslist, dpi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszclasslist;
    (void)dpi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiHidpiPhysicalToLogicalPointForPerMonitorDPI(void* hwnd, void* lppoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PhysicalToLogicalPointForPerMonitorDPI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lppoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lppoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiHidpiSetDialogControlDpiChangeBehavior(void* hwnd, int32_t mask, int32_t values) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDialogControlDpiChangeBehavior");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, mask, values);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)mask;
    (void)values;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiHidpiSetDialogDpiChangeBehavior(void* hdlg, int32_t mask, int32_t values) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDialogDpiChangeBehavior");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, mask, values);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)mask;
    (void)values;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiHidpiSetProcessDpiAwareness(int32_t value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDpiAwareness");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiHidpiSetProcessDpiAwarenessContext(void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDpiAwarenessContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32UiHidpiSetThreadDpiAwarenessContext(void* dpicontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadDpiAwarenessContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dpicontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dpicontext;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32UiHidpiSetThreadDpiHostingBehavior(int32_t value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadDpiHostingBehavior");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiHidpiSystemParametersInfoForDpi(uint32_t uiaction, uint32_t uiparam, void* pvparam, uint32_t fwinini, uint32_t dpi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemParametersInfoForDpi");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiaction, uiparam, pvparam, fwinini, dpi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiaction;
    (void)uiparam;
    (void)pvparam;
    (void)fwinini;
    (void)dpi;
    errno = ENOSYS;
    return -1;
#endif
}

