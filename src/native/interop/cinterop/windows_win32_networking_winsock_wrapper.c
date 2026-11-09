#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networking_winsock_wrapper.h"
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

int32_t windowssys_windows_win32_networking_winsock_AcceptEx(uint64_t slistensocket, uint64_t sacceptsocket, void* lpoutputbuffer, uint32_t dwreceivedatalength, uint32_t dwlocaladdresslength, uint32_t dwremoteaddresslength, void* lpdwbytesreceived, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcceptEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(slistensocket, sacceptsocket, lpoutputbuffer, dwreceivedatalength, dwlocaladdresslength, dwremoteaddresslength, lpdwbytesreceived, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)slistensocket;
    (void)sacceptsocket;
    (void)lpoutputbuffer;
    (void)dwreceivedatalength;
    (void)dwlocaladdresslength;
    (void)dwremoteaddresslength;
    (void)lpdwbytesreceived;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_EnumProtocolsA(void* lpiprotocols, void* lpprotocolbuffer, void* lpdwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumProtocolsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpiprotocols, lpprotocolbuffer, lpdwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_EnumProtocolsW(void* lpiprotocols, void* lpprotocolbuffer, void* lpdwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumProtocolsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpiprotocols, lpprotocolbuffer, lpdwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networking_winsock_FreeAddrInfoEx(void* paddrinfoex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeAddrInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(paddrinfoex);
        return;
    }
    errno = ENOSYS;
#else
    (void)paddrinfoex;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_winsock_FreeAddrInfoExW(void* paddrinfoex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeAddrInfoExW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(paddrinfoex);
        return;
    }
    errno = ENOSYS;
#else
    (void)paddrinfoex;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_winsock_FreeAddrInfoW(void* paddrinfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeAddrInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(paddrinfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)paddrinfo;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_networking_winsock_GetAcceptExSockaddrs(void* lpoutputbuffer, uint32_t dwreceivedatalength, uint32_t dwlocaladdresslength, uint32_t dwremoteaddresslength, void* localsockaddr, void* localsockaddrlength, void* remotesockaddr, void* remotesockaddrlength) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAcceptExSockaddrs");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpoutputbuffer, dwreceivedatalength, dwlocaladdresslength, dwremoteaddresslength, localsockaddr, localsockaddrlength, remotesockaddr, remotesockaddrlength);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpoutputbuffer;
    (void)dwreceivedatalength;
    (void)dwlocaladdresslength;
    (void)dwremoteaddresslength;
    (void)localsockaddr;
    (void)localsockaddrlength;
    (void)remotesockaddr;
    (void)remotesockaddrlength;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_GetAddrInfoExA(void* pname, void* pservicename, uint32_t dwnamespace, void* lpnspid, void* hints, void* ppresult, void* timeout, void* lpoverlapped, void* lpcompletionroutine, void* lpnamehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddrInfoExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, pservicename, dwnamespace, lpnspid, hints, ppresult, timeout, lpoverlapped, lpcompletionroutine, lpnamehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)pservicename;
    (void)dwnamespace;
    (void)lpnspid;
    (void)hints;
    (void)ppresult;
    (void)timeout;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    (void)lpnamehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_GetAddrInfoExCancel(void* lphandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddrInfoExCancel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lphandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lphandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_GetAddrInfoExOverlappedResult(void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddrInfoExOverlappedResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_GetAddrInfoExW(void* pname, void* pservicename, uint32_t dwnamespace, void* lpnspid, void* hints, void* ppresult, void* timeout, void* lpoverlapped, void* lpcompletionroutine, void* lphandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddrInfoExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, pservicename, dwnamespace, lpnspid, hints, ppresult, timeout, lpoverlapped, lpcompletionroutine, lphandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)pservicename;
    (void)dwnamespace;
    (void)lpnspid;
    (void)hints;
    (void)ppresult;
    (void)timeout;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    (void)lphandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_GetAddrInfoW(void* pnodename, void* pservicename, void* phints, void* ppresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddrInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pnodename, pservicename, phints, ppresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pnodename;
    (void)pservicename;
    (void)phints;
    (void)ppresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_GetAddressByNameA(uint32_t dwnamespace, void* lpservicetype, void* lpservicename, void* lpiprotocols, uint32_t dwresolution, void* lpserviceasyncinfo, void* lpcsaddrbuffer, void* lpdwbufferlength, void* lpaliasbuffer, void* lpdwaliasbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddressByNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwnamespace, lpservicetype, lpservicename, lpiprotocols, dwresolution, lpserviceasyncinfo, lpcsaddrbuffer, lpdwbufferlength, lpaliasbuffer, lpdwaliasbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwnamespace;
    (void)lpservicetype;
    (void)lpservicename;
    (void)lpiprotocols;
    (void)dwresolution;
    (void)lpserviceasyncinfo;
    (void)lpcsaddrbuffer;
    (void)lpdwbufferlength;
    (void)lpaliasbuffer;
    (void)lpdwaliasbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_GetAddressByNameW(uint32_t dwnamespace, void* lpservicetype, void* lpservicename, void* lpiprotocols, uint32_t dwresolution, void* lpserviceasyncinfo, void* lpcsaddrbuffer, void* lpdwbufferlength, void* lpaliasbuffer, void* lpdwaliasbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddressByNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwnamespace, lpservicetype, lpservicename, lpiprotocols, dwresolution, lpserviceasyncinfo, lpcsaddrbuffer, lpdwbufferlength, lpaliasbuffer, lpdwaliasbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwnamespace;
    (void)lpservicetype;
    (void)lpservicename;
    (void)lpiprotocols;
    (void)dwresolution;
    (void)lpserviceasyncinfo;
    (void)lpcsaddrbuffer;
    (void)lpdwbufferlength;
    (void)lpaliasbuffer;
    (void)lpdwaliasbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_GetHostNameW(void* name, int32_t namelen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetHostNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, namelen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)name;
    (void)namelen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_GetNameByTypeA(void* lpservicetype, void* lpservicename, uint32_t dwnamelength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNameByTypeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpservicetype, lpservicename, dwnamelength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpservicetype;
    (void)lpservicename;
    (void)dwnamelength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_GetNameByTypeW(void* lpservicetype, void* lpservicename, uint32_t dwnamelength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNameByTypeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpservicetype, lpservicename, dwnamelength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpservicetype;
    (void)lpservicename;
    (void)dwnamelength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_GetNameInfoW(void* psockaddr, int32_t sockaddrlength, void* pnodebuffer, uint32_t nodebuffersize, void* pservicebuffer, uint32_t servicebuffersize, int32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNameInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psockaddr, sockaddrlength, pnodebuffer, nodebuffersize, pservicebuffer, servicebuffersize, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psockaddr;
    (void)sockaddrlength;
    (void)pnodebuffer;
    (void)nodebuffersize;
    (void)pservicebuffer;
    (void)servicebuffersize;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_GetServiceA(uint32_t dwnamespace, void* lpguid, void* lpservicename, uint32_t dwproperties, void* lpbuffer, void* lpdwbuffersize, void* lpserviceasyncinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwnamespace, lpguid, lpservicename, dwproperties, lpbuffer, lpdwbuffersize, lpserviceasyncinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwnamespace;
    (void)lpguid;
    (void)lpservicename;
    (void)dwproperties;
    (void)lpbuffer;
    (void)lpdwbuffersize;
    (void)lpserviceasyncinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_GetServiceW(uint32_t dwnamespace, void* lpguid, void* lpservicename, uint32_t dwproperties, void* lpbuffer, void* lpdwbuffersize, void* lpserviceasyncinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwnamespace, lpguid, lpservicename, dwproperties, lpbuffer, lpdwbuffersize, lpserviceasyncinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwnamespace;
    (void)lpguid;
    (void)lpservicename;
    (void)dwproperties;
    (void)lpbuffer;
    (void)lpdwbuffersize;
    (void)lpserviceasyncinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_GetTypeByNameA(void* lpservicename, void* lpservicetype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTypeByNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpservicename, lpservicetype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpservicename;
    (void)lpservicetype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_GetTypeByNameW(void* lpservicename, void* lpservicetype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTypeByNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpservicename, lpservicetype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpservicename;
    (void)lpservicetype;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_winsock_InetNtopW(int32_t family, void* paddr, void* pstringbuf, uint64_t stringbufsize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InetNtopW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, paddr, pstringbuf, stringbufsize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)family;
    (void)paddr;
    (void)pstringbuf;
    (void)stringbufsize;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_InetPtonW(int32_t family, void* pszaddrstring, void* paddrbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InetPtonW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, pszaddrstring, paddrbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)family;
    (void)pszaddrstring;
    (void)paddrbuf;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_winsock_ProcessSocketNotifications(void* completionport, uint32_t registrationcount, void* registrationinfos, uint32_t timeoutms, uint32_t completioncount, void* completionportentries, void* receivedentrycount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessSocketNotifications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(completionport, registrationcount, registrationinfos, timeoutms, completioncount, completionportentries, receivedentrycount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)completionport;
    (void)registrationcount;
    (void)registrationinfos;
    (void)timeoutms;
    (void)completioncount;
    (void)completionportentries;
    (void)receivedentrycount;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringA(void* addr, void* s) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEthernetAddressToStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addr, s);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)addr;
    (void)s;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringW(void* addr, void* s) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEthernetAddressToStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addr, s);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)addr;
    (void)s;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressA(void* s, void* terminator, void* addr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEthernetStringToAddressA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, terminator, addr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)terminator;
    (void)addr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressW(void* s, void* terminator, void* addr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEthernetStringToAddressW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, terminator, addr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)terminator;
    (void)addr;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringA(void* addr, void* s) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4AddressToStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addr, s);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)addr;
    (void)s;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExA(void* address, uint16_t port, void* addressstring, void* addressstringlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4AddressToStringExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address, port, addressstring, addressstringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)address;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExW(void* address, uint16_t port, void* addressstring, void* addressstringlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4AddressToStringExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address, port, addressstring, addressstringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)address;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringW(void* addr, void* s) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4AddressToStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addr, s);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)addr;
    (void)s;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressA(void* s, bool strict, void* terminator, void* addr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4StringToAddressA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, strict, terminator, addr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)strict;
    (void)terminator;
    (void)addr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExA(void* addressstring, bool strict, void* address, void* port) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4StringToAddressExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addressstring, strict, address, port);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)addressstring;
    (void)strict;
    (void)address;
    (void)port;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExW(void* addressstring, bool strict, void* address, void* port) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4StringToAddressExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addressstring, strict, address, port);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)addressstring;
    (void)strict;
    (void)address;
    (void)port;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressW(void* s, bool strict, void* terminator, void* addr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4StringToAddressW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, strict, terminator, addr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)strict;
    (void)terminator;
    (void)addr;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringA(void* addr, void* s) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6AddressToStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addr, s);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)addr;
    (void)s;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExA(void* address, uint32_t scopeid, uint16_t port, void* addressstring, void* addressstringlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6AddressToStringExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address, scopeid, port, addressstring, addressstringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)address;
    (void)scopeid;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExW(void* address, uint32_t scopeid, uint16_t port, void* addressstring, void* addressstringlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6AddressToStringExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address, scopeid, port, addressstring, addressstringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)address;
    (void)scopeid;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringW(void* addr, void* s) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6AddressToStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addr, s);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)addr;
    (void)s;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressA(void* s, void* terminator, void* addr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6StringToAddressA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, terminator, addr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)terminator;
    (void)addr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExA(void* addressstring, void* address, void* scopeid, void* port) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6StringToAddressExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addressstring, address, scopeid, port);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)addressstring;
    (void)address;
    (void)scopeid;
    (void)port;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExW(void* addressstring, void* address, void* scopeid, void* port) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6StringToAddressExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addressstring, address, scopeid, port);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)addressstring;
    (void)address;
    (void)scopeid;
    (void)port;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressW(void* s, void* terminator, void* addr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6StringToAddressW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, terminator, addr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)terminator;
    (void)addr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_SetAddrInfoExA(void* pname, void* pservicename, void* paddresses, uint32_t dwaddresscount, void* lpblob, uint32_t dwflags, uint32_t dwnamespace, void* lpnspid, void* timeout, void* lpoverlapped, void* lpcompletionroutine, void* lpnamehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAddrInfoExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, pservicename, paddresses, dwaddresscount, lpblob, dwflags, dwnamespace, lpnspid, timeout, lpoverlapped, lpcompletionroutine, lpnamehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)pservicename;
    (void)paddresses;
    (void)dwaddresscount;
    (void)lpblob;
    (void)dwflags;
    (void)dwnamespace;
    (void)lpnspid;
    (void)timeout;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    (void)lpnamehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_SetAddrInfoExW(void* pname, void* pservicename, void* paddresses, uint32_t dwaddresscount, void* lpblob, uint32_t dwflags, uint32_t dwnamespace, void* lpnspid, void* timeout, void* lpoverlapped, void* lpcompletionroutine, void* lpnamehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAddrInfoExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pname, pservicename, paddresses, dwaddresscount, lpblob, dwflags, dwnamespace, lpnspid, timeout, lpoverlapped, lpcompletionroutine, lpnamehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pname;
    (void)pservicename;
    (void)paddresses;
    (void)dwaddresscount;
    (void)lpblob;
    (void)dwflags;
    (void)dwnamespace;
    (void)lpnspid;
    (void)timeout;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    (void)lpnamehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_SetServiceA(uint32_t dwnamespace, uint32_t dwoperation, uint32_t dwflags, void* lpserviceinfo, void* lpserviceasyncinfo, void* lpdwstatusflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwnamespace, dwoperation, dwflags, lpserviceinfo, lpserviceasyncinfo, lpdwstatusflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwnamespace;
    (void)dwoperation;
    (void)dwflags;
    (void)lpserviceinfo;
    (void)lpserviceasyncinfo;
    (void)lpdwstatusflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_SetServiceW(uint32_t dwnamespace, uint32_t dwoperation, uint32_t dwflags, void* lpserviceinfo, void* lpserviceasyncinfo, void* lpdwstatusflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwnamespace, dwoperation, dwflags, lpserviceinfo, lpserviceasyncinfo, lpdwstatusflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwnamespace;
    (void)dwoperation;
    (void)dwflags;
    (void)lpserviceinfo;
    (void)lpserviceasyncinfo;
    (void)lpdwstatusflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_SetSocketMediaStreamingMode(int32_t value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.networking.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSocketMediaStreamingMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_TransmitFile(uint64_t hsocket, void* hfile, uint32_t nnumberofbytestowrite, uint32_t nnumberofbytespersend, void* lpoverlapped, void* lptransmitbuffers, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransmitFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsocket, hfile, nnumberofbytestowrite, nnumberofbytespersend, lpoverlapped, lptransmitbuffers, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsocket;
    (void)hfile;
    (void)nnumberofbytestowrite;
    (void)nnumberofbytespersend;
    (void)lpoverlapped;
    (void)lptransmitbuffers;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WPUCompleteOverlappedRequest(uint64_t s, void* lpoverlapped, uint32_t dwerror, uint32_t cbtransferred, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WPUCompleteOverlappedRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, lpoverlapped, dwerror, cbtransferred, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)lpoverlapped;
    (void)dwerror;
    (void)cbtransferred;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_networking_winsock_WSAAccept(uint64_t s, void* addr, void* addrlen, void* lpfncondition, uint64_t dwcallbackdata) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAccept");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, addr, addrlen, lpfncondition, dwcallbackdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)s;
    (void)addr;
    (void)addrlen;
    (void)lpfncondition;
    (void)dwcallbackdata;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAAddressToStringA(void* lpsaaddress, uint32_t dwaddresslength, void* lpprotocolinfo, void* lpszaddressstring, void* lpdwaddressstringlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAddressToStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsaaddress, dwaddresslength, lpprotocolinfo, lpszaddressstring, lpdwaddressstringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsaaddress;
    (void)dwaddresslength;
    (void)lpprotocolinfo;
    (void)lpszaddressstring;
    (void)lpdwaddressstringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAAddressToStringW(void* lpsaaddress, uint32_t dwaddresslength, void* lpprotocolinfo, void* lpszaddressstring, void* lpdwaddressstringlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAddressToStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsaaddress, dwaddresslength, lpprotocolinfo, lpszaddressstring, lpdwaddressstringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsaaddress;
    (void)dwaddresslength;
    (void)lpprotocolinfo;
    (void)lpszaddressstring;
    (void)lpdwaddressstringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAAdvertiseProvider(void* puuidproviderid, void* pnspv2routine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAdvertiseProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puuidproviderid, pnspv2routine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)puuidproviderid;
    (void)pnspv2routine;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByAddr(void* hwnd, uint32_t wmsg, void* addr, int32_t len, int32_t type, void* buf, int32_t buflen) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetHostByAddr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, wmsg, addr, len, type, buf, buflen);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)addr;
    (void)len;
    (void)type;
    (void)buf;
    (void)buflen;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByName(void* hwnd, uint32_t wmsg, void* name, void* buf, int32_t buflen) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetHostByName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, wmsg, name, buf, buflen);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)name;
    (void)buf;
    (void)buflen;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByName(void* hwnd, uint32_t wmsg, void* name, void* buf, int32_t buflen) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetProtoByName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, wmsg, name, buf, buflen);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)name;
    (void)buf;
    (void)buflen;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByNumber(void* hwnd, uint32_t wmsg, int32_t number, void* buf, int32_t buflen) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetProtoByNumber");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, wmsg, number, buf, buflen);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)number;
    (void)buf;
    (void)buflen;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_winsock_WSAAsyncGetServByName(void* hwnd, uint32_t wmsg, void* name, void* proto, void* buf, int32_t buflen) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetServByName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, wmsg, name, proto, buf, buflen);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)name;
    (void)proto;
    (void)buf;
    (void)buflen;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_winsock_WSAAsyncGetServByPort(void* hwnd, uint32_t wmsg, int32_t port, void* proto, void* buf, int32_t buflen) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetServByPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, wmsg, port, proto, buf, buflen);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)port;
    (void)proto;
    (void)buf;
    (void)buflen;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAAsyncSelect(uint64_t s, void* hwnd, uint32_t wmsg, int32_t levent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncSelect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, hwnd, wmsg, levent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)hwnd;
    (void)wmsg;
    (void)levent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSACancelAsyncRequest(void* hasynctaskhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSACancelAsyncRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hasynctaskhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hasynctaskhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSACancelBlockingCall(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSACancelBlockingCall");
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

int32_t windowssys_windows_win32_networking_winsock_WSACleanup(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSACleanup");
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

int32_t windowssys_windows_win32_networking_winsock_WSACloseEvent(int64_t hevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSACloseEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAConnect(uint64_t s, void* name, int32_t namelen, void* lpcallerdata, void* lpcalleedata, void* lpsqos, void* lpgqos) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, name, namelen, lpcallerdata, lpcalleedata, lpsqos, lpgqos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)name;
    (void)namelen;
    (void)lpcallerdata;
    (void)lpcalleedata;
    (void)lpsqos;
    (void)lpgqos;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAConnectByList(uint64_t s, void* socketaddress, void* localaddresslength, void* localaddress, void* remoteaddresslength, void* remoteaddress, void* timeout, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAConnectByList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, socketaddress, localaddresslength, localaddress, remoteaddresslength, remoteaddress, timeout, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)socketaddress;
    (void)localaddresslength;
    (void)localaddress;
    (void)remoteaddresslength;
    (void)remoteaddress;
    (void)timeout;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAConnectByNameA(uint64_t s, void* nodename, void* servicename, void* localaddresslength, void* localaddress, void* remoteaddresslength, void* remoteaddress, void* timeout, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAConnectByNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, nodename, servicename, localaddresslength, localaddress, remoteaddresslength, remoteaddress, timeout, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)nodename;
    (void)servicename;
    (void)localaddresslength;
    (void)localaddress;
    (void)remoteaddresslength;
    (void)remoteaddress;
    (void)timeout;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAConnectByNameW(uint64_t s, void* nodename, void* servicename, void* localaddresslength, void* localaddress, void* remoteaddresslength, void* remoteaddress, void* timeout, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAConnectByNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, nodename, servicename, localaddresslength, localaddress, remoteaddresslength, remoteaddress, timeout, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)nodename;
    (void)servicename;
    (void)localaddresslength;
    (void)localaddress;
    (void)remoteaddresslength;
    (void)remoteaddress;
    (void)timeout;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_winsock_WSACreateEvent(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSACreateEvent");
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

int32_t windowssys_windows_win32_networking_winsock_WSADeleteSocketPeerTargetName(uint64_t arg_0_socket, void* peeraddr, uint32_t peeraddrlen, void* overlapped, void* completionroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSADeleteSocketPeerTargetName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_socket, peeraddr, peeraddrlen, overlapped, completionroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_socket;
    (void)peeraddr;
    (void)peeraddrlen;
    (void)overlapped;
    (void)completionroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSADuplicateSocketA(uint64_t s, uint32_t dwprocessid, void* lpprotocolinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSADuplicateSocketA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, dwprocessid, lpprotocolinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)dwprocessid;
    (void)lpprotocolinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSADuplicateSocketW(uint64_t s, uint32_t dwprocessid, void* lpprotocolinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSADuplicateSocketW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, dwprocessid, lpprotocolinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)dwprocessid;
    (void)lpprotocolinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersA(void* lpdwbufferlength, void* lpnspbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwbufferlength, lpnspbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExA(void* lpdwbufferlength, void* lpnspbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwbufferlength, lpnspbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExW(void* lpdwbufferlength, void* lpnspbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwbufferlength, lpnspbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersW(void* lpdwbufferlength, void* lpnspbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwbufferlength, lpnspbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAEnumNetworkEvents(uint64_t s, int64_t heventobject, void* lpnetworkevents) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumNetworkEvents");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, heventobject, lpnetworkevents);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)heventobject;
    (void)lpnetworkevents;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAEnumProtocolsA(void* lpiprotocols, void* lpprotocolbuffer, void* lpdwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumProtocolsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpiprotocols, lpprotocolbuffer, lpdwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAEnumProtocolsW(void* lpiprotocols, void* lpprotocolbuffer, void* lpdwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumProtocolsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpiprotocols, lpprotocolbuffer, lpdwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAEventSelect(uint64_t s, int64_t heventobject, int32_t lnetworkevents) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEventSelect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, heventobject, lnetworkevents);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)heventobject;
    (void)lnetworkevents;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAGetLastError(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetLastError");
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

int32_t windowssys_windows_win32_networking_winsock_WSAGetOverlappedResult(uint64_t s, void* lpoverlapped, void* lpcbtransfer, int32_t fwait, void* lpdwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetOverlappedResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, lpoverlapped, lpcbtransfer, fwait, lpdwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)lpoverlapped;
    (void)lpcbtransfer;
    (void)fwait;
    (void)lpdwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAGetQOSByName(uint64_t s, void* lpqosname, void* lpqos) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetQOSByName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, lpqosname, lpqos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)lpqosname;
    (void)lpqos;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoA(void* lpproviderid, void* lpserviceclassid, void* lpdwbufsize, void* lpserviceclassinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetServiceClassInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, lpserviceclassid, lpdwbufsize, lpserviceclassinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)lpserviceclassid;
    (void)lpdwbufsize;
    (void)lpserviceclassinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoW(void* lpproviderid, void* lpserviceclassid, void* lpdwbufsize, void* lpserviceclassinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetServiceClassInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, lpserviceclassid, lpdwbufsize, lpserviceclassinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)lpserviceclassid;
    (void)lpdwbufsize;
    (void)lpserviceclassinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdA(void* lpserviceclassid, void* lpszserviceclassname, void* lpdwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetServiceClassNameByClassIdA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpserviceclassid, lpszserviceclassname, lpdwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpserviceclassid;
    (void)lpszserviceclassname;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdW(void* lpserviceclassid, void* lpszserviceclassname, void* lpdwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetServiceClassNameByClassIdW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpserviceclassid, lpszserviceclassname, lpdwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpserviceclassid;
    (void)lpszserviceclassname;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAHtonl(uint64_t s, uint32_t hostlong, void* lpnetlong) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAHtonl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, hostlong, lpnetlong);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)hostlong;
    (void)lpnetlong;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAHtons(uint64_t s, uint16_t hostshort, void* lpnetshort) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAHtons");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, hostshort, lpnetshort);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)hostshort;
    (void)lpnetshort;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAImpersonateSocketPeer(uint64_t arg_0_socket, void* peeraddr, uint32_t peeraddrlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAImpersonateSocketPeer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_socket, peeraddr, peeraddrlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_socket;
    (void)peeraddr;
    (void)peeraddrlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAInstallServiceClassA(void* lpserviceclassinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAInstallServiceClassA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpserviceclassinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpserviceclassinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAInstallServiceClassW(void* lpserviceclassinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAInstallServiceClassW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpserviceclassinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpserviceclassinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAIoctl(uint64_t s, uint32_t dwiocontrolcode, void* lpvinbuffer, uint32_t cbinbuffer, void* lpvoutbuffer, uint32_t cboutbuffer, void* lpcbbytesreturned, void* lpoverlapped, void* lpcompletionroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAIoctl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, dwiocontrolcode, lpvinbuffer, cbinbuffer, lpvoutbuffer, cboutbuffer, lpcbbytesreturned, lpoverlapped, lpcompletionroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)dwiocontrolcode;
    (void)lpvinbuffer;
    (void)cbinbuffer;
    (void)lpvoutbuffer;
    (void)cboutbuffer;
    (void)lpcbbytesreturned;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAIsBlocking(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAIsBlocking");
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

uint64_t windowssys_windows_win32_networking_winsock_WSAJoinLeaf(uint64_t s, void* name, int32_t namelen, void* lpcallerdata, void* lpcalleedata, void* lpsqos, void* lpgqos, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAJoinLeaf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, name, namelen, lpcallerdata, lpcalleedata, lpsqos, lpgqos, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)s;
    (void)name;
    (void)namelen;
    (void)lpcallerdata;
    (void)lpcalleedata;
    (void)lpsqos;
    (void)lpgqos;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSALookupServiceBeginA(void* lpqsrestrictions, uint32_t dwcontrolflags, void* lphlookup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSALookupServiceBeginA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpqsrestrictions, dwcontrolflags, lphlookup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpqsrestrictions;
    (void)dwcontrolflags;
    (void)lphlookup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSALookupServiceBeginW(void* lpqsrestrictions, uint32_t dwcontrolflags, void* lphlookup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSALookupServiceBeginW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpqsrestrictions, dwcontrolflags, lphlookup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpqsrestrictions;
    (void)dwcontrolflags;
    (void)lphlookup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSALookupServiceEnd(void* hlookup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSALookupServiceEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlookup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlookup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSALookupServiceNextA(void* hlookup, uint32_t dwcontrolflags, void* lpdwbufferlength, void* lpqsresults) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSALookupServiceNextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlookup, dwcontrolflags, lpdwbufferlength, lpqsresults);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlookup;
    (void)dwcontrolflags;
    (void)lpdwbufferlength;
    (void)lpqsresults;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSALookupServiceNextW(void* hlookup, uint32_t dwcontrolflags, void* lpdwbufferlength, void* lpqsresults) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSALookupServiceNextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlookup, dwcontrolflags, lpdwbufferlength, lpqsresults);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlookup;
    (void)dwcontrolflags;
    (void)lpdwbufferlength;
    (void)lpqsresults;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSANSPIoctl(void* hlookup, uint32_t dwcontrolcode, void* lpvinbuffer, uint32_t cbinbuffer, void* lpvoutbuffer, uint32_t cboutbuffer, void* lpcbbytesreturned, void* lpcompletion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSANSPIoctl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlookup, dwcontrolcode, lpvinbuffer, cbinbuffer, lpvoutbuffer, cboutbuffer, lpcbbytesreturned, lpcompletion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlookup;
    (void)dwcontrolcode;
    (void)lpvinbuffer;
    (void)cbinbuffer;
    (void)lpvoutbuffer;
    (void)cboutbuffer;
    (void)lpcbbytesreturned;
    (void)lpcompletion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSANtohl(uint64_t s, uint32_t netlong, void* lphostlong) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSANtohl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, netlong, lphostlong);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)netlong;
    (void)lphostlong;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSANtohs(uint64_t s, uint16_t netshort, void* lphostshort) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSANtohs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, netshort, lphostshort);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)netshort;
    (void)lphostshort;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAPoll(void* fdarray, uint32_t fds, int32_t timeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAPoll");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fdarray, fds, timeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fdarray;
    (void)fds;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAProviderCompleteAsyncCall(void* hasynccall, int32_t iretcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAProviderCompleteAsyncCall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hasynccall, iretcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hasynccall;
    (void)iretcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAProviderConfigChange(void* lpnotificationhandle, void* lpoverlapped, void* lpcompletionroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAProviderConfigChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnotificationhandle, lpoverlapped, lpcompletionroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpnotificationhandle;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAQuerySocketSecurity(uint64_t arg_0_socket, void* securityquerytemplate, uint32_t securityquerytemplatelen, void* securityqueryinfo, void* securityqueryinfolen, void* overlapped, void* completionroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAQuerySocketSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_socket, securityquerytemplate, securityquerytemplatelen, securityqueryinfo, securityqueryinfolen, overlapped, completionroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_socket;
    (void)securityquerytemplate;
    (void)securityquerytemplatelen;
    (void)securityqueryinfo;
    (void)securityqueryinfolen;
    (void)overlapped;
    (void)completionroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSARecv(uint64_t s, void* lpbuffers, uint32_t dwbuffercount, void* lpnumberofbytesrecvd, void* lpflags, void* lpoverlapped, void* lpcompletionroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARecv");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, lpbuffers, dwbuffercount, lpnumberofbytesrecvd, lpflags, lpoverlapped, lpcompletionroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)lpbuffers;
    (void)dwbuffercount;
    (void)lpnumberofbytesrecvd;
    (void)lpflags;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSARecvDisconnect(uint64_t s, void* lpinbounddisconnectdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARecvDisconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, lpinbounddisconnectdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)lpinbounddisconnectdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSARecvEx(uint64_t s, void* buf, int32_t len, void* flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARecvEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, buf, len, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSARecvFrom(uint64_t s, void* lpbuffers, uint32_t dwbuffercount, void* lpnumberofbytesrecvd, void* lpflags, void* lpfrom, void* lpfromlen, void* lpoverlapped, void* lpcompletionroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARecvFrom");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, lpbuffers, dwbuffercount, lpnumberofbytesrecvd, lpflags, lpfrom, lpfromlen, lpoverlapped, lpcompletionroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)lpbuffers;
    (void)dwbuffercount;
    (void)lpnumberofbytesrecvd;
    (void)lpflags;
    (void)lpfrom;
    (void)lpfromlen;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSARemoveServiceClass(void* lpserviceclassid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARemoveServiceClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpserviceclassid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpserviceclassid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAResetEvent(int64_t hevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAResetEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSARevertImpersonation(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARevertImpersonation");
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

int32_t windowssys_windows_win32_networking_winsock_WSASend(uint64_t s, void* lpbuffers, uint32_t dwbuffercount, void* lpnumberofbytessent, uint32_t dwflags, void* lpoverlapped, void* lpcompletionroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, lpbuffers, dwbuffercount, lpnumberofbytessent, dwflags, lpoverlapped, lpcompletionroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)lpbuffers;
    (void)dwbuffercount;
    (void)lpnumberofbytessent;
    (void)dwflags;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSASendDisconnect(uint64_t s, void* lpoutbounddisconnectdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASendDisconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, lpoutbounddisconnectdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)lpoutbounddisconnectdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSASendMsg(uint64_t handle, void* lpmsg, uint32_t dwflags, void* lpnumberofbytessent, void* lpoverlapped, void* lpcompletionroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASendMsg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, lpmsg, dwflags, lpnumberofbytessent, lpoverlapped, lpcompletionroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)lpmsg;
    (void)dwflags;
    (void)lpnumberofbytessent;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSASendTo(uint64_t s, void* lpbuffers, uint32_t dwbuffercount, void* lpnumberofbytessent, uint32_t dwflags, void* lpto, int32_t itolen, void* lpoverlapped, void* lpcompletionroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASendTo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, lpbuffers, dwbuffercount, lpnumberofbytessent, dwflags, lpto, itolen, lpoverlapped, lpcompletionroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)lpbuffers;
    (void)dwbuffercount;
    (void)lpnumberofbytessent;
    (void)dwflags;
    (void)lpto;
    (void)itolen;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSASetEvent(int64_t hevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networking_winsock_WSASetLastError(int32_t ierror) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetLastError");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ierror);
        return;
    }
    errno = ENOSYS;
#else
    (void)ierror;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSASetServiceA(void* lpqsreginfo, int32_t essoperation, uint32_t dwcontrolflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetServiceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpqsreginfo, essoperation, dwcontrolflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpqsreginfo;
    (void)essoperation;
    (void)dwcontrolflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSASetServiceW(void* lpqsreginfo, int32_t essoperation, uint32_t dwcontrolflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetServiceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpqsreginfo, essoperation, dwcontrolflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpqsreginfo;
    (void)essoperation;
    (void)dwcontrolflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSASetSocketPeerTargetName(uint64_t arg_0_socket, void* peertargetname, uint32_t peertargetnamelen, void* overlapped, void* completionroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetSocketPeerTargetName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_socket, peertargetname, peertargetnamelen, overlapped, completionroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_socket;
    (void)peertargetname;
    (void)peertargetnamelen;
    (void)overlapped;
    (void)completionroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSASetSocketSecurity(uint64_t arg_0_socket, void* securitysettings, uint32_t securitysettingslen, void* overlapped, void* completionroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetSocketSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_socket, securitysettings, securitysettingslen, overlapped, completionroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_socket;
    (void)securitysettings;
    (void)securitysettingslen;
    (void)overlapped;
    (void)completionroutine;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_networking_winsock_WSASocketA(int32_t af, int32_t type, int32_t protocol, void* lpprotocolinfo, uint32_t g, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASocketA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(af, type, protocol, lpprotocolinfo, g, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)af;
    (void)type;
    (void)protocol;
    (void)lpprotocolinfo;
    (void)g;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_networking_winsock_WSASocketW(int32_t af, int32_t type, int32_t protocol, void* lpprotocolinfo, uint32_t g, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASocketW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(af, type, protocol, lpprotocolinfo, g, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)af;
    (void)type;
    (void)protocol;
    (void)lpprotocolinfo;
    (void)g;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAStartup(uint16_t wversionrequested, void* lpwsadata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAStartup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wversionrequested, lpwsadata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wversionrequested;
    (void)lpwsadata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAStringToAddressA(void* addressstring, int32_t addressfamily, void* lpprotocolinfo, void* lpaddress, void* lpaddresslength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAStringToAddressA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addressstring, addressfamily, lpprotocolinfo, lpaddress, lpaddresslength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)addressstring;
    (void)addressfamily;
    (void)lpprotocolinfo;
    (void)lpaddress;
    (void)lpaddresslength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAStringToAddressW(void* addressstring, int32_t addressfamily, void* lpprotocolinfo, void* lpaddress, void* lpaddresslength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAStringToAddressW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addressstring, addressfamily, lpprotocolinfo, lpaddress, lpaddresslength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)addressstring;
    (void)addressfamily;
    (void)lpprotocolinfo;
    (void)lpaddress;
    (void)lpaddresslength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAUnadvertiseProvider(void* puuidproviderid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAUnadvertiseProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puuidproviderid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)puuidproviderid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSAUnhookBlockingHook(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAUnhookBlockingHook");
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

uint32_t windowssys_windows_win32_networking_winsock_WSAWaitForMultipleEvents(uint32_t cevents, void* lphevents, int32_t fwaitall, uint32_t dwtimeout, int32_t falertable) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAWaitForMultipleEvents");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cevents, lphevents, fwaitall, dwtimeout, falertable);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)cevents;
    (void)lphevents;
    (void)fwaitall;
    (void)dwtimeout;
    (void)falertable;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCDeinstallProvider(void* lpproviderid, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCDeinstallProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCDeinstallProvider32(void* lpproviderid, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCDeinstallProvider32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCEnableNSProvider(void* lpproviderid, int32_t fenable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnableNSProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, fenable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)fenable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCEnableNSProvider32(void* lpproviderid, int32_t fenable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnableNSProvider32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, fenable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)fenable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProviders32(void* lpdwbufferlength, void* lpnspbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnumNameSpaceProviders32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwbufferlength, lpnspbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProvidersEx32(void* lpdwbufferlength, void* lpnspbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnumNameSpaceProvidersEx32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwbufferlength, lpnspbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCEnumProtocols(void* lpiprotocols, void* lpprotocolbuffer, void* lpdwbufferlength, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnumProtocols");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpiprotocols, lpprotocolbuffer, lpdwbufferlength, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCEnumProtocols32(void* lpiprotocols, void* lpprotocolbuffer, void* lpdwbufferlength, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnumProtocols32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpiprotocols, lpprotocolbuffer, lpdwbufferlength, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCGetApplicationCategory(void* path, uint32_t pathlength, void* extra, uint32_t extralength, void* ppermittedlspcategories, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCGetApplicationCategory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, pathlength, extra, extralength, ppermittedlspcategories, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)pathlength;
    (void)extra;
    (void)extralength;
    (void)ppermittedlspcategories;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCGetProviderInfo(void* lpproviderid, int32_t infotype, void* info, void* infosize, uint32_t flags, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCGetProviderInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, infotype, info, infosize, flags, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCGetProviderInfo32(void* lpproviderid, int32_t infotype, void* info, void* infosize, uint32_t flags, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCGetProviderInfo32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, infotype, info, infosize, flags, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCGetProviderPath(void* lpproviderid, void* lpszproviderdllpath, void* lpproviderdllpathlen, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCGetProviderPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, lpszproviderdllpath, lpproviderdllpathlen, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpproviderdllpathlen;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCGetProviderPath32(void* lpproviderid, void* lpszproviderdllpath, void* lpproviderdllpathlen, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCGetProviderPath32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, lpszproviderdllpath, lpproviderdllpathlen, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpproviderdllpathlen;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCInstallNameSpace(void* lpszidentifier, void* lpszpathname, uint32_t dwnamespace, uint32_t dwversion, void* lpproviderid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallNameSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszidentifier, lpszpathname, dwnamespace, dwversion, lpproviderid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCInstallNameSpace32(void* lpszidentifier, void* lpszpathname, uint32_t dwnamespace, uint32_t dwversion, void* lpproviderid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallNameSpace32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszidentifier, lpszpathname, dwnamespace, dwversion, lpproviderid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx(void* lpszidentifier, void* lpszpathname, uint32_t dwnamespace, uint32_t dwversion, void* lpproviderid, void* lpproviderspecific) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallNameSpaceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszidentifier, lpszpathname, dwnamespace, dwversion, lpproviderid, lpproviderspecific);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    (void)lpproviderspecific;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx32(void* lpszidentifier, void* lpszpathname, uint32_t dwnamespace, uint32_t dwversion, void* lpproviderid, void* lpproviderspecific) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallNameSpaceEx32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszidentifier, lpszpathname, dwnamespace, dwversion, lpproviderid, lpproviderspecific);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    (void)lpproviderspecific;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCInstallProvider(void* lpproviderid, void* lpszproviderdllpath, void* lpprotocolinfolist, uint32_t dwnumberofentries, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCInstallProvider64_32(void* lpproviderid, void* lpszproviderdllpath, void* lpprotocolinfolist, uint32_t dwnumberofentries, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallProvider64_32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCInstallProviderAndChains64_32(void* lpproviderid, void* lpszproviderdllpath, void* lpszproviderdllpath32, void* lpszlspname, uint32_t dwserviceflags, void* lpprotocolinfolist, uint32_t dwnumberofentries, void* lpdwcatalogentryid, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallProviderAndChains64_32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, lpszproviderdllpath, lpszproviderdllpath32, lpszlspname, dwserviceflags, lpprotocolinfolist, dwnumberofentries, lpdwcatalogentryid, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpszproviderdllpath32;
    (void)lpszlspname;
    (void)dwserviceflags;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lpdwcatalogentryid;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCSetApplicationCategory(void* path, uint32_t pathlength, void* extra, uint32_t extralength, uint32_t permittedlspcategories, void* pprevpermlspcat, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCSetApplicationCategory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, pathlength, extra, extralength, permittedlspcategories, pprevpermlspcat, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)pathlength;
    (void)extra;
    (void)extralength;
    (void)permittedlspcategories;
    (void)pprevpermlspcat;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCSetProviderInfo(void* lpproviderid, int32_t infotype, void* info, uint64_t infosize, uint32_t flags, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCSetProviderInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, infotype, info, infosize, flags, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCSetProviderInfo32(void* lpproviderid, int32_t infotype, void* info, uint64_t infosize, uint32_t flags, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCSetProviderInfo32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, infotype, info, infosize, flags, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace(void* lpproviderid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCUnInstallNameSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace32(void* lpproviderid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCUnInstallNameSpace32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCUpdateProvider(void* lpproviderid, void* lpszproviderdllpath, void* lpprotocolinfolist, uint32_t dwnumberofentries, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCUpdateProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCUpdateProvider32(void* lpproviderid, void* lpszproviderdllpath, void* lpprotocolinfolist, uint32_t dwnumberofentries, void* lperrno) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCUpdateProvider32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries, lperrno);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder(void* lpproviderid, uint32_t dwnumberofentries) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCWriteNameSpaceOrder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, dwnumberofentries);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)dwnumberofentries;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder32(void* lpproviderid, uint32_t dwnumberofentries) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCWriteNameSpaceOrder32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpproviderid, dwnumberofentries);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpproviderid;
    (void)dwnumberofentries;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder(void* lpwdcatalogentryid, uint32_t dwnumberofentries) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCWriteProviderOrder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwdcatalogentryid, dwnumberofentries);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwdcatalogentryid;
    (void)dwnumberofentries;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder32(void* lpwdcatalogentryid, uint32_t dwnumberofentries) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCWriteProviderOrder32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwdcatalogentryid, dwnumberofentries);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpwdcatalogentryid;
    (void)dwnumberofentries;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock___WSAFDIsSet(uint64_t fd, void* param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "__WSAFDIsSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fd, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fd;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_networking_winsock_accept(uint64_t s, void* addr, void* addrlen) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "accept");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, addr, addrlen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)s;
    (void)addr;
    (void)addrlen;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_bind(uint64_t s, void* name, int32_t namelen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bind");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, name, namelen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)name;
    (void)namelen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_closesocket(uint64_t s) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "closesocket");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_connect(uint64_t s, void* name, int32_t namelen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "connect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, name, namelen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)name;
    (void)namelen;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_networking_winsock_freeaddrinfo(void* paddrinfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "freeaddrinfo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(paddrinfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)paddrinfo;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_getaddrinfo(void* pnodename, void* pservicename, void* phints, void* ppresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getaddrinfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pnodename, pservicename, phints, ppresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pnodename;
    (void)pservicename;
    (void)phints;
    (void)ppresult;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_winsock_gethostbyaddr(void* addr, int32_t len, int32_t type) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gethostbyaddr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(addr, len, type);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)addr;
    (void)len;
    (void)type;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_winsock_gethostbyname(void* name) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gethostbyname");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)name;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_gethostname(void* name, int32_t namelen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gethostname");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, namelen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)name;
    (void)namelen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_getnameinfo(void* psockaddr, int32_t sockaddrlength, void* pnodebuffer, uint32_t nodebuffersize, void* pservicebuffer, uint32_t servicebuffersize, int32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getnameinfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psockaddr, sockaddrlength, pnodebuffer, nodebuffersize, pservicebuffer, servicebuffersize, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psockaddr;
    (void)sockaddrlength;
    (void)pnodebuffer;
    (void)nodebuffersize;
    (void)pservicebuffer;
    (void)servicebuffersize;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_getpeername(uint64_t s, void* name, void* namelen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getpeername");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, name, namelen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)name;
    (void)namelen;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_winsock_getprotobyname(void* name) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getprotobyname");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)name;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_winsock_getprotobynumber(int32_t number) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getprotobynumber");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(number);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)number;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_winsock_getservbyname(void* name, void* proto) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getservbyname");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, proto);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)name;
    (void)proto;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_networking_winsock_getservbyport(int32_t port, void* proto) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getservbyport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(port, proto);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)port;
    (void)proto;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_getsockname(uint64_t s, void* name, void* namelen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getsockname");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, name, namelen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)name;
    (void)namelen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_getsockopt(uint64_t s, int32_t level, int32_t optname, void* optval, void* optlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getsockopt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, level, optname, optval, optlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)level;
    (void)optname;
    (void)optval;
    (void)optlen;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_winsock_htonl(uint32_t hostlong) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "htonl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostlong);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hostlong;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_networking_winsock_htons(uint16_t hostshort) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "htons");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostshort);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hostshort;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_winsock_inet_addr(void* cp) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "inet_addr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cp);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)cp;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_winsock_inet_ntop(int32_t family, void* paddr, void* pstringbuf, uint64_t stringbufsize) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "inet_ntop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, paddr, pstringbuf, stringbufsize);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)family;
    (void)paddr;
    (void)pstringbuf;
    (void)stringbufsize;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_inet_pton(int32_t family, void* pszaddrstring, void* paddrbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "inet_pton");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, pszaddrstring, paddrbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)family;
    (void)pszaddrstring;
    (void)paddrbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_ioctlsocket(uint64_t s, int32_t cmd, void* argp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ioctlsocket");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, cmd, argp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)cmd;
    (void)argp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_listen(uint64_t s, int32_t backlog) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "listen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, backlog);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)backlog;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_winsock_ntohl(uint32_t netlong) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ntohl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(netlong);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)netlong;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_networking_winsock_ntohs(uint16_t netshort) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ntohs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(netshort);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)netshort;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_recv(uint64_t s, void* buf, int32_t len, int32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "recv");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, buf, len, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_recvfrom(uint64_t s, void* buf, int32_t len, int32_t flags, void* from, void* fromlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "recvfrom");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, buf, len, flags, from, fromlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    (void)from;
    (void)fromlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_select(int32_t nfds, void* readfds, void* writefds, void* exceptfds, void* timeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "select");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nfds, readfds, writefds, exceptfds, timeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nfds;
    (void)readfds;
    (void)writefds;
    (void)exceptfds;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_send(uint64_t s, void* buf, int32_t len, int32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "send");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, buf, len, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_sendto(uint64_t s, void* buf, int32_t len, int32_t flags, void* to, int32_t tolen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "sendto");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, buf, len, flags, to, tolen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    (void)to;
    (void)tolen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_setsockopt(uint64_t s, int32_t level, int32_t optname, void* optval, int32_t optlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "setsockopt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, level, optname, optval, optlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)level;
    (void)optname;
    (void)optval;
    (void)optlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_winsock_shutdown(uint64_t s, int32_t how) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "shutdown");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, how);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)how;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_networking_winsock_socket(int32_t af, int32_t type, int32_t protocol) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "socket");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(af, type, protocol);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)af;
    (void)type;
    (void)protocol;
    errno = ENOSYS;
    return 0;
#endif
}

