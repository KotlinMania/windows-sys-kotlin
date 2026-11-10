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

int32_t windowssys_windows_win32_ui_hidpi_adjustWindowRectExForDpi(void* lprect, uint32_t dwstyle, int32_t bmenu, uint32_t dwexstyle, uint32_t dpi) {
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

int32_t windowssys_windows_win32_ui_hidpi_areDpiAwarenessContextsEqual(void* dpicontexta, void* dpicontextb) {
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

int32_t windowssys_windows_win32_ui_hidpi_enableNonClientDpiScaling(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_hidpi_getAwarenessFromDpiAwarenessContext(void* value) {
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

int32_t windowssys_windows_win32_ui_hidpi_getDialogControlDpiChangeBehavior(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_hidpi_getDialogDpiChangeBehavior(void* hdlg) {
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

void* windowssys_windows_win32_ui_hidpi_getDpiAwarenessContextForProcess(void* hprocess) {
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

int32_t windowssys_windows_win32_ui_hidpi_getDpiForMonitor(void* hmonitor, int32_t dpitype, void* dpix, void* dpiy) {
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

uint32_t windowssys_windows_win32_ui_hidpi_getDpiForSystem(void) {
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

uint32_t windowssys_windows_win32_ui_hidpi_getDpiForWindow(void* hwnd) {
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

uint32_t windowssys_windows_win32_ui_hidpi_getDpiFromDpiAwarenessContext(void* value) {
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

int32_t windowssys_windows_win32_ui_hidpi_getProcessDpiAwareness(void* hprocess, void* value) {
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

uint32_t windowssys_windows_win32_ui_hidpi_getSystemDpiForProcess(void* hprocess) {
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

int32_t windowssys_windows_win32_ui_hidpi_getSystemMetricsForDpi(int32_t nindex, uint32_t dpi) {
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

void* windowssys_windows_win32_ui_hidpi_getThreadDpiAwarenessContext(void) {
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

int32_t windowssys_windows_win32_ui_hidpi_getThreadDpiHostingBehavior(void) {
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

void* windowssys_windows_win32_ui_hidpi_getWindowDpiAwarenessContext(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_hidpi_getWindowDpiHostingBehavior(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_hidpi_isValidDpiAwarenessContext(void* value) {
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

int32_t windowssys_windows_win32_ui_hidpi_logicalToPhysicalPointForPerMonitorDPI(void* hwnd, void* lppoint) {
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

int64_t windowssys_windows_win32_ui_hidpi_openThemeDataForDpi(void* hwnd, void* pszclasslist, uint32_t dpi) {
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

int32_t windowssys_windows_win32_ui_hidpi_physicalToLogicalPointForPerMonitorDPI(void* hwnd, void* lppoint) {
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

int32_t windowssys_windows_win32_ui_hidpi_setDialogControlDpiChangeBehavior(void* hwnd, int32_t mask, int32_t values) {
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

int32_t windowssys_windows_win32_ui_hidpi_setDialogDpiChangeBehavior(void* hdlg, int32_t mask, int32_t values) {
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

int32_t windowssys_windows_win32_ui_hidpi_setProcessDpiAwareness(int32_t value) {
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

int32_t windowssys_windows_win32_ui_hidpi_setProcessDpiAwarenessContext(void* value) {
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

void* windowssys_windows_win32_ui_hidpi_setThreadDpiAwarenessContext(void* dpicontext) {
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

int32_t windowssys_windows_win32_ui_hidpi_setThreadDpiHostingBehavior(int32_t value) {
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

int32_t windowssys_windows_win32_ui_hidpi_systemParametersInfoForDpi(uint32_t uiaction, uint32_t uiparam, void* pvparam, uint32_t fwinini, uint32_t dpi) {
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

