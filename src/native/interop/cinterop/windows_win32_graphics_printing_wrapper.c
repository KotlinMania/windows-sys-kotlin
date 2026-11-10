#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_graphics_printing_wrapper.h"
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

int32_t windowssys_windows_win32_graphics_printing_addMonitorA(void* pname, uint32_t level, void* pmonitors) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddMonitorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, level, pmonitors);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)level;
    (void)pmonitors;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_addMonitorW(void* pname, uint32_t level, void* pmonitors) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddMonitorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, level, pmonitors);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)level;
    (void)pmonitors;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_addPortA(void* pname, void* hwnd, void* pmonitorname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPortA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, hwnd, pmonitorname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)hwnd;
    (void)pmonitorname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_addPortW(void* pname, void* hwnd, void* pmonitorname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPortW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, hwnd, pmonitorname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)hwnd;
    (void)pmonitorname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_addPrintProcessorA(void* pname, void* penvironment, void* ppathname, void* pprintprocessorname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrintProcessorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, ppathname, pprintprocessorname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)ppathname;
    (void)pprintprocessorname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_addPrintProcessorW(void* pname, void* penvironment, void* ppathname, void* pprintprocessorname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrintProcessorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, ppathname, pprintprocessorname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)ppathname;
    (void)pprintprocessorname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_addPrintProvidorA(void* pname, uint32_t level, void* pprovidorinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrintProvidorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, level, pprovidorinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)level;
    (void)pprovidorinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_addPrintProvidorW(void* pname, uint32_t level, void* pprovidorinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrintProvidorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, level, pprovidorinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)level;
    (void)pprovidorinfo;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_printing_addPrinterA(void* pname, uint32_t level, void* pprinter) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, level, pprinter);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pname;
    (void)level;
    (void)pprinter;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_addPrinterConnection2A(void* hwnd, void* pszname, uint32_t dwlevel, void* pconnectioninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterConnection2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszname, dwlevel, pconnectioninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszname;
    (void)dwlevel;
    (void)pconnectioninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_addPrinterConnection2W(void* hwnd, void* pszname, uint32_t dwlevel, void* pconnectioninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterConnection2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszname, dwlevel, pconnectioninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszname;
    (void)dwlevel;
    (void)pconnectioninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_addPrinterConnectionA(void* pname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterConnectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_addPrinterConnectionW(void* pname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterConnectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_addPrinterDriverA(void* pname, uint32_t level, void* pdriverinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterDriverA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, level, pdriverinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)level;
    (void)pdriverinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_addPrinterDriverExA(void* pname, uint32_t level, void* lpbdriverinfo, uint32_t dwfilecopyflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterDriverExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, level, lpbdriverinfo, dwfilecopyflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)level;
    (void)lpbdriverinfo;
    (void)dwfilecopyflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_addPrinterDriverExW(void* pname, uint32_t level, void* lpbdriverinfo, uint32_t dwfilecopyflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterDriverExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, level, lpbdriverinfo, dwfilecopyflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)level;
    (void)lpbdriverinfo;
    (void)dwfilecopyflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_addPrinterDriverW(void* pname, uint32_t level, void* pdriverinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterDriverW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, level, pdriverinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)level;
    (void)pdriverinfo;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_printing_addPrinterW(void* pname, uint32_t level, void* pprinter) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPrinterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, level, pprinter);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pname;
    (void)level;
    (void)pprinter;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_appendPrinterNotifyInfoData(void* pinfodest, void* pdatasrc, uint32_t fdwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppendPrinterNotifyInfoData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinfodest, pdatasrc, fdwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinfodest;
    (void)pdatasrc;
    (void)fdwflags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_printing_callRouterFindFirstPrinterChangeNotification(void* hprinterrpc, uint32_t fdwfilterflags, uint32_t fdwoptions, void* hnotify, void* pprinternotifyoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallRouterFindFirstPrinterChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprinterrpc, fdwfilterflags, fdwoptions, hnotify, pprinternotifyoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprinterrpc;
    (void)fdwfilterflags;
    (void)fdwoptions;
    (void)hnotify;
    (void)pprinternotifyoptions;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_commonPropertySheetUIA(void* hwndowner, void* pfnpropsheetui, int64_t lparam, void* presult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("compstui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommonPropertySheetUIA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, pfnpropsheetui, lparam, presult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndowner;
    (void)pfnpropsheetui;
    (void)lparam;
    (void)presult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_commonPropertySheetUIW(void* hwndowner, void* pfnpropsheetui, int64_t lparam, void* presult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("compstui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommonPropertySheetUIW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, pfnpropsheetui, lparam, presult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndowner;
    (void)pfnpropsheetui;
    (void)lparam;
    (void)presult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_configurePortA(void* pname, void* hwnd, void* pportname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConfigurePortA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, hwnd, pportname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)hwnd;
    (void)pportname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_configurePortW(void* pname, void* hwnd, void* pportname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConfigurePortW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, hwnd, pportname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)hwnd;
    (void)pportname;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_printing_connectToPrinterDlg(void* hwnd, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConnectToPrinterDlg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_createPrintAsyncNotifyChannel(void* pszname, void* pnotificationtype, int32_t euserfilter, int32_t econversationstyle, void* pcallback, void* ppiasynchnotification) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePrintAsyncNotifyChannel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszname, pnotificationtype, euserfilter, econversationstyle, pcallback, ppiasynchnotification);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszname;
    (void)pnotificationtype;
    (void)euserfilter;
    (void)econversationstyle;
    (void)pcallback;
    (void)ppiasynchnotification;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deleteMonitorA(void* pname, void* penvironment, void* pmonitorname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteMonitorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, pmonitorname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pmonitorname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deleteMonitorW(void* pname, void* penvironment, void* pmonitorname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteMonitorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, pmonitorname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pmonitorname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deletePortA(void* pname, void* hwnd, void* pportname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePortA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, hwnd, pportname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)hwnd;
    (void)pportname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deletePortW(void* pname, void* hwnd, void* pportname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePortW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, hwnd, pportname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)hwnd;
    (void)pportname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deletePrintProcessorA(void* pname, void* penvironment, void* pprintprocessorname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrintProcessorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, pprintprocessorname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pprintprocessorname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deletePrintProcessorW(void* pname, void* penvironment, void* pprintprocessorname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrintProcessorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, pprintprocessorname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pprintprocessorname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deletePrintProvidorA(void* pname, void* penvironment, void* pprintprovidorname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrintProvidorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, pprintprovidorname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pprintprovidorname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deletePrintProvidorW(void* pname, void* penvironment, void* pprintprovidorname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrintProvidorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, pprintprovidorname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pprintprovidorname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deletePrinterConnectionA(void* pname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterConnectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deletePrinterConnectionW(void* pname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterConnectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deletePrinterDriverA(void* pname, void* penvironment, void* pdrivername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterDriverA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, pdrivername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pdrivername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deletePrinterDriverExA(void* pname, void* penvironment, void* pdrivername, uint32_t dwdeleteflag, uint32_t dwversionflag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterDriverExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, pdrivername, dwdeleteflag, dwversionflag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pdrivername;
    (void)dwdeleteflag;
    (void)dwversionflag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deletePrinterDriverExW(void* pname, void* penvironment, void* pdrivername, uint32_t dwdeleteflag, uint32_t dwversionflag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterDriverExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, pdrivername, dwdeleteflag, dwversionflag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pdrivername;
    (void)dwdeleteflag;
    (void)dwversionflag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageA(void* pszserver, void* pszinfpath, void* pszenvironment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterDriverPackageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszserver, pszinfpath, pszenvironment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszserver;
    (void)pszinfpath;
    (void)pszenvironment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageW(void* pszserver, void* pszinfpath, void* pszenvironment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterDriverPackageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszserver, pszinfpath, pszenvironment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszserver;
    (void)pszinfpath;
    (void)pszenvironment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deletePrinterDriverW(void* pname, void* penvironment, void* pdrivername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterDriverW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, pdrivername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)pdrivername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_deletePrinterIC(void* hprinteric) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePrinterIC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprinteric);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprinteric;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_devQueryPrintEx(void* pdqpinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DevQueryPrintEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdqpinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdqpinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_enumMonitorsA(void* pname, uint32_t level, void* pmonitor, uint32_t cbbuf, void* pcbneeded, void* pcreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumMonitorsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, level, pmonitor, cbbuf, pcbneeded, pcreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)level;
    (void)pmonitor;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_enumMonitorsW(void* pname, uint32_t level, void* pmonitor, uint32_t cbbuf, void* pcbneeded, void* pcreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumMonitorsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, level, pmonitor, cbbuf, pcbneeded, pcreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)level;
    (void)pmonitor;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_enumPortsA(void* pname, uint32_t level, void* pport, uint32_t cbbuf, void* pcbneeded, void* pcreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPortsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, level, pport, cbbuf, pcbneeded, pcreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)level;
    (void)pport;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_enumPortsW(void* pname, uint32_t level, void* pport, uint32_t cbbuf, void* pcbneeded, void* pcreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPortsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, level, pport, cbbuf, pcbneeded, pcreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)level;
    (void)pport;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesA(void* pname, void* pprintprocessorname, uint32_t level, void* pdatatypes, uint32_t cbbuf, void* pcbneeded, void* pcreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrintProcessorDatatypesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, pprintprocessorname, level, pdatatypes, cbbuf, pcbneeded, pcreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)pprintprocessorname;
    (void)level;
    (void)pdatatypes;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesW(void* pname, void* pprintprocessorname, uint32_t level, void* pdatatypes, uint32_t cbbuf, void* pcbneeded, void* pcreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrintProcessorDatatypesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, pprintprocessorname, level, pdatatypes, cbbuf, pcbneeded, pcreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)pprintprocessorname;
    (void)level;
    (void)pdatatypes;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_enumPrintProcessorsA(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrintProcessorsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, level, pprintprocessorinfo, cbbuf, pcbneeded, pcreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pprintprocessorinfo;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_enumPrintProcessorsW(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrintProcessorsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, level, pprintprocessorinfo, cbbuf, pcbneeded, pcreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pprintprocessorinfo;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_enumPrinterDriversA(void* pname, void* penvironment, uint32_t level, void* pdriverinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrinterDriversA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, level, pdriverinfo, cbbuf, pcbneeded, pcreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pdriverinfo;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_enumPrinterDriversW(void* pname, void* penvironment, uint32_t level, void* pdriverinfo, uint32_t cbbuf, void* pcbneeded, void* pcreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrinterDriversW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, level, pdriverinfo, cbbuf, pcbneeded, pcreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pdriverinfo;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_enumPrintersA(uint32_t flags, void* name, uint32_t level, void* pprinterenum, uint32_t cbbuf, void* pcbneeded, void* pcreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrintersA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, name, level, pprinterenum, cbbuf, pcbneeded, pcreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)name;
    (void)level;
    (void)pprinterenum;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_enumPrintersW(uint32_t flags, void* name, uint32_t level, void* pprinterenum, uint32_t cbbuf, void* pcbneeded, void* pcreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPrintersW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, name, level, pprinterenum, cbbuf, pcbneeded, pcreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)name;
    (void)level;
    (void)pprinterenum;
    (void)cbbuf;
    (void)pcbneeded;
    (void)pcreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_extDeviceMode(void* hwnd, void* hinst, void* pdevmodeoutput, void* pdevicename, void* pport, void* pdevmodeinput, void* pprofile, uint32_t fmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtDeviceMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hinst, pdevmodeoutput, pdevicename, pport, pdevmodeinput, pprofile, fmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hinst;
    (void)pdevmodeoutput;
    (void)pdevicename;
    (void)pport;
    (void)pdevmodeinput;
    (void)pprofile;
    (void)fmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_findClosePrinterChangeNotification(void* hchange) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindClosePrinterChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchange);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hchange;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_findNextPrinterChangeNotification(void* hchange, void* pdwchange, void* pvreserved, void* ppprinternotifyinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextPrinterChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchange, pdwchange, pvreserved, ppprinternotifyinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hchange;
    (void)pdwchange;
    (void)pvreserved;
    (void)ppprinternotifyinfo;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_graphics_printing_freePrintNamedPropertyArray(uint32_t cproperties, void* ppproperties) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreePrintNamedPropertyArray");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cproperties, ppproperties);
        return;
    }
    errno = ENOSYS;
#else
    (void)cproperties;
    (void)ppproperties;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_printing_freePrintPropertyValue(void* pvalue) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreePrintPropertyValue");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pvalue);
        return;
    }
    errno = ENOSYS;
#else
    (void)pvalue;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_freePrinterNotifyInfo(void* pprinternotifyinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreePrinterNotifyInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprinternotifyinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprinternotifyinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_gdiDeleteSpoolFileHandle(void* spoolfilehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiDeleteSpoolFileHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spoolfilehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)spoolfilehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_gdiEndDocEMF(void* spoolfilehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiEndDocEMF");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spoolfilehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)spoolfilehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_gdiEndPageEMF(void* spoolfilehandle, uint32_t dwoptimization) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiEndPageEMF");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spoolfilehandle, dwoptimization);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)spoolfilehandle;
    (void)dwoptimization;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_printing_gdiGetDC(void* spoolfilehandle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGetDC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spoolfilehandle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)spoolfilehandle;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_gdiGetDevmodeForPage(void* spoolfilehandle, uint32_t dwpagenumber, void* pcurrdm, void* plastdm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGetDevmodeForPage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spoolfilehandle, dwpagenumber, pcurrdm, plastdm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)spoolfilehandle;
    (void)dwpagenumber;
    (void)pcurrdm;
    (void)plastdm;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_printing_gdiGetPageCount(void* spoolfilehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGetPageCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spoolfilehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)spoolfilehandle;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_graphics_printing_gdiGetPageHandle(void* spoolfilehandle, uint32_t page, void* pdwpagetype) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGetPageHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spoolfilehandle, page, pdwpagetype);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)spoolfilehandle;
    (void)page;
    (void)pdwpagetype;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_printing_gdiGetSpoolFileHandle(void* pwszprintername, void* pdevmode, void* pwszdocname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiGetSpoolFileHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszprintername, pdevmode, pwszdocname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pwszprintername;
    (void)pdevmode;
    (void)pwszdocname;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_gdiPlayPageEMF(void* spoolfilehandle, void* hemf, void* prectdocument, void* prectborder, void* prectclip) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiPlayPageEMF");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spoolfilehandle, hemf, prectdocument, prectborder, prectclip);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)spoolfilehandle;
    (void)hemf;
    (void)prectdocument;
    (void)prectborder;
    (void)prectclip;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_gdiResetDCEMF(void* spoolfilehandle, void* pcurrdm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiResetDCEMF");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spoolfilehandle, pcurrdm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)spoolfilehandle;
    (void)pcurrdm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_gdiStartDocEMF(void* spoolfilehandle, void* pdocinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiStartDocEMF");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spoolfilehandle, pdocinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)spoolfilehandle;
    (void)pdocinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_gdiStartPageEMF(void* spoolfilehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiStartPageEMF");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(spoolfilehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)spoolfilehandle;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_printing_generateCopyFilePaths(void* pszprintername, void* pszdirectory, void* psplclientinfo, uint32_t dwlevel, void* pszsourcedir, void* pcchsourcedirsize, void* psztargetdir, void* pcchtargetdirsize, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GenerateCopyFilePaths");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprintername, pszdirectory, psplclientinfo, dwlevel, pszsourcedir, pcchsourcedirsize, psztargetdir, pcchtargetdirsize, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszprintername;
    (void)pszdirectory;
    (void)psplclientinfo;
    (void)dwlevel;
    (void)pszsourcedir;
    (void)pcchsourcedirsize;
    (void)psztargetdir;
    (void)pcchtargetdirsize;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_graphics_printing_getCPSUIUserData(void* hdlg) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("compstui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCPSUIUserData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdlg;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_getCorePrinterDriversA(void* pszserver, void* pszenvironment, void* pszzcoredriverdependencies, uint32_t ccoreprinterdrivers, void* pcoreprinterdrivers) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCorePrinterDriversA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszserver, pszenvironment, pszzcoredriverdependencies, ccoreprinterdrivers, pcoreprinterdrivers);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszserver;
    (void)pszenvironment;
    (void)pszzcoredriverdependencies;
    (void)ccoreprinterdrivers;
    (void)pcoreprinterdrivers;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_getCorePrinterDriversW(void* pszserver, void* pszenvironment, void* pszzcoredriverdependencies, uint32_t ccoreprinterdrivers, void* pcoreprinterdrivers) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCorePrinterDriversW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszserver, pszenvironment, pszzcoredriverdependencies, ccoreprinterdrivers, pcoreprinterdrivers);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszserver;
    (void)pszenvironment;
    (void)pszzcoredriverdependencies;
    (void)ccoreprinterdrivers;
    (void)pcoreprinterdrivers;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_getDefaultPrinterA(void* pszbuffer, void* pcchbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDefaultPrinterA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszbuffer, pcchbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszbuffer;
    (void)pcchbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_getDefaultPrinterW(void* pszbuffer, void* pcchbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDefaultPrinterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszbuffer, pcchbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszbuffer;
    (void)pcchbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_getJobAttributes(void* pprintername, void* pdevmode, void* pattributeinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetJobAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprintername, pdevmode, pattributeinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprintername;
    (void)pdevmode;
    (void)pattributeinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_getJobAttributesEx(void* pprintername, void* pdevmode, uint32_t dwlevel, void* pattributeinfo, uint32_t nsize, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetJobAttributesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprintername, pdevmode, dwlevel, pattributeinfo, nsize, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprintername;
    (void)pdevmode;
    (void)dwlevel;
    (void)pattributeinfo;
    (void)nsize;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_getPrintExecutionData(void* pdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrintExecutionData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_getPrintOutputInfo(void* hwnd, void* pszprinter, void* phfile, void* ppszoutputfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrintOutputInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszprinter, phfile, ppszoutputfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszprinter;
    (void)phfile;
    (void)ppszoutputfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryA(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrintProcessorDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, level, pprintprocessorinfo, cbbuf, pcbneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pprintprocessorinfo;
    (void)cbbuf;
    (void)pcbneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryW(void* pname, void* penvironment, uint32_t level, void* pprintprocessorinfo, uint32_t cbbuf, void* pcbneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrintProcessorDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, level, pprintprocessorinfo, cbbuf, pcbneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pprintprocessorinfo;
    (void)cbbuf;
    (void)pcbneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryA(void* pname, void* penvironment, uint32_t level, void* pdriverdirectory, uint32_t cbbuf, void* pcbneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrinterDriverDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, level, pdriverdirectory, cbbuf, pcbneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pdriverdirectory;
    (void)cbbuf;
    (void)pcbneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryW(void* pname, void* penvironment, uint32_t level, void* pdriverdirectory, uint32_t cbbuf, void* pcbneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrinterDriverDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, penvironment, level, pdriverdirectory, cbbuf, pcbneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)penvironment;
    (void)level;
    (void)pdriverdirectory;
    (void)cbbuf;
    (void)pcbneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathA(void* pszserver, void* pszenvironment, void* pszlanguage, void* pszpackageid, void* pszdriverpackagecab, uint32_t cchdriverpackagecab, void* pcchrequiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrinterDriverPackagePathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszserver, pszenvironment, pszlanguage, pszpackageid, pszdriverpackagecab, cchdriverpackagecab, pcchrequiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszserver;
    (void)pszenvironment;
    (void)pszlanguage;
    (void)pszpackageid;
    (void)pszdriverpackagecab;
    (void)cchdriverpackagecab;
    (void)pcchrequiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathW(void* pszserver, void* pszenvironment, void* pszlanguage, void* pszpackageid, void* pszdriverpackagecab, uint32_t cchdriverpackagecab, void* pcchrequiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrinterDriverPackagePathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszserver, pszenvironment, pszlanguage, pszpackageid, pszdriverpackagecab, cchdriverpackagecab, pcchrequiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszserver;
    (void)pszenvironment;
    (void)pszlanguage;
    (void)pszpackageid;
    (void)pszdriverpackagecab;
    (void)cchdriverpackagecab;
    (void)pcchrequiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_impersonatePrinterClient(void* htoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonatePrinterClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htoken;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageA(void* pszserver, void* pszinfpath, void* pszdrivername, void* pszenvironment, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallPrinterDriverFromPackageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszserver, pszinfpath, pszdrivername, pszenvironment, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszserver;
    (void)pszinfpath;
    (void)pszdrivername;
    (void)pszenvironment;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageW(void* pszserver, void* pszinfpath, void* pszdrivername, void* pszenvironment, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallPrinterDriverFromPackageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszserver, pszinfpath, pszdrivername, pszenvironment, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszserver;
    (void)pszinfpath;
    (void)pszdrivername;
    (void)pszenvironment;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_isValidDevmodeA(void* pdevmode, uint64_t devmodesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidDevmodeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdevmode, devmodesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdevmode;
    (void)devmodesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_isValidDevmodeW(void* pdevmode, uint64_t devmodesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidDevmodeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdevmode, devmodesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdevmode;
    (void)devmodesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_openPrinter2A(void* pprintername, void* phprinter, void* pdefault, void* poptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPrinter2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprintername, phprinter, pdefault, poptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprintername;
    (void)phprinter;
    (void)pdefault;
    (void)poptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_openPrinter2W(void* pprintername, void* phprinter, void* pdefault, void* poptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPrinter2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprintername, phprinter, pdefault, poptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprintername;
    (void)phprinter;
    (void)pdefault;
    (void)poptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_openPrinterA(void* pprintername, void* phprinter, void* pdefault) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPrinterA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprintername, phprinter, pdefault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprintername;
    (void)phprinter;
    (void)pdefault;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_openPrinterW(void* pprintername, void* phprinter, void* pdefault) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPrinterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprintername, phprinter, pdefault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprintername;
    (void)phprinter;
    (void)pdefault;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_playGdiScriptOnPrinterIC(void* hprinteric, void* pin, uint32_t cin, void* pout, uint32_t cout, uint32_t ul) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlayGdiScriptOnPrinterIC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprinteric, pin, cin, pout, cout, ul);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprinteric;
    (void)pin;
    (void)cin;
    (void)pout;
    (void)cout;
    (void)ul;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_registerForPrintAsyncNotifications(void* pszname, void* pnotificationtype, int32_t euserfilter, int32_t econversationstyle, void* pcallback, void* phnotify) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterForPrintAsyncNotifications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszname, pnotificationtype, euserfilter, econversationstyle, pcallback, phnotify);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszname;
    (void)pnotificationtype;
    (void)euserfilter;
    (void)econversationstyle;
    (void)pcallback;
    (void)phnotify;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_removePrintDeviceObject(void* hdeviceobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePrintDeviceObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdeviceobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdeviceobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_replyPrinterChangeNotificationEx(void* hnotify, uint32_t dwcolor, uint32_t fdwflags, void* pdwresult, void* pprinternotifyinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReplyPrinterChangeNotificationEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnotify, dwcolor, fdwflags, pdwresult, pprinternotifyinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnotify;
    (void)dwcolor;
    (void)fdwflags;
    (void)pdwresult;
    (void)pprinternotifyinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_reportJobProcessingProgress(void* printerhandle, uint32_t jobid, int32_t joboperation, int32_t jobprogress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportJobProcessingProgress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(printerhandle, jobid, joboperation, jobprogress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)printerhandle;
    (void)jobid;
    (void)joboperation;
    (void)jobprogress;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_printing_revertToPrinterSelf(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevertToPrinterSelf");
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

void* windowssys_windows_win32_graphics_printing_routerAllocBidiMem(uint64_t numbytes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterAllocBidiMem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numbytes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)numbytes;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_printing_routerAllocBidiResponseContainer(uint32_t count) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterAllocBidiResponseContainer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(count);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)count;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_printing_routerAllocPrinterNotifyInfo(uint32_t cprinternotifyinfodata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterAllocPrinterNotifyInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cprinternotifyinfodata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cprinternotifyinfodata;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_graphics_printing_routerFreeBidiMem(void* pmempointer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterFreeBidiMem");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pmempointer);
        return;
    }
    errno = ENOSYS;
#else
    (void)pmempointer;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_graphics_printing_routerFreeBidiResponseContainer(void* pdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterFreeBidiResponseContainer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdata;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_routerFreePrinterNotifyInfo(void* pinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterFreePrinterNotifyInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_setCPSUIUserData(void* hdlg, uint64_t cpsuiuserdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("compstui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCPSUIUserData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, cpsuiuserdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)cpsuiuserdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_setDefaultPrinterA(void* pszprinter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDefaultPrinterA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprinter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprinter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_setDefaultPrinterW(void* pszprinter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDefaultPrinterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprinter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprinter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_setPortA(void* pname, void* pportname, uint32_t dwlevel, void* pportinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPortA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, pportname, dwlevel, pportinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)pportname;
    (void)dwlevel;
    (void)pportinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_setPortW(void* pname, void* pportname, uint32_t dwlevel, void* pportinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPortW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, pportname, dwlevel, pportinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)pportname;
    (void)dwlevel;
    (void)pportinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_spoolerCopyFileEvent(void* pszprintername, void* pszkey, uint32_t dwcopyfileevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SpoolerCopyFileEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprintername, pszkey, dwcopyfileevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprintername;
    (void)pszkey;
    (void)dwcopyfileevent;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_graphics_printing_spoolerFreePrinterNotifyInfo(void* pinfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("spoolss.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SpoolerFreePrinterNotifyInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pinfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)pinfo;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_unRegisterForPrintAsyncNotifications(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnRegisterForPrintAsyncNotifications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageA(void* pszserver, void* pszinfpath, void* pszenvironment, uint32_t dwflags, void* hwnd, void* pszdestinfpath, void* pcchdestinfpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UploadPrinterDriverPackageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszserver, pszinfpath, pszenvironment, dwflags, hwnd, pszdestinfpath, pcchdestinfpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszserver;
    (void)pszinfpath;
    (void)pszenvironment;
    (void)dwflags;
    (void)hwnd;
    (void)pszdestinfpath;
    (void)pcchdestinfpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageW(void* pszserver, void* pszinfpath, void* pszenvironment, uint32_t dwflags, void* hwnd, void* pszdestinfpath, void* pcchdestinfpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UploadPrinterDriverPackageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszserver, pszinfpath, pszenvironment, dwflags, hwnd, pszdestinfpath, pcchdestinfpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszserver;
    (void)pszinfpath;
    (void)pszenvironment;
    (void)dwflags;
    (void)hwnd;
    (void)pszdestinfpath;
    (void)pcchdestinfpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_xcvDataW(void* hxcv, void* pszdataname, void* pinputdata, uint32_t cbinputdata, void* poutputdata, uint32_t cboutputdata, void* pcboutputneeded, void* pdwstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winspool.drv");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "XcvDataW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hxcv, pszdataname, pinputdata, cbinputdata, poutputdata, cboutputdata, pcboutputneeded, pdwstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hxcv;
    (void)pszdataname;
    (void)pinputdata;
    (void)cbinputdata;
    (void)poutputdata;
    (void)cboutputdata;
    (void)pcboutputneeded;
    (void)pdwstatus;
    errno = ENOSYS;
    return -1;
#endif
}

