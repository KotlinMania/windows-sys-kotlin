#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_data_rightsmanagement_wrapper.h"
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

int32_t windowssys_windows_win32_data_rightsmanagement_dRMAcquireAdvisories(uint32_t hlicensestorage, void* wszlicense, void* wszurl, void* pvcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMAcquireAdvisories");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlicensestorage, wszlicense, wszurl, pvcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlicensestorage;
    (void)wszlicense;
    (void)wszurl;
    (void)pvcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMAcquireIssuanceLicenseTemplate(uint32_t hclient, uint32_t uflags, void* pvreserved, uint32_t ctemplates, void* pwsztemplateids, void* wszurl, void* pvcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMAcquireIssuanceLicenseTemplate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclient, uflags, pvreserved, ctemplates, pwsztemplateids, wszurl, pvcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hclient;
    (void)uflags;
    (void)pvreserved;
    (void)ctemplates;
    (void)pwsztemplateids;
    (void)wszurl;
    (void)pvcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMAcquireLicense(uint32_t hsession, uint32_t uflags, void* wszgroupidentitycredential, void* wszrequestedrights, void* wszcustomdata, void* wszurl, void* pvcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMAcquireLicense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, uflags, wszgroupidentitycredential, wszrequestedrights, wszcustomdata, wszurl, pvcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)uflags;
    (void)wszgroupidentitycredential;
    (void)wszrequestedrights;
    (void)wszcustomdata;
    (void)wszurl;
    (void)pvcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMActivate(uint32_t hclient, uint32_t uflags, uint32_t ulangid, void* pactservinfo, void* pvcontext, void* hparentwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMActivate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclient, uflags, ulangid, pactservinfo, pvcontext, hparentwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hclient;
    (void)uflags;
    (void)ulangid;
    (void)pactservinfo;
    (void)pvcontext;
    (void)hparentwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMAddLicense(uint32_t hlicensestorage, uint32_t uflags, void* wszlicense) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMAddLicense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlicensestorage, uflags, wszlicense);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlicensestorage;
    (void)uflags;
    (void)wszlicense;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMAddRightWithUser(uint32_t hissuancelicense, uint32_t hright, uint32_t huser) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMAddRightWithUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, hright, huser);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)hright;
    (void)huser;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMAttest(uint32_t henablingprincipal, void* wszdata, int32_t etype, void* pcattestedblob, void* wszattestedblob) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMAttest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henablingprincipal, wszdata, etype, pcattestedblob, wszattestedblob);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henablingprincipal;
    (void)wszdata;
    (void)etype;
    (void)pcattestedblob;
    (void)wszattestedblob;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMCheckSecurity(uint32_t henv, uint32_t clevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCheckSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, clevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)clevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMClearAllRights(uint32_t hissuancelicense) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMClearAllRights");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMCloseEnvironmentHandle(uint32_t henv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCloseEnvironmentHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMCloseHandle(uint32_t handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCloseHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMClosePubHandle(uint32_t hpub) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMClosePubHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpub);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpub;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMCloseQueryHandle(uint32_t hquery) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCloseQueryHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hquery);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hquery;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMCloseSession(uint32_t hsession) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCloseSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMConstructCertificateChain(uint32_t ccertificates, void* rgwszcertificates, void* pcchain, void* wszchain) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMConstructCertificateChain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ccertificates, rgwszcertificates, pcchain, wszchain);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ccertificates;
    (void)rgwszcertificates;
    (void)pcchain;
    (void)wszchain;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateBoundLicense(uint32_t henv, void* pparams, void* wszlicensechain, void* phboundlicense, void* pherrorlog) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateBoundLicense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, pparams, wszlicensechain, phboundlicense, pherrorlog);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)pparams;
    (void)wszlicensechain;
    (void)phboundlicense;
    (void)pherrorlog;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateClientSession(void* pfncallback, uint32_t ucallbackversion, void* wszgroupidprovidertype, void* wszgroupid, void* phclient) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateClientSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfncallback, ucallbackversion, wszgroupidprovidertype, wszgroupid, phclient);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfncallback;
    (void)ucallbackversion;
    (void)wszgroupidprovidertype;
    (void)wszgroupid;
    (void)phclient;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingBitsDecryptor(uint32_t hboundlicense, void* wszright, uint32_t hauxlib, void* wszauxplug, void* phdecryptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateEnablingBitsDecryptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hboundlicense, wszright, hauxlib, wszauxplug, phdecryptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hboundlicense;
    (void)wszright;
    (void)hauxlib;
    (void)wszauxplug;
    (void)phdecryptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingBitsEncryptor(uint32_t hboundlicense, void* wszright, uint32_t hauxlib, void* wszauxplug, void* phencryptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateEnablingBitsEncryptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hboundlicense, wszright, hauxlib, wszauxplug, phencryptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hboundlicense;
    (void)wszright;
    (void)hauxlib;
    (void)wszauxplug;
    (void)phencryptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingPrincipal(uint32_t henv, uint32_t hlibrary, void* wszobject, void* pidprincipal, void* wszcredentials, void* phenablingprincipal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateEnablingPrincipal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, hlibrary, wszobject, pidprincipal, wszcredentials, phenablingprincipal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)hlibrary;
    (void)wszobject;
    (void)pidprincipal;
    (void)wszcredentials;
    (void)phenablingprincipal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateIssuanceLicense(void* psttimefrom, void* psttimeuntil, void* wszreferralinfoname, void* wszreferralinfourl, uint32_t howner, void* wszissuancelicense, uint32_t hboundlicense, void* phissuancelicense) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateIssuanceLicense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psttimefrom, psttimeuntil, wszreferralinfoname, wszreferralinfourl, howner, wszissuancelicense, hboundlicense, phissuancelicense);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psttimefrom;
    (void)psttimeuntil;
    (void)wszreferralinfoname;
    (void)wszreferralinfourl;
    (void)howner;
    (void)wszissuancelicense;
    (void)hboundlicense;
    (void)phissuancelicense;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateLicenseStorageSession(uint32_t henv, uint32_t hdefaultlibrary, uint32_t hclient, uint32_t uflags, void* wszissuancelicense, void* phlicensestorage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateLicenseStorageSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, hdefaultlibrary, hclient, uflags, wszissuancelicense, phlicensestorage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)hdefaultlibrary;
    (void)hclient;
    (void)uflags;
    (void)wszissuancelicense;
    (void)phlicensestorage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateRight(void* wszrightname, void* pstfrom, void* pstuntil, uint32_t cextendedinfo, void* pwszextendedinfoname, void* pwszextendedinfovalue, void* phright) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateRight");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wszrightname, pstfrom, pstuntil, cextendedinfo, pwszextendedinfoname, pwszextendedinfovalue, phright);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wszrightname;
    (void)pstfrom;
    (void)pstuntil;
    (void)cextendedinfo;
    (void)pwszextendedinfoname;
    (void)pwszextendedinfovalue;
    (void)phright;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateUser(void* wszusername, void* wszuserid, void* wszuseridtype, void* phuser) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wszusername, wszuserid, wszuseridtype, phuser);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wszusername;
    (void)wszuserid;
    (void)wszuseridtype;
    (void)phuser;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMDecode(void* wszalgid, void* wszencodedstring, void* pudecodeddatalen, void* pbdecodeddata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDecode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wszalgid, wszencodedstring, pudecodeddatalen, pbdecodeddata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wszalgid;
    (void)wszencodedstring;
    (void)pudecodeddatalen;
    (void)pbdecodeddata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMDeconstructCertificateChain(void* wszchain, uint32_t iwhich, void* pccert, void* wszcert) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDeconstructCertificateChain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wszchain, iwhich, pccert, wszcert);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wszchain;
    (void)iwhich;
    (void)pccert;
    (void)wszcert;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMDecrypt(uint32_t hcryptoprovider, uint32_t iposition, uint32_t cnuminbytes, void* pbindata, void* pcnumoutbytes, void* pboutdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDecrypt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptoprovider, iposition, cnuminbytes, pbindata, pcnumoutbytes, pboutdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptoprovider;
    (void)iposition;
    (void)cnuminbytes;
    (void)pbindata;
    (void)pcnumoutbytes;
    (void)pboutdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMDeleteLicense(uint32_t hsession, void* wszlicenseid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDeleteLicense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, wszlicenseid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)wszlicenseid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMDuplicateEnvironmentHandle(uint32_t htocopy, void* phcopy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDuplicateEnvironmentHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htocopy, phcopy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htocopy;
    (void)phcopy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMDuplicateHandle(uint32_t htocopy, void* phcopy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDuplicateHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htocopy, phcopy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htocopy;
    (void)phcopy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMDuplicatePubHandle(uint32_t hpubin, void* phpubout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDuplicatePubHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpubin, phpubout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpubin;
    (void)phpubout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMDuplicateSession(uint32_t hsessionin, void* phsessionout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDuplicateSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsessionin, phsessionout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsessionin;
    (void)phsessionout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMEncode(void* wszalgid, uint32_t udatalen, void* pbdecodeddata, void* puencodedstringlen, void* wszencodedstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMEncode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wszalgid, udatalen, pbdecodeddata, puencodedstringlen, wszencodedstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wszalgid;
    (void)udatalen;
    (void)pbdecodeddata;
    (void)puencodedstringlen;
    (void)wszencodedstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMEncrypt(uint32_t hcryptoprovider, uint32_t iposition, uint32_t cnuminbytes, void* pbindata, void* pcnumoutbytes, void* pboutdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMEncrypt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcryptoprovider, iposition, cnuminbytes, pbindata, pcnumoutbytes, pboutdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcryptoprovider;
    (void)iposition;
    (void)cnuminbytes;
    (void)pbindata;
    (void)pcnumoutbytes;
    (void)pboutdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMEnumerateLicense(uint32_t hsession, uint32_t uflags, uint32_t uindex, void* pfsharedflag, void* pucertificatedatalen, void* wszcertificatedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMEnumerateLicense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, uflags, uindex, pfsharedflag, pucertificatedatalen, wszcertificatedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)uflags;
    (void)uindex;
    (void)pfsharedflag;
    (void)pucertificatedatalen;
    (void)wszcertificatedata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetApplicationSpecificData(uint32_t hissuancelicense, uint32_t uindex, void* punamelength, void* wszname, void* puvaluelength, void* wszvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetApplicationSpecificData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, uindex, punamelength, wszname, puvaluelength, wszvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)uindex;
    (void)punamelength;
    (void)wszname;
    (void)puvaluelength;
    (void)wszvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseAttribute(uint32_t hqueryroot, void* wszattribute, uint32_t iwhich, void* peencoding, void* pcbuffer, void* pbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetBoundLicenseAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hqueryroot, wszattribute, iwhich, peencoding, pcbuffer, pbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hqueryroot;
    (void)wszattribute;
    (void)iwhich;
    (void)peencoding;
    (void)pcbuffer;
    (void)pbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseAttributeCount(uint32_t hqueryroot, void* wszattribute, void* pcattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetBoundLicenseAttributeCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hqueryroot, wszattribute, pcattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hqueryroot;
    (void)wszattribute;
    (void)pcattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseObject(uint32_t hqueryroot, void* wszsubobjecttype, uint32_t iwhich, void* phsubobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetBoundLicenseObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hqueryroot, wszsubobjecttype, iwhich, phsubobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hqueryroot;
    (void)wszsubobjecttype;
    (void)iwhich;
    (void)phsubobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseObjectCount(uint32_t hqueryroot, void* wszsubobjecttype, void* pcsubobjects) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetBoundLicenseObjectCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hqueryroot, wszsubobjecttype, pcsubobjects);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hqueryroot;
    (void)wszsubobjecttype;
    (void)pcsubobjects;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetCertificateChainCount(void* wszchain, void* pccertcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetCertificateChainCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wszchain, pccertcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wszchain;
    (void)pccertcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetClientVersion(void* pdrmclientversioninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetClientVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdrmclientversioninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdrmclientversioninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetEnvironmentInfo(uint32_t handle, void* wszattribute, void* peencoding, void* pcbuffer, void* pbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetEnvironmentInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, wszattribute, peencoding, pcbuffer, pbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)wszattribute;
    (void)peencoding;
    (void)pcbuffer;
    (void)pbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetInfo(uint32_t handle, void* wszattribute, void* peencoding, void* pcbuffer, void* pbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, wszattribute, peencoding, pcbuffer, pbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)wszattribute;
    (void)peencoding;
    (void)pcbuffer;
    (void)pbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetIntervalTime(uint32_t hissuancelicense, void* pcdays) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetIntervalTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, pcdays);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)pcdays;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetIssuanceLicenseInfo(uint32_t hissuancelicense, void* psttimefrom, void* psttimeuntil, uint32_t uflags, void* pudistributionpointnamelength, void* wszdistributionpointname, void* pudistributionpointurllength, void* wszdistributionpointurl, void* phowner, void* pfofficial) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetIssuanceLicenseInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, psttimefrom, psttimeuntil, uflags, pudistributionpointnamelength, wszdistributionpointname, pudistributionpointurllength, wszdistributionpointurl, phowner, pfofficial);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)psttimefrom;
    (void)psttimeuntil;
    (void)uflags;
    (void)pudistributionpointnamelength;
    (void)wszdistributionpointname;
    (void)pudistributionpointurllength;
    (void)wszdistributionpointurl;
    (void)phowner;
    (void)pfofficial;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetIssuanceLicenseTemplate(uint32_t hissuancelicense, void* puissuancelicensetemplatelength, void* wszissuancelicensetemplate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetIssuanceLicenseTemplate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, puissuancelicensetemplatelength, wszissuancelicensetemplate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)puissuancelicensetemplatelength;
    (void)wszissuancelicensetemplate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetMetaData(uint32_t hissuancelicense, void* pucontentidlength, void* wszcontentid, void* pucontentidtypelength, void* wszcontentidtype, void* puskuidlength, void* wszskuid, void* puskuidtypelength, void* wszskuidtype, void* pucontenttypelength, void* wszcontenttype, void* pucontentnamelength, void* wszcontentname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetMetaData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, pucontentidlength, wszcontentid, pucontentidtypelength, wszcontentidtype, puskuidlength, wszskuid, puskuidtypelength, wszskuidtype, pucontenttypelength, wszcontenttype, pucontentnamelength, wszcontentname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)pucontentidlength;
    (void)wszcontentid;
    (void)pucontentidtypelength;
    (void)wszcontentidtype;
    (void)puskuidlength;
    (void)wszskuid;
    (void)puskuidtypelength;
    (void)wszskuidtype;
    (void)pucontenttypelength;
    (void)wszcontenttype;
    (void)pucontentnamelength;
    (void)wszcontentname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetNameAndDescription(uint32_t hissuancelicense, uint32_t uindex, void* pulcid, void* punamelength, void* wszname, void* pudescriptionlength, void* wszdescription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetNameAndDescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, uindex, pulcid, punamelength, wszname, pudescriptionlength, wszdescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)uindex;
    (void)pulcid;
    (void)punamelength;
    (void)wszname;
    (void)pudescriptionlength;
    (void)wszdescription;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetOwnerLicense(uint32_t hissuancelicense, void* puownerlicenselength, void* wszownerlicense) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetOwnerLicense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, puownerlicenselength, wszownerlicense);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)puownerlicenselength;
    (void)wszownerlicense;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetProcAddress(uint32_t hlibrary, void* wszprocname, void* ppfnprocaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetProcAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlibrary, wszprocname, ppfnprocaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlibrary;
    (void)wszprocname;
    (void)ppfnprocaddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetRevocationPoint(uint32_t hissuancelicense, void* puidlength, void* wszid, void* puidtypelength, void* wszidtype, void* puurllength, void* wszrl, void* pstfrequency, void* punamelength, void* wszname, void* pupublickeylength, void* wszpublickey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetRevocationPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, puidlength, wszid, puidtypelength, wszidtype, puurllength, wszrl, pstfrequency, punamelength, wszname, pupublickeylength, wszpublickey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)puidlength;
    (void)wszid;
    (void)puidtypelength;
    (void)wszidtype;
    (void)puurllength;
    (void)wszrl;
    (void)pstfrequency;
    (void)punamelength;
    (void)wszname;
    (void)pupublickeylength;
    (void)wszpublickey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetRightExtendedInfo(uint32_t hright, uint32_t uindex, void* puextendedinfonamelength, void* wszextendedinfoname, void* puextendedinfovaluelength, void* wszextendedinfovalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetRightExtendedInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hright, uindex, puextendedinfonamelength, wszextendedinfoname, puextendedinfovaluelength, wszextendedinfovalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hright;
    (void)uindex;
    (void)puextendedinfonamelength;
    (void)wszextendedinfoname;
    (void)puextendedinfovaluelength;
    (void)wszextendedinfovalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetRightInfo(uint32_t hright, void* purightnamelength, void* wszrightname, void* pstfrom, void* pstuntil) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetRightInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hright, purightnamelength, wszrightname, pstfrom, pstuntil);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hright;
    (void)purightnamelength;
    (void)wszrightname;
    (void)pstfrom;
    (void)pstuntil;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetSecurityProvider(uint32_t uflags, void* putypelen, void* wsztype, void* pupathlen, void* wszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetSecurityProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uflags, putypelen, wsztype, pupathlen, wszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uflags;
    (void)putypelen;
    (void)wsztype;
    (void)pupathlen;
    (void)wszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetServiceLocation(uint32_t hclient, uint32_t uservicetype, uint32_t uservicelocation, void* wszissuancelicense, void* puserviceurllength, void* wszserviceurl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetServiceLocation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclient, uservicetype, uservicelocation, wszissuancelicense, puserviceurllength, wszserviceurl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hclient;
    (void)uservicetype;
    (void)uservicelocation;
    (void)wszissuancelicense;
    (void)puserviceurllength;
    (void)wszserviceurl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetSignedIssuanceLicense(uint32_t henv, uint32_t hissuancelicense, uint32_t uflags, void* pbsymkey, uint32_t cbsymkey, void* wszsymkeytype, void* wszclientlicensorcertificate, void* pfncallback, void* wszurl, void* pvcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetSignedIssuanceLicense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, hissuancelicense, uflags, pbsymkey, cbsymkey, wszsymkeytype, wszclientlicensorcertificate, pfncallback, wszurl, pvcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)hissuancelicense;
    (void)uflags;
    (void)pbsymkey;
    (void)cbsymkey;
    (void)wszsymkeytype;
    (void)wszclientlicensorcertificate;
    (void)pfncallback;
    (void)wszurl;
    (void)pvcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetSignedIssuanceLicenseEx(uint32_t henv, uint32_t hissuancelicense, uint32_t uflags, void* pbsymkey, uint32_t cbsymkey, void* wszsymkeytype, void* pvreserved, uint32_t henablingprincipal, uint32_t hboundlicenseclc, void* pfncallback, void* pvcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetSignedIssuanceLicenseEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, hissuancelicense, uflags, pbsymkey, cbsymkey, wszsymkeytype, pvreserved, henablingprincipal, hboundlicenseclc, pfncallback, pvcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)hissuancelicense;
    (void)uflags;
    (void)pbsymkey;
    (void)cbsymkey;
    (void)wszsymkeytype;
    (void)pvreserved;
    (void)henablingprincipal;
    (void)hboundlicenseclc;
    (void)pfncallback;
    (void)pvcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetTime(uint32_t henv, int32_t etimeridtype, void* potimeobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, etimeridtype, potimeobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)etimeridtype;
    (void)potimeobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseAttribute(uint32_t hqueryroot, void* wszattributetype, uint32_t iwhich, void* peencoding, void* pcbuffer, void* pbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUnboundLicenseAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hqueryroot, wszattributetype, iwhich, peencoding, pcbuffer, pbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hqueryroot;
    (void)wszattributetype;
    (void)iwhich;
    (void)peencoding;
    (void)pcbuffer;
    (void)pbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseAttributeCount(uint32_t hqueryroot, void* wszattributetype, void* pcattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUnboundLicenseAttributeCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hqueryroot, wszattributetype, pcattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hqueryroot;
    (void)wszattributetype;
    (void)pcattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseObject(uint32_t hqueryroot, void* wszsubobjecttype, uint32_t iindex, void* phsubquery) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUnboundLicenseObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hqueryroot, wszsubobjecttype, iindex, phsubquery);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hqueryroot;
    (void)wszsubobjecttype;
    (void)iindex;
    (void)phsubquery;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseObjectCount(uint32_t hqueryroot, void* wszsubobjecttype, void* pcsubobjects) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUnboundLicenseObjectCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hqueryroot, wszsubobjecttype, pcsubobjects);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hqueryroot;
    (void)wszsubobjecttype;
    (void)pcsubobjects;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUsagePolicy(uint32_t hissuancelicense, uint32_t uindex, void* peusagepolicytype, void* pfexclusion, void* punamelength, void* wszname, void* puminversionlength, void* wszminversion, void* pumaxversionlength, void* wszmaxversion, void* pupublickeylength, void* wszpublickey, void* pudigestalgorithmlength, void* wszdigestalgorithm, void* pcbdigest, void* pbdigest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUsagePolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, uindex, peusagepolicytype, pfexclusion, punamelength, wszname, puminversionlength, wszminversion, pumaxversionlength, wszmaxversion, pupublickeylength, wszpublickey, pudigestalgorithmlength, wszdigestalgorithm, pcbdigest, pbdigest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)uindex;
    (void)peusagepolicytype;
    (void)pfexclusion;
    (void)punamelength;
    (void)wszname;
    (void)puminversionlength;
    (void)wszminversion;
    (void)pumaxversionlength;
    (void)wszmaxversion;
    (void)pupublickeylength;
    (void)wszpublickey;
    (void)pudigestalgorithmlength;
    (void)wszdigestalgorithm;
    (void)pcbdigest;
    (void)pbdigest;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUserInfo(uint32_t huser, void* puusernamelength, void* wszusername, void* puuseridlength, void* wszuserid, void* puuseridtypelength, void* wszuseridtype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUserInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(huser, puusernamelength, wszusername, puuseridlength, wszuserid, puuseridtypelength, wszuseridtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)huser;
    (void)puusernamelength;
    (void)wszusername;
    (void)puuseridlength;
    (void)wszuserid;
    (void)puuseridtypelength;
    (void)wszuseridtype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUserRights(uint32_t hissuancelicense, uint32_t huser, uint32_t uindex, void* phright) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUserRights");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, huser, uindex, phright);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)huser;
    (void)uindex;
    (void)phright;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUsers(uint32_t hissuancelicense, uint32_t uindex, void* phuser) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUsers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, uindex, phuser);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)uindex;
    (void)phuser;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMInitEnvironment(int32_t esecurityprovidertype, int32_t especification, void* wszsecurityprovider, void* wszmanifestcredentials, void* wszmachinecredentials, void* phenv, void* phdefaultlibrary) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMInitEnvironment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(esecurityprovidertype, especification, wszsecurityprovider, wszmanifestcredentials, wszmachinecredentials, phenv, phdefaultlibrary);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)esecurityprovidertype;
    (void)especification;
    (void)wszsecurityprovider;
    (void)wszmanifestcredentials;
    (void)wszmachinecredentials;
    (void)phenv;
    (void)phdefaultlibrary;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMIsActivated(uint32_t hclient, uint32_t uflags, void* pactservinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMIsActivated");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclient, uflags, pactservinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hclient;
    (void)uflags;
    (void)pactservinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMIsWindowProtected(void* hwnd, void* pfprotected) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMIsWindowProtected");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pfprotected);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pfprotected;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMLoadLibrary(uint32_t henv, int32_t especification, void* wszlibraryprovider, void* wszcredentials, void* phlibrary) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMLoadLibrary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, especification, wszlibraryprovider, wszcredentials, phlibrary);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)especification;
    (void)wszlibraryprovider;
    (void)wszcredentials;
    (void)phlibrary;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMParseUnboundLicense(void* wszcertificate, void* phqueryroot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMParseUnboundLicense");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wszcertificate, phqueryroot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wszcertificate;
    (void)phqueryroot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMRegisterContent(int32_t fregister) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMRegisterContent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fregister);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fregister;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMRegisterProtectedWindow(uint32_t henv, void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMRegisterProtectedWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, hwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)hwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMRegisterRevocationList(uint32_t henv, void* wszrevocationlist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMRegisterRevocationList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, wszrevocationlist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)wszrevocationlist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMRepair(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMRepair");
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

int32_t windowssys_windows_win32_data_rightsmanagement_dRMSetApplicationSpecificData(uint32_t hissuancelicense, int32_t fdelete, void* wszname, void* wszvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMSetApplicationSpecificData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, fdelete, wszname, wszvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)fdelete;
    (void)wszname;
    (void)wszvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMSetGlobalOptions(int32_t eglobaloptions, void* pvdata, uint32_t dwlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMSetGlobalOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eglobaloptions, pvdata, dwlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)eglobaloptions;
    (void)pvdata;
    (void)dwlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMSetIntervalTime(uint32_t hissuancelicense, uint32_t cdays) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMSetIntervalTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, cdays);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)cdays;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMSetMetaData(uint32_t hissuancelicense, void* wszcontentid, void* wszcontentidtype, void* wszskuid, void* wszskuidtype, void* wszcontenttype, void* wszcontentname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMSetMetaData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, wszcontentid, wszcontentidtype, wszskuid, wszskuidtype, wszcontenttype, wszcontentname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)wszcontentid;
    (void)wszcontentidtype;
    (void)wszskuid;
    (void)wszskuidtype;
    (void)wszcontenttype;
    (void)wszcontentname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMSetNameAndDescription(uint32_t hissuancelicense, int32_t fdelete, uint32_t lcid, void* wszname, void* wszdescription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMSetNameAndDescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, fdelete, lcid, wszname, wszdescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)fdelete;
    (void)lcid;
    (void)wszname;
    (void)wszdescription;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMSetRevocationPoint(uint32_t hissuancelicense, int32_t fdelete, void* wszid, void* wszidtype, void* wszurl, void* pstfrequency, void* wszname, void* wszpublickey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMSetRevocationPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, fdelete, wszid, wszidtype, wszurl, pstfrequency, wszname, wszpublickey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)fdelete;
    (void)wszid;
    (void)wszidtype;
    (void)wszurl;
    (void)pstfrequency;
    (void)wszname;
    (void)wszpublickey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMSetUsagePolicy(uint32_t hissuancelicense, int32_t eusagepolicytype, int32_t fdelete, int32_t fexclusion, void* wszname, void* wszminversion, void* wszmaxversion, void* wszpublickey, void* wszdigestalgorithm, void* pbdigest, uint32_t cbdigest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMSetUsagePolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hissuancelicense, eusagepolicytype, fdelete, fexclusion, wszname, wszminversion, wszmaxversion, wszpublickey, wszdigestalgorithm, pbdigest, cbdigest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hissuancelicense;
    (void)eusagepolicytype;
    (void)fdelete;
    (void)fexclusion;
    (void)wszname;
    (void)wszminversion;
    (void)wszmaxversion;
    (void)wszpublickey;
    (void)wszdigestalgorithm;
    (void)pbdigest;
    (void)cbdigest;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_data_rightsmanagement_dRMVerify(void* wszdata, void* pcattesteddata, void* wszattesteddata, void* petype, void* pcprincipal, void* wszprincipal, void* pcmanifest, void* wszmanifest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMVerify");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wszdata, pcattesteddata, wszattesteddata, petype, pcprincipal, wszprincipal, pcmanifest, wszmanifest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wszdata;
    (void)pcattesteddata;
    (void)wszattesteddata;
    (void)petype;
    (void)pcprincipal;
    (void)wszprincipal;
    (void)pcmanifest;
    (void)wszmanifest;
    errno = ENOSYS;
    return -1;
#endif
}

