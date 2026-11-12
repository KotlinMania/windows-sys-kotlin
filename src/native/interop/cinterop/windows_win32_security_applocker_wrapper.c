#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_applocker_wrapper.h"
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

int32_t windowssysWindowsWin32SecurityApplockerSaferCloseLevel(void* hlevelhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferCloseLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlevelhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlevelhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityApplockerSaferComputeTokenFromLevel(void* levelhandle, void* inaccesstoken, void* outaccesstoken, uint32_t dwflags, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferComputeTokenFromLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(levelhandle, inaccesstoken, outaccesstoken, dwflags, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)levelhandle;
    (void)inaccesstoken;
    (void)outaccesstoken;
    (void)dwflags;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityApplockerSaferCreateLevel(uint32_t dwscopeid, uint32_t dwlevelid, uint32_t openflags, void* plevelhandle, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferCreateLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwscopeid, dwlevelid, openflags, plevelhandle, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwscopeid;
    (void)dwlevelid;
    (void)openflags;
    (void)plevelhandle;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityApplockerSaferGetLevelInformation(void* levelhandle, int32_t dwinfotype, void* lpquerybuffer, uint32_t dwinbuffersize, void* lpdwoutbuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferGetLevelInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(levelhandle, dwinfotype, lpquerybuffer, dwinbuffersize, lpdwoutbuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)levelhandle;
    (void)dwinfotype;
    (void)lpquerybuffer;
    (void)dwinbuffersize;
    (void)lpdwoutbuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityApplockerSaferGetPolicyInformation(uint32_t dwscopeid, int32_t saferpolicyinfoclass, uint32_t infobuffersize, void* infobuffer, void* infobufferretsize, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferGetPolicyInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwscopeid, saferpolicyinfoclass, infobuffersize, infobuffer, infobufferretsize, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwscopeid;
    (void)saferpolicyinfoclass;
    (void)infobuffersize;
    (void)infobuffer;
    (void)infobufferretsize;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityApplockerSaferIdentifyLevel(uint32_t dwnumproperties, void* pcodeproperties, void* plevelhandle, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferIdentifyLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwnumproperties, pcodeproperties, plevelhandle, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwnumproperties;
    (void)pcodeproperties;
    (void)plevelhandle;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityApplockerSaferRecordEventLogEntry(void* hlevel, void* sztargetpath, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferRecordEventLogEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlevel, sztargetpath, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlevel;
    (void)sztargetpath;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityApplockerSaferSetLevelInformation(void* levelhandle, int32_t dwinfotype, void* lpquerybuffer, uint32_t dwinbuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferSetLevelInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(levelhandle, dwinfotype, lpquerybuffer, dwinbuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)levelhandle;
    (void)dwinfotype;
    (void)lpquerybuffer;
    (void)dwinbuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityApplockerSaferSetPolicyInformation(uint32_t dwscopeid, int32_t saferpolicyinfoclass, uint32_t infobuffersize, void* infobuffer, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferSetPolicyInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwscopeid, saferpolicyinfoclass, infobuffersize, infobuffer, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwscopeid;
    (void)saferpolicyinfoclass;
    (void)infobuffersize;
    (void)infobuffer;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityApplockerSaferiIsExecutableFileType(void* szfullpathname, bool bfromshellexecute) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferiIsExecutableFileType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfullpathname, bfromshellexecute);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szfullpathname;
    (void)bfromshellexecute;
    errno = ENOSYS;
    return -1;
#endif
}

