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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsAcquireContextHandle_1A(JNIEnv* km_env, jclass km_clazz, jint credentialflags, jlong credentials, jlong pcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsAcquireContextHandle_A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)credentialflags, (void*)(uintptr_t)credentials, (void*)(uintptr_t)pcontext) : -1;
#else
    (void)credentialflags;
    (void)credentials;
    (void)pcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsAcquireContextHandle_1W(JNIEnv* km_env, jclass km_clazz, jint credentialflags, jlong credentials, jlong pcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsAcquireContextHandle_W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)credentialflags, (void*)(uintptr_t)credentials, (void*)(uintptr_t)pcontext) : -1;
#else
    (void)credentialflags;
    (void)credentials;
    (void)pcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsCancelQuery(JNIEnv* km_env, jclass km_clazz, jlong pcancelhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsCancelQuery");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcancelhandle) : -1;
#else
    (void)pcancelhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsCancelQueryRaw(JNIEnv* km_env, jclass km_clazz, jlong cancelhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsCancelQueryRaw");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cancelhandle) : -1;
#else
    (void)cancelhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsConnectionDeletePolicyEntries(JNIEnv* km_env, jclass km_clazz, jint policyentrytag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionDeletePolicyEntries");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)policyentrytag) : 0;
#else
    (void)policyentrytag;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsConnectionDeleteProxyInfo(JNIEnv* km_env, jclass km_clazz, jlong pwszconnectionname, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionDeleteProxyInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszconnectionname, (int32_t)type) : 0;
#else
    (void)pwszconnectionname;
    (void)type;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsConnectionFreeNameList(JNIEnv* km_env, jclass km_clazz, jlong pnamelist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionFreeNameList");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pnamelist);
#else
    (void)pnamelist;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsConnectionFreeProxyInfo(JNIEnv* km_env, jclass km_clazz, jlong pproxyinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionFreeProxyInfo");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pproxyinfo);
#else
    (void)pproxyinfo;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsConnectionFreeProxyInfoEx(JNIEnv* km_env, jclass km_clazz, jlong pproxyinfoex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionFreeProxyInfoEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pproxyinfoex);
#else
    (void)pproxyinfoex;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsConnectionFreeProxyList(JNIEnv* km_env, jclass km_clazz, jlong pproxylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionFreeProxyList");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pproxylist);
#else
    (void)pproxylist;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsConnectionGetNameList(JNIEnv* km_env, jclass km_clazz, jlong pnamelist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionGetNameList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pnamelist) : 0;
#else
    (void)pnamelist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsConnectionGetProxyInfo(JNIEnv* km_env, jclass km_clazz, jlong pwszconnectionname, jint type, jlong pproxyinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionGetProxyInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszconnectionname, (int32_t)type, (void*)(uintptr_t)pproxyinfo) : 0;
#else
    (void)pwszconnectionname;
    (void)type;
    (void)pproxyinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsConnectionGetProxyInfoForHostUrl(JNIEnv* km_env, jclass km_clazz, jlong pwszhosturl, jlong pselectioncontext, jint dwselectioncontextlength, jint dwexplicitinterfaceindex, jlong pproxyinfoex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionGetProxyInfoForHostUrl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszhosturl, (void*)(uintptr_t)pselectioncontext, (uint32_t)dwselectioncontextlength, (uint32_t)dwexplicitinterfaceindex, (void*)(uintptr_t)pproxyinfoex) : 0;
#else
    (void)pwszhosturl;
    (void)pselectioncontext;
    (void)dwselectioncontextlength;
    (void)dwexplicitinterfaceindex;
    (void)pproxyinfoex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsConnectionGetProxyInfoForHostUrlEx(JNIEnv* km_env, jclass km_clazz, jlong pwszhosturl, jlong pselectioncontext, jint dwselectioncontextlength, jint dwexplicitinterfaceindex, jlong pwszconnectionname, jlong pproxyinfoex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionGetProxyInfoForHostUrlEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszhosturl, (void*)(uintptr_t)pselectioncontext, (uint32_t)dwselectioncontextlength, (uint32_t)dwexplicitinterfaceindex, (void*)(uintptr_t)pwszconnectionname, (void*)(uintptr_t)pproxyinfoex) : 0;
#else
    (void)pwszhosturl;
    (void)pselectioncontext;
    (void)dwselectioncontextlength;
    (void)dwexplicitinterfaceindex;
    (void)pwszconnectionname;
    (void)pproxyinfoex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsConnectionGetProxyList(JNIEnv* km_env, jclass km_clazz, jlong pwszconnectionname, jlong pproxylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionGetProxyList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszconnectionname, (void*)(uintptr_t)pproxylist) : 0;
#else
    (void)pwszconnectionname;
    (void)pproxylist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsConnectionSetPolicyEntries(JNIEnv* km_env, jclass km_clazz, jint policyentrytag, jlong ppolicyentrylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionSetPolicyEntries");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)policyentrytag, (void*)(uintptr_t)ppolicyentrylist) : 0;
#else
    (void)policyentrytag;
    (void)ppolicyentrylist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsConnectionSetProxyInfo(JNIEnv* km_env, jclass km_clazz, jlong pwszconnectionname, jint type, jlong pproxyinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionSetProxyInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszconnectionname, (int32_t)type, (void*)(uintptr_t)pproxyinfo) : 0;
#else
    (void)pwszconnectionname;
    (void)type;
    (void)pproxyinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsConnectionUpdateIfIndexTable(JNIEnv* km_env, jclass km_clazz, jlong pconnectionifindexentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsConnectionUpdateIfIndexTable");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pconnectionifindexentries) : 0;
#else
    (void)pconnectionifindexentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsExtractRecordsFromMessage_1UTF8(JNIEnv* km_env, jclass km_clazz, jlong pdnsbuffer, jshort wmessagelength, jlong pprecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsExtractRecordsFromMessage_UTF8");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdnsbuffer, (uint16_t)wmessagelength, (void*)(uintptr_t)pprecord) : -1;
#else
    (void)pdnsbuffer;
    (void)wmessagelength;
    (void)pprecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsExtractRecordsFromMessage_1W(JNIEnv* km_env, jclass km_clazz, jlong pdnsbuffer, jshort wmessagelength, jlong pprecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsExtractRecordsFromMessage_W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdnsbuffer, (uint16_t)wmessagelength, (void*)(uintptr_t)pprecord) : -1;
#else
    (void)pdnsbuffer;
    (void)wmessagelength;
    (void)pprecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsFree(JNIEnv* km_env, jclass km_clazz, jlong pdata, jint freetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pdata, (int32_t)freetype);
#else
    (void)pdata;
    (void)freetype;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsFreeCustomServers(JNIEnv* km_env, jclass km_clazz, jlong pcservers, jlong ppservers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsFreeCustomServers");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pcservers, (void*)(uintptr_t)ppservers);
#else
    (void)pcservers;
    (void)ppservers;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsFreeProxyName(JNIEnv* km_env, jclass km_clazz, jlong proxyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsFreeProxyName");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)proxyname);
#else
    (void)proxyname;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsGetApplicationSettings(JNIEnv* km_env, jclass km_clazz, jlong pcservers, jlong ppdefaultservers, jlong psettings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsGetApplicationSettings");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcservers, (void*)(uintptr_t)ppdefaultservers, (void*)(uintptr_t)psettings) : 0;
#else
    (void)pcservers;
    (void)ppdefaultservers;
    (void)psettings;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsGetProxyInformation(JNIEnv* km_env, jclass km_clazz, jlong hostname, jlong proxyinformation, jlong defaultproxyinformation, jlong completionroutine, jlong completioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsGetProxyInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostname, (void*)(uintptr_t)proxyinformation, (void*)(uintptr_t)defaultproxyinformation, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)completioncontext) : 0;
#else
    (void)hostname;
    (void)proxyinformation;
    (void)defaultproxyinformation;
    (void)completionroutine;
    (void)completioncontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsModifyRecordsInSet_1A(JNIEnv* km_env, jclass km_clazz, jlong paddrecords, jlong pdeleterecords, jint options, jlong hcredentials, jlong pextralist, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsModifyRecordsInSet_A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)paddrecords, (void*)(uintptr_t)pdeleterecords, (uint32_t)options, (void*)(uintptr_t)hcredentials, (void*)(uintptr_t)pextralist, (void*)(uintptr_t)preserved) : -1;
#else
    (void)paddrecords;
    (void)pdeleterecords;
    (void)options;
    (void)hcredentials;
    (void)pextralist;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsModifyRecordsInSet_1UTF8(JNIEnv* km_env, jclass km_clazz, jlong paddrecords, jlong pdeleterecords, jint options, jlong hcredentials, jlong pextralist, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsModifyRecordsInSet_UTF8");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)paddrecords, (void*)(uintptr_t)pdeleterecords, (uint32_t)options, (void*)(uintptr_t)hcredentials, (void*)(uintptr_t)pextralist, (void*)(uintptr_t)preserved) : -1;
#else
    (void)paddrecords;
    (void)pdeleterecords;
    (void)options;
    (void)hcredentials;
    (void)pextralist;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsModifyRecordsInSet_1W(JNIEnv* km_env, jclass km_clazz, jlong paddrecords, jlong pdeleterecords, jint options, jlong hcredentials, jlong pextralist, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsModifyRecordsInSet_W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)paddrecords, (void*)(uintptr_t)pdeleterecords, (uint32_t)options, (void*)(uintptr_t)hcredentials, (void*)(uintptr_t)pextralist, (void*)(uintptr_t)preserved) : -1;
#else
    (void)paddrecords;
    (void)pdeleterecords;
    (void)options;
    (void)hcredentials;
    (void)pextralist;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsNameCompare_1A(JNIEnv* km_env, jclass km_clazz, jlong pname1, jlong pname2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsNameCompare_A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname1, (void*)(uintptr_t)pname2) : -1;
#else
    (void)pname1;
    (void)pname2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsNameCompare_1W(JNIEnv* km_env, jclass km_clazz, jlong pname1, jlong pname2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsNameCompare_W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pname1, (void*)(uintptr_t)pname2) : -1;
#else
    (void)pname1;
    (void)pname2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsQueryConfig(JNIEnv* km_env, jclass km_clazz, jint config, jint flag, jlong pwsadaptername, jlong preserved, jlong pbuffer, jlong pbuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsQueryConfig");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)config, (uint32_t)flag, (void*)(uintptr_t)pwsadaptername, (void*)(uintptr_t)preserved, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pbuflen) : -1;
#else
    (void)config;
    (void)flag;
    (void)pwsadaptername;
    (void)preserved;
    (void)pbuffer;
    (void)pbuflen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsQueryEx(JNIEnv* km_env, jclass km_clazz, jlong pqueryrequest, jlong pqueryresults, jlong pcancelhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsQueryEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pqueryrequest, (void*)(uintptr_t)pqueryresults, (void*)(uintptr_t)pcancelhandle) : -1;
#else
    (void)pqueryrequest;
    (void)pqueryresults;
    (void)pcancelhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsQueryRaw(JNIEnv* km_env, jclass km_clazz, jlong queryrequest, jlong cancelhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsQueryRaw");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)queryrequest, (void*)(uintptr_t)cancelhandle) : -1;
#else
    (void)queryrequest;
    (void)cancelhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsQueryRawResultFree(JNIEnv* km_env, jclass km_clazz, jlong queryresults) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsQueryRawResultFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)queryresults);
#else
    (void)queryresults;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsQuery_1A(JNIEnv* km_env, jclass km_clazz, jlong pszname, jshort wtype, jint options, jlong pextra, jlong ppqueryresults, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsQuery_A");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszname, (uint16_t)wtype, (uint32_t)options, (void*)(uintptr_t)pextra, (void*)(uintptr_t)ppqueryresults, (void*)(uintptr_t)preserved) : 0;
#else
    (void)pszname;
    (void)wtype;
    (void)options;
    (void)pextra;
    (void)ppqueryresults;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsQuery_1UTF8(JNIEnv* km_env, jclass km_clazz, jlong pszname, jshort wtype, jint options, jlong pextra, jlong ppqueryresults, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsQuery_UTF8");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszname, (uint16_t)wtype, (uint32_t)options, (void*)(uintptr_t)pextra, (void*)(uintptr_t)ppqueryresults, (void*)(uintptr_t)preserved) : 0;
#else
    (void)pszname;
    (void)wtype;
    (void)options;
    (void)pextra;
    (void)ppqueryresults;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsQuery_1W(JNIEnv* km_env, jclass km_clazz, jlong pszname, jshort wtype, jint options, jlong pextra, jlong ppqueryresults, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsQuery_W");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszname, (uint16_t)wtype, (uint32_t)options, (void*)(uintptr_t)pextra, (void*)(uintptr_t)ppqueryresults, (void*)(uintptr_t)preserved) : 0;
#else
    (void)pszname;
    (void)wtype;
    (void)options;
    (void)pextra;
    (void)ppqueryresults;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsRecordCompare(JNIEnv* km_env, jclass km_clazz, jlong precord1, jlong precord2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsRecordCompare");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)precord1, (void*)(uintptr_t)precord2) : -1;
#else
    (void)precord1;
    (void)precord2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsRecordCopyEx(JNIEnv* km_env, jclass km_clazz, jlong precord, jint charsetin, jint charsetout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsRecordCopyEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)precord, (int32_t)charsetin, (int32_t)charsetout) : NULL;
#else
    (void)precord;
    (void)charsetin;
    (void)charsetout;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsRecordSetCompare(JNIEnv* km_env, jclass km_clazz, jlong prr1, jlong prr2, jlong ppdiff1, jlong ppdiff2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsRecordSetCompare");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prr1, (void*)(uintptr_t)prr2, (void*)(uintptr_t)ppdiff1, (void*)(uintptr_t)ppdiff2) : -1;
#else
    (void)prr1;
    (void)prr2;
    (void)ppdiff1;
    (void)ppdiff2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsRecordSetCopyEx(JNIEnv* km_env, jclass km_clazz, jlong precordset, jint charsetin, jint charsetout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsRecordSetCopyEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)precordset, (int32_t)charsetin, (int32_t)charsetout) : NULL;
#else
    (void)precordset;
    (void)charsetin;
    (void)charsetout;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsRecordSetDetach(JNIEnv* km_env, jclass km_clazz, jlong precordlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsRecordSetDetach");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)precordlist) : NULL;
#else
    (void)precordlist;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsReleaseContextHandle(JNIEnv* km_env, jclass km_clazz, jlong hcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsReleaseContextHandle");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hcontext);
#else
    (void)hcontext;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsReplaceRecordSetA(JNIEnv* km_env, jclass km_clazz, jlong preplaceset, jint options, jlong hcontext, jlong pextrainfo, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsReplaceRecordSetA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)preplaceset, (uint32_t)options, (void*)(uintptr_t)hcontext, (void*)(uintptr_t)pextrainfo, (void*)(uintptr_t)preserved) : -1;
#else
    (void)preplaceset;
    (void)options;
    (void)hcontext;
    (void)pextrainfo;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsReplaceRecordSetUTF8(JNIEnv* km_env, jclass km_clazz, jlong preplaceset, jint options, jlong hcontext, jlong pextrainfo, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsReplaceRecordSetUTF8");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)preplaceset, (uint32_t)options, (void*)(uintptr_t)hcontext, (void*)(uintptr_t)pextrainfo, (void*)(uintptr_t)preserved) : -1;
#else
    (void)preplaceset;
    (void)options;
    (void)hcontext;
    (void)pextrainfo;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsReplaceRecordSetW(JNIEnv* km_env, jclass km_clazz, jlong preplaceset, jint options, jlong hcontext, jlong pextrainfo, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsReplaceRecordSetW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)preplaceset, (uint32_t)options, (void*)(uintptr_t)hcontext, (void*)(uintptr_t)pextrainfo, (void*)(uintptr_t)preserved) : -1;
#else
    (void)preplaceset;
    (void)options;
    (void)hcontext;
    (void)pextrainfo;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsServiceBrowse(JNIEnv* km_env, jclass km_clazz, jlong prequest, jlong pcancel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceBrowse");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prequest, (void*)(uintptr_t)pcancel) : -1;
#else
    (void)prequest;
    (void)pcancel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsServiceBrowseCancel(JNIEnv* km_env, jclass km_clazz, jlong pcancelhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceBrowseCancel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcancelhandle) : -1;
#else
    (void)pcancelhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsServiceConstructInstance(JNIEnv* km_env, jclass km_clazz, jlong pservicename, jlong phostname, jlong pip4, jlong pip6, jshort wport, jshort wpriority, jshort wweight, jint dwpropertiescount, jlong keys, jlong values) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint16_t, uint16_t, uint16_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceConstructInstance");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pservicename, (void*)(uintptr_t)phostname, (void*)(uintptr_t)pip4, (void*)(uintptr_t)pip6, (uint16_t)wport, (uint16_t)wpriority, (uint16_t)wweight, (uint32_t)dwpropertiescount, (void*)(uintptr_t)keys, (void*)(uintptr_t)values) : NULL;
#else
    (void)pservicename;
    (void)phostname;
    (void)pip4;
    (void)pip6;
    (void)wport;
    (void)wpriority;
    (void)wweight;
    (void)dwpropertiescount;
    (void)keys;
    (void)values;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsServiceCopyInstance(JNIEnv* km_env, jclass km_clazz, jlong porig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceCopyInstance");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)porig) : NULL;
#else
    (void)porig;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsServiceDeRegister(JNIEnv* km_env, jclass km_clazz, jlong prequest, jlong pcancel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceDeRegister");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prequest, (void*)(uintptr_t)pcancel) : 0;
#else
    (void)prequest;
    (void)pcancel;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsServiceFreeInstance(JNIEnv* km_env, jclass km_clazz, jlong pinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceFreeInstance");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pinstance);
#else
    (void)pinstance;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsServiceRegister(JNIEnv* km_env, jclass km_clazz, jlong prequest, jlong pcancel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceRegister");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prequest, (void*)(uintptr_t)pcancel) : 0;
#else
    (void)prequest;
    (void)pcancel;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsServiceRegisterCancel(JNIEnv* km_env, jclass km_clazz, jlong pcancelhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceRegisterCancel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcancelhandle) : 0;
#else
    (void)pcancelhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsServiceResolve(JNIEnv* km_env, jclass km_clazz, jlong prequest, jlong pcancel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceResolve");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prequest, (void*)(uintptr_t)pcancel) : -1;
#else
    (void)prequest;
    (void)pcancel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsServiceResolveCancel(JNIEnv* km_env, jclass km_clazz, jlong pcancelhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsServiceResolveCancel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcancelhandle) : -1;
#else
    (void)pcancelhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsSetApplicationSettings(JNIEnv* km_env, jclass km_clazz, jint cservers, jlong pservers, jlong psettings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsSetApplicationSettings");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cservers, (void*)(uintptr_t)pservers, (void*)(uintptr_t)psettings) : 0;
#else
    (void)cservers;
    (void)pservers;
    (void)psettings;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsStartMulticastQuery(JNIEnv* km_env, jclass km_clazz, jlong pqueryrequest, jlong phandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsStartMulticastQuery");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pqueryrequest, (void*)(uintptr_t)phandle) : -1;
#else
    (void)pqueryrequest;
    (void)phandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsStopMulticastQuery(JNIEnv* km_env, jclass km_clazz, jlong phandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsStopMulticastQuery");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phandle) : -1;
#else
    (void)phandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsValidateName_1A(JNIEnv* km_env, jclass km_clazz, jlong pszname, jint format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsValidateName_A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszname, (int32_t)format) : -1;
#else
    (void)pszname;
    (void)format;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsValidateName_1UTF8(JNIEnv* km_env, jclass km_clazz, jlong pszname, jint format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsValidateName_UTF8");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszname, (int32_t)format) : -1;
#else
    (void)pszname;
    (void)format;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsValidateName_1W(JNIEnv* km_env, jclass km_clazz, jlong pszname, jint format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsValidateName_W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszname, (int32_t)format) : -1;
#else
    (void)pszname;
    (void)format;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsWriteQuestionToBuffer_1UTF8(JNIEnv* km_env, jclass km_clazz, jlong pdnsbuffer, jlong pdwbuffersize, jlong pszname, jshort wtype, jshort xid, jint frecursiondesired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, uint16_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsWriteQuestionToBuffer_UTF8");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdnsbuffer, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pszname, (uint16_t)wtype, (uint16_t)xid, (int32_t)frecursiondesired) : -1;
#else
    (void)pdnsbuffer;
    (void)pdwbuffersize;
    (void)pszname;
    (void)wtype;
    (void)xid;
    (void)frecursiondesired;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dns_WindowsWin32NetworkmanagementDnsJniBridge_windowssys_1windows_1win32_1networkmanagement_1dns_1DnsWriteQuestionToBuffer_1W(JNIEnv* km_env, jclass km_clazz, jlong pdnsbuffer, jlong pdwbuffersize, jlong pszname, jshort wtype, jshort xid, jint frecursiondesired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, uint16_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dnsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DnsWriteQuestionToBuffer_W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdnsbuffer, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pszname, (uint16_t)wtype, (uint16_t)xid, (int32_t)frecursiondesired) : -1;
#else
    (void)pdnsbuffer;
    (void)pdwbuffersize;
    (void)pszname;
    (void)wtype;
    (void)xid;
    (void)frecursiondesired;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

