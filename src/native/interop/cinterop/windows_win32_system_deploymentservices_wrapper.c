#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_deploymentservices_wrapper.h"
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

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeAsyncRecvDone(void* hclientrequest, uint32_t action) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeAsyncRecvDone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclientrequest, action);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclientrequest;
    (void)action;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOption(void* preplypacket, uint32_t umaxreplypacketlen, void* pureplypacketlen, uint8_t boption, uint8_t boptionlen, void* pvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpAppendOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(preplypacket, umaxreplypacketlen, pureplypacketlen, boption, boptionlen, pvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)preplypacket;
    (void)umaxreplypacketlen;
    (void)pureplypacketlen;
    (void)boption;
    (void)boptionlen;
    (void)pvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOptionRaw(void* preplypacket, uint32_t umaxreplypacketlen, void* pureplypacketlen, uint16_t ubufferlen, void* pbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpAppendOptionRaw");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(preplypacket, umaxreplypacketlen, pureplypacketlen, ubufferlen, pbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)preplypacket;
    (void)umaxreplypacketlen;
    (void)pureplypacketlen;
    (void)ubufferlen;
    (void)pbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetOptionValue(void* ppacket, uint32_t upacketlen, uint32_t uinstance, uint8_t boption, void* pboptionlen, void* ppoptionvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpGetOptionValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppacket, upacketlen, uinstance, boption, pboptionlen, ppoptionvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)uinstance;
    (void)boption;
    (void)pboptionlen;
    (void)ppoptionvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetVendorOptionValue(void* ppacket, uint32_t upacketlen, uint8_t boption, uint32_t uinstance, void* pboptionlen, void* ppoptionvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpGetVendorOptionValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppacket, upacketlen, boption, uinstance, pboptionlen, ppoptionvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)boption;
    (void)uinstance;
    (void)pboptionlen;
    (void)ppoptionvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpInitialize(void* precvpacket, uint32_t urecvpacketlen, void* preplypacket, uint32_t umaxreplypacketlen, void* pureplypacketlen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(precvpacket, urecvpacketlen, preplypacket, umaxreplypacketlen, pureplypacketlen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)precvpacket;
    (void)urecvpacketlen;
    (void)preplypacket;
    (void)umaxreplypacketlen;
    (void)pureplypacketlen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpIsValid(void* ppacket, uint32_t upacketlen, int32_t brequestpacket, void* pbpxeoptionpresent) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpIsValid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppacket, upacketlen, brequestpacket, pbpxeoptionpresent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)brequestpacket;
    (void)pbpxeoptionpresent;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOption(void* preply, uint32_t cbreply, void* pcbreplyused, uint16_t woptiontype, uint16_t cboption, void* poption) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6AppendOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(preply, cbreply, pcbreplyused, woptiontype, cboption, poption);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)preply;
    (void)cbreply;
    (void)pcbreplyused;
    (void)woptiontype;
    (void)cboption;
    (void)poption;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOptionRaw(void* preply, uint32_t cbreply, void* pcbreplyused, uint16_t cbbuffer, void* pbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6AppendOptionRaw");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(preply, cbreply, pcbreplyused, cbbuffer, pbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)preply;
    (void)cbreply;
    (void)pcbreplyused;
    (void)cbbuffer;
    (void)pbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6CreateRelayRepl(void* prelaymessages, uint32_t nrelaymessages, void* pinnerpacket, uint32_t cbinnerpacket, void* preplybuffer, uint32_t cbreplybuffer, void* pcbreplybuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6CreateRelayRepl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prelaymessages, nrelaymessages, pinnerpacket, cbinnerpacket, preplybuffer, cbreplybuffer, pcbreplybuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prelaymessages;
    (void)nrelaymessages;
    (void)pinnerpacket;
    (void)cbinnerpacket;
    (void)preplybuffer;
    (void)cbreplybuffer;
    (void)pcbreplybuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetOptionValue(void* ppacket, uint32_t upacketlen, uint32_t uinstance, uint16_t woption, void* pwoptionlen, void* ppoptionvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6GetOptionValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppacket, upacketlen, uinstance, woption, pwoptionlen, ppoptionvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)uinstance;
    (void)woption;
    (void)pwoptionlen;
    (void)ppoptionvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetVendorOptionValue(void* ppacket, uint32_t upacketlen, uint32_t dwenterprisenumber, uint16_t woption, uint32_t uinstance, void* pwoptionlen, void* ppoptionvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint16_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6GetVendorOptionValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppacket, upacketlen, dwenterprisenumber, woption, uinstance, pwoptionlen, ppoptionvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)dwenterprisenumber;
    (void)woption;
    (void)uinstance;
    (void)pwoptionlen;
    (void)ppoptionvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6Initialize(void* prequest, uint32_t cbrequest, void* preply, uint32_t cbreply, void* pcbreplyused) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6Initialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prequest, cbrequest, preply, cbreply, pcbreplyused);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prequest;
    (void)cbrequest;
    (void)preply;
    (void)cbreply;
    (void)pcbreplyused;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6IsValid(void* ppacket, uint32_t upacketlen, int32_t brequestpacket, void* pbpxeoptionpresent) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6IsValid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppacket, upacketlen, brequestpacket, pbpxeoptionpresent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)brequestpacket;
    (void)pbpxeoptionpresent;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6ParseRelayForw(void* prelayforwpacket, uint32_t urelayforwpacketlen, void* prelaymessages, uint32_t nrelaymessages, void* pnrelaymessages, void* ppinnerpacket, void* pcbinnerpacket) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6ParseRelayForw");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prelayforwpacket, urelayforwpacketlen, prelaymessages, nrelaymessages, pnrelaymessages, ppinnerpacket, pcbinnerpacket);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prelayforwpacket;
    (void)urelayforwpacketlen;
    (void)prelaymessages;
    (void)nrelaymessages;
    (void)pnrelaymessages;
    (void)ppinnerpacket;
    (void)pcbinnerpacket;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfo(uint32_t uinfotype, void* pbuffer, uint32_t ubufferlen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeGetServerInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uinfotype, pbuffer, ubufferlen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uinfotype;
    (void)pbuffer;
    (void)ubufferlen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfoEx(uint32_t uinfotype, void* pbuffer, uint32_t ubufferlen, void* pubufferused) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeGetServerInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uinfotype, pbuffer, ubufferlen, pubufferused);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uinfotype;
    (void)pbuffer;
    (void)ubufferlen;
    (void)pubufferused;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemDeploymentservicesPxePacketAllocate(void* hprovider, void* hclientrequest, uint32_t usize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxePacketAllocate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, hclientrequest, usize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprovider;
    (void)hclientrequest;
    (void)usize;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxePacketFree(void* hprovider, void* hclientrequest, void* ppacket) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxePacketFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, hclientrequest, ppacket);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprovider;
    (void)hclientrequest;
    (void)ppacket;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumClose(void* henum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderEnumClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)henum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumFirst(void* phenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderEnumFirst");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumNext(void* henum, void* ppprovider) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderEnumNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henum, ppprovider);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)henum;
    (void)ppprovider;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderFreeInfo(void* pprovider) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderFreeInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprovider);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pprovider;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderQueryIndex(void* pszprovidername, void* puindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderQueryIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovidername, puindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszprovidername;
    (void)puindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderRegister(void* pszprovidername, void* pszmodulepath, uint32_t arg2Index, int32_t biscritical, void* phproviderkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderRegister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovidername, pszmodulepath, arg2Index, biscritical, phproviderkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszprovidername;
    (void)pszmodulepath;
    (void)arg2Index;
    (void)biscritical;
    (void)phproviderkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderSetAttribute(void* hprovider, uint32_t attribute, void* pparameterbuffer, uint32_t uparamlen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderSetAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, attribute, pparameterbuffer, uparamlen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprovider;
    (void)attribute;
    (void)pparameterbuffer;
    (void)uparamlen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeProviderUnRegister(void* pszprovidername) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderUnRegister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprovidername);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszprovidername;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeRegisterCallback(void* hprovider, uint32_t callbacktype, void* pcallbackfunction, void* pcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeRegisterCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, callbacktype, pcallbackfunction, pcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprovider;
    (void)callbacktype;
    (void)pcallbackfunction;
    (void)pcontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeSendReply(void* hclientrequest, void* ppacket, uint32_t upacketlen, void* paddress) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeSendReply");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclientrequest, ppacket, upacketlen, paddress);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclientrequest;
    (void)ppacket;
    (void)upacketlen;
    (void)paddress;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeTrace(void* hprovider, uint32_t severity, void* pszformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(void*, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeTrace");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(hprovider, severity, pszformat);
            case 1: return km_fn_ptr(hprovider, severity, pszformat, (intptr_t)km_va0);
            case 2: return km_fn_ptr(hprovider, severity, pszformat, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(hprovider, severity, pszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(hprovider, severity, pszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprovider;
    (void)severity;
    (void)pszformat;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesPxeTraceV(void* hprovider, uint32_t severity, void* pszformat, void* params) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeTraceV");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, severity, pszformat, params);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprovider;
    (void)severity;
    (void)pszformat;
    (void)params;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsBpAddOption(void* hhandle, uint32_t uoption, uint32_t uvaluelen, void* pvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsBpAddOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhandle, uoption, uvaluelen, pvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hhandle;
    (void)uoption;
    (void)uvaluelen;
    (void)pvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsBpCloseHandle(void* hhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsBpCloseHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsBpGetOptionBuffer(void* hhandle, uint32_t ubufferlen, void* pbuffer, void* pubytes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsBpGetOptionBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhandle, ubufferlen, pbuffer, pubytes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hhandle;
    (void)ubufferlen;
    (void)pbuffer;
    (void)pubytes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsBpInitialize(uint8_t bpackettype, void* phhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsBpInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bpackettype, phhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bpackettype;
    (void)phhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitialize(void* ppacket, uint32_t upacketlen, void* pbpackettype, void* phhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsBpParseInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppacket, upacketlen, pbpackettype, phhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)pbpackettype;
    (void)phhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitializev6(void* ppacket, uint32_t upacketlen, void* pbpackettype, void* phhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsBpParseInitializev6");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppacket, upacketlen, pbpackettype, phhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)pbpackettype;
    (void)phhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsBpQueryOption(void* hhandle, uint32_t uoption, uint32_t uvaluelen, void* pvalue, void* pubytes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsBpQueryOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhandle, uoption, uvaluelen, pvalue, pubytes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hhandle;
    (void)uoption;
    (void)uvaluelen;
    (void)pvalue;
    (void)pubytes;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliAuthorizeSession(void* hsession, void* pcred) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliAuthorizeSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, pcred);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)pcred;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliCancelTransfer(void* htransfer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliCancelTransfer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htransfer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htransfer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliClose(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliClose");
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

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliCreateSession(void* pwszserver, void* pcred, void* phsession) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliCreateSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszserver, pcred, phsession);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszserver;
    (void)pcred;
    (void)phsession;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliFindFirstImage(void* hsession, void* phfindhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliFindFirstImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, phfindhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)phfindhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliFindNextImage(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliFindNextImage");
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

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliFreeStringArray(void* ppwszarray, uint32_t ulcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliFreeStringArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppwszarray, ulcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppwszarray;
    (void)ulcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetDriverQueryXml(void* pwszwindirpath, void* ppwszdriverquery) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetDriverQueryXml");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszwindirpath, ppwszdriverquery);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszwindirpath;
    (void)ppwszdriverquery;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetEnumerationFlags(void* handle, void* pdwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetEnumerationFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, pdwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)pdwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageArchitecture(void* hifh, void* pdwvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageArchitecture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, pdwvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)pdwvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageDescription(void* hifh, void* ppwszvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageDescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, ppwszvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageFiles(void* hifh, void* pppwszfiles, void* pdwcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageFiles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, pppwszfiles, pdwcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)pppwszfiles;
    (void)pdwcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageGroup(void* hifh, void* ppwszvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, ppwszvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHalName(void* hifh, void* ppwszvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageHalName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, ppwszvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromFindHandle(void* findhandle, void* phimagehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageHandleFromFindHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(findhandle, phimagehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)findhandle;
    (void)phimagehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromTransferHandle(void* htransfer, void* phimagehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageHandleFromTransferHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htransfer, phimagehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htransfer;
    (void)phimagehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageIndex(void* hifh, void* pdwvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, pdwvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)pdwvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguage(void* hifh, void* ppwszvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageLanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, ppwszvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguages(void* hifh, void* pppszvalues, void* pdwnumvalues) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageLanguages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, pppszvalues, pdwnumvalues);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)pppszvalues;
    (void)pdwnumvalues;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLastModifiedTime(void* hifh, void* ppsystimevalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageLastModifiedTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, ppsystimevalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)ppsystimevalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageName(void* hifh, void* ppwszvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, ppwszvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageNamespace(void* hifh, void* ppwszvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageNamespace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, ppwszvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageParameter(void* hifh, int32_t paramtype, void* presponse, uint32_t uresponselen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, paramtype, presponse, uresponselen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)paramtype;
    (void)presponse;
    (void)uresponselen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImagePath(void* hifh, void* ppwszvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImagePath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, ppwszvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageSize(void* hifh, void* pullvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, pullvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)pullvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageType(void* hifh, void* pimagetype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, pimagetype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)pimagetype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageVersion(void* hifh, void* ppwszvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, ppwszvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliGetTransferSize(void* hifh, void* pullvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetTransferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hifh, pullvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hifh;
    (void)pullvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliInitializeLog(void* hsession, uint32_t ulclientarchitecture, void* pwszclientid, void* pwszclientaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliInitializeLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, ulclientarchitecture, pwszclientid, pwszclientaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)ulclientarchitecture;
    (void)pwszclientid;
    (void)pwszclientaddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliLog(void* hsession, uint32_t ulloglevel, uint32_t ulmessagecode, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, uint32_t, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliLog");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(hsession, ulloglevel, ulmessagecode);
            case 1: return km_fn_ptr(hsession, ulloglevel, ulmessagecode, (intptr_t)km_va0);
            case 2: return km_fn_ptr(hsession, ulloglevel, ulmessagecode, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(hsession, ulloglevel, ulmessagecode, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(hsession, ulloglevel, ulmessagecode, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)ulloglevel;
    (void)ulmessagecode;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackages(void* himage, void* ppwszservername, void* pppwszdriverpackages, void* pulcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliObtainDriverPackages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himage, ppwszservername, pppwszdriverpackages, pulcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himage;
    (void)ppwszservername;
    (void)pppwszdriverpackages;
    (void)pulcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackagesEx(void* hsession, void* pwszmachineinfo, void* ppwszservername, void* pppwszdriverpackages, void* pulcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliObtainDriverPackagesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, pwszmachineinfo, ppwszservername, pppwszdriverpackages, pulcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)pwszmachineinfo;
    (void)ppwszservername;
    (void)pppwszdriverpackages;
    (void)pulcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliRegisterTrace(void* pfn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliRegisterTrace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfn;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize(uint32_t ulsizeinbytes) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliSetTransferBufferSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ulsizeinbytes);
        return;
    }
    errno = ENOSYS;
#else
    (void)ulsizeinbytes;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferFile(void* pwszserver, void* pwsznamespace, void* pwszremotefilepath, void* pwszlocalfilepath, uint32_t dwflags, uint32_t dwreserved, void* pfnwdsclicallback, void* pvuserdata, void* phtransfer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliTransferFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszserver, pwsznamespace, pwszremotefilepath, pwszlocalfilepath, dwflags, dwreserved, pfnwdsclicallback, pvuserdata, phtransfer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszserver;
    (void)pwsznamespace;
    (void)pwszremotefilepath;
    (void)pwszlocalfilepath;
    (void)dwflags;
    (void)dwreserved;
    (void)pfnwdsclicallback;
    (void)pvuserdata;
    (void)phtransfer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferImage(void* himage, void* pwszlocalpath, uint32_t dwflags, uint32_t dwreserved, void* pfnwdsclicallback, void* pvuserdata, void* phtransfer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliTransferImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(himage, pwszlocalpath, dwflags, dwreserved, pfnwdsclicallback, pvuserdata, phtransfer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)himage;
    (void)pwszlocalpath;
    (void)dwflags;
    (void)dwreserved;
    (void)pfnwdsclicallback;
    (void)pvuserdata;
    (void)phtransfer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsCliWaitForTransfer(void* htransfer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliWaitForTransfer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htransfer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htransfer;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientAddRefBuffer(void* pvbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientAddRefBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pvbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSession(void* hsessionkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientCancelSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsessionkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsessionkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSessionEx(void* hsessionkey, uint32_t dwerrorcode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientCancelSessionEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsessionkey, dwerrorcode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsessionkey;
    (void)dwerrorcode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCloseSession(void* hsessionkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientCloseSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsessionkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsessionkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCompleteReceive(void* hsessionkey, uint32_t ulsize, void* pulloffset) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientCompleteReceive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsessionkey, ulsize, pulloffset);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsessionkey;
    (void)ulsize;
    (void)pulloffset;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientInitialize");
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

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitializeSession(void* psessionrequest, void* pcallerdata, void* hsessionkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientInitializeSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psessionrequest, pcallerdata, hsessionkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)psessionrequest;
    (void)pcallerdata;
    (void)hsessionkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientQueryStatus(void* hsessionkey, void* pustatus, void* puerrorcode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientQueryStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsessionkey, pustatus, puerrorcode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsessionkey;
    (void)pustatus;
    (void)puerrorcode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientRegisterCallback(void* hsessionkey, int32_t callbackid, void* pfncallback) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientRegisterCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsessionkey, callbackid, pfncallback);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsessionkey;
    (void)callbackid;
    (void)pfncallback;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientReleaseBuffer(void* pvbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientReleaseBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pvbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientShutdown");
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

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientStartSession(void* hsessionkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientStartSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsessionkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsessionkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientWaitForCompletion(void* hsessionkey, uint32_t utimeout) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientWaitForCompletion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsessionkey, utimeout);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsessionkey;
    (void)utimeout;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerAllocateBuffer(void* hprovider, uint32_t ulbuffersize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportServerAllocateBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, ulbuffersize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprovider;
    (void)ulbuffersize;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerCompleteRead(void* hprovider, uint32_t ulbytesread, void* pvuserdata, int32_t hreadresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportServerCompleteRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, ulbytesread, pvuserdata, hreadresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)ulbytesread;
    (void)pvuserdata;
    (void)hreadresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerFreeBuffer(void* hprovider, void* pvbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportServerFreeBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, pvbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)pvbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerRegisterCallback(void* hprovider, int32_t callbackid, void* pfncallback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportServerRegisterCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, callbackid, pfncallback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)callbackid;
    (void)pfncallback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTrace(void* hprovider, uint32_t severity, void* pwszformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportServerTrace");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(hprovider, severity, pwszformat);
            case 1: return km_fn_ptr(hprovider, severity, pwszformat, (intptr_t)km_va0);
            case 2: return km_fn_ptr(hprovider, severity, pwszformat, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(hprovider, severity, pwszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(hprovider, severity, pwszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)severity;
    (void)pwszformat;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTraceV(void* hprovider, uint32_t severity, void* pwszformat, void* params) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportServerTraceV");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, severity, pwszformat, params);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)severity;
    (void)pwszformat;
    (void)params;
    errno = ENOSYS;
    return -1;
#endif
}

