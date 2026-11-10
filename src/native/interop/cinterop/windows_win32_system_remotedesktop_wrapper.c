#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_remotedesktop_wrapper.h"
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

int32_t windowssys_windows_win32_system_remotedesktop_processIdToSessionId(uint32_t dwprocessid, void* psessionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessIdToSessionId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwprocessid, psessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwprocessid;
    (void)psessionid;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_remotedesktop_wTSCloseServer(void* hserver) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSCloseServer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hserver);
        return;
    }
    errno = ENOSYS;
#else
    (void)hserver;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSConnectSessionA(uint32_t logonid, uint32_t targetlogonid, void* ppassword, int32_t bwait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSConnectSessionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logonid, targetlogonid, ppassword, bwait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logonid;
    (void)targetlogonid;
    (void)ppassword;
    (void)bwait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSConnectSessionW(uint32_t logonid, uint32_t targetlogonid, void* ppassword, int32_t bwait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSConnectSessionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logonid, targetlogonid, ppassword, bwait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logonid;
    (void)targetlogonid;
    (void)ppassword;
    (void)bwait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSCreateListenerA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer, uint32_t flag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSCreateListenerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, preserved, reserved, plistenername, pbuffer, flag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)pbuffer;
    (void)flag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSCreateListenerW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer, uint32_t flag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSCreateListenerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, preserved, reserved, plistenername, pbuffer, flag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)pbuffer;
    (void)flag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSDisconnectSession(void* hserver, uint32_t sessionid, int32_t bwait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSDisconnectSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, sessionid, bwait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)sessionid;
    (void)bwait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSEnableChildSessions(int32_t benable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnableChildSessions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(benable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)benable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateListenersA(void* hserver, void* preserved, uint32_t reserved, void* plisteners, void* pcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateListenersA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, preserved, reserved, plisteners, pcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plisteners;
    (void)pcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateListenersW(void* hserver, void* preserved, uint32_t reserved, void* plisteners, void* pcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateListenersW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, preserved, reserved, plisteners, pcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plisteners;
    (void)pcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesA(void* hserver, uint32_t reserved, uint32_t version, void* ppprocessinfo, void* pcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateProcessesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, reserved, version, ppprocessinfo, pcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)reserved;
    (void)version;
    (void)ppprocessinfo;
    (void)pcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesExA(void* hserver, void* plevel, uint32_t sessionid, void* ppprocessinfo, void* pcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateProcessesExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, plevel, sessionid, ppprocessinfo, pcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)plevel;
    (void)sessionid;
    (void)ppprocessinfo;
    (void)pcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesExW(void* hserver, void* plevel, uint32_t sessionid, void* ppprocessinfo, void* pcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateProcessesExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, plevel, sessionid, ppprocessinfo, pcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)plevel;
    (void)sessionid;
    (void)ppprocessinfo;
    (void)pcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesW(void* hserver, uint32_t reserved, uint32_t version, void* ppprocessinfo, void* pcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateProcessesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, reserved, version, ppprocessinfo, pcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)reserved;
    (void)version;
    (void)ppprocessinfo;
    (void)pcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateServersA(void* pdomainname, uint32_t reserved, uint32_t version, void* ppserverinfo, void* pcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateServersA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdomainname, reserved, version, ppserverinfo, pcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdomainname;
    (void)reserved;
    (void)version;
    (void)ppserverinfo;
    (void)pcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateServersW(void* pdomainname, uint32_t reserved, uint32_t version, void* ppserverinfo, void* pcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateServersW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdomainname, reserved, version, ppserverinfo, pcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdomainname;
    (void)reserved;
    (void)version;
    (void)ppserverinfo;
    (void)pcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsA(void* hserver, uint32_t reserved, uint32_t version, void* ppsessioninfo, void* pcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateSessionsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, reserved, version, ppsessioninfo, pcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)reserved;
    (void)version;
    (void)ppsessioninfo;
    (void)pcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsExA(void* hserver, void* plevel, uint32_t filter, void* ppsessioninfo, void* pcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateSessionsExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, plevel, filter, ppsessioninfo, pcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)plevel;
    (void)filter;
    (void)ppsessioninfo;
    (void)pcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsExW(void* hserver, void* plevel, uint32_t filter, void* ppsessioninfo, void* pcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateSessionsExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, plevel, filter, ppsessioninfo, pcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)plevel;
    (void)filter;
    (void)ppsessioninfo;
    (void)pcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsW(void* hserver, uint32_t reserved, uint32_t version, void* ppsessioninfo, void* pcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateSessionsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, reserved, version, ppsessioninfo, pcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)reserved;
    (void)version;
    (void)ppsessioninfo;
    (void)pcount;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_remotedesktop_wTSFreeMemory(void* pmemory) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSFreeMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pmemory);
        return;
    }
    errno = ENOSYS;
#else
    (void)pmemory;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSFreeMemoryExA(int32_t wtstypeclass, void* pmemory, uint32_t numberofentries) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSFreeMemoryExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wtstypeclass, pmemory, numberofentries);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wtstypeclass;
    (void)pmemory;
    (void)numberofentries;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSFreeMemoryExW(int32_t wtstypeclass, void* pmemory, uint32_t numberofentries) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSFreeMemoryExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wtstypeclass, pmemory, numberofentries);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wtstypeclass;
    (void)pmemory;
    (void)numberofentries;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_remotedesktop_wTSGetActiveConsoleSessionId(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSGetActiveConsoleSessionId");
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

int32_t windowssys_windows_win32_system_remotedesktop_wTSGetChildSessionId(void* psessionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSGetChildSessionId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psessionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psessionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSGetListenerSecurityA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSGetListenerSecurityA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, preserved, reserved, plistenername, securityinformation, psecuritydescriptor, nlength, lpnlengthneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)securityinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSGetListenerSecurityW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSGetListenerSecurityW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, preserved, reserved, plistenername, securityinformation, psecuritydescriptor, nlength, lpnlengthneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)securityinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSIsChildSessionsEnabled(void* pbenabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSIsChildSessionsEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbenabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbenabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSLogoffSession(void* hserver, uint32_t sessionid, int32_t bwait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSLogoffSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, sessionid, bwait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)sessionid;
    (void)bwait;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_remotedesktop_wTSOpenServerA(void* pservername) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSOpenServerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pservername);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pservername;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_remotedesktop_wTSOpenServerExA(void* pservername) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSOpenServerExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pservername);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pservername;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_remotedesktop_wTSOpenServerExW(void* pservername) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSOpenServerExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pservername);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pservername;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_remotedesktop_wTSOpenServerW(void* pservername) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSOpenServerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pservername);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pservername;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSQueryListenerConfigA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSQueryListenerConfigA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, preserved, reserved, plistenername, pbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)pbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSQueryListenerConfigW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSQueryListenerConfigW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, preserved, reserved, plistenername, pbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)pbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSQuerySessionInformationA(void* hserver, uint32_t sessionid, int32_t wtsinfoclass, void* ppbuffer, void* pbytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSQuerySessionInformationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, sessionid, wtsinfoclass, ppbuffer, pbytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)sessionid;
    (void)wtsinfoclass;
    (void)ppbuffer;
    (void)pbytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSQuerySessionInformationW(void* hserver, uint32_t sessionid, int32_t wtsinfoclass, void* ppbuffer, void* pbytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSQuerySessionInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, sessionid, wtsinfoclass, ppbuffer, pbytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)sessionid;
    (void)wtsinfoclass;
    (void)ppbuffer;
    (void)pbytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSQueryUserConfigA(void* pservername, void* pusername, int32_t wtsconfigclass, void* ppbuffer, void* pbytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSQueryUserConfigA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pservername, pusername, wtsconfigclass, ppbuffer, pbytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pservername;
    (void)pusername;
    (void)wtsconfigclass;
    (void)ppbuffer;
    (void)pbytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSQueryUserConfigW(void* pservername, void* pusername, int32_t wtsconfigclass, void* ppbuffer, void* pbytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSQueryUserConfigW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pservername, pusername, wtsconfigclass, ppbuffer, pbytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pservername;
    (void)pusername;
    (void)wtsconfigclass;
    (void)ppbuffer;
    (void)pbytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSQueryUserToken(uint32_t sessionid, void* phtoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSQueryUserToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionid, phtoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionid;
    (void)phtoken;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSRegisterSessionNotification(void* hwnd, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSRegisterSessionNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSRegisterSessionNotificationEx(void* hserver, void* hwnd, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSRegisterSessionNotificationEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, hwnd, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)hwnd;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSSendMessageA(void* hserver, uint32_t sessionid, void* ptitle, uint32_t titlelength, void* pmessage, uint32_t messagelength, uint32_t style, uint32_t timeout, void* presponse, int32_t bwait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSSendMessageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, sessionid, ptitle, titlelength, pmessage, messagelength, style, timeout, presponse, bwait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)sessionid;
    (void)ptitle;
    (void)titlelength;
    (void)pmessage;
    (void)messagelength;
    (void)style;
    (void)timeout;
    (void)presponse;
    (void)bwait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSSendMessageW(void* hserver, uint32_t sessionid, void* ptitle, uint32_t titlelength, void* pmessage, uint32_t messagelength, uint32_t style, uint32_t timeout, void* presponse, int32_t bwait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSSendMessageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, sessionid, ptitle, titlelength, pmessage, messagelength, style, timeout, presponse, bwait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)sessionid;
    (void)ptitle;
    (void)titlelength;
    (void)pmessage;
    (void)messagelength;
    (void)style;
    (void)timeout;
    (void)presponse;
    (void)bwait;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSSetListenerSecurityA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSSetListenerSecurityA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, preserved, reserved, plistenername, securityinformation, psecuritydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSSetListenerSecurityW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSSetListenerSecurityW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, preserved, reserved, plistenername, securityinformation, psecuritydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSSetRenderHint(void* prenderhintid, void* hwndowner, uint32_t renderhinttype, uint32_t cbhintdatalength, void* phintdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSSetRenderHint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prenderhintid, hwndowner, renderhinttype, cbhintdatalength, phintdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prenderhintid;
    (void)hwndowner;
    (void)renderhinttype;
    (void)cbhintdatalength;
    (void)phintdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSSetUserConfigA(void* pservername, void* pusername, int32_t wtsconfigclass, void* pbuffer, uint32_t datalength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSSetUserConfigA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pservername, pusername, wtsconfigclass, pbuffer, datalength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pservername;
    (void)pusername;
    (void)wtsconfigclass;
    (void)pbuffer;
    (void)datalength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSSetUserConfigW(void* pservername, void* pusername, int32_t wtsconfigclass, void* pbuffer, uint32_t datalength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSSetUserConfigW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pservername, pusername, wtsconfigclass, pbuffer, datalength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pservername;
    (void)pusername;
    (void)wtsconfigclass;
    (void)pbuffer;
    (void)datalength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSShutdownSystem(void* hserver, uint32_t shutdownflag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSShutdownSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, shutdownflag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)shutdownflag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSStartRemoteControlSessionA(void* ptargetservername, uint32_t targetlogonid, uint8_t hotkeyvk, uint16_t hotkeymodifiers) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSStartRemoteControlSessionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptargetservername, targetlogonid, hotkeyvk, hotkeymodifiers);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptargetservername;
    (void)targetlogonid;
    (void)hotkeyvk;
    (void)hotkeymodifiers;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSStartRemoteControlSessionW(void* ptargetservername, uint32_t targetlogonid, uint8_t hotkeyvk, uint16_t hotkeymodifiers) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSStartRemoteControlSessionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptargetservername, targetlogonid, hotkeyvk, hotkeymodifiers);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptargetservername;
    (void)targetlogonid;
    (void)hotkeyvk;
    (void)hotkeymodifiers;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSStopRemoteControlSession(uint32_t logonid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSStopRemoteControlSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logonid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logonid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSTerminateProcess(void* hserver, uint32_t processid, uint32_t exitcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSTerminateProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, processid, exitcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)processid;
    (void)exitcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSUnRegisterSessionNotification(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSUnRegisterSessionNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSUnRegisterSessionNotificationEx(void* hserver, void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSUnRegisterSessionNotificationEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, hwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)hwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelClose(void* hchannelhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchannelhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hchannelhandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelOpen(void* hserver, uint32_t sessionid, void* pvirtualname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, sessionid, pvirtualname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hserver;
    (void)sessionid;
    (void)pvirtualname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelOpenEx(uint32_t sessionid, void* pvirtualname, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelOpenEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionid, pvirtualname, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)sessionid;
    (void)pvirtualname;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelPurgeInput(void* hchannelhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelPurgeInput");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchannelhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hchannelhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelPurgeOutput(void* hchannelhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelPurgeOutput");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchannelhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hchannelhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelQuery(void* hchannelhandle, int32_t param1, void* ppbuffer, void* pbytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelQuery");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchannelhandle, param1, ppbuffer, pbytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hchannelhandle;
    (void)param1;
    (void)ppbuffer;
    (void)pbytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelRead(void* hchannelhandle, uint32_t timeout, void* buffer, uint32_t buffersize, void* pbytesread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchannelhandle, timeout, buffer, buffersize, pbytesread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hchannelhandle;
    (void)timeout;
    (void)buffer;
    (void)buffersize;
    (void)pbytesread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelWrite(void* hchannelhandle, void* buffer, uint32_t length, void* pbyteswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchannelhandle, buffer, length, pbyteswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hchannelhandle;
    (void)buffer;
    (void)length;
    (void)pbyteswritten;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_remotedesktop_wTSWaitSystemEvent(void* hserver, uint32_t eventmask, void* peventflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSWaitSystemEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hserver, eventmask, peventflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hserver;
    (void)eventmask;
    (void)peventflags;
    errno = ENOSYS;
    return -1;
#endif
}

