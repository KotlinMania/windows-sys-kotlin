#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_memory_wrapper.h"
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

int32_t windowssys_windows_win32_system_memory_addSecureMemoryCacheCallback(void* pfncallback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddSecureMemoryCacheCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfncallback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfncallback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_allocateUserPhysicalPages(void* hprocess, void* numberofpages, void* pagearray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocateUserPhysicalPages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, numberofpages, pagearray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)numberofpages;
    (void)pagearray;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_allocateUserPhysicalPages2(void* objecthandle, void* numberofpages, void* pagearray, void* extendedparameters, uint32_t extendedparametercount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-8.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocateUserPhysicalPages2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecthandle, numberofpages, pagearray, extendedparameters, extendedparametercount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objecthandle;
    (void)numberofpages;
    (void)pagearray;
    (void)extendedparameters;
    (void)extendedparametercount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_allocateUserPhysicalPagesNuma(void* hprocess, void* numberofpages, void* pagearray, uint32_t nndpreferred) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocateUserPhysicalPagesNuma");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, numberofpages, pagearray, nndpreferred);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)numberofpages;
    (void)pagearray;
    (void)nndpreferred;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_memory_createFileMapping2(void* file, void* securityattributes, uint32_t desiredaccess, uint32_t pageprotection, uint32_t allocationattributes, uint64_t maximumsize, void* name, void* extendedparameters, uint32_t parametercount) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-7.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileMapping2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(file, securityattributes, desiredaccess, pageprotection, allocationattributes, maximumsize, name, extendedparameters, parametercount);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)file;
    (void)securityattributes;
    (void)desiredaccess;
    (void)pageprotection;
    (void)allocationattributes;
    (void)maximumsize;
    (void)name;
    (void)extendedparameters;
    (void)parametercount;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_memory_createFileMappingA(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileMappingA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpfilemappingattributes, flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hfile;
    (void)lpfilemappingattributes;
    (void)flprotect;
    (void)dwmaximumsizehigh;
    (void)dwmaximumsizelow;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_memory_createFileMappingFromApp(void* hfile, void* securityattributes, uint32_t pageprotection, uint64_t maximumsize, void* name) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileMappingFromApp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, securityattributes, pageprotection, maximumsize, name);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hfile;
    (void)securityattributes;
    (void)pageprotection;
    (void)maximumsize;
    (void)name;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_memory_createFileMappingNumaA(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname, uint32_t nndpreferred) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileMappingNumaA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpfilemappingattributes, flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname, nndpreferred);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hfile;
    (void)lpfilemappingattributes;
    (void)flprotect;
    (void)dwmaximumsizehigh;
    (void)dwmaximumsizelow;
    (void)lpname;
    (void)nndpreferred;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_memory_createFileMappingNumaW(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname, uint32_t nndpreferred) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileMappingNumaW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpfilemappingattributes, flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname, nndpreferred);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hfile;
    (void)lpfilemappingattributes;
    (void)flprotect;
    (void)dwmaximumsizehigh;
    (void)dwmaximumsizelow;
    (void)lpname;
    (void)nndpreferred;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_memory_createFileMappingW(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileMappingW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpfilemappingattributes, flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hfile;
    (void)lpfilemappingattributes;
    (void)flprotect;
    (void)dwmaximumsizehigh;
    (void)dwmaximumsizelow;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_memory_createMemoryResourceNotification(int32_t notificationtype) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMemoryResourceNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notificationtype);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)notificationtype;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_system_memory_discardVirtualMemory(void* virtualaddress, uint64_t size) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiscardVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualaddress, size);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualaddress;
    (void)size;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_memory_flushViewOfFile(void* lpbaseaddress, uint64_t dwnumberofbytestoflush) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushViewOfFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbaseaddress, dwnumberofbytestoflush);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpbaseaddress;
    (void)dwnumberofbytestoflush;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_freeUserPhysicalPages(void* hprocess, void* numberofpages, void* pagearray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeUserPhysicalPages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, numberofpages, pagearray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)numberofpages;
    (void)pagearray;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_system_memory_getLargePageMinimum(void) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLargePageMinimum");
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

