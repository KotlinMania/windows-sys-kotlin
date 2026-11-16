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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtClose(JNIEnv* km_env, jclass km_clazz, jlong hdrt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtClose");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hdrt);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hdrt;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtContinueSearch(JNIEnv* km_env, jclass km_clazz, jlong hsearchcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtContinueSearch");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsearchcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsearchcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKey(JNIEnv* km_env, jclass km_clazz, jlong plocalcert, jlong pkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreateDerivedKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plocalcert, (void*)(uintptr_t)pkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plocalcert;
    (void)pkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKeySecurityProvider(JNIEnv* km_env, jclass km_clazz, jlong prootcert, jlong plocalcert, jlong ppsecurityprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreateDerivedKeySecurityProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prootcert, (void*)(uintptr_t)plocalcert, (void*)(uintptr_t)ppsecurityprovider);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prootcert;
    (void)plocalcert;
    (void)ppsecurityprovider;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtCreateDnsBootstrapResolver(JNIEnv* km_env, jclass km_clazz, jshort port, jlong pwszaddress, jlong ppmodule) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreateDnsBootstrapResolver");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)port, (void*)(uintptr_t)pwszaddress, (void*)(uintptr_t)ppmodule);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)port;
    (void)pwszaddress;
    (void)ppmodule;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtCreateIpv6UdpTransport(JNIEnv* km_env, jclass km_clazz, jint scope, jint dwscopeid, jint dwlocalitythreshold, jlong pwport, jlong phtransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drttransport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreateIpv6UdpTransport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)scope, (uint32_t)dwscopeid, (uint32_t)dwlocalitythreshold, (void*)(uintptr_t)pwport, (void*)(uintptr_t)phtransport);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)scope;
    (void)dwscopeid;
    (void)dwlocalitythreshold;
    (void)pwport;
    (void)phtransport;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtCreateNullSecurityProvider(JNIEnv* km_env, jclass km_clazz, jlong ppsecurityprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreateNullSecurityProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppsecurityprovider);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppsecurityprovider;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtCreatePnrpBootstrapResolver(JNIEnv* km_env, jclass km_clazz, jint fpublish, jlong pwzpeername, jlong pwzcloudname, jlong pwzpublishingidentity, jlong ppresolver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreatePnrpBootstrapResolver");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fpublish, (void*)(uintptr_t)pwzpeername, (void*)(uintptr_t)pwzcloudname, (void*)(uintptr_t)pwzpublishingidentity, (void*)(uintptr_t)ppresolver);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fpublish;
    (void)pwzpeername;
    (void)pwzcloudname;
    (void)pwzpublishingidentity;
    (void)ppresolver;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtDeleteDerivedKeySecurityProvider(JNIEnv* km_env, jclass km_clazz, jlong psecurityprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtDeleteDerivedKeySecurityProvider");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)psecurityprovider);
    } else {
        errno = ENOSYS;
    }
#else
    (void)psecurityprovider;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtDeleteDnsBootstrapResolver(JNIEnv* km_env, jclass km_clazz, jlong presolver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtDeleteDnsBootstrapResolver");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)presolver);
    } else {
        errno = ENOSYS;
    }
#else
    (void)presolver;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtDeleteIpv6UdpTransport(JNIEnv* km_env, jclass km_clazz, jlong htransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drttransport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtDeleteIpv6UdpTransport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htransport);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htransport;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtDeleteNullSecurityProvider(JNIEnv* km_env, jclass km_clazz, jlong psecurityprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtDeleteNullSecurityProvider");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)psecurityprovider);
    } else {
        errno = ENOSYS;
    }
#else
    (void)psecurityprovider;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtDeletePnrpBootstrapResolver(JNIEnv* km_env, jclass km_clazz, jlong presolver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtDeletePnrpBootstrapResolver");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)presolver);
    } else {
        errno = ENOSYS;
    }
#else
    (void)presolver;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtEndSearch(JNIEnv* km_env, jclass km_clazz, jlong hsearchcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtEndSearch");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsearchcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsearchcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtGetEventData(JNIEnv* km_env, jclass km_clazz, jlong hdrt, jint uleventdatalen, jlong peventdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetEventData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdrt, (uint32_t)uleventdatalen, (void*)(uintptr_t)peventdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdrt;
    (void)uleventdatalen;
    (void)peventdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtGetEventDataSize(JNIEnv* km_env, jclass km_clazz, jlong hdrt, jlong puleventdatalen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetEventDataSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdrt, (void*)(uintptr_t)puleventdatalen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdrt;
    (void)puleventdatalen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceName(JNIEnv* km_env, jclass km_clazz, jlong hdrt, jint ulcbinstancenamesize, jlong pwzdrtinstancename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetInstanceName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdrt, (uint32_t)ulcbinstancenamesize, (void*)(uintptr_t)pwzdrtinstancename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdrt;
    (void)ulcbinstancenamesize;
    (void)pwzdrtinstancename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceNameSize(JNIEnv* km_env, jclass km_clazz, jlong hdrt, jlong pulcbinstancenamesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetInstanceNameSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdrt, (void*)(uintptr_t)pulcbinstancenamesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdrt;
    (void)pulcbinstancenamesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPath(JNIEnv* km_env, jclass km_clazz, jlong hsearchcontext, jint ulsearchpathsize, jlong psearchpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetSearchPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsearchcontext, (uint32_t)ulsearchpathsize, (void*)(uintptr_t)psearchpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsearchcontext;
    (void)ulsearchpathsize;
    (void)psearchpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPathSize(JNIEnv* km_env, jclass km_clazz, jlong hsearchcontext, jlong pulsearchpathsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetSearchPathSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsearchcontext, (void*)(uintptr_t)pulsearchpathsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsearchcontext;
    (void)pulsearchpathsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResult(JNIEnv* km_env, jclass km_clazz, jlong hsearchcontext, jint ulsearchresultsize, jlong psearchresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetSearchResult");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsearchcontext, (uint32_t)ulsearchresultsize, (void*)(uintptr_t)psearchresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsearchcontext;
    (void)ulsearchresultsize;
    (void)psearchresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResultSize(JNIEnv* km_env, jclass km_clazz, jlong hsearchcontext, jlong pulsearchresultsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetSearchResultSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsearchcontext, (void*)(uintptr_t)pulsearchresultsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsearchcontext;
    (void)pulsearchresultsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtOpen(JNIEnv* km_env, jclass km_clazz, jlong psettings, jlong hevent, jlong pvcontext, jlong phdrt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtOpen");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psettings, (void*)(uintptr_t)hevent, (void*)(uintptr_t)pvcontext, (void*)(uintptr_t)phdrt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psettings;
    (void)hevent;
    (void)pvcontext;
    (void)phdrt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtRegisterKey(JNIEnv* km_env, jclass km_clazz, jlong hdrt, jlong pregistration, jlong pvkeycontext, jlong phkeyregistration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtRegisterKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdrt, (void*)(uintptr_t)pregistration, (void*)(uintptr_t)pvkeycontext, (void*)(uintptr_t)phkeyregistration);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdrt;
    (void)pregistration;
    (void)pvkeycontext;
    (void)phkeyregistration;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtStartSearch(JNIEnv* km_env, jclass km_clazz, jlong hdrt, jlong pkey, jlong pinfo, jint timeout, jlong hevent, jlong pvcontext, jlong hsearchcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtStartSearch");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdrt, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pinfo, (uint32_t)timeout, (void*)(uintptr_t)hevent, (void*)(uintptr_t)pvcontext, (void*)(uintptr_t)hsearchcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdrt;
    (void)pkey;
    (void)pinfo;
    (void)timeout;
    (void)hevent;
    (void)pvcontext;
    (void)hsearchcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtUnregisterKey(JNIEnv* km_env, jclass km_clazz, jlong hkeyregistration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtUnregisterKey");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hkeyregistration);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hkeyregistration;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pDrtUpdateKey(JNIEnv* km_env, jclass km_clazz, jlong hkeyregistration, jlong pappdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtUpdateKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hkeyregistration, (void*)(uintptr_t)pappdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkeyregistration;
    (void)pappdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabAddContact(JNIEnv* km_env, jclass km_clazz, jlong pwzcontactdata, jlong ppcontact) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabAddContact");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzcontactdata, (void*)(uintptr_t)ppcontact);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzcontactdata;
    (void)ppcontact;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteContact(JNIEnv* km_env, jclass km_clazz, jlong pccontact, jlong pcendpoint, jlong pcinvitation, jlong hevent, jlong phinvitation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabAsyncInviteContact");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pccontact, (void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)pcinvitation, (void*)(uintptr_t)hevent, (void*)(uintptr_t)phinvitation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pccontact;
    (void)pcendpoint;
    (void)pcinvitation;
    (void)hevent;
    (void)phinvitation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteEndpoint(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint, jlong pcinvitation, jlong hevent, jlong phinvitation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabAsyncInviteEndpoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)pcinvitation, (void*)(uintptr_t)hevent, (void*)(uintptr_t)phinvitation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcendpoint;
    (void)pcinvitation;
    (void)hevent;
    (void)phinvitation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabCancelInvitation(JNIEnv* km_env, jclass km_clazz, jlong hinvitation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabCancelInvitation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinvitation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinvitation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong hinvitation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabCloseHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinvitation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinvitation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteContact(JNIEnv* km_env, jclass km_clazz, jlong pwzpeername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabDeleteContact");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzpeername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzpeername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteEndpointData(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabDeleteEndpointData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcendpoint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcendpoint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteObject(JNIEnv* km_env, jclass km_clazz, jlong pobjectid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabDeleteObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pobjectid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pobjectid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplicationRegistrationInfo(JNIEnv* km_env, jclass km_clazz, jint registrationtype, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumApplicationRegistrationInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)registrationtype, (void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)registrationtype;
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplications(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint, jlong papplicationid, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumApplications");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)papplicationid, (void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcendpoint;
    (void)papplicationid;
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumContacts(JNIEnv* km_env, jclass km_clazz, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumContacts");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumEndpoints(JNIEnv* km_env, jclass km_clazz, jlong pccontact, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumEndpoints");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pccontact, (void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pccontact;
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumObjects(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint, jlong pobjectid, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumObjects");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)pobjectid, (void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcendpoint;
    (void)pobjectid;
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumPeopleNearMe(JNIEnv* km_env, jclass km_clazz, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumPeopleNearMe");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabExportContact(JNIEnv* km_env, jclass km_clazz, jlong pwzpeername, jlong ppwzcontactdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabExportContact");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzpeername, (void*)(uintptr_t)ppwzcontactdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzpeername;
    (void)ppwzcontactdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetAppLaunchInfo(JNIEnv* km_env, jclass km_clazz, jlong pplaunchinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetAppLaunchInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pplaunchinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pplaunchinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetApplicationRegistrationInfo(JNIEnv* km_env, jclass km_clazz, jlong papplicationid, jint registrationtype, jlong ppapplication) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetApplicationRegistrationInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)papplicationid, (int32_t)registrationtype, (void*)(uintptr_t)ppapplication);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)papplicationid;
    (void)registrationtype;
    (void)ppapplication;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetContact(JNIEnv* km_env, jclass km_clazz, jlong pwzpeername, jlong ppcontact) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetContact");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzpeername, (void*)(uintptr_t)ppcontact);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzpeername;
    (void)ppcontact;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEndpointName(JNIEnv* km_env, jclass km_clazz, jlong ppwzendpointname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetEndpointName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppwzendpointname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppwzendpointname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEventData(JNIEnv* km_env, jclass km_clazz, jlong hpeerevent, jlong ppeventdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetEventData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpeerevent, (void*)(uintptr_t)ppeventdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpeerevent;
    (void)ppeventdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetInvitationResponse(JNIEnv* km_env, jclass km_clazz, jlong hinvitation, jlong ppinvitationresponse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetInvitationResponse");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinvitation, (void*)(uintptr_t)ppinvitationresponse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinvitation;
    (void)ppinvitationresponse;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetPresenceInfo(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint, jlong pppresenceinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetPresenceInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)pppresenceinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcendpoint;
    (void)pppresenceinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetSigninOptions(JNIEnv* km_env, jclass km_clazz, jlong pdwsigninoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetSigninOptions");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdwsigninoptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdwsigninoptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteContact(JNIEnv* km_env, jclass km_clazz, jlong pccontact, jlong pcendpoint, jlong pcinvitation, jlong ppresponse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabInviteContact");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pccontact, (void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)pcinvitation, (void*)(uintptr_t)ppresponse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pccontact;
    (void)pcendpoint;
    (void)pcinvitation;
    (void)ppresponse;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteEndpoint(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint, jlong pcinvitation, jlong ppresponse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabInviteEndpoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)pcinvitation, (void*)(uintptr_t)ppresponse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcendpoint;
    (void)pcinvitation;
    (void)ppresponse;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabParseContact(JNIEnv* km_env, jclass km_clazz, jlong pwzcontactdata, jlong ppcontact) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabParseContact");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzcontactdata, (void*)(uintptr_t)ppcontact);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzcontactdata;
    (void)ppcontact;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabQueryContactData(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint, jlong ppwzcontactdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabQueryContactData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)ppwzcontactdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcendpoint;
    (void)ppwzcontactdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabRefreshEndpointData(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabRefreshEndpointData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcendpoint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcendpoint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterApplication(JNIEnv* km_env, jclass km_clazz, jlong pcapplication, jint registrationtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabRegisterApplication");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcapplication, (int32_t)registrationtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcapplication;
    (void)registrationtype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hevent, jint ceventregistration, jlong peventregistrations, jlong phpeerevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabRegisterEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hevent, (uint32_t)ceventregistration, (void*)(uintptr_t)peventregistrations, (void*)(uintptr_t)phpeerevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hevent;
    (void)ceventregistration;
    (void)peventregistrations;
    (void)phpeerevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetEndpointName(JNIEnv* km_env, jclass km_clazz, jlong pwzendpointname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSetEndpointName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzendpointname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzendpointname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetObject(JNIEnv* km_env, jclass km_clazz, jlong pcobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSetObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetPresenceInfo(JNIEnv* km_env, jclass km_clazz, jlong pcpresenceinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSetPresenceInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcpresenceinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcpresenceinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabShutdown(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabShutdown");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabSignin(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jint dwsigninoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSignin");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (uint32_t)dwsigninoptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)dwsigninoptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabSignout(JNIEnv* km_env, jclass km_clazz, jint dwsigninoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSignout");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwsigninoptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwsigninoptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabStartup(JNIEnv* km_env, jclass km_clazz, jshort wversionrequested) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabStartup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)wversionrequested);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wversionrequested;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabSubscribeEndpointData(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSubscribeEndpointData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcendpoint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcendpoint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterApplication(JNIEnv* km_env, jclass km_clazz, jlong papplicationid, jint registrationtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabUnregisterApplication");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)papplicationid, (int32_t)registrationtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)papplicationid;
    (void)registrationtype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hpeerevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabUnregisterEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpeerevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpeerevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnsubscribeEndpointData(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabUnsubscribeEndpointData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcendpoint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcendpoint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCollabUpdateContact(JNIEnv* km_env, jclass km_clazz, jlong pcontact) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabUpdateContact");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcontact);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcontact;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerCreatePeerName(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong pwzclassifier, jlong ppwzpeername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCreatePeerName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)pwzclassifier, (void*)(uintptr_t)ppwzpeername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzidentity;
    (void)pwzclassifier;
    (void)ppwzpeername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddContentInformation(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle, jint cbnumberofbytes, jlong pbuffer, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientAddContentInformation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle, (uint32_t)cbnumberofbytes, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddData(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle, jint cbnumberofbytes, jlong pbuffer, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientAddData");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle, (uint32_t)cbnumberofbytes, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistClientBlockRead(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle, jint cbmaxnumberofbytes, jlong pbuffer, jint dwtimeoutinmilliseconds, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientBlockRead");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle, (uint32_t)cbmaxnumberofbytes, (void*)(uintptr_t)pbuffer, (uint32_t)dwtimeoutinmilliseconds, (void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbmaxnumberofbytes;
    (void)pbuffer;
    (void)dwtimeoutinmilliseconds;
    (void)lpoverlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCancelAsyncOperation(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientCancelAsyncOperation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle, (void*)(uintptr_t)poverlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)poverlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCloseContent(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientCloseContent");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCompleteContentInformation(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientCompleteContentInformation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle, (void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)lpoverlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistClientFlushContent(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong pcontenttag, jlong hcompletionport, jlong ulcompletionkey, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientFlushContent");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (void*)(uintptr_t)pcontenttag, (void*)(uintptr_t)hcompletionport, (uint64_t)ulcompletionkey, (void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)pcontenttag;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)lpoverlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistClientGetInformationByHandle(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle, jint peerdistclientinfoclass, jint dwbuffersize, jlong lpinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientGetInformationByHandle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle, (int32_t)peerdistclientinfoclass, (uint32_t)dwbuffersize, (void*)(uintptr_t)lpinformation);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)peerdistclientinfoclass;
    (void)dwbuffersize;
    (void)lpinformation;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistClientOpenContent(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong pcontenttag, jlong hcompletionport, jlong ulcompletionkey, jlong phcontenthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientOpenContent");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (void*)(uintptr_t)pcontenttag, (void*)(uintptr_t)hcompletionport, (uint64_t)ulcompletionkey, (void*)(uintptr_t)phcontenthandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)pcontenttag;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)phcontenthandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistClientStreamRead(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle, jint cbmaxnumberofbytes, jlong pbuffer, jint dwtimeoutinmilliseconds, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientStreamRead");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle, (uint32_t)cbmaxnumberofbytes, (void*)(uintptr_t)pbuffer, (uint32_t)dwtimeoutinmilliseconds, (void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbmaxnumberofbytes;
    (void)pbuffer;
    (void)dwtimeoutinmilliseconds;
    (void)lpoverlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistGetOverlappedResult(JNIEnv* km_env, jclass km_clazz, jlong lpoverlapped, jlong lpnumberofbytestransferred, jint bwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistGetOverlappedResult");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpnumberofbytestransferred, (int32_t)bwait);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpoverlapped;
    (void)lpnumberofbytestransferred;
    (void)bwait;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatus(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong ppeerdiststatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistGetStatus");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (void*)(uintptr_t)ppeerdiststatus);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)ppeerdiststatus;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatusEx(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong ppeerdiststatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistGetStatusEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (void*)(uintptr_t)ppeerdiststatus);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)ppeerdiststatus;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcompletionport, jlong ulcompletionkey, jlong lpoverlapped, jlong ppeerdiststatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistRegisterForStatusChangeNotification");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (void*)(uintptr_t)hcompletionport, (uint64_t)ulcompletionkey, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)ppeerdiststatus);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)lpoverlapped;
    (void)ppeerdiststatus;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotificationEx(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcompletionport, jlong ulcompletionkey, jlong lpoverlapped, jlong ppeerdiststatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistRegisterForStatusChangeNotificationEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (void*)(uintptr_t)hcompletionport, (uint64_t)ulcompletionkey, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)ppeerdiststatus);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)lpoverlapped;
    (void)ppeerdiststatus;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCancelAsyncOperation(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jint cbcontentidentifier, jlong pcontentidentifier, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerCancelAsyncOperation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (uint32_t)cbcontentidentifier, (void*)(uintptr_t)pcontentidentifier, (void*)(uintptr_t)poverlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    (void)poverlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseContentInformation(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontentinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerCloseContentInformation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontentinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)hcontentinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseStreamHandle(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hstream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerCloseStreamHandle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (int64_t)hstream);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)hstream;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformation(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jint cbcontentidentifier, jlong pcontentidentifier, jlong ullcontentoffset, jlong cbcontentlength, jlong hcompletionport, jlong ulcompletionkey, jlong phcontentinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint64_t, uint64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerOpenContentInformation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (uint32_t)cbcontentidentifier, (void*)(uintptr_t)pcontentidentifier, (uint64_t)ullcontentoffset, (uint64_t)cbcontentlength, (void*)(uintptr_t)hcompletionport, (uint64_t)ulcompletionkey, (void*)(uintptr_t)phcontentinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    (void)ullcontentoffset;
    (void)cbcontentlength;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)phcontentinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformationEx(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jint cbcontentidentifier, jlong pcontentidentifier, jlong ullcontentoffset, jlong cbcontentlength, jlong pretrievaloptions, jlong hcompletionport, jlong ulcompletionkey, jlong phcontentinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint64_t, uint64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerOpenContentInformationEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (uint32_t)cbcontentidentifier, (void*)(uintptr_t)pcontentidentifier, (uint64_t)ullcontentoffset, (uint64_t)cbcontentlength, (void*)(uintptr_t)pretrievaloptions, (void*)(uintptr_t)hcompletionport, (uint64_t)ulcompletionkey, (void*)(uintptr_t)phcontentinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    (void)ullcontentoffset;
    (void)cbcontentlength;
    (void)pretrievaloptions;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)phcontentinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishAddToStream(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hstream, jint cbnumberofbytes, jlong pbuffer, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerPublishAddToStream");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (int64_t)hstream, (uint32_t)cbnumberofbytes, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)hstream;
    (void)cbnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishCompleteStream(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hstream, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerPublishCompleteStream");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (int64_t)hstream, (void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)hstream;
    (void)lpoverlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishStream(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jint cbcontentidentifier, jlong pcontentidentifier, jlong cbcontentlength, jlong ppublishoptions, jlong hcompletionport, jlong ulcompletionkey, jlong phstream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerPublishStream");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (uint32_t)cbcontentidentifier, (void*)(uintptr_t)pcontentidentifier, (uint64_t)cbcontentlength, (void*)(uintptr_t)ppublishoptions, (void*)(uintptr_t)hcompletionport, (uint64_t)ulcompletionkey, (void*)(uintptr_t)phstream);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    (void)cbcontentlength;
    (void)ppublishoptions;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)phstream;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistServerRetrieveContentInformation(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontentinfo, jint cbmaxnumberofbytes, jlong pbuffer, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerRetrieveContentInformation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontentinfo, (uint32_t)cbmaxnumberofbytes, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)hcontentinfo;
    (void)cbmaxnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistServerUnpublish(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jint cbcontentidentifier, jlong pcontentidentifier) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerUnpublish");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist, (uint32_t)cbcontentidentifier, (void*)(uintptr_t)pcontentidentifier);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistShutdown(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistShutdown");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistStartup(JNIEnv* km_env, jclass km_clazz, jint dwversionrequested, jlong phpeerdist, jlong pdwsupportedversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistStartup");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwversionrequested, (void*)(uintptr_t)phpeerdist, (void*)(uintptr_t)pdwsupportedversion);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwversionrequested;
    (void)phpeerdist;
    (void)pdwsupportedversion;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerDistUnregisterForStatusChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistUnregisterForStatusChangeNotification");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hpeerdist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hpeerdist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerEndEnumeration(JNIEnv* km_env, jclass km_clazz, jlong hpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerEndEnumeration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerEnumGroups(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerEnumGroups");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzidentity;
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerEnumIdentities(JNIEnv* km_env, jclass km_clazz, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerEnumIdentities");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerFreeData(JNIEnv* km_env, jclass km_clazz, jlong pvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerFreeData");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pvdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pvdata;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGetItemCount(JNIEnv* km_env, jclass km_clazz, jlong hpeerenum, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGetItemCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpeerenum, (void*)(uintptr_t)pcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpeerenum;
    (void)pcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGetNextItem(JNIEnv* km_env, jclass km_clazz, jlong hpeerenum, jlong pcount, jlong pppvitems) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGetNextItem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpeerenum, (void*)(uintptr_t)pcount, (void*)(uintptr_t)pppvitems);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpeerenum;
    (void)pcount;
    (void)pppvitems;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphAddRecord(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong precord, jlong precordid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphAddRecord");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)precord, (void*)(uintptr_t)precordid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)precord;
    (void)precordid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphClose(JNIEnv* km_env, jclass km_clazz, jlong hgraph) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphCloseDirectConnection(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong ullconnectionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphCloseDirectConnection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (uint64_t)ullconnectionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)ullconnectionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphConnect(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pwzpeerid, jlong paddress, jlong pullconnectionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphConnect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pwzpeerid, (void*)(uintptr_t)paddress, (void*)(uintptr_t)pullconnectionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)pwzpeerid;
    (void)paddress;
    (void)pullconnectionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphCreate(JNIEnv* km_env, jclass km_clazz, jlong pgraphproperties, jlong pwzdatabasename, jlong psecurityinterface, jlong phgraph) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphCreate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pgraphproperties, (void*)(uintptr_t)pwzdatabasename, (void*)(uintptr_t)psecurityinterface, (void*)(uintptr_t)phgraph);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pgraphproperties;
    (void)pwzdatabasename;
    (void)psecurityinterface;
    (void)phgraph;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphDelete(JNIEnv* km_env, jclass km_clazz, jlong pwzgraphid, jlong pwzpeerid, jlong pwzdatabasename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphDelete");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzgraphid, (void*)(uintptr_t)pwzpeerid, (void*)(uintptr_t)pwzdatabasename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzgraphid;
    (void)pwzpeerid;
    (void)pwzdatabasename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphDeleteRecord(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong precordid, jint flocal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphDeleteRecord");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)precordid, (int32_t)flocal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)precordid;
    (void)flocal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphEndEnumeration(JNIEnv* km_env, jclass km_clazz, jlong hpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphEndEnumeration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumConnections(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jint dwflags, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphEnumConnections");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (uint32_t)dwflags, (void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)dwflags;
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumNodes(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pwzpeerid, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphEnumNodes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pwzpeerid, (void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)pwzpeerid;
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumRecords(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong precordtype, jlong pwzpeerid, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphEnumRecords");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)precordtype, (void*)(uintptr_t)pwzpeerid, (void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)precordtype;
    (void)pwzpeerid;
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphExportDatabase(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pwzfilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphExportDatabase");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pwzfilepath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)pwzfilepath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphFreeData(JNIEnv* km_env, jclass km_clazz, jlong pvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphFreeData");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pvdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pvdata;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetEventData(JNIEnv* km_env, jclass km_clazz, jlong hpeerevent, jlong ppeventdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetEventData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpeerevent, (void*)(uintptr_t)ppeventdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpeerevent;
    (void)ppeventdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetItemCount(JNIEnv* km_env, jclass km_clazz, jlong hpeerenum, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetItemCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpeerenum, (void*)(uintptr_t)pcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpeerenum;
    (void)pcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNextItem(JNIEnv* km_env, jclass km_clazz, jlong hpeerenum, jlong pcount, jlong pppvitems) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetNextItem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpeerenum, (void*)(uintptr_t)pcount, (void*)(uintptr_t)pppvitems);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpeerenum;
    (void)pcount;
    (void)pppvitems;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNodeInfo(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong ullnodeid, jlong ppnodeinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetNodeInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (uint64_t)ullnodeid, (void*)(uintptr_t)ppnodeinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)ullnodeid;
    (void)ppnodeinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetProperties(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong ppgraphproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)ppgraphproperties);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)ppgraphproperties;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetRecord(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong precordid, jlong pprecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetRecord");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)precordid, (void*)(uintptr_t)pprecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)precordid;
    (void)pprecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetStatus(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pdwstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pdwstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)pdwstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphImportDatabase(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pwzfilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphImportDatabase");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pwzfilepath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)pwzfilepath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphListen(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jint dwscope, jint dwscopeid, jshort wport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphListen");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (uint32_t)dwscope, (uint32_t)dwscopeid, (uint16_t)wport);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)dwscope;
    (void)dwscopeid;
    (void)wport;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphOpen(JNIEnv* km_env, jclass km_clazz, jlong pwzgraphid, jlong pwzpeerid, jlong pwzdatabasename, jlong psecurityinterface, jint crecordtypesyncprecedence, jlong precordtypesyncprecedence, jlong phgraph) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphOpen");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzgraphid, (void*)(uintptr_t)pwzpeerid, (void*)(uintptr_t)pwzdatabasename, (void*)(uintptr_t)psecurityinterface, (uint32_t)crecordtypesyncprecedence, (void*)(uintptr_t)precordtypesyncprecedence, (void*)(uintptr_t)phgraph);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzgraphid;
    (void)pwzpeerid;
    (void)pwzdatabasename;
    (void)psecurityinterface;
    (void)crecordtypesyncprecedence;
    (void)precordtypesyncprecedence;
    (void)phgraph;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphOpenDirectConnection(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pwzpeerid, jlong paddress, jlong pullconnectionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphOpenDirectConnection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pwzpeerid, (void*)(uintptr_t)paddress, (void*)(uintptr_t)pullconnectionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)pwzpeerid;
    (void)paddress;
    (void)pullconnectionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphPeerTimeToUniversalTime(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pftpeertime, jlong pftuniversaltime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphPeerTimeToUniversalTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pftpeertime, (void*)(uintptr_t)pftuniversaltime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)pftpeertime;
    (void)pftuniversaltime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphRegisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong hevent, jint ceventregistrations, jlong peventregistrations, jlong phpeerevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphRegisterEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)hevent, (uint32_t)ceventregistrations, (void*)(uintptr_t)peventregistrations, (void*)(uintptr_t)phpeerevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)hevent;
    (void)ceventregistrations;
    (void)peventregistrations;
    (void)phpeerevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphSearchRecords(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pwzcriteria, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphSearchRecords");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pwzcriteria, (void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)pwzcriteria;
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphSendData(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong ullconnectionid, jlong ptype, jint cbdata, jlong pvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphSendData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (uint64_t)ullconnectionid, (void*)(uintptr_t)ptype, (uint32_t)cbdata, (void*)(uintptr_t)pvdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)ullconnectionid;
    (void)ptype;
    (void)cbdata;
    (void)pvdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetNodeAttributes(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pwzattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphSetNodeAttributes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pwzattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)pwzattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetPresence(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jint fpresent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphSetPresence");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (int32_t)fpresent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)fpresent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetProperties(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pgraphproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphSetProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pgraphproperties);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)pgraphproperties;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphShutdown(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphShutdown");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphStartup(JNIEnv* km_env, jclass km_clazz, jshort wversionrequested, jlong pversiondata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphStartup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)wversionrequested, (void*)(uintptr_t)pversiondata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wversionrequested;
    (void)pversiondata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphUniversalTimeToPeerTime(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pftuniversaltime, jlong pftpeertime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphUniversalTimeToPeerTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pftuniversaltime, (void*)(uintptr_t)pftpeertime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)pftuniversaltime;
    (void)pftpeertime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphUnregisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hpeerevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphUnregisterEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpeerevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpeerevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphUpdateRecord(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong precord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphUpdateRecord");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)precord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)precord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGraphValidateDeferredRecords(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jint crecordids, jlong precordids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphValidateDeferredRecords");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgraph, (uint32_t)crecordids, (void*)(uintptr_t)precordids);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgraph;
    (void)crecordids;
    (void)precordids;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupAddRecord(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong precord, jlong precordid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupAddRecord");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)precord, (void*)(uintptr_t)precordid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)precord;
    (void)precordid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupClose(JNIEnv* km_env, jclass km_clazz, jlong hgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupCloseDirectConnection(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong ullconnectionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupCloseDirectConnection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (uint64_t)ullconnectionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)ullconnectionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupConnect(JNIEnv* km_env, jclass km_clazz, jlong hgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupConnect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupConnectByAddress(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jint caddresses, jlong paddresses) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupConnectByAddress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (uint32_t)caddresses, (void*)(uintptr_t)paddresses);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)caddresses;
    (void)paddresses;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreate(JNIEnv* km_env, jclass km_clazz, jlong pproperties, jlong phgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupCreate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pproperties, (void*)(uintptr_t)phgroup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pproperties;
    (void)phgroup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreateInvitation(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pwzidentityinfo, jlong pftexpiration, jint croles, jlong proles, jlong ppwzinvitation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupCreateInvitation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pwzidentityinfo, (void*)(uintptr_t)pftexpiration, (uint32_t)croles, (void*)(uintptr_t)proles, (void*)(uintptr_t)ppwzinvitation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)pwzidentityinfo;
    (void)pftexpiration;
    (void)croles;
    (void)proles;
    (void)ppwzinvitation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreatePasswordInvitation(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong ppwzinvitation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupCreatePasswordInvitation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)ppwzinvitation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)ppwzinvitation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupDelete(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong pwzgrouppeername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupDelete");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)pwzgrouppeername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzidentity;
    (void)pwzgrouppeername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupDeleteRecord(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong precordid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupDeleteRecord");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)precordid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)precordid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumConnections(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jint dwflags, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupEnumConnections");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (uint32_t)dwflags, (void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)dwflags;
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumMembers(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jint dwflags, jlong pwzidentity, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupEnumMembers");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (uint32_t)dwflags, (void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)dwflags;
    (void)pwzidentity;
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumRecords(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong precordtype, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupEnumRecords");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)precordtype, (void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)precordtype;
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupExportConfig(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pwzpassword, jlong ppwzxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupExportConfig");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pwzpassword, (void*)(uintptr_t)ppwzxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)pwzpassword;
    (void)ppwzxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupExportDatabase(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pwzfilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupExportDatabase");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pwzfilepath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)pwzfilepath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetEventData(JNIEnv* km_env, jclass km_clazz, jlong hpeerevent, jlong ppeventdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupGetEventData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpeerevent, (void*)(uintptr_t)ppeventdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpeerevent;
    (void)ppeventdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetProperties(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong ppproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupGetProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)ppproperties);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)ppproperties;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetRecord(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong precordid, jlong pprecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupGetRecord");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)precordid, (void*)(uintptr_t)pprecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)precordid;
    (void)pprecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetStatus(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pdwstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupGetStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pdwstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)pdwstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupImportConfig(JNIEnv* km_env, jclass km_clazz, jlong pwzxml, jlong pwzpassword, jint foverwrite, jlong ppwzidentity, jlong ppwzgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupImportConfig");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzxml, (void*)(uintptr_t)pwzpassword, (int32_t)foverwrite, (void*)(uintptr_t)ppwzidentity, (void*)(uintptr_t)ppwzgroup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzxml;
    (void)pwzpassword;
    (void)foverwrite;
    (void)ppwzidentity;
    (void)ppwzgroup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupImportDatabase(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pwzfilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupImportDatabase");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pwzfilepath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)pwzfilepath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupIssueCredentials(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pwzsubjectidentity, jlong pcredentialinfo, jint dwflags, jlong ppwzinvitation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupIssueCredentials");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pwzsubjectidentity, (void*)(uintptr_t)pcredentialinfo, (uint32_t)dwflags, (void*)(uintptr_t)ppwzinvitation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)pwzsubjectidentity;
    (void)pcredentialinfo;
    (void)dwflags;
    (void)ppwzinvitation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupJoin(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong pwzinvitation, jlong pwzcloud, jlong phgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupJoin");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)pwzinvitation, (void*)(uintptr_t)pwzcloud, (void*)(uintptr_t)phgroup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzidentity;
    (void)pwzinvitation;
    (void)pwzcloud;
    (void)phgroup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupOpen(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong pwzgrouppeername, jlong pwzcloud, jlong phgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupOpen");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)pwzgrouppeername, (void*)(uintptr_t)pwzcloud, (void*)(uintptr_t)phgroup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzidentity;
    (void)pwzgrouppeername;
    (void)pwzcloud;
    (void)phgroup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupOpenDirectConnection(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pwzidentity, jlong paddress, jlong pullconnectionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupOpenDirectConnection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)paddress, (void*)(uintptr_t)pullconnectionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)pwzidentity;
    (void)paddress;
    (void)pullconnectionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupParseInvitation(JNIEnv* km_env, jclass km_clazz, jlong pwzinvitation, jlong ppinvitationinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupParseInvitation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzinvitation, (void*)(uintptr_t)ppinvitationinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzinvitation;
    (void)ppinvitationinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupPasswordJoin(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong pwzinvitation, jlong pwzpassword, jlong pwzcloud, jlong phgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupPasswordJoin");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)pwzinvitation, (void*)(uintptr_t)pwzpassword, (void*)(uintptr_t)pwzcloud, (void*)(uintptr_t)phgroup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzidentity;
    (void)pwzinvitation;
    (void)pwzpassword;
    (void)pwzcloud;
    (void)phgroup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupPeerTimeToUniversalTime(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pftpeertime, jlong pftuniversaltime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupPeerTimeToUniversalTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pftpeertime, (void*)(uintptr_t)pftuniversaltime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)pftpeertime;
    (void)pftuniversaltime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupRegisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hevent, jint ceventregistration, jlong peventregistrations, jlong phpeerevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupRegisterEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)hevent, (uint32_t)ceventregistration, (void*)(uintptr_t)peventregistrations, (void*)(uintptr_t)phpeerevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)hevent;
    (void)ceventregistration;
    (void)peventregistrations;
    (void)phpeerevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupResumePasswordAuthentication(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hpeereventhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupResumePasswordAuthentication");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)hpeereventhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)hpeereventhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupSearchRecords(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pwzcriteria, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupSearchRecords");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pwzcriteria, (void*)(uintptr_t)phpeerenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)pwzcriteria;
    (void)phpeerenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupSendData(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong ullconnectionid, jlong ptype, jint cbdata, jlong pvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupSendData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (uint64_t)ullconnectionid, (void*)(uintptr_t)ptype, (uint32_t)cbdata, (void*)(uintptr_t)pvdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)ullconnectionid;
    (void)ptype;
    (void)cbdata;
    (void)pvdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupSetProperties(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupSetProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pproperties);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)pproperties;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupShutdown(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupShutdown");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupStartup(JNIEnv* km_env, jclass km_clazz, jshort wversionrequested, jlong pversiondata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupStartup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)wversionrequested, (void*)(uintptr_t)pversiondata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wversionrequested;
    (void)pversiondata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupUniversalTimeToPeerTime(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pftuniversaltime, jlong pftpeertime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupUniversalTimeToPeerTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pftuniversaltime, (void*)(uintptr_t)pftpeertime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)pftuniversaltime;
    (void)pftpeertime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupUnregisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hpeerevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupUnregisterEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hpeerevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpeerevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerGroupUpdateRecord(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong precord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupUpdateRecord");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)precord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hgroup;
    (void)precord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerHostNameToPeerName(JNIEnv* km_env, jclass km_clazz, jlong pwzhostname, jlong ppwzpeername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerHostNameToPeerName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzhostname, (void*)(uintptr_t)ppwzpeername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzhostname;
    (void)ppwzpeername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerIdentityCreate(JNIEnv* km_env, jclass km_clazz, jlong pwzclassifier, jlong pwzfriendlyname, jlong hcryptprov, jlong ppwzidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityCreate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzclassifier, (void*)(uintptr_t)pwzfriendlyname, (uint64_t)hcryptprov, (void*)(uintptr_t)ppwzidentity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzclassifier;
    (void)pwzfriendlyname;
    (void)hcryptprov;
    (void)ppwzidentity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerIdentityDelete(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityDelete");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzidentity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzidentity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerIdentityExport(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong pwzpassword, jlong ppwzexportxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityExport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)pwzpassword, (void*)(uintptr_t)ppwzexportxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzidentity;
    (void)pwzpassword;
    (void)ppwzexportxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetCryptKey(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong phcryptprov) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityGetCryptKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)phcryptprov);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzidentity;
    (void)phcryptprov;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetDefault(JNIEnv* km_env, jclass km_clazz, jlong ppwzpeername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityGetDefault");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppwzpeername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppwzpeername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetFriendlyName(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong ppwzfriendlyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityGetFriendlyName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)ppwzfriendlyname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzidentity;
    (void)ppwzfriendlyname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetXML(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong ppwzidentityxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityGetXML");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)ppwzidentityxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzidentity;
    (void)ppwzidentityxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerIdentityImport(JNIEnv* km_env, jclass km_clazz, jlong pwzimportxml, jlong pwzpassword, jlong ppwzidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityImport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzimportxml, (void*)(uintptr_t)pwzpassword, (void*)(uintptr_t)ppwzidentity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzimportxml;
    (void)pwzpassword;
    (void)ppwzidentity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerIdentitySetFriendlyName(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong pwzfriendlyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentitySetFriendlyName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)pwzfriendlyname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzidentity;
    (void)pwzfriendlyname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerNameToPeerHostName(JNIEnv* km_env, jclass km_clazz, jlong pwzpeername, jlong ppwzhostname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerNameToPeerHostName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzpeername, (void*)(uintptr_t)ppwzhostname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzpeername;
    (void)ppwzhostname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerPnrpEndResolve(JNIEnv* km_env, jclass km_clazz, jlong hresolve) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpEndResolve");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hresolve);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hresolve;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetCloudInfo(JNIEnv* km_env, jclass km_clazz, jlong pcnumclouds, jlong ppcloudinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpGetCloudInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcnumclouds, (void*)(uintptr_t)ppcloudinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcnumclouds;
    (void)ppcloudinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetEndpoint(JNIEnv* km_env, jclass km_clazz, jlong hresolve, jlong ppendpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpGetEndpoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hresolve, (void*)(uintptr_t)ppendpoint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hresolve;
    (void)ppendpoint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerPnrpRegister(JNIEnv* km_env, jclass km_clazz, jlong pcwzpeername, jlong pregistrationinfo, jlong phregistration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpRegister");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcwzpeername, (void*)(uintptr_t)pregistrationinfo, (void*)(uintptr_t)phregistration);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcwzpeername;
    (void)pregistrationinfo;
    (void)phregistration;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerPnrpResolve(JNIEnv* km_env, jclass km_clazz, jlong pcwzpeername, jlong pcwzcloudname, jlong pcendpoints, jlong ppendpoints) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpResolve");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcwzpeername, (void*)(uintptr_t)pcwzcloudname, (void*)(uintptr_t)pcendpoints, (void*)(uintptr_t)ppendpoints);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcwzpeername;
    (void)pcwzcloudname;
    (void)pcendpoints;
    (void)ppendpoints;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerPnrpShutdown(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpShutdown");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartResolve(JNIEnv* km_env, jclass km_clazz, jlong pcwzpeername, jlong pcwzcloudname, jint cmaxendpoints, jlong hevent, jlong phresolve) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpStartResolve");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcwzpeername, (void*)(uintptr_t)pcwzcloudname, (uint32_t)cmaxendpoints, (void*)(uintptr_t)hevent, (void*)(uintptr_t)phresolve);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcwzpeername;
    (void)pcwzcloudname;
    (void)cmaxendpoints;
    (void)hevent;
    (void)phresolve;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartup(JNIEnv* km_env, jclass km_clazz, jshort wversionrequested) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpStartup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)wversionrequested);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wversionrequested;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerPnrpUnregister(JNIEnv* km_env, jclass km_clazz, jlong hregistration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpUnregister");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hregistration);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hregistration;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssysWindowsWin32NetworkmanagementP2pPeerPnrpUpdateRegistration(JNIEnv* km_env, jclass km_clazz, jlong hregistration, jlong pregistrationinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpUpdateRegistration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hregistration, (void*)(uintptr_t)pregistrationinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hregistration;
    (void)pregistrationinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

