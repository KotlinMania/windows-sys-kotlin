#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1AcceptEx(JNIEnv* km_env, jclass km_clazz, jlong slistensocket, jlong sacceptsocket, jlong lpoutputbuffer, jint dwreceivedatalength, jint dwlocaladdresslength, jint dwremoteaddresslength, jlong lpdwbytesreceived, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcceptEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)slistensocket, (uint64_t)sacceptsocket, (void*)(uintptr_t)lpoutputbuffer, (uint32_t)dwreceivedatalength, (uint32_t)dwlocaladdresslength, (uint32_t)dwremoteaddresslength, (void*)(uintptr_t)lpdwbytesreceived, (void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)slistensocket;
    (void)sacceptsocket;
    (void)lpoutputbuffer;
    (void)dwreceivedatalength;
    (void)dwlocaladdresslength;
    (void)dwremoteaddresslength;
    (void)lpdwbytesreceived;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1EnumProtocolsA(JNIEnv* km_env, jclass km_clazz, jlong lpiprotocols, jlong lpprotocolbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumProtocolsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpiprotocols, (void*)(uintptr_t)lpprotocolbuffer, (void*)(uintptr_t)lpdwbufferlength) : -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1EnumProtocolsW(JNIEnv* km_env, jclass km_clazz, jlong lpiprotocols, jlong lpprotocolbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumProtocolsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpiprotocols, (void*)(uintptr_t)lpprotocolbuffer, (void*)(uintptr_t)lpdwbufferlength) : -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1FreeAddrInfoEx(JNIEnv* km_env, jclass km_clazz, jlong paddrinfoex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeAddrInfoEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)paddrinfoex);
#else
    (void)paddrinfoex;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1FreeAddrInfoExW(JNIEnv* km_env, jclass km_clazz, jlong paddrinfoex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeAddrInfoExW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)paddrinfoex);
#else
    (void)paddrinfoex;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1FreeAddrInfoW(JNIEnv* km_env, jclass km_clazz, jlong paddrinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeAddrInfoW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)paddrinfo);
#else
    (void)paddrinfo;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetAcceptExSockaddrs(JNIEnv* km_env, jclass km_clazz, jlong lpoutputbuffer, jint dwreceivedatalength, jint dwlocaladdresslength, jint dwremoteaddresslength, jlong localsockaddr, jlong localsockaddrlength, jlong remotesockaddr, jlong remotesockaddrlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAcceptExSockaddrs");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpoutputbuffer, (uint32_t)dwreceivedatalength, (uint32_t)dwlocaladdresslength, (uint32_t)dwremoteaddresslength, (void*)(uintptr_t)localsockaddr, (void*)(uintptr_t)localsockaddrlength, (void*)(uintptr_t)remotesockaddr, (void*)(uintptr_t)remotesockaddrlength);
#else
    (void)lpoutputbuffer;
    (void)dwreceivedatalength;
    (void)dwlocaladdresslength;
    (void)dwremoteaddresslength;
    (void)localsockaddr;
    (void)localsockaddrlength;
    (void)remotesockaddr;
    (void)remotesockaddrlength;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetAddrInfoExA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong pservicename, jint dwnamespace, jlong lpnspid, jlong hints, jlong ppresult, jlong timeout, jlong lpoverlapped, jlong lpcompletionroutine, jlong lpnamehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddrInfoExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)pservicename, (uint32_t)dwnamespace, (void*)(uintptr_t)lpnspid, (void*)(uintptr_t)hints, (void*)(uintptr_t)ppresult, (void*)(uintptr_t)timeout, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine, (void*)(uintptr_t)lpnamehandle) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetAddrInfoExCancel(JNIEnv* km_env, jclass km_clazz, jlong lphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddrInfoExCancel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lphandle) : -1;
#else
    (void)lphandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetAddrInfoExOverlappedResult(JNIEnv* km_env, jclass km_clazz, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddrInfoExOverlappedResult");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetAddrInfoExW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong pservicename, jint dwnamespace, jlong lpnspid, jlong hints, jlong ppresult, jlong timeout, jlong lpoverlapped, jlong lpcompletionroutine, jlong lphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddrInfoExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)pservicename, (uint32_t)dwnamespace, (void*)(uintptr_t)lpnspid, (void*)(uintptr_t)hints, (void*)(uintptr_t)ppresult, (void*)(uintptr_t)timeout, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine, (void*)(uintptr_t)lphandle) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetAddrInfoW(JNIEnv* km_env, jclass km_clazz, jlong pnodename, jlong pservicename, jlong phints, jlong ppresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddrInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pnodename, (void*)(uintptr_t)pservicename, (void*)(uintptr_t)phints, (void*)(uintptr_t)ppresult) : -1;
#else
    (void)pnodename;
    (void)pservicename;
    (void)phints;
    (void)ppresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetAddressByNameA(JNIEnv* km_env, jclass km_clazz, jint dwnamespace, jlong lpservicetype, jlong lpservicename, jlong lpiprotocols, jint dwresolution, jlong lpserviceasyncinfo, jlong lpcsaddrbuffer, jlong lpdwbufferlength, jlong lpaliasbuffer, jlong lpdwaliasbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddressByNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwnamespace, (void*)(uintptr_t)lpservicetype, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpiprotocols, (uint32_t)dwresolution, (void*)(uintptr_t)lpserviceasyncinfo, (void*)(uintptr_t)lpcsaddrbuffer, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpaliasbuffer, (void*)(uintptr_t)lpdwaliasbufferlength) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetAddressByNameW(JNIEnv* km_env, jclass km_clazz, jint dwnamespace, jlong lpservicetype, jlong lpservicename, jlong lpiprotocols, jint dwresolution, jlong lpserviceasyncinfo, jlong lpcsaddrbuffer, jlong lpdwbufferlength, jlong lpaliasbuffer, jlong lpdwaliasbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAddressByNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwnamespace, (void*)(uintptr_t)lpservicetype, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpiprotocols, (uint32_t)dwresolution, (void*)(uintptr_t)lpserviceasyncinfo, (void*)(uintptr_t)lpcsaddrbuffer, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpaliasbuffer, (void*)(uintptr_t)lpdwaliasbufferlength) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetHostNameW(JNIEnv* km_env, jclass km_clazz, jlong name, jint namelen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetHostNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (int32_t)namelen) : -1;
#else
    (void)name;
    (void)namelen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetNameByTypeA(JNIEnv* km_env, jclass km_clazz, jlong lpservicetype, jlong lpservicename, jint dwnamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNameByTypeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpservicetype, (void*)(uintptr_t)lpservicename, (uint32_t)dwnamelength) : -1;
#else
    (void)lpservicetype;
    (void)lpservicename;
    (void)dwnamelength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetNameByTypeW(JNIEnv* km_env, jclass km_clazz, jlong lpservicetype, jlong lpservicename, jint dwnamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNameByTypeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpservicetype, (void*)(uintptr_t)lpservicename, (uint32_t)dwnamelength) : -1;
#else
    (void)lpservicetype;
    (void)lpservicename;
    (void)dwnamelength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetNameInfoW(JNIEnv* km_env, jclass km_clazz, jlong psockaddr, jint sockaddrlength, jlong pnodebuffer, jint nodebuffersize, jlong pservicebuffer, jint servicebuffersize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNameInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psockaddr, (int32_t)sockaddrlength, (void*)(uintptr_t)pnodebuffer, (uint32_t)nodebuffersize, (void*)(uintptr_t)pservicebuffer, (uint32_t)servicebuffersize, (int32_t)flags) : -1;
#else
    (void)psockaddr;
    (void)sockaddrlength;
    (void)pnodebuffer;
    (void)nodebuffersize;
    (void)pservicebuffer;
    (void)servicebuffersize;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetServiceA(JNIEnv* km_env, jclass km_clazz, jint dwnamespace, jlong lpguid, jlong lpservicename, jint dwproperties, jlong lpbuffer, jlong lpdwbuffersize, jlong lpserviceasyncinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwnamespace, (void*)(uintptr_t)lpguid, (void*)(uintptr_t)lpservicename, (uint32_t)dwproperties, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwbuffersize, (void*)(uintptr_t)lpserviceasyncinfo) : -1;
#else
    (void)dwnamespace;
    (void)lpguid;
    (void)lpservicename;
    (void)dwproperties;
    (void)lpbuffer;
    (void)lpdwbuffersize;
    (void)lpserviceasyncinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetServiceW(JNIEnv* km_env, jclass km_clazz, jint dwnamespace, jlong lpguid, jlong lpservicename, jint dwproperties, jlong lpbuffer, jlong lpdwbuffersize, jlong lpserviceasyncinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwnamespace, (void*)(uintptr_t)lpguid, (void*)(uintptr_t)lpservicename, (uint32_t)dwproperties, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwbuffersize, (void*)(uintptr_t)lpserviceasyncinfo) : -1;
#else
    (void)dwnamespace;
    (void)lpguid;
    (void)lpservicename;
    (void)dwproperties;
    (void)lpbuffer;
    (void)lpdwbuffersize;
    (void)lpserviceasyncinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetTypeByNameA(JNIEnv* km_env, jclass km_clazz, jlong lpservicename, jlong lpservicetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTypeByNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpservicetype) : -1;
#else
    (void)lpservicename;
    (void)lpservicetype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1GetTypeByNameW(JNIEnv* km_env, jclass km_clazz, jlong lpservicename, jlong lpservicetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTypeByNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpservicetype) : -1;
#else
    (void)lpservicename;
    (void)lpservicetype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1InetNtopW(JNIEnv* km_env, jclass km_clazz, jint family, jlong paddr, jlong pstringbuf, jlong stringbufsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InetNtopW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)family, (void*)(uintptr_t)paddr, (void*)(uintptr_t)pstringbuf, (uint64_t)stringbufsize) : NULL;
