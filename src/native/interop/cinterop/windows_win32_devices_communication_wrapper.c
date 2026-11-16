#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_communication_wrapper.h"
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

int32_t windowssysWindowsWin32DevicesCommunicationBuildCommDCBA(void* lpdef, void* lpdcb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildCommDCBA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdef, lpdcb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdef;
    (void)lpdcb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsA(void* lpdef, void* lpdcb, void* lpcommtimeouts) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildCommDCBAndTimeoutsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdef, lpdcb, lpcommtimeouts);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdef;
    (void)lpdcb;
    (void)lpcommtimeouts;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsW(void* lpdef, void* lpdcb, void* lpcommtimeouts) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildCommDCBAndTimeoutsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdef, lpdcb, lpcommtimeouts);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdef;
    (void)lpdcb;
    (void)lpcommtimeouts;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationBuildCommDCBW(void* lpdef, void* lpdcb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildCommDCBW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdef, lpdcb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdef;
    (void)lpdcb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationClearCommBreak(void* hfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearCommBreak");
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

int32_t windowssysWindowsWin32DevicesCommunicationClearCommError(void* hfile, void* lperrors, void* lpstat) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearCommError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lperrors, lpstat);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lperrors;
    (void)lpstat;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationCommConfigDialogA(void* lpszname, void* hwnd, void* lpcc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommConfigDialogA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszname, hwnd, lpcc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszname;
    (void)hwnd;
    (void)lpcc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationCommConfigDialogW(void* lpszname, void* hwnd, void* lpcc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommConfigDialogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszname, hwnd, lpcc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszname;
    (void)hwnd;
    (void)lpcc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationEscapeCommFunction(void* hfile, uint32_t dwfunc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EscapeCommFunction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, dwfunc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)dwfunc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationGetCommConfig(void* hcommdev, void* lpcc, void* lpdwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcommdev, lpcc, lpdwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcommdev;
    (void)lpcc;
    (void)lpdwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationGetCommMask(void* hfile, void* lpevtmask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommMask");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpevtmask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpevtmask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationGetCommModemStatus(void* hfile, void* lpmodemstat) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommModemStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpmodemstat);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpmodemstat;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32DevicesCommunicationGetCommPorts(void* lpportnumbers, uint32_t uportnumberscount, void* puportnumbersfound) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-comm-l1-1-2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommPorts");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpportnumbers, uportnumberscount, puportnumbersfound);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpportnumbers;
    (void)uportnumberscount;
    (void)puportnumbersfound;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationGetCommProperties(void* hfile, void* lpcommprop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpcommprop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpcommprop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationGetCommState(void* hfile, void* lpdcb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpdcb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpdcb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationGetCommTimeouts(void* hfile, void* lpcommtimeouts) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommTimeouts");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpcommtimeouts);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpcommtimeouts;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigA(void* lpszname, void* lpcc, void* lpdwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDefaultCommConfigA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszname, lpcc, lpdwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszname;
    (void)lpcc;
    (void)lpdwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigW(void* lpszname, void* lpcc, void* lpdwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDefaultCommConfigW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszname, lpcc, lpdwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszname;
    (void)lpcc;
    (void)lpdwsize;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32DevicesCommunicationOpenCommPort(uint32_t uportnumber, uint32_t dwdesiredaccess, uint32_t dwflagsandattributes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-comm-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenCommPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uportnumber, dwdesiredaccess, dwflagsandattributes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uportnumber;
    (void)dwdesiredaccess;
    (void)dwflagsandattributes;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationPurgeComm(void* hfile, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PurgeComm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationSetCommBreak(void* hfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCommBreak");
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

int32_t windowssysWindowsWin32DevicesCommunicationSetCommConfig(void* hcommdev, void* lpcc, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCommConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcommdev, lpcc, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcommdev;
    (void)lpcc;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationSetCommMask(void* hfile, uint32_t dwevtmask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCommMask");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, dwevtmask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)dwevtmask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationSetCommState(void* hfile, void* lpdcb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCommState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpdcb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpdcb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationSetCommTimeouts(void* hfile, void* lpcommtimeouts) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCommTimeouts");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpcommtimeouts);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpcommtimeouts;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigA(void* lpszname, void* lpcc, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDefaultCommConfigA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszname, lpcc, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszname;
    (void)lpcc;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigW(void* lpszname, void* lpcc, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDefaultCommConfigW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszname, lpcc, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszname;
    (void)lpcc;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationSetupComm(void* hfile, uint32_t dwinqueue, uint32_t dwoutqueue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupComm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, dwinqueue, dwoutqueue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)dwinqueue;
    (void)dwoutqueue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationTransmitCommChar(void* hfile, int8_t cchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransmitCommChar");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, cchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)cchar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesCommunicationWaitCommEvent(void* hfile, void* lpevtmask, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitCommEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpevtmask, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpevtmask;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

