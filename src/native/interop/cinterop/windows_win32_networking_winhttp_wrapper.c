#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networking_winhttp_wrapper.h"
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

int32_t windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeaders(void* hrequest, void* lpszheaders, uint32_t dwheaderslength, uint32_t dwmodifiers) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpAddRequestHeaders");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpszheaders, dwheaderslength, dwmodifiers);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)dwmodifiers;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeadersEx(void* hrequest, uint32_t dwmodifiers, uint64_t ullflags, uint64_t ullextra, uint32_t cheaders, void* pheaders) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpAddRequestHeadersEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, dwmodifiers, ullflags, ullextra, cheaders, pheaders);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrequest;
    (void)dwmodifiers;
    (void)ullflags;
    (void)ullextra;
    (void)cheaders;
    (void)pheaders;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpCheckPlatform(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpCheckPlatform");
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

int32_t windowssys_windows_win32_networking_winhttp_WinHttpCloseHandle(void* hinternet) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpCloseHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinternet;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_winhttp_WinHttpConnect(void* hsession, void* pswzservername, uint16_t nserverport, uint32_t dwreserved) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, pswzservername, nserverport, dwreserved);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hsession;
    (void)pswzservername;
    (void)nserverport;
    (void)dwreserved;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpCrackUrl(void* pwszurl, uint32_t dwurllength, uint32_t dwflags, void* lpurlcomponents) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpCrackUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszurl, dwurllength, dwflags, lpurlcomponents);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszurl;
    (void)dwurllength;
    (void)dwflags;
    (void)lpurlcomponents;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpCreateProxyResolver(void* hsession, void* phresolver) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpCreateProxyResolver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, phresolver);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsession;
    (void)phresolver;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpCreateUrl(void* lpurlcomponents, uint32_t dwflags, void* pwszurl, void* pdwurllength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpCreateUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpurlcomponents, dwflags, pwszurl, pdwurllength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpurlcomponents;
    (void)dwflags;
    (void)pwszurl;
    (void)pdwurllength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpDetectAutoProxyConfigUrl(uint32_t dwautodetectflags, void* ppwstrautoconfigurl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpDetectAutoProxyConfigUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwautodetectflags, ppwstrautoconfigurl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwautodetectflags;
    (void)ppwstrautoconfigurl;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResult(void* pproxyresult) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpFreeProxyResult");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pproxyresult);
        return;
    }
    errno = ENOSYS;
#else
    (void)pproxyresult;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResultEx(void* pproxyresultex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpFreeProxyResultEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pproxyresultex);
        return;
    }
    errno = ENOSYS;
#else
    (void)pproxyresultex;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettings(void* pwinhttpproxysettings) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpFreeProxySettings");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pwinhttpproxysettings);
        return;
    }
    errno = ENOSYS;
#else
    (void)pwinhttpproxysettings;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettingsEx(int32_t proxysettingstype, void* pproxysettingsex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpFreeProxySettingsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proxysettingstype, pproxysettingsex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)proxysettingstype;
    (void)pproxysettingsex;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networking_winhttp_WinHttpFreeQueryConnectionGroupResult(void* presult) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpFreeQueryConnectionGroupResult");
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