#else
    (void)family;
    (void)paddr;
    (void)pstringbuf;
    (void)stringbufsize;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1InetPtonW(JNIEnv* km_env, jclass km_clazz, jint family, jlong pszaddrstring, jlong paddrbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InetPtonW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)family, (void*)(uintptr_t)pszaddrstring, (void*)(uintptr_t)paddrbuf) : -1;
#else
    (void)family;
    (void)pszaddrstring;
    (void)paddrbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1ProcessSocketNotifications(JNIEnv* km_env, jclass km_clazz, jlong completionport, jint registrationcount, jlong registrationinfos, jint timeoutms, jint completioncount, jlong completionportentries, jlong receivedentrycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessSocketNotifications");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)completionport, (uint32_t)registrationcount, (void*)(uintptr_t)registrationinfos, (uint32_t)timeoutms, (uint32_t)completioncount, (void*)(uintptr_t)completionportentries, (void*)(uintptr_t)receivedentrycount) : 0;
#else
    (void)completionport;
    (void)registrationcount;
    (void)registrationinfos;
    (void)timeoutms;
    (void)completioncount;
    (void)completionportentries;
    (void)receivedentrycount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlEthernetAddressToStringA(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEthernetAddressToStringA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)addr, (void*)(uintptr_t)s) : NULL;
#else
    (void)addr;
    (void)s;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlEthernetAddressToStringW(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEthernetAddressToStringW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)addr, (void*)(uintptr_t)s) : NULL;
#else
    (void)addr;
    (void)s;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlEthernetStringToAddressA(JNIEnv* km_env, jclass km_clazz, jlong s, jlong terminator, jlong addr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEthernetStringToAddressA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)s, (void*)(uintptr_t)terminator, (void*)(uintptr_t)addr) : -1;
#else
    (void)s;
    (void)terminator;
    (void)addr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlEthernetStringToAddressW(JNIEnv* km_env, jclass km_clazz, jlong s, jlong terminator, jlong addr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEthernetStringToAddressW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)s, (void*)(uintptr_t)terminator, (void*)(uintptr_t)addr) : -1;
#else
    (void)s;
    (void)terminator;
    (void)addr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv4AddressToStringA(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4AddressToStringA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)addr, (void*)(uintptr_t)s) : NULL;
#else
    (void)addr;
    (void)s;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv4AddressToStringExA(JNIEnv* km_env, jclass km_clazz, jlong address, jshort port, jlong addressstring, jlong addressstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4AddressToStringExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)address, (uint16_t)port, (void*)(uintptr_t)addressstring, (void*)(uintptr_t)addressstringlength) : -1;
#else
    (void)address;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv4AddressToStringExW(JNIEnv* km_env, jclass km_clazz, jlong address, jshort port, jlong addressstring, jlong addressstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4AddressToStringExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)address, (uint16_t)port, (void*)(uintptr_t)addressstring, (void*)(uintptr_t)addressstringlength) : -1;
#else
    (void)address;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv4AddressToStringW(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4AddressToStringW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)addr, (void*)(uintptr_t)s) : NULL;
#else
    (void)addr;
    (void)s;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv4StringToAddressA(JNIEnv* km_env, jclass km_clazz, jlong s, jboolean strict, jlong terminator, jlong addr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4StringToAddressA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)s, (bool)strict, (void*)(uintptr_t)terminator, (void*)(uintptr_t)addr) : -1;
#else
    (void)s;
    (void)strict;
    (void)terminator;
    (void)addr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv4StringToAddressExA(JNIEnv* km_env, jclass km_clazz, jlong addressstring, jboolean strict, jlong address, jlong port) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4StringToAddressExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)addressstring, (bool)strict, (void*)(uintptr_t)address, (void*)(uintptr_t)port) : -1;
#else
    (void)addressstring;
    (void)strict;
    (void)address;
    (void)port;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv4StringToAddressExW(JNIEnv* km_env, jclass km_clazz, jlong addressstring, jboolean strict, jlong address, jlong port) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4StringToAddressExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)addressstring, (bool)strict, (void*)(uintptr_t)address, (void*)(uintptr_t)port) : -1;
#else
    (void)addressstring;
    (void)strict;
    (void)address;
    (void)port;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv4StringToAddressW(JNIEnv* km_env, jclass km_clazz, jlong s, jboolean strict, jlong terminator, jlong addr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv4StringToAddressW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)s, (bool)strict, (void*)(uintptr_t)terminator, (void*)(uintptr_t)addr) : -1;
#else
    (void)s;
    (void)strict;
    (void)terminator;
    (void)addr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv6AddressToStringA(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6AddressToStringA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)addr, (void*)(uintptr_t)s) : NULL;
#else
    (void)addr;
    (void)s;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv6AddressToStringExA(JNIEnv* km_env, jclass km_clazz, jlong address, jint scopeid, jshort port, jlong addressstring, jlong addressstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6AddressToStringExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)address, (uint32_t)scopeid, (uint16_t)port, (void*)(uintptr_t)addressstring, (void*)(uintptr_t)addressstringlength) : -1;
#else
    (void)address;
    (void)scopeid;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv6AddressToStringExW(JNIEnv* km_env, jclass km_clazz, jlong address, jint scopeid, jshort port, jlong addressstring, jlong addressstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6AddressToStringExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)address, (uint32_t)scopeid, (uint16_t)port, (void*)(uintptr_t)addressstring, (void*)(uintptr_t)addressstringlength) : -1;
#else
    (void)address;
    (void)scopeid;
    (void)port;
    (void)addressstring;
    (void)addressstringlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv6AddressToStringW(JNIEnv* km_env, jclass km_clazz, jlong addr, jlong s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6AddressToStringW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)addr, (void*)(uintptr_t)s) : NULL;
#else
    (void)addr;
    (void)s;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv6StringToAddressA(JNIEnv* km_env, jclass km_clazz, jlong s, jlong terminator, jlong addr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6StringToAddressA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)s, (void*)(uintptr_t)terminator, (void*)(uintptr_t)addr) : -1;
#else
    (void)s;
    (void)terminator;
    (void)addr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv6StringToAddressExA(JNIEnv* km_env, jclass km_clazz, jlong addressstring, jlong address, jlong scopeid, jlong port) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6StringToAddressExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)addressstring, (void*)(uintptr_t)address, (void*)(uintptr_t)scopeid, (void*)(uintptr_t)port) : -1;
