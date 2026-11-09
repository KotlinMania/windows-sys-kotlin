#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_enterprisedata_wrapper.h"
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

int32_t windowssys_windows_win32_security_enterprisedata_ProtectFileToEnterpriseIdentity(void* fileorfolderpath, void* identity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("efswrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProtectFileToEnterpriseIdentity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileorfolderpath, identity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileorfolderpath;
    (void)identity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_enterprisedata_SrpCloseThreadNetworkContext(void* threadnetworkcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpCloseThreadNetworkContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadnetworkcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadnetworkcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_enterprisedata_SrpCreateThreadNetworkContext(void* enterpriseid, void* threadnetworkcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpCreateThreadNetworkContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enterpriseid, threadnetworkcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enterpriseid;
    (void)threadnetworkcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_enterprisedata_SrpDisablePermissiveModeFileEncryption(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpDisablePermissiveModeFileEncryption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_enterprisedata_SrpDoesPolicyAllowAppExecution(void* packageid, void* isallowed) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpDoesPolicyAllowAppExecution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packageid, isallowed);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)packageid;
    (void)isallowed;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_enterprisedata_SrpEnablePermissiveModeFileEncryption(void* enterpriseid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpEnablePermissiveModeFileEncryption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enterpriseid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enterpriseid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_enterprisedata_SrpGetEnterpriseIds(void* tokenhandle, void* numberofbytes, void* enterpriseids, void* enterpriseidcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpGetEnterpriseIds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, numberofbytes, enterpriseids, enterpriseidcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)numberofbytes;
    (void)enterpriseids;
    (void)enterpriseidcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_enterprisedata_SrpGetEnterprisePolicy(void* tokenhandle, void* policyflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpGetEnterprisePolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, policyflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)policyflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_enterprisedata_SrpHostingInitialize(int32_t version, int32_t type, void* pvdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpHostingInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(version, type, pvdata, cbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)version;
    (void)type;
    (void)pvdata;
    (void)cbdata;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_security_enterprisedata_SrpHostingTerminate(int32_t type) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpHostingTerminate");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(type);
        return;
    }
    errno = ENOSYS;
#else
    (void)type;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_security_enterprisedata_SrpIsTokenService(void* tokenhandle, void* istokenservice) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpIsTokenService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, istokenservice);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)istokenservice;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_enterprisedata_SrpSetTokenEnterpriseId(void* tokenhandle, void* enterpriseid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("srpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SrpSetTokenEnterpriseId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, enterpriseid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)enterpriseid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_enterprisedata_UnprotectFile(void* fileorfolderpath, void* options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("efswrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnprotectFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileorfolderpath, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileorfolderpath;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

