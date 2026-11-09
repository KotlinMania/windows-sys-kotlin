#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_wifi_wrapper.h"
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

uint32_t windowssys_windows_win32_networkmanagement_wifi_WFDCancelOpenSession(void* hsessionhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WFDCancelOpenSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsessionhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsessionhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WFDCloseHandle(void* hclienthandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WFDCloseHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WFDCloseSession(void* hsessionhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WFDCloseSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsessionhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsessionhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WFDOpenHandle(uint32_t dwclientversion, void* pdwnegotiatedversion, void* phclienthandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WFDOpenHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwclientversion, pdwnegotiatedversion, phclienthandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwclientversion;
    (void)pdwnegotiatedversion;
    (void)phclienthandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WFDOpenLegacySession(void* hclienthandle, void* plegacymacaddress, void* phsessionhandle, void* pguidsessioninterface) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WFDOpenLegacySession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, plegacymacaddress, phsessionhandle, pguidsessioninterface);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)plegacymacaddress;
    (void)phsessionhandle;
    (void)pguidsessioninterface;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WFDStartOpenSession(void* hclienthandle, void* pdeviceaddress, void* pvcontext, void* pfncallback, void* phsessionhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WFDStartOpenSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pdeviceaddress, pvcontext, pfncallback, phsessionhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pdeviceaddress;
    (void)pvcontext;
    (void)pfncallback;
    (void)phsessionhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WFDUpdateDeviceVisibility(void* pdeviceaddress) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WFDUpdateDeviceVisibility");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdeviceaddress);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdeviceaddress;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networkmanagement_wifi_WlanAllocateMemory(uint32_t dwmemorysize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanAllocateMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmemorysize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwmemorysize;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanCloseHandle(void* hclienthandle, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanCloseHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanConnect(void* hclienthandle, void* pinterfaceguid, void* pconnectionparameters, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, pconnectionparameters, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)pconnectionparameters;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanConnect2(void* hclienthandle, void* pinterfaceguid, void* pconnectionparameters, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanConnect2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, pconnectionparameters, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)pconnectionparameters;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanDeleteProfile(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanDeleteProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, strprofilename, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)strprofilename;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanDeviceServiceCommand(void* hclienthandle, void* pinterfaceguid, void* pdeviceserviceguid, uint32_t dwopcode, uint32_t dwinbuffersize, void* pinbuffer, uint32_t dwoutbuffersize, void* poutbuffer, void* pdwbytesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanDeviceServiceCommand");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, pdeviceserviceguid, dwopcode, dwinbuffersize, pinbuffer, dwoutbuffersize, poutbuffer, pdwbytesreturned);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)pdeviceserviceguid;
    (void)dwopcode;
    (void)dwinbuffersize;
    (void)pinbuffer;
    (void)dwoutbuffersize;
    (void)poutbuffer;
    (void)pdwbytesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanDisconnect(void* hclienthandle, void* pinterfaceguid, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanDisconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanEnumInterfaces(void* hclienthandle, void* preserved, void* ppinterfacelist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanEnumInterfaces");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, preserved, ppinterfacelist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)preserved;
    (void)ppinterfacelist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanExtractPsdIEDataList(void* hclienthandle, uint32_t dwiedatasize, void* prawiedata, void* strformat, void* preserved, void* pppsdiedatalist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanExtractPsdIEDataList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, dwiedatasize, prawiedata, strformat, preserved, pppsdiedatalist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)dwiedatasize;
    (void)prawiedata;
    (void)strformat;
    (void)preserved;
    (void)pppsdiedatalist;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networkmanagement_wifi_WlanFreeMemory(void* pmemory) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanFreeMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pmemory);
        return;
    }
    errno = ENOSYS;
