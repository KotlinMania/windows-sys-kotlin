#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdlib.h>
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1acceptEx(JNIEnv* km_env, jclass km_clazz, jlong slistensocket, jlong sacceptsocket, jlong lpoutputbuffer, jint dwreceivedatalength, jint dwlocaladdresslength, jint dwremoteaddresslength, jlong lpdwbytesreceived, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcceptEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)slistensocket, (uint64_t)sacceptsocket, (void*)(uintptr_t)lpoutputbuffer, (uint32_t)dwreceivedatalength, (uint32_t)dwlocaladdresslength, (uint32_t)dwremoteaddresslength, (void*)(uintptr_t)lpdwbytesreceived, (void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1enumProtocolsA(JNIEnv* km_env, jclass km_clazz, jlong lpiprotocols, jlong lpprotocolbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumProtocolsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpiprotocols, (void*)(uintptr_t)lpprotocolbuffer, (void*)(uintptr_t)lpdwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1enumProtocolsW(JNIEnv* km_env, jclass km_clazz, jlong lpiprotocols, jlong lpprotocolbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumProtocolsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpiprotocols, (void*)(uintptr_t)lpprotocolbuffer, (void*)(uintptr_t)lpdwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1freeAddrInfoEx(JNIEnv* km_env, jclass km_clazz, jlong paddrinfoex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeAddrInfoEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)paddrinfoex);
    } else {
        errno = ENOSYS;
    }
#else
    (void)paddrinfoex;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1freeAddrInfoExW(JNIEnv* km_env, jclass km_clazz, jlong paddrinfoex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeAddrInfoExW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)paddrinfoex);
    } else {
        errno = ENOSYS;
    }
