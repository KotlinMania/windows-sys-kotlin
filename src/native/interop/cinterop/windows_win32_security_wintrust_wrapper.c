#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_wintrust_wrapper.h"
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

int32_t windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialog(void* hwndparent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPersonalTrustDBDialog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialogEx(void* hwndparent, uint32_t dwflags, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPersonalTrustDBDialogEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, dwflags, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityWintrustWTHelperCertCheckValidSignature(void* pprovdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTHelperCertCheckValidSignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprovdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprovdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityWintrustWTHelperCertIsSelfSigned(uint32_t dwencoding, void* pcert) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTHelperCertIsSelfSigned");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwencoding, pcert);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwencoding;
    (void)pcert;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SecurityWintrustWTHelperGetProvCertFromChain(void* psgnr, uint32_t idxcert) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTHelperGetProvCertFromChain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psgnr, idxcert);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)psgnr;
    (void)idxcert;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SecurityWintrustWTHelperGetProvPrivateDataFromChain(void* pprovdata, void* pgproviderid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTHelperGetProvPrivateDataFromChain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprovdata, pgproviderid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pprovdata;
    (void)pgproviderid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SecurityWintrustWTHelperGetProvSignerFromChain(void* pprovdata, uint32_t idxsigner, int32_t fcountersigner, uint32_t idxcountersigner) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTHelperGetProvSignerFromChain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprovdata, idxsigner, fcountersigner, idxcountersigner);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pprovdata;
    (void)idxsigner;
    (void)fcountersigner;
    (void)idxcountersigner;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SecurityWintrustWTHelperProvDataFromStateData(void* hstatedata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTHelperProvDataFromStateData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstatedata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hstatedata;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SecurityWintrustWinVerifyTrust(void* hwnd, void* pgactionid, void* pwvtdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinVerifyTrust");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pgactionid, pwvtdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pgactionid;
    (void)pwvtdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityWintrustWinVerifyTrustEx(void* hwnd, void* pgactionid, void* pwintrustdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinVerifyTrustEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pgactionid, pwintrustdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pgactionid;
    (void)pwintrustdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityWintrustWintrustAddActionID(void* pgactionid, uint32_t fdwflags, void* psprovinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustAddActionID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pgactionid, fdwflags, psprovinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pgactionid;
    (void)fdwflags;
    (void)psprovinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityWintrustWintrustAddDefaultForUsage(void* pszusageoid, void* psdefusage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustAddDefaultForUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszusageoid, psdefusage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszusageoid;
    (void)psdefusage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityWintrustWintrustGetDefaultForUsage(uint32_t dwaction, void* pszusageoid, void* psusage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustGetDefaultForUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwaction, pszusageoid, psusage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwaction;
    (void)pszusageoid;
    (void)psusage;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SecurityWintrustWintrustGetRegPolicyFlags(void* pdwpolicyflags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustGetRegPolicyFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pdwpolicyflags);
        return;
    }
    errno = ENOSYS;
#else
    (void)pdwpolicyflags;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SecurityWintrustWintrustLoadFunctionPointers(void* pgactionid, void* ppfns) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustLoadFunctionPointers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pgactionid, ppfns);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pgactionid;
    (void)ppfns;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SecurityWintrustWintrustRemoveActionID(void* pgactionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustRemoveActionID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pgactionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pgactionid;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SecurityWintrustWintrustSetDefaultIncludePEPageHashes(int32_t fincludepepagehashes) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustSetDefaultIncludePEPageHashes");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fincludepepagehashes);
        return;
    }
    errno = ENOSYS;
#else
    (void)fincludepepagehashes;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SecurityWintrustWintrustSetRegPolicyFlags(uint32_t dwpolicyflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustSetRegPolicyFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwpolicyflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwpolicyflags;
    errno = ENOSYS;
    return -1;
#endif
}