int32_t windowssys_windows_win32_system_memory_getMemoryErrorHandlingCapabilities(void* capabilities) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMemoryErrorHandlingCapabilities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(capabilities);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)capabilities;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_memory_getProcessHeap(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessHeap");
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

uint32_t windowssys_windows_win32_system_memory_getProcessHeaps(uint32_t numberofheaps, void* processheaps) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessHeaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numberofheaps, processheaps);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)numberofheaps;
    (void)processheaps;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_memory_getProcessWorkingSetSizeEx(void* hprocess, void* lpminimumworkingsetsize, void* lpmaximumworkingsetsize, void* flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessWorkingSetSizeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpminimumworkingsetsize, lpmaximumworkingsetsize, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpminimumworkingsetsize;
    (void)lpmaximumworkingsetsize;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_getSystemFileCacheSize(void* lpminimumfilecachesize, void* lpmaximumfilecachesize, void* lpflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemFileCacheSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpminimumfilecachesize, lpmaximumfilecachesize, lpflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpminimumfilecachesize;
    (void)lpmaximumfilecachesize;
    (void)lpflags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_memory_getWriteWatch(uint32_t dwflags, void* lpbaseaddress, uint64_t dwregionsize, void* lpaddresses, void* lpdwcount, void* lpdwgranularity) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWriteWatch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpbaseaddress, dwregionsize, lpaddresses, lpdwcount, lpdwgranularity);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwflags;
    (void)lpbaseaddress;
    (void)dwregionsize;
    (void)lpaddresses;
    (void)lpdwcount;
    (void)lpdwgranularity;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_memory_globalAlloc(uint32_t uflags, uint64_t dwbytes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uflags, dwbytes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uflags;
    (void)dwbytes;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_system_memory_globalFlags(void* hmem) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmem);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmem;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_memory_globalHandle(void* pmem) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmem);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pmem;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_memory_globalLock(void* hmem) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalLock");
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

void* windowssys_windows_win32_system_memory_globalReAlloc(void* hmem, uint64_t dwbytes, uint32_t uflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalReAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmem, dwbytes, uflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hmem;
    (void)dwbytes;
    (void)uflags;
    errno = ENOSYS;
    return NULL;
#endif
}