#else
    (void)pmemory;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetAvailableNetworkList(void* hclienthandle, void* pinterfaceguid, uint32_t dwflags, void* preserved, void* ppavailablenetworklist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetAvailableNetworkList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, dwflags, preserved, ppavailablenetworklist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)dwflags;
    (void)preserved;
    (void)ppavailablenetworklist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetAvailableNetworkList2(void* hclienthandle, void* pinterfaceguid, uint32_t dwflags, void* preserved, void* ppavailablenetworklist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetAvailableNetworkList2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, dwflags, preserved, ppavailablenetworklist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)dwflags;
    (void)preserved;
    (void)ppavailablenetworklist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetFilterList(void* hclienthandle, int32_t wlanfilterlisttype, void* preserved, void* ppnetworklist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetFilterList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, wlanfilterlisttype, preserved, ppnetworklist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)wlanfilterlisttype;
    (void)preserved;
    (void)ppnetworklist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetInterfaceCapability(void* hclienthandle, void* pinterfaceguid, void* preserved, void* ppcapability) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetInterfaceCapability");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, preserved, ppcapability);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)preserved;
    (void)ppcapability;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetNetworkBssList(void* hclienthandle, void* pinterfaceguid, void* pdot11ssid, int32_t dot11bsstype, int32_t bsecurityenabled, void* preserved, void* ppwlanbsslist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetNetworkBssList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, pdot11ssid, dot11bsstype, bsecurityenabled, preserved, ppwlanbsslist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)pdot11ssid;
    (void)dot11bsstype;
    (void)bsecurityenabled;
    (void)preserved;
    (void)ppwlanbsslist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetProfile(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* preserved, void* pstrprofilexml, void* pdwflags, void* pdwgrantedaccess) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, strprofilename, preserved, pstrprofilexml, pdwflags, pdwgrantedaccess);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)strprofilename;
    (void)preserved;
    (void)pstrprofilexml;
    (void)pdwflags;
    (void)pdwgrantedaccess;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetProfileCustomUserData(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* preserved, void* pdwdatasize, void* ppdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetProfileCustomUserData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, strprofilename, preserved, pdwdatasize, ppdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)strprofilename;
    (void)preserved;
    (void)pdwdatasize;
    (void)ppdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetProfileList(void* hclienthandle, void* pinterfaceguid, void* preserved, void* ppprofilelist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetProfileList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, preserved, ppprofilelist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)preserved;
    (void)ppprofilelist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetSecuritySettings(void* hclienthandle, int32_t securableobject, void* pvaluetype, void* pstrcurrentsddl, void* pdwgrantedaccess) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetSecuritySettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, securableobject, pvaluetype, pstrcurrentsddl, pdwgrantedaccess);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)securableobject;
    (void)pvaluetype;
    (void)pstrcurrentsddl;
    (void)pdwgrantedaccess;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetSupportedDeviceServices(void* hclienthandle, void* pinterfaceguid, void* ppdevsvcguidlist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetSupportedDeviceServices");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, ppdevsvcguidlist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)ppdevsvcguidlist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkForceStart(void* hclienthandle, void* pfailreason, void* pvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkForceStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pfailreason, pvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pfailreason;
    (void)pvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkForceStop(void* hclienthandle, void* pfailreason, void* pvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkForceStop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pfailreason, pvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pfailreason;
    (void)pvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkInitSettings(void* hclienthandle, void* pfailreason, void* pvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkInitSettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pfailreason, pvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pfailreason;
    (void)pvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQueryProperty(void* hclienthandle, int32_t opcode, void* pdwdatasize, void* ppvdata, void* pwlanopcodevaluetype, void* pvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkQueryProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, opcode, pdwdatasize, ppvdata, pwlanopcodevaluetype, pvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)opcode;
    (void)pdwdatasize;
    (void)ppvdata;
    (void)pwlanopcodevaluetype;
    (void)pvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQuerySecondaryKey(void* hclienthandle, void* pdwkeylength, void* ppuckeydata, void* pbispassphrase, void* pbpersistent, void* pfailreason, void* pvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkQuerySecondaryKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pdwkeylength, ppuckeydata, pbispassphrase, pbpersistent, pfailreason, pvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pdwkeylength;
    (void)ppuckeydata;
    (void)pbispassphrase;
    (void)pbpersistent;
    (void)pfailreason;
    (void)pvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQueryStatus(void* hclienthandle, void* ppwlanhostednetworkstatus, void* pvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkQueryStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, ppwlanhostednetworkstatus, pvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)ppwlanhostednetworkstatus;
    (void)pvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkRefreshSecuritySettings(void* hclienthandle, void* pfailreason, void* pvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkRefreshSecuritySettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pfailreason, pvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pfailreason;
    (void)pvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkSetProperty(void* hclienthandle, int32_t opcode, uint32_t dwdatasize, void* pvdata, void* pfailreason, void* pvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkSetProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, opcode, dwdatasize, pvdata, pfailreason, pvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)opcode;
    (void)dwdatasize;
    (void)pvdata;
    (void)pfailreason;
    (void)pvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkSetSecondaryKey(void* hclienthandle, uint32_t dwkeylength, void* puckeydata, int32_t bispassphrase, int32_t bpersistent, void* pfailreason, void* pvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkSetSecondaryKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, dwkeylength, puckeydata, bispassphrase, bpersistent, pfailreason, pvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)dwkeylength;
    (void)puckeydata;
    (void)bispassphrase;
    (void)bpersistent;
    (void)pfailreason;
    (void)pvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkStartUsing(void* hclienthandle, void* pfailreason, void* pvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkStartUsing");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pfailreason, pvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pfailreason;
    (void)pvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkStopUsing(void* hclienthandle, void* pfailreason, void* pvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkStopUsing");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pfailreason, pvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pfailreason;
    (void)pvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanIhvControl(void* hclienthandle, void* pinterfaceguid, int32_t type, uint32_t dwinbuffersize, void* pinbuffer, uint32_t dwoutbuffersize, void* poutbuffer, void* pdwbytesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanIhvControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, type, dwinbuffersize, pinbuffer, dwoutbuffersize, poutbuffer, pdwbytesreturned);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)type;
    (void)dwinbuffersize;
    (void)pinbuffer;
    (void)dwoutbuffersize;
    (void)poutbuffer;
    (void)pdwbytesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanOpenHandle(uint32_t dwclientversion, void* preserved, void* pdwnegotiatedversion, void* phclienthandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanOpenHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwclientversion, preserved, pdwnegotiatedversion, phclienthandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwclientversion;
    (void)preserved;
    (void)pdwnegotiatedversion;
    (void)phclienthandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanQueryAutoConfigParameter(void* hclienthandle, int32_t opcode, void* preserved, void* pdwdatasize, void* ppdata, void* pwlanopcodevaluetype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanQueryAutoConfigParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, opcode, preserved, pdwdatasize, ppdata, pwlanopcodevaluetype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)opcode;
    (void)preserved;
    (void)pdwdatasize;
    (void)ppdata;
    (void)pwlanopcodevaluetype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanQueryInterface(void* hclienthandle, void* pinterfaceguid, int32_t opcode, void* preserved, void* pdwdatasize, void* ppdata, void* pwlanopcodevaluetype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanQueryInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, opcode, preserved, pdwdatasize, ppdata, pwlanopcodevaluetype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)opcode;
    (void)preserved;
    (void)pdwdatasize;
    (void)ppdata;
    (void)pwlanopcodevaluetype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanReasonCodeToString(uint32_t dwreasoncode, uint32_t dwbuffersize, void* pstringbuffer, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanReasonCodeToString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwreasoncode, dwbuffersize, pstringbuffer, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwreasoncode;
    (void)dwbuffersize;
    (void)pstringbuffer;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanRegisterDeviceServiceNotification(void* hclienthandle, void* pdevsvcguidlist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanRegisterDeviceServiceNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pdevsvcguidlist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pdevsvcguidlist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanRegisterNotification(void* hclienthandle, uint32_t dwnotifsource, int32_t bignoreduplicate, void* funccallback, void* pcallbackcontext, void* preserved, void* pdwprevnotifsource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanRegisterNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, dwnotifsource, bignoreduplicate, funccallback, pcallbackcontext, preserved, pdwprevnotifsource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)dwnotifsource;
    (void)bignoreduplicate;
    (void)funccallback;
    (void)pcallbackcontext;
    (void)preserved;
    (void)pdwprevnotifsource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanRegisterVirtualStationNotification(void* hclienthandle, int32_t bregister, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanRegisterVirtualStationNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, bregister, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)bregister;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanRenameProfile(void* hclienthandle, void* pinterfaceguid, void* stroldprofilename, void* strnewprofilename, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanRenameProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, stroldprofilename, strnewprofilename, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)stroldprofilename;
    (void)strnewprofilename;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSaveTemporaryProfile(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* stralluserprofilesecurity, uint32_t dwflags, int32_t boverwrite, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSaveTemporaryProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, strprofilename, stralluserprofilesecurity, dwflags, boverwrite, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)strprofilename;
    (void)stralluserprofilesecurity;
    (void)dwflags;
    (void)boverwrite;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanScan(void* hclienthandle, void* pinterfaceguid, void* pdot11ssid, void* piedata, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanScan");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, pdot11ssid, piedata, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)pdot11ssid;
    (void)piedata;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetAutoConfigParameter(void* hclienthandle, int32_t opcode, uint32_t dwdatasize, void* pdata, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetAutoConfigParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, opcode, dwdatasize, pdata, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)opcode;
    (void)dwdatasize;
    (void)pdata;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetFilterList(void* hclienthandle, int32_t wlanfilterlisttype, void* pnetworklist, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetFilterList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, wlanfilterlisttype, pnetworklist, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)wlanfilterlisttype;
    (void)pnetworklist;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetInterface(void* hclienthandle, void* pinterfaceguid, int32_t opcode, uint32_t dwdatasize, void* pdata, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, opcode, dwdatasize, pdata, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)opcode;
    (void)dwdatasize;
    (void)pdata;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetProfile(void* hclienthandle, void* pinterfaceguid, uint32_t dwflags, void* strprofilexml, void* stralluserprofilesecurity, int32_t boverwrite, void* preserved, void* pdwreasoncode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, dwflags, strprofilexml, stralluserprofilesecurity, boverwrite, preserved, pdwreasoncode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)dwflags;
    (void)strprofilexml;
    (void)stralluserprofilesecurity;
    (void)boverwrite;
    (void)preserved;
    (void)pdwreasoncode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileCustomUserData(void* hclienthandle, void* pinterfaceguid, void* strprofilename, uint32_t dwdatasize, void* pdata, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetProfileCustomUserData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, strprofilename, dwdatasize, pdata, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)strprofilename;
    (void)dwdatasize;
    (void)pdata;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileEapXmlUserData(void* hclienthandle, void* pinterfaceguid, void* strprofilename, uint32_t dwflags, void* streapxmluserdata, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetProfileEapXmlUserData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, strprofilename, dwflags, streapxmluserdata, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)strprofilename;
    (void)dwflags;
    (void)streapxmluserdata;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileList(void* hclienthandle, void* pinterfaceguid, uint32_t dwitems, void* strprofilenames, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetProfileList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, dwitems, strprofilenames, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)dwitems;
    (void)strprofilenames;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetProfilePosition(void* hclienthandle, void* pinterfaceguid, void* strprofilename, uint32_t dwposition, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetProfilePosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, pinterfaceguid, strprofilename, dwposition, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)strprofilename;
    (void)dwposition;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetPsdIEDataList(void* hclienthandle, void* strformat, void* ppsdiedatalist, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetPsdIEDataList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, strformat, ppsdiedatalist, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)strformat;
    (void)ppsdiedatalist;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetSecuritySettings(void* hclienthandle, int32_t securableobject, void* strmodifiedsddl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetSecuritySettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclienthandle, securableobject, strmodifiedsddl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclienthandle;
    (void)securableobject;
    (void)strmodifiedsddl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanUIEditProfile(uint32_t dwclientversion, void* wstrprofilename, void* pinterfaceguid, void* hwnd, int32_t wlstartpage, void* preserved, void* pwlanreasoncode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanUIEditProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwclientversion, wstrprofilename, pinterfaceguid, hwnd, wlstartpage, preserved, pwlanreasoncode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwclientversion;
    (void)wstrprofilename;
    (void)pinterfaceguid;
    (void)hwnd;
    (void)wlstartpage;
    (void)preserved;
    (void)pwlanreasoncode;
    errno = ENOSYS;
    return 0;
#endif
}

