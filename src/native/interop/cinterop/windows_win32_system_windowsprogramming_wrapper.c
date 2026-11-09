#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_windowsprogramming_wrapper.h"
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

int32_t windowssys_windows_win32_system_windowsprogramming_AddDelBackupEntryA(void* lpcszfilelist, void* lpcszbackupdir, void* lpcszbasename, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddDelBackupEntryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcszfilelist, lpcszbackupdir, lpcszbasename, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcszfilelist;
    (void)lpcszbackupdir;
    (void)lpcszbasename;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_AddDelBackupEntryW(void* lpcszfilelist, void* lpcszbackupdir, void* lpcszbasename, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddDelBackupEntryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcszfilelist, lpcszbackupdir, lpcszbasename, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcszfilelist;
    (void)lpcszbackupdir;
    (void)lpcszbasename;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_AdvInstallFileA(void* hwnd, void* lpszsourcedir, void* lpszsourcefile, void* lpszdestdir, void* lpszdestfile, uint32_t dwflags, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdvInstallFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpszsourcedir, lpszsourcefile, lpszdestdir, lpszdestfile, dwflags, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpszsourcedir;
    (void)lpszsourcefile;
    (void)lpszdestdir;
    (void)lpszdestfile;
    (void)dwflags;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_AdvInstallFileW(void* hwnd, void* lpszsourcedir, void* lpszsourcefile, void* lpszdestdir, void* lpszdestfile, uint32_t dwflags, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdvInstallFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpszsourcedir, lpszsourcefile, lpszdestdir, lpszdestfile, dwflags, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpszsourcedir;
    (void)lpszsourcefile;
    (void)lpszdestdir;
    (void)lpszdestfile;
    (void)dwflags;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_ApphelpCheckShellObject(void* objectclsid, int32_t bshimifnecessary, void* pullflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("apphelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApphelpCheckShellObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectclsid, bshimifnecessary, pullflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectclsid;
    (void)bshimifnecessary;
    (void)pullflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_CancelDeviceWakeupRequest(void* hdevice) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelDeviceWakeupRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdevice;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_CloseINFEngine(void* hinf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseINFEngine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_ConvertAuxiliaryCounterToPerformanceCounter(uint64_t ullauxiliarycountervalue, void* lpperformancecountervalue, void* lpconversionerror) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-realtime-l1-1-2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertAuxiliaryCounterToPerformanceCounter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ullauxiliarycountervalue, lpperformancecountervalue, lpconversionerror);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ullauxiliarycountervalue;
    (void)lpperformancecountervalue;
    (void)lpconversionerror;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_ConvertPerformanceCounterToAuxiliaryCounter(uint64_t ullperformancecountervalue, void* lpauxiliarycountervalue, void* lpconversionerror) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-realtime-l1-1-2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertPerformanceCounterToAuxiliaryCounter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ullperformancecountervalue, lpauxiliarycountervalue, lpconversionerror);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ullperformancecountervalue;
    (void)lpauxiliarycountervalue;
    (void)lpconversionerror;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_DCIBeginAccess(void* pdci, int32_t x, int32_t y, int32_t dx, int32_t dy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCIBeginAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdci, x, y, dx, dy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdci;
    (void)x;
    (void)y;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_DCICloseProvider(void* hdc) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCICloseProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hdc);
        return;
    }
    errno = ENOSYS;
#else
    (void)hdc;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_DCICreateOffscreen(void* hdc, uint32_t dwcompression, uint32_t dwredmask, uint32_t dwgreenmask, uint32_t dwbluemask, uint32_t dwwidth, uint32_t dwheight, uint32_t dwdcicaps, uint32_t dwbitcount, void* lplpsurface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCICreateOffscreen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, dwcompression, dwredmask, dwgreenmask, dwbluemask, dwwidth, dwheight, dwdcicaps, dwbitcount, lplpsurface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)dwcompression;
    (void)dwredmask;
    (void)dwgreenmask;
    (void)dwbluemask;
    (void)dwwidth;
    (void)dwheight;
    (void)dwdcicaps;
    (void)dwbitcount;
    (void)lplpsurface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_DCICreateOverlay(void* hdc, void* lpoffscreensurf, void* lplpsurface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCICreateOverlay");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpoffscreensurf, lplpsurface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpoffscreensurf;
    (void)lplpsurface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_DCICreatePrimary(void* hdc, void* lplpsurface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCICreatePrimary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lplpsurface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lplpsurface;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_DCIDestroy(void* pdci) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCIDestroy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pdci);
        return;
    }
    errno = ENOSYS;
#else
    (void)pdci;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_DCIDraw(void* pdci) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCIDraw");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdci);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdci;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_DCIEndAccess(void* pdci) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCIEndAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pdci);
        return;
    }
    errno = ENOSYS;
#else
    (void)pdci;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_DCIEnum(void* hdc, void* lprdst, void* lprsrc, void* lpfncallback, void* lpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCIEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lprdst, lprsrc, lpfncallback, lpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lprdst;
    (void)lprsrc;
    (void)lpfncallback;
    (void)lpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_windowsprogramming_DCIOpenProvider(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCIOpenProvider");
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

int32_t windowssys_windows_win32_system_windowsprogramming_DCISetClipList(void* pdci, void* prd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCISetClipList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdci, prd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdci;
    (void)prd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_DCISetDestination(void* pdci, void* dst, void* src) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCISetDestination");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdci, dst, src);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdci;
    (void)dst;
    (void)src;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_DCISetSrcDestClip(void* pdci, void* srcrc, void* destrc, void* prd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DCISetSrcDestClip");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdci, srcrc, destrc, prd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdci;
    (void)srcrc;
    (void)destrc;
    (void)prd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_DelNodeA(void* pszfileordirname, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DelNodeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfileordirname, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfileordirname;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_DelNodeRunDLL32W(void* hwnd, void* hinstance, void* pszparms, int32_t nshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DelNodeRunDLL32W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hinstance, pszparms, nshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hinstance;
    (void)pszparms;
    (void)nshow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_DelNodeW(void* pszfileordirname, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DelNodeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfileordirname, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszfileordirname;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_DnsHostnameToComputerNameA(void* hostname, void* computername, void* nsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsHostnameToComputerNameA");
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

int32_t windowssys_windows_win32_system_windowsprogramming_DnsHostnameToComputerNameW(void* hostname, void* computername, void* nsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsHostnameToComputerNameW");
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

int32_t windowssys_windows_win32_system_windowsprogramming_DosDateTimeToFileTime(uint16_t wfatdate, uint16_t wfattime, void* lpfiletime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DosDateTimeToFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wfatdate, wfattime, lpfiletime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wfatdate;
    (void)wfattime;
    (void)lpfiletime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_EnableProcessOptionalXStateFeatures(uint64_t features) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableProcessOptionalXStateFeatures");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(features);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)features;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_ExecuteCabA(void* hwnd, void* pcab, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExecuteCabA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pcab, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pcab;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_ExecuteCabW(void* hwnd, void* pcab, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExecuteCabW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pcab, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pcab;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_ExtractFilesA(void* pszcabname, void* pszexpanddir, uint32_t dwflags, void* pszfilelist, void* lpreserved, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractFilesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszcabname, pszexpanddir, dwflags, pszfilelist, lpreserved, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszcabname;
    (void)pszexpanddir;
    (void)dwflags;
    (void)pszfilelist;
    (void)lpreserved;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_ExtractFilesW(void* pszcabname, void* pszexpanddir, uint32_t dwflags, void* pszfilelist, void* lpreserved, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractFilesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszcabname, pszexpanddir, dwflags, pszfilelist, lpreserved, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszcabname;
    (void)pszexpanddir;
    (void)dwflags;
    (void)pszfilelist;
    (void)lpreserved;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_FileSaveMarkNotExistA(void* lpfilelist, void* lpdir, void* lpbasename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileSaveMarkNotExistA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilelist, lpdir, lpbasename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilelist;
    (void)lpdir;
    (void)lpbasename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_FileSaveMarkNotExistW(void* lpfilelist, void* lpdir, void* lpbasename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileSaveMarkNotExistW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilelist, lpdir, lpbasename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilelist;
    (void)lpdir;
    (void)lpbasename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_FileSaveRestoreOnINFA(void* hwnd, void* psztitle, void* pszinf, void* pszsection, void* pszbackupdir, void* pszbasebackupfile, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileSaveRestoreOnINFA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, psztitle, pszinf, pszsection, pszbackupdir, pszbasebackupfile, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)psztitle;
    (void)pszinf;
    (void)pszsection;
    (void)pszbackupdir;
    (void)pszbasebackupfile;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_FileSaveRestoreOnINFW(void* hwnd, void* psztitle, void* pszinf, void* pszsection, void* pszbackupdir, void* pszbasebackupfile, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileSaveRestoreOnINFW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, psztitle, pszinf, pszsection, pszbackupdir, pszbasebackupfile, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)psztitle;
    (void)pszinf;
    (void)pszsection;
    (void)pszbackupdir;
    (void)pszbasebackupfile;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_FileSaveRestoreW(void* hdlg, void* lpfilelist, void* lpdir, void* lpbasename, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileSaveRestoreW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, lpfilelist, lpdir, lpbasename, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)lpfilelist;
    (void)lpdir;
    (void)lpbasename;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_FileTimeToDosDateTime(void* lpfiletime, void* lpfatdate, void* lpfattime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileTimeToDosDateTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfiletime, lpfatdate, lpfattime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfiletime;
    (void)lpfatdate;
    (void)lpfattime;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GdiEntry13(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-dx-d3dkmt-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiEntry13");
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

int32_t windowssys_windows_win32_system_windowsprogramming_GetComputerNameA(void* lpbuffer, void* nsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer, nsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_GetComputerNameW(void* lpbuffer, void* nsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer, nsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_GetCurrentHwProfileA(void* lphwprofileinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentHwProfileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lphwprofileinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lphwprofileinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_GetCurrentHwProfileW(void* lphwprofileinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentHwProfileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lphwprofileinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lphwprofileinfo;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetDCRegionData(void* hdc, uint32_t size, void* prd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDCRegionData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, size, prd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdc;
    (void)size;
    (void)prd;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_GetFeatureEnabledState(uint32_t featureid, int32_t changetime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-featurestaging-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFeatureEnabledState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(featureid, changetime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)featureid;
    (void)changetime;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetFeatureVariant(uint32_t featureid, int32_t changetime, void* payloadid, void* hasnotification) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-featurestaging-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFeatureVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(featureid, changetime, payloadid, hasnotification);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)featureid;
    (void)changetime;
    (void)payloadid;
    (void)hasnotification;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableA(void* lpname, void* lpguid, void* pbuffer, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFirmwareEnvironmentVariableA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpguid, pbuffer, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)lpguid;
    (void)pbuffer;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableExA(void* lpname, void* lpguid, void* pbuffer, uint32_t nsize, void* pdwattribubutes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFirmwareEnvironmentVariableExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpguid, pbuffer, nsize, pdwattribubutes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)lpguid;
    (void)pbuffer;
    (void)nsize;
    (void)pdwattribubutes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableExW(void* lpname, void* lpguid, void* pbuffer, uint32_t nsize, void* pdwattribubutes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFirmwareEnvironmentVariableExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpguid, pbuffer, nsize, pdwattribubutes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)lpguid;
    (void)pbuffer;
    (void)nsize;
    (void)pdwattribubutes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableW(void* lpname, void* lpguid, void* pbuffer, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFirmwareEnvironmentVariableW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpguid, pbuffer, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)lpguid;
    (void)pbuffer;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileIntA(void* lpappname, void* lpkeyname, int32_t ndefault, void* lpfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileIntA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpkeyname, ndefault, lpfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)ndefault;
    (void)lpfilename;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileIntW(void* lpappname, void* lpkeyname, int32_t ndefault, void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileIntW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpkeyname, ndefault, lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)ndefault;
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionA(void* lpappname, void* lpreturnedstring, uint32_t nsize, void* lpfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileSectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpreturnedstring, nsize, lpfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpappname;
    (void)lpreturnedstring;
    (void)nsize;
    (void)lpfilename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionNamesA(void* lpszreturnbuffer, uint32_t nsize, void* lpfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileSectionNamesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszreturnbuffer, nsize, lpfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszreturnbuffer;
    (void)nsize;
    (void)lpfilename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionNamesW(void* lpszreturnbuffer, uint32_t nsize, void* lpfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileSectionNamesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszreturnbuffer, nsize, lpfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszreturnbuffer;
    (void)nsize;
    (void)lpfilename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionW(void* lpappname, void* lpreturnedstring, uint32_t nsize, void* lpfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileSectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpreturnedstring, nsize, lpfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpappname;
    (void)lpreturnedstring;
    (void)nsize;
    (void)lpfilename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStringA(void* lpappname, void* lpkeyname, void* lpdefault, void* lpreturnedstring, uint32_t nsize, void* lpfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpkeyname, lpdefault, lpreturnedstring, nsize, lpfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpdefault;
    (void)lpreturnedstring;
    (void)nsize;
    (void)lpfilename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStringW(void* lpappname, void* lpkeyname, void* lpdefault, void* lpreturnedstring, uint32_t nsize, void* lpfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpkeyname, lpdefault, lpreturnedstring, nsize, lpfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpdefault;
    (void)lpreturnedstring;
    (void)nsize;
    (void)lpfilename;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStructA(void* lpszsection, void* lpszkey, void* lpstruct, uint32_t usizestruct, void* szfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileStructA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszsection, lpszkey, lpstruct, usizestruct, szfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszsection;
    (void)lpszkey;
    (void)lpstruct;
    (void)usizestruct;
    (void)szfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStructW(void* lpszsection, void* lpszkey, void* lpstruct, uint32_t usizestruct, void* szfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateProfileStructW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszsection, lpszkey, lpstruct, usizestruct, szfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszsection;
    (void)lpszkey;
    (void)lpstruct;
    (void)usizestruct;
    (void)szfile;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetProfileIntA(void* lpappname, void* lpkeyname, int32_t ndefault) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfileIntA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpkeyname, ndefault);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)ndefault;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetProfileIntW(void* lpappname, void* lpkeyname, int32_t ndefault) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfileIntW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpkeyname, ndefault);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)ndefault;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetProfileSectionA(void* lpappname, void* lpreturnedstring, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfileSectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpreturnedstring, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpappname;
    (void)lpreturnedstring;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetProfileSectionW(void* lpappname, void* lpreturnedstring, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfileSectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpreturnedstring, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpappname;
    (void)lpreturnedstring;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetProfileStringA(void* lpappname, void* lpkeyname, void* lpdefault, void* lpreturnedstring, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfileStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpkeyname, lpdefault, lpreturnedstring, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpdefault;
    (void)lpreturnedstring;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetProfileStringW(void* lpappname, void* lpkeyname, void* lpdefault, void* lpreturnedstring, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfileStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpkeyname, lpdefault, lpreturnedstring, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpdefault;
    (void)lpreturnedstring;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_GetSystemRegistryQuota(void* pdwquotaallowed, void* pdwquotaused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemRegistryQuota");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdwquotaallowed, pdwquotaused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdwquotaallowed;
    (void)pdwquotaused;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_system_windowsprogramming_GetThreadEnabledXStateFeatures(void) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadEnabledXStateFeatures");
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

int32_t windowssys_windows_win32_system_windowsprogramming_GetUserNameA(void* lpbuffer, void* pcbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer, pcbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpbuffer;
    (void)pcbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_GetUserNameW(void* lpbuffer, void* pcbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbuffer, pcbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpbuffer;
    (void)pcbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileA(void* lpszfilename, void* pdwmsver, void* pdwlsver, int32_t bversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionFromFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfilename, pdwmsver, pdwlsver, bversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszfilename;
    (void)pdwmsver;
    (void)pdwlsver;
    (void)bversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileExA(void* lpszfilename, void* pdwmsver, void* pdwlsver, int32_t bversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionFromFileExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfilename, pdwmsver, pdwlsver, bversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszfilename;
    (void)pdwmsver;
    (void)pdwlsver;
    (void)bversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileExW(void* lpszfilename, void* pdwmsver, void* pdwlsver, int32_t bversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionFromFileExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfilename, pdwmsver, pdwlsver, bversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszfilename;
    (void)pdwmsver;
    (void)pdwlsver;
    (void)bversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileW(void* lpszfilename, void* pdwmsver, void* pdwlsver, int32_t bversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionFromFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfilename, pdwmsver, pdwlsver, bversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszfilename;
    (void)pdwmsver;
    (void)pdwlsver;
    (void)bversion;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_GetWindowRegionData(void* hwnd, uint32_t size, void* prd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowRegionData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, size, prd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)size;
    (void)prd;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_system_windowsprogramming_GlobalCompact(uint32_t dwminfree) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalCompact");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwminfree);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwminfree;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_GlobalFix(void* hmem) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalFix");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hmem);
        return;
    }
    errno = ENOSYS;
#else
    (void)hmem;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_GlobalUnWire(void* hmem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalUnWire");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmem;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_GlobalUnfix(void* hmem) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalUnfix");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hmem);
        return;
    }
    errno = ENOSYS;
#else
    (void)hmem;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_system_windowsprogramming_GlobalWire(void* hmem) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalWire");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmem);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hmem;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_IMPGetIMEA(void* param0, void* param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IMPGetIMEA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_IMPGetIMEW(void* param0, void* param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IMPGetIMEW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_IMPQueryIMEA(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IMPQueryIMEA");
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

int32_t windowssys_windows_win32_system_windowsprogramming_IMPQueryIMEW(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IMPQueryIMEW");
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

int32_t windowssys_windows_win32_system_windowsprogramming_IMPSetIMEA(void* param0, void* param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IMPSetIMEA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_IMPSetIMEW(void* param0, void* param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IMPSetIMEW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_IsApiSetImplemented(void* contract) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-apiquery-l2-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsApiSetImplemented");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(contract);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)contract;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_IsBadHugeReadPtr(void* lp, uint64_t ucb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsBadHugeReadPtr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lp, ucb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lp;
    (void)ucb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_IsBadHugeWritePtr(void* lp, uint64_t ucb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsBadHugeWritePtr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lp, ucb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lp;
    (void)ucb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_IsNTAdmin(uint32_t dwreserved, void* lpdwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsNTAdmin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwreserved, lpdwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwreserved;
    (void)lpdwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_IsNativeVhdBoot(void* nativevhdboot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsNativeVhdBoot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nativevhdboot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nativevhdboot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_IsTokenUntrusted(void* tokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsTokenUntrusted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_LaunchINFSectionExW(void* hwnd, void* hinstance, void* pszparms, int32_t nshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LaunchINFSectionExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hinstance, pszparms, nshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hinstance;
    (void)pszparms;
    (void)nshow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_LaunchINFSectionW(void* hwndowner, void* hinstance, void* pszparams, int32_t nshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LaunchINFSectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, hinstance, pszparams, nshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndowner;
    (void)hinstance;
    (void)pszparams;
    (void)nshow;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_system_windowsprogramming_LocalCompact(uint32_t uminfree) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalCompact");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uminfree);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uminfree;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_system_windowsprogramming_LocalShrink(void* hmem, uint32_t cbnewsize) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalShrink");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmem, cbnewsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmem;
    (void)cbnewsize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_MulDiv(int32_t nnumber, int32_t nnumerator, int32_t ndenominator) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MulDiv");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nnumber, nnumerator, ndenominator);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nnumber;
    (void)nnumerator;
    (void)ndenominator;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_NeedReboot(uint32_t dwrebootcheck) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NeedReboot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwrebootcheck);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwrebootcheck;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_NeedRebootInit(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NeedRebootInit");
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

int32_t windowssys_windows_win32_system_windowsprogramming_OpenINFEngineA(void* pszinffilename, void* pszinstallsection, uint32_t dwflags, void* phinf, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenINFEngineA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszinffilename, pszinstallsection, dwflags, phinf, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszinffilename;
    (void)pszinstallsection;
    (void)dwflags;
    (void)phinf;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_OpenINFEngineW(void* pszinffilename, void* pszinstallsection, uint32_t dwflags, void* phinf, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenINFEngineW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszinffilename, pszinstallsection, dwflags, phinf, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszinffilename;
    (void)pszinstallsection;
    (void)dwflags;
    (void)phinf;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_windowsprogramming_OpenMutexA(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenMutexA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, binherithandle, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_windowsprogramming_OpenSemaphoreA(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenSemaphoreA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, binherithandle, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_QueryAuxiliaryCounterFrequency(void* lpauxiliarycounterfrequency) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-realtime-l1-1-2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryAuxiliaryCounterFrequency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpauxiliarycounterfrequency);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpauxiliarycounterfrequency;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_QueryIdleProcessorCycleTime(void* bufferlength, void* processoridlecycletime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryIdleProcessorCycleTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bufferlength, processoridlecycletime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bufferlength;
    (void)processoridlecycletime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_QueryIdleProcessorCycleTimeEx(uint16_t group, void* bufferlength, void* processoridlecycletime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryIdleProcessorCycleTimeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(group, bufferlength, processoridlecycletime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)group;
    (void)bufferlength;
    (void)processoridlecycletime;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_QueryInterruptTime(void* lpinterrupttime) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-realtime-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryInterruptTime");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpinterrupttime);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpinterrupttime;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_QueryInterruptTimePrecise(void* lpinterrupttimeprecise) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-realtime-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryInterruptTimePrecise");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpinterrupttimeprecise);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpinterrupttimeprecise;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_QueryProcessCycleTime(void* processhandle, void* cycletime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryProcessCycleTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, cycletime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)cycletime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_QueryThreadCycleTime(void* threadhandle, void* cycletime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryThreadCycleTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle, cycletime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadhandle;
    (void)cycletime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_QueryUnbiasedInterruptTime(void* unbiasedtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryUnbiasedInterruptTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unbiasedtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)unbiasedtime;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_QueryUnbiasedInterruptTimePrecise(void* lpunbiasedinterrupttimeprecise) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-realtime-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryUnbiasedInterruptTimePrecise");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpunbiasedinterrupttimeprecise);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpunbiasedinterrupttimeprecise;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_RaiseCustomSystemEventTrigger(void* customsystemeventtriggerconfig) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-backgroundtask-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RaiseCustomSystemEventTrigger");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customsystemeventtriggerconfig);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)customsystemeventtriggerconfig;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RebootCheckOnInstallA(void* hwnd, void* pszinf, void* pszsec, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RebootCheckOnInstallA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszinf, pszsec, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszinf;
    (void)pszsec;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RebootCheckOnInstallW(void* hwnd, void* pszinf, void* pszsec, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RebootCheckOnInstallW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszinf, pszsec, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pszinf;
    (void)pszsec;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_RecordFeatureError(uint32_t featureid, void* error) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-featurestaging-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RecordFeatureError");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(featureid, error);
        return;
    }
    errno = ENOSYS;
#else
    (void)featureid;
    (void)error;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_RecordFeatureUsage(uint32_t featureid, uint32_t kind, uint32_t addend, void* originname) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-featurestaging-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RecordFeatureUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(featureid, kind, addend, originname);
        return;
    }
    errno = ENOSYS;
#else
    (void)featureid;
    (void)kind;
    (void)addend;
    (void)originname;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RegInstallA(void* hmod, void* pszsection, void* psttable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegInstallA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmod, pszsection, psttable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmod;
    (void)pszsection;
    (void)psttable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RegInstallW(void* hmod, void* pszsection, void* psttable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegInstallW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmod, pszsection, psttable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmod;
    (void)pszsection;
    (void)psttable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RegRestoreAllA(void* hwnd, void* psztitlestring, void* hkbckupkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegRestoreAllA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, psztitlestring, hkbckupkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)psztitlestring;
    (void)hkbckupkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RegRestoreAllW(void* hwnd, void* psztitlestring, void* hkbckupkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegRestoreAllW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, psztitlestring, hkbckupkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)psztitlestring;
    (void)hkbckupkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreA(void* hwnd, void* psztitlestring, void* hkbckupkey, void* pcszrootkey, void* pcszsubkey, void* pcszvaluename, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveRestoreA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, psztitlestring, hkbckupkey, pcszrootkey, pcszsubkey, pcszvaluename, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)psztitlestring;
    (void)hkbckupkey;
    (void)pcszrootkey;
    (void)pcszsubkey;
    (void)pcszvaluename;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreOnINFA(void* hwnd, void* psztitle, void* pszinf, void* pszsection, void* hhklmbackkey, void* hhkcubackkey, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveRestoreOnINFA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, psztitle, pszinf, pszsection, hhklmbackkey, hhkcubackkey, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)psztitle;
    (void)pszinf;
    (void)pszsection;
    (void)hhklmbackkey;
    (void)hhkcubackkey;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreOnINFW(void* hwnd, void* psztitle, void* pszinf, void* pszsection, void* hhklmbackkey, void* hhkcubackkey, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveRestoreOnINFW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, psztitle, pszinf, pszsection, hhklmbackkey, hhkcubackkey, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)psztitle;
    (void)pszinf;
    (void)pszsection;
    (void)hhklmbackkey;
    (void)hhkcubackkey;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreW(void* hwnd, void* psztitlestring, void* hkbckupkey, void* pcszrootkey, void* pcszsubkey, void* pcszvaluename, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveRestoreW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, psztitlestring, hkbckupkey, pcszrootkey, pcszsubkey, pcszvaluename, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)psztitlestring;
    (void)hkbckupkey;
    (void)pcszrootkey;
    (void)pcszsubkey;
    (void)pcszvaluename;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_ReplacePartitionUnit(void* targetpartition, void* sparepartition, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReplacePartitionUnit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetpartition, sparepartition, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetpartition;
    (void)sparepartition;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RequestDeviceWakeup(void* hdevice) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RequestDeviceWakeup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdevice;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RtlAnsiStringToUnicodeString(void* destinationstring, void* sourcestring, bool allocatedestinationstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAnsiStringToUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RtlCharToInteger(void* string, uint32_t base, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCharToInteger");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string, base, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string;
    (void)base;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_RtlFreeAnsiString(void* ansistring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFreeAnsiString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ansistring);
        return;
    }
    errno = ENOSYS;
#else
    (void)ansistring;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_RtlFreeOemString(void* oemstring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFreeOemString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(oemstring);
        return;
    }
    errno = ENOSYS;
#else
    (void)oemstring;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_RtlFreeUnicodeString(void* unicodestring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFreeUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(unicodestring);
        return;
    }
    errno = ENOSYS;
#else
    (void)unicodestring;
    errno = ENOSYS;
#endif
}

uint64_t windowssys_windows_win32_system_windowsprogramming_RtlGetReturnAddressHijackTarget(void) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetReturnAddressHijackTarget");
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

void windowssys_windows_win32_system_windowsprogramming_RtlInitAnsiString(void* destinationstring, void* sourcestring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitAnsiString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(destinationstring, sourcestring);
        return;
    }
    errno = ENOSYS;
#else
    (void)destinationstring;
    (void)sourcestring;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RtlInitAnsiStringEx(void* destinationstring, void* sourcestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitAnsiStringEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_RtlInitString(void* destinationstring, void* sourcestring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(destinationstring, sourcestring);
        return;
    }
    errno = ENOSYS;
#else
    (void)destinationstring;
    (void)sourcestring;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RtlInitStringEx(void* destinationstring, void* sourcestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitStringEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_RtlInitUnicodeString(void* destinationstring, void* sourcestring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(destinationstring, sourcestring);
        return;
    }
    errno = ENOSYS;
#else
    (void)destinationstring;
    (void)sourcestring;
    errno = ENOSYS;
#endif
}

bool windowssys_windows_win32_system_windowsprogramming_RtlIsNameLegalDOS8Dot3(void* name, void* oemname, void* namecontainsspaces) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsNameLegalDOS8Dot3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, oemname, namecontainsspaces);
    }
    errno = ENOSYS;
    return false;
#else
    (void)name;
    (void)oemname;
    (void)namecontainsspaces;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RtlLocalTimeToSystemTime(void* localtime, void* systemtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLocalTimeToSystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localtime, systemtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localtime;
    (void)systemtime;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_RtlRaiseCustomSystemEventTrigger(void* triggerconfig) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRaiseCustomSystemEventTrigger");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(triggerconfig);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)triggerconfig;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssys_windows_win32_system_windowsprogramming_RtlTimeToSecondsSince1970(void* arg_0_time, void* elapsedseconds) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlTimeToSecondsSince1970");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_time, elapsedseconds);
    }
    errno = ENOSYS;
    return false;
#else
    (void)arg_0_time;
    (void)elapsedseconds;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RtlUnicodeStringToAnsiString(void* destinationstring, void* sourcestring, bool allocatedestinationstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeStringToAnsiString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RtlUnicodeStringToOemString(void* destinationstring, void* sourcestring, bool allocatedestinationstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeStringToOemString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RtlUnicodeToMultiByteSize(void* bytesinmultibytestring, void* unicodestring, uint32_t bytesinunicodestring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeToMultiByteSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bytesinmultibytestring, unicodestring, bytesinunicodestring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bytesinmultibytestring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_RtlUniform(void* seed) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUniform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(seed);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)seed;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RunSetupCommandA(void* hwnd, void* szcmdname, void* szinfsection, void* szdir, void* lpsztitle, void* phexe, uint32_t dwflags, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RunSetupCommandA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, szcmdname, szinfsection, szdir, lpsztitle, phexe, dwflags, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)szcmdname;
    (void)szinfsection;
    (void)szdir;
    (void)lpsztitle;
    (void)phexe;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_RunSetupCommandW(void* hwnd, void* szcmdname, void* szinfsection, void* szdir, void* lpsztitle, void* phexe, uint32_t dwflags, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RunSetupCommandW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, szcmdname, szinfsection, szdir, lpsztitle, phexe, dwflags, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)szcmdname;
    (void)szinfsection;
    (void)szdir;
    (void)lpsztitle;
    (void)phexe;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_windowsprogramming_SendIMEMessageExA(void* param0, int64_t param1) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendIMEMessageExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_windowsprogramming_SendIMEMessageExW(void* param0, int64_t param1) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendIMEMessageExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_SetEnvironmentStringsA(void* newenvironment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEnvironmentStringsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(newenvironment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)newenvironment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableA(void* lpname, void* lpguid, void* pvalue, uint32_t nsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFirmwareEnvironmentVariableA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpguid, pvalue, nsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpname;
    (void)lpguid;
    (void)pvalue;
    (void)nsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableExA(void* lpname, void* lpguid, void* pvalue, uint32_t nsize, uint32_t dwattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFirmwareEnvironmentVariableExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpguid, pvalue, nsize, dwattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpname;
    (void)lpguid;
    (void)pvalue;
    (void)nsize;
    (void)dwattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableExW(void* lpname, void* lpguid, void* pvalue, uint32_t nsize, uint32_t dwattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFirmwareEnvironmentVariableExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpguid, pvalue, nsize, dwattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpname;
    (void)lpguid;
    (void)pvalue;
    (void)nsize;
    (void)dwattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableW(void* lpname, void* lpguid, void* pvalue, uint32_t nsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFirmwareEnvironmentVariableW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpguid, pvalue, nsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpname;
    (void)lpguid;
    (void)pvalue;
    (void)nsize;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_SetHandleCount(uint32_t unumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetHandleCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)unumber;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_SetMessageWaitingIndicator(void* hmsgindicator, uint32_t ulmsgcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMessageWaitingIndicator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmsgindicator, ulmsgcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmsgindicator;
    (void)ulmsgcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_SetPerUserSecValuesA(void* pperuser) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPerUserSecValuesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pperuser);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pperuser;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_SetPerUserSecValuesW(void* pperuser) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPerUserSecValuesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pperuser);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pperuser;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_SubscribeFeatureStateChangeNotification(void* subscription, void* callback, void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-featurestaging-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SubscribeFeatureStateChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(subscription, callback, context);
        return;
    }
    errno = ENOSYS;
#else
    (void)subscription;
    (void)callback;
    (void)context;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_TranslateInfStringA(void* pszinffilename, void* pszinstallsection, void* psztranslatesection, void* psztranslatekey, void* pszbuffer, uint32_t cchbuffer, void* pdwrequiredsize, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateInfStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszinffilename, pszinstallsection, psztranslatesection, psztranslatekey, pszbuffer, cchbuffer, pdwrequiredsize, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszinffilename;
    (void)pszinstallsection;
    (void)psztranslatesection;
    (void)psztranslatekey;
    (void)pszbuffer;
    (void)cchbuffer;
    (void)pdwrequiredsize;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_TranslateInfStringExA(void* hinf, void* pszinffilename, void* psztranslatesection, void* psztranslatekey, void* pszbuffer, uint32_t dwbuffersize, void* pdwrequiredsize, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateInfStringExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinf, pszinffilename, psztranslatesection, psztranslatekey, pszbuffer, dwbuffersize, pdwrequiredsize, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinf;
    (void)pszinffilename;
    (void)psztranslatesection;
    (void)psztranslatekey;
    (void)pszbuffer;
    (void)dwbuffersize;
    (void)pdwrequiredsize;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_TranslateInfStringExW(void* hinf, void* pszinffilename, void* psztranslatesection, void* psztranslatekey, void* pszbuffer, uint32_t dwbuffersize, void* pdwrequiredsize, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateInfStringExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinf, pszinffilename, psztranslatesection, psztranslatekey, pszbuffer, dwbuffersize, pdwrequiredsize, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinf;
    (void)pszinffilename;
    (void)psztranslatesection;
    (void)psztranslatekey;
    (void)pszbuffer;
    (void)dwbuffersize;
    (void)pdwrequiredsize;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_TranslateInfStringW(void* pszinffilename, void* pszinstallsection, void* psztranslatesection, void* psztranslatekey, void* pszbuffer, uint32_t cchbuffer, void* pdwrequiredsize, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateInfStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszinffilename, pszinstallsection, psztranslatesection, psztranslatekey, pszbuffer, cchbuffer, pdwrequiredsize, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszinffilename;
    (void)pszinstallsection;
    (void)psztranslatesection;
    (void)psztranslatekey;
    (void)pszbuffer;
    (void)cchbuffer;
    (void)pdwrequiredsize;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_UnsubscribeFeatureStateChangeNotification(void* subscription) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-featurestaging-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnsubscribeFeatureStateChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(subscription);
        return;
    }
    errno = ENOSYS;
#else
    (void)subscription;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_UserInstStubWrapperA(void* hwnd, void* hinstance, void* pszparms, int32_t nshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UserInstStubWrapperA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hinstance, pszparms, nshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hinstance;
    (void)pszparms;
    (void)nshow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_UserInstStubWrapperW(void* hwnd, void* hinstance, void* pszparms, int32_t nshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UserInstStubWrapperW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hinstance, pszparms, nshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hinstance;
    (void)pszparms;
    (void)nshow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_UserUnInstStubWrapperA(void* hwnd, void* hinstance, void* pszparms, int32_t nshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UserUnInstStubWrapperA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hinstance, pszparms, nshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hinstance;
    (void)pszparms;
    (void)nshow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_UserUnInstStubWrapperW(void* hwnd, void* hinstance, void* pszparms, int32_t nshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advpack.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UserUnInstStubWrapperW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hinstance, pszparms, nshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hinstance;
    (void)pszparms;
    (void)nshow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WINNLSEnableIME(void* param0, int32_t param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WINNLSEnableIME");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WINNLSGetEnableStatus(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WINNLSGetEnableStatus");
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

uint32_t windowssys_windows_win32_system_windowsprogramming_WINNLSGetIMEHotkey(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WINNLSGetIMEHotkey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_system_windowsprogramming_WinWatchClose(void* hww) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinWatchClose");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hww);
        return;
    }
    errno = ENOSYS;
#else
    (void)hww;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WinWatchDidStatusChange(void* hww) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinWatchDidStatusChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hww);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hww;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming_WinWatchGetClipList(void* hww, void* prc, uint32_t size, void* prd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinWatchGetClipList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hww, prc, size, prd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hww;
    (void)prc;
    (void)size;
    (void)prd;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WinWatchNotify(void* hww, void* notifycallback, int64_t notifyparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinWatchNotify");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hww, notifycallback, notifyparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hww;
    (void)notifycallback;
    (void)notifyparam;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_windowsprogramming_WinWatchOpen(void* hwnd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dciman32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinWatchOpen");
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

int32_t windowssys_windows_win32_system_windowsprogramming_WldpCanExecuteBuffer(void* host, int32_t options, void* buffer, uint32_t buffersize, void* auditinfo, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpCanExecuteBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(host, options, buffer, buffersize, auditinfo, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)host;
    (void)options;
    (void)buffer;
    (void)buffersize;
    (void)auditinfo;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WldpCanExecuteFile(void* host, int32_t options, void* filehandle, void* auditinfo, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpCanExecuteFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(host, options, filehandle, auditinfo, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)host;
    (void)options;
    (void)filehandle;
    (void)auditinfo;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WldpCanExecuteStream(void* host, int32_t options, void* stream, void* auditinfo, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpCanExecuteStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(host, options, stream, auditinfo, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)host;
    (void)options;
    (void)stream;
    (void)auditinfo;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WldpGetLockdownPolicy(void* hostinformation, void* lockdownstate, uint32_t lockdownflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpGetLockdownPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostinformation, lockdownstate, lockdownflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hostinformation;
    (void)lockdownstate;
    (void)lockdownflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WldpIsClassInApprovedList(void* classid, void* hostinformation, void* isapproved, uint32_t optionalflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpIsClassInApprovedList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classid, hostinformation, isapproved, optionalflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classid;
    (void)hostinformation;
    (void)isapproved;
    (void)optionalflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WldpIsDynamicCodePolicyEnabled(void* isenabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpIsDynamicCodePolicyEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(isenabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)isenabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WldpQueryDeviceSecurityInformation(void* information, uint32_t informationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpQueryDeviceSecurityInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(information, informationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)information;
    (void)informationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WldpQueryDynamicCodeTrust(void* filehandle, void* baseimage, uint32_t imagesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpQueryDynamicCodeTrust");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, baseimage, imagesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)baseimage;
    (void)imagesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WldpSetDynamicCodeTrust(void* filehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WldpSetDynamicCodeTrust");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileSectionA(void* lpappname, void* lpstring, void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WritePrivateProfileSectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpstring, lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpappname;
    (void)lpstring;
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileSectionW(void* lpappname, void* lpstring, void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WritePrivateProfileSectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpstring, lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpappname;
    (void)lpstring;
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStringA(void* lpappname, void* lpkeyname, void* lpstring, void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WritePrivateProfileStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpkeyname, lpstring, lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpstring;
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStringW(void* lpappname, void* lpkeyname, void* lpstring, void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WritePrivateProfileStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpkeyname, lpstring, lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpstring;
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStructA(void* lpszsection, void* lpszkey, void* lpstruct, uint32_t usizestruct, void* szfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WritePrivateProfileStructA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszsection, lpszkey, lpstruct, usizestruct, szfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszsection;
    (void)lpszkey;
    (void)lpstruct;
    (void)usizestruct;
    (void)szfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStructW(void* lpszsection, void* lpszkey, void* lpstruct, uint32_t usizestruct, void* szfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WritePrivateProfileStructW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszsection, lpszkey, lpstruct, usizestruct, szfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszsection;
    (void)lpszkey;
    (void)lpstruct;
    (void)usizestruct;
    (void)szfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WriteProfileSectionA(void* lpappname, void* lpstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteProfileSectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpappname;
    (void)lpstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WriteProfileSectionW(void* lpappname, void* lpstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteProfileSectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpappname;
    (void)lpstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WriteProfileStringA(void* lpappname, void* lpkeyname, void* lpstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteProfileStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpkeyname, lpstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_WriteProfileStringW(void* lpappname, void* lpkeyname, void* lpstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteProfileStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpappname, lpkeyname, lpstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpappname;
    (void)lpkeyname;
    (void)lpstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming__hread(int32_t hfile, void* lpbuffer, int32_t lbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_hread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffer, lbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)lbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming__hwrite(int32_t hfile, void* lpbuffer, int32_t lbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_hwrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffer, lbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)lbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming__lclose(int32_t hfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_lclose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming__lcreat(void* lppathname, int32_t iattribute) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_lcreat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname, iattribute);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    (void)iattribute;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming__llseek(int32_t hfile, int32_t loffset, int32_t iorigin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_llseek");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, loffset, iorigin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)loffset;
    (void)iorigin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming__lopen(void* lppathname, int32_t ireadwrite) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_lopen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname, ireadwrite);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    (void)ireadwrite;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming__lread(int32_t hfile, void* lpbuffer, uint32_t ubytes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_lread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffer, ubytes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)ubytes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_windowsprogramming__lwrite(int32_t hfile, void* lpbuffer, uint32_t ubytes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "_lwrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffer, ubytes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)ubytes;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_uaw_lstrcmpW(void* string1, void* string2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_lstrcmpW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string1, string2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string1;
    (void)string2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_uaw_lstrcmpiW(void* string1, void* string2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_lstrcmpiW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string1, string2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string1;
    (void)string2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_uaw_lstrlenW(void* string) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_lstrlenW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_windowsprogramming_uaw_wcschr(void* string, uint16_t character) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_wcschr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string, character);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)string;
    (void)character;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_windowsprogramming_uaw_wcscpy(void* destination, void* source) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_wcscpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destination, source);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)destination;
    (void)source;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_windowsprogramming_uaw_wcsicmp(void* string1, void* string2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_wcsicmp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string1, string2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string1;
    (void)string2;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_system_windowsprogramming_uaw_wcslen(void* string) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_wcslen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)string;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_windowsprogramming_uaw_wcsrchr(void* string, uint16_t character) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uaw_wcsrchr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string, character);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)string;
    (void)character;
    errno = ENOSYS;
    return NULL;
#endif
}