#else
    (void)addressstring;
    (void)address;
    (void)scopeid;
    (void)port;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv6StringToAddressExW(JNIEnv* km_env, jclass km_clazz, jlong addressstring, jlong address, jlong scopeid, jlong port) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6StringToAddressExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)addressstring, (void*)(uintptr_t)address, (void*)(uintptr_t)scopeid, (void*)(uintptr_t)port) : -1;
#else
    (void)addressstring;
    (void)address;
    (void)scopeid;
    (void)port;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1RtlIpv6StringToAddressW(JNIEnv* km_env, jclass km_clazz, jlong s, jlong terminator, jlong addr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIpv6StringToAddressW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)s, (void*)(uintptr_t)terminator, (void*)(uintptr_t)addr) : -1;
#else
    (void)s;
    (void)terminator;
    (void)addr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1SetAddrInfoExA(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong pservicename, jlong paddresses, jint dwaddresscount, jlong lpblob, jint dwflags, jint dwnamespace, jlong lpnspid, jlong timeout, jlong lpoverlapped, jlong lpcompletionroutine, jlong lpnamehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAddrInfoExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)pservicename, (void*)(uintptr_t)paddresses, (uint32_t)dwaddresscount, (void*)(uintptr_t)lpblob, (uint32_t)dwflags, (uint32_t)dwnamespace, (void*)(uintptr_t)lpnspid, (void*)(uintptr_t)timeout, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine, (void*)(uintptr_t)lpnamehandle) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1SetAddrInfoExW(JNIEnv* km_env, jclass km_clazz, jlong pname, jlong pservicename, jlong paddresses, jint dwaddresscount, jlong lpblob, jint dwflags, jint dwnamespace, jlong lpnspid, jlong timeout, jlong lpoverlapped, jlong lpcompletionroutine, jlong lpnamehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAddrInfoExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname, (void*)(uintptr_t)pservicename, (void*)(uintptr_t)paddresses, (uint32_t)dwaddresscount, (void*)(uintptr_t)lpblob, (uint32_t)dwflags, (uint32_t)dwnamespace, (void*)(uintptr_t)lpnspid, (void*)(uintptr_t)timeout, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine, (void*)(uintptr_t)lpnamehandle) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1SetServiceA(JNIEnv* km_env, jclass km_clazz, jint dwnamespace, jint dwoperation, jint dwflags, jlong lpserviceinfo, jlong lpserviceasyncinfo, jlong lpdwstatusflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwnamespace, (uint32_t)dwoperation, (uint32_t)dwflags, (void*)(uintptr_t)lpserviceinfo, (void*)(uintptr_t)lpserviceasyncinfo, (void*)(uintptr_t)lpdwstatusflags) : -1;
#else
    (void)dwnamespace;
    (void)dwoperation;
    (void)dwflags;
    (void)lpserviceinfo;
    (void)lpserviceasyncinfo;
    (void)lpdwstatusflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1SetServiceW(JNIEnv* km_env, jclass km_clazz, jint dwnamespace, jint dwoperation, jint dwflags, jlong lpserviceinfo, jlong lpserviceasyncinfo, jlong lpdwstatusflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwnamespace, (uint32_t)dwoperation, (uint32_t)dwflags, (void*)(uintptr_t)lpserviceinfo, (void*)(uintptr_t)lpserviceasyncinfo, (void*)(uintptr_t)lpdwstatusflags) : -1;
#else
    (void)dwnamespace;
    (void)dwoperation;
    (void)dwflags;
    (void)lpserviceinfo;
    (void)lpserviceasyncinfo;
    (void)lpdwstatusflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1SetSocketMediaStreamingMode(JNIEnv* km_env, jclass km_clazz, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.networking.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSocketMediaStreamingMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)value) : -1;
