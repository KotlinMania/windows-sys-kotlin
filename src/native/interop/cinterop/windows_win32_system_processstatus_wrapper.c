#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_processstatus_wrapper.h"
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

int32_t windowssys_windows_win32_system_processstatus_emptyWorkingSet(void* hprocess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EmptyWorkingSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_enumDeviceDrivers(void* lpimagebase, uint32_t cb, void* lpcbneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDeviceDrivers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpimagebase, cb, lpcbneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpimagebase;
    (void)cb;
    (void)lpcbneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_enumPageFilesA(void* pcallbackroutine, void* pcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPageFilesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcallbackroutine, pcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcallbackroutine;
    (void)pcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_enumPageFilesW(void* pcallbackroutine, void* pcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPageFilesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcallbackroutine, pcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcallbackroutine;
    (void)pcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_enumProcessModules(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumProcessModules");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lphmodule, cb, lpcbneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lphmodule;
    (void)cb;
    (void)lpcbneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_enumProcessModulesEx(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded, uint32_t dwfilterflag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumProcessModulesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lphmodule, cb, lpcbneeded, dwfilterflag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lphmodule;
    (void)cb;
    (void)lpcbneeded;
    (void)dwfilterflag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_enumProcesses(void* lpidprocess, uint32_t cb, void* lpcbneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumProcesses");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpidprocess, cb, lpcbneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpidprocess;
    (void)cb;
    (void)lpcbneeded;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameA(void* imagebase, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceDriverBaseNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imagebase, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)imagebase;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameW(void* imagebase, void* lpbasename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceDriverBaseNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imagebase, lpbasename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)imagebase;
    (void)lpbasename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameA(void* imagebase, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceDriverFileNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imagebase, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)imagebase;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameW(void* imagebase, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceDriverFileNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imagebase, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)imagebase;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_getMappedFileNameA(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMappedFileNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpv, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)lpv;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_getMappedFileNameW(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMappedFileNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpv, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)lpv;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_getModuleBaseNameA(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleBaseNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, hmodule, lpbasename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpbasename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_getModuleBaseNameW(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleBaseNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, hmodule, lpbasename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpbasename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_getModuleFileNameExA(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleFileNameExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, hmodule, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_getModuleFileNameExW(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleFileNameExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, hmodule, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_getModuleInformation(void* hprocess, void* hmodule, void* lpmodinfo, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, hmodule, lpmodinfo, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpmodinfo;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_getPerformanceInfo(void* pperformanceinformation, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPerformanceInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pperformanceinformation, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pperformanceinformation;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_getProcessImageFileNameA(void* hprocess, void* lpimagefilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessImageFileNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpimagefilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)lpimagefilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_getProcessImageFileNameW(void* hprocess, void* lpimagefilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessImageFileNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpimagefilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)lpimagefilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_getProcessMemoryInfo(void* process, void* ppsmemcounters, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessMemoryInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, ppsmemcounters, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)ppsmemcounters;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_getWsChanges(void* hprocess, void* lpwatchinfo, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWsChanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpwatchinfo, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpwatchinfo;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_getWsChangesEx(void* hprocess, void* lpwatchinfoex, void* cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWsChangesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpwatchinfoex, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpwatchinfoex;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_initializeProcessForWsWatch(void* hprocess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeProcessForWsWatch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_k32EmptyWorkingSet(void* hprocess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32EmptyWorkingSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_k32EnumDeviceDrivers(void* lpimagebase, uint32_t cb, void* lpcbneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32EnumDeviceDrivers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpimagebase, cb, lpcbneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpimagebase;
    (void)cb;
    (void)lpcbneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_k32EnumPageFilesA(void* pcallbackroutine, void* pcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32EnumPageFilesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcallbackroutine, pcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcallbackroutine;
    (void)pcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_k32EnumPageFilesW(void* pcallbackroutine, void* pcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32EnumPageFilesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcallbackroutine, pcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcallbackroutine;
    (void)pcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_k32EnumProcessModules(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32EnumProcessModules");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lphmodule, cb, lpcbneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lphmodule;
    (void)cb;
    (void)lpcbneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_k32EnumProcessModulesEx(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded, uint32_t dwfilterflag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32EnumProcessModulesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lphmodule, cb, lpcbneeded, dwfilterflag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lphmodule;
    (void)cb;
    (void)lpcbneeded;
    (void)dwfilterflag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_k32EnumProcesses(void* lpidprocess, uint32_t cb, void* lpcbneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32EnumProcesses");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpidprocess, cb, lpcbneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpidprocess;
    (void)cb;
    (void)lpcbneeded;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameA(void* imagebase, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetDeviceDriverBaseNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imagebase, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)imagebase;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameW(void* imagebase, void* lpbasename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetDeviceDriverBaseNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imagebase, lpbasename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)imagebase;
    (void)lpbasename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameA(void* imagebase, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetDeviceDriverFileNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imagebase, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)imagebase;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameW(void* imagebase, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetDeviceDriverFileNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imagebase, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)imagebase;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_k32GetMappedFileNameA(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetMappedFileNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpv, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)lpv;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_k32GetMappedFileNameW(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetMappedFileNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpv, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)lpv;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameA(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetModuleBaseNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, hmodule, lpbasename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpbasename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameW(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetModuleBaseNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, hmodule, lpbasename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpbasename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExA(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetModuleFileNameExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, hmodule, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExW(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetModuleFileNameExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, hmodule, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_k32GetModuleInformation(void* hprocess, void* hmodule, void* lpmodinfo, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetModuleInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, hmodule, lpmodinfo, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)hmodule;
    (void)lpmodinfo;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_k32GetPerformanceInfo(void* pperformanceinformation, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetPerformanceInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pperformanceinformation, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pperformanceinformation;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameA(void* hprocess, void* lpimagefilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetProcessImageFileNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpimagefilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)lpimagefilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameW(void* hprocess, void* lpimagefilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetProcessImageFileNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpimagefilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)lpimagefilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_k32GetProcessMemoryInfo(void* process, void* ppsmemcounters, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetProcessMemoryInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, ppsmemcounters, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)ppsmemcounters;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_k32GetWsChanges(void* hprocess, void* lpwatchinfo, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetWsChanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpwatchinfo, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpwatchinfo;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_k32GetWsChangesEx(void* hprocess, void* lpwatchinfoex, void* cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32GetWsChangesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpwatchinfoex, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpwatchinfoex;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_k32InitializeProcessForWsWatch(void* hprocess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32InitializeProcessForWsWatch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_k32QueryWorkingSet(void* hprocess, void* pv, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32QueryWorkingSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, pv, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)pv;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_k32QueryWorkingSetEx(void* hprocess, void* pv, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "K32QueryWorkingSetEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, pv, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)pv;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_queryWorkingSet(void* hprocess, void* pv, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryWorkingSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, pv, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)pv;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_processstatus_queryWorkingSetEx(void* hprocess, void* pv, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("psapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryWorkingSetEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, pv, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)pv;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

