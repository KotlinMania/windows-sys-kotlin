#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_p2p_wrapper.h"
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

void windowssys_windows_win32_networkmanagement_p2p_drtClose(void* hdrt) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtClose");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hdrt);
        return;
    }
    errno = ENOSYS;
#else
    (void)hdrt;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtContinueSearch(void* hsearchcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtContinueSearch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsearchcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsearchcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtCreateDerivedKey(void* plocalcert, void* pkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreateDerivedKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plocalcert, pkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plocalcert;
    (void)pkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtCreateDerivedKeySecurityProvider(void* prootcert, void* plocalcert, void* ppsecurityprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreateDerivedKeySecurityProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prootcert, plocalcert, ppsecurityprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prootcert;
    (void)plocalcert;
    (void)ppsecurityprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtCreateDnsBootstrapResolver(uint16_t port, void* pwszaddress, void* ppmodule) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreateDnsBootstrapResolver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(port, pwszaddress, ppmodule);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)port;
    (void)pwszaddress;
    (void)ppmodule;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtCreateIpv6UdpTransport(int32_t scope, uint32_t dwscopeid, uint32_t dwlocalitythreshold, void* pwport, void* phtransport) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drttransport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreateIpv6UdpTransport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(scope, dwscopeid, dwlocalitythreshold, pwport, phtransport);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)scope;
    (void)dwscopeid;
    (void)dwlocalitythreshold;
    (void)pwport;
    (void)phtransport;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtCreateNullSecurityProvider(void* ppsecurityprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreateNullSecurityProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppsecurityprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppsecurityprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtCreatePnrpBootstrapResolver(int32_t fpublish, void* pwzpeername, void* pwzcloudname, void* pwzpublishingidentity, void* ppresolver) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreatePnrpBootstrapResolver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fpublish, pwzpeername, pwzcloudname, pwzpublishingidentity, ppresolver);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fpublish;
    (void)pwzpeername;
    (void)pwzcloudname;
    (void)pwzpublishingidentity;
    (void)ppresolver;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networkmanagement_p2p_drtDeleteDerivedKeySecurityProvider(void* psecurityprovider) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtDeleteDerivedKeySecurityProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(psecurityprovider);
        return;
    }
    errno = ENOSYS;
#else
    (void)psecurityprovider;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_p2p_drtDeleteDnsBootstrapResolver(void* presolver) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtDeleteDnsBootstrapResolver");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(presolver);
        return;
    }
    errno = ENOSYS;
#else
    (void)presolver;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtDeleteIpv6UdpTransport(void* htransport) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drttransport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtDeleteIpv6UdpTransport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htransport);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htransport;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networkmanagement_p2p_drtDeleteNullSecurityProvider(void* psecurityprovider) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtDeleteNullSecurityProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(psecurityprovider);
        return;
    }
    errno = ENOSYS;
#else
    (void)psecurityprovider;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_p2p_drtDeletePnrpBootstrapResolver(void* presolver) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtDeletePnrpBootstrapResolver");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(presolver);
        return;
    }
    errno = ENOSYS;