#else
    (void)paddrinfoex;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1freeAddrInfoW(JNIEnv* km_env, jclass km_clazz, jlong paddrinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeAddrInfoW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)paddrinfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)paddrinfo;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getAcceptExSockaddrs(JNIEnv* km_env, jclass km_clazz, jlong lpoutputbuffer, jint dwreceivedatalength, jint dwlocaladdresslength, jint dwremoteaddresslength, jlong localsockaddr, jlong localsockaddrlength, jlong remotesockaddr, jlong remotesockaddrlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAcceptExSockaddrs");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpoutputbuffer, (uint32_t)dwreceivedatalength, (uint32_t)dwlocaladdresslength, (uint32_t)dwremoteaddresslength, (void*)(uintptr_t)localsockaddr, (void*)(uintptr_t)localsockaddrlength, (void*)(uintptr_t)remotesockaddr, (void*)(uintptr_t)remotesockaddrlength);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getAddrInfoExA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong pservicename, jint dwnamespace, jlong lpnspid, jlong hints, jlong ppresult, jlong timeout, jlong lpoverlapped, jlong lpcompletionroutine, jlong lpnamehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddrInfoExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)pservicename, (uint32_t)dwnamespace, (void*)(uintptr_t)lpnspid, (void*)(uintptr_t)hints, (void*)(uintptr_t)ppresult, (void*)(uintptr_t)timeout, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine, (void*)(uintptr_t)lpnamehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getAddrInfoExCancel(JNIEnv* km_env, jclass km_clazz, jlong lphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddrInfoExCancel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lphandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lphandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getAddrInfoExOverlappedResult(JNIEnv* km_env, jclass km_clazz, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddrInfoExOverlappedResult");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpoverlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getAddrInfoExW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong pservicename, jint dwnamespace, jlong lpnspid, jlong hints, jlong ppresult, jlong timeout, jlong lpoverlapped, jlong lpcompletionroutine, jlong lphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddrInfoExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)pservicename, (uint32_t)dwnamespace, (void*)(uintptr_t)lpnspid, (void*)(uintptr_t)hints, (void*)(uintptr_t)ppresult, (void*)(uintptr_t)timeout, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine, (void*)(uintptr_t)lphandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getAddrInfoW(JNIEnv* km_env, jclass km_clazz, jlong pnodename, jlong pservicename, jlong phints, jlong ppresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddrInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pnodename, (void*)(uintptr_t)pservicename, (void*)(uintptr_t)phints, (void*)(uintptr_t)ppresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pnodename;
    (void)pservicename;
    (void)phints;
    (void)ppresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getAddressByNameA(JNIEnv* km_env, jclass km_clazz, jint dwnamespace, jlong lpservicetype, jlong lpservicename, jlong lpiprotocols, jint dwresolution, jlong lpserviceasyncinfo, jlong lpcsaddrbuffer, jlong lpdwbufferlength, jlong lpaliasbuffer, jlong lpdwaliasbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddressByNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwnamespace, (void*)(uintptr_t)lpservicetype, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpiprotocols, (uint32_t)dwresolution, (void*)(uintptr_t)lpserviceasyncinfo, (void*)(uintptr_t)lpcsaddrbuffer, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpaliasbuffer, (void*)(uintptr_t)lpdwaliasbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getAddressByNameW(JNIEnv* km_env, jclass km_clazz, jint dwnamespace, jlong lpservicetype, jlong lpservicename, jlong lpiprotocols, jint dwresolution, jlong lpserviceasyncinfo, jlong lpcsaddrbuffer, jlong lpdwbufferlength, jlong lpaliasbuffer, jlong lpdwaliasbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddressByNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwnamespace, (void*)(uintptr_t)lpservicetype, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpiprotocols, (uint32_t)dwresolution, (void*)(uintptr_t)lpserviceasyncinfo, (void*)(uintptr_t)lpcsaddrbuffer, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpaliasbuffer, (void*)(uintptr_t)lpdwaliasbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getHostNameW(JNIEnv* km_env, jclass km_clazz, jlong name, jint namelen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetHostNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (int32_t)namelen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)name;
    (void)namelen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getNameByTypeA(JNIEnv* km_env, jclass km_clazz, jlong lpservicetype, jlong lpservicename, jint dwnamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNameByTypeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpservicetype, (void*)(uintptr_t)lpservicename, (uint32_t)dwnamelength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpservicetype;
    (void)lpservicename;
    (void)dwnamelength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getNameByTypeW(JNIEnv* km_env, jclass km_clazz, jlong lpservicetype, jlong lpservicename, jint dwnamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNameByTypeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpservicetype, (void*)(uintptr_t)lpservicename, (uint32_t)dwnamelength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpservicetype;
    (void)lpservicename;
    (void)dwnamelength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getNameInfoW(JNIEnv* km_env, jclass km_clazz, jlong psockaddr, jint sockaddrlength, jlong pnodebuffer, jint nodebuffersize, jlong pservicebuffer, jint servicebuffersize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNameInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psockaddr, (int32_t)sockaddrlength, (void*)(uintptr_t)pnodebuffer, (uint32_t)nodebuffersize, (void*)(uintptr_t)pservicebuffer, (uint32_t)servicebuffersize, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psockaddr;
    (void)sockaddrlength;
    (void)pnodebuffer;
    (void)nodebuffersize;
    (void)pservicebuffer;
    (void)servicebuffersize;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getServiceA(JNIEnv* km_env, jclass km_clazz, jint dwnamespace, jlong lpguid, jlong lpservicename, jint dwproperties, jlong lpbuffer, jlong lpdwbuffersize, jlong lpserviceasyncinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwnamespace, (void*)(uintptr_t)lpguid, (void*)(uintptr_t)lpservicename, (uint32_t)dwproperties, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwbuffersize, (void*)(uintptr_t)lpserviceasyncinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwnamespace;
    (void)lpguid;
    (void)lpservicename;
    (void)dwproperties;
    (void)lpbuffer;
    (void)lpdwbuffersize;
    (void)lpserviceasyncinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getServiceW(JNIEnv* km_env, jclass km_clazz, jint dwnamespace, jlong lpguid, jlong lpservicename, jint dwproperties, jlong lpbuffer, jlong lpdwbuffersize, jlong lpserviceasyncinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwnamespace, (void*)(uintptr_t)lpguid, (void*)(uintptr_t)lpservicename, (uint32_t)dwproperties, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwbuffersize, (void*)(uintptr_t)lpserviceasyncinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwnamespace;
    (void)lpguid;
    (void)lpservicename;
    (void)dwproperties;
    (void)lpbuffer;
    (void)lpdwbuffersize;
    (void)lpserviceasyncinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getTypeByNameA(JNIEnv* km_env, jclass km_clazz, jlong lpservicename, jlong lpservicetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTypeByNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpservicetype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpservicename;
    (void)lpservicetype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getTypeByNameW(JNIEnv* km_env, jclass km_clazz, jlong lpservicename, jlong lpservicetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTypeByNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpservicetype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpservicename;
    (void)lpservicetype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1inetNtopW(JNIEnv* km_env, jclass km_clazz, jint family, jlong paddr, jlong pstringbuf, jlong stringbufsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InetNtopW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)family, (void*)(uintptr_t)paddr, (void*)(uintptr_t)pstringbuf, (uint64_t)stringbufsize);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)family;
    (void)paddr;
    (void)pstringbuf;
    (void)stringbufsize;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1inetPtonW(JNIEnv* km_env, jclass km_clazz, jint family, jlong pszaddrstring, jlong paddrbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InetPtonW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)family, (void*)(uintptr_t)pszaddrstring, (void*)(uintptr_t)paddrbuf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)family;
    (void)pszaddrstring;
    (void)paddrbuf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1processSocketNotifications(JNIEnv* km_env, jclass km_clazz, jlong completionport, jint registrationcount, jlong registrationinfos, jint timeoutms, jint completioncount, jlong completionportentries, jlong receivedentrycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessSocketNotifications");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)completionport, (uint32_t)registrationcount, (void*)(uintptr_t)registrationinfos, (uint32_t)timeoutms, (uint32_t)completioncount, (void*)(uintptr_t)completionportentries, (void*)(uintptr_t)receivedentrycount);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)completionport;
    (void)registrationcount;
    (void)registrationinfos;
    (void)timeoutms;
    (void)completioncount;
    (void)completionportentries;
    (void)receivedentrycount;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlEthernetAddressToStringA(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEthernetAddressToStringA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addr, (void*)(uintptr_t)s);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)addr;
    (void)s;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlEthernetAddressToStringW(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEthernetAddressToStringW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addr, (void*)(uintptr_t)s);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)addr;
    (void)s;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlEthernetStringToAddressA(JNIEnv* km_env, jclass km_clazz, jlong s, jlong terminator, jlong addr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEthernetStringToAddressA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)s, (void*)(uintptr_t)terminator, (void*)(uintptr_t)addr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)terminator;
    (void)addr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlEthernetStringToAddressW(JNIEnv* km_env, jclass km_clazz, jlong s, jlong terminator, jlong addr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEthernetStringToAddressW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)s, (void*)(uintptr_t)terminator, (void*)(uintptr_t)addr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)terminator;
    (void)addr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv4AddressToStringA(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4AddressToStringA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addr, (void*)(uintptr_t)s);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)addr;
    (void)s;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv4AddressToStringExA(JNIEnv* km_env, jclass km_clazz, jlong address, jshort port, jlong addressstring, jlong addressstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4AddressToStringExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address, (uint16_t)port, (void*)(uintptr_t)addressstring, (void*)(uintptr_t)addressstringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)address;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv4AddressToStringExW(JNIEnv* km_env, jclass km_clazz, jlong address, jshort port, jlong addressstring, jlong addressstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4AddressToStringExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address, (uint16_t)port, (void*)(uintptr_t)addressstring, (void*)(uintptr_t)addressstringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)address;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv4AddressToStringW(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4AddressToStringW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addr, (void*)(uintptr_t)s);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)addr;
    (void)s;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv4StringToAddressA(JNIEnv* km_env, jclass km_clazz, jlong s, jboolean strict, jlong terminator, jlong addr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4StringToAddressA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)s, (bool)strict, (void*)(uintptr_t)terminator, (void*)(uintptr_t)addr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)strict;
    (void)terminator;
    (void)addr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv4StringToAddressExA(JNIEnv* km_env, jclass km_clazz, jlong addressstring, jboolean strict, jlong address, jlong port) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4StringToAddressExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addressstring, (bool)strict, (void*)(uintptr_t)address, (void*)(uintptr_t)port);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)addressstring;
    (void)strict;
    (void)address;
    (void)port;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv4StringToAddressExW(JNIEnv* km_env, jclass km_clazz, jlong addressstring, jboolean strict, jlong address, jlong port) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4StringToAddressExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addressstring, (bool)strict, (void*)(uintptr_t)address, (void*)(uintptr_t)port);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)addressstring;
    (void)strict;
    (void)address;
    (void)port;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv4StringToAddressW(JNIEnv* km_env, jclass km_clazz, jlong s, jboolean strict, jlong terminator, jlong addr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4StringToAddressW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)s, (bool)strict, (void*)(uintptr_t)terminator, (void*)(uintptr_t)addr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)strict;
    (void)terminator;
    (void)addr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv6AddressToStringA(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6AddressToStringA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addr, (void*)(uintptr_t)s);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)addr;
    (void)s;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv6AddressToStringExA(JNIEnv* km_env, jclass km_clazz, jlong address, jint scopeid, jshort port, jlong addressstring, jlong addressstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6AddressToStringExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address, (uint32_t)scopeid, (uint16_t)port, (void*)(uintptr_t)addressstring, (void*)(uintptr_t)addressstringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)address;
    (void)scopeid;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv6AddressToStringExW(JNIEnv* km_env, jclass km_clazz, jlong address, jint scopeid, jshort port, jlong addressstring, jlong addressstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6AddressToStringExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address, (uint32_t)scopeid, (uint16_t)port, (void*)(uintptr_t)addressstring, (void*)(uintptr_t)addressstringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)address;
    (void)scopeid;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv6AddressToStringW(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6AddressToStringW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addr, (void*)(uintptr_t)s);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)addr;
    (void)s;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv6StringToAddressA(JNIEnv* km_env, jclass km_clazz, jlong s, jlong terminator, jlong addr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6StringToAddressA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)s, (void*)(uintptr_t)terminator, (void*)(uintptr_t)addr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)terminator;
    (void)addr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv6StringToAddressExA(JNIEnv* km_env, jclass km_clazz, jlong addressstring, jlong address, jlong scopeid, jlong port) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6StringToAddressExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addressstring, (void*)(uintptr_t)address, (void*)(uintptr_t)scopeid, (void*)(uintptr_t)port);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)addressstring;
    (void)address;
    (void)scopeid;
    (void)port;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv6StringToAddressExW(JNIEnv* km_env, jclass km_clazz, jlong addressstring, jlong address, jlong scopeid, jlong port) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6StringToAddressExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addressstring, (void*)(uintptr_t)address, (void*)(uintptr_t)scopeid, (void*)(uintptr_t)port);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)addressstring;
    (void)address;
    (void)scopeid;
    (void)port;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1rtlIpv6StringToAddressW(JNIEnv* km_env, jclass km_clazz, jlong s, jlong terminator, jlong addr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6StringToAddressW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)s, (void*)(uintptr_t)terminator, (void*)(uintptr_t)addr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)terminator;
    (void)addr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1setAddrInfoExA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong pservicename, jlong paddresses, jint dwaddresscount, jlong lpblob, jint dwflags, jint dwnamespace, jlong lpnspid, jlong timeout, jlong lpoverlapped, jlong lpcompletionroutine, jlong lpnamehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAddrInfoExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)pservicename, (void*)(uintptr_t)paddresses, (uint32_t)dwaddresscount, (void*)(uintptr_t)lpblob, (uint32_t)dwflags, (uint32_t)dwnamespace, (void*)(uintptr_t)lpnspid, (void*)(uintptr_t)timeout, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine, (void*)(uintptr_t)lpnamehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1setAddrInfoExW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong pservicename, jlong paddresses, jint dwaddresscount, jlong lpblob, jint dwflags, jint dwnamespace, jlong lpnspid, jlong timeout, jlong lpoverlapped, jlong lpcompletionroutine, jlong lpnamehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAddrInfoExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)pservicename, (void*)(uintptr_t)paddresses, (uint32_t)dwaddresscount, (void*)(uintptr_t)lpblob, (uint32_t)dwflags, (uint32_t)dwnamespace, (void*)(uintptr_t)lpnspid, (void*)(uintptr_t)timeout, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine, (void*)(uintptr_t)lpnamehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1setServiceA(JNIEnv* km_env, jclass km_clazz, jint dwnamespace, jint dwoperation, jint dwflags, jlong lpserviceinfo, jlong lpserviceasyncinfo, jlong lpdwstatusflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwnamespace, (uint32_t)dwoperation, (uint32_t)dwflags, (void*)(uintptr_t)lpserviceinfo, (void*)(uintptr_t)lpserviceasyncinfo, (void*)(uintptr_t)lpdwstatusflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwnamespace;
    (void)dwoperation;
    (void)dwflags;
    (void)lpserviceinfo;
    (void)lpserviceasyncinfo;
    (void)lpdwstatusflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1setServiceW(JNIEnv* km_env, jclass km_clazz, jint dwnamespace, jint dwoperation, jint dwflags, jlong lpserviceinfo, jlong lpserviceasyncinfo, jlong lpdwstatusflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwnamespace, (uint32_t)dwoperation, (uint32_t)dwflags, (void*)(uintptr_t)lpserviceinfo, (void*)(uintptr_t)lpserviceasyncinfo, (void*)(uintptr_t)lpdwstatusflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwnamespace;
    (void)dwoperation;
    (void)dwflags;
    (void)lpserviceinfo;
    (void)lpserviceasyncinfo;
    (void)lpdwstatusflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1setSocketMediaStreamingMode(JNIEnv* km_env, jclass km_clazz, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.networking.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSocketMediaStreamingMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1transmitFile(JNIEnv* km_env, jclass km_clazz, jlong hsocket, jlong hfile, jint nnumberofbytestowrite, jint nnumberofbytespersend, jlong lpoverlapped, jlong lptransmitbuffers, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransmitFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsocket, (void*)(uintptr_t)hfile, (uint32_t)nnumberofbytestowrite, (uint32_t)nnumberofbytespersend, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lptransmitbuffers, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsocket;
    (void)hfile;
    (void)nnumberofbytestowrite;
    (void)nnumberofbytespersend;
    (void)lpoverlapped;
    (void)lptransmitbuffers;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wPUCompleteOverlappedRequest(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpoverlapped, jint dwerror, jint cbtransferred, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WPUCompleteOverlappedRequest");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpoverlapped, (uint32_t)dwerror, (uint32_t)cbtransferred, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)lpoverlapped;
    (void)dwerror;
    (void)cbtransferred;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAAccept(JNIEnv* km_env, jclass km_clazz, jlong s, jlong addr, jlong addrlen, jlong lpfncondition, jlong dwcallbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAccept");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)addr, (void*)(uintptr_t)addrlen, (void*)(uintptr_t)lpfncondition, (uint64_t)dwcallbackdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)s;
    (void)addr;
    (void)addrlen;
    (void)lpfncondition;
    (void)dwcallbackdata;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAAddressToStringA(JNIEnv* km_env, jclass km_clazz, jlong lpsaaddress, jint dwaddresslength, jlong lpprotocolinfo, jlong lpszaddressstring, jlong lpdwaddressstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAddressToStringA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsaaddress, (uint32_t)dwaddresslength, (void*)(uintptr_t)lpprotocolinfo, (void*)(uintptr_t)lpszaddressstring, (void*)(uintptr_t)lpdwaddressstringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsaaddress;
    (void)dwaddresslength;
    (void)lpprotocolinfo;
    (void)lpszaddressstring;
    (void)lpdwaddressstringlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAAddressToStringW(JNIEnv* km_env, jclass km_clazz, jlong lpsaaddress, jint dwaddresslength, jlong lpprotocolinfo, jlong lpszaddressstring, jlong lpdwaddressstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAddressToStringW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsaaddress, (uint32_t)dwaddresslength, (void*)(uintptr_t)lpprotocolinfo, (void*)(uintptr_t)lpszaddressstring, (void*)(uintptr_t)lpdwaddressstringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsaaddress;
    (void)dwaddresslength;
    (void)lpprotocolinfo;
    (void)lpszaddressstring;
    (void)lpdwaddressstringlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAAdvertiseProvider(JNIEnv* km_env, jclass km_clazz, jlong puuidproviderid, jlong pnspv2routine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAdvertiseProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)puuidproviderid, (void*)(uintptr_t)pnspv2routine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)puuidproviderid;
    (void)pnspv2routine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAAsyncGetHostByAddr(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg, jlong addr, jint len, jint type, jlong buf, jint buflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetHostByAddr");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg, (void*)(uintptr_t)addr, (int32_t)len, (int32_t)type, (void*)(uintptr_t)buf, (int32_t)buflen);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hwnd;
    (void)wmsg;
    (void)addr;
    (void)len;
    (void)type;
    (void)buf;
    (void)buflen;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAAsyncGetHostByName(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg, jlong name, jlong buf, jint buflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetHostByName");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg, (void*)(uintptr_t)name, (void*)(uintptr_t)buf, (int32_t)buflen);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hwnd;
    (void)wmsg;
    (void)name;
    (void)buf;
    (void)buflen;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAAsyncGetProtoByName(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg, jlong name, jlong buf, jint buflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetProtoByName");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg, (void*)(uintptr_t)name, (void*)(uintptr_t)buf, (int32_t)buflen);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hwnd;
    (void)wmsg;
    (void)name;
    (void)buf;
    (void)buflen;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAAsyncGetProtoByNumber(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg, jint number, jlong buf, jint buflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetProtoByNumber");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg, (int32_t)number, (void*)(uintptr_t)buf, (int32_t)buflen);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hwnd;
    (void)wmsg;
    (void)number;
    (void)buf;
    (void)buflen;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAAsyncGetServByName(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg, jlong name, jlong proto, jlong buf, jint buflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetServByName");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg, (void*)(uintptr_t)name, (void*)(uintptr_t)proto, (void*)(uintptr_t)buf, (int32_t)buflen);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hwnd;
    (void)wmsg;
    (void)name;
    (void)proto;
    (void)buf;
    (void)buflen;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAAsyncGetServByPort(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg, jint port, jlong proto, jlong buf, jint buflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetServByPort");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg, (int32_t)port, (void*)(uintptr_t)proto, (void*)(uintptr_t)buf, (int32_t)buflen);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hwnd;
    (void)wmsg;
    (void)port;
    (void)proto;
    (void)buf;
    (void)buflen;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAAsyncSelect(JNIEnv* km_env, jclass km_clazz, jlong s, jlong hwnd, jint wmsg, jint levent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncSelect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)hwnd, (uint32_t)wmsg, (int32_t)levent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)hwnd;
    (void)wmsg;
    (void)levent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSACancelAsyncRequest(JNIEnv* km_env, jclass km_clazz, jlong hasynctaskhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSACancelAsyncRequest");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hasynctaskhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hasynctaskhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSACancelBlockingCall(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSACancelBlockingCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSACleanup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSACleanup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSACloseEvent(JNIEnv* km_env, jclass km_clazz, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSACloseEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAConnect(JNIEnv* km_env, jclass km_clazz, jlong s, jlong name, jint namelen, jlong lpcallerdata, jlong lpcalleedata, jlong lpsqos, jlong lpgqos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAConnect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)name, (int32_t)namelen, (void*)(uintptr_t)lpcallerdata, (void*)(uintptr_t)lpcalleedata, (void*)(uintptr_t)lpsqos, (void*)(uintptr_t)lpgqos);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)name;
    (void)namelen;
    (void)lpcallerdata;
    (void)lpcalleedata;
    (void)lpsqos;
    (void)lpgqos;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAConnectByList(JNIEnv* km_env, jclass km_clazz, jlong s, jlong socketaddress, jlong localaddresslength, jlong localaddress, jlong remoteaddresslength, jlong remoteaddress, jlong timeout, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAConnectByList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)socketaddress, (void*)(uintptr_t)localaddresslength, (void*)(uintptr_t)localaddress, (void*)(uintptr_t)remoteaddresslength, (void*)(uintptr_t)remoteaddress, (void*)(uintptr_t)timeout, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAConnectByNameA(JNIEnv* km_env, jclass km_clazz, jlong s, jlong nodename, jlong servicename, jlong localaddresslength, jlong localaddress, jlong remoteaddresslength, jlong remoteaddress, jlong timeout, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAConnectByNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)nodename, (void*)(uintptr_t)servicename, (void*)(uintptr_t)localaddresslength, (void*)(uintptr_t)localaddress, (void*)(uintptr_t)remoteaddresslength, (void*)(uintptr_t)remoteaddress, (void*)(uintptr_t)timeout, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAConnectByNameW(JNIEnv* km_env, jclass km_clazz, jlong s, jlong nodename, jlong servicename, jlong localaddresslength, jlong localaddress, jlong remoteaddresslength, jlong remoteaddress, jlong timeout, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAConnectByNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)nodename, (void*)(uintptr_t)servicename, (void*)(uintptr_t)localaddresslength, (void*)(uintptr_t)localaddress, (void*)(uintptr_t)remoteaddresslength, (void*)(uintptr_t)remoteaddress, (void*)(uintptr_t)timeout, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSACreateEvent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSACreateEvent");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSADeleteSocketPeerTargetName(JNIEnv* km_env, jclass km_clazz, jlong arg_0_socket, jlong peeraddr, jint peeraddrlen, jlong overlapped, jlong completionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSADeleteSocketPeerTargetName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)arg_0_socket, (void*)(uintptr_t)peeraddr, (uint32_t)peeraddrlen, (void*)(uintptr_t)overlapped, (void*)(uintptr_t)completionroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_socket;
    (void)peeraddr;
    (void)peeraddrlen;
    (void)overlapped;
    (void)completionroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSADuplicateSocketA(JNIEnv* km_env, jclass km_clazz, jlong s, jint dwprocessid, jlong lpprotocolinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSADuplicateSocketA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (uint32_t)dwprocessid, (void*)(uintptr_t)lpprotocolinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)dwprocessid;
    (void)lpprotocolinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSADuplicateSocketW(JNIEnv* km_env, jclass km_clazz, jlong s, jint dwprocessid, jlong lpprotocolinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSADuplicateSocketW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (uint32_t)dwprocessid, (void*)(uintptr_t)lpprotocolinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)dwprocessid;
    (void)lpprotocolinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAEnumNameSpaceProvidersA(JNIEnv* km_env, jclass km_clazz, jlong lpdwbufferlength, jlong lpnspbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpnspbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAEnumNameSpaceProvidersExA(JNIEnv* km_env, jclass km_clazz, jlong lpdwbufferlength, jlong lpnspbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpnspbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAEnumNameSpaceProvidersExW(JNIEnv* km_env, jclass km_clazz, jlong lpdwbufferlength, jlong lpnspbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpnspbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAEnumNameSpaceProvidersW(JNIEnv* km_env, jclass km_clazz, jlong lpdwbufferlength, jlong lpnspbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpnspbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAEnumNetworkEvents(JNIEnv* km_env, jclass km_clazz, jlong s, jlong heventobject, jlong lpnetworkevents) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumNetworkEvents");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (int64_t)heventobject, (void*)(uintptr_t)lpnetworkevents);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)heventobject;
    (void)lpnetworkevents;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAEnumProtocolsA(JNIEnv* km_env, jclass km_clazz, jlong lpiprotocols, jlong lpprotocolbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumProtocolsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpiprotocols, (void*)(uintptr_t)lpprotocolbuffer, (void*)(uintptr_t)lpdwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAEnumProtocolsW(JNIEnv* km_env, jclass km_clazz, jlong lpiprotocols, jlong lpprotocolbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumProtocolsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpiprotocols, (void*)(uintptr_t)lpprotocolbuffer, (void*)(uintptr_t)lpdwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAEventSelect(JNIEnv* km_env, jclass km_clazz, jlong s, jlong heventobject, jint lnetworkevents) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEventSelect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (int64_t)heventobject, (int32_t)lnetworkevents);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)heventobject;
    (void)lnetworkevents;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAGetLastError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetLastError");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAGetOverlappedResult(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpoverlapped, jlong lpcbtransfer, jint fwait, jlong lpdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetOverlappedResult");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcbtransfer, (int32_t)fwait, (void*)(uintptr_t)lpdwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)lpoverlapped;
    (void)lpcbtransfer;
    (void)fwait;
    (void)lpdwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAGetQOSByName(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpqosname, jlong lpqos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetQOSByName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpqosname, (void*)(uintptr_t)lpqos);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)lpqosname;
    (void)lpqos;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAGetServiceClassInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpserviceclassid, jlong lpdwbufsize, jlong lpserviceclassinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetServiceClassInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpserviceclassid, (void*)(uintptr_t)lpdwbufsize, (void*)(uintptr_t)lpserviceclassinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)lpserviceclassid;
    (void)lpdwbufsize;
    (void)lpserviceclassinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAGetServiceClassInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpserviceclassid, jlong lpdwbufsize, jlong lpserviceclassinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetServiceClassInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpserviceclassid, (void*)(uintptr_t)lpdwbufsize, (void*)(uintptr_t)lpserviceclassinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)lpserviceclassid;
    (void)lpdwbufsize;
    (void)lpserviceclassinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAGetServiceClassNameByClassIdA(JNIEnv* km_env, jclass km_clazz, jlong lpserviceclassid, jlong lpszserviceclassname, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetServiceClassNameByClassIdA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpserviceclassid, (void*)(uintptr_t)lpszserviceclassname, (void*)(uintptr_t)lpdwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpserviceclassid;
    (void)lpszserviceclassname;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAGetServiceClassNameByClassIdW(JNIEnv* km_env, jclass km_clazz, jlong lpserviceclassid, jlong lpszserviceclassname, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetServiceClassNameByClassIdW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpserviceclassid, (void*)(uintptr_t)lpszserviceclassname, (void*)(uintptr_t)lpdwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpserviceclassid;
    (void)lpszserviceclassname;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAHtonl(JNIEnv* km_env, jclass km_clazz, jlong s, jint hostlong, jlong lpnetlong) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAHtonl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (uint32_t)hostlong, (void*)(uintptr_t)lpnetlong);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)hostlong;
    (void)lpnetlong;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAHtons(JNIEnv* km_env, jclass km_clazz, jlong s, jshort hostshort, jlong lpnetshort) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAHtons");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (uint16_t)hostshort, (void*)(uintptr_t)lpnetshort);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)hostshort;
    (void)lpnetshort;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAImpersonateSocketPeer(JNIEnv* km_env, jclass km_clazz, jlong arg_0_socket, jlong peeraddr, jint peeraddrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAImpersonateSocketPeer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)arg_0_socket, (void*)(uintptr_t)peeraddr, (uint32_t)peeraddrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_socket;
    (void)peeraddr;
    (void)peeraddrlen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAInstallServiceClassA(JNIEnv* km_env, jclass km_clazz, jlong lpserviceclassinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAInstallServiceClassA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpserviceclassinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpserviceclassinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAInstallServiceClassW(JNIEnv* km_env, jclass km_clazz, jlong lpserviceclassinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAInstallServiceClassW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpserviceclassinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpserviceclassinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAIoctl(JNIEnv* km_env, jclass km_clazz, jlong s, jint dwiocontrolcode, jlong lpvinbuffer, jint cbinbuffer, jlong lpvoutbuffer, jint cboutbuffer, jlong lpcbbytesreturned, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAIoctl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (uint32_t)dwiocontrolcode, (void*)(uintptr_t)lpvinbuffer, (uint32_t)cbinbuffer, (void*)(uintptr_t)lpvoutbuffer, (uint32_t)cboutbuffer, (void*)(uintptr_t)lpcbbytesreturned, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAIsBlocking(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAIsBlocking");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAJoinLeaf(JNIEnv* km_env, jclass km_clazz, jlong s, jlong name, jint namelen, jlong lpcallerdata, jlong lpcalleedata, jlong lpsqos, jlong lpgqos, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAJoinLeaf");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)name, (int32_t)namelen, (void*)(uintptr_t)lpcallerdata, (void*)(uintptr_t)lpcalleedata, (void*)(uintptr_t)lpsqos, (void*)(uintptr_t)lpgqos, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSALookupServiceBeginA(JNIEnv* km_env, jclass km_clazz, jlong lpqsrestrictions, jint dwcontrolflags, jlong lphlookup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSALookupServiceBeginA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpqsrestrictions, (uint32_t)dwcontrolflags, (void*)(uintptr_t)lphlookup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpqsrestrictions;
    (void)dwcontrolflags;
    (void)lphlookup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSALookupServiceBeginW(JNIEnv* km_env, jclass km_clazz, jlong lpqsrestrictions, jint dwcontrolflags, jlong lphlookup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSALookupServiceBeginW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpqsrestrictions, (uint32_t)dwcontrolflags, (void*)(uintptr_t)lphlookup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpqsrestrictions;
    (void)dwcontrolflags;
    (void)lphlookup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSALookupServiceEnd(JNIEnv* km_env, jclass km_clazz, jlong hlookup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSALookupServiceEnd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlookup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlookup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSALookupServiceNextA(JNIEnv* km_env, jclass km_clazz, jlong hlookup, jint dwcontrolflags, jlong lpdwbufferlength, jlong lpqsresults) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSALookupServiceNextA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlookup, (uint32_t)dwcontrolflags, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpqsresults);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlookup;
    (void)dwcontrolflags;
    (void)lpdwbufferlength;
    (void)lpqsresults;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSALookupServiceNextW(JNIEnv* km_env, jclass km_clazz, jlong hlookup, jint dwcontrolflags, jlong lpdwbufferlength, jlong lpqsresults) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSALookupServiceNextW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlookup, (uint32_t)dwcontrolflags, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpqsresults);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlookup;
    (void)dwcontrolflags;
    (void)lpdwbufferlength;
    (void)lpqsresults;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSANSPIoctl(JNIEnv* km_env, jclass km_clazz, jlong hlookup, jint dwcontrolcode, jlong lpvinbuffer, jint cbinbuffer, jlong lpvoutbuffer, jint cboutbuffer, jlong lpcbbytesreturned, jlong lpcompletion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSANSPIoctl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlookup, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpvinbuffer, (uint32_t)cbinbuffer, (void*)(uintptr_t)lpvoutbuffer, (uint32_t)cboutbuffer, (void*)(uintptr_t)lpcbbytesreturned, (void*)(uintptr_t)lpcompletion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSANtohl(JNIEnv* km_env, jclass km_clazz, jlong s, jint netlong, jlong lphostlong) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSANtohl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (uint32_t)netlong, (void*)(uintptr_t)lphostlong);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)netlong;
    (void)lphostlong;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSANtohs(JNIEnv* km_env, jclass km_clazz, jlong s, jshort netshort, jlong lphostshort) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSANtohs");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (uint16_t)netshort, (void*)(uintptr_t)lphostshort);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)netshort;
    (void)lphostshort;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAPoll(JNIEnv* km_env, jclass km_clazz, jlong fdarray, jint fds, jint timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAPoll");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fdarray, (uint32_t)fds, (int32_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fdarray;
    (void)fds;
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAProviderCompleteAsyncCall(JNIEnv* km_env, jclass km_clazz, jlong hasynccall, jint iretcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAProviderCompleteAsyncCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hasynccall, (int32_t)iretcode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hasynccall;
    (void)iretcode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAProviderConfigChange(JNIEnv* km_env, jclass km_clazz, jlong lpnotificationhandle, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAProviderConfigChange");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpnotificationhandle, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpnotificationhandle;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAQuerySocketSecurity(JNIEnv* km_env, jclass km_clazz, jlong arg_0_socket, jlong securityquerytemplate, jint securityquerytemplatelen, jlong securityqueryinfo, jlong securityqueryinfolen, jlong overlapped, jlong completionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAQuerySocketSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)arg_0_socket, (void*)(uintptr_t)securityquerytemplate, (uint32_t)securityquerytemplatelen, (void*)(uintptr_t)securityqueryinfo, (void*)(uintptr_t)securityqueryinfolen, (void*)(uintptr_t)overlapped, (void*)(uintptr_t)completionroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_socket;
    (void)securityquerytemplate;
    (void)securityquerytemplatelen;
    (void)securityqueryinfo;
    (void)securityqueryinfolen;
    (void)overlapped;
    (void)completionroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSARecv(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpbuffers, jint dwbuffercount, jlong lpnumberofbytesrecvd, jlong lpflags, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARecv");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpbuffers, (uint32_t)dwbuffercount, (void*)(uintptr_t)lpnumberofbytesrecvd, (void*)(uintptr_t)lpflags, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)lpbuffers;
    (void)dwbuffercount;
    (void)lpnumberofbytesrecvd;
    (void)lpflags;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSARecvDisconnect(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpinbounddisconnectdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARecvDisconnect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpinbounddisconnectdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)lpinbounddisconnectdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSARecvEx(JNIEnv* km_env, jclass km_clazz, jlong s, jlong buf, jint len, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARecvEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)buf, (int32_t)len, (void*)(uintptr_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSARecvFrom(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpbuffers, jint dwbuffercount, jlong lpnumberofbytesrecvd, jlong lpflags, jlong lpfrom, jlong lpfromlen, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARecvFrom");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpbuffers, (uint32_t)dwbuffercount, (void*)(uintptr_t)lpnumberofbytesrecvd, (void*)(uintptr_t)lpflags, (void*)(uintptr_t)lpfrom, (void*)(uintptr_t)lpfromlen, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSARemoveServiceClass(JNIEnv* km_env, jclass km_clazz, jlong lpserviceclassid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARemoveServiceClass");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpserviceclassid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpserviceclassid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAResetEvent(JNIEnv* km_env, jclass km_clazz, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAResetEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSARevertImpersonation(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARevertImpersonation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSASend(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpbuffers, jint dwbuffercount, jlong lpnumberofbytessent, jint dwflags, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpbuffers, (uint32_t)dwbuffercount, (void*)(uintptr_t)lpnumberofbytessent, (uint32_t)dwflags, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)lpbuffers;
    (void)dwbuffercount;
    (void)lpnumberofbytessent;
    (void)dwflags;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSASendDisconnect(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpoutbounddisconnectdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASendDisconnect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpoutbounddisconnectdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)lpoutbounddisconnectdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSASendMsg(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong lpmsg, jint dwflags, jlong lpnumberofbytessent, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASendMsg");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)handle, (void*)(uintptr_t)lpmsg, (uint32_t)dwflags, (void*)(uintptr_t)lpnumberofbytessent, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)lpmsg;
    (void)dwflags;
    (void)lpnumberofbytessent;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSASendTo(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpbuffers, jint dwbuffercount, jlong lpnumberofbytessent, jint dwflags, jlong lpto, jint itolen, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASendTo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpbuffers, (uint32_t)dwbuffercount, (void*)(uintptr_t)lpnumberofbytessent, (uint32_t)dwflags, (void*)(uintptr_t)lpto, (int32_t)itolen, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSASetEvent(JNIEnv* km_env, jclass km_clazz, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSASetLastError(JNIEnv* km_env, jclass km_clazz, jint ierror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetLastError");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)ierror);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ierror;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSASetServiceA(JNIEnv* km_env, jclass km_clazz, jlong lpqsreginfo, jint essoperation, jint dwcontrolflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetServiceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpqsreginfo, (int32_t)essoperation, (uint32_t)dwcontrolflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpqsreginfo;
    (void)essoperation;
    (void)dwcontrolflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSASetServiceW(JNIEnv* km_env, jclass km_clazz, jlong lpqsreginfo, jint essoperation, jint dwcontrolflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetServiceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpqsreginfo, (int32_t)essoperation, (uint32_t)dwcontrolflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpqsreginfo;
    (void)essoperation;
    (void)dwcontrolflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSASetSocketPeerTargetName(JNIEnv* km_env, jclass km_clazz, jlong arg_0_socket, jlong peertargetname, jint peertargetnamelen, jlong overlapped, jlong completionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetSocketPeerTargetName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)arg_0_socket, (void*)(uintptr_t)peertargetname, (uint32_t)peertargetnamelen, (void*)(uintptr_t)overlapped, (void*)(uintptr_t)completionroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_socket;
    (void)peertargetname;
    (void)peertargetnamelen;
    (void)overlapped;
    (void)completionroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSASetSocketSecurity(JNIEnv* km_env, jclass km_clazz, jlong arg_0_socket, jlong securitysettings, jint securitysettingslen, jlong overlapped, jlong completionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetSocketSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)arg_0_socket, (void*)(uintptr_t)securitysettings, (uint32_t)securitysettingslen, (void*)(uintptr_t)overlapped, (void*)(uintptr_t)completionroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_socket;
    (void)securitysettings;
    (void)securitysettingslen;
    (void)overlapped;
    (void)completionroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSASocketA(JNIEnv* km_env, jclass km_clazz, jint af, jint type, jint protocol, jlong lpprotocolinfo, jint g, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASocketA");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)af, (int32_t)type, (int32_t)protocol, (void*)(uintptr_t)lpprotocolinfo, (uint32_t)g, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)af;
    (void)type;
    (void)protocol;
    (void)lpprotocolinfo;
    (void)g;
    (void)dwflags;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSASocketW(JNIEnv* km_env, jclass km_clazz, jint af, jint type, jint protocol, jlong lpprotocolinfo, jint g, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASocketW");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)af, (int32_t)type, (int32_t)protocol, (void*)(uintptr_t)lpprotocolinfo, (uint32_t)g, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)af;
    (void)type;
    (void)protocol;
    (void)lpprotocolinfo;
    (void)g;
    (void)dwflags;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAStartup(JNIEnv* km_env, jclass km_clazz, jshort wversionrequested, jlong lpwsadata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAStartup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)wversionrequested, (void*)(uintptr_t)lpwsadata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wversionrequested;
    (void)lpwsadata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAStringToAddressA(JNIEnv* km_env, jclass km_clazz, jlong addressstring, jint addressfamily, jlong lpprotocolinfo, jlong lpaddress, jlong lpaddresslength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAStringToAddressA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addressstring, (int32_t)addressfamily, (void*)(uintptr_t)lpprotocolinfo, (void*)(uintptr_t)lpaddress, (void*)(uintptr_t)lpaddresslength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)addressstring;
    (void)addressfamily;
    (void)lpprotocolinfo;
    (void)lpaddress;
    (void)lpaddresslength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAStringToAddressW(JNIEnv* km_env, jclass km_clazz, jlong addressstring, jint addressfamily, jlong lpprotocolinfo, jlong lpaddress, jlong lpaddresslength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAStringToAddressW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addressstring, (int32_t)addressfamily, (void*)(uintptr_t)lpprotocolinfo, (void*)(uintptr_t)lpaddress, (void*)(uintptr_t)lpaddresslength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)addressstring;
    (void)addressfamily;
    (void)lpprotocolinfo;
    (void)lpaddress;
    (void)lpaddresslength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAUnadvertiseProvider(JNIEnv* km_env, jclass km_clazz, jlong puuidproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAUnadvertiseProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)puuidproviderid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)puuidproviderid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAUnhookBlockingHook(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAUnhookBlockingHook");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSAWaitForMultipleEvents(JNIEnv* km_env, jclass km_clazz, jint cevents, jlong lphevents, jint fwaitall, jint dwtimeout, jint falertable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAWaitForMultipleEvents");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)cevents, (void*)(uintptr_t)lphevents, (int32_t)fwaitall, (uint32_t)dwtimeout, (int32_t)falertable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)cevents;
    (void)lphevents;
    (void)fwaitall;
    (void)dwtimeout;
    (void)falertable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCDeinstallProvider(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCDeinstallProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCDeinstallProvider32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCDeinstallProvider32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCEnableNSProvider(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint fenable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnableNSProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (int32_t)fenable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)fenable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCEnableNSProvider32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint fenable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnableNSProvider32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (int32_t)fenable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)fenable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCEnumNameSpaceProviders32(JNIEnv* km_env, jclass km_clazz, jlong lpdwbufferlength, jlong lpnspbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnumNameSpaceProviders32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpnspbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCEnumNameSpaceProvidersEx32(JNIEnv* km_env, jclass km_clazz, jlong lpdwbufferlength, jlong lpnspbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnumNameSpaceProvidersEx32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpnspbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCEnumProtocols(JNIEnv* km_env, jclass km_clazz, jlong lpiprotocols, jlong lpprotocolbuffer, jlong lpdwbufferlength, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnumProtocols");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpiprotocols, (void*)(uintptr_t)lpprotocolbuffer, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCEnumProtocols32(JNIEnv* km_env, jclass km_clazz, jlong lpiprotocols, jlong lpprotocolbuffer, jlong lpdwbufferlength, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnumProtocols32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpiprotocols, (void*)(uintptr_t)lpprotocolbuffer, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCGetApplicationCategory(JNIEnv* km_env, jclass km_clazz, jlong path, jint pathlength, jlong extra, jint extralength, jlong ppermittedlspcategories, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCGetApplicationCategory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (uint32_t)pathlength, (void*)(uintptr_t)extra, (uint32_t)extralength, (void*)(uintptr_t)ppermittedlspcategories, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)pathlength;
    (void)extra;
    (void)extralength;
    (void)ppermittedlspcategories;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCGetProviderInfo(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint infotype, jlong info, jlong infosize, jint flags, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCGetProviderInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (int32_t)infotype, (void*)(uintptr_t)info, (void*)(uintptr_t)infosize, (uint32_t)flags, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCGetProviderInfo32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint infotype, jlong info, jlong infosize, jint flags, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCGetProviderInfo32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (int32_t)infotype, (void*)(uintptr_t)info, (void*)(uintptr_t)infosize, (uint32_t)flags, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCGetProviderPath(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpszproviderdllpath, jlong lpproviderdllpathlen, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCGetProviderPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpszproviderdllpath, (void*)(uintptr_t)lpproviderdllpathlen, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpproviderdllpathlen;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCGetProviderPath32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpszproviderdllpath, jlong lpproviderdllpathlen, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCGetProviderPath32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpszproviderdllpath, (void*)(uintptr_t)lpproviderdllpathlen, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpproviderdllpathlen;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCInstallNameSpace(JNIEnv* km_env, jclass km_clazz, jlong lpszidentifier, jlong lpszpathname, jint dwnamespace, jint dwversion, jlong lpproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallNameSpace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszidentifier, (void*)(uintptr_t)lpszpathname, (uint32_t)dwnamespace, (uint32_t)dwversion, (void*)(uintptr_t)lpproviderid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCInstallNameSpace32(JNIEnv* km_env, jclass km_clazz, jlong lpszidentifier, jlong lpszpathname, jint dwnamespace, jint dwversion, jlong lpproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallNameSpace32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszidentifier, (void*)(uintptr_t)lpszpathname, (uint32_t)dwnamespace, (uint32_t)dwversion, (void*)(uintptr_t)lpproviderid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCInstallNameSpaceEx(JNIEnv* km_env, jclass km_clazz, jlong lpszidentifier, jlong lpszpathname, jint dwnamespace, jint dwversion, jlong lpproviderid, jlong lpproviderspecific) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallNameSpaceEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszidentifier, (void*)(uintptr_t)lpszpathname, (uint32_t)dwnamespace, (uint32_t)dwversion, (void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpproviderspecific);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    (void)lpproviderspecific;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCInstallNameSpaceEx32(JNIEnv* km_env, jclass km_clazz, jlong lpszidentifier, jlong lpszpathname, jint dwnamespace, jint dwversion, jlong lpproviderid, jlong lpproviderspecific) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallNameSpaceEx32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszidentifier, (void*)(uintptr_t)lpszpathname, (uint32_t)dwnamespace, (uint32_t)dwversion, (void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpproviderspecific);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    (void)lpproviderspecific;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCInstallProvider(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpszproviderdllpath, jlong lpprotocolinfolist, jint dwnumberofentries, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpszproviderdllpath, (void*)(uintptr_t)lpprotocolinfolist, (uint32_t)dwnumberofentries, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wscinstallProvider6432(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpszproviderdllpath, jlong lpprotocolinfolist, jint dwnumberofentries, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallProvider64_32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpszproviderdllpath, (void*)(uintptr_t)lpprotocolinfolist, (uint32_t)dwnumberofentries, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wscinstallProviderAndChains6432(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpszproviderdllpath, jlong lpszproviderdllpath32, jlong lpszlspname, jint dwserviceflags, jlong lpprotocolinfolist, jint dwnumberofentries, jlong lpdwcatalogentryid, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallProviderAndChains64_32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpszproviderdllpath, (void*)(uintptr_t)lpszproviderdllpath32, (void*)(uintptr_t)lpszlspname, (uint32_t)dwserviceflags, (void*)(uintptr_t)lpprotocolinfolist, (uint32_t)dwnumberofentries, (void*)(uintptr_t)lpdwcatalogentryid, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCSetApplicationCategory(JNIEnv* km_env, jclass km_clazz, jlong path, jint pathlength, jlong extra, jint extralength, jint permittedlspcategories, jlong pprevpermlspcat, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCSetApplicationCategory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)path, (uint32_t)pathlength, (void*)(uintptr_t)extra, (uint32_t)extralength, (uint32_t)permittedlspcategories, (void*)(uintptr_t)pprevpermlspcat, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)path;
    (void)pathlength;
    (void)extra;
    (void)extralength;
    (void)permittedlspcategories;
    (void)pprevpermlspcat;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCSetProviderInfo(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint infotype, jlong info, jlong infosize, jint flags, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCSetProviderInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (int32_t)infotype, (void*)(uintptr_t)info, (uint64_t)infosize, (uint32_t)flags, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCSetProviderInfo32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint infotype, jlong info, jlong infosize, jint flags, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCSetProviderInfo32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (int32_t)infotype, (void*)(uintptr_t)info, (uint64_t)infosize, (uint32_t)flags, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCUnInstallNameSpace(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCUnInstallNameSpace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCUnInstallNameSpace32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCUnInstallNameSpace32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCUpdateProvider(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpszproviderdllpath, jlong lpprotocolinfolist, jint dwnumberofentries, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCUpdateProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpszproviderdllpath, (void*)(uintptr_t)lpprotocolinfolist, (uint32_t)dwnumberofentries, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCUpdateProvider32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpszproviderdllpath, jlong lpprotocolinfolist, jint dwnumberofentries, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCUpdateProvider32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpszproviderdllpath, (void*)(uintptr_t)lpprotocolinfolist, (uint32_t)dwnumberofentries, (void*)(uintptr_t)lperrno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCWriteNameSpaceOrder(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint dwnumberofentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCWriteNameSpaceOrder");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (uint32_t)dwnumberofentries);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)dwnumberofentries;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCWriteNameSpaceOrder32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint dwnumberofentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCWriteNameSpaceOrder32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpproviderid, (uint32_t)dwnumberofentries);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpproviderid;
    (void)dwnumberofentries;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCWriteProviderOrder(JNIEnv* km_env, jclass km_clazz, jlong lpwdcatalogentryid, jint dwnumberofentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCWriteProviderOrder");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwdcatalogentryid, (uint32_t)dwnumberofentries);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpwdcatalogentryid;
    (void)dwnumberofentries;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wSCWriteProviderOrder32(JNIEnv* km_env, jclass km_clazz, jlong lpwdcatalogentryid, jint dwnumberofentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCWriteProviderOrder32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwdcatalogentryid, (uint32_t)dwnumberofentries);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpwdcatalogentryid;
    (void)dwnumberofentries;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1wsafdisSet(JNIEnv* km_env, jclass km_clazz, jlong fd, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "__WSAFDIsSet");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)fd, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fd;
    (void)param1;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1accept(JNIEnv* km_env, jclass km_clazz, jlong s, jlong addr, jlong addrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "accept");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)addr, (void*)(uintptr_t)addrlen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)s;
    (void)addr;
    (void)addrlen;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1bind(JNIEnv* km_env, jclass km_clazz, jlong s, jlong name, jint namelen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bind");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)name, (int32_t)namelen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)name;
    (void)namelen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1closesocket(JNIEnv* km_env, jclass km_clazz, jlong s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "closesocket");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1connect(JNIEnv* km_env, jclass km_clazz, jlong s, jlong name, jint namelen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "connect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)name, (int32_t)namelen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)name;
    (void)namelen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1freeaddrinfo(JNIEnv* km_env, jclass km_clazz, jlong paddrinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "freeaddrinfo");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)paddrinfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)paddrinfo;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getaddrinfo(JNIEnv* km_env, jclass km_clazz, jlong pnodename, jlong pservicename, jlong phints, jlong ppresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getaddrinfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pnodename, (void*)(uintptr_t)pservicename, (void*)(uintptr_t)phints, (void*)(uintptr_t)ppresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pnodename;
    (void)pservicename;
    (void)phints;
    (void)ppresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1gethostbyaddr(JNIEnv* km_env, jclass km_clazz, jlong addr, jint len, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gethostbyaddr");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)addr, (int32_t)len, (int32_t)type);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)addr;
    (void)len;
    (void)type;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1gethostbyname(JNIEnv* km_env, jclass km_clazz, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gethostbyname");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)name;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1gethostname(JNIEnv* km_env, jclass km_clazz, jlong name, jint namelen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gethostname");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (int32_t)namelen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)name;
    (void)namelen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getnameinfo(JNIEnv* km_env, jclass km_clazz, jlong psockaddr, jint sockaddrlength, jlong pnodebuffer, jint nodebuffersize, jlong pservicebuffer, jint servicebuffersize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getnameinfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psockaddr, (int32_t)sockaddrlength, (void*)(uintptr_t)pnodebuffer, (uint32_t)nodebuffersize, (void*)(uintptr_t)pservicebuffer, (uint32_t)servicebuffersize, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psockaddr;
    (void)sockaddrlength;
    (void)pnodebuffer;
    (void)nodebuffersize;
    (void)pservicebuffer;
    (void)servicebuffersize;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getpeername(JNIEnv* km_env, jclass km_clazz, jlong s, jlong name, jlong namelen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getpeername");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)name, (void*)(uintptr_t)namelen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)name;
    (void)namelen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getprotobyname(JNIEnv* km_env, jclass km_clazz, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getprotobyname");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)name;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getprotobynumber(JNIEnv* km_env, jclass km_clazz, jint number) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getprotobynumber");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)number);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)number;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getservbyname(JNIEnv* km_env, jclass km_clazz, jlong name, jlong proto) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getservbyname");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)proto);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)name;
    (void)proto;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getservbyport(JNIEnv* km_env, jclass km_clazz, jint port, jlong proto) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getservbyport");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)port, (void*)(uintptr_t)proto);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)port;
    (void)proto;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getsockname(JNIEnv* km_env, jclass km_clazz, jlong s, jlong name, jlong namelen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getsockname");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)name, (void*)(uintptr_t)namelen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)name;
    (void)namelen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1getsockopt(JNIEnv* km_env, jclass km_clazz, jlong s, jint level, jint optname, jlong optval, jlong optlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "getsockopt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (int32_t)level, (int32_t)optname, (void*)(uintptr_t)optval, (void*)(uintptr_t)optlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)level;
    (void)optname;
    (void)optval;
    (void)optlen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1htonl(JNIEnv* km_env, jclass km_clazz, jint hostlong) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "htonl");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hostlong);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hostlong;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1htons(JNIEnv* km_env, jclass km_clazz, jshort hostshort) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "htons");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)hostshort);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hostshort;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1inetAddr(JNIEnv* km_env, jclass km_clazz, jlong cp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "inet_addr");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cp);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)cp;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1inetNtop(JNIEnv* km_env, jclass km_clazz, jint family, jlong paddr, jlong pstringbuf, jlong stringbufsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "inet_ntop");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)family, (void*)(uintptr_t)paddr, (void*)(uintptr_t)pstringbuf, (uint64_t)stringbufsize);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)family;
    (void)paddr;
    (void)pstringbuf;
    (void)stringbufsize;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1inetPton(JNIEnv* km_env, jclass km_clazz, jint family, jlong pszaddrstring, jlong paddrbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "inet_pton");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)family, (void*)(uintptr_t)pszaddrstring, (void*)(uintptr_t)paddrbuf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)family;
    (void)pszaddrstring;
    (void)paddrbuf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1ioctlsocket(JNIEnv* km_env, jclass km_clazz, jlong s, jint cmd, jlong argp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ioctlsocket");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (int32_t)cmd, (void*)(uintptr_t)argp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)cmd;
    (void)argp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1listen(JNIEnv* km_env, jclass km_clazz, jlong s, jint backlog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "listen");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (int32_t)backlog);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)backlog;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1ntohl(JNIEnv* km_env, jclass km_clazz, jint netlong) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ntohl");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)netlong);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)netlong;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1ntohs(JNIEnv* km_env, jclass km_clazz, jshort netshort) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ntohs");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)netshort);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)netshort;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1recv(JNIEnv* km_env, jclass km_clazz, jlong s, jlong buf, jint len, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "recv");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)buf, (int32_t)len, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1recvfrom(JNIEnv* km_env, jclass km_clazz, jlong s, jlong buf, jint len, jint flags, jlong from, jlong fromlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "recvfrom");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)buf, (int32_t)len, (int32_t)flags, (void*)(uintptr_t)from, (void*)(uintptr_t)fromlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    (void)from;
    (void)fromlen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1select(JNIEnv* km_env, jclass km_clazz, jint nfds, jlong readfds, jlong writefds, jlong exceptfds, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "select");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nfds, (void*)(uintptr_t)readfds, (void*)(uintptr_t)writefds, (void*)(uintptr_t)exceptfds, (void*)(uintptr_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nfds;
    (void)readfds;
    (void)writefds;
    (void)exceptfds;
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1send(JNIEnv* km_env, jclass km_clazz, jlong s, jlong buf, jint len, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "send");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)buf, (int32_t)len, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1sendto(JNIEnv* km_env, jclass km_clazz, jlong s, jlong buf, jint len, jint flags, jlong to, jint tolen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "sendto");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (void*)(uintptr_t)buf, (int32_t)len, (int32_t)flags, (void*)(uintptr_t)to, (int32_t)tolen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    (void)to;
    (void)tolen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1setsockopt(JNIEnv* km_env, jclass km_clazz, jlong s, jint level, jint optname, jlong optval, jint optlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "setsockopt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (int32_t)level, (int32_t)optname, (void*)(uintptr_t)optval, (int32_t)optlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)level;
    (void)optname;
    (void)optval;
    (void)optlen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1shutdown(JNIEnv* km_env, jclass km_clazz, jlong s, jint how) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "shutdown");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)s, (int32_t)how);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)s;
    (void)how;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1socket(JNIEnv* km_env, jclass km_clazz, jint af, jint type, jint protocol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "socket");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)af, (int32_t)type, (int32_t)protocol);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)af;
    (void)type;
    (void)protocol;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