#else
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1TransmitFile(JNIEnv* km_env, jclass km_clazz, jlong hsocket, jlong hfile, jint nnumberofbytestowrite, jint nnumberofbytespersend, jlong lpoverlapped, jlong lptransmitbuffers, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransmitFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hsocket, (void*)(uintptr_t)hfile, (uint32_t)nnumberofbytestowrite, (uint32_t)nnumberofbytespersend, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lptransmitbuffers, (uint32_t)dwreserved) : -1;
#else
    (void)hsocket;
    (void)hfile;
    (void)nnumberofbytestowrite;
    (void)nnumberofbytespersend;
    (void)lpoverlapped;
    (void)lptransmitbuffers;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WPUCompleteOverlappedRequest(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpoverlapped, jint dwerror, jint cbtransferred, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WPUCompleteOverlappedRequest");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpoverlapped, (uint32_t)dwerror, (uint32_t)cbtransferred, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)s;
    (void)lpoverlapped;
    (void)dwerror;
    (void)cbtransferred;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAAccept(JNIEnv* km_env, jclass km_clazz, jlong s, jlong addr, jlong addrlen, jlong lpfncondition, jlong dwcallbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAccept");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)addr, (void*)(uintptr_t)addrlen, (void*)(uintptr_t)lpfncondition, (uint64_t)dwcallbackdata) : 0;
#else
    (void)s;
    (void)addr;
    (void)addrlen;
    (void)lpfncondition;
    (void)dwcallbackdata;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAAddressToStringA(JNIEnv* km_env, jclass km_clazz, jlong lpsaaddress, jint dwaddresslength, jlong lpprotocolinfo, jlong lpszaddressstring, jlong lpdwaddressstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAddressToStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsaaddress, (uint32_t)dwaddresslength, (void*)(uintptr_t)lpprotocolinfo, (void*)(uintptr_t)lpszaddressstring, (void*)(uintptr_t)lpdwaddressstringlength) : -1;
#else
    (void)lpsaaddress;
    (void)dwaddresslength;
    (void)lpprotocolinfo;
    (void)lpszaddressstring;
    (void)lpdwaddressstringlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAAddressToStringW(JNIEnv* km_env, jclass km_clazz, jlong lpsaaddress, jint dwaddresslength, jlong lpprotocolinfo, jlong lpszaddressstring, jlong lpdwaddressstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAddressToStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsaaddress, (uint32_t)dwaddresslength, (void*)(uintptr_t)lpprotocolinfo, (void*)(uintptr_t)lpszaddressstring, (void*)(uintptr_t)lpdwaddressstringlength) : -1;
#else
    (void)lpsaaddress;
    (void)dwaddresslength;
    (void)lpprotocolinfo;
    (void)lpszaddressstring;
    (void)lpdwaddressstringlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAAdvertiseProvider(JNIEnv* km_env, jclass km_clazz, jlong puuidproviderid, jlong pnspv2routine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAdvertiseProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)puuidproviderid, (void*)(uintptr_t)pnspv2routine) : -1;
#else
    (void)puuidproviderid;
    (void)pnspv2routine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAAsyncGetHostByAddr(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg, jlong addr, jint len, jint type, jlong buf, jint buflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetHostByAddr");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg, (void*)(uintptr_t)addr, (int32_t)len, (int32_t)type, (void*)(uintptr_t)buf, (int32_t)buflen) : NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)addr;
    (void)len;
    (void)type;
    (void)buf;
    (void)buflen;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAAsyncGetHostByName(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg, jlong name, jlong buf, jint buflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetHostByName");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg, (void*)(uintptr_t)name, (void*)(uintptr_t)buf, (int32_t)buflen) : NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)name;
    (void)buf;
    (void)buflen;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAAsyncGetProtoByName(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg, jlong name, jlong buf, jint buflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetProtoByName");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg, (void*)(uintptr_t)name, (void*)(uintptr_t)buf, (int32_t)buflen) : NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)name;
    (void)buf;
    (void)buflen;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAAsyncGetProtoByNumber(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg, jint number, jlong buf, jint buflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetProtoByNumber");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg, (int32_t)number, (void*)(uintptr_t)buf, (int32_t)buflen) : NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)number;
    (void)buf;
    (void)buflen;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAAsyncGetServByName(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg, jlong name, jlong proto, jlong buf, jint buflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetServByName");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg, (void*)(uintptr_t)name, (void*)(uintptr_t)proto, (void*)(uintptr_t)buf, (int32_t)buflen) : NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)name;
    (void)proto;
    (void)buf;
    (void)buflen;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAAsyncGetServByPort(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg, jint port, jlong proto, jlong buf, jint buflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncGetServByPort");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg, (int32_t)port, (void*)(uintptr_t)proto, (void*)(uintptr_t)buf, (int32_t)buflen) : NULL;
#else
    (void)hwnd;
    (void)wmsg;
    (void)port;
    (void)proto;
    (void)buf;
    (void)buflen;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAAsyncSelect(JNIEnv* km_env, jclass km_clazz, jlong s, jlong hwnd, jint wmsg, jint levent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAAsyncSelect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)hwnd, (uint32_t)wmsg, (int32_t)levent) : -1;
#else
    (void)s;
    (void)hwnd;
    (void)wmsg;
    (void)levent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSACancelAsyncRequest(JNIEnv* km_env, jclass km_clazz, jlong hasynctaskhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSACancelAsyncRequest");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hasynctaskhandle) : -1;
#else
    (void)hasynctaskhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSACancelBlockingCall(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSACancelBlockingCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSACleanup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSACleanup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSACloseEvent(JNIEnv* km_env, jclass km_clazz, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSACloseEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hevent) : -1;
#else
    (void)hevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAConnect(JNIEnv* km_env, jclass km_clazz, jlong s, jlong name, jint namelen, jlong lpcallerdata, jlong lpcalleedata, jlong lpsqos, jlong lpgqos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAConnect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)name, (int32_t)namelen, (void*)(uintptr_t)lpcallerdata, (void*)(uintptr_t)lpcalleedata, (void*)(uintptr_t)lpsqos, (void*)(uintptr_t)lpgqos) : -1;
#else
    (void)s;
    (void)name;
    (void)namelen;
    (void)lpcallerdata;
    (void)lpcalleedata;
    (void)lpsqos;
    (void)lpgqos;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAConnectByList(JNIEnv* km_env, jclass km_clazz, jlong s, jlong socketaddress, jlong localaddresslength, jlong localaddress, jlong remoteaddresslength, jlong remoteaddress, jlong timeout, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAConnectByList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)socketaddress, (void*)(uintptr_t)localaddresslength, (void*)(uintptr_t)localaddress, (void*)(uintptr_t)remoteaddresslength, (void*)(uintptr_t)remoteaddress, (void*)(uintptr_t)timeout, (void*)(uintptr_t)reserved) : -1;
#else
    (void)s;
    (void)socketaddress;
    (void)localaddresslength;
    (void)localaddress;
    (void)remoteaddresslength;
    (void)remoteaddress;
    (void)timeout;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAConnectByNameA(JNIEnv* km_env, jclass km_clazz, jlong s, jlong nodename, jlong servicename, jlong localaddresslength, jlong localaddress, jlong remoteaddresslength, jlong remoteaddress, jlong timeout, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAConnectByNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)nodename, (void*)(uintptr_t)servicename, (void*)(uintptr_t)localaddresslength, (void*)(uintptr_t)localaddress, (void*)(uintptr_t)remoteaddresslength, (void*)(uintptr_t)remoteaddress, (void*)(uintptr_t)timeout, (void*)(uintptr_t)reserved) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAConnectByNameW(JNIEnv* km_env, jclass km_clazz, jlong s, jlong nodename, jlong servicename, jlong localaddresslength, jlong localaddress, jlong remoteaddresslength, jlong remoteaddress, jlong timeout, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAConnectByNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)nodename, (void*)(uintptr_t)servicename, (void*)(uintptr_t)localaddresslength, (void*)(uintptr_t)localaddress, (void*)(uintptr_t)remoteaddresslength, (void*)(uintptr_t)remoteaddress, (void*)(uintptr_t)timeout, (void*)(uintptr_t)reserved) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSACreateEvent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSACreateEvent");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSADeleteSocketPeerTargetName(JNIEnv* km_env, jclass km_clazz, jlong arg_0_socket, jlong peeraddr, jint peeraddrlen, jlong overlapped, jlong completionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSADeleteSocketPeerTargetName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)arg_0_socket, (void*)(uintptr_t)peeraddr, (uint32_t)peeraddrlen, (void*)(uintptr_t)overlapped, (void*)(uintptr_t)completionroutine) : -1;
#else
    (void)arg_0_socket;
    (void)peeraddr;
    (void)peeraddrlen;
    (void)overlapped;
    (void)completionroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSADuplicateSocketA(JNIEnv* km_env, jclass km_clazz, jlong s, jint dwprocessid, jlong lpprotocolinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSADuplicateSocketA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (uint32_t)dwprocessid, (void*)(uintptr_t)lpprotocolinfo) : -1;
#else
    (void)s;
    (void)dwprocessid;
    (void)lpprotocolinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSADuplicateSocketW(JNIEnv* km_env, jclass km_clazz, jlong s, jint dwprocessid, jlong lpprotocolinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSADuplicateSocketW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (uint32_t)dwprocessid, (void*)(uintptr_t)lpprotocolinfo) : -1;
#else
    (void)s;
    (void)dwprocessid;
    (void)lpprotocolinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAEnumNameSpaceProvidersA(JNIEnv* km_env, jclass km_clazz, jlong lpdwbufferlength, jlong lpnspbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpnspbuffer) : -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAEnumNameSpaceProvidersExA(JNIEnv* km_env, jclass km_clazz, jlong lpdwbufferlength, jlong lpnspbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpnspbuffer) : -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAEnumNameSpaceProvidersExW(JNIEnv* km_env, jclass km_clazz, jlong lpdwbufferlength, jlong lpnspbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpnspbuffer) : -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAEnumNameSpaceProvidersW(JNIEnv* km_env, jclass km_clazz, jlong lpdwbufferlength, jlong lpnspbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumNameSpaceProvidersW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpnspbuffer) : -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAEnumNetworkEvents(JNIEnv* km_env, jclass km_clazz, jlong s, jlong heventobject, jlong lpnetworkevents) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumNetworkEvents");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (int64_t)heventobject, (void*)(uintptr_t)lpnetworkevents) : -1;
#else
    (void)s;
    (void)heventobject;
    (void)lpnetworkevents;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAEnumProtocolsA(JNIEnv* km_env, jclass km_clazz, jlong lpiprotocols, jlong lpprotocolbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumProtocolsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpiprotocols, (void*)(uintptr_t)lpprotocolbuffer, (void*)(uintptr_t)lpdwbufferlength) : -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAEnumProtocolsW(JNIEnv* km_env, jclass km_clazz, jlong lpiprotocols, jlong lpprotocolbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEnumProtocolsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpiprotocols, (void*)(uintptr_t)lpprotocolbuffer, (void*)(uintptr_t)lpdwbufferlength) : -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAEventSelect(JNIEnv* km_env, jclass km_clazz, jlong s, jlong heventobject, jint lnetworkevents) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAEventSelect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (int64_t)heventobject, (int32_t)lnetworkevents) : -1;
#else
    (void)s;
    (void)heventobject;
    (void)lnetworkevents;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAGetLastError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetLastError");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAGetOverlappedResult(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpoverlapped, jlong lpcbtransfer, jint fwait, jlong lpdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetOverlappedResult");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcbtransfer, (int32_t)fwait, (void*)(uintptr_t)lpdwflags) : -1;
#else
    (void)s;
    (void)lpoverlapped;
    (void)lpcbtransfer;
    (void)fwait;
    (void)lpdwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAGetQOSByName(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpqosname, jlong lpqos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetQOSByName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpqosname, (void*)(uintptr_t)lpqos) : -1;
#else
    (void)s;
    (void)lpqosname;
    (void)lpqos;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAGetServiceClassInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpserviceclassid, jlong lpdwbufsize, jlong lpserviceclassinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetServiceClassInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpserviceclassid, (void*)(uintptr_t)lpdwbufsize, (void*)(uintptr_t)lpserviceclassinfo) : -1;
