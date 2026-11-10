#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_graphics_printing_printticket_wrapper.h"
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

int32_t windowssys_windows_win32_graphics_printing_printticket_pTCloseProvider(void* hprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTCloseProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_printticket_pTConvertDevModeToPrintTicket(void* hprovider, uint32_t cbdevmode, void* pdevmode, int32_t scope, void* pprintticket) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTConvertDevModeToPrintTicket");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, cbdevmode, pdevmode, scope, pprintticket);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)cbdevmode;
    (void)pdevmode;
    (void)scope;
    (void)pprintticket;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_printticket_pTConvertPrintTicketToDevMode(void* hprovider, void* pprintticket, int32_t basedevmodetype, int32_t scope, void* pcbdevmode, void* ppdevmode, void* pbstrerrormessage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTConvertPrintTicketToDevMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, pprintticket, basedevmodetype, scope, pcbdevmode, ppdevmode, pbstrerrormessage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)pprintticket;
    (void)basedevmodetype;
    (void)scope;
    (void)pcbdevmode;
    (void)ppdevmode;
    (void)pbstrerrormessage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_printticket_pTGetPrintCapabilities(void* hprovider, void* pprintticket, void* pcapabilities, void* pbstrerrormessage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTGetPrintCapabilities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, pprintticket, pcapabilities, pbstrerrormessage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)pprintticket;
    (void)pcapabilities;
    (void)pbstrerrormessage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceCapabilities(void* hprovider, void* pprintticket, void* pdevicecapabilities, void* pbstrerrormessage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTGetPrintDeviceCapabilities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, pprintticket, pdevicecapabilities, pbstrerrormessage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)pprintticket;
    (void)pdevicecapabilities;
    (void)pbstrerrormessage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceResources(void* hprovider, void* pszlocalename, void* pprintticket, void* pdeviceresources, void* pbstrerrormessage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTGetPrintDeviceResources");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, pszlocalename, pprintticket, pdeviceresources, pbstrerrormessage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)pszlocalename;
    (void)pprintticket;
    (void)pdeviceresources;
    (void)pbstrerrormessage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_printticket_pTMergeAndValidatePrintTicket(void* hprovider, void* pbaseticket, void* pdeltaticket, int32_t scope, void* presultticket, void* pbstrerrormessage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTMergeAndValidatePrintTicket");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprovider, pbaseticket, pdeltaticket, scope, presultticket, pbstrerrormessage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprovider;
    (void)pbaseticket;
    (void)pdeltaticket;
    (void)scope;
    (void)presultticket;
    (void)pbstrerrormessage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_printticket_pTOpenProvider(void* pszprintername, uint32_t dwversion, void* phprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTOpenProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprintername, dwversion, phprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprintername;
    (void)dwversion;
    (void)phprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_printticket_pTOpenProviderEx(void* pszprintername, uint32_t dwmaxversion, uint32_t dwprefversion, void* phprovider, void* pusedversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTOpenProviderEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprintername, dwmaxversion, dwprefversion, phprovider, pusedversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprintername;
    (void)dwmaxversion;
    (void)dwprefversion;
    (void)phprovider;
    (void)pusedversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_printticket_pTQuerySchemaVersionSupport(void* pszprintername, void* pmaxversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTQuerySchemaVersionSupport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprintername, pmaxversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprintername;
    (void)pmaxversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_printing_printticket_pTReleaseMemory(void* pbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTReleaseMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