uint64_t windowssys_windows_win32_system_memory_globalSize(void* hmem) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmem);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmem;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_memory_globalUnlock(void* hmem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GlobalUnlock");
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

void* windowssys_windows_win32_system_memory_heapAlloc(void* hheap, uint32_t dwflags, uint64_t dwbytes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hheap, dwflags, dwbytes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hheap;
    (void)dwflags;
    (void)dwbytes;
    errno = ENOSYS;
    return NULL;
#endif
}

uint64_t windowssys_windows_win32_system_memory_heapCompact(void* hheap, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapCompact");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hheap, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hheap;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_memory_heapCreate(uint32_t floptions, uint64_t dwinitialsize, uint64_t dwmaximumsize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(floptions, dwinitialsize, dwmaximumsize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)floptions;
    (void)dwinitialsize;
    (void)dwmaximumsize;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_memory_heapDestroy(void* hheap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapDestroy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hheap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hheap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_heapFree(void* hheap, uint32_t dwflags, void* lpmem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hheap, dwflags, lpmem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hheap;
    (void)dwflags;
    (void)lpmem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_heapLock(void* hheap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hheap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hheap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_heapQueryInformation(void* heaphandle, int32_t heapinformationclass, void* heapinformation, uint64_t heapinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapQueryInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heaphandle, heapinformationclass, heapinformation, heapinformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heaphandle;
    (void)heapinformationclass;
    (void)heapinformation;
    (void)heapinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_memory_heapReAlloc(void* hheap, uint32_t dwflags, void* lpmem, uint64_t dwbytes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapReAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hheap, dwflags, lpmem, dwbytes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hheap;
    (void)dwflags;
    (void)lpmem;
    (void)dwbytes;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_memory_heapSetInformation(void* heaphandle, int32_t heapinformationclass, void* heapinformation, uint64_t heapinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapSetInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(heaphandle, heapinformationclass, heapinformation, heapinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)heaphandle;
    (void)heapinformationclass;
    (void)heapinformation;
    (void)heapinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_system_memory_heapSize(void* hheap, uint32_t dwflags, void* lpmem) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hheap, dwflags, lpmem);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hheap;
    (void)dwflags;
    (void)lpmem;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_memory_heapSummary(void* hheap, uint32_t dwflags, void* lpsummary) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapSummary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hheap, dwflags, lpsummary);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hheap;
    (void)dwflags;
    (void)lpsummary;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_heapUnlock(void* hheap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapUnlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hheap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hheap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_heapValidate(void* hheap, uint32_t dwflags, void* lpmem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapValidate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hheap, dwflags, lpmem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hheap;
    (void)dwflags;
    (void)lpmem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_heapWalk(void* hheap, void* lpentry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HeapWalk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hheap, lpentry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hheap;
    (void)lpentry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_isBadReadPtr(void* lp, uint64_t ucb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsBadReadPtr");
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

int32_t windowssys_windows_win32_system_memory_isBadStringPtrA(void* lpsz, uint64_t ucchmax) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsBadStringPtrA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz, ucchmax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsz;
    (void)ucchmax;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_isBadStringPtrW(void* lpsz, uint64_t ucchmax) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsBadStringPtrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz, ucchmax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsz;
    (void)ucchmax;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_isBadWritePtr(void* lp, uint64_t ucb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsBadWritePtr");
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

void* windowssys_windows_win32_system_memory_localAlloc(uint32_t uflags, uint64_t ubytes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uflags, ubytes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uflags;
    (void)ubytes;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_system_memory_localFlags(void* hmem) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmem);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmem;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_memory_localHandle(void* pmem) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmem);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pmem;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_memory_localLock(void* hmem) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalLock");
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

void* windowssys_windows_win32_system_memory_localReAlloc(void* hmem, uint64_t ubytes, uint32_t uflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalReAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmem, ubytes, uflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hmem;
    (void)ubytes;
    (void)uflags;
    errno = ENOSYS;
    return NULL;
#endif
}

uint64_t windowssys_windows_win32_system_memory_localSize(void* hmem) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmem);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmem;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_memory_localUnlock(void* hmem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalUnlock");
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

int32_t windowssys_windows_win32_system_memory_mapUserPhysicalPages(void* virtualaddress, uint64_t numberofpages, void* pagearray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapUserPhysicalPages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualaddress, numberofpages, pagearray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)virtualaddress;
    (void)numberofpages;
    (void)pagearray;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_mapUserPhysicalPagesScatter(void* virtualaddresses, uint64_t numberofpages, void* pagearray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapUserPhysicalPagesScatter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualaddresses, numberofpages, pagearray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)virtualaddresses;
    (void)numberofpages;
    (void)pagearray;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_memory_offerVirtualMemory(void* virtualaddress, uint64_t size, int32_t priority) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfferVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualaddress, size, priority);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualaddress;
    (void)size;
    (void)priority;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_memory_openDedicatedMemoryPartition(void* partition, uint64_t dedicatedmemorytypeid, uint32_t desiredaccess, int32_t inherithandle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-8.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenDedicatedMemoryPartition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, dedicatedmemorytypeid, desiredaccess, inherithandle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)partition;
    (void)dedicatedmemorytypeid;
    (void)desiredaccess;
    (void)inherithandle;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_memory_openFileMappingA(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenFileMappingA");
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

void* windowssys_windows_win32_system_memory_openFileMappingFromApp(uint32_t desiredaccess, int32_t inherithandle, void* name) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-3.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenFileMappingFromApp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(desiredaccess, inherithandle, name);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)desiredaccess;
    (void)inherithandle;
    (void)name;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_memory_openFileMappingW(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenFileMappingW");
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

int32_t windowssys_windows_win32_system_memory_prefetchVirtualMemory(void* hprocess, uint64_t numberofentries, void* virtualaddresses, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrefetchVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, numberofentries, virtualaddresses, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)numberofentries;
    (void)virtualaddresses;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_queryMemoryResourceNotification(void* resourcenotificationhandle, void* resourcestate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryMemoryResourceNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcenotificationhandle, resourcestate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcenotificationhandle;
    (void)resourcestate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_queryPartitionInformation(void* partition, int32_t partitioninformationclass, void* partitioninformation, uint32_t partitioninformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-8.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryPartitionInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, partitioninformationclass, partitioninformation, partitioninformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)partitioninformationclass;
    (void)partitioninformation;
    (void)partitioninformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_queryVirtualMemoryInformation(void* process, void* virtualaddress, int32_t memoryinformationclass, void* memoryinformation, uint64_t memoryinformationsize, void* returnsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryVirtualMemoryInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, virtualaddress, memoryinformationclass, memoryinformation, memoryinformationsize, returnsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)virtualaddress;
    (void)memoryinformationclass;
    (void)memoryinformation;
    (void)memoryinformationsize;
    (void)returnsize;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_memory_reclaimVirtualMemory(void* virtualaddress, uint64_t size) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReclaimVirtualMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualaddress, size);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualaddress;
    (void)size;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_memory_registerBadMemoryNotification(void* callback) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterBadMemoryNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)callback;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_memory_removeSecureMemoryCacheCallback(void* pfncallback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveSecureMemoryCacheCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfncallback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfncallback;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_memory_resetWriteWatch(void* lpbaseaddress, uint64_t dwregionsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetWriteWatch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbaseaddress, dwregionsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpbaseaddress;
    (void)dwregionsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_system_memory_rtlCompareMemory(void* source1, void* source2, uint64_t length) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompareMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(source1, source2, length);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)source1;
    (void)source2;
    (void)length;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_memory_rtlCrc32(void* buffer, uint64_t size, uint32_t initialcrc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCrc32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer, size, initialcrc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffer;
    (void)size;
    (void)initialcrc;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_system_memory_rtlCrc64(void* buffer, uint64_t size, uint64_t initialcrc) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCrc64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer, size, initialcrc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffer;
    (void)size;
    (void)initialcrc;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssys_windows_win32_system_memory_rtlIsZeroMemory(void* buffer, uint64_t length) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsZeroMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer, length);
    }
    errno = ENOSYS;
    return false;
#else
    (void)buffer;
    (void)length;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_system_memory_setProcessValidCallTargets(void* hprocess, void* virtualaddress, uint64_t regionsize, uint32_t numberofoffsets, void* offsetinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-3.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessValidCallTargets");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, virtualaddress, regionsize, numberofoffsets, offsetinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)virtualaddress;
    (void)regionsize;
    (void)numberofoffsets;
    (void)offsetinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_setProcessValidCallTargetsForMappedView(void* process, void* virtualaddress, uint64_t regionsize, uint32_t numberofoffsets, void* offsetinformation, void* section, uint64_t expectedfileoffset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-7.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessValidCallTargetsForMappedView");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, virtualaddress, regionsize, numberofoffsets, offsetinformation, section, expectedfileoffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)virtualaddress;
    (void)regionsize;
    (void)numberofoffsets;
    (void)offsetinformation;
    (void)section;
    (void)expectedfileoffset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_setProcessWorkingSetSizeEx(void* hprocess, uint64_t dwminimumworkingsetsize, uint64_t dwmaximumworkingsetsize, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessWorkingSetSizeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, dwminimumworkingsetsize, dwmaximumworkingsetsize, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)dwminimumworkingsetsize;
    (void)dwmaximumworkingsetsize;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_setSystemFileCacheSize(uint64_t minimumfilecachesize, uint64_t maximumfilecachesize, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemFileCacheSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(minimumfilecachesize, maximumfilecachesize, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)minimumfilecachesize;
    (void)maximumfilecachesize;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_unregisterBadMemoryNotification(void* registrationhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterBadMemoryNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(registrationhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)registrationhandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_memory_virtualAlloc(void* lpaddress, uint64_t dwsize, uint32_t flallocationtype, uint32_t flprotect) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpaddress, dwsize, flallocationtype, flprotect);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpaddress;
    (void)dwsize;
    (void)flallocationtype;
    (void)flprotect;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_memory_virtualAlloc2(void* process, void* baseaddress, uint64_t size, uint32_t allocationtype, uint32_t pageprotection, void* extendedparameters, uint32_t parametercount) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-6.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualAlloc2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, baseaddress, size, allocationtype, pageprotection, extendedparameters, parametercount);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)process;
    (void)baseaddress;
    (void)size;
    (void)allocationtype;
    (void)pageprotection;
    (void)extendedparameters;
    (void)parametercount;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_memory_virtualAlloc2FromApp(void* process, void* baseaddress, uint64_t size, uint32_t allocationtype, uint32_t pageprotection, void* extendedparameters, uint32_t parametercount) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-6.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualAlloc2FromApp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, baseaddress, size, allocationtype, pageprotection, extendedparameters, parametercount);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)process;
    (void)baseaddress;
    (void)size;
    (void)allocationtype;
    (void)pageprotection;
    (void)extendedparameters;
    (void)parametercount;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_memory_virtualAllocEx(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t flallocationtype, uint32_t flprotect) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualAllocEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpaddress, dwsize, flallocationtype, flprotect);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)lpaddress;
    (void)dwsize;
    (void)flallocationtype;
    (void)flprotect;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_memory_virtualAllocExNuma(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t flallocationtype, uint32_t flprotect, uint32_t nndpreferred) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualAllocExNuma");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpaddress, dwsize, flallocationtype, flprotect, nndpreferred);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)lpaddress;
    (void)dwsize;
    (void)flallocationtype;
    (void)flprotect;
    (void)nndpreferred;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_memory_virtualAllocFromApp(void* baseaddress, uint64_t size, uint32_t allocationtype, uint32_t protection) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-3.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualAllocFromApp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(baseaddress, size, allocationtype, protection);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)baseaddress;
    (void)size;
    (void)allocationtype;
    (void)protection;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_memory_virtualFree(void* lpaddress, uint64_t dwsize, uint32_t dwfreetype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpaddress, dwsize, dwfreetype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpaddress;
    (void)dwsize;
    (void)dwfreetype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_virtualFreeEx(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t dwfreetype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualFreeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpaddress, dwsize, dwfreetype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpaddress;
    (void)dwsize;
    (void)dwfreetype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_virtualLock(void* lpaddress, uint64_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpaddress, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpaddress;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_virtualProtect(void* lpaddress, uint64_t dwsize, uint32_t flnewprotect, void* lpfloldprotect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualProtect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpaddress, dwsize, flnewprotect, lpfloldprotect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpaddress;
    (void)dwsize;
    (void)flnewprotect;
    (void)lpfloldprotect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_virtualProtectEx(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t flnewprotect, void* lpfloldprotect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualProtectEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpaddress, dwsize, flnewprotect, lpfloldprotect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpaddress;
    (void)dwsize;
    (void)flnewprotect;
    (void)lpfloldprotect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_virtualProtectFromApp(void* address, uint64_t size, uint32_t newprotection, void* oldprotection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-3.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualProtectFromApp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address, size, newprotection, oldprotection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)address;
    (void)size;
    (void)newprotection;
    (void)oldprotection;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_system_memory_virtualQuery(void* lpaddress, void* lpbuffer, uint64_t dwlength) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualQuery");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpaddress, lpbuffer, dwlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpaddress;
    (void)lpbuffer;
    (void)dwlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_system_memory_virtualQueryEx(void* hprocess, void* lpaddress, void* lpbuffer, uint64_t dwlength) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualQueryEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpaddress, lpbuffer, dwlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)lpaddress;
    (void)lpbuffer;
    (void)dwlength;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_memory_virtualUnlock(void* lpaddress, uint64_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualUnlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpaddress, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpaddress;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_memory_virtualUnlockEx(void* process, void* address, uint64_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-memory-l1-1-5.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualUnlockEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, address, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)address;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

