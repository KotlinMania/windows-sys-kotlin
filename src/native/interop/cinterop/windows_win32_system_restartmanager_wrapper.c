#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_restartmanager_wrapper.h"
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

uint32_t windowssys_windows_win32_system_restartmanager_RmAddFilter(uint32_t dwsessionhandle, void* strmodulename, void* pprocess, void* strserviceshortname, int32_t filteraction) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmAddFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwsessionhandle, strmodulename, pprocess, strserviceshortname, filteraction);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwsessionhandle;
    (void)strmodulename;
    (void)pprocess;
    (void)strserviceshortname;
    (void)filteraction;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_restartmanager_RmCancelCurrentTask(uint32_t dwsessionhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmCancelCurrentTask");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwsessionhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwsessionhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_restartmanager_RmEndSession(uint32_t dwsessionhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmEndSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwsessionhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwsessionhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_restartmanager_RmGetFilterList(uint32_t dwsessionhandle, void* pbfilterbuf, uint32_t cbfilterbuf, void* cbfilterbufneeded) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmGetFilterList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwsessionhandle, pbfilterbuf, cbfilterbuf, cbfilterbufneeded);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwsessionhandle;
    (void)pbfilterbuf;
    (void)cbfilterbuf;
    (void)cbfilterbufneeded;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_restartmanager_RmGetList(uint32_t dwsessionhandle, void* pnprocinfoneeded, void* pnprocinfo, void* rgaffectedapps, void* lpdwrebootreasons) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmGetList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwsessionhandle, pnprocinfoneeded, pnprocinfo, rgaffectedapps, lpdwrebootreasons);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwsessionhandle;
    (void)pnprocinfoneeded;
    (void)pnprocinfo;
    (void)rgaffectedapps;
    (void)lpdwrebootreasons;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_restartmanager_RmJoinSession(void* psessionhandle, void* strsessionkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmJoinSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psessionhandle, strsessionkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)psessionhandle;
    (void)strsessionkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_restartmanager_RmRegisterResources(uint32_t dwsessionhandle, uint32_t nfiles, void* rgsfilenames, uint32_t napplications, void* rgapplications, uint32_t nservices, void* rgsservicenames) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmRegisterResources");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwsessionhandle, nfiles, rgsfilenames, napplications, rgapplications, nservices, rgsservicenames);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwsessionhandle;
    (void)nfiles;
    (void)rgsfilenames;
    (void)napplications;
    (void)rgapplications;
    (void)nservices;
    (void)rgsservicenames;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_restartmanager_RmRemoveFilter(uint32_t dwsessionhandle, void* strmodulename, void* pprocess, void* strserviceshortname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmRemoveFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwsessionhandle, strmodulename, pprocess, strserviceshortname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwsessionhandle;
    (void)strmodulename;
    (void)pprocess;
    (void)strserviceshortname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_restartmanager_RmRestart(uint32_t dwsessionhandle, uint32_t dwrestartflags, void* fnstatus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmRestart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwsessionhandle, dwrestartflags, fnstatus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwsessionhandle;
    (void)dwrestartflags;
    (void)fnstatus;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_restartmanager_RmShutdown(uint32_t dwsessionhandle, uint32_t lactionflags, void* fnstatus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmShutdown");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwsessionhandle, lactionflags, fnstatus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwsessionhandle;
    (void)lactionflags;
    (void)fnstatus;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_restartmanager_RmStartSession(void* psessionhandle, uint32_t dwsessionflags, void* strsessionkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rstrtmgr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RmStartSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psessionhandle, dwsessionflags, strsessionkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)psessionhandle;
    (void)dwsessionflags;
    (void)strsessionkey;
    errno = ENOSYS;
    return 0;
#endif
}

