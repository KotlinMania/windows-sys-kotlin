#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networking_activedirectory_wrapper.h"
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

int32_t windowssys_windows_win32_networking_activedirectory_ADsBuildEnumerator(void* padscontainer, void* ppenumvariant) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsBuildEnumerator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(padscontainer, ppenumvariant);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)padscontainer;
    (void)ppenumvariant;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsBuildVarArrayInt(void* lpdwobjecttypes, uint32_t dwobjecttypes, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsBuildVarArrayInt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwobjecttypes, dwobjecttypes, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwobjecttypes;
    (void)dwobjecttypes;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsBuildVarArrayStr(void* lpppathnames, uint32_t dwpathnames, void* pvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsBuildVarArrayStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpppathnames, dwpathnames, pvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpppathnames;
    (void)dwpathnames;
    (void)pvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsDecodeBinaryData(void* szsrcdata, void* ppbdestdata, void* pdwdestlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsDecodeBinaryData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szsrcdata, ppbdestdata, pdwdestlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szsrcdata;
    (void)ppbdestdata;
    (void)pdwdestlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsEncodeBinaryData(void* pbsrcdata, uint32_t dwsrclen, void* ppszdestdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsEncodeBinaryData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbsrcdata, dwsrclen, ppszdestdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbsrcdata;
    (void)dwsrclen;
    (void)ppszdestdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsEnumerateNext(void* penumvariant, uint32_t celements, void* pvar, void* pcelementsfetched) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsEnumerateNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(penumvariant, celements, pvar, pcelementsfetched);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)penumvariant;
    (void)celements;
    (void)pvar;
    (void)pcelementsfetched;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsFreeEnumerator(void* penumvariant) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsFreeEnumerator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(penumvariant);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)penumvariant;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsGetLastError(void* lperror, void* lperrorbuf, uint32_t dwerrorbuflen, void* lpnamebuf, uint32_t dwnamebuflen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsGetLastError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lperror, lperrorbuf, dwerrorbuflen, lpnamebuf, dwnamebuflen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lperror;
    (void)lperrorbuf;
    (void)dwerrorbuflen;
    (void)lpnamebuf;
    (void)dwnamebuflen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsGetObject(void* lpszpathname, void* riid, void* ppobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsGetObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszpathname, riid, ppobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszpathname;
    (void)riid;
    (void)ppobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsOpenObject(void* lpszpathname, void* lpszusername, void* lpszpassword, uint32_t dwreserved, void* riid, void* ppobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsOpenObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszpathname, lpszusername, lpszpassword, dwreserved, riid, ppobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszpathname;
    (void)lpszusername;
    (void)lpszpassword;
    (void)dwreserved;
    (void)riid;
    (void)ppobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsPropCheckIfWritable(void* pwzattr, void* pwritableattrs) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsprop.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsPropCheckIfWritable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzattr, pwritableattrs);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzattr;
    (void)pwritableattrs;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsPropCreateNotifyObj(void* pappthddataobj, void* pwzadsobjname, void* phnotifyobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsprop.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsPropCreateNotifyObj");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pappthddataobj, pwzadsobjname, phnotifyobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pappthddataobj;
    (void)pwzadsobjname;
    (void)phnotifyobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsPropGetInitInfo(void* hnotifyobj, void* pinitparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsprop.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsPropGetInitInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnotifyobj, pinitparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnotifyobj;
    (void)pinitparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsPropSendErrorMessage(void* hnotifyobj, void* perror) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsprop.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsPropSendErrorMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnotifyobj, perror);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnotifyobj;
    (void)perror;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsPropSetHwnd(void* hnotifyobj, void* hpage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsprop.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsPropSetHwnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnotifyobj, hpage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnotifyobj;
    (void)hpage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsPropSetHwndWithTitle(void* hnotifyobj, void* hpage, void* ptztitle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsprop.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsPropSetHwndWithTitle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnotifyobj, hpage, ptztitle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnotifyobj;
    (void)hpage;
    (void)ptztitle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ADsPropShowErrorDialog(void* hnotifyobj, void* hpage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsprop.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsPropShowErrorDialog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnotifyobj, hpage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnotifyobj;
    (void)hpage;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networking_activedirectory_ADsSetLastError(uint32_t dwerr, void* pszerror, void* pszprovider) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ADsSetLastError");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dwerr, pszerror, pszprovider);
        return;
    }
    errno = ENOSYS;
#else
    (void)dwerr;
    (void)pszerror;
    (void)pszprovider;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_activedirectory_AdsFreeAdsValues(void* padsvalues, uint32_t dwnumvalues) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdsFreeAdsValues");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(padsvalues, dwnumvalues);
        return;
    }
    errno = ENOSYS;
#else
    (void)padsvalues;
    (void)dwnumvalues;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_AdsTypeToPropVariant(void* padsvalues, uint32_t dwnumvalues, void* pvariant) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdsTypeToPropVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(padsvalues, dwnumvalues, pvariant);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)padsvalues;
    (void)dwnumvalues;
    (void)pvariant;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_activedirectory_AllocADsMem(uint32_t cb) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocADsMem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cb);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cb;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_activedirectory_AllocADsStr(void* pstr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocADsStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pstr;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_BinarySDToSecurityDescriptor(void* psecuritydescriptor, void* pvarsec, void* pszservername, void* username, void* password, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BinarySDToSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, pvarsec, pszservername, username, password, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecuritydescriptor;
    (void)pvarsec;
    (void)pszservername;
    (void)username;
    (void)password;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsAddSidHistoryA(void* hds, uint32_t flags, void* srcdomain, void* srcprincipal, void* srcdomaincontroller, void* srcdomaincreds, void* dstdomain, void* dstprincipal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsAddSidHistoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, flags, srcdomain, srcprincipal, srcdomaincontroller, srcdomaincreds, dstdomain, dstprincipal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)flags;
    (void)srcdomain;
    (void)srcprincipal;
    (void)srcdomaincontroller;
    (void)srcdomaincreds;
    (void)dstdomain;
    (void)dstprincipal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsAddSidHistoryW(void* hds, uint32_t flags, void* srcdomain, void* srcprincipal, void* srcdomaincontroller, void* srcdomaincreds, void* dstdomain, void* dstprincipal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsAddSidHistoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, flags, srcdomain, srcprincipal, srcdomaincontroller, srcdomaincreds, dstdomain, dstprincipal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)flags;
    (void)srcdomain;
    (void)srcprincipal;
    (void)srcdomaincontroller;
    (void)srcdomaincreds;
    (void)dstdomain;
    (void)dstprincipal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesA(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsAddressToSiteNamesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computername, entrycount, socketaddresses, sitenames);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)computername;
    (void)entrycount;
    (void)socketaddresses;
    (void)sitenames;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesExA(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames, void* subnetnames) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsAddressToSiteNamesExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computername, entrycount, socketaddresses, sitenames, subnetnames);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)computername;
    (void)entrycount;
    (void)socketaddresses;
    (void)sitenames;
    (void)subnetnames;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesExW(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames, void* subnetnames) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsAddressToSiteNamesExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computername, entrycount, socketaddresses, sitenames, subnetnames);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)computername;
    (void)entrycount;
    (void)socketaddresses;
    (void)sitenames;
    (void)subnetnames;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesW(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsAddressToSiteNamesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computername, entrycount, socketaddresses, sitenames);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)computername;
    (void)entrycount;
    (void)socketaddresses;
    (void)sitenames;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsBindA(void* domaincontrollername, void* dnsdomainname, void* phds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(domaincontrollername, dnsdomainname, phds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)phds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsBindByInstanceA(void* servername, void* annotation, void* instanceguid, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindByInstanceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, annotation, instanceguid, dnsdomainname, authidentity, serviceprincipalname, bindflags, phds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)annotation;
    (void)instanceguid;
    (void)dnsdomainname;
    (void)authidentity;
    (void)serviceprincipalname;
    (void)bindflags;
    (void)phds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsBindByInstanceW(void* servername, void* annotation, void* instanceguid, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindByInstanceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, annotation, instanceguid, dnsdomainname, authidentity, serviceprincipalname, bindflags, phds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)annotation;
    (void)instanceguid;
    (void)dnsdomainname;
    (void)authidentity;
    (void)serviceprincipalname;
    (void)bindflags;
    (void)phds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsBindToISTGA(void* sitename, void* phds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindToISTGA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sitename, phds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sitename;
    (void)phds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsBindToISTGW(void* sitename, void* phds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindToISTGW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sitename, phds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sitename;
    (void)phds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsBindW(void* domaincontrollername, void* dnsdomainname, void* phds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(domaincontrollername, dnsdomainname, phds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)phds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsBindWithCredA(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* phds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindWithCredA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(domaincontrollername, dnsdomainname, authidentity, phds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)authidentity;
    (void)phds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsBindWithCredW(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* phds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindWithCredW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(domaincontrollername, dnsdomainname, authidentity, phds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)authidentity;
    (void)phds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsBindWithSpnA(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, void* phds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindWithSpnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(domaincontrollername, dnsdomainname, authidentity, serviceprincipalname, phds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)authidentity;
    (void)serviceprincipalname;
    (void)phds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsBindWithSpnExA(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindWithSpnExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(domaincontrollername, dnsdomainname, authidentity, serviceprincipalname, bindflags, phds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)authidentity;
    (void)serviceprincipalname;
    (void)bindflags;
    (void)phds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsBindWithSpnExW(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindWithSpnExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(domaincontrollername, dnsdomainname, authidentity, serviceprincipalname, bindflags, phds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)authidentity;
    (void)serviceprincipalname;
    (void)bindflags;
    (void)phds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsBindWithSpnW(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, void* phds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindWithSpnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(domaincontrollername, dnsdomainname, authidentity, serviceprincipalname, phds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)domaincontrollername;
    (void)dnsdomainname;
    (void)authidentity;
    (void)serviceprincipalname;
    (void)phds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsBindingSetTimeout(void* hds, uint32_t ctimeoutsecs) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBindingSetTimeout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, ctimeoutsecs);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)ctimeoutsecs;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_DsBrowseForContainerA(void* pinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsuiext.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBrowseForContainerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_DsBrowseForContainerW(void* pinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsuiext.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsBrowseForContainerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinfo;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsClientMakeSpnForTargetServerA(void* serviceclass, void* servicename, void* pcspnlength, void* pszspn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsClientMakeSpnForTargetServerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceclass, servicename, pcspnlength, pszspn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serviceclass;
    (void)servicename;
    (void)pcspnlength;
    (void)pszspn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsClientMakeSpnForTargetServerW(void* serviceclass, void* servicename, void* pcspnlength, void* pszspn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsClientMakeSpnForTargetServerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceclass, servicename, pcspnlength, pszspn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serviceclass;
    (void)servicename;
    (void)pcspnlength;
    (void)pszspn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackNamesA(void* hds, int32_t flags, int32_t formatoffered, int32_t formatdesired, uint32_t cnames, void* rpnames, void* ppresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackNamesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, flags, formatoffered, formatdesired, cnames, rpnames, ppresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)flags;
    (void)formatoffered;
    (void)formatdesired;
    (void)cnames;
    (void)rpnames;
    (void)ppresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackNamesW(void* hds, int32_t flags, int32_t formatoffered, int32_t formatdesired, uint32_t cnames, void* rpnames, void* ppresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackNamesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, flags, formatoffered, formatdesired, cnames, rpnames, ppresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)flags;
    (void)formatoffered;
    (void)formatdesired;
    (void)cnames;
    (void)rpnames;
    (void)ppresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackSpn2A(void* pszspn, uint32_t cspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackSpn2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszspn, cspn, pcserviceclass, serviceclass, pcservicename, servicename, pcinstancename, instancename, pinstanceport);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszspn;
    (void)cspn;
    (void)pcserviceclass;
    (void)serviceclass;
    (void)pcservicename;
    (void)servicename;
    (void)pcinstancename;
    (void)instancename;
    (void)pinstanceport;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackSpn2W(void* pszspn, uint32_t cspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackSpn2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszspn, cspn, pcserviceclass, serviceclass, pcservicename, servicename, pcinstancename, instancename, pinstanceport);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszspn;
    (void)cspn;
    (void)pcserviceclass;
    (void)serviceclass;
    (void)pcservicename;
    (void)servicename;
    (void)pcinstancename;
    (void)instancename;
    (void)pinstanceport;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackSpn3W(void* pszspn, uint32_t cspn, void* pchostname, void* hostname, void* pcinstancename, void* instancename, void* pportnumber, void* pcdomainname, void* domainname, void* pcrealmname, void* realmname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackSpn3W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszspn, cspn, pchostname, hostname, pcinstancename, instancename, pportnumber, pcdomainname, domainname, pcrealmname, realmname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszspn;
    (void)cspn;
    (void)pchostname;
    (void)hostname;
    (void)pcinstancename;
    (void)instancename;
    (void)pportnumber;
    (void)pcdomainname;
    (void)domainname;
    (void)pcrealmname;
    (void)realmname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackSpn4W(void* pszspn, uint32_t cspn, void* pchostname, void* hostname, void* pcinstancename, void* instancename, void* pcportname, void* portname, void* pcdomainname, void* domainname, void* pcrealmname, void* realmname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackSpn4W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszspn, cspn, pchostname, hostname, pcinstancename, instancename, pcportname, portname, pcdomainname, domainname, pcrealmname, realmname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszspn;
    (void)cspn;
    (void)pchostname;
    (void)hostname;
    (void)pcinstancename;
    (void)instancename;
    (void)pcportname;
    (void)portname;
    (void)pcdomainname;
    (void)domainname;
    (void)pcrealmname;
    (void)realmname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackSpnA(void* pszspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackSpnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszspn, pcserviceclass, serviceclass, pcservicename, servicename, pcinstancename, instancename, pinstanceport);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszspn;
    (void)pcserviceclass;
    (void)serviceclass;
    (void)pcservicename;
    (void)servicename;
    (void)pcinstancename;
    (void)instancename;
    (void)pinstanceport;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackSpnW(void* pszspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackSpnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszspn, pcserviceclass, serviceclass, pcservicename, servicename, pcinstancename, instancename, pinstanceport);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszspn;
    (void)pcserviceclass;
    (void)serviceclass;
    (void)pcservicename;
    (void)servicename;
    (void)pcinstancename;
    (void)instancename;
    (void)pinstanceport;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_DsCrackUnquotedMangledRdnA(void* pszrdn, uint32_t cchrdn, void* pguid, void* pedsmanglefor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackUnquotedMangledRdnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszrdn, cchrdn, pguid, pedsmanglefor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszrdn;
    (void)cchrdn;
    (void)pguid;
    (void)pedsmanglefor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_DsCrackUnquotedMangledRdnW(void* pszrdn, uint32_t cchrdn, void* pguid, void* pedsmanglefor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsCrackUnquotedMangledRdnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszrdn, cchrdn, pguid, pedsmanglefor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszrdn;
    (void)cchrdn;
    (void)pguid;
    (void)pedsmanglefor;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsDeregisterDnsHostRecordsA(void* servername, void* dnsdomainname, void* domainguid, void* dsaguid, void* dnshostname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsDeregisterDnsHostRecordsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, dnsdomainname, domainguid, dsaguid, dnshostname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)dnsdomainname;
    (void)domainguid;
    (void)dsaguid;
    (void)dnshostname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsDeregisterDnsHostRecordsW(void* servername, void* dnsdomainname, void* domainguid, void* dsaguid, void* dnshostname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsDeregisterDnsHostRecordsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, dnsdomainname, domainguid, dsaguid, dnshostname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)dnsdomainname;
    (void)domainguid;
    (void)dsaguid;
    (void)dnshostname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsEnumerateDomainTrustsA(void* servername, uint32_t flags, void* domains, void* domaincount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsEnumerateDomainTrustsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, flags, domains, domaincount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)flags;
    (void)domains;
    (void)domaincount;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsEnumerateDomainTrustsW(void* servername, uint32_t flags, void* domains, void* domaincount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsEnumerateDomainTrustsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, flags, domains, domaincount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)flags;
    (void)domains;
    (void)domaincount;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networking_activedirectory_DsFreeDomainControllerInfoA(uint32_t infolevel, uint32_t cinfo, void* pinfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeDomainControllerInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(infolevel, cinfo, pinfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)infolevel;
    (void)cinfo;
    (void)pinfo;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_activedirectory_DsFreeDomainControllerInfoW(uint32_t infolevel, uint32_t cinfo, void* pinfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeDomainControllerInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(infolevel, cinfo, pinfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)infolevel;
    (void)cinfo;
    (void)pinfo;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_activedirectory_DsFreeNameResultA(void* presult) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeNameResultA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(presult);
        return;
    }
    errno = ENOSYS;
#else
    (void)presult;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_activedirectory_DsFreeNameResultW(void* presult) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeNameResultW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(presult);
        return;
    }
    errno = ENOSYS;
#else
    (void)presult;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_activedirectory_DsFreePasswordCredentials(void* authidentity) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreePasswordCredentials");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(authidentity);
        return;
    }
    errno = ENOSYS;
#else
    (void)authidentity;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_activedirectory_DsFreeSchemaGuidMapA(void* pguidmap) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeSchemaGuidMapA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pguidmap);
        return;
    }
    errno = ENOSYS;
#else
    (void)pguidmap;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_activedirectory_DsFreeSchemaGuidMapW(void* pguidmap) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeSchemaGuidMapW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pguidmap);
        return;
    }
    errno = ENOSYS;
#else
    (void)pguidmap;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_activedirectory_DsFreeSpnArrayA(uint32_t cspn, void* rpszspn) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeSpnArrayA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cspn, rpszspn);
        return;
    }
    errno = ENOSYS;
#else
    (void)cspn;
    (void)rpszspn;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_activedirectory_DsFreeSpnArrayW(uint32_t cspn, void* rpszspn) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsFreeSpnArrayW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cspn, rpszspn);
        return;
    }
    errno = ENOSYS;
#else
    (void)cspn;
    (void)rpszspn;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_activedirectory_DsGetDcCloseW(void* getdccontexthandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcCloseW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(getdccontexthandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)getdccontexthandle;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcNameA(void* computername, void* domainname, void* domainguid, void* sitename, uint32_t flags, void* domaincontrollerinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computername, domainname, domainguid, sitename, flags, domaincontrollerinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)computername;
    (void)domainname;
    (void)domainguid;
    (void)sitename;
    (void)flags;
    (void)domaincontrollerinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcNameW(void* computername, void* domainname, void* domainguid, void* sitename, uint32_t flags, void* domaincontrollerinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computername, domainname, domainguid, sitename, flags, domaincontrollerinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)computername;
    (void)domainname;
    (void)domainguid;
    (void)sitename;
    (void)flags;
    (void)domaincontrollerinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcNextA(void* getdccontexthandle, void* sockaddresscount, void* sockaddresses, void* dnshostname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcNextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(getdccontexthandle, sockaddresscount, sockaddresses, dnshostname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)getdccontexthandle;
    (void)sockaddresscount;
    (void)sockaddresses;
    (void)dnshostname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcNextW(void* getdccontexthandle, void* sockaddresscount, void* sockaddresses, void* dnshostname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcNextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(getdccontexthandle, sockaddresscount, sockaddresses, dnshostname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)getdccontexthandle;
    (void)sockaddresscount;
    (void)sockaddresses;
    (void)dnshostname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcOpenA(void* dnsname, uint32_t optionflags, void* sitename, void* domainguid, void* dnsforestname, uint32_t dcflags, void* retgetdccontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcOpenA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dnsname, optionflags, sitename, domainguid, dnsforestname, dcflags, retgetdccontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dnsname;
    (void)optionflags;
    (void)sitename;
    (void)domainguid;
    (void)dnsforestname;
    (void)dcflags;
    (void)retgetdccontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcOpenW(void* dnsname, uint32_t optionflags, void* sitename, void* domainguid, void* dnsforestname, uint32_t dcflags, void* retgetdccontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcOpenW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dnsname, optionflags, sitename, domainguid, dnsforestname, dcflags, retgetdccontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dnsname;
    (void)optionflags;
    (void)sitename;
    (void)domainguid;
    (void)dnsforestname;
    (void)dcflags;
    (void)retgetdccontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcSiteCoverageA(void* servername, void* entrycount, void* sitenames) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcSiteCoverageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, entrycount, sitenames);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)entrycount;
    (void)sitenames;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcSiteCoverageW(void* servername, void* entrycount, void* sitenames) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDcSiteCoverageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, entrycount, sitenames);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)entrycount;
    (void)sitenames;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDomainControllerInfoA(void* hds, void* domainname, uint32_t infolevel, void* pcout, void* ppinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDomainControllerInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, domainname, infolevel, pcout, ppinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)domainname;
    (void)infolevel;
    (void)pcout;
    (void)ppinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDomainControllerInfoW(void* hds, void* domainname, uint32_t infolevel, void* pcout, void* ppinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetDomainControllerInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, domainname, infolevel, pcout, ppinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)domainname;
    (void)infolevel;
    (void)pcout;
    (void)ppinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetForestTrustInformationW(void* servername, void* trusteddomainname, uint32_t flags, void* foresttrustinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetForestTrustInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, trusteddomainname, flags, foresttrustinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)trusteddomainname;
    (void)flags;
    (void)foresttrustinfo;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_DsGetFriendlyClassName(void* pszobjectclass, void* pszbuffer, uint32_t cchbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsuiext.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetFriendlyClassName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszobjectclass, pszbuffer, cchbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszobjectclass;
    (void)pszbuffer;
    (void)cchbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_activedirectory_DsGetIcon(uint32_t dwflags, void* pszobjectclass, int32_t cximage, int32_t cyimage) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsuiext.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetIcon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pszobjectclass, cximage, cyimage);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwflags;
    (void)pszobjectclass;
    (void)cximage;
    (void)cyimage;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetRdnW(void* ppdn, void* pcdn, void* ppkey, void* pckey, void* ppval, void* pcval) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetRdnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppdn, pcdn, ppkey, pckey, ppval, pcval);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppdn;
    (void)pcdn;
    (void)ppkey;
    (void)pckey;
    (void)ppval;
    (void)pcval;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetSiteNameA(void* computername, void* sitename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetSiteNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computername, sitename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)computername;
    (void)sitename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetSiteNameW(void* computername, void* sitename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetSiteNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computername, sitename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)computername;
    (void)sitename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetSpnA(int32_t servicetype, void* serviceclass, void* servicename, uint16_t instanceport, uint16_t cinstancenames, void* pinstancenames, void* pinstanceports, void* pcspn, void* prpszspn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*, uint16_t, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetSpnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servicetype, serviceclass, servicename, instanceport, cinstancenames, pinstancenames, pinstanceports, pcspn, prpszspn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servicetype;
    (void)serviceclass;
    (void)servicename;
    (void)instanceport;
    (void)cinstancenames;
    (void)pinstancenames;
    (void)pinstanceports;
    (void)pcspn;
    (void)prpszspn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsGetSpnW(int32_t servicetype, void* serviceclass, void* servicename, uint16_t instanceport, uint16_t cinstancenames, void* pinstancenames, void* pinstanceports, void* pcspn, void* prpszspn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*, uint16_t, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsGetSpnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servicetype, serviceclass, servicename, instanceport, cinstancenames, pinstancenames, pinstanceports, pcspn, prpszspn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servicetype;
    (void)serviceclass;
    (void)servicename;
    (void)instanceport;
    (void)cinstancenames;
    (void)pinstancenames;
    (void)pinstanceports;
    (void)pcspn;
    (void)prpszspn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsInheritSecurityIdentityA(void* hds, uint32_t flags, void* srcprincipal, void* dstprincipal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsInheritSecurityIdentityA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, flags, srcprincipal, dstprincipal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)flags;
    (void)srcprincipal;
    (void)dstprincipal;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsInheritSecurityIdentityW(void* hds, uint32_t flags, void* srcprincipal, void* dstprincipal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsInheritSecurityIdentityW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, flags, srcprincipal, dstprincipal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)flags;
    (void)srcprincipal;
    (void)dstprincipal;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_DsIsMangledDnA(void* pszdn, int32_t edsmanglefor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsIsMangledDnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdn, edsmanglefor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszdn;
    (void)edsmanglefor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_DsIsMangledDnW(void* pszdn, int32_t edsmanglefor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsIsMangledDnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdn, edsmanglefor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszdn;
    (void)edsmanglefor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_DsIsMangledRdnValueA(void* pszrdn, uint32_t crdn, int32_t edsmanglefordesired) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsIsMangledRdnValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszrdn, crdn, edsmanglefordesired);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszrdn;
    (void)crdn;
    (void)edsmanglefordesired;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_DsIsMangledRdnValueW(void* pszrdn, uint32_t crdn, int32_t edsmanglefordesired) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsIsMangledRdnValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszrdn, crdn, edsmanglefordesired);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszrdn;
    (void)crdn;
    (void)edsmanglefordesired;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsListDomainsInSiteA(void* hds, void* site, void* ppdomains) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListDomainsInSiteA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, site, ppdomains);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)site;
    (void)ppdomains;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsListDomainsInSiteW(void* hds, void* site, void* ppdomains) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListDomainsInSiteW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, site, ppdomains);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)site;
    (void)ppdomains;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsListInfoForServerA(void* hds, void* server, void* ppinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListInfoForServerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, server, ppinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)server;
    (void)ppinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsListInfoForServerW(void* hds, void* server, void* ppinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListInfoForServerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, server, ppinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)server;
    (void)ppinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsListRolesA(void* hds, void* pproles) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListRolesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, pproles);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)pproles;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsListRolesW(void* hds, void* pproles) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListRolesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, pproles);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)pproles;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsListServersForDomainInSiteA(void* hds, void* domain, void* site, void* ppservers) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListServersForDomainInSiteA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, domain, site, ppservers);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)domain;
    (void)site;
    (void)ppservers;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsListServersForDomainInSiteW(void* hds, void* domain, void* site, void* ppservers) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListServersForDomainInSiteW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, domain, site, ppservers);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)domain;
    (void)site;
    (void)ppservers;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsListServersInSiteA(void* hds, void* site, void* ppservers) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListServersInSiteA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, site, ppservers);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)site;
    (void)ppservers;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsListServersInSiteW(void* hds, void* site, void* ppservers) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListServersInSiteW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, site, ppservers);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)site;
    (void)ppservers;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsListSitesA(void* hds, void* ppsites) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListSitesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, ppsites);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)ppsites;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsListSitesW(void* hds, void* ppsites) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsListSitesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, ppsites);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)ppsites;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsMakePasswordCredentialsA(void* user, void* domain, void* password, void* pauthidentity) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsMakePasswordCredentialsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, domain, password, pauthidentity);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)user;
    (void)domain;
    (void)password;
    (void)pauthidentity;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsMakePasswordCredentialsW(void* user, void* domain, void* password, void* pauthidentity) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsMakePasswordCredentialsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, domain, password, pauthidentity);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)user;
    (void)domain;
    (void)password;
    (void)pauthidentity;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsMakeSpnA(void* serviceclass, void* servicename, void* instancename, uint16_t instanceport, void* referrer, void* pcspnlength, void* pszspn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsMakeSpnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceclass, servicename, instancename, instanceport, referrer, pcspnlength, pszspn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serviceclass;
    (void)servicename;
    (void)instancename;
    (void)instanceport;
    (void)referrer;
    (void)pcspnlength;
    (void)pszspn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsMakeSpnW(void* serviceclass, void* servicename, void* instancename, uint16_t instanceport, void* referrer, void* pcspnlength, void* pszspn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsMakeSpnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceclass, servicename, instancename, instanceport, referrer, pcspnlength, pszspn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serviceclass;
    (void)servicename;
    (void)instancename;
    (void)instanceport;
    (void)referrer;
    (void)pcspnlength;
    (void)pszspn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsMapSchemaGuidsA(void* hds, uint32_t cguids, void* rguids, void* ppguidmap) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsMapSchemaGuidsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, cguids, rguids, ppguidmap);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)cguids;
    (void)rguids;
    (void)ppguidmap;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsMapSchemaGuidsW(void* hds, uint32_t cguids, void* rguids, void* ppguidmap) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsMapSchemaGuidsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, cguids, rguids, ppguidmap);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)cguids;
    (void)rguids;
    (void)ppguidmap;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsMergeForestTrustInformationW(void* domainname, void* newforesttrustinfo, void* oldforesttrustinfo, void* mergedforesttrustinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsMergeForestTrustInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(domainname, newforesttrustinfo, oldforesttrustinfo, mergedforesttrustinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)domainname;
    (void)newforesttrustinfo;
    (void)oldforesttrustinfo;
    (void)mergedforesttrustinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsQuerySitesByCostA(void* hds, void* pszfromsite, void* rgsztosites, uint32_t ctosites, uint32_t dwflags, void* prgsiteinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsQuerySitesByCostA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, pszfromsite, rgsztosites, ctosites, dwflags, prgsiteinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)pszfromsite;
    (void)rgsztosites;
    (void)ctosites;
    (void)dwflags;
    (void)prgsiteinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsQuerySitesByCostW(void* hds, void* pwszfromsite, void* rgwsztosites, uint32_t ctosites, uint32_t dwflags, void* prgsiteinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsQuerySitesByCostW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, pwszfromsite, rgwsztosites, ctosites, dwflags, prgsiteinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)pwszfromsite;
    (void)rgwsztosites;
    (void)ctosites;
    (void)dwflags;
    (void)prgsiteinfo;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networking_activedirectory_DsQuerySitesFree(void* rgsiteinfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsQuerySitesFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(rgsiteinfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)rgsiteinfo;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsQuoteRdnValueA(uint32_t cunquotedrdnvaluelength, void* psunquotedrdnvalue, void* pcquotedrdnvaluelength, void* psquotedrdnvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsQuoteRdnValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cunquotedrdnvaluelength, psunquotedrdnvalue, pcquotedrdnvaluelength, psquotedrdnvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)cunquotedrdnvaluelength;
    (void)psunquotedrdnvalue;
    (void)pcquotedrdnvaluelength;
    (void)psquotedrdnvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsQuoteRdnValueW(uint32_t cunquotedrdnvaluelength, void* psunquotedrdnvalue, void* pcquotedrdnvaluelength, void* psquotedrdnvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsQuoteRdnValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cunquotedrdnvaluelength, psunquotedrdnvalue, pcquotedrdnvaluelength, psquotedrdnvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)cunquotedrdnvaluelength;
    (void)psunquotedrdnvalue;
    (void)pcquotedrdnvaluelength;
    (void)psquotedrdnvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsRemoveDsDomainA(void* hds, void* domaindn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsRemoveDsDomainA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, domaindn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)domaindn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsRemoveDsDomainW(void* hds, void* domaindn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsRemoveDsDomainW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, domaindn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)domaindn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsRemoveDsServerA(void* hds, void* serverdn, void* domaindn, void* flastdcindomain, int32_t fcommit) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsRemoveDsServerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, serverdn, domaindn, flastdcindomain, fcommit);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)serverdn;
    (void)domaindn;
    (void)flastdcindomain;
    (void)fcommit;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsRemoveDsServerW(void* hds, void* serverdn, void* domaindn, void* flastdcindomain, int32_t fcommit) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsRemoveDsServerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, serverdn, domaindn, flastdcindomain, fcommit);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)serverdn;
    (void)domaindn;
    (void)flastdcindomain;
    (void)fcommit;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaAddA(void* hds, void* namecontext, void* sourcedsadn, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t options) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaAddA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, namecontext, sourcedsadn, transportdn, sourcedsaaddress, pschedule, options);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)namecontext;
    (void)sourcedsadn;
    (void)transportdn;
    (void)sourcedsaaddress;
    (void)pschedule;
    (void)options;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaAddW(void* hds, void* namecontext, void* sourcedsadn, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t options) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaAddW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, namecontext, sourcedsadn, transportdn, sourcedsaaddress, pschedule, options);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)namecontext;
    (void)sourcedsadn;
    (void)transportdn;
    (void)sourcedsaaddress;
    (void)pschedule;
    (void)options;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaConsistencyCheck(void* hds, int32_t taskid, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaConsistencyCheck");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, taskid, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)taskid;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaDelA(void* hds, void* namecontext, void* dsasrc, uint32_t options) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaDelA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, namecontext, dsasrc, options);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)namecontext;
    (void)dsasrc;
    (void)options;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaDelW(void* hds, void* namecontext, void* dsasrc, uint32_t options) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaDelW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, namecontext, dsasrc, options);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)namecontext;
    (void)dsasrc;
    (void)options;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networking_activedirectory_DsReplicaFreeInfo(int32_t infotype, void* pinfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaFreeInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(infotype, pinfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)infotype;
    (void)pinfo;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaGetInfo2W(void* hds, int32_t infotype, void* pszobject, void* puuidforsourcedsaobjguid, void* pszattributename, void* pszvalue, uint32_t dwflags, uint32_t dwenumerationcontext, void* ppinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaGetInfo2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, infotype, pszobject, puuidforsourcedsaobjguid, pszattributename, pszvalue, dwflags, dwenumerationcontext, ppinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)infotype;
    (void)pszobject;
    (void)puuidforsourcedsaobjguid;
    (void)pszattributename;
    (void)pszvalue;
    (void)dwflags;
    (void)dwenumerationcontext;
    (void)ppinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaGetInfoW(void* hds, int32_t infotype, void* pszobject, void* puuidforsourcedsaobjguid, void* ppinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaGetInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, infotype, pszobject, puuidforsourcedsaobjguid, ppinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)infotype;
    (void)pszobject;
    (void)puuidforsourcedsaobjguid;
    (void)ppinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaModifyA(void* hds, void* namecontext, void* puuidsourcedsa, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t replicaflags, uint32_t modifyfields, uint32_t options) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaModifyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, namecontext, puuidsourcedsa, transportdn, sourcedsaaddress, pschedule, replicaflags, modifyfields, options);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)namecontext;
    (void)puuidsourcedsa;
    (void)transportdn;
    (void)sourcedsaaddress;
    (void)pschedule;
    (void)replicaflags;
    (void)modifyfields;
    (void)options;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaModifyW(void* hds, void* namecontext, void* puuidsourcedsa, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t replicaflags, uint32_t modifyfields, uint32_t options) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaModifyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, namecontext, puuidsourcedsa, transportdn, sourcedsaaddress, pschedule, replicaflags, modifyfields, options);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)namecontext;
    (void)puuidsourcedsa;
    (void)transportdn;
    (void)sourcedsaaddress;
    (void)pschedule;
    (void)replicaflags;
    (void)modifyfields;
    (void)options;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaSyncA(void* hds, void* namecontext, void* puuiddsasrc, uint32_t options) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaSyncA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, namecontext, puuiddsasrc, options);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)namecontext;
    (void)puuiddsasrc;
    (void)options;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaSyncAllA(void* hds, void* psznamecontext, uint32_t ulflags, int64_t pfncallback, void* pcallbackdata, void* perrors) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaSyncAllA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, psznamecontext, ulflags, pfncallback, pcallbackdata, perrors);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)psznamecontext;
    (void)ulflags;
    (void)pfncallback;
    (void)pcallbackdata;
    (void)perrors;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaSyncAllW(void* hds, void* psznamecontext, uint32_t ulflags, int64_t pfncallback, void* pcallbackdata, void* perrors) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaSyncAllW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, psznamecontext, ulflags, pfncallback, pcallbackdata, perrors);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)psznamecontext;
    (void)ulflags;
    (void)pfncallback;
    (void)pcallbackdata;
    (void)perrors;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaSyncW(void* hds, void* namecontext, void* puuiddsasrc, uint32_t options) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaSyncW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, namecontext, puuiddsasrc, options);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)namecontext;
    (void)puuiddsasrc;
    (void)options;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaUpdateRefsA(void* hds, void* namecontext, void* dsadest, void* puuiddsadest, uint32_t options) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaUpdateRefsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, namecontext, dsadest, puuiddsadest, options);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)namecontext;
    (void)dsadest;
    (void)puuiddsadest;
    (void)options;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaUpdateRefsW(void* hds, void* namecontext, void* dsadest, void* puuiddsadest, uint32_t options) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaUpdateRefsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, namecontext, dsadest, puuiddsadest, options);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)namecontext;
    (void)dsadest;
    (void)puuiddsadest;
    (void)options;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaVerifyObjectsA(void* hds, void* namecontext, void* puuiddsasrc, uint32_t uloptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaVerifyObjectsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, namecontext, puuiddsasrc, uloptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)namecontext;
    (void)puuiddsasrc;
    (void)uloptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaVerifyObjectsW(void* hds, void* namecontext, void* puuiddsasrc, uint32_t uloptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsReplicaVerifyObjectsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, namecontext, puuiddsasrc, uloptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)namecontext;
    (void)puuiddsasrc;
    (void)uloptions;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networking_activedirectory_DsRoleFreeMemory(void* buffer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsRoleFreeMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(buffer);
        return;
    }
    errno = ENOSYS;
