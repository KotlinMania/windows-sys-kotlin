#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_webservicesondevices_wrapper.h"
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

void* windowssys_windows_win32_devices_webservicesondevices_WSDAllocateLinkedMemory(void* pparent, uint64_t cbsize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDAllocateLinkedMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pparent, cbsize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pparent;
    (void)cbsize;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_devices_webservicesondevices_WSDAttachLinkedMemory(void* pparent, void* pchild) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDAttachLinkedMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pparent, pchild);
        return;
    }
    errno = ENOSYS;
#else
    (void)pparent;
    (void)pchild;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost(void* pszlocalid, void* pcontext, void* ppdevicehost) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDeviceHost");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszlocalid, pcontext, ppdevicehost);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszlocalid;
    (void)pcontext;
    (void)ppdevicehost;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost2(void* pszlocalid, void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* ppdevicehost) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDeviceHost2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszlocalid, pcontext, pconfigparams, dwconfigparamcount, ppdevicehost);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszlocalid;
    (void)pcontext;
    (void)pconfigparams;
    (void)dwconfigparamcount;
    (void)ppdevicehost;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHostAdvanced(void* pszlocalid, void* pcontext, void* pphostaddresses, uint32_t dwhostaddresscount, void* ppdevicehost) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDeviceHostAdvanced");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszlocalid, pcontext, pphostaddresses, dwhostaddresscount, ppdevicehost);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszlocalid;
    (void)pcontext;
    (void)pphostaddresses;
    (void)dwhostaddresscount;
    (void)ppdevicehost;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy(void* pszdeviceid, void* pszlocalid, void* pcontext, void* ppdeviceproxy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDeviceProxy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceid, pszlocalid, pcontext, ppdeviceproxy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszdeviceid;
    (void)pszlocalid;
    (void)pcontext;
    (void)ppdeviceproxy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy2(void* pszdeviceid, void* pszlocalid, void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* ppdeviceproxy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDeviceProxy2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceid, pszlocalid, pcontext, pconfigparams, dwconfigparamcount, ppdeviceproxy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszdeviceid;
    (void)pszlocalid;
    (void)pcontext;
    (void)pconfigparams;
    (void)dwconfigparamcount;
    (void)ppdeviceproxy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxyAdvanced(void* pszdeviceid, void* pdeviceaddress, void* pszlocalid, void* pcontext, void* ppdeviceproxy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDeviceProxyAdvanced");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceid, pdeviceaddress, pszlocalid, pcontext, ppdeviceproxy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszdeviceid;
    (void)pdeviceaddress;
    (void)pszlocalid;
    (void)pcontext;
    (void)ppdeviceproxy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider(void* pcontext, void* ppprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDiscoveryProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcontext, ppprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcontext;
    (void)ppprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider2(void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* ppprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDiscoveryProvider2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcontext, pconfigparams, dwconfigparamcount, ppprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcontext;
    (void)pconfigparams;
    (void)dwconfigparamcount;
    (void)ppprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher(void* pcontext, void* pppublisher) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDiscoveryPublisher");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcontext, pppublisher);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcontext;
    (void)pppublisher;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher2(void* pcontext, void* pconfigparams, uint32_t dwconfigparamcount, void* pppublisher) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDiscoveryPublisher2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcontext, pconfigparams, dwconfigparamcount, pppublisher);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcontext;
    (void)pconfigparams;
    (void)dwconfigparamcount;
    (void)pppublisher;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpAddress(void* ppaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateHttpAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppaddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpMessageParameters(void* pptxparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateHttpMessageParameters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pptxparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pptxparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateOutboundAttachment(void* ppattachment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateOutboundAttachment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppattachment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppattachment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpAddress(void* ppaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateUdpAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppaddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpMessageParameters(void* pptxparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateUdpMessageParameters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pptxparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pptxparams;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_webservicesondevices_WSDDetachLinkedMemory(void* pvoid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDDetachLinkedMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pvoid);
        return;
    }
    errno = ENOSYS;
#else
    (void)pvoid;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_webservicesondevices_WSDFreeLinkedMemory(void* pvoid) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDFreeLinkedMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pvoid);
        return;
    }
    errno = ENOSYS;
#else
    (void)pvoid;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFault(void* pszcode, void* pszsubcode, void* pszreason, void* pszdetail, void* pcontext, void* ppfault) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDGenerateFault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszcode, pszsubcode, pszreason, pszdetail, pcontext, ppfault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszcode;
    (void)pszsubcode;
    (void)pszreason;
    (void)pszdetail;
    (void)pcontext;
    (void)ppfault;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFaultEx(void* pcode, void* psubcode, void* preasons, void* pszdetail, void* ppfault) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDGenerateFaultEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcode, psubcode, preasons, pszdetail, ppfault);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcode;
    (void)psubcode;
    (void)preasons;
    (void)pszdetail;
    (void)ppfault;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDGetConfigurationOption(uint32_t dwoption, void* pvoid, uint32_t cboutbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDGetConfigurationOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwoption, pvoid, cboutbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwoption;
    (void)pvoid;
    (void)cboutbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDSetConfigurationOption(uint32_t dwoption, void* pvoid, uint32_t cbinbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDSetConfigurationOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwoption, pvoid, cbinbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwoption;
    (void)pvoid;
    (void)cbinbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDUriDecode(void* source, uint32_t cchsource, void* destout, void* cchdestout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDUriDecode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(source, cchsource, destout, cchdestout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)source;
    (void)cchsource;
    (void)destout;
    (void)cchdestout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDUriEncode(void* source, uint32_t cchsource, void* destout, void* cchdestout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDUriEncode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(source, cchsource, destout, cchdestout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)source;
    (void)cchsource;
    (void)destout;
    (void)cchdestout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddChild(void* pparent, void* pchild) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDXMLAddChild");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pparent, pchild);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pparent;
    (void)pchild;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddSibling(void* pfirst, void* psecond) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDXMLAddSibling");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfirst, psecond);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfirst;
    (void)psecond;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDXMLBuildAnyForSingleElement(void* pelementname, void* psztext, void* ppany) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDXMLBuildAnyForSingleElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pelementname, psztext, ppany);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pelementname;
    (void)psztext;
    (void)ppany;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDXMLCleanupElement(void* pany) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDXMLCleanupElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pany);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pany;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDXMLCreateContext(void* ppcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDXMLCreateContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetNameFromBuiltinNamespace(void* psznamespace, void* pszname, void* ppname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDXMLGetNameFromBuiltinNamespace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psznamespace, pszname, ppname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psznamespace;
    (void)pszname;
    (void)ppname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetValueFromAny(void* psznamespace, void* pszname, void* pany, void* ppszvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDXMLGetValueFromAny");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psznamespace, pszname, pany, ppszvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psznamespace;
    (void)pszname;
    (void)pany;
    (void)ppszvalue;
    errno = ENOSYS;
    return -1;
#endif
}

