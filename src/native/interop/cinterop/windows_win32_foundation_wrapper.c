#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_foundation_wrapper.h"
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

int32_t windowssysWindowsWin32FoundationCloseHandle(void* hobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32FoundationCompareObjectHandles(void* hfirstobjecthandle, void* hsecondobjecthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-handle-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompareObjectHandles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfirstobjecthandle, hsecondobjecthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfirstobjecthandle;
    (void)hsecondobjecthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32FoundationDuplicateHandle(void* hsourceprocesshandle, void* hsourcehandle, void* htargetprocesshandle, void* lptargethandle, uint32_t dwdesiredaccess, int32_t binherithandle, uint32_t dwoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicateHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsourceprocesshandle, hsourcehandle, htargetprocesshandle, lptargethandle, dwdesiredaccess, binherithandle, dwoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsourceprocesshandle;
    (void)hsourcehandle;
    (void)htargetprocesshandle;
    (void)lptargethandle;
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)dwoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32FoundationFreeLibrary(void* hlibmodule) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeLibrary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlibmodule);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlibmodule;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32FoundationGetHandleInformation(void* hobject, void* lpdwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetHandleInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobject, lpdwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobject;
    (void)lpdwflags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32FoundationGetLastError(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLastError");
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

void* windowssysWindowsWin32FoundationGlobalFree(void* hmem) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalFree");
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

void* windowssysWindowsWin32FoundationLocalFree(void* hmem) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalFree");
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

uint32_t windowssysWindowsWin32FoundationRtlNtStatusToDosError(int32_t status) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNtStatusToDosError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)status;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32FoundationSetHandleInformation(void* hobject, uint32_t dwmask, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetHandleInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobject, dwmask, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobject;
    (void)dwmask;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32FoundationSetLastError(uint32_t dwerrcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLastError");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dwerrcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)dwerrcode;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32FoundationSetLastErrorEx(uint32_t dwerrcode, uint32_t dwtype) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLastErrorEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dwerrcode, dwtype);
        return;
    }
    errno = ENOSYS;
#else
    (void)dwerrcode;
    (void)dwtype;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32FoundationSysAddRefString(void* bstrstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysAddRefString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bstrstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bstrstring;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32FoundationSysAllocString(void* psz) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysAllocString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)psz;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32FoundationSysAllocStringByteLen(void* psz, uint32_t len) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysAllocStringByteLen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psz, len);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)psz;
    (void)len;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32FoundationSysAllocStringLen(void* strin, uint32_t ui) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysAllocStringLen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strin, ui);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)strin;
    (void)ui;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32FoundationSysFreeString(void* bstrstring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysFreeString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bstrstring);
        return;
    }
    errno = ENOSYS;
#else
    (void)bstrstring;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32FoundationSysReAllocString(void* pbstr, void* psz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysReAllocString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbstr, psz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbstr;
    (void)psz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32FoundationSysReAllocStringLen(void* pbstr, void* psz, uint32_t len) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysReAllocStringLen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbstr, psz, len);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbstr;
    (void)psz;
    (void)len;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32FoundationSysReleaseString(void* bstrstring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysReleaseString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bstrstring);
        return;
    }
    errno = ENOSYS;
#else
    (void)bstrstring;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32FoundationSysStringByteLen(void* bstr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysStringByteLen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bstr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bstr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32FoundationSysStringLen(void* pbstr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SysStringLen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbstr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbstr;
    errno = ENOSYS;
    return 0;
#endif
}

