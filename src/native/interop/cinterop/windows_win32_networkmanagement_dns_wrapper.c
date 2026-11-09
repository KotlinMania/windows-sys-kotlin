#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_dns_wrapper.h"
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

int32_t windowssys_windows_win32_networkmanagement_dns_DnsAcquireContextHandle_A(uint32_t credentialflags, void* credentials, void* pcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsAcquireContextHandle_A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(credentialflags, credentials, pcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)credentialflags;
    (void)credentials;
    (void)pcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsAcquireContextHandle_W(uint32_t credentialflags, void* credentials, void* pcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsAcquireContextHandle_W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(credentialflags, credentials, pcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)credentialflags;
    (void)credentials;
    (void)pcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsCancelQuery(void* pcancelhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsCancelQuery");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcancelhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcancelhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsCancelQueryRaw(void* cancelhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsCancelQueryRaw");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cancelhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cancelhandle;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionDeletePolicyEntries(int32_t policyentrytag) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionDeletePolicyEntries");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyentrytag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)policyentrytag;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionDeleteProxyInfo(void* pwszconnectionname, int32_t type) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionDeleteProxyInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszconnectionname, type);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszconnectionname;
    (void)type;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeNameList(void* pnamelist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionFreeNameList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pnamelist);
        return;
    }
    errno = ENOSYS;
#else
    (void)pnamelist;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyInfo(void* pproxyinfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionFreeProxyInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pproxyinfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)pproxyinfo;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyInfoEx(void* pproxyinfoex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionFreeProxyInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pproxyinfoex);
        return;
    }
    errno = ENOSYS;
#else
    (void)pproxyinfoex;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyList(void* pproxylist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionFreeProxyList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pproxylist);
        return;
    }
    errno = ENOSYS;
