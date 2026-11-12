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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleA(uint32_t credentialflags, void* credentials, void* pcontext) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleW(uint32_t credentialflags, void* credentials, void* pcontext) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsCancelQuery(void* pcancelhandle) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsCancelQueryRaw(void* cancelhandle) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeletePolicyEntries(int32_t policyentrytag) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeleteProxyInfo(void* pwszconnectionname, int32_t type) {
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

void windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeNameList(void* pnamelist) {
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

void windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfo(void* pproxyinfo) {
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

void windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfoEx(void* pproxyinfoex) {
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

void windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyList(void* pproxylist) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetNameList(void* pnamelist) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfo(void* pwszconnectionname, int32_t type, void* pproxyinfo) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrl(void* pwszhosturl, void* pselectioncontext, uint32_t dwselectioncontextlength, uint32_t dwexplicitinterfaceindex, void* pproxyinfoex) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrlEx(void* pwszhosturl, void* pselectioncontext, uint32_t dwselectioncontextlength, uint32_t dwexplicitinterfaceindex, void* pwszconnectionname, void* pproxyinfoex) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyList(void* pwszconnectionname, void* pproxylist) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetPolicyEntries(int32_t policyentrytag, void* ppolicyentrylist) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetProxyInfo(void* pwszconnectionname, int32_t type, void* pproxyinfo) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionUpdateIfIndexTable(void* pconnectionifindexentries) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageUtf8(void* pdnsbuffer, uint16_t wmessagelength, void* pprecord) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageW(void* pdnsbuffer, uint16_t wmessagelength, void* pprecord) {
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

void windowssysWindowsWin32NetworkmanagementDnsDnsFree(void* pdata, int32_t freetype) {
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

void windowssysWindowsWin32NetworkmanagementDnsDnsFreeCustomServers(void* pcservers, void* ppservers) {
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

void windowssysWindowsWin32NetworkmanagementDnsDnsFreeProxyName(void* proxyname) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsGetApplicationSettings(void* pcservers, void* ppdefaultservers, void* psettings) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsGetProxyInformation(void* hostname, void* proxyinformation, void* defaultproxyinformation, void* completionroutine, void* completioncontext) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetA(void* paddrecords, void* pdeleterecords, uint32_t options, void* hcredentials, void* pextralist, void* preserved) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetUtf8(void* paddrecords, void* pdeleterecords, uint32_t options, void* hcredentials, void* pextralist, void* preserved) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetW(void* paddrecords, void* pdeleterecords, uint32_t options, void* hcredentials, void* pextralist, void* preserved) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareA(void* pname1, void* pname2) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareW(void* pname1, void* pname2) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsQueryConfig(int32_t config, uint32_t flag, void* pwsadaptername, void* preserved, void* pbuffer, void* pbuflen) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsQueryEx(void* pqueryrequest, void* pqueryresults, void* pcancelhandle) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsQueryRaw(void* queryrequest, void* cancelhandle) {
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

void windowssysWindowsWin32NetworkmanagementDnsDnsQueryRawResultFree(void* queryresults) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsQueryA(void* pszname, uint16_t wtype, uint32_t options, void* pextra, void* ppqueryresults, void* preserved) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsQueryUtf8(void* pszname, uint16_t wtype, uint32_t options, void* pextra, void* ppqueryresults, void* preserved) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsQueryW(void* pszname, uint16_t wtype, uint32_t options, void* pextra, void* ppqueryresults, void* preserved) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsRecordCompare(void* precord1, void* precord2) {
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

void* windowssysWindowsWin32NetworkmanagementDnsDnsRecordCopyEx(void* precord, int32_t charsetin, int32_t charsetout) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCompare(void* prr1, void* prr2, void* ppdiff1, void* ppdiff2) {
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

void* windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCopyEx(void* precordset, int32_t charsetin, int32_t charsetout) {
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

void* windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetDetach(void* precordlist) {
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

void windowssysWindowsWin32NetworkmanagementDnsDnsReleaseContextHandle(void* hcontext) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetA(void* preplaceset, uint32_t options, void* hcontext, void* pextrainfo, void* preserved) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetUTF8(void* preplaceset, uint32_t options, void* hcontext, void* pextrainfo, void* preserved) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetW(void* preplaceset, uint32_t options, void* hcontext, void* pextrainfo, void* preserved) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowse(void* prequest, void* pcancel) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowseCancel(void* pcancelhandle) {
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

void* windowssysWindowsWin32NetworkmanagementDnsDnsServiceConstructInstance(void* pservicename, void* phostname, void* pip4, void* pip6, uint16_t wport, uint16_t wpriority, uint16_t wweight, uint32_t dwpropertiescount, void* keys, void* values) {
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

void* windowssysWindowsWin32NetworkmanagementDnsDnsServiceCopyInstance(void* porig) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsServiceDeRegister(void* prequest, void* pcancel) {
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

void windowssysWindowsWin32NetworkmanagementDnsDnsServiceFreeInstance(void* pinstance) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegister(void* prequest, void* pcancel) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegisterCancel(void* pcancelhandle) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolve(void* prequest, void* pcancel) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolveCancel(void* pcancelhandle) {
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

uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsSetApplicationSettings(uint32_t cservers, void* pservers, void* psettings) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsStartMulticastQuery(void* pqueryrequest, void* phandle) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsStopMulticastQuery(void* phandle) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameA(void* pszname, int32_t format) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameUtf8(void* pszname, int32_t format) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameW(void* pszname, int32_t format) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferUtf8(void* pdnsbuffer, void* pdwbuffersize, void* pszname, uint16_t wtype, uint16_t xid, int32_t frecursiondesired) {
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

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferW(void* pdnsbuffer, void* pdwbuffersize, void* pszname, uint16_t wtype, uint16_t xid, int32_t frecursiondesired) {
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

