#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_com_wrapper.h"
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

int32_t windowssys_windows_win32_system_com_BindMoniker(void* pmk, uint32_t grfopt, void* iidresult, void* ppvresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BindMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmk, grfopt, iidresult, ppvresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmk;
    (void)grfopt;
    (void)iidresult;
    (void)ppvresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CLSIDFromProgID(void* lpszprogid, void* lpclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLSIDFromProgID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszprogid, lpclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszprogid;
    (void)lpclsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CLSIDFromProgIDEx(void* lpszprogid, void* lpclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLSIDFromProgIDEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszprogid, lpclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszprogid;
    (void)lpclsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CLSIDFromString(void* lpsz, void* pclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLSIDFromString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz, pclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsz;
    (void)pclsid;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_com_CoAddRefServerProcess(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoAddRefServerProcess");
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

int32_t windowssys_windows_win32_system_com_CoAllowSetForegroundWindow(void* punk, void* lpvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoAllowSetForegroundWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, lpvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)lpvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoAllowUnmarshalerCLSID(void* clsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoAllowUnmarshalerCLSID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsid;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_com_CoBuildVersion(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoBuildVersion");
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

int32_t windowssys_windows_win32_system_com_CoCancelCall(uint32_t dwthreadid, uint32_t ultimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCancelCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwthreadid, ultimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwthreadid;
    (void)ultimeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoCopyProxy(void* pproxy, void* ppcopy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCopyProxy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pproxy, ppcopy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pproxy;
    (void)ppcopy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoCreateFreeThreadedMarshaler(void* punkouter, void* ppunkmarshal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("combase.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCreateFreeThreadedMarshaler");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punkouter, ppunkmarshal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punkouter;
    (void)ppunkmarshal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoCreateGuid(void* pguid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCreateGuid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pguid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pguid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoCreateInstance(void* rclsid, void* punkouter, uint32_t dwclscontext, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCreateInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid, punkouter, dwclscontext, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    (void)punkouter;
    (void)dwclscontext;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoCreateInstanceEx(void* clsid, void* punkouter, uint32_t dwclsctx, void* pserverinfo, uint32_t dwcount, void* presults) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCreateInstanceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsid, punkouter, dwclsctx, pserverinfo, dwcount, presults);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsid;
    (void)punkouter;
    (void)dwclsctx;
    (void)pserverinfo;
    (void)dwcount;
    (void)presults;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoCreateInstanceFromApp(void* clsid, void* punkouter, uint32_t dwclsctx, void* reserved, uint32_t dwcount, void* presults) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoCreateInstanceFromApp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsid, punkouter, dwclsctx, reserved, dwcount, presults);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsid;
    (void)punkouter;
    (void)dwclsctx;
    (void)reserved;
    (void)dwcount;
    (void)presults;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoDecrementMTAUsage(void* cookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoDecrementMTAUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cookie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoDisableCallCancellation(void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoDisableCallCancellation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoDisconnectContext(uint32_t dwtimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoDisconnectContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtimeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoDisconnectObject(void* punk, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoDisconnectObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoDosDateTimeToFileTime(uint16_t ndosdate, uint16_t ndostime, void* lpfiletime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoDosDateTimeToFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndosdate, ndostime, lpfiletime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndosdate;
    (void)ndostime;
    (void)lpfiletime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoEnableCallCancellation(void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoEnableCallCancellation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoFileTimeNow(void* lpfiletime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoFileTimeNow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfiletime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfiletime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoFileTimeToDosDateTime(void* lpfiletime, void* lpdosdate, void* lpdostime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoFileTimeToDosDateTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfiletime, lpdosdate, lpdostime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfiletime;
    (void)lpdosdate;
    (void)lpdostime;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_com_CoFreeAllLibraries(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoFreeAllLibraries");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_com_CoFreeLibrary(void* hinst) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoFreeLibrary");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hinst);
        return;
    }
    errno = ENOSYS;
#else
    (void)hinst;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_com_CoFreeUnusedLibraries(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoFreeUnusedLibraries");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_com_CoFreeUnusedLibrariesEx(uint32_t dwunloaddelay, uint32_t dwreserved) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoFreeUnusedLibrariesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dwunloaddelay, dwreserved);
        return;
    }
    errno = ENOSYS;
#else
    (void)dwunloaddelay;
    (void)dwreserved;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_com_CoGetApartmentType(void* papttype, void* paptqualifier) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetApartmentType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(papttype, paptqualifier);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)papttype;
    (void)paptqualifier;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoGetCallContext(void* riid, void* ppinterface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetCallContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(riid, ppinterface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)riid;
    (void)ppinterface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoGetCallerTID(void* lpdwtid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetCallerTID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwtid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwtid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoGetCancelObject(uint32_t dwthreadid, void* iid, void* ppunk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetCancelObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwthreadid, iid, ppunk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwthreadid;
    (void)iid;
    (void)ppunk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoGetClassObject(void* rclsid, uint32_t dwclscontext, void* pvreserved, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetClassObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid, dwclscontext, pvreserved, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    (void)dwclscontext;
    (void)pvreserved;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoGetContextToken(void* ptoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetContextToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptoken;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoGetCurrentLogicalThreadId(void* pguid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetCurrentLogicalThreadId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pguid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pguid;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_com_CoGetCurrentProcess(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetCurrentProcess");
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

int32_t windowssys_windows_win32_system_com_CoGetMalloc(uint32_t dwmemcontext, void* ppmalloc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetMalloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmemcontext, ppmalloc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwmemcontext;
    (void)ppmalloc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoGetObject(void* pszname, void* pbindoptions, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszname, pbindoptions, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszname;
    (void)pbindoptions;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoGetObjectContext(void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetObjectContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoGetPSClsid(void* riid, void* pclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetPSClsid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(riid, pclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)riid;
    (void)pclsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoGetSystemSecurityPermissions(int32_t comsdtype, void* ppsd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetSystemSecurityPermissions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(comsdtype, ppsd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)comsdtype;
    (void)ppsd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoGetTreatAsClass(void* clsidold, void* pclsidnew) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetTreatAsClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsidold, pclsidnew);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsidold;
    (void)pclsidnew;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoImpersonateClient(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoImpersonateClient");
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

int32_t windowssys_windows_win32_system_com_CoIncrementMTAUsage(void* pcookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("combase.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoIncrementMTAUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcookie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoInitialize(void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoInitializeEx(void* pvreserved, uint32_t dwcoinit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInitializeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvreserved, dwcoinit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvreserved;
    (void)dwcoinit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoInitializeSecurity(void* psecdesc, int32_t cauthsvc, void* asauthsvc, void* preserved1, uint32_t dwauthnlevel, uint32_t dwimplevel, void* pauthlist, uint32_t dwcapabilities, void* preserved3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInitializeSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecdesc, cauthsvc, asauthsvc, preserved1, dwauthnlevel, dwimplevel, pauthlist, dwcapabilities, preserved3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecdesc;
    (void)cauthsvc;
    (void)asauthsvc;
    (void)preserved1;
    (void)dwauthnlevel;
    (void)dwimplevel;
    (void)pauthlist;
    (void)dwcapabilities;
    (void)preserved3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoInstall(void* pbc, uint32_t dwflags, void* pclassspec, void* pquery, void* pszcodebase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInstall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbc, dwflags, pclassspec, pquery, pszcodebase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbc;
    (void)dwflags;
    (void)pclassspec;
    (void)pquery;
    (void)pszcodebase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoInvalidateRemoteMachineBindings(void* pszmachinename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInvalidateRemoteMachineBindings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszmachinename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszmachinename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoIsHandlerConnected(void* punk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoIsHandlerConnected");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoIsOle1Class(void* rclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoIsOle1Class");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_com_CoLoadLibrary(void* lpszlibname, int32_t bautofree) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoLoadLibrary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszlibname, bautofree);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszlibname;
    (void)bautofree;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_com_CoLockObjectExternal(void* punk, int32_t flock, int32_t flastunlockreleases) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoLockObjectExternal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, flock, flastunlockreleases);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)flock;
    (void)flastunlockreleases;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoQueryAuthenticationServices(void* pcauthsvc, void* asauthsvc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoQueryAuthenticationServices");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcauthsvc, asauthsvc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcauthsvc;
    (void)asauthsvc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoQueryClientBlanket(void* pauthnsvc, void* pauthzsvc, void* pserverprincname, void* pauthnlevel, void* pimplevel, void* pprivs, void* pcapabilities) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoQueryClientBlanket");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pauthnsvc, pauthzsvc, pserverprincname, pauthnlevel, pimplevel, pprivs, pcapabilities);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pauthnsvc;
    (void)pauthzsvc;
    (void)pserverprincname;
    (void)pauthnlevel;
    (void)pimplevel;
    (void)pprivs;
    (void)pcapabilities;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoQueryProxyBlanket(void* pproxy, void* pwauthnsvc, void* pauthzsvc, void* pserverprincname, void* pauthnlevel, void* pimplevel, void* pauthinfo, void* pcapabilites) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoQueryProxyBlanket");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pproxy, pwauthnsvc, pauthzsvc, pserverprincname, pauthnlevel, pimplevel, pauthinfo, pcapabilites);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pproxy;
    (void)pwauthnsvc;
    (void)pauthzsvc;
    (void)pserverprincname;
    (void)pauthnlevel;
    (void)pimplevel;
    (void)pauthinfo;
    (void)pcapabilites;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoRegisterActivationFilter(void* pactivationfilter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterActivationFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pactivationfilter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pactivationfilter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoRegisterChannelHook(void* extensionuuid, void* pchannelhook) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterChannelHook");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(extensionuuid, pchannelhook);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)extensionuuid;
    (void)pchannelhook;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoRegisterClassObject(void* rclsid, void* punk, uint32_t dwclscontext, uint32_t flags, void* lpdwregister) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterClassObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid, punk, dwclscontext, flags, lpdwregister);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    (void)punk;
    (void)dwclscontext;
    (void)flags;
    (void)lpdwregister;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoRegisterDeviceCatalog(void* deviceinstanceid, void* cookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterDeviceCatalog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinstanceid, cookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinstanceid;
    (void)cookie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoRegisterInitializeSpy(void* pspy, void* pulicookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterInitializeSpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pspy, pulicookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pspy;
    (void)pulicookie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoRegisterMallocSpy(void* pmallocspy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterMallocSpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmallocspy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmallocspy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoRegisterPSClsid(void* riid, void* rclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterPSClsid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(riid, rclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)riid;
    (void)rclsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoRegisterSurrogate(void* psurrogate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterSurrogate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psurrogate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psurrogate;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_com_CoReleaseServerProcess(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoReleaseServerProcess");
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

int32_t windowssys_windows_win32_system_com_CoResumeClassObjects(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoResumeClassObjects");
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

int32_t windowssys_windows_win32_system_com_CoRevertToSelf(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRevertToSelf");
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

int32_t windowssys_windows_win32_system_com_CoRevokeClassObject(uint32_t dwregister) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRevokeClassObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwregister);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwregister;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoRevokeDeviceCatalog(void* cookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRevokeDeviceCatalog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cookie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoRevokeInitializeSpy(uint64_t ulicookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRevokeInitializeSpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulicookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulicookie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoRevokeMallocSpy(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRevokeMallocSpy");
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

int32_t windowssys_windows_win32_system_com_CoSetCancelObject(void* punk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoSetCancelObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoSetProxyBlanket(void* pproxy, uint32_t dwauthnsvc, uint32_t dwauthzsvc, void* pserverprincname, uint32_t dwauthnlevel, uint32_t dwimplevel, void* pauthinfo, uint32_t dwcapabilities) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoSetProxyBlanket");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pproxy, dwauthnsvc, dwauthzsvc, pserverprincname, dwauthnlevel, dwimplevel, pauthinfo, dwcapabilities);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pproxy;
    (void)dwauthnsvc;
    (void)dwauthzsvc;
    (void)pserverprincname;
    (void)dwauthnlevel;
    (void)dwimplevel;
    (void)pauthinfo;
    (void)dwcapabilities;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoSuspendClassObjects(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoSuspendClassObjects");
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

int32_t windowssys_windows_win32_system_com_CoSwitchCallContext(void* pnewobject, void* ppoldobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoSwitchCallContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pnewobject, ppoldobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pnewobject;
    (void)ppoldobject;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_com_CoTaskMemAlloc(uint64_t cb) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("combase.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoTaskMemAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cb);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cb;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_system_com_CoTaskMemFree(void* pv) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("combase.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoTaskMemFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pv);
        return;
    }
    errno = ENOSYS;
#else
    (void)pv;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_system_com_CoTaskMemRealloc(void* pv, uint64_t cb) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoTaskMemRealloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pv, cb);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pv;
    (void)cb;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_com_CoTestCancel(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoTestCancel");
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

int32_t windowssys_windows_win32_system_com_CoTreatAsClass(void* clsidold, void* clsidnew) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoTreatAsClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsidold, clsidnew);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsidold;
    (void)clsidnew;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_com_CoUninitialize(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoUninitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_com_CoWaitForMultipleHandles(uint32_t dwflags, uint32_t dwtimeout, uint32_t chandles, void* phandles, void* lpdwindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoWaitForMultipleHandles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, dwtimeout, chandles, phandles, lpdwindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)dwtimeout;
    (void)chandles;
    (void)phandles;
    (void)lpdwindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CoWaitForMultipleObjects(uint32_t dwflags, uint32_t dwtimeout, uint32_t chandles, void* phandles, void* lpdwindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoWaitForMultipleObjects");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, dwtimeout, chandles, phandles, lpdwindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)dwtimeout;
    (void)chandles;
    (void)phandles;
    (void)lpdwindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CreateAntiMoniker(void* ppmk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateAntiMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppmk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppmk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CreateBindCtx(uint32_t reserved, void* ppbc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateBindCtx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved, ppbc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reserved;
    (void)ppbc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CreateClassMoniker(void* rclsid, void* ppmk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClassMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid, ppmk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    (void)ppmk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CreateDataAdviseHolder(void* ppdaholder) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDataAdviseHolder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppdaholder);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppdaholder;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CreateDataCache(void* punkouter, void* rclsid, void* iid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDataCache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punkouter, rclsid, iid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punkouter;
    (void)rclsid;
    (void)iid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CreateFileMoniker(void* lpszpathname, void* ppmk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszpathname, ppmk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszpathname;
    (void)ppmk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CreateGenericComposite(void* pmkfirst, void* pmkrest, void* ppmkcomposite) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateGenericComposite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmkfirst, pmkrest, ppmkcomposite);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmkfirst;
    (void)pmkrest;
    (void)ppmkcomposite;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CreateIUriBuilder(void* piuri, uint32_t dwflags, uint64_t dwreserved, void* ppiuribuilder) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIUriBuilder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(piuri, dwflags, dwreserved, ppiuribuilder);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)piuri;
    (void)dwflags;
    (void)dwreserved;
    (void)ppiuribuilder;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CreateItemMoniker(void* lpszdelim, void* lpszitem, void* ppmk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateItemMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdelim, lpszitem, ppmk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszdelim;
    (void)lpszitem;
    (void)ppmk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CreateObjrefMoniker(void* punk, void* ppmk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateObjrefMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, ppmk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)ppmk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CreatePointerMoniker(void* punk, void* ppmk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePointerMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, ppmk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)ppmk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CreateStdProgressIndicator(void* hwndparent, void* psztitle, void* pibsccaller, void* ppibsc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStdProgressIndicator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, psztitle, pibsccaller, ppibsc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)psztitle;
    (void)pibsccaller;
    (void)ppibsc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CreateUri(void* pwzuri, uint32_t dwflags, uint64_t dwreserved, void* ppuri) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUri");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzuri, dwflags, dwreserved, ppuri);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzuri;
    (void)dwflags;
    (void)dwreserved;
    (void)ppuri;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CreateUriFromMultiByteString(void* pszansiinputuri, uint32_t dwencodingflags, uint32_t dwcodepage, uint32_t dwcreateflags, uint64_t dwreserved, void* ppuri) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUriFromMultiByteString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszansiinputuri, dwencodingflags, dwcodepage, dwcreateflags, dwreserved, ppuri);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszansiinputuri;
    (void)dwencodingflags;
    (void)dwcodepage;
    (void)dwcreateflags;
    (void)dwreserved;
    (void)ppuri;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_CreateUriWithFragment(void* pwzuri, void* pwzfragment, uint32_t dwflags, uint64_t dwreserved, void* ppuri) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUriWithFragment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzuri, pwzfragment, dwflags, dwreserved, ppuri);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzuri;
    (void)pwzfragment;
    (void)dwflags;
    (void)dwreserved;
    (void)ppuri;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_DcomChannelSetHResult(void* pvreserved, void* pulreserved, int32_t appshr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DcomChannelSetHResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvreserved, pulreserved, appshr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvreserved;
    (void)pulreserved;
    (void)appshr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_GetClassFile(void* szfilename, void* pclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilename, pclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szfilename;
    (void)pclsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_GetErrorInfo(uint32_t dwreserved, void* pperrinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetErrorInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwreserved, pperrinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwreserved;
    (void)pperrinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_GetRunningObjectTable(uint32_t reserved, void* pprot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRunningObjectTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved, pprot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reserved;
    (void)pprot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_IIDFromString(void* lpsz, void* lpiid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IIDFromString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz, lpiid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsz;
    (void)lpiid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_MkParseDisplayName(void* pbc, void* szusername, void* pcheaten, void* ppmk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MkParseDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbc, szusername, pcheaten, ppmk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbc;
    (void)szusername;
    (void)pcheaten;
    (void)ppmk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_MonikerCommonPrefixWith(void* pmkthis, void* pmkother, void* ppmkcommon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MonikerCommonPrefixWith");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmkthis, pmkother, ppmkcommon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmkthis;
    (void)pmkother;
    (void)ppmkcommon;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_MonikerRelativePathTo(void* pmksrc, void* pmkdest, void* ppmkrelpath, int32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MonikerRelativePathTo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmksrc, pmkdest, ppmkrelpath, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmksrc;
    (void)pmkdest;
    (void)ppmkrelpath;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_ProgIDFromCLSID(void* clsid, void* lplpszprogid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProgIDFromCLSID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsid, lplpszprogid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsid;
    (void)lplpszprogid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_SetErrorInfo(uint32_t dwreserved, void* perrinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetErrorInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwreserved, perrinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwreserved;
    (void)perrinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_StringFromCLSID(void* rclsid, void* lplpsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StringFromCLSID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid, lplpsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    (void)lplpsz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_StringFromGUID2(void* rguid, void* lpsz, int32_t cchmax) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StringFromGUID2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rguid, lpsz, cchmax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rguid;
    (void)lpsz;
    (void)cchmax;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_StringFromIID(void* rclsid, void* lplpsz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StringFromIID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid, lplpsz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    (void)lplpsz;
    errno = ENOSYS;
    return -1;
#endif
}

