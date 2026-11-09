#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_clrhosting_wrapper.h"
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

int32_t windowssys_windows_win32_system_clrhosting_CLRCreateInstance(void* clsid, void* riid, void* ppinterface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CLRCreateInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clsid, riid, ppinterface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clsid;
    (void)riid;
    (void)ppinterface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_CallFunctionShim(void* szdllname, void* szfunctionname, void* lpvargument1, void* lpvargument2, void* szversion, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallFunctionShim");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdllname, szfunctionname, lpvargument1, lpvargument2, szversion, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szdllname;
    (void)szfunctionname;
    (void)lpvargument1;
    (void)lpvargument2;
    (void)szversion;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_ClrCreateManagedInstance(void* ptypename, void* riid, void* ppobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClrCreateManagedInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptypename, riid, ppobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptypename;
    (void)riid;
    (void)ppobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_CorBindToCurrentRuntime(void* pwszfilename, void* rclsid, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorBindToCurrentRuntime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszfilename, rclsid, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszfilename;
    (void)rclsid;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_CorBindToRuntime(void* pwszversion, void* pwszbuildflavor, void* rclsid, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorBindToRuntime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszversion, pwszbuildflavor, rclsid, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszversion;
    (void)pwszbuildflavor;
    (void)rclsid;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_CorBindToRuntimeByCfg(void* pcfgstream, uint32_t reserved, uint32_t startupflags, void* rclsid, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorBindToRuntimeByCfg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcfgstream, reserved, startupflags, rclsid, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcfgstream;
    (void)reserved;
    (void)startupflags;
    (void)rclsid;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_CorBindToRuntimeEx(void* pwszversion, void* pwszbuildflavor, uint32_t startupflags, void* rclsid, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorBindToRuntimeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszversion, pwszbuildflavor, startupflags, rclsid, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszversion;
    (void)pwszbuildflavor;
    (void)startupflags;
    (void)rclsid;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_CorBindToRuntimeHost(void* pwszversion, void* pwszbuildflavor, void* pwszhostconfigfile, void* preserved, uint32_t startupflags, void* rclsid, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorBindToRuntimeHost");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszversion, pwszbuildflavor, pwszhostconfigfile, preserved, startupflags, rclsid, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszversion;
    (void)pwszbuildflavor;
    (void)pwszhostconfigfile;
    (void)preserved;
    (void)startupflags;
    (void)rclsid;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_clrhosting_CorExitProcess(int32_t exitcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorExitProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(exitcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)exitcode;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_CorLaunchApplication(int32_t dwclickoncehost, void* pwzappfullname, uint32_t dwmanifestpaths, void* ppwzmanifestpaths, uint32_t dwactivationdata, void* ppwzactivationdata, void* lpprocessinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorLaunchApplication");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwclickoncehost, pwzappfullname, dwmanifestpaths, ppwzmanifestpaths, dwactivationdata, ppwzactivationdata, lpprocessinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwclickoncehost;
    (void)pwzappfullname;
    (void)dwmanifestpaths;
    (void)ppwzmanifestpaths;
    (void)dwactivationdata;
    (void)ppwzactivationdata;
    (void)lpprocessinformation;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_clrhosting_CorMarkThreadInThreadPool(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CorMarkThreadInThreadPool");
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

int32_t windowssys_windows_win32_system_clrhosting_CreateDebuggingInterfaceFromVersion(int32_t idebuggerversion, void* szdebuggeeversion, void* ppcordb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDebuggingInterfaceFromVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idebuggerversion, szdebuggeeversion, ppcordb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idebuggerversion;
    (void)szdebuggeeversion;
    (void)ppcordb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_GetCLRIdentityManager(void* riid, void* ppmanager) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCLRIdentityManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(riid, ppmanager);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)riid;
    (void)ppmanager;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_GetCORRequiredVersion(void* pbuffer, uint32_t cchbuffer, void* dwlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCORRequiredVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbuffer, cchbuffer, dwlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbuffer;
    (void)cchbuffer;
    (void)dwlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_GetCORSystemDirectory(void* pbuffer, uint32_t cchbuffer, void* dwlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCORSystemDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbuffer, cchbuffer, dwlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbuffer;
    (void)cchbuffer;
    (void)dwlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_GetCORVersion(void* pbbuffer, uint32_t cchbuffer, void* dwlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCORVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbbuffer, cchbuffer, dwlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbbuffer;
    (void)cchbuffer;
    (void)dwlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_GetFileVersion(void* szfilename, void* szbuffer, uint32_t cchbuffer, void* dwlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilename, szbuffer, cchbuffer, dwlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szfilename;
    (void)szbuffer;
    (void)cchbuffer;
    (void)dwlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_GetRealProcAddress(void* pwszprocname, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRealProcAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszprocname, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszprocname;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeInfo(void* pexe, void* pwszversion, void* pconfigurationfile, uint32_t startupflags, uint32_t runtimeinfoflags, void* pdirectory, uint32_t dwdirectory, void* dwdirectorylength, void* pversion, uint32_t cchbuffer, void* dwlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRequestedRuntimeInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pexe, pwszversion, pconfigurationfile, startupflags, runtimeinfoflags, pdirectory, dwdirectory, dwdirectorylength, pversion, cchbuffer, dwlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pexe;
    (void)pwszversion;
    (void)pconfigurationfile;
    (void)startupflags;
    (void)runtimeinfoflags;
    (void)pdirectory;
    (void)dwdirectory;
    (void)dwdirectorylength;
    (void)pversion;
    (void)cchbuffer;
    (void)dwlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeVersion(void* pexe, void* pversion, uint32_t cchbuffer, void* dwlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRequestedRuntimeVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pexe, pversion, cchbuffer, dwlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pexe;
    (void)pversion;
    (void)cchbuffer;
    (void)dwlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeVersionForCLSID(void* rclsid, void* pversion, uint32_t cchbuffer, void* dwlength, int32_t dwresolutionflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRequestedRuntimeVersionForCLSID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclsid, pversion, cchbuffer, dwlength, dwresolutionflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclsid;
    (void)pversion;
    (void)cchbuffer;
    (void)dwlength;
    (void)dwresolutionflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_GetVersionFromProcess(void* hprocess, void* pversion, uint32_t cchbuffer, void* dwlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVersionFromProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, pversion, cchbuffer, dwlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)pversion;
    (void)cchbuffer;
    (void)dwlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_LoadLibraryShim(void* szdllname, void* szversion, void* pvreserved, void* phmoddll) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadLibraryShim");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdllname, szversion, pvreserved, phmoddll);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szdllname;
    (void)szversion;
    (void)pvreserved;
    (void)phmoddll;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_LoadStringRC(uint32_t iresouceid, void* szbuffer, int32_t imax, int32_t bquiet) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadStringRC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iresouceid, szbuffer, imax, bquiet);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iresouceid;
    (void)szbuffer;
    (void)imax;
    (void)bquiet;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_LoadStringRCEx(uint32_t lcid, uint32_t iresouceid, void* szbuffer, int32_t imax, int32_t bquiet, void* pcwchused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadStringRCEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lcid, iresouceid, szbuffer, imax, bquiet, pcwchused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lcid;
    (void)iresouceid;
    (void)szbuffer;
    (void)imax;
    (void)bquiet;
    (void)pcwchused;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_LockClrVersion(void* hostcallback, void* pbeginhostsetup, void* pendhostsetup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockClrVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostcallback, pbeginhostsetup, pendhostsetup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hostcallback;
    (void)pbeginhostsetup;
    (void)pendhostsetup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_clrhosting_RunDll32ShimW(void* hwnd, void* hinst, void* lpszcmdline, int32_t ncmdshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscoree.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RunDll32ShimW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hinst, lpszcmdline, ncmdshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hinst;
    (void)lpszcmdline;
    (void)ncmdshow;
    errno = ENOSYS;
    return -1;
#endif
}