#else
    (void)lpproviderid;
    (void)lpserviceclassid;
    (void)lpdwbufsize;
    (void)lpserviceclassinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAGetServiceClassInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpserviceclassid, jlong lpdwbufsize, jlong lpserviceclassinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetServiceClassInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpserviceclassid, (void*)(uintptr_t)lpdwbufsize, (void*)(uintptr_t)lpserviceclassinfo) : -1;
#else
    (void)lpproviderid;
    (void)lpserviceclassid;
    (void)lpdwbufsize;
    (void)lpserviceclassinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAGetServiceClassNameByClassIdA(JNIEnv* km_env, jclass km_clazz, jlong lpserviceclassid, jlong lpszserviceclassname, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetServiceClassNameByClassIdA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpserviceclassid, (void*)(uintptr_t)lpszserviceclassname, (void*)(uintptr_t)lpdwbufferlength) : -1;
#else
    (void)lpserviceclassid;
    (void)lpszserviceclassname;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAGetServiceClassNameByClassIdW(JNIEnv* km_env, jclass km_clazz, jlong lpserviceclassid, jlong lpszserviceclassname, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAGetServiceClassNameByClassIdW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpserviceclassid, (void*)(uintptr_t)lpszserviceclassname, (void*)(uintptr_t)lpdwbufferlength) : -1;
#else
    (void)lpserviceclassid;
    (void)lpszserviceclassname;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAHtonl(JNIEnv* km_env, jclass km_clazz, jlong s, jint hostlong, jlong lpnetlong) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAHtonl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (uint32_t)hostlong, (void*)(uintptr_t)lpnetlong) : -1;
#else
    (void)s;
    (void)hostlong;
    (void)lpnetlong;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAHtons(JNIEnv* km_env, jclass km_clazz, jlong s, jshort hostshort, jlong lpnetshort) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAHtons");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (uint16_t)hostshort, (void*)(uintptr_t)lpnetshort) : -1;
#else
    (void)s;
    (void)hostshort;
    (void)lpnetshort;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAImpersonateSocketPeer(JNIEnv* km_env, jclass km_clazz, jlong arg_0_socket, jlong peeraddr, jint peeraddrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAImpersonateSocketPeer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)arg_0_socket, (void*)(uintptr_t)peeraddr, (uint32_t)peeraddrlen) : -1;
#else
    (void)arg_0_socket;
    (void)peeraddr;
    (void)peeraddrlen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAInstallServiceClassA(JNIEnv* km_env, jclass km_clazz, jlong lpserviceclassinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAInstallServiceClassA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpserviceclassinfo) : -1;
#else
    (void)lpserviceclassinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAInstallServiceClassW(JNIEnv* km_env, jclass km_clazz, jlong lpserviceclassinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAInstallServiceClassW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpserviceclassinfo) : -1;
#else
    (void)lpserviceclassinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAIoctl(JNIEnv* km_env, jclass km_clazz, jlong s, jint dwiocontrolcode, jlong lpvinbuffer, jint cbinbuffer, jlong lpvoutbuffer, jint cboutbuffer, jlong lpcbbytesreturned, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAIoctl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (uint32_t)dwiocontrolcode, (void*)(uintptr_t)lpvinbuffer, (uint32_t)cbinbuffer, (void*)(uintptr_t)lpvoutbuffer, (uint32_t)cboutbuffer, (void*)(uintptr_t)lpcbbytesreturned, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAIsBlocking(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAIsBlocking");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAJoinLeaf(JNIEnv* km_env, jclass km_clazz, jlong s, jlong name, jint namelen, jlong lpcallerdata, jlong lpcalleedata, jlong lpsqos, jlong lpgqos, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAJoinLeaf");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)name, (int32_t)namelen, (void*)(uintptr_t)lpcallerdata, (void*)(uintptr_t)lpcalleedata, (void*)(uintptr_t)lpsqos, (void*)(uintptr_t)lpgqos, (uint32_t)dwflags) : 0;
#else
    (void)s;
    (void)name;
    (void)namelen;
    (void)lpcallerdata;
    (void)lpcalleedata;
    (void)lpsqos;
    (void)lpgqos;
    (void)dwflags;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSALookupServiceBeginA(JNIEnv* km_env, jclass km_clazz, jlong lpqsrestrictions, jint dwcontrolflags, jlong lphlookup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSALookupServiceBeginA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpqsrestrictions, (uint32_t)dwcontrolflags, (void*)(uintptr_t)lphlookup) : -1;
#else
    (void)lpqsrestrictions;
    (void)dwcontrolflags;
    (void)lphlookup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSALookupServiceBeginW(JNIEnv* km_env, jclass km_clazz, jlong lpqsrestrictions, jint dwcontrolflags, jlong lphlookup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSALookupServiceBeginW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpqsrestrictions, (uint32_t)dwcontrolflags, (void*)(uintptr_t)lphlookup) : -1;
#else
    (void)lpqsrestrictions;
    (void)dwcontrolflags;
    (void)lphlookup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSALookupServiceEnd(JNIEnv* km_env, jclass km_clazz, jlong hlookup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSALookupServiceEnd");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlookup) : -1;
#else
    (void)hlookup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSALookupServiceNextA(JNIEnv* km_env, jclass km_clazz, jlong hlookup, jint dwcontrolflags, jlong lpdwbufferlength, jlong lpqsresults) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSALookupServiceNextA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlookup, (uint32_t)dwcontrolflags, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpqsresults) : -1;
#else
    (void)hlookup;
    (void)dwcontrolflags;
    (void)lpdwbufferlength;
    (void)lpqsresults;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSALookupServiceNextW(JNIEnv* km_env, jclass km_clazz, jlong hlookup, jint dwcontrolflags, jlong lpdwbufferlength, jlong lpqsresults) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSALookupServiceNextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlookup, (uint32_t)dwcontrolflags, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpqsresults) : -1;
#else
    (void)hlookup;
    (void)dwcontrolflags;
    (void)lpdwbufferlength;
    (void)lpqsresults;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSANSPIoctl(JNIEnv* km_env, jclass km_clazz, jlong hlookup, jint dwcontrolcode, jlong lpvinbuffer, jint cbinbuffer, jlong lpvoutbuffer, jint cboutbuffer, jlong lpcbbytesreturned, jlong lpcompletion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSANSPIoctl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlookup, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpvinbuffer, (uint32_t)cbinbuffer, (void*)(uintptr_t)lpvoutbuffer, (uint32_t)cboutbuffer, (void*)(uintptr_t)lpcbbytesreturned, (void*)(uintptr_t)lpcompletion) : -1;
#else
    (void)hlookup;
    (void)dwcontrolcode;
    (void)lpvinbuffer;
    (void)cbinbuffer;
    (void)lpvoutbuffer;
    (void)cboutbuffer;
    (void)lpcbbytesreturned;
    (void)lpcompletion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSANtohl(JNIEnv* km_env, jclass km_clazz, jlong s, jint netlong, jlong lphostlong) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSANtohl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (uint32_t)netlong, (void*)(uintptr_t)lphostlong) : -1;
#else
    (void)s;
    (void)netlong;
    (void)lphostlong;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSANtohs(JNIEnv* km_env, jclass km_clazz, jlong s, jshort netshort, jlong lphostshort) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSANtohs");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (uint16_t)netshort, (void*)(uintptr_t)lphostshort) : -1;