#else
    (void)pproxylist;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetNameList(void* pnamelist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionGetNameList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pnamelist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pnamelist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfo(void* pwszconnectionname, int32_t type, void* pproxyinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionGetProxyInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszconnectionname, type, pproxyinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszconnectionname;
    (void)type;
    (void)pproxyinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfoForHostUrl(void* pwszhosturl, void* pselectioncontext, uint32_t dwselectioncontextlength, uint32_t dwexplicitinterfaceindex, void* pproxyinfoex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionGetProxyInfoForHostUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszhosturl, pselectioncontext, dwselectioncontextlength, dwexplicitinterfaceindex, pproxyinfoex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszhosturl;
    (void)pselectioncontext;
    (void)dwselectioncontextlength;
    (void)dwexplicitinterfaceindex;
    (void)pproxyinfoex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfoForHostUrlEx(void* pwszhosturl, void* pselectioncontext, uint32_t dwselectioncontextlength, uint32_t dwexplicitinterfaceindex, void* pwszconnectionname, void* pproxyinfoex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionGetProxyInfoForHostUrlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszhosturl, pselectioncontext, dwselectioncontextlength, dwexplicitinterfaceindex, pwszconnectionname, pproxyinfoex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszhosturl;
    (void)pselectioncontext;
    (void)dwselectioncontextlength;
    (void)dwexplicitinterfaceindex;
    (void)pwszconnectionname;
    (void)pproxyinfoex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyList(void* pwszconnectionname, void* pproxylist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionGetProxyList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszconnectionname, pproxylist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszconnectionname;
    (void)pproxylist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionSetPolicyEntries(int32_t policyentrytag, void* ppolicyentrylist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionSetPolicyEntries");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyentrytag, ppolicyentrylist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)policyentrytag;
    (void)ppolicyentrylist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionSetProxyInfo(void* pwszconnectionname, int32_t type, void* pproxyinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionSetProxyInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszconnectionname, type, pproxyinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszconnectionname;
    (void)type;
    (void)pproxyinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionUpdateIfIndexTable(void* pconnectionifindexentries) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionUpdateIfIndexTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pconnectionifindexentries);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pconnectionifindexentries;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsExtractRecordsFromMessage_UTF8(void* pdnsbuffer, uint16_t wmessagelength, void* pprecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsExtractRecordsFromMessage_UTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdnsbuffer, wmessagelength, pprecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdnsbuffer;
    (void)wmessagelength;
    (void)pprecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsExtractRecordsFromMessage_W(void* pdnsbuffer, uint16_t wmessagelength, void* pprecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsExtractRecordsFromMessage_W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdnsbuffer, wmessagelength, pprecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdnsbuffer;
    (void)wmessagelength;
    (void)pprecord;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networkmanagement_dns_DnsFree(void* pdata, int32_t freetype) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pdata, freetype);
        return;
    }
    errno = ENOSYS;
#else
    (void)pdata;
    (void)freetype;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_dns_DnsFreeCustomServers(void* pcservers, void* ppservers) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsFreeCustomServers");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pcservers, ppservers);
        return;
    }
    errno = ENOSYS;
#else
    (void)pcservers;
    (void)ppservers;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networkmanagement_dns_DnsFreeProxyName(void* proxyname) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsFreeProxyName");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(proxyname);
        return;
    }
    errno = ENOSYS;
#else
    (void)proxyname;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsGetApplicationSettings(void* pcservers, void* ppdefaultservers, void* psettings) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsGetApplicationSettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcservers, ppdefaultservers, psettings);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcservers;
    (void)ppdefaultservers;
    (void)psettings;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsGetProxyInformation(void* hostname, void* proxyinformation, void* defaultproxyinformation, void* completionroutine, void* completioncontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsGetProxyInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostname, proxyinformation, defaultproxyinformation, completionroutine, completioncontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hostname;
    (void)proxyinformation;
    (void)defaultproxyinformation;
    (void)completionroutine;
    (void)completioncontext;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_A(void* paddrecords, void* pdeleterecords, uint32_t options, void* hcredentials, void* pextralist, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsModifyRecordsInSet_A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(paddrecords, pdeleterecords, options, hcredentials, pextralist, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)paddrecords;
    (void)pdeleterecords;
    (void)options;
    (void)hcredentials;
    (void)pextralist;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_UTF8(void* paddrecords, void* pdeleterecords, uint32_t options, void* hcredentials, void* pextralist, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsModifyRecordsInSet_UTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(paddrecords, pdeleterecords, options, hcredentials, pextralist, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)paddrecords;
    (void)pdeleterecords;
    (void)options;
    (void)hcredentials;
    (void)pextralist;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_W(void* paddrecords, void* pdeleterecords, uint32_t options, void* hcredentials, void* pextralist, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsModifyRecordsInSet_W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(paddrecords, pdeleterecords, options, hcredentials, pextralist, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)paddrecords;
    (void)pdeleterecords;
    (void)options;
    (void)hcredentials;
    (void)pextralist;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsNameCompare_A(void* pname1, void* pname2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsNameCompare_A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname1, pname2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname1;
    (void)pname2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsNameCompare_W(void* pname1, void* pname2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsNameCompare_W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname1, pname2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname1;
    (void)pname2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsQueryConfig(int32_t config, uint32_t flag, void* pwsadaptername, void* preserved, void* pbuffer, void* pbuflen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsQueryConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(config, flag, pwsadaptername, preserved, pbuffer, pbuflen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)config;
    (void)flag;
    (void)pwsadaptername;
    (void)preserved;
    (void)pbuffer;
    (void)pbuflen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsQueryEx(void* pqueryrequest, void* pqueryresults, void* pcancelhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsQueryEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pqueryrequest, pqueryresults, pcancelhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pqueryrequest;
    (void)pqueryresults;
    (void)pcancelhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsQueryRaw(void* queryrequest, void* cancelhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsQueryRaw");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queryrequest, cancelhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queryrequest;
    (void)cancelhandle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networkmanagement_dns_DnsQueryRawResultFree(void* queryresults) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsQueryRawResultFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(queryresults);
        return;
    }
    errno = ENOSYS;
#else
    (void)queryresults;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsQuery_A(void* pszname, uint16_t wtype, uint32_t options, void* pextra, void* ppqueryresults, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsQuery_A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszname, wtype, options, pextra, ppqueryresults, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszname;
    (void)wtype;
    (void)options;
    (void)pextra;
    (void)ppqueryresults;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsQuery_UTF8(void* pszname, uint16_t wtype, uint32_t options, void* pextra, void* ppqueryresults, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsQuery_UTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszname, wtype, options, pextra, ppqueryresults, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszname;
    (void)wtype;
    (void)options;
    (void)pextra;
    (void)ppqueryresults;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsQuery_W(void* pszname, uint16_t wtype, uint32_t options, void* pextra, void* ppqueryresults, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsQuery_W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszname, wtype, options, pextra, ppqueryresults, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszname;
    (void)wtype;
    (void)options;
    (void)pextra;
    (void)ppqueryresults;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsRecordCompare(void* precord1, void* precord2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsRecordCompare");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(precord1, precord2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)precord1;
    (void)precord2;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networkmanagement_dns_DnsRecordCopyEx(void* precord, int32_t charsetin, int32_t charsetout) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsRecordCopyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(precord, charsetin, charsetout);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)precord;
    (void)charsetin;
    (void)charsetout;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsRecordSetCompare(void* prr1, void* prr2, void* ppdiff1, void* ppdiff2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsRecordSetCompare");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prr1, prr2, ppdiff1, ppdiff2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prr1;
    (void)prr2;
    (void)ppdiff1;
    (void)ppdiff2;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networkmanagement_dns_DnsRecordSetCopyEx(void* precordset, int32_t charsetin, int32_t charsetout) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsRecordSetCopyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(precordset, charsetin, charsetout);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)precordset;
    (void)charsetin;
    (void)charsetout;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networkmanagement_dns_DnsRecordSetDetach(void* precordlist) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsRecordSetDetach");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(precordlist);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)precordlist;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_networkmanagement_dns_DnsReleaseContextHandle(void* hcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsReleaseContextHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)hcontext;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetA(void* preplaceset, uint32_t options, void* hcontext, void* pextrainfo, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsReplaceRecordSetA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(preplaceset, options, hcontext, pextrainfo, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)preplaceset;
    (void)options;
    (void)hcontext;
    (void)pextrainfo;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetUTF8(void* preplaceset, uint32_t options, void* hcontext, void* pextrainfo, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsReplaceRecordSetUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(preplaceset, options, hcontext, pextrainfo, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)preplaceset;
    (void)options;
    (void)hcontext;
    (void)pextrainfo;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetW(void* preplaceset, uint32_t options, void* hcontext, void* pextrainfo, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsReplaceRecordSetW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(preplaceset, options, hcontext, pextrainfo, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)preplaceset;
    (void)options;
    (void)hcontext;
    (void)pextrainfo;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsServiceBrowse(void* prequest, void* pcancel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceBrowse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prequest, pcancel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prequest;
    (void)pcancel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsServiceBrowseCancel(void* pcancelhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceBrowseCancel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcancelhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcancelhandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networkmanagement_dns_DnsServiceConstructInstance(void* pservicename, void* phostname, void* pip4, void* pip6, uint16_t wport, uint16_t wpriority, uint16_t wweight, uint32_t dwpropertiescount, void* keys, void* values) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint16_t, uint16_t, uint16_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceConstructInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pservicename, phostname, pip4, pip6, wport, wpriority, wweight, dwpropertiescount, keys, values);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pservicename;
    (void)phostname;
    (void)pip4;
    (void)pip6;
    (void)wport;
    (void)wpriority;
    (void)wweight;
    (void)dwpropertiescount;
    (void)keys;
    (void)values;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networkmanagement_dns_DnsServiceCopyInstance(void* porig) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceCopyInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(porig);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)porig;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsServiceDeRegister(void* prequest, void* pcancel) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceDeRegister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prequest, pcancel);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prequest;
    (void)pcancel;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networkmanagement_dns_DnsServiceFreeInstance(void* pinstance) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceFreeInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pinstance);
        return;
    }
    errno = ENOSYS;
#else
    (void)pinstance;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsServiceRegister(void* prequest, void* pcancel) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceRegister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prequest, pcancel);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prequest;
    (void)pcancel;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsServiceRegisterCancel(void* pcancelhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceRegisterCancel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcancelhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcancelhandle;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsServiceResolve(void* prequest, void* pcancel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceResolve");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prequest, pcancel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prequest;
    (void)pcancel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsServiceResolveCancel(void* pcancelhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceResolveCancel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcancelhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcancelhandle;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_dns_DnsSetApplicationSettings(uint32_t cservers, void* pservers, void* psettings) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsSetApplicationSettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cservers, pservers, psettings);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)cservers;
    (void)pservers;
    (void)psettings;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsStartMulticastQuery(void* pqueryrequest, void* phandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsStartMulticastQuery");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pqueryrequest, phandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pqueryrequest;
    (void)phandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsStopMulticastQuery(void* phandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsStopMulticastQuery");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsValidateName_A(void* pszname, int32_t format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsValidateName_A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszname, format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszname;
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsValidateName_UTF8(void* pszname, int32_t format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsValidateName_UTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszname, format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszname;
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsValidateName_W(void* pszname, int32_t format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsValidateName_W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszname, format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszname;
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsWriteQuestionToBuffer_UTF8(void* pdnsbuffer, void* pdwbuffersize, void* pszname, uint16_t wtype, uint16_t xid, int32_t frecursiondesired) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, uint16_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsWriteQuestionToBuffer_UTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdnsbuffer, pdwbuffersize, pszname, wtype, xid, frecursiondesired);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdnsbuffer;
    (void)pdwbuffersize;
    (void)pszname;
    (void)wtype;
    (void)xid;
    (void)frecursiondesired;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networkmanagement_dns_DnsWriteQuestionToBuffer_W(void* pdnsbuffer, void* pdwbuffersize, void* pszname, uint16_t wtype, uint16_t xid, int32_t frecursiondesired) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, uint16_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsWriteQuestionToBuffer_W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdnsbuffer, pdwbuffersize, pszname, wtype, xid, frecursiondesired);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdnsbuffer;
    (void)pdwbuffersize;
    (void)pszname;
    (void)wtype;
    (void)xid;
    (void)frecursiondesired;
    errno = ENOSYS;
    return -1;
#endif
}