#else
    (void)presolver;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtEndSearch(void* hsearchcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtEndSearch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsearchcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsearchcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtGetEventData(void* hdrt, uint32_t uleventdatalen, void* peventdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetEventData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdrt, uleventdatalen, peventdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdrt;
    (void)uleventdatalen;
    (void)peventdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtGetEventDataSize(void* hdrt, void* puleventdatalen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetEventDataSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdrt, puleventdatalen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdrt;
    (void)puleventdatalen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtGetInstanceName(void* hdrt, uint32_t ulcbinstancenamesize, void* pwzdrtinstancename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetInstanceName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdrt, ulcbinstancenamesize, pwzdrtinstancename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdrt;
    (void)ulcbinstancenamesize;
    (void)pwzdrtinstancename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtGetInstanceNameSize(void* hdrt, void* pulcbinstancenamesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetInstanceNameSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdrt, pulcbinstancenamesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdrt;
    (void)pulcbinstancenamesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtGetSearchPath(void* hsearchcontext, uint32_t ulsearchpathsize, void* psearchpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetSearchPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsearchcontext, ulsearchpathsize, psearchpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsearchcontext;
    (void)ulsearchpathsize;
    (void)psearchpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtGetSearchPathSize(void* hsearchcontext, void* pulsearchpathsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetSearchPathSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsearchcontext, pulsearchpathsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsearchcontext;
    (void)pulsearchpathsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtGetSearchResult(void* hsearchcontext, uint32_t ulsearchresultsize, void* psearchresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetSearchResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsearchcontext, ulsearchresultsize, psearchresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsearchcontext;
    (void)ulsearchresultsize;
    (void)psearchresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtGetSearchResultSize(void* hsearchcontext, void* pulsearchresultsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetSearchResultSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsearchcontext, pulsearchresultsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsearchcontext;
    (void)pulsearchresultsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtOpen(void* psettings, void* hevent, void* pvcontext, void* phdrt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psettings, hevent, pvcontext, phdrt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psettings;
    (void)hevent;
    (void)pvcontext;
    (void)phdrt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtRegisterKey(void* hdrt, void* pregistration, void* pvkeycontext, void* phkeyregistration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtRegisterKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdrt, pregistration, pvkeycontext, phkeyregistration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdrt;
    (void)pregistration;
    (void)pvkeycontext;
    (void)phkeyregistration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtStartSearch(void* hdrt, void* pkey, void* pinfo, uint32_t timeout, void* hevent, void* pvcontext, void* hsearchcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtStartSearch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdrt, pkey, pinfo, timeout, hevent, pvcontext, hsearchcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdrt;
    (void)pkey;
    (void)pinfo;
    (void)timeout;
    (void)hevent;
    (void)pvcontext;
    (void)hsearchcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networkmanagement_p2p_drtUnregisterKey(void* hkeyregistration) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtUnregisterKey");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hkeyregistration);
        return;
    }
    errno = ENOSYS;
#else
    (void)hkeyregistration;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_drtUpdateKey(void* hkeyregistration, void* pappdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtUpdateKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyregistration, pappdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkeyregistration;
    (void)pappdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabAddContact(void* pwzcontactdata, void* ppcontact) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabAddContact");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzcontactdata, ppcontact);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzcontactdata;
    (void)ppcontact;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabAsyncInviteContact(void* pccontact, void* pcendpoint, void* pcinvitation, void* hevent, void* phinvitation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabAsyncInviteContact");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pccontact, pcendpoint, pcinvitation, hevent, phinvitation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pccontact;
    (void)pcendpoint;
    (void)pcinvitation;
    (void)hevent;
    (void)phinvitation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabAsyncInviteEndpoint(void* pcendpoint, void* pcinvitation, void* hevent, void* phinvitation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabAsyncInviteEndpoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcendpoint, pcinvitation, hevent, phinvitation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcendpoint;
    (void)pcinvitation;
    (void)hevent;
    (void)phinvitation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabCancelInvitation(void* hinvitation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabCancelInvitation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinvitation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinvitation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabCloseHandle(void* hinvitation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabCloseHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinvitation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinvitation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteContact(void* pwzpeername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabDeleteContact");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzpeername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzpeername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteEndpointData(void* pcendpoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabDeleteEndpointData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcendpoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcendpoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteObject(void* pobjectid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabDeleteObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pobjectid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pobjectid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumApplicationRegistrationInfo(int32_t registrationtype, void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumApplicationRegistrationInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(registrationtype, phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)registrationtype;
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumApplications(void* pcendpoint, void* papplicationid, void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumApplications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcendpoint, papplicationid, phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcendpoint;
    (void)papplicationid;
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumContacts(void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumContacts");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumEndpoints(void* pccontact, void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumEndpoints");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pccontact, phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pccontact;
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumObjects(void* pcendpoint, void* pobjectid, void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumObjects");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcendpoint, pobjectid, phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcendpoint;
    (void)pobjectid;
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumPeopleNearMe(void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumPeopleNearMe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabExportContact(void* pwzpeername, void* ppwzcontactdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabExportContact");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzpeername, ppwzcontactdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzpeername;
    (void)ppwzcontactdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabGetAppLaunchInfo(void* pplaunchinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetAppLaunchInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pplaunchinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pplaunchinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabGetApplicationRegistrationInfo(void* papplicationid, int32_t registrationtype, void* ppapplication) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetApplicationRegistrationInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(papplicationid, registrationtype, ppapplication);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)papplicationid;
    (void)registrationtype;
    (void)ppapplication;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabGetContact(void* pwzpeername, void* ppcontact) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetContact");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzpeername, ppcontact);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzpeername;
    (void)ppcontact;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabGetEndpointName(void* ppwzendpointname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetEndpointName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppwzendpointname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppwzendpointname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabGetEventData(void* hpeerevent, void* ppeventdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetEventData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerevent, ppeventdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpeerevent;
    (void)ppeventdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabGetInvitationResponse(void* hinvitation, void* ppinvitationresponse) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetInvitationResponse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinvitation, ppinvitationresponse);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinvitation;
    (void)ppinvitationresponse;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabGetPresenceInfo(void* pcendpoint, void* pppresenceinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetPresenceInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcendpoint, pppresenceinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcendpoint;
    (void)pppresenceinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabGetSigninOptions(void* pdwsigninoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetSigninOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdwsigninoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdwsigninoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabInviteContact(void* pccontact, void* pcendpoint, void* pcinvitation, void* ppresponse) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabInviteContact");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pccontact, pcendpoint, pcinvitation, ppresponse);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pccontact;
    (void)pcendpoint;
    (void)pcinvitation;
    (void)ppresponse;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabInviteEndpoint(void* pcendpoint, void* pcinvitation, void* ppresponse) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabInviteEndpoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcendpoint, pcinvitation, ppresponse);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcendpoint;
    (void)pcinvitation;
    (void)ppresponse;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabParseContact(void* pwzcontactdata, void* ppcontact) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabParseContact");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzcontactdata, ppcontact);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzcontactdata;
    (void)ppcontact;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabQueryContactData(void* pcendpoint, void* ppwzcontactdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabQueryContactData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcendpoint, ppwzcontactdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcendpoint;
    (void)ppwzcontactdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabRefreshEndpointData(void* pcendpoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabRefreshEndpointData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcendpoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcendpoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabRegisterApplication(void* pcapplication, int32_t registrationtype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabRegisterApplication");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcapplication, registrationtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcapplication;
    (void)registrationtype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabRegisterEvent(void* hevent, uint32_t ceventregistration, void* peventregistrations, void* phpeerevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabRegisterEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent, ceventregistration, peventregistrations, phpeerevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    (void)ceventregistration;
    (void)peventregistrations;
    (void)phpeerevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabSetEndpointName(void* pwzendpointname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSetEndpointName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzendpointname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzendpointname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabSetObject(void* pcobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSetObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabSetPresenceInfo(void* pcpresenceinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSetPresenceInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcpresenceinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcpresenceinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabShutdown(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabShutdown");
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

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabSignin(void* hwndparent, uint32_t dwsigninoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSignin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, dwsigninoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)dwsigninoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabSignout(uint32_t dwsigninoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSignout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwsigninoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwsigninoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabStartup(uint16_t wversionrequested) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabStartup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wversionrequested);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wversionrequested;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabSubscribeEndpointData(void* pcendpoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSubscribeEndpointData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcendpoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcendpoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabUnregisterApplication(void* papplicationid, int32_t registrationtype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabUnregisterApplication");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(papplicationid, registrationtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)papplicationid;
    (void)registrationtype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabUnregisterEvent(void* hpeerevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabUnregisterEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpeerevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabUnsubscribeEndpointData(void* pcendpoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabUnsubscribeEndpointData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcendpoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcendpoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCollabUpdateContact(void* pcontact) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabUpdateContact");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcontact);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcontact;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerCreatePeerName(void* pwzidentity, void* pwzclassifier, void* ppwzpeername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCreatePeerName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzidentity, pwzclassifier, ppwzpeername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzidentity;
    (void)pwzclassifier;
    (void)ppwzpeername;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistClientAddContentInformation(int64_t hpeerdist, int64_t hcontenthandle, uint32_t cbnumberofbytes, void* pbuffer, void* lpoverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientAddContentInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, hcontenthandle, cbnumberofbytes, pbuffer, lpoverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistClientAddData(int64_t hpeerdist, int64_t hcontenthandle, uint32_t cbnumberofbytes, void* pbuffer, void* lpoverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientAddData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, hcontenthandle, cbnumberofbytes, pbuffer, lpoverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistClientBlockRead(int64_t hpeerdist, int64_t hcontenthandle, uint32_t cbmaxnumberofbytes, void* pbuffer, uint32_t dwtimeoutinmilliseconds, void* lpoverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientBlockRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, hcontenthandle, cbmaxnumberofbytes, pbuffer, dwtimeoutinmilliseconds, lpoverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbmaxnumberofbytes;
    (void)pbuffer;
    (void)dwtimeoutinmilliseconds;
    (void)lpoverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistClientCancelAsyncOperation(int64_t hpeerdist, int64_t hcontenthandle, void* poverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientCancelAsyncOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, hcontenthandle, poverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)poverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistClientCloseContent(int64_t hpeerdist, int64_t hcontenthandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientCloseContent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, hcontenthandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistClientCompleteContentInformation(int64_t hpeerdist, int64_t hcontenthandle, void* lpoverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientCompleteContentInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, hcontenthandle, lpoverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)lpoverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistClientFlushContent(int64_t hpeerdist, void* pcontenttag, void* hcompletionport, uint64_t ulcompletionkey, void* lpoverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientFlushContent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, pcontenttag, hcompletionport, ulcompletionkey, lpoverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)pcontenttag;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)lpoverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistClientGetInformationByHandle(int64_t hpeerdist, int64_t hcontenthandle, int32_t peerdistclientinfoclass, uint32_t dwbuffersize, void* lpinformation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientGetInformationByHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, hcontenthandle, peerdistclientinfoclass, dwbuffersize, lpinformation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)peerdistclientinfoclass;
    (void)dwbuffersize;
    (void)lpinformation;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistClientOpenContent(int64_t hpeerdist, void* pcontenttag, void* hcompletionport, uint64_t ulcompletionkey, void* phcontenthandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientOpenContent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, pcontenttag, hcompletionport, ulcompletionkey, phcontenthandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)pcontenttag;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)phcontenthandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistClientStreamRead(int64_t hpeerdist, int64_t hcontenthandle, uint32_t cbmaxnumberofbytes, void* pbuffer, uint32_t dwtimeoutinmilliseconds, void* lpoverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientStreamRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, hcontenthandle, cbmaxnumberofbytes, pbuffer, dwtimeoutinmilliseconds, lpoverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbmaxnumberofbytes;
    (void)pbuffer;
    (void)dwtimeoutinmilliseconds;
    (void)lpoverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerDistGetOverlappedResult(void* lpoverlapped, void* lpnumberofbytestransferred, int32_t bwait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistGetOverlappedResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpoverlapped, lpnumberofbytestransferred, bwait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpoverlapped;
    (void)lpnumberofbytestransferred;
    (void)bwait;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistGetStatus(int64_t hpeerdist, void* ppeerdiststatus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistGetStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, ppeerdiststatus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)ppeerdiststatus;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistGetStatusEx(int64_t hpeerdist, void* ppeerdiststatus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistGetStatusEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, ppeerdiststatus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)ppeerdiststatus;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistRegisterForStatusChangeNotification(int64_t hpeerdist, void* hcompletionport, uint64_t ulcompletionkey, void* lpoverlapped, void* ppeerdiststatus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistRegisterForStatusChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, hcompletionport, ulcompletionkey, lpoverlapped, ppeerdiststatus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)lpoverlapped;
    (void)ppeerdiststatus;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistRegisterForStatusChangeNotificationEx(int64_t hpeerdist, void* hcompletionport, uint64_t ulcompletionkey, void* lpoverlapped, void* ppeerdiststatus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistRegisterForStatusChangeNotificationEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, hcompletionport, ulcompletionkey, lpoverlapped, ppeerdiststatus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)lpoverlapped;
    (void)ppeerdiststatus;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistServerCancelAsyncOperation(int64_t hpeerdist, uint32_t cbcontentidentifier, void* pcontentidentifier, void* poverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerCancelAsyncOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, cbcontentidentifier, pcontentidentifier, poverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    (void)poverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistServerCloseContentInformation(int64_t hpeerdist, int64_t hcontentinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerCloseContentInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, hcontentinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)hcontentinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistServerCloseStreamHandle(int64_t hpeerdist, int64_t hstream) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerCloseStreamHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, hstream);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)hstream;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistServerOpenContentInformation(int64_t hpeerdist, uint32_t cbcontentidentifier, void* pcontentidentifier, uint64_t ullcontentoffset, uint64_t cbcontentlength, void* hcompletionport, uint64_t ulcompletionkey, void* phcontentinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint64_t, uint64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerOpenContentInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, cbcontentidentifier, pcontentidentifier, ullcontentoffset, cbcontentlength, hcompletionport, ulcompletionkey, phcontentinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    (void)ullcontentoffset;
    (void)cbcontentlength;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)phcontentinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistServerOpenContentInformationEx(int64_t hpeerdist, uint32_t cbcontentidentifier, void* pcontentidentifier, uint64_t ullcontentoffset, uint64_t cbcontentlength, void* pretrievaloptions, void* hcompletionport, uint64_t ulcompletionkey, void* phcontentinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint64_t, uint64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerOpenContentInformationEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, cbcontentidentifier, pcontentidentifier, ullcontentoffset, cbcontentlength, pretrievaloptions, hcompletionport, ulcompletionkey, phcontentinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    (void)ullcontentoffset;
    (void)cbcontentlength;
    (void)pretrievaloptions;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)phcontentinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishAddToStream(int64_t hpeerdist, int64_t hstream, uint32_t cbnumberofbytes, void* pbuffer, void* lpoverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerPublishAddToStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, hstream, cbnumberofbytes, pbuffer, lpoverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)hstream;
    (void)cbnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishCompleteStream(int64_t hpeerdist, int64_t hstream, void* lpoverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerPublishCompleteStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, hstream, lpoverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)hstream;
    (void)lpoverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishStream(int64_t hpeerdist, uint32_t cbcontentidentifier, void* pcontentidentifier, uint64_t cbcontentlength, void* ppublishoptions, void* hcompletionport, uint64_t ulcompletionkey, void* phstream) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerPublishStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, cbcontentidentifier, pcontentidentifier, cbcontentlength, ppublishoptions, hcompletionport, ulcompletionkey, phstream);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    (void)cbcontentlength;
    (void)ppublishoptions;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)phstream;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistServerRetrieveContentInformation(int64_t hpeerdist, int64_t hcontentinfo, uint32_t cbmaxnumberofbytes, void* pbuffer, void* lpoverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerRetrieveContentInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, hcontentinfo, cbmaxnumberofbytes, pbuffer, lpoverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)hcontentinfo;
    (void)cbmaxnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistServerUnpublish(int64_t hpeerdist, uint32_t cbcontentidentifier, void* pcontentidentifier) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerUnpublish");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist, cbcontentidentifier, pcontentidentifier);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistShutdown(int64_t hpeerdist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistShutdown");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistStartup(uint32_t dwversionrequested, void* phpeerdist, void* pdwsupportedversion) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistStartup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwversionrequested, phpeerdist, pdwsupportedversion);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwversionrequested;
    (void)phpeerdist;
    (void)pdwsupportedversion;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_p2p_peerDistUnregisterForStatusChangeNotification(int64_t hpeerdist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistUnregisterForStatusChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerdist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hpeerdist;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerEndEnumeration(void* hpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerEndEnumeration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerEnumGroups(void* pwzidentity, void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerEnumGroups");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzidentity, phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzidentity;
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerEnumIdentities(void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerEnumIdentities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networkmanagement_p2p_peerFreeData(void* pvdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerFreeData");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pvdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)pvdata;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGetItemCount(void* hpeerenum, void* pcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGetItemCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerenum, pcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpeerenum;
    (void)pcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGetNextItem(void* hpeerenum, void* pcount, void* pppvitems) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGetNextItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerenum, pcount, pppvitems);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpeerenum;
    (void)pcount;
    (void)pppvitems;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphAddRecord(void* hgraph, void* precord, void* precordid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphAddRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, precord, precordid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)precord;
    (void)precordid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphClose(void* hgraph) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphCloseDirectConnection(void* hgraph, uint64_t ullconnectionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphCloseDirectConnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, ullconnectionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)ullconnectionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphConnect(void* hgraph, void* pwzpeerid, void* paddress, void* pullconnectionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, pwzpeerid, paddress, pullconnectionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)pwzpeerid;
    (void)paddress;
    (void)pullconnectionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphCreate(void* pgraphproperties, void* pwzdatabasename, void* psecurityinterface, void* phgraph) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pgraphproperties, pwzdatabasename, psecurityinterface, phgraph);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pgraphproperties;
    (void)pwzdatabasename;
    (void)psecurityinterface;
    (void)phgraph;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphDelete(void* pwzgraphid, void* pwzpeerid, void* pwzdatabasename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphDelete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzgraphid, pwzpeerid, pwzdatabasename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzgraphid;
    (void)pwzpeerid;
    (void)pwzdatabasename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphDeleteRecord(void* hgraph, void* precordid, int32_t flocal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphDeleteRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, precordid, flocal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)precordid;
    (void)flocal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphEndEnumeration(void* hpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphEndEnumeration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumConnections(void* hgraph, uint32_t dwflags, void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphEnumConnections");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, dwflags, phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)dwflags;
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumNodes(void* hgraph, void* pwzpeerid, void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphEnumNodes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, pwzpeerid, phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)pwzpeerid;
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumRecords(void* hgraph, void* precordtype, void* pwzpeerid, void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphEnumRecords");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, precordtype, pwzpeerid, phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)precordtype;
    (void)pwzpeerid;
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphExportDatabase(void* hgraph, void* pwzfilepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphExportDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, pwzfilepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)pwzfilepath;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networkmanagement_p2p_peerGraphFreeData(void* pvdata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphFreeData");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pvdata);
        return;
    }
    errno = ENOSYS;
#else
    (void)pvdata;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphGetEventData(void* hpeerevent, void* ppeventdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetEventData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerevent, ppeventdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpeerevent;
    (void)ppeventdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphGetItemCount(void* hpeerenum, void* pcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetItemCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerenum, pcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpeerenum;
    (void)pcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphGetNextItem(void* hpeerenum, void* pcount, void* pppvitems) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetNextItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerenum, pcount, pppvitems);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpeerenum;
    (void)pcount;
    (void)pppvitems;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphGetNodeInfo(void* hgraph, uint64_t ullnodeid, void* ppnodeinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetNodeInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, ullnodeid, ppnodeinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)ullnodeid;
    (void)ppnodeinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphGetProperties(void* hgraph, void* ppgraphproperties) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, ppgraphproperties);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)ppgraphproperties;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphGetRecord(void* hgraph, void* precordid, void* pprecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, precordid, pprecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)precordid;
    (void)pprecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphGetStatus(void* hgraph, void* pdwstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, pdwstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)pdwstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphImportDatabase(void* hgraph, void* pwzfilepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphImportDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, pwzfilepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)pwzfilepath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphListen(void* hgraph, uint32_t dwscope, uint32_t dwscopeid, uint16_t wport) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphListen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, dwscope, dwscopeid, wport);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)dwscope;
    (void)dwscopeid;
    (void)wport;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphOpen(void* pwzgraphid, void* pwzpeerid, void* pwzdatabasename, void* psecurityinterface, uint32_t crecordtypesyncprecedence, void* precordtypesyncprecedence, void* phgraph) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzgraphid, pwzpeerid, pwzdatabasename, psecurityinterface, crecordtypesyncprecedence, precordtypesyncprecedence, phgraph);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzgraphid;
    (void)pwzpeerid;
    (void)pwzdatabasename;
    (void)psecurityinterface;
    (void)crecordtypesyncprecedence;
    (void)precordtypesyncprecedence;
    (void)phgraph;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphOpenDirectConnection(void* hgraph, void* pwzpeerid, void* paddress, void* pullconnectionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphOpenDirectConnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, pwzpeerid, paddress, pullconnectionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)pwzpeerid;
    (void)paddress;
    (void)pullconnectionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphPeerTimeToUniversalTime(void* hgraph, void* pftpeertime, void* pftuniversaltime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphPeerTimeToUniversalTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, pftpeertime, pftuniversaltime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)pftpeertime;
    (void)pftuniversaltime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphRegisterEvent(void* hgraph, void* hevent, uint32_t ceventregistrations, void* peventregistrations, void* phpeerevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphRegisterEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, hevent, ceventregistrations, peventregistrations, phpeerevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)hevent;
    (void)ceventregistrations;
    (void)peventregistrations;
    (void)phpeerevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphSearchRecords(void* hgraph, void* pwzcriteria, void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphSearchRecords");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, pwzcriteria, phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)pwzcriteria;
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphSendData(void* hgraph, uint64_t ullconnectionid, void* ptype, uint32_t cbdata, void* pvdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphSendData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, ullconnectionid, ptype, cbdata, pvdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)ullconnectionid;
    (void)ptype;
    (void)cbdata;
    (void)pvdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphSetNodeAttributes(void* hgraph, void* pwzattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphSetNodeAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, pwzattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)pwzattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphSetPresence(void* hgraph, int32_t fpresent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphSetPresence");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, fpresent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)fpresent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphSetProperties(void* hgraph, void* pgraphproperties) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphSetProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, pgraphproperties);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)pgraphproperties;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphShutdown(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphShutdown");
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

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphStartup(uint16_t wversionrequested, void* pversiondata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphStartup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wversionrequested, pversiondata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wversionrequested;
    (void)pversiondata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphUniversalTimeToPeerTime(void* hgraph, void* pftuniversaltime, void* pftpeertime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphUniversalTimeToPeerTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, pftuniversaltime, pftpeertime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)pftuniversaltime;
    (void)pftpeertime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphUnregisterEvent(void* hpeerevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphUnregisterEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpeerevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphUpdateRecord(void* hgraph, void* precord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphUpdateRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, precord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)precord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGraphValidateDeferredRecords(void* hgraph, uint32_t crecordids, void* precordids) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphValidateDeferredRecords");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgraph, crecordids, precordids);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgraph;
    (void)crecordids;
    (void)precordids;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupAddRecord(void* hgroup, void* precord, void* precordid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupAddRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, precord, precordid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)precord;
    (void)precordid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupClose(void* hgroup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupCloseDirectConnection(void* hgroup, uint64_t ullconnectionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupCloseDirectConnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, ullconnectionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)ullconnectionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupConnect(void* hgroup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupConnectByAddress(void* hgroup, uint32_t caddresses, void* paddresses) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupConnectByAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, caddresses, paddresses);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)caddresses;
    (void)paddresses;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupCreate(void* pproperties, void* phgroup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pproperties, phgroup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pproperties;
    (void)phgroup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupCreateInvitation(void* hgroup, void* pwzidentityinfo, void* pftexpiration, uint32_t croles, void* proles, void* ppwzinvitation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupCreateInvitation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, pwzidentityinfo, pftexpiration, croles, proles, ppwzinvitation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)pwzidentityinfo;
    (void)pftexpiration;
    (void)croles;
    (void)proles;
    (void)ppwzinvitation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupCreatePasswordInvitation(void* hgroup, void* ppwzinvitation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupCreatePasswordInvitation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, ppwzinvitation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)ppwzinvitation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupDelete(void* pwzidentity, void* pwzgrouppeername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupDelete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzidentity, pwzgrouppeername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzidentity;
    (void)pwzgrouppeername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupDeleteRecord(void* hgroup, void* precordid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupDeleteRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, precordid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)precordid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumConnections(void* hgroup, uint32_t dwflags, void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupEnumConnections");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, dwflags, phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)dwflags;
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumMembers(void* hgroup, uint32_t dwflags, void* pwzidentity, void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupEnumMembers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, dwflags, pwzidentity, phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)dwflags;
    (void)pwzidentity;
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumRecords(void* hgroup, void* precordtype, void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupEnumRecords");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, precordtype, phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)precordtype;
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupExportConfig(void* hgroup, void* pwzpassword, void* ppwzxml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupExportConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, pwzpassword, ppwzxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)pwzpassword;
    (void)ppwzxml;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupExportDatabase(void* hgroup, void* pwzfilepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupExportDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, pwzfilepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)pwzfilepath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupGetEventData(void* hpeerevent, void* ppeventdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupGetEventData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerevent, ppeventdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpeerevent;
    (void)ppeventdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupGetProperties(void* hgroup, void* ppproperties) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupGetProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, ppproperties);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)ppproperties;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupGetRecord(void* hgroup, void* precordid, void* pprecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupGetRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, precordid, pprecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)precordid;
    (void)pprecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupGetStatus(void* hgroup, void* pdwstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupGetStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, pdwstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)pdwstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupImportConfig(void* pwzxml, void* pwzpassword, int32_t foverwrite, void* ppwzidentity, void* ppwzgroup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupImportConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzxml, pwzpassword, foverwrite, ppwzidentity, ppwzgroup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzxml;
    (void)pwzpassword;
    (void)foverwrite;
    (void)ppwzidentity;
    (void)ppwzgroup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupImportDatabase(void* hgroup, void* pwzfilepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupImportDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, pwzfilepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)pwzfilepath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupIssueCredentials(void* hgroup, void* pwzsubjectidentity, void* pcredentialinfo, uint32_t dwflags, void* ppwzinvitation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupIssueCredentials");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, pwzsubjectidentity, pcredentialinfo, dwflags, ppwzinvitation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)pwzsubjectidentity;
    (void)pcredentialinfo;
    (void)dwflags;
    (void)ppwzinvitation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupJoin(void* pwzidentity, void* pwzinvitation, void* pwzcloud, void* phgroup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupJoin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzidentity, pwzinvitation, pwzcloud, phgroup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzidentity;
    (void)pwzinvitation;
    (void)pwzcloud;
    (void)phgroup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupOpen(void* pwzidentity, void* pwzgrouppeername, void* pwzcloud, void* phgroup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzidentity, pwzgrouppeername, pwzcloud, phgroup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzidentity;
    (void)pwzgrouppeername;
    (void)pwzcloud;
    (void)phgroup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupOpenDirectConnection(void* hgroup, void* pwzidentity, void* paddress, void* pullconnectionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupOpenDirectConnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, pwzidentity, paddress, pullconnectionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)pwzidentity;
    (void)paddress;
    (void)pullconnectionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupParseInvitation(void* pwzinvitation, void* ppinvitationinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupParseInvitation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzinvitation, ppinvitationinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzinvitation;
    (void)ppinvitationinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupPasswordJoin(void* pwzidentity, void* pwzinvitation, void* pwzpassword, void* pwzcloud, void* phgroup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupPasswordJoin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzidentity, pwzinvitation, pwzpassword, pwzcloud, phgroup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzidentity;
    (void)pwzinvitation;
    (void)pwzpassword;
    (void)pwzcloud;
    (void)phgroup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupPeerTimeToUniversalTime(void* hgroup, void* pftpeertime, void* pftuniversaltime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupPeerTimeToUniversalTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, pftpeertime, pftuniversaltime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)pftpeertime;
    (void)pftuniversaltime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupRegisterEvent(void* hgroup, void* hevent, uint32_t ceventregistration, void* peventregistrations, void* phpeerevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupRegisterEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, hevent, ceventregistration, peventregistrations, phpeerevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)hevent;
    (void)ceventregistration;
    (void)peventregistrations;
    (void)phpeerevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupResumePasswordAuthentication(void* hgroup, void* hpeereventhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupResumePasswordAuthentication");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, hpeereventhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)hpeereventhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupSearchRecords(void* hgroup, void* pwzcriteria, void* phpeerenum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupSearchRecords");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, pwzcriteria, phpeerenum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)pwzcriteria;
    (void)phpeerenum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupSendData(void* hgroup, uint64_t ullconnectionid, void* ptype, uint32_t cbdata, void* pvdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupSendData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, ullconnectionid, ptype, cbdata, pvdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)ullconnectionid;
    (void)ptype;
    (void)cbdata;
    (void)pvdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupSetProperties(void* hgroup, void* pproperties) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupSetProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, pproperties);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)pproperties;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupShutdown(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupShutdown");
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

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupStartup(uint16_t wversionrequested, void* pversiondata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupStartup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wversionrequested, pversiondata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wversionrequested;
    (void)pversiondata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupUniversalTimeToPeerTime(void* hgroup, void* pftuniversaltime, void* pftpeertime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupUniversalTimeToPeerTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, pftuniversaltime, pftpeertime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)pftuniversaltime;
    (void)pftpeertime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupUnregisterEvent(void* hpeerevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupUnregisterEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hpeerevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hpeerevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerGroupUpdateRecord(void* hgroup, void* precord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupUpdateRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, precord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)precord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerHostNameToPeerName(void* pwzhostname, void* ppwzpeername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerHostNameToPeerName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzhostname, ppwzpeername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzhostname;
    (void)ppwzpeername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerIdentityCreate(void* pwzclassifier, void* pwzfriendlyname, uint64_t hcryptprov, void* ppwzidentity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzclassifier, pwzfriendlyname, hcryptprov, ppwzidentity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzclassifier;
    (void)pwzfriendlyname;
    (void)hcryptprov;
    (void)ppwzidentity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerIdentityDelete(void* pwzidentity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityDelete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzidentity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzidentity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerIdentityExport(void* pwzidentity, void* pwzpassword, void* ppwzexportxml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityExport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzidentity, pwzpassword, ppwzexportxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzidentity;
    (void)pwzpassword;
    (void)ppwzexportxml;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetCryptKey(void* pwzidentity, void* phcryptprov) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityGetCryptKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzidentity, phcryptprov);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzidentity;
    (void)phcryptprov;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetDefault(void* ppwzpeername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityGetDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppwzpeername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppwzpeername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetFriendlyName(void* pwzidentity, void* ppwzfriendlyname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityGetFriendlyName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzidentity, ppwzfriendlyname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzidentity;
    (void)ppwzfriendlyname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetXML(void* pwzidentity, void* ppwzidentityxml) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityGetXML");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzidentity, ppwzidentityxml);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzidentity;
    (void)ppwzidentityxml;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerIdentityImport(void* pwzimportxml, void* pwzpassword, void* ppwzidentity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityImport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzimportxml, pwzpassword, ppwzidentity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzimportxml;
    (void)pwzpassword;
    (void)ppwzidentity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerIdentitySetFriendlyName(void* pwzidentity, void* pwzfriendlyname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentitySetFriendlyName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzidentity, pwzfriendlyname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzidentity;
    (void)pwzfriendlyname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerNameToPeerHostName(void* pwzpeername, void* ppwzhostname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerNameToPeerHostName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzpeername, ppwzhostname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzpeername;
    (void)ppwzhostname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerPnrpEndResolve(void* hresolve) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpEndResolve");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresolve);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hresolve;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerPnrpGetCloudInfo(void* pcnumclouds, void* ppcloudinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpGetCloudInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcnumclouds, ppcloudinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcnumclouds;
    (void)ppcloudinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerPnrpGetEndpoint(void* hresolve, void* ppendpoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpGetEndpoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresolve, ppendpoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hresolve;
    (void)ppendpoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerPnrpRegister(void* pcwzpeername, void* pregistrationinfo, void* phregistration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpRegister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcwzpeername, pregistrationinfo, phregistration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcwzpeername;
    (void)pregistrationinfo;
    (void)phregistration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerPnrpResolve(void* pcwzpeername, void* pcwzcloudname, void* pcendpoints, void* ppendpoints) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpResolve");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcwzpeername, pcwzcloudname, pcendpoints, ppendpoints);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcwzpeername;
    (void)pcwzcloudname;
    (void)pcendpoints;
    (void)ppendpoints;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerPnrpShutdown(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpShutdown");
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

int32_t windowssys_windows_win32_networkmanagement_p2p_peerPnrpStartResolve(void* pcwzpeername, void* pcwzcloudname, uint32_t cmaxendpoints, void* hevent, void* phresolve) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpStartResolve");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcwzpeername, pcwzcloudname, cmaxendpoints, hevent, phresolve);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcwzpeername;
    (void)pcwzcloudname;
    (void)cmaxendpoints;
    (void)hevent;
    (void)phresolve;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerPnrpStartup(uint16_t wversionrequested) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpStartup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wversionrequested);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wversionrequested;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerPnrpUnregister(void* hregistration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpUnregister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hregistration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hregistration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_p2p_peerPnrpUpdateRegistration(void* hregistration, void* pregistrationinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpUpdateRegistration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hregistration, pregistrationinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hregistration;
    (void)pregistrationinfo;
    errno = ENOSYS;
    return -1;
#endif
}