#else
    (void)s;
    (void)netshort;
    (void)lphostshort;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAPoll(JNIEnv* km_env, jclass km_clazz, jlong fdarray, jint fds, jint timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAPoll");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fdarray, (uint32_t)fds, (int32_t)timeout) : -1;
#else
    (void)fdarray;
    (void)fds;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAProviderCompleteAsyncCall(JNIEnv* km_env, jclass km_clazz, jlong hasynccall, jint iretcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAProviderCompleteAsyncCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hasynccall, (int32_t)iretcode) : -1;
#else
    (void)hasynccall;
    (void)iretcode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAProviderConfigChange(JNIEnv* km_env, jclass km_clazz, jlong lpnotificationhandle, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAProviderConfigChange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpnotificationhandle, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine) : -1;
#else
    (void)lpnotificationhandle;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAQuerySocketSecurity(JNIEnv* km_env, jclass km_clazz, jlong arg_0_socket, jlong securityquerytemplate, jint securityquerytemplatelen, jlong securityqueryinfo, jlong securityqueryinfolen, jlong overlapped, jlong completionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAQuerySocketSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)arg_0_socket, (void*)(uintptr_t)securityquerytemplate, (uint32_t)securityquerytemplatelen, (void*)(uintptr_t)securityqueryinfo, (void*)(uintptr_t)securityqueryinfolen, (void*)(uintptr_t)overlapped, (void*)(uintptr_t)completionroutine) : -1;
#else
    (void)arg_0_socket;
    (void)securityquerytemplate;
    (void)securityquerytemplatelen;
    (void)securityqueryinfo;
    (void)securityqueryinfolen;
    (void)overlapped;
    (void)completionroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSARecv(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpbuffers, jint dwbuffercount, jlong lpnumberofbytesrecvd, jlong lpflags, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARecv");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpbuffers, (uint32_t)dwbuffercount, (void*)(uintptr_t)lpnumberofbytesrecvd, (void*)(uintptr_t)lpflags, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine) : -1;
#else
    (void)s;
    (void)lpbuffers;
    (void)dwbuffercount;
    (void)lpnumberofbytesrecvd;
    (void)lpflags;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSARecvDisconnect(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpinbounddisconnectdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARecvDisconnect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpinbounddisconnectdata) : -1;
#else
    (void)s;
    (void)lpinbounddisconnectdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSARecvEx(JNIEnv* km_env, jclass km_clazz, jlong s, jlong buf, jint len, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mswsock.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARecvEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)buf, (int32_t)len, (void*)(uintptr_t)flags) : -1;
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSARecvFrom(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpbuffers, jint dwbuffercount, jlong lpnumberofbytesrecvd, jlong lpflags, jlong lpfrom, jlong lpfromlen, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARecvFrom");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpbuffers, (uint32_t)dwbuffercount, (void*)(uintptr_t)lpnumberofbytesrecvd, (void*)(uintptr_t)lpflags, (void*)(uintptr_t)lpfrom, (void*)(uintptr_t)lpfromlen, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSARemoveServiceClass(JNIEnv* km_env, jclass km_clazz, jlong lpserviceclassid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARemoveServiceClass");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpserviceclassid) : -1;
#else
    (void)lpserviceclassid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAResetEvent(JNIEnv* km_env, jclass km_clazz, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAResetEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hevent) : -1;
#else
    (void)hevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSARevertImpersonation(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSARevertImpersonation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSASend(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpbuffers, jint dwbuffercount, jlong lpnumberofbytessent, jint dwflags, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpbuffers, (uint32_t)dwbuffercount, (void*)(uintptr_t)lpnumberofbytessent, (uint32_t)dwflags, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine) : -1;
#else
    (void)s;
    (void)lpbuffers;
    (void)dwbuffercount;
    (void)lpnumberofbytessent;
    (void)dwflags;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSASendDisconnect(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpoutbounddisconnectdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASendDisconnect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpoutbounddisconnectdata) : -1;
#else
    (void)s;
    (void)lpoutbounddisconnectdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSASendMsg(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong lpmsg, jint dwflags, jlong lpnumberofbytessent, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASendMsg");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)handle, (void*)(uintptr_t)lpmsg, (uint32_t)dwflags, (void*)(uintptr_t)lpnumberofbytessent, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine) : -1;
#else
    (void)handle;
    (void)lpmsg;
    (void)dwflags;
    (void)lpnumberofbytessent;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSASendTo(JNIEnv* km_env, jclass km_clazz, jlong s, jlong lpbuffers, jint dwbuffercount, jlong lpnumberofbytessent, jint dwflags, jlong lpto, jint itolen, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASendTo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)lpbuffers, (uint32_t)dwbuffercount, (void*)(uintptr_t)lpnumberofbytessent, (uint32_t)dwflags, (void*)(uintptr_t)lpto, (int32_t)itolen, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSASetEvent(JNIEnv* km_env, jclass km_clazz, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hevent) : -1;
#else
    (void)hevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSASetLastError(JNIEnv* km_env, jclass km_clazz, jint ierror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetLastError");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)ierror);
#else
    (void)ierror;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSASetServiceA(JNIEnv* km_env, jclass km_clazz, jlong lpqsreginfo, jint essoperation, jint dwcontrolflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetServiceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpqsreginfo, (int32_t)essoperation, (uint32_t)dwcontrolflags) : -1;
#else
    (void)lpqsreginfo;
    (void)essoperation;
    (void)dwcontrolflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSASetServiceW(JNIEnv* km_env, jclass km_clazz, jlong lpqsreginfo, jint essoperation, jint dwcontrolflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetServiceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpqsreginfo, (int32_t)essoperation, (uint32_t)dwcontrolflags) : -1;
#else
    (void)lpqsreginfo;
    (void)essoperation;
    (void)dwcontrolflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSASetSocketPeerTargetName(JNIEnv* km_env, jclass km_clazz, jlong arg_0_socket, jlong peertargetname, jint peertargetnamelen, jlong overlapped, jlong completionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetSocketPeerTargetName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)arg_0_socket, (void*)(uintptr_t)peertargetname, (uint32_t)peertargetnamelen, (void*)(uintptr_t)overlapped, (void*)(uintptr_t)completionroutine) : -1;
#else
    (void)arg_0_socket;
    (void)peertargetname;
    (void)peertargetnamelen;
    (void)overlapped;
    (void)completionroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSASetSocketSecurity(JNIEnv* km_env, jclass km_clazz, jlong arg_0_socket, jlong securitysettings, jint securitysettingslen, jlong overlapped, jlong completionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASetSocketSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)arg_0_socket, (void*)(uintptr_t)securitysettings, (uint32_t)securitysettingslen, (void*)(uintptr_t)overlapped, (void*)(uintptr_t)completionroutine) : -1;
#else
    (void)arg_0_socket;
    (void)securitysettings;
    (void)securitysettingslen;
    (void)overlapped;
    (void)completionroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSASocketA(JNIEnv* km_env, jclass km_clazz, jint af, jint type, jint protocol, jlong lpprotocolinfo, jint g, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASocketA");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)af, (int32_t)type, (int32_t)protocol, (void*)(uintptr_t)lpprotocolinfo, (uint32_t)g, (uint32_t)dwflags) : 0;
#else
    (void)af;
    (void)type;
    (void)protocol;
    (void)lpprotocolinfo;
    (void)g;
    (void)dwflags;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSASocketW(JNIEnv* km_env, jclass km_clazz, jint af, jint type, jint protocol, jlong lpprotocolinfo, jint g, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSASocketW");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)af, (int32_t)type, (int32_t)protocol, (void*)(uintptr_t)lpprotocolinfo, (uint32_t)g, (uint32_t)dwflags) : 0;
#else
    (void)af;
    (void)type;
    (void)protocol;
    (void)lpprotocolinfo;
    (void)g;
    (void)dwflags;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAStartup(JNIEnv* km_env, jclass km_clazz, jshort wversionrequested, jlong lpwsadata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAStartup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)wversionrequested, (void*)(uintptr_t)lpwsadata) : -1;
#else
    (void)wversionrequested;
    (void)lpwsadata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAStringToAddressA(JNIEnv* km_env, jclass km_clazz, jlong addressstring, jint addressfamily, jlong lpprotocolinfo, jlong lpaddress, jlong lpaddresslength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAStringToAddressA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)addressstring, (int32_t)addressfamily, (void*)(uintptr_t)lpprotocolinfo, (void*)(uintptr_t)lpaddress, (void*)(uintptr_t)lpaddresslength) : -1;
#else
    (void)addressstring;
    (void)addressfamily;
    (void)lpprotocolinfo;
    (void)lpaddress;
    (void)lpaddresslength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAStringToAddressW(JNIEnv* km_env, jclass km_clazz, jlong addressstring, jint addressfamily, jlong lpprotocolinfo, jlong lpaddress, jlong lpaddresslength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAStringToAddressW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)addressstring, (int32_t)addressfamily, (void*)(uintptr_t)lpprotocolinfo, (void*)(uintptr_t)lpaddress, (void*)(uintptr_t)lpaddresslength) : -1;