int32_t windowssys_windows_win32_networking_winhttp_WinHttpGetDefaultProxyConfiguration(void* pproxyinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetDefaultProxyConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pproxyinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pproxyinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpGetIEProxyConfigForCurrentUser(void* pproxyconfig) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetIEProxyConfigForCurrentUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pproxyconfig);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pproxyconfig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrl(void* hsession, void* lpcwszurl, void* pautoproxyoptions, void* pproxyinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxyForUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, lpcwszurl, pautoproxyoptions, pproxyinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)lpcwszurl;
    (void)pautoproxyoptions;
    (void)pproxyinfo;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx(void* hresolver, void* pcwszurl, void* pautoproxyoptions, uint64_t pcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxyForUrlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresolver, pcwszurl, pautoproxyoptions, pcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresolver;
    (void)pcwszurl;
    (void)pautoproxyoptions;
    (void)pcontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx2(void* hresolver, void* pcwszurl, void* pautoproxyoptions, uint32_t cbinterfaceselectioncontext, void* pinterfaceselectioncontext, uint64_t pcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxyForUrlEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresolver, pcwszurl, pautoproxyoptions, cbinterfaceselectioncontext, pinterfaceselectioncontext, pcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresolver;
    (void)pcwszurl;
    (void)pautoproxyoptions;
    (void)cbinterfaceselectioncontext;
    (void)pinterfaceselectioncontext;
    (void)pcontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResult(void* hresolver, void* pproxyresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxyResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresolver, pproxyresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresolver;
    (void)pproxyresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResultEx(void* hresolver, void* pproxyresultex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxyResultEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresolver, pproxyresultex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresolver;
    (void)pproxyresultex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsEx(void* hresolver, int32_t proxysettingstype, void* pproxysettingsparam, uint64_t pcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxySettingsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresolver, proxysettingstype, pproxysettingsparam, pcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresolver;
    (void)proxysettingstype;
    (void)pproxysettingsparam;
    (void)pcontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsResultEx(void* hresolver, void* pproxysettingsex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxySettingsResultEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresolver, pproxysettingsex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresolver;
    (void)pproxysettingsex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsVersion(void* hsession, void* pdwproxysettingsversion) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxySettingsVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, pdwproxysettingsversion);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsession;
    (void)pdwproxysettingsversion;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_winhttp_WinHttpOpen(void* pszagentw, uint32_t dwaccesstype, void* pszproxyw, void* pszproxybypassw, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszagentw, dwaccesstype, pszproxyw, pszproxybypassw, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszagentw;
    (void)dwaccesstype;
    (void)pszproxyw;
    (void)pszproxybypassw;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_winhttp_WinHttpOpenRequest(void* hconnect, void* pwszverb, void* pwszobjectname, void* pwszversion, void* pwszreferrer, void* ppwszaccepttypes, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpOpenRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, pwszverb, pwszobjectname, pwszversion, pwszreferrer, ppwszaccepttypes, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hconnect;
    (void)pwszverb;
    (void)pwszobjectname;
    (void)pwszversion;
    (void)pwszreferrer;
    (void)ppwszaccepttypes;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpQueryAuthSchemes(void* hrequest, void* lpdwsupportedschemes, void* lpdwfirstscheme, void* pdwauthtarget) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpQueryAuthSchemes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpdwsupportedschemes, lpdwfirstscheme, pdwauthtarget);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)lpdwsupportedschemes;
    (void)lpdwfirstscheme;
    (void)pdwauthtarget;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpQueryConnectionGroup(void* hinternet, void* pguidconnection, uint64_t ullflags, void* ppresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpQueryConnectionGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, pguidconnection, ullflags, ppresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinternet;
    (void)pguidconnection;
    (void)ullflags;
    (void)ppresult;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpQueryDataAvailable(void* hrequest, void* lpdwnumberofbytesavailable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpQueryDataAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpdwnumberofbytesavailable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)lpdwnumberofbytesavailable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpQueryHeaders(void* hrequest, uint32_t dwinfolevel, void* pwszname, void* lpbuffer, void* lpdwbufferlength, void* lpdwindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpQueryHeaders");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, dwinfolevel, pwszname, lpbuffer, lpdwbufferlength, lpdwindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)dwinfolevel;
    (void)pwszname;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    (void)lpdwindex;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpQueryHeadersEx(void* hrequest, uint32_t dwinfolevel, uint64_t ullflags, uint32_t uicodepage, void* pdwindex, void* pheadername, void* pbuffer, void* pdwbufferlength, void* ppheaders, void* pdwheaderscount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpQueryHeadersEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, dwinfolevel, ullflags, uicodepage, pdwindex, pheadername, pbuffer, pdwbufferlength, ppheaders, pdwheaderscount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrequest;
    (void)dwinfolevel;
    (void)ullflags;
    (void)uicodepage;
    (void)pdwindex;
    (void)pheadername;
    (void)pbuffer;
    (void)pdwbufferlength;
    (void)ppheaders;
    (void)pdwheaderscount;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpQueryOption(void* hinternet, uint32_t dwoption, void* lpbuffer, void* lpdwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpQueryOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, dwoption, lpbuffer, lpdwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpReadData(void* hrequest, void* lpbuffer, uint32_t dwnumberofbytestoread, void* lpdwnumberofbytesread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpReadData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpbuffer, dwnumberofbytestoread, lpdwnumberofbytesread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)lpbuffer;
    (void)dwnumberofbytestoread;
    (void)lpdwnumberofbytesread;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpReadDataEx(void* hrequest, void* lpbuffer, uint32_t dwnumberofbytestoread, void* lpdwnumberofbytesread, uint64_t ullflags, uint32_t cbproperty, void* pvproperty) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpReadDataEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpbuffer, dwnumberofbytestoread, lpdwnumberofbytesread, ullflags, cbproperty, pvproperty);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrequest;
    (void)lpbuffer;
    (void)dwnumberofbytestoread;
    (void)lpdwnumberofbytesread;
    (void)ullflags;
    (void)cbproperty;
    (void)pvproperty;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpReadProxySettings(void* hsession, void* pcwszconnectionname, int32_t ffallbacktodefaultsettings, int32_t fsetautodiscoverfordefaultsettings, void* pdwsettingsversion, void* pfdefaultsettingsarereturned, void* pwinhttpproxysettings) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpReadProxySettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, pcwszconnectionname, ffallbacktodefaultsettings, fsetautodiscoverfordefaultsettings, pdwsettingsversion, pfdefaultsettingsarereturned, pwinhttpproxysettings);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsession;
    (void)pcwszconnectionname;
    (void)ffallbacktodefaultsettings;
    (void)fsetautodiscoverfordefaultsettings;
    (void)pdwsettingsversion;
    (void)pfdefaultsettingsarereturned;
    (void)pwinhttpproxysettings;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpReceiveResponse(void* hrequest, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpReceiveResponse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpRegisterProxyChangeNotification(uint64_t ullflags, void* pfncallback, void* pvcontext, void* hregistration) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpRegisterProxyChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ullflags, pfncallback, pvcontext, hregistration);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ullflags;
    (void)pfncallback;
    (void)pvcontext;
    (void)hregistration;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpResetAutoProxy(void* hsession, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpResetAutoProxy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsession;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpSendRequest(void* hrequest, void* lpszheaders, uint32_t dwheaderslength, void* lpoptional, uint32_t dwoptionallength, uint32_t dwtotallength, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpSendRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpszheaders, dwheaderslength, lpoptional, dwoptionallength, dwtotallength, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)lpoptional;
    (void)dwoptionallength;
    (void)dwtotallength;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpSetCredentials(void* hrequest, uint32_t authtargets, uint32_t authscheme, void* pwszusername, void* pwszpassword, void* pauthparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpSetCredentials");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, authtargets, authscheme, pwszusername, pwszpassword, pauthparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)authtargets;
    (void)authscheme;
    (void)pwszusername;
    (void)pwszpassword;
    (void)pauthparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpSetDefaultProxyConfiguration(void* pproxyinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpSetDefaultProxyConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pproxyinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pproxyinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpSetOption(void* hinternet, uint32_t dwoption, void* lpbuffer, uint32_t dwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpSetOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, dwoption, lpbuffer, dwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)dwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpSetProxySettingsPerUser(int32_t fproxysettingsperuser) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpSetProxySettingsPerUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fproxysettingsperuser);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)fproxysettingsperuser;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_winhttp_WinHttpSetStatusCallback(void* hinternet, void* lpfninternetcallback, uint32_t dwnotificationflags, uint64_t dwreserved) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpSetStatusCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, lpfninternetcallback, dwnotificationflags, dwreserved);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinternet;
    (void)lpfninternetcallback;
    (void)dwnotificationflags;
    (void)dwreserved;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpSetTimeouts(void* hinternet, int32_t nresolvetimeout, int32_t nconnecttimeout, int32_t nsendtimeout, int32_t nreceivetimeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpSetTimeouts");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, nresolvetimeout, nconnecttimeout, nsendtimeout, nreceivetimeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinternet;
    (void)nresolvetimeout;
    (void)nconnecttimeout;
    (void)nsendtimeout;
    (void)nreceivetimeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpTimeFromSystemTime(void* pst, void* pwsztime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpTimeFromSystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pst, pwsztime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pst;
    (void)pwsztime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpTimeToSystemTime(void* pwsztime, void* pst) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpTimeToSystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwsztime, pst);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwsztime;
    (void)pst;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpUnregisterProxyChangeNotification(void* hregistration) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpUnregisterProxyChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hregistration);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hregistration;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpWebSocketClose(void* hwebsocket, uint16_t usstatus, void* pvreason, uint32_t dwreasonlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWebSocketClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, usstatus, pvreason, dwreasonlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwebsocket;
    (void)usstatus;
    (void)pvreason;
    (void)dwreasonlength;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_winhttp_WinHttpWebSocketCompleteUpgrade(void* hrequest, uint64_t pcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWebSocketCompleteUpgrade");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, pcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hrequest;
    (void)pcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpWebSocketQueryCloseStatus(void* hwebsocket, void* pusstatus, void* pvreason, uint32_t dwreasonlength, void* pdwreasonlengthconsumed) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWebSocketQueryCloseStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, pusstatus, pvreason, dwreasonlength, pdwreasonlengthconsumed);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwebsocket;
    (void)pusstatus;
    (void)pvreason;
    (void)dwreasonlength;
    (void)pdwreasonlengthconsumed;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpWebSocketReceive(void* hwebsocket, void* pvbuffer, uint32_t dwbufferlength, void* pdwbytesread, void* pebuffertype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWebSocketReceive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, pvbuffer, dwbufferlength, pdwbytesread, pebuffertype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwebsocket;
    (void)pvbuffer;
    (void)dwbufferlength;
    (void)pdwbytesread;
    (void)pebuffertype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpWebSocketSend(void* hwebsocket, int32_t ebuffertype, void* pvbuffer, uint32_t dwbufferlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWebSocketSend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, ebuffertype, pvbuffer, dwbufferlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwebsocket;
    (void)ebuffertype;
    (void)pvbuffer;
    (void)dwbufferlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpWebSocketShutdown(void* hwebsocket, uint16_t usstatus, void* pvreason, uint32_t dwreasonlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWebSocketShutdown");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, usstatus, pvreason, dwreasonlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwebsocket;
    (void)usstatus;
    (void)pvreason;
    (void)dwreasonlength;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_winhttp_WinHttpWriteData(void* hrequest, void* lpbuffer, uint32_t dwnumberofbytestowrite, void* lpdwnumberofbyteswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWriteData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpbuffer, dwnumberofbytestowrite, lpdwnumberofbyteswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)lpbuffer;
    (void)dwnumberofbytestowrite;
    (void)lpdwnumberofbyteswritten;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_winhttp_WinHttpWriteProxySettings(void* hsession, int32_t fforceupdate, void* pwinhttpproxysettings) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWriteProxySettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, fforceupdate, pwinhttpproxysettings);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hsession;
    (void)fforceupdate;
    (void)pwinhttpproxysettings;
    errno = ENOSYS;
    return 0;
#endif
}

