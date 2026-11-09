#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_com_urlmon_wrapper.h"
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

int32_t windowssys_windows_win32_system_com_urlmon_CoGetClassObjectFromURL(void* rclassid, void* szcode, uint32_t dwfileversionms, uint32_t dwfileversionls, void* sztype, void* pbindctx, uint32_t dwclscontext, void* pvreserved, void* riid, void* ppv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetClassObjectFromURL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rclassid, szcode, dwfileversionms, dwfileversionls, sztype, pbindctx, dwclscontext, pvreserved, riid, ppv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rclassid;
    (void)szcode;
    (void)dwfileversionms;
    (void)dwfileversionls;
    (void)sztype;
    (void)pbindctx;
    (void)dwclscontext;
    (void)pvreserved;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetCombineIUri(void* pbaseuri, void* prelativeuri, uint32_t dwcombineflags, void* ppcombineduri, uint64_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetCombineIUri");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbaseuri, prelativeuri, dwcombineflags, ppcombineduri, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbaseuri;
    (void)prelativeuri;
    (void)dwcombineflags;
    (void)ppcombineduri;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetCombineUrl(void* pwzbaseurl, void* pwzrelativeurl, uint32_t dwcombineflags, void* pszresult, uint32_t cchresult, void* pcchresult, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetCombineUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzbaseurl, pwzrelativeurl, dwcombineflags, pszresult, cchresult, pcchresult, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzbaseurl;
    (void)pwzrelativeurl;
    (void)dwcombineflags;
    (void)pszresult;
    (void)cchresult;
    (void)pcchresult;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetCombineUrlEx(void* pbaseuri, void* pwzrelativeurl, uint32_t dwcombineflags, void* ppcombineduri, uint64_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetCombineUrlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbaseuri, pwzrelativeurl, dwcombineflags, ppcombineduri, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbaseuri;
    (void)pwzrelativeurl;
    (void)dwcombineflags;
    (void)ppcombineduri;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetCompareUrl(void* pwzurl1, void* pwzurl2, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetCompareUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzurl1, pwzurl2, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzurl1;
    (void)pwzurl2;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetCreateSecurityManager(void* psp, void* ppsm, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetCreateSecurityManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psp, ppsm, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psp;
    (void)ppsm;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetCreateZoneManager(void* psp, void* ppzm, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetCreateZoneManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psp, ppzm, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psp;
    (void)ppzm;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetGetProtocolFlags(void* pwzurl, void* pdwflags, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetGetProtocolFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzurl, pdwflags, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzurl;
    (void)pdwflags;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetGetSecurityUrl(void* pwszurl, void* ppwszsecurl, int32_t psuaction, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetGetSecurityUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszurl, ppwszsecurl, psuaction, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszurl;
    (void)ppwszsecurl;
    (void)psuaction;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetGetSecurityUrlEx(void* puri, void* ppsecuri, int32_t psuaction, uint64_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetGetSecurityUrlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puri, ppsecuri, psuaction, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)puri;
    (void)ppsecuri;
    (void)psuaction;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetGetSession(uint32_t dwsessionmode, void* ppiinternetsession, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetGetSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwsessionmode, ppiinternetsession, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwsessionmode;
    (void)ppiinternetsession;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabled(int32_t featureentry, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetIsFeatureEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(featureentry, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)featureentry;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabledForIUri(int32_t featureentry, uint32_t dwflags, void* piuri, void* psecmgr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetIsFeatureEnabledForIUri");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(featureentry, dwflags, piuri, psecmgr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)featureentry;
    (void)dwflags;
    (void)piuri;
    (void)psecmgr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabledForUrl(int32_t featureentry, uint32_t dwflags, void* szurl, void* psecmgr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetIsFeatureEnabledForUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(featureentry, dwflags, szurl, psecmgr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)featureentry;
    (void)dwflags;
    (void)szurl;
    (void)psecmgr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureZoneElevationEnabled(void* szfromurl, void* sztourl, void* psecmgr, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetIsFeatureZoneElevationEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfromurl, sztourl, psecmgr, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szfromurl;
    (void)sztourl;
    (void)psecmgr;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetParseIUri(void* piuri, int32_t parseaction, uint32_t dwflags, void* pwzresult, uint32_t cchresult, void* pcchresult, uint64_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetParseIUri");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(piuri, parseaction, dwflags, pwzresult, cchresult, pcchresult, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)piuri;
    (void)parseaction;
    (void)dwflags;
    (void)pwzresult;
    (void)cchresult;
    (void)pcchresult;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetParseUrl(void* pwzurl, int32_t parseaction, uint32_t dwflags, void* pszresult, uint32_t cchresult, void* pcchresult, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetParseUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzurl, parseaction, dwflags, pszresult, cchresult, pcchresult, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzurl;
    (void)parseaction;
    (void)dwflags;
    (void)pszresult;
    (void)cchresult;
    (void)pcchresult;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetQueryInfo(void* pwzurl, int32_t queryoptions, uint32_t dwqueryflags, void* pvbuffer, uint32_t cbbuffer, void* pcbbuffer, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetQueryInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzurl, queryoptions, dwqueryflags, pvbuffer, cbbuffer, pcbbuffer, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzurl;
    (void)queryoptions;
    (void)dwqueryflags;
    (void)pvbuffer;
    (void)cbbuffer;
    (void)pcbbuffer;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CoInternetSetFeatureEnabled(int32_t featureentry, uint32_t dwflags, int32_t fenable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetSetFeatureEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(featureentry, dwflags, fenable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)featureentry;
    (void)dwflags;
    (void)fenable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CompareSecurityIds(void* pbsecurityid1, uint32_t dwlen1, void* pbsecurityid2, uint32_t dwlen2, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompareSecurityIds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbsecurityid1, dwlen1, pbsecurityid2, dwlen2, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbsecurityid1;
    (void)dwlen1;
    (void)pbsecurityid2;
    (void)dwlen2;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CompatFlagsFromClsid(void* pclsid, void* pdwcompatflags, void* pdwmiscstatusflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompatFlagsFromClsid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pclsid, pdwcompatflags, pdwmiscstatusflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pclsid;
    (void)pdwcompatflags;
    (void)pdwmiscstatusflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CopyBindInfo(void* pcbisrc, void* pbidest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyBindInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcbisrc, pbidest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcbisrc;
    (void)pbidest;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CopyStgMedium(void* pcstgmedsrc, void* pstgmeddest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyStgMedium");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcstgmedsrc, pstgmeddest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcstgmedsrc;
    (void)pstgmeddest;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CreateAsyncBindCtx(uint32_t reserved, void* pbscb, void* pefetc, void* ppbc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateAsyncBindCtx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved, pbscb, pefetc, ppbc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reserved;
    (void)pbscb;
    (void)pefetc;
    (void)ppbc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CreateAsyncBindCtxEx(void* pbc, uint32_t dwoptions, void* pbscb, void* penum, void* ppbc, uint32_t reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateAsyncBindCtxEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbc, dwoptions, pbscb, penum, ppbc, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbc;
    (void)dwoptions;
    (void)pbscb;
    (void)penum;
    (void)ppbc;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CreateFormatEnumerator(uint32_t cfmtetc, void* rgfmtetc, void* ppenumfmtetc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFormatEnumerator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cfmtetc, rgfmtetc, ppenumfmtetc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cfmtetc;
    (void)rgfmtetc;
    (void)ppenumfmtetc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CreateURLMoniker(void* pmkctx, void* szurl, void* ppmk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateURLMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmkctx, szurl, ppmk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmkctx;
    (void)szurl;
    (void)ppmk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CreateURLMonikerEx(void* pmkctx, void* szurl, void* ppmk, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateURLMonikerEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmkctx, szurl, ppmk, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmkctx;
    (void)szurl;
    (void)ppmk;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_CreateURLMonikerEx2(void* pmkctx, void* puri, void* ppmk, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateURLMonikerEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmkctx, puri, ppmk, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmkctx;
    (void)puri;
    (void)ppmk;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_FaultInIEFeature(void* hwnd, void* pclassspec, void* pquery, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaultInIEFeature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pclassspec, pquery, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pclassspec;
    (void)pquery;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_FindMediaType(void* rgsztypes, void* rgcftypes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindMediaType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rgsztypes, rgcftypes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rgsztypes;
    (void)rgcftypes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_FindMediaTypeClass(void* pbc, void* sztype, void* pclsid, uint32_t reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindMediaTypeClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbc, sztype, pclsid, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbc;
    (void)sztype;
    (void)pclsid;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_FindMimeFromData(void* pbc, void* pwzurl, void* pbuffer, uint32_t cbsize, void* pwzmimeproposed, uint32_t dwmimeflags, void* ppwzmimeout, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindMimeFromData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbc, pwzurl, pbuffer, cbsize, pwzmimeproposed, dwmimeflags, ppwzmimeout, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbc;
    (void)pwzurl;
    (void)pbuffer;
    (void)cbsize;
    (void)pwzmimeproposed;
    (void)dwmimeflags;
    (void)ppwzmimeout;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_GetClassFileOrMime(void* pbc, void* szfilename, void* pbuffer, uint32_t cbsize, void* szmime, uint32_t dwreserved, void* pclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassFileOrMime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbc, szfilename, pbuffer, cbsize, szmime, dwreserved, pclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbc;
    (void)szfilename;
    (void)pbuffer;
    (void)cbsize;
    (void)szmime;
    (void)dwreserved;
    (void)pclsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_GetClassURL(void* szurl, void* pclsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassURL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szurl, pclsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szurl;
    (void)pclsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_GetComponentIDFromCLSSPEC(void* pclassspec, void* ppszcomponentid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComponentIDFromCLSSPEC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pclassspec, ppszcomponentid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pclassspec;
    (void)ppszcomponentid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_GetSoftwareUpdateInfo(void* szdistunit, void* psdi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSoftwareUpdateInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdistunit, psdi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szdistunit;
    (void)psdi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_HlinkGoBack(void* punk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkGoBack");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_HlinkGoForward(void* punk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkGoForward");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_HlinkNavigateMoniker(void* punk, void* pmktarget) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkNavigateMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, pmktarget);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)pmktarget;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_HlinkNavigateString(void* punk, void* sztarget) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkNavigateString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punk, sztarget);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punk;
    (void)sztarget;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_HlinkSimpleNavigateToMoniker(void* pmktarget, void* szlocation, void* sztargetframename, void* punk, void* pbc, void* param5, uint32_t grfhlnf, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkSimpleNavigateToMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmktarget, szlocation, sztargetframename, punk, pbc, param5, grfhlnf, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmktarget;
    (void)szlocation;
    (void)sztargetframename;
    (void)punk;
    (void)pbc;
    (void)param5;
    (void)grfhlnf;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_HlinkSimpleNavigateToString(void* sztarget, void* szlocation, void* sztargetframename, void* punk, void* pbc, void* param5, uint32_t grfhlnf, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkSimpleNavigateToString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sztarget, szlocation, sztargetframename, punk, pbc, param5, grfhlnf, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sztarget;
    (void)szlocation;
    (void)sztargetframename;
    (void)punk;
    (void)pbc;
    (void)param5;
    (void)grfhlnf;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_com_urlmon_IEGetUserPrivateNamespaceName(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEGetUserPrivateNamespaceName");
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

int32_t windowssys_windows_win32_system_com_urlmon_IEInstallScope(void* pdwscope) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEInstallScope");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdwscope);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdwscope;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_IsAsyncMoniker(void* pmk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsAsyncMoniker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_IsLoggingEnabledA(void* pszurl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsLoggingEnabledA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_IsLoggingEnabledW(void* pwszurl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsLoggingEnabledW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszurl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszurl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_IsValidURL(void* pbc, void* szurl, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidURL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbc, szurl, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbc;
    (void)szurl;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_MkParseDisplayNameEx(void* pbc, void* szdisplayname, void* pcheaten, void* ppmk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MkParseDisplayNameEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbc, szdisplayname, pcheaten, ppmk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbc;
    (void)szdisplayname;
    (void)pcheaten;
    (void)ppmk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_ObtainUserAgentString(uint32_t dwoption, void* pszuaout, void* cbsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObtainUserAgentString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwoption, pszuaout, cbsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwoption;
    (void)pszuaout;
    (void)cbsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_RegisterBindStatusCallback(void* pbc, void* pbscb, void* ppbscbprev, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterBindStatusCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbc, pbscb, ppbscbprev, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbc;
    (void)pbscb;
    (void)ppbscbprev;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_RegisterFormatEnumerator(void* pbc, void* pefetc, uint32_t reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterFormatEnumerator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbc, pefetc, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbc;
    (void)pefetc;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_RegisterMediaTypeClass(void* pbc, uint32_t ctypes, void* rgsztypes, void* rgclsid, uint32_t reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterMediaTypeClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbc, ctypes, rgsztypes, rgclsid, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbc;
    (void)ctypes;
    (void)rgsztypes;
    (void)rgclsid;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_RegisterMediaTypes(uint32_t ctypes, void* rgsztypes, void* rgcftypes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterMediaTypes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ctypes, rgsztypes, rgcftypes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ctypes;
    (void)rgsztypes;
    (void)rgcftypes;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_com_urlmon_ReleaseBindInfo(void* pbindinfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseBindInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbindinfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbindinfo;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_RevokeBindStatusCallback(void* pbc, void* pbscb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevokeBindStatusCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbc, pbscb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbc;
    (void)pbscb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_RevokeFormatEnumerator(void* pbc, void* pefetc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevokeFormatEnumerator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbc, pefetc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbc;
    (void)pefetc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_SetAccessForIEAppContainer(void* hobject, int32_t ieobjecttype, uint32_t dwaccessmask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAccessForIEAppContainer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobject, ieobjecttype, dwaccessmask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobject;
    (void)ieobjecttype;
    (void)dwaccessmask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_SetSoftwareUpdateAdvertisementState(void* szdistunit, uint32_t dwadstate, uint32_t dwadvertisedversionms, uint32_t dwadvertisedversionls) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSoftwareUpdateAdvertisementState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdistunit, dwadstate, dwadvertisedversionms, dwadvertisedversionls);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szdistunit;
    (void)dwadstate;
    (void)dwadvertisedversionms;
    (void)dwadvertisedversionls;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_URLDownloadToCacheFileA(void* param0, void* param1, void* param2, uint32_t cchfilename, uint32_t param4, void* param5) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLDownloadToCacheFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, cchfilename, param4, param5);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)cchfilename;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_URLDownloadToCacheFileW(void* param0, void* param1, void* param2, uint32_t cchfilename, uint32_t param4, void* param5) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLDownloadToCacheFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, cchfilename, param4, param5);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)cchfilename;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_URLDownloadToFileA(void* param0, void* param1, void* param2, uint32_t param3, void* param4) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLDownloadToFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_URLDownloadToFileW(void* param0, void* param1, void* param2, uint32_t param3, void* param4) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLDownloadToFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_URLOpenBlockingStreamA(void* param0, void* param1, void* param2, uint32_t param3, void* param4) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLOpenBlockingStreamA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_URLOpenBlockingStreamW(void* param0, void* param1, void* param2, uint32_t param3, void* param4) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLOpenBlockingStreamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_URLOpenPullStreamA(void* param0, void* param1, uint32_t param2, void* param3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLOpenPullStreamA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_URLOpenPullStreamW(void* param0, void* param1, uint32_t param2, void* param3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLOpenPullStreamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_URLOpenStreamA(void* param0, void* param1, uint32_t param2, void* param3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLOpenStreamA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_URLOpenStreamW(void* param0, void* param1, uint32_t param2, void* param3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLOpenStreamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_UrlMkGetSessionOption(uint32_t dwoption, void* pbuffer, uint32_t dwbufferlength, void* pdwbufferlengthout, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlMkGetSessionOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwoption, pbuffer, dwbufferlength, pdwbufferlengthout, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwoption;
    (void)pbuffer;
    (void)dwbufferlength;
    (void)pdwbufferlengthout;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_UrlMkSetSessionOption(uint32_t dwoption, void* pbuffer, uint32_t dwbufferlength, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlMkSetSessionOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwoption, pbuffer, dwbufferlength, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwoption;
    (void)pbuffer;
    (void)dwbufferlength;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_com_urlmon_WriteHitLogging(void* lplogginginfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteHitLogging");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplogginginfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplogginginfo;
    errno = ENOSYS;
    return -1;
#endif
}