#else
    (void)addressstring;
    (void)addressfamily;
    (void)lpprotocolinfo;
    (void)lpaddress;
    (void)lpaddresslength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAUnadvertiseProvider(JNIEnv* km_env, jclass km_clazz, jlong puuidproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAUnadvertiseProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)puuidproviderid) : -1;
#else
    (void)puuidproviderid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAUnhookBlockingHook(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAUnhookBlockingHook");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSAWaitForMultipleEvents(JNIEnv* km_env, jclass km_clazz, jint cevents, jlong lphevents, jint fwaitall, jint dwtimeout, jint falertable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSAWaitForMultipleEvents");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cevents, (void*)(uintptr_t)lphevents, (int32_t)fwaitall, (uint32_t)dwtimeout, (int32_t)falertable) : 0;
#else
    (void)cevents;
    (void)lphevents;
    (void)fwaitall;
    (void)dwtimeout;
    (void)falertable;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCDeinstallProvider(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCDeinstallProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCDeinstallProvider32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCDeinstallProvider32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCEnableNSProvider(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint fenable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnableNSProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (int32_t)fenable) : -1;
#else
    (void)lpproviderid;
    (void)fenable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCEnableNSProvider32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint fenable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnableNSProvider32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (int32_t)fenable) : -1;
#else
    (void)lpproviderid;
    (void)fenable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCEnumNameSpaceProviders32(JNIEnv* km_env, jclass km_clazz, jlong lpdwbufferlength, jlong lpnspbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnumNameSpaceProviders32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpnspbuffer) : -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCEnumNameSpaceProvidersEx32(JNIEnv* km_env, jclass km_clazz, jlong lpdwbufferlength, jlong lpnspbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnumNameSpaceProvidersEx32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpnspbuffer) : -1;
#else
    (void)lpdwbufferlength;
    (void)lpnspbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCEnumProtocols(JNIEnv* km_env, jclass km_clazz, jlong lpiprotocols, jlong lpprotocolbuffer, jlong lpdwbufferlength, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnumProtocols");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpiprotocols, (void*)(uintptr_t)lpprotocolbuffer, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCEnumProtocols32(JNIEnv* km_env, jclass km_clazz, jlong lpiprotocols, jlong lpprotocolbuffer, jlong lpdwbufferlength, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCEnumProtocols32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpiprotocols, (void*)(uintptr_t)lpprotocolbuffer, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)lpiprotocols;
    (void)lpprotocolbuffer;
    (void)lpdwbufferlength;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCGetApplicationCategory(JNIEnv* km_env, jclass km_clazz, jlong path, jint pathlength, jlong extra, jint extralength, jlong ppermittedlspcategories, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCGetApplicationCategory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (uint32_t)pathlength, (void*)(uintptr_t)extra, (uint32_t)extralength, (void*)(uintptr_t)ppermittedlspcategories, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)path;
    (void)pathlength;
    (void)extra;
    (void)extralength;
    (void)ppermittedlspcategories;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCGetProviderInfo(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint infotype, jlong info, jlong infosize, jint flags, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCGetProviderInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (int32_t)infotype, (void*)(uintptr_t)info, (void*)(uintptr_t)infosize, (uint32_t)flags, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCGetProviderInfo32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint infotype, jlong info, jlong infosize, jint flags, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCGetProviderInfo32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (int32_t)infotype, (void*)(uintptr_t)info, (void*)(uintptr_t)infosize, (uint32_t)flags, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCGetProviderPath(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpszproviderdllpath, jlong lpproviderdllpathlen, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCGetProviderPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpszproviderdllpath, (void*)(uintptr_t)lpproviderdllpathlen, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpproviderdllpathlen;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCGetProviderPath32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpszproviderdllpath, jlong lpproviderdllpathlen, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCGetProviderPath32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpszproviderdllpath, (void*)(uintptr_t)lpproviderdllpathlen, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpproviderdllpathlen;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCInstallNameSpace(JNIEnv* km_env, jclass km_clazz, jlong lpszidentifier, jlong lpszpathname, jint dwnamespace, jint dwversion, jlong lpproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallNameSpace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszidentifier, (void*)(uintptr_t)lpszpathname, (uint32_t)dwnamespace, (uint32_t)dwversion, (void*)(uintptr_t)lpproviderid) : -1;
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCInstallNameSpace32(JNIEnv* km_env, jclass km_clazz, jlong lpszidentifier, jlong lpszpathname, jint dwnamespace, jint dwversion, jlong lpproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallNameSpace32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszidentifier, (void*)(uintptr_t)lpszpathname, (uint32_t)dwnamespace, (uint32_t)dwversion, (void*)(uintptr_t)lpproviderid) : -1;
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCInstallNameSpaceEx(JNIEnv* km_env, jclass km_clazz, jlong lpszidentifier, jlong lpszpathname, jint dwnamespace, jint dwversion, jlong lpproviderid, jlong lpproviderspecific) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallNameSpaceEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszidentifier, (void*)(uintptr_t)lpszpathname, (uint32_t)dwnamespace, (uint32_t)dwversion, (void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpproviderspecific) : -1;
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    (void)lpproviderspecific;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCInstallNameSpaceEx32(JNIEnv* km_env, jclass km_clazz, jlong lpszidentifier, jlong lpszpathname, jint dwnamespace, jint dwversion, jlong lpproviderid, jlong lpproviderspecific) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallNameSpaceEx32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszidentifier, (void*)(uintptr_t)lpszpathname, (uint32_t)dwnamespace, (uint32_t)dwversion, (void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpproviderspecific) : -1;
#else
    (void)lpszidentifier;
    (void)lpszpathname;
    (void)dwnamespace;
    (void)dwversion;
    (void)lpproviderid;
    (void)lpproviderspecific;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCInstallProvider(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpszproviderdllpath, jlong lpprotocolinfolist, jint dwnumberofentries, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpszproviderdllpath, (void*)(uintptr_t)lpprotocolinfolist, (uint32_t)dwnumberofentries, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCInstallProvider64_132(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpszproviderdllpath, jlong lpprotocolinfolist, jint dwnumberofentries, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallProvider64_32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpszproviderdllpath, (void*)(uintptr_t)lpprotocolinfolist, (uint32_t)dwnumberofentries, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCInstallProviderAndChains64_132(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpszproviderdllpath, jlong lpszproviderdllpath32, jlong lpszlspname, jint dwserviceflags, jlong lpprotocolinfolist, jint dwnumberofentries, jlong lpdwcatalogentryid, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCInstallProviderAndChains64_32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpszproviderdllpath, (void*)(uintptr_t)lpszproviderdllpath32, (void*)(uintptr_t)lpszlspname, (uint32_t)dwserviceflags, (void*)(uintptr_t)lpprotocolinfolist, (uint32_t)dwnumberofentries, (void*)(uintptr_t)lpdwcatalogentryid, (void*)(uintptr_t)lperrno) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCSetApplicationCategory(JNIEnv* km_env, jclass km_clazz, jlong path, jint pathlength, jlong extra, jint extralength, jint permittedlspcategories, jlong pprevpermlspcat, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCSetApplicationCategory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)path, (uint32_t)pathlength, (void*)(uintptr_t)extra, (uint32_t)extralength, (uint32_t)permittedlspcategories, (void*)(uintptr_t)pprevpermlspcat, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)path;
    (void)pathlength;
    (void)extra;
    (void)extralength;
    (void)permittedlspcategories;
    (void)pprevpermlspcat;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCSetProviderInfo(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint infotype, jlong info, jlong infosize, jint flags, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCSetProviderInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (int32_t)infotype, (void*)(uintptr_t)info, (uint64_t)infosize, (uint32_t)flags, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCSetProviderInfo32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint infotype, jlong info, jlong infosize, jint flags, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCSetProviderInfo32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (int32_t)infotype, (void*)(uintptr_t)info, (uint64_t)infosize, (uint32_t)flags, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)lpproviderid;
    (void)infotype;
    (void)info;
    (void)infosize;
    (void)flags;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCUnInstallNameSpace(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCUnInstallNameSpace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid) : -1;
#else
    (void)lpproviderid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCUnInstallNameSpace32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCUnInstallNameSpace32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid) : -1;
#else
    (void)lpproviderid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCUpdateProvider(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpszproviderdllpath, jlong lpprotocolinfolist, jint dwnumberofentries, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCUpdateProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpszproviderdllpath, (void*)(uintptr_t)lpprotocolinfolist, (uint32_t)dwnumberofentries, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCUpdateProvider32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jlong lpszproviderdllpath, jlong lpprotocolinfolist, jint dwnumberofentries, jlong lperrno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCUpdateProvider32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (void*)(uintptr_t)lpszproviderdllpath, (void*)(uintptr_t)lpprotocolinfolist, (uint32_t)dwnumberofentries, (void*)(uintptr_t)lperrno) : -1;
#else
    (void)lpproviderid;
    (void)lpszproviderdllpath;
    (void)lpprotocolinfolist;
    (void)dwnumberofentries;
    (void)lperrno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCWriteNameSpaceOrder(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint dwnumberofentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCWriteNameSpaceOrder");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (uint32_t)dwnumberofentries) : -1;
#else
    (void)lpproviderid;
    (void)dwnumberofentries;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCWriteNameSpaceOrder32(JNIEnv* km_env, jclass km_clazz, jlong lpproviderid, jint dwnumberofentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCWriteNameSpaceOrder32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpproviderid, (uint32_t)dwnumberofentries) : -1;
#else
    (void)lpproviderid;
    (void)dwnumberofentries;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCWriteProviderOrder(JNIEnv* km_env, jclass km_clazz, jlong lpwdcatalogentryid, jint dwnumberofentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCWriteProviderOrder");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpwdcatalogentryid, (uint32_t)dwnumberofentries) : -1;
#else
    (void)lpwdcatalogentryid;
    (void)dwnumberofentries;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1WSCWriteProviderOrder32(JNIEnv* km_env, jclass km_clazz, jlong lpwdcatalogentryid, jint dwnumberofentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSCWriteProviderOrder32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpwdcatalogentryid, (uint32_t)dwnumberofentries) : -1;
#else
    (void)lpwdcatalogentryid;
    (void)dwnumberofentries;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1_1_1WSAFDIsSet(JNIEnv* km_env, jclass km_clazz, jlong fd, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "__WSAFDIsSet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)fd, (void*)(uintptr_t)param1) : -1;
#else
    (void)fd;
    (void)param1;
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
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)addr, (void*)(uintptr_t)addrlen) : 0;
#else
    (void)s;
    (void)addr;
    (void)addrlen;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)name, (int32_t)namelen) : -1;
#else
    (void)s;
    (void)name;
    (void)namelen;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s) : -1;
#else
    (void)s;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)name, (int32_t)namelen) : -1;