#else
    (void)buffer;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsRoleGetPrimaryDomainInformation(void* lpserver, int32_t infolevel, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsRoleGetPrimaryDomainInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpserver, infolevel, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpserver;
    (void)infolevel;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsServerRegisterSpnA(int32_t operation, void* serviceclass, void* userobjectdn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsServerRegisterSpnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation, serviceclass, userobjectdn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)operation;
    (void)serviceclass;
    (void)userobjectdn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsServerRegisterSpnW(int32_t operation, void* serviceclass, void* userobjectdn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsServerRegisterSpnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation, serviceclass, userobjectdn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)operation;
    (void)serviceclass;
    (void)userobjectdn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsUnBindA(void* phds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsUnBindA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsUnBindW(void* phds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsUnBindW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsUnquoteRdnValueA(uint32_t cquotedrdnvaluelength, void* psquotedrdnvalue, void* pcunquotedrdnvaluelength, void* psunquotedrdnvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsUnquoteRdnValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cquotedrdnvaluelength, psquotedrdnvalue, pcunquotedrdnvaluelength, psunquotedrdnvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)cquotedrdnvaluelength;
    (void)psquotedrdnvalue;
    (void)pcunquotedrdnvaluelength;
    (void)psunquotedrdnvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsUnquoteRdnValueW(uint32_t cquotedrdnvaluelength, void* psquotedrdnvalue, void* pcunquotedrdnvaluelength, void* psunquotedrdnvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dsparse.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsUnquoteRdnValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cquotedrdnvaluelength, psquotedrdnvalue, pcunquotedrdnvaluelength, psunquotedrdnvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)cquotedrdnvaluelength;
    (void)psquotedrdnvalue;
    (void)pcunquotedrdnvaluelength;
    (void)psunquotedrdnvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsValidateSubnetNameA(void* subnetname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsValidateSubnetNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subnetname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)subnetname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsValidateSubnetNameW(void* subnetname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsValidateSubnetNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subnetname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)subnetname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsWriteAccountSpnA(void* hds, int32_t operation, void* pszaccount, uint32_t cspn, void* rpszspn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsWriteAccountSpnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, operation, pszaccount, cspn, rpszspn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)operation;
    (void)pszaccount;
    (void)cspn;
    (void)rpszspn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_activedirectory_DsWriteAccountSpnW(void* hds, int32_t operation, void* pszaccount, uint32_t cspn, void* rpszspn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DsWriteAccountSpnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hds, operation, pszaccount, cspn, rpszspn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hds;
    (void)operation;
    (void)pszaccount;
    (void)cspn;
    (void)rpszspn;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_FreeADsMem(void* pmem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeADsMem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_FreeADsStr(void* pstr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeADsStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pstr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pstr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_PropVariantToAdsType(void* pvariant, uint32_t dwnumvariant, void* ppadsvalues, void* pdwnumvalues) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToAdsType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvariant, dwnumvariant, ppadsvalues, pdwnumvalues);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvariant;
    (void)dwnumvariant;
    (void)ppadsvalues;
    (void)pdwnumvalues;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_activedirectory_ReallocADsMem(void* poldmem, uint32_t cbold, uint32_t cbnew) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReallocADsMem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poldmem, cbold, cbnew);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)poldmem;
    (void)cbold;
    (void)cbnew;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_activedirectory_ReallocADsStr(void* ppstr, void* pstr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("activeds.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReallocADsStr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppstr, pstr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppstr;
    (void)pstr;
    errno = ENOSYS;
    return -1;
#endif
}

