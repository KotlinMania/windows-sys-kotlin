#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_hypervisor_wrapper.h"
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

int32_t windowssys_windows_win32_system_hypervisor_applyGuestMemoryFix(void* vmsavedstatedumphandle, uint32_t vpid, uint64_t virtualaddress, void* fixbuffer, uint32_t fixbuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyGuestMemoryFix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, virtualaddress, fixbuffer, fixbuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualaddress;
    (void)fixbuffer;
    (void)fixbuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_applyPendingSavedStateFileReplayLog(void* vmrsfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPendingSavedStateFileReplayLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmrsfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmrsfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_callStackUnwind(void* vmsavedstatedumphandle, uint32_t vpid, void* imageinfo, uint32_t imageinfocount, uint32_t framecount, void* callstack) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallStackUnwind");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, imageinfo, imageinfocount, framecount, callstack);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)imageinfo;
    (void)imageinfocount;
    (void)framecount;
    (void)callstack;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_findSavedStateSymbolFieldInType(void* vmsavedstatedumphandle, uint32_t vpid, void* arg_2_typename, void* fieldname, void* offset, void* found) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindSavedStateSymbolFieldInType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, arg_2_typename, fieldname, offset, found);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg_2_typename;
    (void)fieldname;
    (void)offset;
    (void)found;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_forceActiveVirtualTrustLevel(void* vmsavedstatedumphandle, uint32_t vpid, uint8_t virtualtrustlevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ForceActiveVirtualTrustLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, virtualtrustlevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualtrustlevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_forceArchitecture(void* vmsavedstatedumphandle, uint32_t vpid, int32_t architecture) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ForceArchitecture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, architecture);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)architecture;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_forceNestedHostMode(void* vmsavedstatedumphandle, uint32_t vpid, int32_t hostmode, void* oldmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ForceNestedHostMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, hostmode, oldmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)hostmode;
    (void)oldmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_forcePagingMode(void* vmsavedstatedumphandle, uint32_t vpid, int32_t pagingmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ForcePagingMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, pagingmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)pagingmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_getActiveVirtualTrustLevel(void* vmsavedstatedumphandle, uint32_t vpid, void* virtualtrustlevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetActiveVirtualTrustLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, virtualtrustlevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualtrustlevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_getArchitecture(void* vmsavedstatedumphandle, uint32_t vpid, void* architecture) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetArchitecture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, architecture);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)architecture;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_getEnabledVirtualTrustLevels(void* vmsavedstatedumphandle, uint32_t vpid, void* virtualtrustlevels) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnabledVirtualTrustLevels");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, virtualtrustlevels);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualtrustlevels;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_getGuestEnabledVirtualTrustLevels(void* vmsavedstatedumphandle, void* virtualtrustlevels) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGuestEnabledVirtualTrustLevels");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, virtualtrustlevels);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)virtualtrustlevels;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_getGuestOsInfo(void* vmsavedstatedumphandle, uint8_t virtualtrustlevel, void* guestosinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGuestOsInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, virtualtrustlevel, guestosinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)virtualtrustlevel;
    (void)guestosinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_getGuestPhysicalMemoryChunks(void* vmsavedstatedumphandle, void* memorychunkpagesize, void* memorychunks, void* memorychunkcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGuestPhysicalMemoryChunks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, memorychunkpagesize, memorychunks, memorychunkcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)memorychunkpagesize;
    (void)memorychunks;
    (void)memorychunkcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_getGuestRawSavedMemorySize(void* vmsavedstatedumphandle, void* guestrawsavedmemorysize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGuestRawSavedMemorySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, guestrawsavedmemorysize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)guestrawsavedmemorysize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_getMemoryBlockCacheLimit(void* vmsavedstatedumphandle, void* memoryblockcachelimit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMemoryBlockCacheLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, memoryblockcachelimit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)memoryblockcachelimit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_getNestedVirtualizationMode(void* vmsavedstatedumphandle, uint32_t vpid, void* enabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNestedVirtualizationMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, enabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)enabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_getPagingMode(void* vmsavedstatedumphandle, uint32_t vpid, void* pagingmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPagingMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, pagingmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)pagingmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_getRegisterValue(void* vmsavedstatedumphandle, uint32_t vpid, uint32_t registerid, void* registervalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRegisterValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, registerid, registervalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)registerid;
    (void)registervalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_getSavedStateSymbolFieldInfo(void* vmsavedstatedumphandle, uint32_t vpid, void* arg_2_typename, void* typefieldinfomap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSavedStateSymbolFieldInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, arg_2_typename, typefieldinfomap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg_2_typename;
    (void)typefieldinfomap;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_hypervisor_getSavedStateSymbolProviderHandle(void* vmsavedstatedumphandle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSavedStateSymbolProviderHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)vmsavedstatedumphandle;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_getSavedStateSymbolTypeSize(void* vmsavedstatedumphandle, uint32_t vpid, void* arg_2_typename, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSavedStateSymbolTypeSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, arg_2_typename, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg_2_typename;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_getVpCount(void* vmsavedstatedumphandle, void* vpcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVpCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_guestPhysicalAddressToRawSavedMemoryOffset(void* vmsavedstatedumphandle, uint64_t physicaladdress, void* rawsavedmemoryoffset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GuestPhysicalAddressToRawSavedMemoryOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, physicaladdress, rawsavedmemoryoffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)physicaladdress;
    (void)rawsavedmemoryoffset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_guestVirtualAddressToPhysicalAddress(void* vmsavedstatedumphandle, uint32_t vpid, uint64_t virtualaddress, void* physicaladdress, void* unmappedregionsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GuestVirtualAddressToPhysicalAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, virtualaddress, physicaladdress, unmappedregionsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualaddress;
    (void)physicaladdress;
    (void)unmappedregionsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_hdvCreateDeviceInstance(void* devicehosthandle, int32_t devicetype, void* deviceclassid, void* deviceinstanceid, void* deviceinterface, void* devicecontext, void* devicehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvCreateDeviceInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicehosthandle, devicetype, deviceclassid, deviceinstanceid, deviceinterface, devicecontext, devicehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)devicehosthandle;
    (void)devicetype;
    (void)deviceclassid;
    (void)deviceinstanceid;
    (void)deviceinterface;
    (void)devicecontext;
    (void)devicehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_hdvCreateGuestMemoryAperture(void* requestor, uint64_t guestphysicaladdress, uint32_t bytecount, int32_t writeprotected, void* mappedaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvCreateGuestMemoryAperture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestor, guestphysicaladdress, bytecount, writeprotected, mappedaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)requestor;
    (void)guestphysicaladdress;
    (void)bytecount;
    (void)writeprotected;
    (void)mappedaddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_hdvCreateSectionBackedMmioRange(void* requestor, int32_t barindex, uint64_t offsetinpages, uint64_t lengthinpages, int32_t mappingflags, void* sectionhandle, uint64_t sectionoffsetinpages) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, uint64_t, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvCreateSectionBackedMmioRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestor, barindex, offsetinpages, lengthinpages, mappingflags, sectionhandle, sectionoffsetinpages);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)requestor;
    (void)barindex;
    (void)offsetinpages;
    (void)lengthinpages;
    (void)mappingflags;
    (void)sectionhandle;
    (void)sectionoffsetinpages;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_hdvDeliverGuestInterrupt(void* requestor, uint64_t msiaddress, uint32_t msidata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvDeliverGuestInterrupt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestor, msiaddress, msidata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)requestor;
    (void)msiaddress;
    (void)msidata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_hdvDestroyGuestMemoryAperture(void* requestor, void* mappedaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvDestroyGuestMemoryAperture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestor, mappedaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)requestor;
    (void)mappedaddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_hdvDestroySectionBackedMmioRange(void* requestor, int32_t barindex, uint64_t offsetinpages) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvDestroySectionBackedMmioRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestor, barindex, offsetinpages);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)requestor;
    (void)barindex;
    (void)offsetinpages;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHost(void* computesystem, void* devicehosthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvInitializeDeviceHost");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, devicehosthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)devicehosthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHostEx(void* computesystem, int32_t flags, void* devicehosthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvInitializeDeviceHostEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, flags, devicehosthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)flags;
    (void)devicehosthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_hdvReadGuestMemory(void* requestor, uint64_t guestphysicaladdress, uint32_t bytecount, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvReadGuestMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestor, guestphysicaladdress, bytecount, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)requestor;
    (void)guestphysicaladdress;
    (void)bytecount;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_hdvRegisterDoorbell(void* requestor, int32_t barindex, uint64_t baroffset, uint64_t triggervalue, uint64_t flags, void* doorbellevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvRegisterDoorbell");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestor, barindex, baroffset, triggervalue, flags, doorbellevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)requestor;
    (void)barindex;
    (void)baroffset;
    (void)triggervalue;
    (void)flags;
    (void)doorbellevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_hdvTeardownDeviceHost(void* devicehosthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvTeardownDeviceHost");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(devicehosthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)devicehosthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_hdvUnregisterDoorbell(void* requestor, int32_t barindex, uint64_t baroffset, uint64_t triggervalue, uint64_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvUnregisterDoorbell");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestor, barindex, baroffset, triggervalue, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)requestor;
    (void)barindex;
    (void)baroffset;
    (void)triggervalue;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_hdvWriteGuestMemory(void* requestor, uint64_t guestphysicaladdress, uint32_t bytecount, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvWriteGuestMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestor, guestphysicaladdress, bytecount, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)requestor;
    (void)guestphysicaladdress;
    (void)bytecount;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_inKernelSpace(void* vmsavedstatedumphandle, uint32_t vpid, void* inkernelspace) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InKernelSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, inkernelspace);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)inkernelspace;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_isActiveVirtualTrustLevelEnabled(void* vmsavedstatedumphandle, uint32_t vpid, void* activevirtualtrustlevelenabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsActiveVirtualTrustLevelEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, activevirtualtrustlevelenabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)activevirtualtrustlevelenabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_isNestedVirtualizationEnabled(void* vmsavedstatedumphandle, void* enabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsNestedVirtualizationEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, enabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)enabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_loadSavedStateFile(void* vmrsfile, void* vmsavedstatedumphandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadSavedStateFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmrsfile, vmsavedstatedumphandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmrsfile;
    (void)vmsavedstatedumphandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_loadSavedStateFiles(void* binfile, void* vsvfile, void* vmsavedstatedumphandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadSavedStateFiles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binfile, vsvfile, vmsavedstatedumphandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)binfile;
    (void)vsvfile;
    (void)vmsavedstatedumphandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbols(void* vmsavedstatedumphandle, void* imagename, void* modulename, uint64_t baseaddress, uint32_t sizeofbase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadSavedStateModuleSymbols");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, imagename, modulename, baseaddress, sizeofbase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)imagename;
    (void)modulename;
    (void)baseaddress;
    (void)sizeofbase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbolsEx(void* vmsavedstatedumphandle, void* imagename, uint32_t imagetimestamp, void* modulename, uint64_t baseaddress, uint32_t sizeofbase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadSavedStateModuleSymbolsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, imagename, imagetimestamp, modulename, baseaddress, sizeofbase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)imagename;
    (void)imagetimestamp;
    (void)modulename;
    (void)baseaddress;
    (void)sizeofbase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_loadSavedStateSymbolProvider(void* vmsavedstatedumphandle, void* usersymbols, int32_t force) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadSavedStateSymbolProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, usersymbols, force);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)usersymbols;
    (void)force;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_locateSavedStateFiles(void* vmname, void* snapshotname, void* binpath, void* vsvpath, void* vmrspath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocateSavedStateFiles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmname, snapshotname, binpath, vsvpath, vmrspath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmname;
    (void)snapshotname;
    (void)binpath;
    (void)vsvpath;
    (void)vmrspath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_readGuestPhysicalAddress(void* vmsavedstatedumphandle, uint64_t physicaladdress, void* buffer, uint32_t buffersize, void* bytesread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadGuestPhysicalAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, physicaladdress, buffer, buffersize, bytesread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)physicaladdress;
    (void)buffer;
    (void)buffersize;
    (void)bytesread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_readGuestRawSavedMemory(void* vmsavedstatedumphandle, uint64_t rawsavedmemoryoffset, void* buffer, uint32_t buffersize, void* bytesread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadGuestRawSavedMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, rawsavedmemoryoffset, buffer, buffersize, bytesread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)rawsavedmemoryoffset;
    (void)buffer;
    (void)buffersize;
    (void)bytesread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_readSavedStateGlobalVariable(void* vmsavedstatedumphandle, uint32_t vpid, void* globalname, void* buffer, uint32_t buffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadSavedStateGlobalVariable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, globalname, buffer, buffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)globalname;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_releaseSavedStateFiles(void* vmsavedstatedumphandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseSavedStateFiles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_releaseSavedStateSymbolProvider(void* vmsavedstatedumphandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseSavedStateSymbolProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_resolveSavedStateGlobalVariableAddress(void* vmsavedstatedumphandle, uint32_t vpid, void* globalname, void* virtualaddress, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResolveSavedStateGlobalVariableAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, globalname, virtualaddress, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)globalname;
    (void)virtualaddress;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_scanMemoryForDosImages(void* vmsavedstatedumphandle, uint32_t vpid, uint64_t startaddress, uint64_t endaddress, void* callbackcontext, void* foundimagecallback, void* standaloneaddress, uint32_t standaloneaddresscount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScanMemoryForDosImages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, vpid, startaddress, endaddress, callbackcontext, foundimagecallback, standaloneaddress, standaloneaddresscount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)startaddress;
    (void)endaddress;
    (void)callbackcontext;
    (void)foundimagecallback;
    (void)standaloneaddress;
    (void)standaloneaddresscount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_setMemoryBlockCacheLimit(void* vmsavedstatedumphandle, uint64_t memoryblockcachelimit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMemoryBlockCacheLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, memoryblockcachelimit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)memoryblockcachelimit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_setSavedStateSymbolProviderDebugInfoCallback(void* vmsavedstatedumphandle, void* callback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSavedStateSymbolProviderDebugInfoCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmsavedstatedumphandle, callback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmsavedstatedumphandle;
    (void)callback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvAcceptPartitionMigration(void* migrationhandle, void* partition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvAcceptPartitionMigration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(migrationhandle, partition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)migrationhandle;
    (void)partition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvAdviseGpaRange(int64_t partition, void* gparanges, uint32_t gparangescount, int32_t advice, void* advicebuffer, uint32_t advicebuffersizeinbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvAdviseGpaRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, gparanges, gparangescount, advice, advicebuffer, advicebuffersizeinbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)gparanges;
    (void)gparangescount;
    (void)advice;
    (void)advicebuffer;
    (void)advicebuffersizeinbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvAllocateVpciResource(void* providerid, int32_t flags, void* resourcedescriptor, uint32_t resourcedescriptorsizeinbytes, void* vpciresource) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvAllocateVpciResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(providerid, flags, resourcedescriptor, resourcedescriptorsizeinbytes, vpciresource);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)providerid;
    (void)flags;
    (void)resourcedescriptor;
    (void)resourcedescriptorsizeinbytes;
    (void)vpciresource;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvCancelPartitionMigration(int64_t partition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCancelPartitionMigration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvCancelRunVirtualProcessor(int64_t partition, uint32_t vpindex, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCancelRunVirtualProcessor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvCompletePartitionMigration(int64_t partition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCompletePartitionMigration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvCreateNotificationPort(int64_t partition, void* parameters, void* eventhandle, void* porthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreateNotificationPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, parameters, eventhandle, porthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)parameters;
    (void)eventhandle;
    (void)porthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvCreatePartition(void* partition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreatePartition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvCreateTrigger(int64_t partition, void* parameters, void* triggerhandle, void* eventhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreateTrigger");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, parameters, triggerhandle, eventhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)parameters;
    (void)triggerhandle;
    (void)eventhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor(int64_t partition, uint32_t vpindex, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreateVirtualProcessor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor2(int64_t partition, uint32_t vpindex, void* properties, uint32_t propertycount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreateVirtualProcessor2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, properties, propertycount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)properties;
    (void)propertycount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvCreateVpciDevice(int64_t partition, uint64_t logicaldeviceid, void* vpciresource, int32_t flags, void* notificationeventhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreateVpciDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, logicaldeviceid, vpciresource, flags, notificationeventhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)vpciresource;
    (void)flags;
    (void)notificationeventhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvDeleteNotificationPort(int64_t partition, void* porthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvDeleteNotificationPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, porthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)porthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvDeletePartition(int64_t partition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvDeletePartition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvDeleteTrigger(int64_t partition, void* triggerhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvDeleteTrigger");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, triggerhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)triggerhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvDeleteVirtualProcessor(int64_t partition, uint32_t vpindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvDeleteVirtualProcessor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvDeleteVpciDevice(int64_t partition, uint64_t logicaldeviceid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvDeleteVpciDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, logicaldeviceid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvEmulatorCreateEmulator(void* callbacks, void* emulator) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvEmulatorCreateEmulator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbacks, emulator);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbacks;
    (void)emulator;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvEmulatorDestroyEmulator(void* emulator) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvEmulatorDestroyEmulator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(emulator);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)emulator;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvEmulatorTryIoEmulation(void* emulator, void* context, void* vpcontext, void* ioinstructioncontext, void* emulatorreturnstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvEmulatorTryIoEmulation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(emulator, context, vpcontext, ioinstructioncontext, emulatorreturnstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)emulator;
    (void)context;
    (void)vpcontext;
    (void)ioinstructioncontext;
    (void)emulatorreturnstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvEmulatorTryMmioEmulation(void* emulator, void* context, void* vpcontext, void* mmioinstructioncontext, void* emulatorreturnstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvEmulatorTryMmioEmulation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(emulator, context, vpcontext, mmioinstructioncontext, emulatorreturnstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)emulator;
    (void)context;
    (void)vpcontext;
    (void)mmioinstructioncontext;
    (void)emulatorreturnstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvGetCapability(int32_t capabilitycode, void* capabilitybuffer, uint32_t capabilitybuffersizeinbytes, void* writtensizeinbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetCapability");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(capabilitycode, capabilitybuffer, capabilitybuffersizeinbytes, writtensizeinbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)capabilitycode;
    (void)capabilitybuffer;
    (void)capabilitybuffersizeinbytes;
    (void)writtensizeinbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvGetInterruptTargetVpSet(int64_t partition, uint64_t destination, int32_t destinationmode, void* targetvps, uint32_t vpcount, void* targetvpcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetInterruptTargetVpSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, destination, destinationmode, targetvps, vpcount, targetvpcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)destination;
    (void)destinationmode;
    (void)targetvps;
    (void)vpcount;
    (void)targetvpcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvGetPartitionCounters(int64_t partition, int32_t counterset, void* buffer, uint32_t buffersizeinbytes, void* byteswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetPartitionCounters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, counterset, buffer, buffersizeinbytes, byteswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)counterset;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvGetPartitionProperty(int64_t partition, int32_t propertycode, void* propertybuffer, uint32_t propertybuffersizeinbytes, void* writtensizeinbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetPartitionProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, propertycode, propertybuffer, propertybuffersizeinbytes, writtensizeinbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)propertycode;
    (void)propertybuffer;
    (void)propertybuffersizeinbytes;
    (void)writtensizeinbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCounters(int64_t partition, uint32_t vpindex, int32_t counterset, void* buffer, uint32_t buffersizeinbytes, void* byteswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorCounters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, counterset, buffer, buffersizeinbytes, byteswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)counterset;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCpuidOutput(int64_t partition, uint32_t vpindex, uint32_t eax, uint32_t ecx, void* cpuidoutput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorCpuidOutput");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, eax, ecx, cpuidoutput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)eax;
    (void)ecx;
    (void)cpuidoutput;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize, void* writtensize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorInterruptControllerState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, state, statesize, writtensize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    (void)writtensize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState2(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize, void* writtensize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorInterruptControllerState2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, state, statesize, writtensize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    (void)writtensize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorRegisters(int64_t partition, uint32_t vpindex, void* registernames, uint32_t registercount, void* registervalues) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorRegisters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, registernames, registercount, registervalues);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)registernames;
    (void)registercount;
    (void)registervalues;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorState(int64_t partition, uint32_t vpindex, int32_t statetype, void* buffer, uint32_t buffersizeinbytes, void* byteswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, statetype, buffer, buffersizeinbytes, byteswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)statetype;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorXsaveState(int64_t partition, uint32_t vpindex, void* buffer, uint32_t buffersizeinbytes, void* byteswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorXsaveState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, buffer, buffersizeinbytes, byteswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceInterruptTarget(int64_t partition, uint64_t logicaldeviceid, uint32_t arg_2_index, uint32_t multimessagenumber, void* target, uint32_t targetsizeinbytes, void* byteswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVpciDeviceInterruptTarget");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, logicaldeviceid, arg_2_index, multimessagenumber, target, targetsizeinbytes, byteswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_index;
    (void)multimessagenumber;
    (void)target;
    (void)targetsizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceNotification(int64_t partition, uint64_t logicaldeviceid, void* notification, uint32_t notificationsizeinbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVpciDeviceNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, logicaldeviceid, notification, notificationsizeinbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)notification;
    (void)notificationsizeinbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceProperty(int64_t partition, uint64_t logicaldeviceid, int32_t propertycode, void* propertybuffer, uint32_t propertybuffersizeinbytes, void* writtensizeinbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVpciDeviceProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, logicaldeviceid, propertycode, propertybuffer, propertybuffersizeinbytes, writtensizeinbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)propertycode;
    (void)propertybuffer;
    (void)propertybuffersizeinbytes;
    (void)writtensizeinbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvMapGpaRange(int64_t partition, void* sourceaddress, uint64_t guestaddress, uint64_t sizeinbytes, int32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvMapGpaRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, sourceaddress, guestaddress, sizeinbytes, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)sourceaddress;
    (void)guestaddress;
    (void)sizeinbytes;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvMapGpaRange2(int64_t partition, void* process, void* sourceaddress, uint64_t guestaddress, uint64_t sizeinbytes, int32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvMapGpaRange2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, process, sourceaddress, guestaddress, sizeinbytes, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)process;
    (void)sourceaddress;
    (void)guestaddress;
    (void)sizeinbytes;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint32_t arg_2_index, uint32_t messagecount, void* target, void* msiaddress, void* msidata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvMapVpciDeviceInterrupt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, logicaldeviceid, arg_2_index, messagecount, target, msiaddress, msidata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_index;
    (void)messagecount;
    (void)target;
    (void)msiaddress;
    (void)msidata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceMmioRanges(int64_t partition, uint64_t logicaldeviceid, void* mappingcount, void* mappings) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvMapVpciDeviceMmioRanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, logicaldeviceid, mappingcount, mappings);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)mappingcount;
    (void)mappings;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvPostVirtualProcessorSynicMessage(int64_t partition, uint32_t vpindex, uint32_t sintindex, void* message, uint32_t messagesizeinbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvPostVirtualProcessorSynicMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, sintindex, message, messagesizeinbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)sintindex;
    (void)message;
    (void)messagesizeinbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvQueryGpaRangeDirtyBitmap(int64_t partition, uint64_t guestaddress, uint64_t rangesizeinbytes, void* bitmap, uint32_t bitmapsizeinbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvQueryGpaRangeDirtyBitmap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, guestaddress, rangesizeinbytes, bitmap, bitmapsizeinbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)guestaddress;
    (void)rangesizeinbytes;
    (void)bitmap;
    (void)bitmapsizeinbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvReadVpciDeviceRegister(int64_t partition, uint64_t logicaldeviceid, void* arg_2_register, void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvReadVpciDeviceRegister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, logicaldeviceid, arg_2_register, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_register;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvRegisterPartitionDoorbellEvent(int64_t partition, void* matchdata, void* eventhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvRegisterPartitionDoorbellEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, matchdata, eventhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)matchdata;
    (void)eventhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvRequestInterrupt(int64_t partition, void* interrupt, uint32_t interruptcontrolsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvRequestInterrupt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, interrupt, interruptcontrolsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)interrupt;
    (void)interruptcontrolsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvRequestVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint64_t msiaddress, uint32_t msidata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvRequestVpciDeviceInterrupt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, logicaldeviceid, msiaddress, msidata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)msiaddress;
    (void)msidata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvResetPartition(int64_t partition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvResetPartition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvResumePartitionTime(int64_t partition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvResumePartitionTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvRetargetVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint64_t msiaddress, uint32_t msidata, void* target) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvRetargetVpciDeviceInterrupt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, logicaldeviceid, msiaddress, msidata, target);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)msiaddress;
    (void)msidata;
    (void)target;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvRunVirtualProcessor(int64_t partition, uint32_t vpindex, void* exitcontext, uint32_t exitcontextsizeinbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvRunVirtualProcessor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, exitcontext, exitcontextsizeinbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)exitcontext;
    (void)exitcontextsizeinbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvSetNotificationPortProperty(int64_t partition, void* porthandle, int32_t propertycode, uint64_t propertyvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetNotificationPortProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, porthandle, propertycode, propertyvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)porthandle;
    (void)propertycode;
    (void)propertyvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvSetPartitionProperty(int64_t partition, int32_t propertycode, void* propertybuffer, uint32_t propertybuffersizeinbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetPartitionProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, propertycode, propertybuffer, propertybuffersizeinbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)propertycode;
    (void)propertybuffer;
    (void)propertybuffersizeinbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVirtualProcessorInterruptControllerState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, state, statesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState2(int64_t partition, uint32_t vpindex, void* state, uint32_t statesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVirtualProcessorInterruptControllerState2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, state, statesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorRegisters(int64_t partition, uint32_t vpindex, void* registernames, uint32_t registercount, void* registervalues) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVirtualProcessorRegisters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, registernames, registercount, registervalues);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)registernames;
    (void)registercount;
    (void)registervalues;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorState(int64_t partition, uint32_t vpindex, int32_t statetype, void* buffer, uint32_t buffersizeinbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVirtualProcessorState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, statetype, buffer, buffersizeinbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)statetype;
    (void)buffer;
    (void)buffersizeinbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorXsaveState(int64_t partition, uint32_t vpindex, void* buffer, uint32_t buffersizeinbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVirtualProcessorXsaveState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, buffer, buffersizeinbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)buffer;
    (void)buffersizeinbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvSetVpciDevicePowerState(int64_t partition, uint64_t logicaldeviceid, int32_t powerstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVpciDevicePowerState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, logicaldeviceid, powerstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)powerstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvSetupPartition(int64_t partition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetupPartition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvStartPartitionMigration(int64_t partition, void* migrationhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvStartPartitionMigration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, migrationhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)migrationhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvSuspendPartitionTime(int64_t partition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSuspendPartitionTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvTranslateGva(int64_t partition, uint32_t vpindex, uint64_t gva, int32_t translateflags, void* translationresult, void* gpa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvTranslateGva");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, vpindex, gva, translateflags, translationresult, gpa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)vpindex;
    (void)gva;
    (void)translateflags;
    (void)translationresult;
    (void)gpa;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvUnmapGpaRange(int64_t partition, uint64_t guestaddress, uint64_t sizeinbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvUnmapGpaRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, guestaddress, sizeinbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)guestaddress;
    (void)sizeinbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceInterrupt(int64_t partition, uint64_t logicaldeviceid, uint32_t arg_2_index) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvUnmapVpciDeviceInterrupt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, logicaldeviceid, arg_2_index);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_index;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceMmioRanges(int64_t partition, uint64_t logicaldeviceid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvUnmapVpciDeviceMmioRanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, logicaldeviceid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvUnregisterPartitionDoorbellEvent(int64_t partition, void* matchdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvUnregisterPartitionDoorbellEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, matchdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)matchdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvUpdateTriggerParameters(int64_t partition, void* parameters, void* triggerhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvUpdateTriggerParameters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, parameters, triggerhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)parameters;
    (void)triggerhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hypervisor_wHvWriteVpciDeviceRegister(int64_t partition, uint64_t logicaldeviceid, void* arg_2_register, void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvWriteVpciDeviceRegister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(partition, logicaldeviceid, arg_2_register, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_register;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