#else
    (void)s;
    (void)name;
    (void)namelen;
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
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)paddrinfo);
#else
    (void)paddrinfo;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pnodename, (void*)(uintptr_t)pservicename, (void*)(uintptr_t)phints, (void*)(uintptr_t)ppresult) : -1;
#else
    (void)pnodename;
    (void)pservicename;
    (void)phints;
    (void)ppresult;
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
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)addr, (int32_t)len, (int32_t)type) : NULL;
#else
    (void)addr;
    (void)len;
    (void)type;
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
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name) : NULL;
#else
    (void)name;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (int32_t)namelen) : -1;
#else
    (void)name;
    (void)namelen;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psockaddr, (int32_t)sockaddrlength, (void*)(uintptr_t)pnodebuffer, (uint32_t)nodebuffersize, (void*)(uintptr_t)pservicebuffer, (uint32_t)servicebuffersize, (int32_t)flags) : -1;
#else
    (void)psockaddr;
    (void)sockaddrlength;
    (void)pnodebuffer;
    (void)nodebuffersize;
    (void)pservicebuffer;
    (void)servicebuffersize;
    (void)flags;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)name, (void*)(uintptr_t)namelen) : -1;
#else
    (void)s;
    (void)name;
    (void)namelen;
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
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name) : NULL;
#else
    (void)name;
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
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)number) : NULL;
#else
    (void)number;
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
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)proto) : NULL;
#else
    (void)name;
    (void)proto;
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
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)port, (void*)(uintptr_t)proto) : NULL;
#else
    (void)port;
    (void)proto;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)name, (void*)(uintptr_t)namelen) : -1;
#else
    (void)s;
    (void)name;
    (void)namelen;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (int32_t)level, (int32_t)optname, (void*)(uintptr_t)optval, (void*)(uintptr_t)optlen) : -1;
#else
    (void)s;
    (void)level;
    (void)optname;
    (void)optval;
    (void)optlen;
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
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hostlong) : 0;
#else
    (void)hostlong;
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
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)hostshort) : 0;
#else
    (void)hostshort;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1inet_1addr(JNIEnv* km_env, jclass km_clazz, jlong cp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "inet_addr");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cp) : 0;
#else
    (void)cp;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1inet_1ntop(JNIEnv* km_env, jclass km_clazz, jint family, jlong paddr, jlong pstringbuf, jlong stringbufsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "inet_ntop");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)family, (void*)(uintptr_t)paddr, (void*)(uintptr_t)pstringbuf, (uint64_t)stringbufsize) : NULL;
#else
    (void)family;
    (void)paddr;
    (void)pstringbuf;
    (void)stringbufsize;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winsock_WindowsWin32NetworkingWinsockJniBridge_windowssys_1windows_1win32_1networking_1winsock_1inet_1pton(JNIEnv* km_env, jclass km_clazz, jint family, jlong pszaddrstring, jlong paddrbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ws2_32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "inet_pton");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)family, (void*)(uintptr_t)pszaddrstring, (void*)(uintptr_t)paddrbuf) : -1;
#else
    (void)family;
    (void)pszaddrstring;
    (void)paddrbuf;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (int32_t)cmd, (void*)(uintptr_t)argp) : -1;
#else
    (void)s;
    (void)cmd;
    (void)argp;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (int32_t)backlog) : -1;
#else
    (void)s;
    (void)backlog;
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
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)netlong) : 0;
#else
    (void)netlong;
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
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)netshort) : 0;
#else
    (void)netshort;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)buf, (int32_t)len, (int32_t)flags) : -1;
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)buf, (int32_t)len, (int32_t)flags, (void*)(uintptr_t)from, (void*)(uintptr_t)fromlen) : -1;
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    (void)from;
    (void)fromlen;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nfds, (void*)(uintptr_t)readfds, (void*)(uintptr_t)writefds, (void*)(uintptr_t)exceptfds, (void*)(uintptr_t)timeout) : -1;
#else
    (void)nfds;
    (void)readfds;
    (void)writefds;
    (void)exceptfds;
    (void)timeout;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)buf, (int32_t)len, (int32_t)flags) : -1;
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (void*)(uintptr_t)buf, (int32_t)len, (int32_t)flags, (void*)(uintptr_t)to, (int32_t)tolen) : -1;
#else
    (void)s;
    (void)buf;
    (void)len;
    (void)flags;
    (void)to;
    (void)tolen;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (int32_t)level, (int32_t)optname, (void*)(uintptr_t)optval, (int32_t)optlen) : -1;
#else
    (void)s;
    (void)level;
    (void)optname;
    (void)optval;
    (void)optlen;
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
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)s, (int32_t)how) : -1;
#else
    (void)s;
    (void)how;
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
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)af, (int32_t)type, (int32_t)protocol) : 0;
#else
    (void)af;
    (void)type;
    (void)protocol;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

