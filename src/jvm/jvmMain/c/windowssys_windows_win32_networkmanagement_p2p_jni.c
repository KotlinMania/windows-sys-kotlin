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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtClose(JNIEnv* km_env, jclass km_clazz, jlong hdrt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtClose");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hdrt);
#else
    (void)hdrt;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtContinueSearch(JNIEnv* km_env, jclass km_clazz, jlong hsearchcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtContinueSearch");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsearchcontext) : -1;
#else
    (void)hsearchcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtCreateDerivedKey(JNIEnv* km_env, jclass km_clazz, jlong plocalcert, jlong pkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreateDerivedKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plocalcert, (void*)(uintptr_t)pkey) : -1;
#else
    (void)plocalcert;
    (void)pkey;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtCreateDerivedKeySecurityProvider(JNIEnv* km_env, jclass km_clazz, jlong prootcert, jlong plocalcert, jlong ppsecurityprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreateDerivedKeySecurityProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prootcert, (void*)(uintptr_t)plocalcert, (void*)(uintptr_t)ppsecurityprovider) : -1;
#else
    (void)prootcert;
    (void)plocalcert;
    (void)ppsecurityprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtCreateDnsBootstrapResolver(JNIEnv* km_env, jclass km_clazz, jshort port, jlong pwszaddress, jlong ppmodule) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreateDnsBootstrapResolver");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)port, (void*)(uintptr_t)pwszaddress, (void*)(uintptr_t)ppmodule) : -1;
#else
    (void)port;
    (void)pwszaddress;
    (void)ppmodule;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtCreateIpv6UdpTransport(JNIEnv* km_env, jclass km_clazz, jint scope, jint dwscopeid, jint dwlocalitythreshold, jlong pwport, jlong phtransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drttransport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreateIpv6UdpTransport");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)scope, (uint32_t)dwscopeid, (uint32_t)dwlocalitythreshold, (void*)(uintptr_t)pwport, (void*)(uintptr_t)phtransport) : -1;
#else
    (void)scope;
    (void)dwscopeid;
    (void)dwlocalitythreshold;
    (void)pwport;
    (void)phtransport;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtCreateNullSecurityProvider(JNIEnv* km_env, jclass km_clazz, jlong ppsecurityprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreateNullSecurityProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppsecurityprovider) : -1;
#else
    (void)ppsecurityprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtCreatePnrpBootstrapResolver(JNIEnv* km_env, jclass km_clazz, jint fpublish, jlong pwzpeername, jlong pwzcloudname, jlong pwzpublishingidentity, jlong ppresolver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtCreatePnrpBootstrapResolver");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fpublish, (void*)(uintptr_t)pwzpeername, (void*)(uintptr_t)pwzcloudname, (void*)(uintptr_t)pwzpublishingidentity, (void*)(uintptr_t)ppresolver) : -1;
#else
    (void)fpublish;
    (void)pwzpeername;
    (void)pwzcloudname;
    (void)pwzpublishingidentity;
    (void)ppresolver;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtDeleteDerivedKeySecurityProvider(JNIEnv* km_env, jclass km_clazz, jlong psecurityprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtDeleteDerivedKeySecurityProvider");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)psecurityprovider);
#else
    (void)psecurityprovider;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtDeleteDnsBootstrapResolver(JNIEnv* km_env, jclass km_clazz, jlong presolver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtDeleteDnsBootstrapResolver");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)presolver);
#else
    (void)presolver;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtDeleteIpv6UdpTransport(JNIEnv* km_env, jclass km_clazz, jlong htransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drttransport.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtDeleteIpv6UdpTransport");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htransport) : -1;
#else
    (void)htransport;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtDeleteNullSecurityProvider(JNIEnv* km_env, jclass km_clazz, jlong psecurityprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtDeleteNullSecurityProvider");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)psecurityprovider);
#else
    (void)psecurityprovider;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtDeletePnrpBootstrapResolver(JNIEnv* km_env, jclass km_clazz, jlong presolver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtDeletePnrpBootstrapResolver");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)presolver);
#else
    (void)presolver;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtEndSearch(JNIEnv* km_env, jclass km_clazz, jlong hsearchcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtEndSearch");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsearchcontext) : -1;
#else
    (void)hsearchcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtGetEventData(JNIEnv* km_env, jclass km_clazz, jlong hdrt, jint uleventdatalen, jlong peventdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetEventData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdrt, (uint32_t)uleventdatalen, (void*)(uintptr_t)peventdata) : -1;
#else
    (void)hdrt;
    (void)uleventdatalen;
    (void)peventdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtGetEventDataSize(JNIEnv* km_env, jclass km_clazz, jlong hdrt, jlong puleventdatalen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetEventDataSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdrt, (void*)(uintptr_t)puleventdatalen) : -1;
#else
    (void)hdrt;
    (void)puleventdatalen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtGetInstanceName(JNIEnv* km_env, jclass km_clazz, jlong hdrt, jint ulcbinstancenamesize, jlong pwzdrtinstancename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetInstanceName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdrt, (uint32_t)ulcbinstancenamesize, (void*)(uintptr_t)pwzdrtinstancename) : -1;
#else
    (void)hdrt;
    (void)ulcbinstancenamesize;
    (void)pwzdrtinstancename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtGetInstanceNameSize(JNIEnv* km_env, jclass km_clazz, jlong hdrt, jlong pulcbinstancenamesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetInstanceNameSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdrt, (void*)(uintptr_t)pulcbinstancenamesize) : -1;
#else
    (void)hdrt;
    (void)pulcbinstancenamesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtGetSearchPath(JNIEnv* km_env, jclass km_clazz, jlong hsearchcontext, jint ulsearchpathsize, jlong psearchpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetSearchPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsearchcontext, (uint32_t)ulsearchpathsize, (void*)(uintptr_t)psearchpath) : -1;
#else
    (void)hsearchcontext;
    (void)ulsearchpathsize;
    (void)psearchpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtGetSearchPathSize(JNIEnv* km_env, jclass km_clazz, jlong hsearchcontext, jlong pulsearchpathsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetSearchPathSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsearchcontext, (void*)(uintptr_t)pulsearchpathsize) : -1;
#else
    (void)hsearchcontext;
    (void)pulsearchpathsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtGetSearchResult(JNIEnv* km_env, jclass km_clazz, jlong hsearchcontext, jint ulsearchresultsize, jlong psearchresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetSearchResult");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsearchcontext, (uint32_t)ulsearchresultsize, (void*)(uintptr_t)psearchresult) : -1;
#else
    (void)hsearchcontext;
    (void)ulsearchresultsize;
    (void)psearchresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtGetSearchResultSize(JNIEnv* km_env, jclass km_clazz, jlong hsearchcontext, jlong pulsearchresultsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtGetSearchResultSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsearchcontext, (void*)(uintptr_t)pulsearchresultsize) : -1;
#else
    (void)hsearchcontext;
    (void)pulsearchresultsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtOpen(JNIEnv* km_env, jclass km_clazz, jlong psettings, jlong hevent, jlong pvcontext, jlong phdrt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtOpen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psettings, (void*)(uintptr_t)hevent, (void*)(uintptr_t)pvcontext, (void*)(uintptr_t)phdrt) : -1;
#else
    (void)psettings;
    (void)hevent;
    (void)pvcontext;
    (void)phdrt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtRegisterKey(JNIEnv* km_env, jclass km_clazz, jlong hdrt, jlong pregistration, jlong pvkeycontext, jlong phkeyregistration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtRegisterKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdrt, (void*)(uintptr_t)pregistration, (void*)(uintptr_t)pvkeycontext, (void*)(uintptr_t)phkeyregistration) : -1;
#else
    (void)hdrt;
    (void)pregistration;
    (void)pvkeycontext;
    (void)phkeyregistration;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtStartSearch(JNIEnv* km_env, jclass km_clazz, jlong hdrt, jlong pkey, jlong pinfo, jint timeout, jlong hevent, jlong pvcontext, jlong hsearchcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtStartSearch");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdrt, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pinfo, (uint32_t)timeout, (void*)(uintptr_t)hevent, (void*)(uintptr_t)pvcontext, (void*)(uintptr_t)hsearchcontext) : -1;
#else
    (void)hdrt;
    (void)pkey;
    (void)pinfo;
    (void)timeout;
    (void)hevent;
    (void)pvcontext;
    (void)hsearchcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtUnregisterKey(JNIEnv* km_env, jclass km_clazz, jlong hkeyregistration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtUnregisterKey");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hkeyregistration);
#else
    (void)hkeyregistration;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1DrtUpdateKey(JNIEnv* km_env, jclass km_clazz, jlong hkeyregistration, jlong pappdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrtUpdateKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyregistration, (void*)(uintptr_t)pappdata) : -1;
#else
    (void)hkeyregistration;
    (void)pappdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabAddContact(JNIEnv* km_env, jclass km_clazz, jlong pwzcontactdata, jlong ppcontact) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabAddContact");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzcontactdata, (void*)(uintptr_t)ppcontact) : -1;
#else
    (void)pwzcontactdata;
    (void)ppcontact;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabAsyncInviteContact(JNIEnv* km_env, jclass km_clazz, jlong pccontact, jlong pcendpoint, jlong pcinvitation, jlong hevent, jlong phinvitation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabAsyncInviteContact");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pccontact, (void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)pcinvitation, (void*)(uintptr_t)hevent, (void*)(uintptr_t)phinvitation) : -1;
#else
    (void)pccontact;
    (void)pcendpoint;
    (void)pcinvitation;
    (void)hevent;
    (void)phinvitation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabAsyncInviteEndpoint(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint, jlong pcinvitation, jlong hevent, jlong phinvitation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabAsyncInviteEndpoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)pcinvitation, (void*)(uintptr_t)hevent, (void*)(uintptr_t)phinvitation) : -1;
#else
    (void)pcendpoint;
    (void)pcinvitation;
    (void)hevent;
    (void)phinvitation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabCancelInvitation(JNIEnv* km_env, jclass km_clazz, jlong hinvitation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabCancelInvitation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinvitation) : -1;
#else
    (void)hinvitation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong hinvitation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabCloseHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinvitation) : -1;
#else
    (void)hinvitation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabDeleteContact(JNIEnv* km_env, jclass km_clazz, jlong pwzpeername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabDeleteContact");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzpeername) : -1;
#else
    (void)pwzpeername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabDeleteEndpointData(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabDeleteEndpointData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcendpoint) : -1;
#else
    (void)pcendpoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabDeleteObject(JNIEnv* km_env, jclass km_clazz, jlong pobjectid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabDeleteObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pobjectid) : -1;
#else
    (void)pobjectid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabEnumApplicationRegistrationInfo(JNIEnv* km_env, jclass km_clazz, jint registrationtype, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumApplicationRegistrationInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)registrationtype, (void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)registrationtype;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabEnumApplications(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint, jlong papplicationid, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumApplications");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)papplicationid, (void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)pcendpoint;
    (void)papplicationid;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabEnumContacts(JNIEnv* km_env, jclass km_clazz, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumContacts");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabEnumEndpoints(JNIEnv* km_env, jclass km_clazz, jlong pccontact, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumEndpoints");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pccontact, (void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)pccontact;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabEnumObjects(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint, jlong pobjectid, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumObjects");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)pobjectid, (void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)pcendpoint;
    (void)pobjectid;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabEnumPeopleNearMe(JNIEnv* km_env, jclass km_clazz, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabEnumPeopleNearMe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabExportContact(JNIEnv* km_env, jclass km_clazz, jlong pwzpeername, jlong ppwzcontactdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabExportContact");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzpeername, (void*)(uintptr_t)ppwzcontactdata) : -1;
#else
    (void)pwzpeername;
    (void)ppwzcontactdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabGetAppLaunchInfo(JNIEnv* km_env, jclass km_clazz, jlong pplaunchinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetAppLaunchInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pplaunchinfo) : -1;
#else
    (void)pplaunchinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabGetApplicationRegistrationInfo(JNIEnv* km_env, jclass km_clazz, jlong papplicationid, jint registrationtype, jlong ppapplication) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetApplicationRegistrationInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)papplicationid, (int32_t)registrationtype, (void*)(uintptr_t)ppapplication) : -1;
#else
    (void)papplicationid;
    (void)registrationtype;
    (void)ppapplication;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabGetContact(JNIEnv* km_env, jclass km_clazz, jlong pwzpeername, jlong ppcontact) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetContact");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzpeername, (void*)(uintptr_t)ppcontact) : -1;
#else
    (void)pwzpeername;
    (void)ppcontact;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabGetEndpointName(JNIEnv* km_env, jclass km_clazz, jlong ppwzendpointname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetEndpointName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppwzendpointname) : -1;
#else
    (void)ppwzendpointname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabGetEventData(JNIEnv* km_env, jclass km_clazz, jlong hpeerevent, jlong ppeventdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetEventData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpeerevent, (void*)(uintptr_t)ppeventdata) : -1;
#else
    (void)hpeerevent;
    (void)ppeventdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabGetInvitationResponse(JNIEnv* km_env, jclass km_clazz, jlong hinvitation, jlong ppinvitationresponse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetInvitationResponse");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinvitation, (void*)(uintptr_t)ppinvitationresponse) : -1;
#else
    (void)hinvitation;
    (void)ppinvitationresponse;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabGetPresenceInfo(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint, jlong pppresenceinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetPresenceInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)pppresenceinfo) : -1;
#else
    (void)pcendpoint;
    (void)pppresenceinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabGetSigninOptions(JNIEnv* km_env, jclass km_clazz, jlong pdwsigninoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabGetSigninOptions");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdwsigninoptions) : -1;
#else
    (void)pdwsigninoptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabInviteContact(JNIEnv* km_env, jclass km_clazz, jlong pccontact, jlong pcendpoint, jlong pcinvitation, jlong ppresponse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabInviteContact");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pccontact, (void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)pcinvitation, (void*)(uintptr_t)ppresponse) : -1;
#else
    (void)pccontact;
    (void)pcendpoint;
    (void)pcinvitation;
    (void)ppresponse;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabInviteEndpoint(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint, jlong pcinvitation, jlong ppresponse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabInviteEndpoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)pcinvitation, (void*)(uintptr_t)ppresponse) : -1;
#else
    (void)pcendpoint;
    (void)pcinvitation;
    (void)ppresponse;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabParseContact(JNIEnv* km_env, jclass km_clazz, jlong pwzcontactdata, jlong ppcontact) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabParseContact");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzcontactdata, (void*)(uintptr_t)ppcontact) : -1;
#else
    (void)pwzcontactdata;
    (void)ppcontact;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabQueryContactData(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint, jlong ppwzcontactdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabQueryContactData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcendpoint, (void*)(uintptr_t)ppwzcontactdata) : -1;
#else
    (void)pcendpoint;
    (void)ppwzcontactdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabRefreshEndpointData(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabRefreshEndpointData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcendpoint) : -1;
#else
    (void)pcendpoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabRegisterApplication(JNIEnv* km_env, jclass km_clazz, jlong pcapplication, jint registrationtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabRegisterApplication");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcapplication, (int32_t)registrationtype) : -1;
#else
    (void)pcapplication;
    (void)registrationtype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabRegisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hevent, jint ceventregistration, jlong peventregistrations, jlong phpeerevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabRegisterEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hevent, (uint32_t)ceventregistration, (void*)(uintptr_t)peventregistrations, (void*)(uintptr_t)phpeerevent) : -1;
#else
    (void)hevent;
    (void)ceventregistration;
    (void)peventregistrations;
    (void)phpeerevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabSetEndpointName(JNIEnv* km_env, jclass km_clazz, jlong pwzendpointname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSetEndpointName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzendpointname) : -1;
#else
    (void)pwzendpointname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabSetObject(JNIEnv* km_env, jclass km_clazz, jlong pcobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSetObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcobject) : -1;
#else
    (void)pcobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabSetPresenceInfo(JNIEnv* km_env, jclass km_clazz, jlong pcpresenceinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSetPresenceInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcpresenceinfo) : -1;
#else
    (void)pcpresenceinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabShutdown(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabShutdown");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabSignin(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jint dwsigninoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSignin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (uint32_t)dwsigninoptions) : -1;
#else
    (void)hwndparent;
    (void)dwsigninoptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabSignout(JNIEnv* km_env, jclass km_clazz, jint dwsigninoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSignout");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwsigninoptions) : -1;
#else
    (void)dwsigninoptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabStartup(JNIEnv* km_env, jclass km_clazz, jshort wversionrequested) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabStartup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)wversionrequested) : -1;
#else
    (void)wversionrequested;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabSubscribeEndpointData(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabSubscribeEndpointData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcendpoint) : -1;
#else
    (void)pcendpoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabUnregisterApplication(JNIEnv* km_env, jclass km_clazz, jlong papplicationid, jint registrationtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabUnregisterApplication");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)papplicationid, (int32_t)registrationtype) : -1;
#else
    (void)papplicationid;
    (void)registrationtype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabUnregisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hpeerevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabUnregisterEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpeerevent) : -1;
#else
    (void)hpeerevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabUnsubscribeEndpointData(JNIEnv* km_env, jclass km_clazz, jlong pcendpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabUnsubscribeEndpointData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcendpoint) : -1;
#else
    (void)pcendpoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCollabUpdateContact(JNIEnv* km_env, jclass km_clazz, jlong pcontact) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCollabUpdateContact");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcontact) : -1;
#else
    (void)pcontact;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerCreatePeerName(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong pwzclassifier, jlong ppwzpeername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerCreatePeerName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)pwzclassifier, (void*)(uintptr_t)ppwzpeername) : -1;
#else
    (void)pwzidentity;
    (void)pwzclassifier;
    (void)ppwzpeername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistClientAddContentInformation(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle, jint cbnumberofbytes, jlong pbuffer, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientAddContentInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle, (uint32_t)cbnumberofbytes, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistClientAddData(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle, jint cbnumberofbytes, jlong pbuffer, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientAddData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle, (uint32_t)cbnumberofbytes, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistClientBlockRead(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle, jint cbmaxnumberofbytes, jlong pbuffer, jint dwtimeoutinmilliseconds, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientBlockRead");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle, (uint32_t)cbmaxnumberofbytes, (void*)(uintptr_t)pbuffer, (uint32_t)dwtimeoutinmilliseconds, (void*)(uintptr_t)lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbmaxnumberofbytes;
    (void)pbuffer;
    (void)dwtimeoutinmilliseconds;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistClientCancelAsyncOperation(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientCancelAsyncOperation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle, (void*)(uintptr_t)poverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)poverlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistClientCloseContent(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientCloseContent");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistClientCompleteContentInformation(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientCompleteContentInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle, (void*)(uintptr_t)lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistClientFlushContent(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong pcontenttag, jlong hcompletionport, jlong ulcompletionkey, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientFlushContent");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (void*)(uintptr_t)pcontenttag, (void*)(uintptr_t)hcompletionport, (uint64_t)ulcompletionkey, (void*)(uintptr_t)lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)pcontenttag;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistClientGetInformationByHandle(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle, jint peerdistclientinfoclass, jint dwbuffersize, jlong lpinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientGetInformationByHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle, (int32_t)peerdistclientinfoclass, (uint32_t)dwbuffersize, (void*)(uintptr_t)lpinformation) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)peerdistclientinfoclass;
    (void)dwbuffersize;
    (void)lpinformation;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistClientOpenContent(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong pcontenttag, jlong hcompletionport, jlong ulcompletionkey, jlong phcontenthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientOpenContent");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (void*)(uintptr_t)pcontenttag, (void*)(uintptr_t)hcompletionport, (uint64_t)ulcompletionkey, (void*)(uintptr_t)phcontenthandle) : 0;
#else
    (void)hpeerdist;
    (void)pcontenttag;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)phcontenthandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistClientStreamRead(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontenthandle, jint cbmaxnumberofbytes, jlong pbuffer, jint dwtimeoutinmilliseconds, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistClientStreamRead");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontenthandle, (uint32_t)cbmaxnumberofbytes, (void*)(uintptr_t)pbuffer, (uint32_t)dwtimeoutinmilliseconds, (void*)(uintptr_t)lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbmaxnumberofbytes;
    (void)pbuffer;
    (void)dwtimeoutinmilliseconds;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistGetOverlappedResult(JNIEnv* km_env, jclass km_clazz, jlong lpoverlapped, jlong lpnumberofbytestransferred, jint bwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistGetOverlappedResult");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpnumberofbytestransferred, (int32_t)bwait) : -1;
#else
    (void)lpoverlapped;
    (void)lpnumberofbytestransferred;
    (void)bwait;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistGetStatus(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong ppeerdiststatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistGetStatus");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (void*)(uintptr_t)ppeerdiststatus) : 0;
#else
    (void)hpeerdist;
    (void)ppeerdiststatus;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistGetStatusEx(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong ppeerdiststatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistGetStatusEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (void*)(uintptr_t)ppeerdiststatus) : 0;
#else
    (void)hpeerdist;
    (void)ppeerdiststatus;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistRegisterForStatusChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcompletionport, jlong ulcompletionkey, jlong lpoverlapped, jlong ppeerdiststatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistRegisterForStatusChangeNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (void*)(uintptr_t)hcompletionport, (uint64_t)ulcompletionkey, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)ppeerdiststatus) : 0;
#else
    (void)hpeerdist;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)lpoverlapped;
    (void)ppeerdiststatus;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistRegisterForStatusChangeNotificationEx(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcompletionport, jlong ulcompletionkey, jlong lpoverlapped, jlong ppeerdiststatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistRegisterForStatusChangeNotificationEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (void*)(uintptr_t)hcompletionport, (uint64_t)ulcompletionkey, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)ppeerdiststatus) : 0;
#else
    (void)hpeerdist;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)lpoverlapped;
    (void)ppeerdiststatus;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistServerCancelAsyncOperation(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jint cbcontentidentifier, jlong pcontentidentifier, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerCancelAsyncOperation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (uint32_t)cbcontentidentifier, (void*)(uintptr_t)pcontentidentifier, (void*)(uintptr_t)poverlapped) : 0;
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    (void)poverlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistServerCloseContentInformation(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontentinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerCloseContentInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontentinfo) : 0;
#else
    (void)hpeerdist;
    (void)hcontentinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistServerCloseStreamHandle(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hstream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerCloseStreamHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (int64_t)hstream) : 0;
#else
    (void)hpeerdist;
    (void)hstream;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistServerOpenContentInformation(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jint cbcontentidentifier, jlong pcontentidentifier, jlong ullcontentoffset, jlong cbcontentlength, jlong hcompletionport, jlong ulcompletionkey, jlong phcontentinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint64_t, uint64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerOpenContentInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (uint32_t)cbcontentidentifier, (void*)(uintptr_t)pcontentidentifier, (uint64_t)ullcontentoffset, (uint64_t)cbcontentlength, (void*)(uintptr_t)hcompletionport, (uint64_t)ulcompletionkey, (void*)(uintptr_t)phcontentinfo) : 0;
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    (void)ullcontentoffset;
    (void)cbcontentlength;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)phcontentinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistServerOpenContentInformationEx(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jint cbcontentidentifier, jlong pcontentidentifier, jlong ullcontentoffset, jlong cbcontentlength, jlong pretrievaloptions, jlong hcompletionport, jlong ulcompletionkey, jlong phcontentinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint64_t, uint64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerOpenContentInformationEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (uint32_t)cbcontentidentifier, (void*)(uintptr_t)pcontentidentifier, (uint64_t)ullcontentoffset, (uint64_t)cbcontentlength, (void*)(uintptr_t)pretrievaloptions, (void*)(uintptr_t)hcompletionport, (uint64_t)ulcompletionkey, (void*)(uintptr_t)phcontentinfo) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistServerPublishAddToStream(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hstream, jint cbnumberofbytes, jlong pbuffer, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerPublishAddToStream");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (int64_t)hstream, (uint32_t)cbnumberofbytes, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hstream;
    (void)cbnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistServerPublishCompleteStream(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hstream, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerPublishCompleteStream");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (int64_t)hstream, (void*)(uintptr_t)lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hstream;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistServerPublishStream(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jint cbcontentidentifier, jlong pcontentidentifier, jlong cbcontentlength, jlong ppublishoptions, jlong hcompletionport, jlong ulcompletionkey, jlong phstream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerPublishStream");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (uint32_t)cbcontentidentifier, (void*)(uintptr_t)pcontentidentifier, (uint64_t)cbcontentlength, (void*)(uintptr_t)ppublishoptions, (void*)(uintptr_t)hcompletionport, (uint64_t)ulcompletionkey, (void*)(uintptr_t)phstream) : 0;
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    (void)cbcontentlength;
    (void)ppublishoptions;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)phstream;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistServerRetrieveContentInformation(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jlong hcontentinfo, jint cbmaxnumberofbytes, jlong pbuffer, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerRetrieveContentInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (int64_t)hcontentinfo, (uint32_t)cbmaxnumberofbytes, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hcontentinfo;
    (void)cbmaxnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistServerUnpublish(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist, jint cbcontentidentifier, jlong pcontentidentifier) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistServerUnpublish");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist, (uint32_t)cbcontentidentifier, (void*)(uintptr_t)pcontentidentifier) : 0;
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistShutdown(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistShutdown");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist) : 0;
#else
    (void)hpeerdist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistStartup(JNIEnv* km_env, jclass km_clazz, jint dwversionrequested, jlong phpeerdist, jlong pdwsupportedversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistStartup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwversionrequested, (void*)(uintptr_t)phpeerdist, (void*)(uintptr_t)pdwsupportedversion) : 0;
#else
    (void)dwversionrequested;
    (void)phpeerdist;
    (void)pdwsupportedversion;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerDistUnregisterForStatusChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong hpeerdist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerDistUnregisterForStatusChangeNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hpeerdist) : 0;
#else
    (void)hpeerdist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerEndEnumeration(JNIEnv* km_env, jclass km_clazz, jlong hpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerEndEnumeration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpeerenum) : -1;
#else
    (void)hpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerEnumGroups(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerEnumGroups");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)pwzidentity;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerEnumIdentities(JNIEnv* km_env, jclass km_clazz, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerEnumIdentities");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerFreeData(JNIEnv* km_env, jclass km_clazz, jlong pvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerFreeData");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pvdata);
#else
    (void)pvdata;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGetItemCount(JNIEnv* km_env, jclass km_clazz, jlong hpeerenum, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGetItemCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpeerenum, (void*)(uintptr_t)pcount) : -1;
#else
    (void)hpeerenum;
    (void)pcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGetNextItem(JNIEnv* km_env, jclass km_clazz, jlong hpeerenum, jlong pcount, jlong pppvitems) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGetNextItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpeerenum, (void*)(uintptr_t)pcount, (void*)(uintptr_t)pppvitems) : -1;
#else
    (void)hpeerenum;
    (void)pcount;
    (void)pppvitems;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphAddRecord(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong precord, jlong precordid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphAddRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)precord, (void*)(uintptr_t)precordid) : -1;
#else
    (void)hgraph;
    (void)precord;
    (void)precordid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphClose(JNIEnv* km_env, jclass km_clazz, jlong hgraph) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph) : -1;
#else
    (void)hgraph;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphCloseDirectConnection(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong ullconnectionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphCloseDirectConnection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (uint64_t)ullconnectionid) : -1;
#else
    (void)hgraph;
    (void)ullconnectionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphConnect(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pwzpeerid, jlong paddress, jlong pullconnectionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphConnect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pwzpeerid, (void*)(uintptr_t)paddress, (void*)(uintptr_t)pullconnectionid) : -1;
#else
    (void)hgraph;
    (void)pwzpeerid;
    (void)paddress;
    (void)pullconnectionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphCreate(JNIEnv* km_env, jclass km_clazz, jlong pgraphproperties, jlong pwzdatabasename, jlong psecurityinterface, jlong phgraph) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pgraphproperties, (void*)(uintptr_t)pwzdatabasename, (void*)(uintptr_t)psecurityinterface, (void*)(uintptr_t)phgraph) : -1;
#else
    (void)pgraphproperties;
    (void)pwzdatabasename;
    (void)psecurityinterface;
    (void)phgraph;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphDelete(JNIEnv* km_env, jclass km_clazz, jlong pwzgraphid, jlong pwzpeerid, jlong pwzdatabasename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphDelete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzgraphid, (void*)(uintptr_t)pwzpeerid, (void*)(uintptr_t)pwzdatabasename) : -1;
#else
    (void)pwzgraphid;
    (void)pwzpeerid;
    (void)pwzdatabasename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphDeleteRecord(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong precordid, jint flocal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphDeleteRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)precordid, (int32_t)flocal) : -1;
#else
    (void)hgraph;
    (void)precordid;
    (void)flocal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphEndEnumeration(JNIEnv* km_env, jclass km_clazz, jlong hpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphEndEnumeration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpeerenum) : -1;
#else
    (void)hpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphEnumConnections(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jint dwflags, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphEnumConnections");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (uint32_t)dwflags, (void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)hgraph;
    (void)dwflags;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphEnumNodes(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pwzpeerid, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphEnumNodes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pwzpeerid, (void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)hgraph;
    (void)pwzpeerid;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphEnumRecords(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong precordtype, jlong pwzpeerid, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphEnumRecords");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)precordtype, (void*)(uintptr_t)pwzpeerid, (void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)hgraph;
    (void)precordtype;
    (void)pwzpeerid;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphExportDatabase(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pwzfilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphExportDatabase");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pwzfilepath) : -1;
#else
    (void)hgraph;
    (void)pwzfilepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphFreeData(JNIEnv* km_env, jclass km_clazz, jlong pvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphFreeData");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pvdata);
#else
    (void)pvdata;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphGetEventData(JNIEnv* km_env, jclass km_clazz, jlong hpeerevent, jlong ppeventdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetEventData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpeerevent, (void*)(uintptr_t)ppeventdata) : -1;
#else
    (void)hpeerevent;
    (void)ppeventdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphGetItemCount(JNIEnv* km_env, jclass km_clazz, jlong hpeerenum, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetItemCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpeerenum, (void*)(uintptr_t)pcount) : -1;
#else
    (void)hpeerenum;
    (void)pcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphGetNextItem(JNIEnv* km_env, jclass km_clazz, jlong hpeerenum, jlong pcount, jlong pppvitems) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetNextItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpeerenum, (void*)(uintptr_t)pcount, (void*)(uintptr_t)pppvitems) : -1;
#else
    (void)hpeerenum;
    (void)pcount;
    (void)pppvitems;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphGetNodeInfo(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong ullnodeid, jlong ppnodeinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetNodeInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (uint64_t)ullnodeid, (void*)(uintptr_t)ppnodeinfo) : -1;
#else
    (void)hgraph;
    (void)ullnodeid;
    (void)ppnodeinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphGetProperties(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong ppgraphproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)ppgraphproperties) : -1;
#else
    (void)hgraph;
    (void)ppgraphproperties;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphGetRecord(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong precordid, jlong pprecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)precordid, (void*)(uintptr_t)pprecord) : -1;
#else
    (void)hgraph;
    (void)precordid;
    (void)pprecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphGetStatus(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pdwstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphGetStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pdwstatus) : -1;
#else
    (void)hgraph;
    (void)pdwstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphImportDatabase(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pwzfilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphImportDatabase");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pwzfilepath) : -1;
#else
    (void)hgraph;
    (void)pwzfilepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphListen(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jint dwscope, jint dwscopeid, jshort wport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphListen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (uint32_t)dwscope, (uint32_t)dwscopeid, (uint16_t)wport) : -1;
#else
    (void)hgraph;
    (void)dwscope;
    (void)dwscopeid;
    (void)wport;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphOpen(JNIEnv* km_env, jclass km_clazz, jlong pwzgraphid, jlong pwzpeerid, jlong pwzdatabasename, jlong psecurityinterface, jint crecordtypesyncprecedence, jlong precordtypesyncprecedence, jlong phgraph) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphOpen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzgraphid, (void*)(uintptr_t)pwzpeerid, (void*)(uintptr_t)pwzdatabasename, (void*)(uintptr_t)psecurityinterface, (uint32_t)crecordtypesyncprecedence, (void*)(uintptr_t)precordtypesyncprecedence, (void*)(uintptr_t)phgraph) : -1;
#else
    (void)pwzgraphid;
    (void)pwzpeerid;
    (void)pwzdatabasename;
    (void)psecurityinterface;
    (void)crecordtypesyncprecedence;
    (void)precordtypesyncprecedence;
    (void)phgraph;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphOpenDirectConnection(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pwzpeerid, jlong paddress, jlong pullconnectionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphOpenDirectConnection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pwzpeerid, (void*)(uintptr_t)paddress, (void*)(uintptr_t)pullconnectionid) : -1;
#else
    (void)hgraph;
    (void)pwzpeerid;
    (void)paddress;
    (void)pullconnectionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphPeerTimeToUniversalTime(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pftpeertime, jlong pftuniversaltime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphPeerTimeToUniversalTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pftpeertime, (void*)(uintptr_t)pftuniversaltime) : -1;
#else
    (void)hgraph;
    (void)pftpeertime;
    (void)pftuniversaltime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphRegisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong hevent, jint ceventregistrations, jlong peventregistrations, jlong phpeerevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphRegisterEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)hevent, (uint32_t)ceventregistrations, (void*)(uintptr_t)peventregistrations, (void*)(uintptr_t)phpeerevent) : -1;
#else
    (void)hgraph;
    (void)hevent;
    (void)ceventregistrations;
    (void)peventregistrations;
    (void)phpeerevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphSearchRecords(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pwzcriteria, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphSearchRecords");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pwzcriteria, (void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)hgraph;
    (void)pwzcriteria;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphSendData(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong ullconnectionid, jlong ptype, jint cbdata, jlong pvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphSendData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (uint64_t)ullconnectionid, (void*)(uintptr_t)ptype, (uint32_t)cbdata, (void*)(uintptr_t)pvdata) : -1;
#else
    (void)hgraph;
    (void)ullconnectionid;
    (void)ptype;
    (void)cbdata;
    (void)pvdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphSetNodeAttributes(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pwzattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphSetNodeAttributes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pwzattributes) : -1;
#else
    (void)hgraph;
    (void)pwzattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphSetPresence(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jint fpresent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphSetPresence");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (int32_t)fpresent) : -1;
#else
    (void)hgraph;
    (void)fpresent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphSetProperties(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pgraphproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphSetProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pgraphproperties) : -1;
#else
    (void)hgraph;
    (void)pgraphproperties;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphShutdown(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphShutdown");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphStartup(JNIEnv* km_env, jclass km_clazz, jshort wversionrequested, jlong pversiondata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphStartup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)wversionrequested, (void*)(uintptr_t)pversiondata) : -1;
#else
    (void)wversionrequested;
    (void)pversiondata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphUniversalTimeToPeerTime(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong pftuniversaltime, jlong pftpeertime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphUniversalTimeToPeerTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)pftuniversaltime, (void*)(uintptr_t)pftpeertime) : -1;
#else
    (void)hgraph;
    (void)pftuniversaltime;
    (void)pftpeertime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphUnregisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hpeerevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphUnregisterEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpeerevent) : -1;
#else
    (void)hpeerevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphUpdateRecord(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jlong precord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphUpdateRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (void*)(uintptr_t)precord) : -1;
#else
    (void)hgraph;
    (void)precord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGraphValidateDeferredRecords(JNIEnv* km_env, jclass km_clazz, jlong hgraph, jint crecordids, jlong precordids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGraphValidateDeferredRecords");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgraph, (uint32_t)crecordids, (void*)(uintptr_t)precordids) : -1;
#else
    (void)hgraph;
    (void)crecordids;
    (void)precordids;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupAddRecord(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong precord, jlong precordid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupAddRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)precord, (void*)(uintptr_t)precordid) : -1;
#else
    (void)hgroup;
    (void)precord;
    (void)precordid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupClose(JNIEnv* km_env, jclass km_clazz, jlong hgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup) : -1;
#else
    (void)hgroup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupCloseDirectConnection(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong ullconnectionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupCloseDirectConnection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (uint64_t)ullconnectionid) : -1;
#else
    (void)hgroup;
    (void)ullconnectionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupConnect(JNIEnv* km_env, jclass km_clazz, jlong hgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupConnect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup) : -1;
#else
    (void)hgroup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupConnectByAddress(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jint caddresses, jlong paddresses) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupConnectByAddress");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (uint32_t)caddresses, (void*)(uintptr_t)paddresses) : -1;
#else
    (void)hgroup;
    (void)caddresses;
    (void)paddresses;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupCreate(JNIEnv* km_env, jclass km_clazz, jlong pproperties, jlong phgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pproperties, (void*)(uintptr_t)phgroup) : -1;
#else
    (void)pproperties;
    (void)phgroup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupCreateInvitation(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pwzidentityinfo, jlong pftexpiration, jint croles, jlong proles, jlong ppwzinvitation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupCreateInvitation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pwzidentityinfo, (void*)(uintptr_t)pftexpiration, (uint32_t)croles, (void*)(uintptr_t)proles, (void*)(uintptr_t)ppwzinvitation) : -1;
#else
    (void)hgroup;
    (void)pwzidentityinfo;
    (void)pftexpiration;
    (void)croles;
    (void)proles;
    (void)ppwzinvitation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupCreatePasswordInvitation(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong ppwzinvitation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupCreatePasswordInvitation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)ppwzinvitation) : -1;
#else
    (void)hgroup;
    (void)ppwzinvitation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupDelete(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong pwzgrouppeername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupDelete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)pwzgrouppeername) : -1;
#else
    (void)pwzidentity;
    (void)pwzgrouppeername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupDeleteRecord(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong precordid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupDeleteRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)precordid) : -1;
#else
    (void)hgroup;
    (void)precordid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupEnumConnections(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jint dwflags, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupEnumConnections");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (uint32_t)dwflags, (void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)hgroup;
    (void)dwflags;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupEnumMembers(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jint dwflags, jlong pwzidentity, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupEnumMembers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (uint32_t)dwflags, (void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)hgroup;
    (void)dwflags;
    (void)pwzidentity;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupEnumRecords(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong precordtype, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupEnumRecords");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)precordtype, (void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)hgroup;
    (void)precordtype;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupExportConfig(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pwzpassword, jlong ppwzxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupExportConfig");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pwzpassword, (void*)(uintptr_t)ppwzxml) : -1;
#else
    (void)hgroup;
    (void)pwzpassword;
    (void)ppwzxml;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupExportDatabase(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pwzfilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupExportDatabase");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pwzfilepath) : -1;
#else
    (void)hgroup;
    (void)pwzfilepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupGetEventData(JNIEnv* km_env, jclass km_clazz, jlong hpeerevent, jlong ppeventdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupGetEventData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpeerevent, (void*)(uintptr_t)ppeventdata) : -1;
#else
    (void)hpeerevent;
    (void)ppeventdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupGetProperties(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong ppproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupGetProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)ppproperties) : -1;
#else
    (void)hgroup;
    (void)ppproperties;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupGetRecord(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong precordid, jlong pprecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupGetRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)precordid, (void*)(uintptr_t)pprecord) : -1;
#else
    (void)hgroup;
    (void)precordid;
    (void)pprecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupGetStatus(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pdwstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupGetStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pdwstatus) : -1;
#else
    (void)hgroup;
    (void)pdwstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupImportConfig(JNIEnv* km_env, jclass km_clazz, jlong pwzxml, jlong pwzpassword, jint foverwrite, jlong ppwzidentity, jlong ppwzgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupImportConfig");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzxml, (void*)(uintptr_t)pwzpassword, (int32_t)foverwrite, (void*)(uintptr_t)ppwzidentity, (void*)(uintptr_t)ppwzgroup) : -1;
#else
    (void)pwzxml;
    (void)pwzpassword;
    (void)foverwrite;
    (void)ppwzidentity;
    (void)ppwzgroup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupImportDatabase(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pwzfilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupImportDatabase");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pwzfilepath) : -1;
#else
    (void)hgroup;
    (void)pwzfilepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupIssueCredentials(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pwzsubjectidentity, jlong pcredentialinfo, jint dwflags, jlong ppwzinvitation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupIssueCredentials");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pwzsubjectidentity, (void*)(uintptr_t)pcredentialinfo, (uint32_t)dwflags, (void*)(uintptr_t)ppwzinvitation) : -1;
#else
    (void)hgroup;
    (void)pwzsubjectidentity;
    (void)pcredentialinfo;
    (void)dwflags;
    (void)ppwzinvitation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupJoin(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong pwzinvitation, jlong pwzcloud, jlong phgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupJoin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)pwzinvitation, (void*)(uintptr_t)pwzcloud, (void*)(uintptr_t)phgroup) : -1;
#else
    (void)pwzidentity;
    (void)pwzinvitation;
    (void)pwzcloud;
    (void)phgroup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupOpen(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong pwzgrouppeername, jlong pwzcloud, jlong phgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupOpen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)pwzgrouppeername, (void*)(uintptr_t)pwzcloud, (void*)(uintptr_t)phgroup) : -1;
#else
    (void)pwzidentity;
    (void)pwzgrouppeername;
    (void)pwzcloud;
    (void)phgroup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupOpenDirectConnection(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pwzidentity, jlong paddress, jlong pullconnectionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupOpenDirectConnection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)paddress, (void*)(uintptr_t)pullconnectionid) : -1;
#else
    (void)hgroup;
    (void)pwzidentity;
    (void)paddress;
    (void)pullconnectionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupParseInvitation(JNIEnv* km_env, jclass km_clazz, jlong pwzinvitation, jlong ppinvitationinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupParseInvitation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzinvitation, (void*)(uintptr_t)ppinvitationinfo) : -1;
#else
    (void)pwzinvitation;
    (void)ppinvitationinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupPasswordJoin(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong pwzinvitation, jlong pwzpassword, jlong pwzcloud, jlong phgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupPasswordJoin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)pwzinvitation, (void*)(uintptr_t)pwzpassword, (void*)(uintptr_t)pwzcloud, (void*)(uintptr_t)phgroup) : -1;
#else
    (void)pwzidentity;
    (void)pwzinvitation;
    (void)pwzpassword;
    (void)pwzcloud;
    (void)phgroup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupPeerTimeToUniversalTime(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pftpeertime, jlong pftuniversaltime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupPeerTimeToUniversalTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pftpeertime, (void*)(uintptr_t)pftuniversaltime) : -1;
#else
    (void)hgroup;
    (void)pftpeertime;
    (void)pftuniversaltime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupRegisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hevent, jint ceventregistration, jlong peventregistrations, jlong phpeerevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupRegisterEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)hevent, (uint32_t)ceventregistration, (void*)(uintptr_t)peventregistrations, (void*)(uintptr_t)phpeerevent) : -1;
#else
    (void)hgroup;
    (void)hevent;
    (void)ceventregistration;
    (void)peventregistrations;
    (void)phpeerevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupResumePasswordAuthentication(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hpeereventhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupResumePasswordAuthentication");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)hpeereventhandle) : -1;
#else
    (void)hgroup;
    (void)hpeereventhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupSearchRecords(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pwzcriteria, jlong phpeerenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupSearchRecords");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pwzcriteria, (void*)(uintptr_t)phpeerenum) : -1;
#else
    (void)hgroup;
    (void)pwzcriteria;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupSendData(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong ullconnectionid, jlong ptype, jint cbdata, jlong pvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupSendData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (uint64_t)ullconnectionid, (void*)(uintptr_t)ptype, (uint32_t)cbdata, (void*)(uintptr_t)pvdata) : -1;
#else
    (void)hgroup;
    (void)ullconnectionid;
    (void)ptype;
    (void)cbdata;
    (void)pvdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupSetProperties(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pproperties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupSetProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pproperties) : -1;
#else
    (void)hgroup;
    (void)pproperties;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupShutdown(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupShutdown");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupStartup(JNIEnv* km_env, jclass km_clazz, jshort wversionrequested, jlong pversiondata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupStartup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)wversionrequested, (void*)(uintptr_t)pversiondata) : -1;
#else
    (void)wversionrequested;
    (void)pversiondata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupUniversalTimeToPeerTime(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong pftuniversaltime, jlong pftpeertime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupUniversalTimeToPeerTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)pftuniversaltime, (void*)(uintptr_t)pftpeertime) : -1;
#else
    (void)hgroup;
    (void)pftuniversaltime;
    (void)pftpeertime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupUnregisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hpeerevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupUnregisterEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hpeerevent) : -1;
#else
    (void)hpeerevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerGroupUpdateRecord(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong precord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerGroupUpdateRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hgroup, (void*)(uintptr_t)precord) : -1;
#else
    (void)hgroup;
    (void)precord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerHostNameToPeerName(JNIEnv* km_env, jclass km_clazz, jlong pwzhostname, jlong ppwzpeername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerHostNameToPeerName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzhostname, (void*)(uintptr_t)ppwzpeername) : -1;
#else
    (void)pwzhostname;
    (void)ppwzpeername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerIdentityCreate(JNIEnv* km_env, jclass km_clazz, jlong pwzclassifier, jlong pwzfriendlyname, jlong hcryptprov, jlong ppwzidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzclassifier, (void*)(uintptr_t)pwzfriendlyname, (uint64_t)hcryptprov, (void*)(uintptr_t)ppwzidentity) : -1;
#else
    (void)pwzclassifier;
    (void)pwzfriendlyname;
    (void)hcryptprov;
    (void)ppwzidentity;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerIdentityDelete(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityDelete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzidentity) : -1;
#else
    (void)pwzidentity;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerIdentityExport(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong pwzpassword, jlong ppwzexportxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityExport");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)pwzpassword, (void*)(uintptr_t)ppwzexportxml) : -1;
#else
    (void)pwzidentity;
    (void)pwzpassword;
    (void)ppwzexportxml;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerIdentityGetCryptKey(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong phcryptprov) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityGetCryptKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)phcryptprov) : -1;
#else
    (void)pwzidentity;
    (void)phcryptprov;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerIdentityGetDefault(JNIEnv* km_env, jclass km_clazz, jlong ppwzpeername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityGetDefault");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppwzpeername) : -1;
#else
    (void)ppwzpeername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerIdentityGetFriendlyName(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong ppwzfriendlyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityGetFriendlyName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)ppwzfriendlyname) : -1;
#else
    (void)pwzidentity;
    (void)ppwzfriendlyname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerIdentityGetXML(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong ppwzidentityxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityGetXML");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)ppwzidentityxml) : -1;
#else
    (void)pwzidentity;
    (void)ppwzidentityxml;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerIdentityImport(JNIEnv* km_env, jclass km_clazz, jlong pwzimportxml, jlong pwzpassword, jlong ppwzidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentityImport");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzimportxml, (void*)(uintptr_t)pwzpassword, (void*)(uintptr_t)ppwzidentity) : -1;
#else
    (void)pwzimportxml;
    (void)pwzpassword;
    (void)ppwzidentity;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerIdentitySetFriendlyName(JNIEnv* km_env, jclass km_clazz, jlong pwzidentity, jlong pwzfriendlyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerIdentitySetFriendlyName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzidentity, (void*)(uintptr_t)pwzfriendlyname) : -1;
#else
    (void)pwzidentity;
    (void)pwzfriendlyname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerNameToPeerHostName(JNIEnv* km_env, jclass km_clazz, jlong pwzpeername, jlong ppwzhostname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerNameToPeerHostName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzpeername, (void*)(uintptr_t)ppwzhostname) : -1;
#else
    (void)pwzpeername;
    (void)ppwzhostname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerPnrpEndResolve(JNIEnv* km_env, jclass km_clazz, jlong hresolve) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpEndResolve");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hresolve) : -1;
#else
    (void)hresolve;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerPnrpGetCloudInfo(JNIEnv* km_env, jclass km_clazz, jlong pcnumclouds, jlong ppcloudinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpGetCloudInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcnumclouds, (void*)(uintptr_t)ppcloudinfo) : -1;
#else
    (void)pcnumclouds;
    (void)ppcloudinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerPnrpGetEndpoint(JNIEnv* km_env, jclass km_clazz, jlong hresolve, jlong ppendpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpGetEndpoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hresolve, (void*)(uintptr_t)ppendpoint) : -1;
#else
    (void)hresolve;
    (void)ppendpoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerPnrpRegister(JNIEnv* km_env, jclass km_clazz, jlong pcwzpeername, jlong pregistrationinfo, jlong phregistration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpRegister");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcwzpeername, (void*)(uintptr_t)pregistrationinfo, (void*)(uintptr_t)phregistration) : -1;
#else
    (void)pcwzpeername;
    (void)pregistrationinfo;
    (void)phregistration;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerPnrpResolve(JNIEnv* km_env, jclass km_clazz, jlong pcwzpeername, jlong pcwzcloudname, jlong pcendpoints, jlong ppendpoints) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpResolve");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcwzpeername, (void*)(uintptr_t)pcwzcloudname, (void*)(uintptr_t)pcendpoints, (void*)(uintptr_t)ppendpoints) : -1;
#else
    (void)pcwzpeername;
    (void)pcwzcloudname;
    (void)pcendpoints;
    (void)ppendpoints;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerPnrpShutdown(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpShutdown");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerPnrpStartResolve(JNIEnv* km_env, jclass km_clazz, jlong pcwzpeername, jlong pcwzcloudname, jint cmaxendpoints, jlong hevent, jlong phresolve) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpStartResolve");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcwzpeername, (void*)(uintptr_t)pcwzcloudname, (uint32_t)cmaxendpoints, (void*)(uintptr_t)hevent, (void*)(uintptr_t)phresolve) : -1;
#else
    (void)pcwzpeername;
    (void)pcwzcloudname;
    (void)cmaxendpoints;
    (void)hevent;
    (void)phresolve;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerPnrpStartup(JNIEnv* km_env, jclass km_clazz, jshort wversionrequested) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpStartup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)wversionrequested) : -1;
#else
    (void)wversionrequested;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerPnrpUnregister(JNIEnv* km_env, jclass km_clazz, jlong hregistration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpUnregister");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hregistration) : -1;
#else
    (void)hregistration;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_p2p_WindowsWin32NetworkmanagementP2pJniBridge_windowssys_1windows_1win32_1networkmanagement_1p2p_1PeerPnrpUpdateRegistration(JNIEnv* km_env, jclass km_clazz, jlong hregistration, jlong pregistrationinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeerPnrpUpdateRegistration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hregistration, (void*)(uintptr_t)pregistrationinfo) : -1;
#else
    (void)hregistration;
    (void)pregistrationinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

