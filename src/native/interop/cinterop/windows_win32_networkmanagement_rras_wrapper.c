#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_rras_wrapper.h"
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

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmAddGroupMembershipEntry(void* hprotocol, uint32_t dwsourceaddr, uint32_t dwsourcemask, uint32_t dwgroupaddr, uint32_t dwgroupmask, uint32_t dwifindex, uint32_t dwifnexthopipaddr, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmAddGroupMembershipEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprotocol, dwsourceaddr, dwsourcemask, dwgroupaddr, dwgroupmask, dwifindex, dwifnexthopipaddr, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprotocol;
    (void)dwsourceaddr;
    (void)dwsourcemask;
    (void)dwgroupaddr;
    (void)dwgroupmask;
    (void)dwifindex;
    (void)dwifnexthopipaddr;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmDeRegisterMProtocol(void* hprotocol) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmDeRegisterMProtocol");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprotocol);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprotocol;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmDeleteGroupMembershipEntry(void* hprotocol, uint32_t dwsourceaddr, uint32_t dwsourcemask, uint32_t dwgroupaddr, uint32_t dwgroupmask, uint32_t dwifindex, uint32_t dwifnexthopipaddr, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmDeleteGroupMembershipEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprotocol, dwsourceaddr, dwsourcemask, dwgroupaddr, dwgroupmask, dwifindex, dwifnexthopipaddr, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprotocol;
    (void)dwsourceaddr;
    (void)dwsourcemask;
    (void)dwgroupaddr;
    (void)dwgroupmask;
    (void)dwifindex;
    (void)dwifnexthopipaddr;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfe(void* pdwbuffersize, void* pbbuffer, void* pdwnumentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetFirstMfe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdwbuffersize, pbbuffer, pdwnumentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfeStats(void* pdwbuffersize, void* pbbuffer, void* pdwnumentries, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetFirstMfeStats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdwbuffersize, pbbuffer, pdwnumentries, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmGetMfe(void* pimm, void* pdwbuffersize, void* pbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetMfe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pimm, pdwbuffersize, pbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pimm;
    (void)pdwbuffersize;
    (void)pbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmGetMfeStats(void* pimm, void* pdwbuffersize, void* pbbuffer, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetMfeStats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pimm, pdwbuffersize, pbbuffer, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pimm;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfe(void* pimmstart, void* pdwbuffersize, void* pbbuffer, void* pdwnumentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetNextMfe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pimmstart, pdwbuffersize, pbbuffer, pdwnumentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pimmstart;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfeStats(void* pimmstart, void* pdwbuffersize, void* pbbuffer, void* pdwnumentries, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetNextMfeStats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pimmstart, pdwbuffersize, pbbuffer, pdwnumentries, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pimmstart;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmGetProtocolOnInterface(uint32_t dwifindex, uint32_t dwifnexthopaddr, void* pdwifprotocolid, void* pdwifcomponentid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetProtocolOnInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwifindex, dwifnexthopaddr, pdwifprotocolid, pdwifcomponentid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwifindex;
    (void)dwifnexthopaddr;
    (void)pdwifprotocolid;
    (void)pdwifcomponentid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationEnd(void* henum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGroupEnumerationEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)henum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationGetNext(void* henum, void* pdwbuffersize, void* pbbuffer, void* pdwnumentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGroupEnumerationGetNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henum, pdwbuffersize, pbbuffer, pdwnumentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)henum;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationStart(void* hprotocol, int32_t metenumtype, void* phenumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGroupEnumerationStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprotocol, metenumtype, phenumhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprotocol;
    (void)metenumtype;
    (void)phenumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmRegisterMProtocol(void* prpiinfo, uint32_t dwprotocolid, uint32_t dwcomponentid, void* phprotocol) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmRegisterMProtocol");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prpiinfo, dwprotocolid, dwcomponentid, phprotocol);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prpiinfo;
    (void)dwprotocolid;
    (void)dwcomponentid;
    (void)phprotocol;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmReleaseInterfaceOwnership(void* hprotocol, uint32_t dwifindex, uint32_t dwifnexthopaddr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmReleaseInterfaceOwnership");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprotocol, dwifindex, dwifnexthopaddr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprotocol;
    (void)dwifindex;
    (void)dwifnexthopaddr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMgmTakeInterfaceOwnership(void* hprotocol, uint32_t dwifindex, uint32_t dwifnexthopaddr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmTakeInterfaceOwnership");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprotocol, dwifindex, dwifnexthopaddr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprotocol;
    (void)dwifindex;
    (void)dwifnexthopaddr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminBufferFree(void* pbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminBufferFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionClearStats(int64_t hrasserver, void* hrasconnection) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionClearStats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasserver, hrasconnection);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasserver;
    (void)hrasconnection;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnum(int64_t hrasserver, uint32_t dwlevel, void* lplpbbuffer, uint32_t dwprefmaxlen, void* lpdwentriesread, void* lpdwtotalentries, void* lpdwresumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasserver, dwlevel, lplpbbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnumEx(int64_t hrasserver, void* pobjectheader, uint32_t dwpreferedmaxlen, void* lpdwentriesread, void* lpdwtotalentries, void* pprasconn, void* lpdwresumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionEnumEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasserver, pobjectheader, dwpreferedmaxlen, lpdwentriesread, lpdwtotalentries, pprasconn, lpdwresumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasserver;
    (void)pobjectheader;
    (void)dwpreferedmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)pprasconn;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfo(int64_t hrasserver, uint32_t dwlevel, void* hrasconnection, void* lplpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasserver, dwlevel, hrasconnection, lplpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)hrasconnection;
    (void)lplpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfoEx(int64_t hrasserver, void* hrasconnection, void* prasconnection) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionGetInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasserver, hrasconnection, prasconnection);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasserver;
    (void)hrasconnection;
    (void)prasconnection;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionRemoveQuarantine(void* hrasserver, void* hrasconnection, int32_t fisipaddress) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionRemoveQuarantine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasserver, hrasconnection, fisipaddress);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasserver;
    (void)hrasconnection;
    (void)fisipaddress;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminDeregisterConnectionNotification(int64_t hmprserver, void* heventnotification) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminDeregisterConnectionNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, heventnotification);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)heventnotification;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminDeviceEnum(int64_t hmprserver, uint32_t dwlevel, void* lplpbbuffer, void* lpdwtotalentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminDeviceEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, dwlevel, lplpbbuffer, lpdwtotalentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    (void)lpdwtotalentries;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminEstablishDomainRasServer(void* pszdomain, void* pszmachine, int32_t benable) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminEstablishDomainRasServer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdomain, pszmachine, benable);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdomain;
    (void)pszmachine;
    (void)benable;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminGetErrorString(uint32_t dwerror, void* lplpwserrorstring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminGetErrorString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwerror, lplpwserrorstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwerror;
    (void)lplpwserrorstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminGetPDCServer(void* lpszdomain, void* lpszserver, void* lpszpdcserver) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminGetPDCServer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszdomain, lpszserver, lpszpdcserver);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszdomain;
    (void)lpszserver;
    (void)lpszpdcserver;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceConnect(int64_t hmprserver, void* hinterface, void* hevent, int32_t fsynchronous) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface, hevent, fsynchronous);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)hevent;
    (void)fsynchronous;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceCreate(int64_t hmprserver, uint32_t dwlevel, void* lpbbuffer, void* phinterface) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, dwlevel, lpbbuffer, phinterface);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    (void)phinterface;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDelete(int64_t hmprserver, void* hinterface) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceDelete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceGetInfo(int64_t hmprserver, void* hinterface, uint32_t dwindex, uint32_t dwlevel, void* lplpbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceDeviceGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface, dwindex, dwlevel, lplpbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwindex;
    (void)dwlevel;
    (void)lplpbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceSetInfo(int64_t hmprserver, void* hinterface, uint32_t dwindex, uint32_t dwlevel, void* lpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceDeviceSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface, dwindex, dwlevel, lpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwindex;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDisconnect(int64_t hmprserver, void* hinterface) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceDisconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceEnum(int64_t hmprserver, uint32_t dwlevel, void* lplpbbuffer, uint32_t dwprefmaxlen, void* lpdwentriesread, void* lpdwtotalentries, void* lpdwresumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, dwlevel, lplpbbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentials(void* lpwsserver, void* lpwsinterfacename, void* lpwsusername, void* lpwspassword, void* lpwsdomainname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceGetCredentials");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwsserver, lpwsinterfacename, lpwsusername, lpwspassword, lpwsdomainname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpwsserver;
    (void)lpwsinterfacename;
    (void)lpwsusername;
    (void)lpwspassword;
    (void)lpwsdomainname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentialsEx(int64_t hmprserver, void* hinterface, uint32_t dwlevel, void* lplpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceGetCredentialsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface, dwlevel, lplpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lplpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCustomInfoEx(int64_t hmprserver, void* hinterface, void* pcustominfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceGetCustomInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface, pcustominfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)pcustominfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetHandle(int64_t hmprserver, void* lpwsinterfacename, void* phinterface, int32_t fincludeclientinterfaces) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceGetHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, lpwsinterfacename, phinterface, fincludeclientinterfaces);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)lpwsinterfacename;
    (void)phinterface;
    (void)fincludeclientinterfaces;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetInfo(int64_t hmprserver, void* hinterface, uint32_t dwlevel, void* lplpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface, dwlevel, lplpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lplpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceQueryUpdateResult(int64_t hmprserver, void* hinterface, uint32_t dwprotocolid, void* lpdwupdateresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceQueryUpdateResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface, dwprotocolid, lpdwupdateresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwprotocolid;
    (void)lpdwupdateresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentials(void* lpwsserver, void* lpwsinterfacename, void* lpwsusername, void* lpwsdomainname, void* lpwspassword) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceSetCredentials");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwsserver, lpwsinterfacename, lpwsusername, lpwsdomainname, lpwspassword);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpwsserver;
    (void)lpwsinterfacename;
    (void)lpwsusername;
    (void)lpwsdomainname;
    (void)lpwspassword;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentialsEx(int64_t hmprserver, void* hinterface, uint32_t dwlevel, void* lpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceSetCredentialsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface, dwlevel, lpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCustomInfoEx(int64_t hmprserver, void* hinterface, void* pcustominfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceSetCustomInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface, pcustominfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)pcustominfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetInfo(int64_t hmprserver, void* hinterface, uint32_t dwlevel, void* lpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface, dwlevel, lpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportAdd(int64_t hmprserver, void* hinterface, uint32_t dwtransportid, void* pinterfaceinfo, uint32_t dwinterfaceinfosize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceTransportAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface, dwtransportid, pinterfaceinfo, dwinterfaceinfosize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportGetInfo(int64_t hmprserver, void* hinterface, uint32_t dwtransportid, void* ppinterfaceinfo, void* lpdwinterfaceinfosize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceTransportGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface, dwtransportid, ppinterfaceinfo, lpdwinterfaceinfosize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    (void)ppinterfaceinfo;
    (void)lpdwinterfaceinfosize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportRemove(int64_t hmprserver, void* hinterface, uint32_t dwtransportid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceTransportRemove");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface, dwtransportid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportSetInfo(int64_t hmprserver, void* hinterface, uint32_t dwtransportid, void* pinterfaceinfo, uint32_t dwinterfaceinfosize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceTransportSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface, dwtransportid, pinterfaceinfo, dwinterfaceinfosize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdatePhonebookInfo(int64_t hmprserver, void* hinterface) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceUpdatePhonebookInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdateRoutes(int64_t hmprserver, void* hinterface, uint32_t dwprotocolid, void* hevent) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceUpdateRoutes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hinterface, dwprotocolid, hevent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwprotocolid;
    (void)hevent;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminIsDomainRasServer(void* pszdomain, void* pszmachine, void* pbisrasserver) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminIsDomainRasServer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdomain, pszmachine, pbisrasserver);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdomain;
    (void)pszmachine;
    (void)pbisrasserver;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceInitialized(void* lpwsservername, void* fisserviceinitialized) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminIsServiceInitialized");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwsservername, fisserviceinitialized);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpwsservername;
    (void)fisserviceinitialized;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceRunning(void* lpwsservername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminIsServiceRunning");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwsservername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwsservername;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBBufferFree(void* pbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBBufferFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryCreate(int64_t hmibserver, uint32_t dwpid, uint32_t dwroutingpid, void* lpentry, uint32_t dwentrysize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntryCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmibserver, dwpid, dwroutingpid, lpentry, dwentrysize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmibserver;
    (void)dwpid;
    (void)dwroutingpid;
    (void)lpentry;
    (void)dwentrysize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryDelete(int64_t hmibserver, uint32_t dwprotocolid, uint32_t dwroutingpid, void* lpentry, uint32_t dwentrysize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntryDelete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmibserver, dwprotocolid, dwroutingpid, lpentry, dwentrysize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpentry;
    (void)dwentrysize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGet(int64_t hmibserver, uint32_t dwprotocolid, uint32_t dwroutingpid, void* lpinentry, uint32_t dwinentrysize, void* lplpoutentry, void* lpoutentrysize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntryGet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmibserver, dwprotocolid, dwroutingpid, lpinentry, dwinentrysize, lplpoutentry, lpoutentrysize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpinentry;
    (void)dwinentrysize;
    (void)lplpoutentry;
    (void)lpoutentrysize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetFirst(int64_t hmibserver, uint32_t dwprotocolid, uint32_t dwroutingpid, void* lpinentry, uint32_t dwinentrysize, void* lplpoutentry, void* lpoutentrysize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntryGetFirst");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmibserver, dwprotocolid, dwroutingpid, lpinentry, dwinentrysize, lplpoutentry, lpoutentrysize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpinentry;
    (void)dwinentrysize;
    (void)lplpoutentry;
    (void)lpoutentrysize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetNext(int64_t hmibserver, uint32_t dwprotocolid, uint32_t dwroutingpid, void* lpinentry, uint32_t dwinentrysize, void* lplpoutentry, void* lpoutentrysize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntryGetNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmibserver, dwprotocolid, dwroutingpid, lpinentry, dwinentrysize, lplpoutentry, lpoutentrysize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpinentry;
    (void)dwinentrysize;
    (void)lplpoutentry;
    (void)lpoutentrysize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntrySet(int64_t hmibserver, uint32_t dwprotocolid, uint32_t dwroutingpid, void* lpentry, uint32_t dwentrysize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntrySet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmibserver, dwprotocolid, dwroutingpid, lpentry, dwentrysize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpentry;
    (void)dwentrysize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerConnect(void* lpwsservername, void* phmibserver) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBServerConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwsservername, phmibserver);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpwsservername;
    (void)phmibserver;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerDisconnect(int64_t hmibserver) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBServerDisconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hmibserver);
        return;
    }
    errno = ENOSYS;
#else
    (void)hmibserver;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminPortClearStats(int64_t hrasserver, void* hport) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminPortClearStats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasserver, hport);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasserver;
    (void)hport;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminPortDisconnect(int64_t hrasserver, void* hport) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminPortDisconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasserver, hport);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasserver;
    (void)hport;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminPortEnum(int64_t hrasserver, uint32_t dwlevel, void* hrasconnection, void* lplpbbuffer, uint32_t dwprefmaxlen, void* lpdwentriesread, void* lpdwtotalentries, void* lpdwresumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminPortEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasserver, dwlevel, hrasconnection, lplpbbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)hrasconnection;
    (void)lplpbbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminPortGetInfo(int64_t hrasserver, uint32_t dwlevel, void* hport, void* lplpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminPortGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasserver, dwlevel, hport, lplpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)hport;
    (void)lplpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminPortReset(int64_t hrasserver, void* hport) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminPortReset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasserver, hport);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasserver;
    (void)hport;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminRegisterConnectionNotification(int64_t hmprserver, void* heventnotification) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminRegisterConnectionNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, heventnotification);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)heventnotification;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminSendUserMessage(int64_t hmprserver, void* hconnection, void* lpwszmessage) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminSendUserMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, hconnection, lpwszmessage);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)hconnection;
    (void)lpwszmessage;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminServerConnect(void* lpwsservername, void* phmprserver) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwsservername, phmprserver);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpwsservername;
    (void)phmprserver;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32NetworkmanagementRrasMprAdminServerDisconnect(int64_t hmprserver) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerDisconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hmprserver);
        return;
    }
    errno = ENOSYS;
#else
    (void)hmprserver;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetCredentials(int64_t hmprserver, uint32_t dwlevel, void* lplpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerGetCredentials");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, dwlevel, lplpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfo(int64_t hmprserver, uint32_t dwlevel, void* lplpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, dwlevel, lplpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfoEx(int64_t hmprserver, void* pserverinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerGetInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, pserverinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)pserverinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetCredentials(int64_t hmprserver, uint32_t dwlevel, void* lpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerSetCredentials");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, dwlevel, lpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfo(int64_t hmprserver, uint32_t dwlevel, void* lpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, dwlevel, lpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfoEx(int64_t hmprserver, void* pserverinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerSetInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, pserverinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)pserverinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportCreate(int64_t hmprserver, uint32_t dwtransportid, void* lpwstransportname, void* pglobalinfo, uint32_t dwglobalinfosize, void* pclientinterfaceinfo, uint32_t dwclientinterfaceinfosize, void* lpwsdllpath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminTransportCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, dwtransportid, lpwstransportname, pglobalinfo, dwglobalinfosize, pclientinterfaceinfo, dwclientinterfaceinfosize, lpwsdllpath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)dwtransportid;
    (void)lpwstransportname;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    (void)lpwsdllpath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportGetInfo(int64_t hmprserver, uint32_t dwtransportid, void* ppglobalinfo, void* lpdwglobalinfosize, void* ppclientinterfaceinfo, void* lpdwclientinterfaceinfosize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminTransportGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, dwtransportid, ppglobalinfo, lpdwglobalinfosize, ppclientinterfaceinfo, lpdwclientinterfaceinfosize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)dwtransportid;
    (void)ppglobalinfo;
    (void)lpdwglobalinfosize;
    (void)ppclientinterfaceinfo;
    (void)lpdwclientinterfaceinfosize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportSetInfo(int64_t hmprserver, uint32_t dwtransportid, void* pglobalinfo, uint32_t dwglobalinfosize, void* pclientinterfaceinfo, uint32_t dwclientinterfaceinfosize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminTransportSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, dwtransportid, pglobalinfo, dwglobalinfosize, pclientinterfaceinfo, dwclientinterfaceinfosize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)dwtransportid;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminUpdateConnection(int64_t hrasserver, void* hrasconnection, void* prasupdateconnection) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminUpdateConnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasserver, hrasconnection, prasupdateconnection);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasserver;
    (void)hrasconnection;
    (void)prasupdateconnection;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminUserGetInfo(void* lpszserver, void* lpszuser, uint32_t dwlevel, void* lpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminUserGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszserver, lpszuser, dwlevel, lpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszserver;
    (void)lpszuser;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprAdminUserSetInfo(void* lpszserver, void* lpszuser, uint32_t dwlevel, void* lpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminUserSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszserver, lpszuser, dwlevel, lpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszserver;
    (void)lpszuser;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigBufferFree(void* pbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigBufferFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterGetInfo(void* hmprconfig, uint32_t dwlevel, uint32_t dwtransportid, void* lpbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigFilterGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, dwlevel, dwtransportid, lpbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)dwtransportid;
    (void)lpbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterSetInfo(void* hmprconfig, uint32_t dwlevel, uint32_t dwtransportid, void* lpbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigFilterSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, dwlevel, dwtransportid, lpbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)dwtransportid;
    (void)lpbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigGetFriendlyName(void* hmprconfig, void* pszguidname, void* pszbuffer, uint32_t dwbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigGetFriendlyName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, pszguidname, pszbuffer, dwbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)pszguidname;
    (void)pszbuffer;
    (void)dwbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigGetGuidName(void* hmprconfig, void* pszfriendlyname, void* pszbuffer, uint32_t dwbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigGetGuidName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, pszfriendlyname, pszbuffer, dwbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)pszfriendlyname;
    (void)pszbuffer;
    (void)dwbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceCreate(void* hmprconfig, uint32_t dwlevel, void* lpbbuffer, void* phrouterinterface) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, dwlevel, lpbbuffer, phrouterinterface);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lpbbuffer;
    (void)phrouterinterface;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceDelete(void* hmprconfig, void* hrouterinterface) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceDelete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, hrouterinterface);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceEnum(void* hmprconfig, uint32_t dwlevel, void* lplpbuffer, uint32_t dwprefmaxlen, void* lpdwentriesread, void* lpdwtotalentries, void* lpdwresumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, dwlevel, lplpbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetCustomInfoEx(void* hmprconfig, void* hrouterinterface, void* pcustominfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceGetCustomInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, hrouterinterface, pcustominfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)pcustominfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetHandle(void* hmprconfig, void* lpwsinterfacename, void* phrouterinterface) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceGetHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, lpwsinterfacename, phrouterinterface);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)lpwsinterfacename;
    (void)phrouterinterface;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetInfo(void* hmprconfig, void* hrouterinterface, uint32_t dwlevel, void* lplpbuffer, void* lpdwbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, hrouterinterface, dwlevel, lplpbuffer, lpdwbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)lpdwbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetCustomInfoEx(void* hmprconfig, void* hrouterinterface, void* pcustominfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceSetCustomInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, hrouterinterface, pcustominfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)pcustominfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetInfo(void* hmprconfig, void* hrouterinterface, uint32_t dwlevel, void* lpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, hrouterinterface, dwlevel, lpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportAdd(void* hmprconfig, void* hrouterinterface, uint32_t dwtransportid, void* lpwstransportname, void* pinterfaceinfo, uint32_t dwinterfaceinfosize, void* phrouteriftransport) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, hrouterinterface, dwtransportid, lpwstransportname, pinterfaceinfo, dwinterfaceinfosize, phrouteriftransport);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwtransportid;
    (void)lpwstransportname;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    (void)phrouteriftransport;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportEnum(void* hmprconfig, void* hrouterinterface, uint32_t dwlevel, void* lplpbuffer, uint32_t dwprefmaxlen, void* lpdwentriesread, void* lpdwtotalentries, void* lpdwresumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, hrouterinterface, dwlevel, lplpbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetHandle(void* hmprconfig, void* hrouterinterface, uint32_t dwtransportid, void* phrouteriftransport) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportGetHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, hrouterinterface, dwtransportid, phrouteriftransport);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwtransportid;
    (void)phrouteriftransport;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetInfo(void* hmprconfig, void* hrouterinterface, void* hrouteriftransport, void* ppinterfaceinfo, void* lpdwinterfaceinfosize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, hrouterinterface, hrouteriftransport, ppinterfaceinfo, lpdwinterfaceinfosize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)hrouteriftransport;
    (void)ppinterfaceinfo;
    (void)lpdwinterfaceinfosize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportRemove(void* hmprconfig, void* hrouterinterface, void* hrouteriftransport) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportRemove");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, hrouterinterface, hrouteriftransport);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)hrouteriftransport;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportSetInfo(void* hmprconfig, void* hrouterinterface, void* hrouteriftransport, void* pinterfaceinfo, uint32_t dwinterfaceinfosize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, hrouterinterface, hrouteriftransport, pinterfaceinfo, dwinterfaceinfosize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)hrouteriftransport;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigServerBackup(void* hmprconfig, void* lpwspath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerBackup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, lpwspath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)lpwspath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigServerConnect(void* lpwsservername, void* phmprconfig) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwsservername, phmprconfig);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpwsservername;
    (void)phmprconfig;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32NetworkmanagementRrasMprConfigServerDisconnect(void* hmprconfig) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerDisconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hmprconfig);
        return;
    }
    errno = ENOSYS;
#else
    (void)hmprconfig;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfo(void* hmprconfig, uint32_t dwlevel, void* lplpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, dwlevel, lplpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lplpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfoEx(void* hmprconfig, void* pserverinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerGetInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, pserverinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)pserverinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigServerInstall(uint32_t dwlevel, void* pbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerInstall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwlevel, pbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwlevel;
    (void)pbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRefresh(void* hmprconfig) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerRefresh");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRestore(void* hmprconfig, void* lpwspath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerRestore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, lpwspath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)lpwspath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfo(int64_t hmprserver, uint32_t dwlevel, void* lpbbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprserver, dwlevel, lpbbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfoEx(void* hmprconfig, void* psetserverconfig) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerSetInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, psetserverconfig);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)psetserverconfig;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportCreate(void* hmprconfig, uint32_t dwtransportid, void* lpwstransportname, void* pglobalinfo, uint32_t dwglobalinfosize, void* pclientinterfaceinfo, uint32_t dwclientinterfaceinfosize, void* lpwsdllpath, void* phroutertransport) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, dwtransportid, lpwstransportname, pglobalinfo, dwglobalinfosize, pclientinterfaceinfo, dwclientinterfaceinfosize, lpwsdllpath, phroutertransport);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)dwtransportid;
    (void)lpwstransportname;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    (void)lpwsdllpath;
    (void)phroutertransport;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportDelete(void* hmprconfig, void* hroutertransport) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportDelete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, hroutertransport);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)hroutertransport;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportEnum(void* hmprconfig, uint32_t dwlevel, void* lplpbuffer, uint32_t dwprefmaxlen, void* lpdwentriesread, void* lpdwtotalentries, void* lpdwresumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, dwlevel, lplpbuffer, dwprefmaxlen, lpdwentriesread, lpdwtotalentries, lpdwresumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetHandle(void* hmprconfig, uint32_t dwtransportid, void* phroutertransport) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportGetHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, dwtransportid, phroutertransport);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)dwtransportid;
    (void)phroutertransport;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetInfo(void* hmprconfig, void* hroutertransport, void* ppglobalinfo, void* lpdwglobalinfosize, void* ppclientinterfaceinfo, void* lpdwclientinterfaceinfosize, void* lplpwsdllpath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, hroutertransport, ppglobalinfo, lpdwglobalinfosize, ppclientinterfaceinfo, lpdwclientinterfaceinfosize, lplpwsdllpath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)hroutertransport;
    (void)ppglobalinfo;
    (void)lpdwglobalinfosize;
    (void)ppclientinterfaceinfo;
    (void)lpdwclientinterfaceinfosize;
    (void)lplpwsdllpath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportSetInfo(void* hmprconfig, void* hroutertransport, void* pglobalinfo, uint32_t dwglobalinfosize, void* pclientinterfaceinfo, uint32_t dwclientinterfaceinfosize, void* lpwsdllpath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmprconfig, hroutertransport, pglobalinfo, dwglobalinfosize, pclientinterfaceinfo, dwclientinterfaceinfosize, lpwsdllpath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmprconfig;
    (void)hroutertransport;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    (void)lpwsdllpath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockAdd(void* lpheader, uint32_t dwinfotype, uint32_t dwitemsize, uint32_t dwitemcount, void* lpitemdata, void* lplpnewheader) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoBlockAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpheader, dwinfotype, dwitemsize, dwitemcount, lpitemdata, lplpnewheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)dwitemsize;
    (void)dwitemcount;
    (void)lpitemdata;
    (void)lplpnewheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockFind(void* lpheader, uint32_t dwinfotype, void* lpdwitemsize, void* lpdwitemcount, void* lplpitemdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoBlockFind");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpheader, dwinfotype, lpdwitemsize, lpdwitemcount, lplpitemdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)lpdwitemsize;
    (void)lpdwitemcount;
    (void)lplpitemdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockQuerySize(void* lpheader) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoBlockQuerySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockRemove(void* lpheader, uint32_t dwinfotype, void* lplpnewheader) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoBlockRemove");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpheader, dwinfotype, lplpnewheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)lplpnewheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockSet(void* lpheader, uint32_t dwinfotype, uint32_t dwitemsize, uint32_t dwitemcount, void* lpitemdata, void* lplpnewheader) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoBlockSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpheader, dwinfotype, dwitemsize, dwitemcount, lpitemdata, lplpnewheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)dwitemsize;
    (void)dwitemcount;
    (void)lpitemdata;
    (void)lplpnewheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprInfoCreate(uint32_t dwversion, void* lplpnewheader) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwversion, lplpnewheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwversion;
    (void)lplpnewheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprInfoDelete(void* lpheader) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoDelete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprInfoDuplicate(void* lpheader, void* lplpnewheader) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoDuplicate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpheader, lplpnewheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpheader;
    (void)lplpnewheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasMprInfoRemoveAll(void* lpheader, void* lplpnewheader) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoRemoveAll");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpheader, lplpnewheader);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpheader;
    (void)lplpnewheader;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasClearConnectionStatistics(void* hrasconn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasClearConnectionStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasconn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasconn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasClearLinkStatistics(void* hrasconn, uint32_t dwsubentry) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasClearLinkStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasconn, dwsubentry);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasconn;
    (void)dwsubentry;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationA(void* param0, void* param1, uint32_t param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasConnectionNotificationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationW(void* param0, void* param1, uint32_t param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasConnectionNotificationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryA(void* param0, void* param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasCreatePhonebookEntryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryW(void* param0, void* param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasCreatePhonebookEntryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryA(void* param0, void* param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDeleteEntryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryW(void* param0, void* param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDeleteEntryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryA(void* pszphonebook, void* pszentry, uint32_t dwsubentryid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDeleteSubEntryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszphonebook, pszentry, dwsubentryid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwsubentryid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryW(void* pszphonebook, void* pszentry, uint32_t dwsubentryid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDeleteSubEntryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszphonebook, pszentry, dwsubentryid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwsubentryid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasDialA(void* param0, void* param1, void* param2, uint32_t param3, void* param4, void* param5) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDialA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4, param5);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkmanagementRrasRasDialDlgA(void* lpszphonebook, void* lpszentry, void* lpszphonenumber, void* lpinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDialDlgA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszphonebook, lpszentry, lpszphonenumber, lpinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpszphonenumber;
    (void)lpinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkmanagementRrasRasDialDlgW(void* lpszphonebook, void* lpszentry, void* lpszphonenumber, void* lpinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDialDlgW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszphonebook, lpszentry, lpszphonenumber, lpinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpszphonenumber;
    (void)lpinfo;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasDialW(void* param0, void* param1, void* param2, uint32_t param3, void* param4, void* param5) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDialW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4, param5);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryA(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEditPhonebookEntryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryW(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEditPhonebookEntryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgA(void* lpszphonebook, void* lpszentry, void* lpinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEntryDlgA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszphonebook, lpszentry, lpinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgW(void* lpszphonebook, void* lpszentry, void* lpinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEntryDlgW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszphonebook, lpszentry, lpinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesA(void* lpprasautodialaddresses, void* lpdwcbrasautodialaddresses, void* lpdwcrasautodialaddresses) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumAutodialAddressesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpprasautodialaddresses, lpdwcbrasautodialaddresses, lpdwcrasautodialaddresses);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpprasautodialaddresses;
    (void)lpdwcbrasautodialaddresses;
    (void)lpdwcrasautodialaddresses;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesW(void* lpprasautodialaddresses, void* lpdwcbrasautodialaddresses, void* lpdwcrasautodialaddresses) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumAutodialAddressesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpprasautodialaddresses, lpdwcbrasautodialaddresses, lpdwcrasautodialaddresses);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpprasautodialaddresses;
    (void)lpdwcbrasautodialaddresses;
    (void)lpdwcrasautodialaddresses;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsA(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumConnectionsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsW(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumConnectionsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesA(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumDevicesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesW(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumDevicesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesA(void* param0, void* param1, void* param2, void* param3, void* param4) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumEntriesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesW(void* param0, void* param1, void* param2, void* param3, void* param4) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumEntriesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityA(void* praseapuseridentity) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasFreeEapUserIdentityA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(praseapuseridentity);
        return;
    }
    errno = ENOSYS;
#else
    (void)praseapuseridentity;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityW(void* praseapuseridentity) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasFreeEapUserIdentityW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(praseapuseridentity);
        return;
    }
    errno = ENOSYS;
#else
    (void)praseapuseridentity;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressA(void* param0, void* param1, void* param2, void* param3, void* param4) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialAddressA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressW(void* param0, void* param1, void* param2, void* param3, void* param4) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialAddressW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableA(uint32_t param0, void* param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialEnableA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableW(uint32_t param0, void* param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialEnableW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamA(uint32_t param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialParamA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamW(uint32_t param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialParamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusA(void* param0, void* param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetConnectStatusA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusW(void* param0, void* param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetConnectStatusW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetConnectionStatistics(void* hrasconn, void* lpstatistics) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetConnectionStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasconn, lpstatistics);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasconn;
    (void)lpstatistics;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoA(void* param0, void* param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCountryInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoW(void* param0, void* param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCountryInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsA(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCredentialsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsW(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCredentialsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataA(void* pszphonebook, void* pszentry, void* pbcustomauthdata, void* pdwsizeofcustomauthdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCustomAuthDataA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszphonebook, pszentry, pbcustomauthdata, pdwsizeofcustomauthdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)pdwsizeofcustomauthdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataW(void* pszphonebook, void* pszentry, void* pbcustomauthdata, void* pdwsizeofcustomauthdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCustomAuthDataW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszphonebook, pszentry, pbcustomauthdata, pdwsizeofcustomauthdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)pdwsizeofcustomauthdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataA(void* htoken, void* pszphonebook, void* pszentry, void* pbeapdata, void* pdwsizeofeapdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEapUserDataA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, pszphonebook, pszentry, pbeapdata, pdwsizeofeapdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)pdwsizeofeapdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataW(void* htoken, void* pszphonebook, void* pszentry, void* pbeapdata, void* pdwsizeofeapdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEapUserDataW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, pszphonebook, pszentry, pbeapdata, pdwsizeofeapdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)pdwsizeofeapdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityA(void* pszphonebook, void* pszentry, uint32_t dwflags, void* hwnd, void* ppraseapuseridentity) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEapUserIdentityA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszphonebook, pszentry, dwflags, hwnd, ppraseapuseridentity);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwflags;
    (void)hwnd;
    (void)ppraseapuseridentity;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityW(void* pszphonebook, void* pszentry, uint32_t dwflags, void* hwnd, void* ppraseapuseridentity) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEapUserIdentityW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszphonebook, pszentry, dwflags, hwnd, ppraseapuseridentity);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwflags;
    (void)hwnd;
    (void)ppraseapuseridentity;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsA(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEntryDialParamsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsW(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEntryDialParamsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesA(void* param0, void* param1, void* param2, void* param3, void* param4, void* param5) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEntryPropertiesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4, param5);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesW(void* param0, void* param1, void* param2, void* param3, void* param4, void* param5) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEntryPropertiesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4, param5);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringA(uint32_t resourceid, void* lpszstring, uint32_t inbufsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetErrorStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourceid, lpszstring, inbufsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)resourceid;
    (void)lpszstring;
    (void)inbufsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringW(uint32_t resourceid, void* lpszstring, uint32_t inbufsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetErrorStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourceid, lpszstring, inbufsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)resourceid;
    (void)lpszstring;
    (void)inbufsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetLinkStatistics(void* hrasconn, uint32_t dwsubentry, void* lpstatistics) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetLinkStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasconn, dwsubentry, lpstatistics);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasconn;
    (void)dwsubentry;
    (void)lpstatistics;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetPCscf(void* lpszpcscf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetPCscf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszpcscf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszpcscf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoA(void* param0, int32_t param1, void* param2, void* param3) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetProjectionInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoEx(void* hrasconn, void* prasprojection, void* lpdwsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetProjectionInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasconn, prasprojection, lpdwsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasconn;
    (void)prasprojection;
    (void)lpdwsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoW(void* param0, int32_t param1, void* param2, void* param3) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetProjectionInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleA(void* param0, uint32_t param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetSubEntryHandleA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleW(void* param0, uint32_t param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetSubEntryHandleW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesA(void* param0, void* param1, uint32_t param2, void* param3, void* param4, void* param5, void* param6) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetSubEntryPropertiesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4, param5, param6);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesW(void* param0, void* param1, uint32_t param2, void* param3, void* param4, void* param5, void* param6) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetSubEntryPropertiesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4, param5, param6);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasHangUpA(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasHangUpA");
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

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasHangUpW(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasHangUpW");
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

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasInvokeEapUI(void* param0, uint32_t param1, void* param2, void* param3) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasInvokeEapUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgA(void* lpszphonebook, void* lpszentry, void* lpinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasPhonebookDlgA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszphonebook, lpszentry, lpinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgW(void* lpszphonebook, void* lpszentry, void* lpinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasPhonebookDlgW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszphonebook, lpszentry, lpinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryA(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasRenameEntryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryW(void* param0, void* param1, void* param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasRenameEntryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressA(void* param0, uint32_t param1, void* param2, uint32_t param3, uint32_t param4) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialAddressA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressW(void* param0, uint32_t param1, void* param2, uint32_t param3, uint32_t param4) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialAddressW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableA(uint32_t param0, int32_t param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialEnableA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableW(uint32_t param0, int32_t param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialEnableW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamA(uint32_t param0, void* param1, uint32_t param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialParamA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamW(uint32_t param0, void* param1, uint32_t param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialParamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsA(void* param0, void* param1, void* param2, int32_t param3) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetCredentialsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsW(void* param0, void* param1, void* param2, int32_t param3) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetCredentialsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataA(void* pszphonebook, void* pszentry, void* pbcustomauthdata, uint32_t dwsizeofcustomauthdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetCustomAuthDataA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszphonebook, pszentry, pbcustomauthdata, dwsizeofcustomauthdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)dwsizeofcustomauthdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataW(void* pszphonebook, void* pszentry, void* pbcustomauthdata, uint32_t dwsizeofcustomauthdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetCustomAuthDataW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszphonebook, pszentry, pbcustomauthdata, dwsizeofcustomauthdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)dwsizeofcustomauthdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataA(void* htoken, void* pszphonebook, void* pszentry, void* pbeapdata, uint32_t dwsizeofeapdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEapUserDataA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, pszphonebook, pszentry, pbeapdata, dwsizeofeapdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)dwsizeofeapdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataW(void* htoken, void* pszphonebook, void* pszentry, void* pbeapdata, uint32_t dwsizeofeapdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEapUserDataW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, pszphonebook, pszentry, pbeapdata, dwsizeofeapdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)dwsizeofeapdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsA(void* param0, void* param1, int32_t param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEntryDialParamsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsW(void* param0, void* param1, int32_t param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEntryDialParamsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesA(void* param0, void* param1, void* param2, uint32_t param3, void* param4, uint32_t param5) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEntryPropertiesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4, param5);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesW(void* param0, void* param1, void* param2, uint32_t param3, void* param4, uint32_t param5) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEntryPropertiesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4, param5);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesA(void* param0, void* param1, uint32_t param2, void* param3, uint32_t param4, void* param5, uint32_t param6) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetSubEntryPropertiesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4, param5, param6);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesW(void* param0, void* param1, uint32_t param2, void* param3, uint32_t param4, void* param5, uint32_t param6) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetSubEntryPropertiesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4, param5, param6);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasUpdateConnection(void* hrasconn, void* lprasupdateconn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasUpdateConnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrasconn, lprasupdateconn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrasconn;
    (void)lprasupdateconn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameA(void* param0, void* param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasValidateEntryNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameW(void* param0, void* param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasValidateEntryNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmAddNextHop(int64_t rtmreghandle, void* nexthopinfo, void* nexthophandle, void* changeflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmAddNextHop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, nexthopinfo, nexthophandle, changeflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)nexthopinfo;
    (void)nexthophandle;
    (void)changeflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmAddRouteToDest(int64_t rtmreghandle, void* routehandle, void* destaddress, void* routeinfo, uint32_t timetolive, int64_t routelisthandle, uint32_t notifytype, int64_t notifyhandle, void* changeflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, int64_t, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmAddRouteToDest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, routehandle, destaddress, routeinfo, timetolive, routelisthandle, notifytype, notifyhandle, changeflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)destaddress;
    (void)routeinfo;
    (void)timetolive;
    (void)routelisthandle;
    (void)notifytype;
    (void)notifyhandle;
    (void)changeflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmBlockMethods(int64_t rtmreghandle, void* targethandle, uint8_t targettype, uint32_t blockingflag) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint8_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmBlockMethods");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, targethandle, targettype, blockingflag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)targethandle;
    (void)targettype;
    (void)blockingflag;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmConvertNetAddressToIpv6AddressAndLength(void* pnetaddress, void* paddress, void* plength, uint32_t dwaddresssize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmConvertNetAddressToIpv6AddressAndLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pnetaddress, paddress, plength, dwaddresssize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pnetaddress;
    (void)paddress;
    (void)plength;
    (void)dwaddresssize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmCreateDestEnum(int64_t rtmreghandle, uint32_t targetviews, uint32_t enumflags, void* netaddress, uint32_t protocolid, void* rtmenumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmCreateDestEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, targetviews, enumflags, netaddress, protocolid, rtmenumhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)targetviews;
    (void)enumflags;
    (void)netaddress;
    (void)protocolid;
    (void)rtmenumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmCreateNextHopEnum(int64_t rtmreghandle, uint32_t enumflags, void* netaddress, void* rtmenumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmCreateNextHopEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, enumflags, netaddress, rtmenumhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)enumflags;
    (void)netaddress;
    (void)rtmenumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteEnum(int64_t rtmreghandle, int64_t desthandle, uint32_t targetviews, uint32_t enumflags, void* startdest, uint32_t matchingflags, void* criteriaroute, uint32_t criteriainterface, void* rtmenumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmCreateRouteEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, desthandle, targetviews, enumflags, startdest, matchingflags, criteriaroute, criteriainterface, rtmenumhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)targetviews;
    (void)enumflags;
    (void)startdest;
    (void)matchingflags;
    (void)criteriaroute;
    (void)criteriainterface;
    (void)rtmenumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteList(int64_t rtmreghandle, void* routelisthandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmCreateRouteList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, routelisthandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteListEnum(int64_t rtmreghandle, int64_t routelisthandle, void* rtmenumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmCreateRouteListEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, routelisthandle, rtmenumhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    (void)rtmenumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmDeleteEnumHandle(int64_t rtmreghandle, int64_t enumhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeleteEnumHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, enumhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)enumhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmDeleteNextHop(int64_t rtmreghandle, int64_t nexthophandle, void* nexthopinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeleteNextHop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, nexthophandle, nexthopinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)nexthopinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteList(int64_t rtmreghandle, int64_t routelisthandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeleteRouteList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, routelisthandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteToDest(int64_t rtmreghandle, int64_t routehandle, void* changeflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeleteRouteToDest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, routehandle, changeflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)changeflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterEntity(int64_t rtmreghandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeregisterEntity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterFromChangeNotification(int64_t rtmreghandle, int64_t notifyhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeregisterFromChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, notifyhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmFindNextHop(int64_t rtmreghandle, void* nexthopinfo, void* nexthophandle, void* nexthoppointer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmFindNextHop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, nexthopinfo, nexthophandle, nexthoppointer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)nexthopinfo;
    (void)nexthophandle;
    (void)nexthoppointer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetChangeStatus(int64_t rtmreghandle, int64_t notifyhandle, int64_t desthandle, void* changestatus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetChangeStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, notifyhandle, desthandle, changestatus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)desthandle;
    (void)changestatus;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetChangedDests(int64_t rtmreghandle, int64_t notifyhandle, void* numdests, void* changeddests) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetChangedDests");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, notifyhandle, numdests, changeddests);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)numdests;
    (void)changeddests;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetDestInfo(int64_t rtmreghandle, int64_t desthandle, uint32_t protocolid, uint32_t targetviews, void* destinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetDestInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, desthandle, protocolid, targetviews, destinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityInfo(int64_t rtmreghandle, int64_t entityhandle, void* entityinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetEntityInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, entityhandle, entityinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)entityhandle;
    (void)entityinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityMethods(int64_t rtmreghandle, int64_t entityhandle, void* nummethods, void* exptmethods) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetEntityMethods");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, entityhandle, nummethods, exptmethods);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)entityhandle;
    (void)nummethods;
    (void)exptmethods;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumDests(int64_t rtmreghandle, int64_t enumhandle, void* numdests, void* destinfos) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetEnumDests");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, enumhandle, numdests, destinfos);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numdests;
    (void)destinfos;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumNextHops(int64_t rtmreghandle, int64_t enumhandle, void* numnexthops, void* nexthophandles) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetEnumNextHops");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, enumhandle, numnexthops, nexthophandles);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numnexthops;
    (void)nexthophandles;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumRoutes(int64_t rtmreghandle, int64_t enumhandle, void* numroutes, void* routehandles) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetEnumRoutes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, enumhandle, numroutes, routehandles);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numroutes;
    (void)routehandles;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchDestination(int64_t rtmreghandle, void* destaddress, uint32_t protocolid, uint32_t targetviews, void* destinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetExactMatchDestination");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, destaddress, protocolid, targetviews, destinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)destaddress;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchRoute(int64_t rtmreghandle, void* destaddress, uint32_t matchingflags, void* routeinfo, uint32_t interfaceindex, uint32_t targetviews, void* routehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetExactMatchRoute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, destaddress, matchingflags, routeinfo, interfaceindex, targetviews, routehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)destaddress;
    (void)matchingflags;
    (void)routeinfo;
    (void)interfaceindex;
    (void)targetviews;
    (void)routehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetLessSpecificDestination(int64_t rtmreghandle, int64_t desthandle, uint32_t protocolid, uint32_t targetviews, void* destinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetLessSpecificDestination");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, desthandle, protocolid, targetviews, destinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetListEnumRoutes(int64_t rtmreghandle, int64_t enumhandle, void* numroutes, void* routehandles) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetListEnumRoutes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, enumhandle, numroutes, routehandles);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numroutes;
    (void)routehandles;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetMostSpecificDestination(int64_t rtmreghandle, void* destaddress, uint32_t protocolid, uint32_t targetviews, void* destinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetMostSpecificDestination");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, destaddress, protocolid, targetviews, destinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)destaddress;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopInfo(int64_t rtmreghandle, int64_t nexthophandle, void* nexthopinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetNextHopInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, nexthophandle, nexthopinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)nexthopinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopPointer(int64_t rtmreghandle, int64_t nexthophandle, void* nexthoppointer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetNextHopPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, nexthophandle, nexthoppointer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)nexthoppointer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetOpaqueInformationPointer(int64_t rtmreghandle, int64_t desthandle, void* opaqueinfopointer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetOpaqueInformationPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, desthandle, opaqueinfopointer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)opaqueinfopointer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetRegisteredEntities(int64_t rtmreghandle, void* numentities, void* entityhandles, void* entityinfos) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetRegisteredEntities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, numentities, entityhandles, entityinfos);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)numentities;
    (void)entityhandles;
    (void)entityinfos;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetRouteInfo(int64_t rtmreghandle, int64_t routehandle, void* routeinfo, void* destaddress) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetRouteInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, routehandle, routeinfo, destaddress);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)routeinfo;
    (void)destaddress;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmGetRoutePointer(int64_t rtmreghandle, int64_t routehandle, void* routepointer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetRoutePointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, routehandle, routepointer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)routepointer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmHoldDestination(int64_t rtmreghandle, int64_t desthandle, uint32_t targetviews, uint32_t holdtime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmHoldDestination");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, desthandle, targetviews, holdtime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)targetviews;
    (void)holdtime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmIgnoreChangedDests(int64_t rtmreghandle, int64_t notifyhandle, uint32_t numdests, void* changeddests) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmIgnoreChangedDests");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, notifyhandle, numdests, changeddests);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)numdests;
    (void)changeddests;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmInsertInRouteList(int64_t rtmreghandle, int64_t routelisthandle, uint32_t numroutes, void* routehandles) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmInsertInRouteList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, routelisthandle, numroutes, routehandles);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    (void)numroutes;
    (void)routehandles;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmInvokeMethod(int64_t rtmreghandle, int64_t entityhandle, void* input, void* outputsize, void* output) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmInvokeMethod");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, entityhandle, input, outputsize, output);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)entityhandle;
    (void)input;
    (void)outputsize;
    (void)output;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmIsBestRoute(int64_t rtmreghandle, int64_t routehandle, void* bestinviews) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmIsBestRoute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, routehandle, bestinviews);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)bestinviews;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmIsMarkedForChangeNotification(int64_t rtmreghandle, int64_t notifyhandle, int64_t desthandle, void* destmarked) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmIsMarkedForChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, notifyhandle, desthandle, destmarked);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)desthandle;
    (void)destmarked;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmLockDestination(int64_t rtmreghandle, int64_t desthandle, int32_t exclusive, int32_t lockdest) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmLockDestination");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, desthandle, exclusive, lockdest);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)exclusive;
    (void)lockdest;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmLockNextHop(int64_t rtmreghandle, int64_t nexthophandle, int32_t exclusive, int32_t locknexthop, void* nexthoppointer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmLockNextHop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, nexthophandle, exclusive, locknexthop, nexthoppointer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)exclusive;
    (void)locknexthop;
    (void)nexthoppointer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmLockRoute(int64_t rtmreghandle, int64_t routehandle, int32_t exclusive, int32_t lockroute, void* routepointer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmLockRoute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, routehandle, exclusive, lockroute, routepointer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)exclusive;
    (void)lockroute;
    (void)routepointer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmMarkDestForChangeNotification(int64_t rtmreghandle, int64_t notifyhandle, int64_t desthandle, int32_t markdest) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmMarkDestForChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, notifyhandle, desthandle, markdest);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)desthandle;
    (void)markdest;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmReferenceHandles(int64_t rtmreghandle, uint32_t numhandles, void* rtmhandles) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReferenceHandles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, numhandles, rtmhandles);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)numhandles;
    (void)rtmhandles;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmRegisterEntity(void* rtmentityinfo, void* exportmethods, void* eventcallback, int32_t reserveopaquepointer, void* rtmregprofile, void* rtmreghandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmRegisterEntity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmentityinfo, exportmethods, eventcallback, reserveopaquepointer, rtmregprofile, rtmreghandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmentityinfo;
    (void)exportmethods;
    (void)eventcallback;
    (void)reserveopaquepointer;
    (void)rtmregprofile;
    (void)rtmreghandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmRegisterForChangeNotification(int64_t rtmreghandle, uint32_t targetviews, uint32_t notifyflags, void* notifycontext, void* notifyhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmRegisterForChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, targetviews, notifyflags, notifycontext, notifyhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)targetviews;
    (void)notifyflags;
    (void)notifycontext;
    (void)notifyhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmReleaseChangedDests(int64_t rtmreghandle, int64_t notifyhandle, uint32_t numdests, void* changeddests) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseChangedDests");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, notifyhandle, numdests, changeddests);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)numdests;
    (void)changeddests;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDestInfo(int64_t rtmreghandle, void* destinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseDestInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, destinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)destinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDests(int64_t rtmreghandle, uint32_t numdests, void* destinfos) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseDests");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, numdests, destinfos);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)numdests;
    (void)destinfos;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntities(int64_t rtmreghandle, uint32_t numentities, void* entityhandles) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseEntities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, numentities, entityhandles);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)numentities;
    (void)entityhandles;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntityInfo(int64_t rtmreghandle, void* entityinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseEntityInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, entityinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)entityinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHopInfo(int64_t rtmreghandle, void* nexthopinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseNextHopInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, nexthopinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)nexthopinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHops(int64_t rtmreghandle, uint32_t numnexthops, void* nexthophandles) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseNextHops");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, numnexthops, nexthophandles);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)numnexthops;
    (void)nexthophandles;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRouteInfo(int64_t rtmreghandle, void* routeinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseRouteInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, routeinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)routeinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRoutes(int64_t rtmreghandle, uint32_t numroutes, void* routehandles) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseRoutes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, numroutes, routehandles);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)numroutes;
    (void)routehandles;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementRrasRtmUpdateAndUnlockRoute(int64_t rtmreghandle, int64_t routehandle, uint32_t timetolive, int64_t routelisthandle, uint32_t notifytype, int64_t notifyhandle, void* changeflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, int64_t, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmUpdateAndUnlockRoute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rtmreghandle, routehandle, timetolive, routelisthandle, notifytype, notifyhandle, changeflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)timetolive;
    (void)routelisthandle;
    (void)notifytype;
    (void)notifyhandle;
    (void)changeflags;
    errno = ENOSYS;
    return 0;
#endif
}

