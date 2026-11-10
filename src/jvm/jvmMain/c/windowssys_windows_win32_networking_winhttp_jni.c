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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpAddRequestHeaders(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpszheaders, jint dwheaderslength, jint dwmodifiers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpAddRequestHeaders");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpszheaders, (uint32_t)dwheaderslength, (uint32_t)dwmodifiers) : -1;
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)dwmodifiers;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpAddRequestHeadersEx(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jint dwmodifiers, jlong ullflags, jlong ullextra, jint cheaders, jlong pheaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpAddRequestHeadersEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (uint32_t)dwmodifiers, (uint64_t)ullflags, (uint64_t)ullextra, (uint32_t)cheaders, (void*)(uintptr_t)pheaders) : 0;
#else
    (void)hrequest;
    (void)dwmodifiers;
    (void)ullflags;
    (void)ullextra;
    (void)cheaders;
    (void)pheaders;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpCheckPlatform(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpCheckPlatform");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong hinternet) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpCloseHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet) : -1;
#else
    (void)hinternet;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpConnect(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong pswzservername, jshort nserverport, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpConnect");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)pswzservername, (uint16_t)nserverport, (uint32_t)dwreserved) : NULL;
#else
    (void)hsession;
    (void)pswzservername;
    (void)nserverport;
    (void)dwreserved;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpCrackUrl(JNIEnv* km_env, jclass km_clazz, jlong pwszurl, jint dwurllength, jint dwflags, jlong lpurlcomponents) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpCrackUrl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszurl, (uint32_t)dwurllength, (uint32_t)dwflags, (void*)(uintptr_t)lpurlcomponents) : -1;
#else
    (void)pwszurl;
    (void)dwurllength;
    (void)dwflags;
    (void)lpurlcomponents;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpCreateProxyResolver(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong phresolver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpCreateProxyResolver");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)phresolver) : 0;
#else
    (void)hsession;
    (void)phresolver;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpCreateUrl(JNIEnv* km_env, jclass km_clazz, jlong lpurlcomponents, jint dwflags, jlong pwszurl, jlong pdwurllength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpCreateUrl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpurlcomponents, (uint32_t)dwflags, (void*)(uintptr_t)pwszurl, (void*)(uintptr_t)pdwurllength) : -1;
#else
    (void)lpurlcomponents;
    (void)dwflags;
    (void)pwszurl;
    (void)pdwurllength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpDetectAutoProxyConfigUrl(JNIEnv* km_env, jclass km_clazz, jint dwautodetectflags, jlong ppwstrautoconfigurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpDetectAutoProxyConfigUrl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwautodetectflags, (void*)(uintptr_t)ppwstrautoconfigurl) : -1;
#else
    (void)dwautodetectflags;
    (void)ppwstrautoconfigurl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpFreeProxyResult(JNIEnv* km_env, jclass km_clazz, jlong pproxyresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpFreeProxyResult");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pproxyresult);
#else
    (void)pproxyresult;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpFreeProxyResultEx(JNIEnv* km_env, jclass km_clazz, jlong pproxyresultex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpFreeProxyResultEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pproxyresultex);
#else
    (void)pproxyresultex;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpFreeProxySettings(JNIEnv* km_env, jclass km_clazz, jlong pwinhttpproxysettings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpFreeProxySettings");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pwinhttpproxysettings);
#else
    (void)pwinhttpproxysettings;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpFreeProxySettingsEx(JNIEnv* km_env, jclass km_clazz, jint proxysettingstype, jlong pproxysettingsex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpFreeProxySettingsEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)proxysettingstype, (void*)(uintptr_t)pproxysettingsex) : 0;
#else
    (void)proxysettingstype;
    (void)pproxysettingsex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpFreeQueryConnectionGroupResult(JNIEnv* km_env, jclass km_clazz, jlong presult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpFreeQueryConnectionGroupResult");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)presult);
#else
    (void)presult;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpGetDefaultProxyConfiguration(JNIEnv* km_env, jclass km_clazz, jlong pproxyinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetDefaultProxyConfiguration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pproxyinfo) : -1;
#else
    (void)pproxyinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpGetIEProxyConfigForCurrentUser(JNIEnv* km_env, jclass km_clazz, jlong pproxyconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetIEProxyConfigForCurrentUser");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pproxyconfig) : -1;
#else
    (void)pproxyconfig;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpGetProxyForUrl(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong lpcwszurl, jlong pautoproxyoptions, jlong pproxyinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxyForUrl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)lpcwszurl, (void*)(uintptr_t)pautoproxyoptions, (void*)(uintptr_t)pproxyinfo) : -1;
#else
    (void)hsession;
    (void)lpcwszurl;
    (void)pautoproxyoptions;
    (void)pproxyinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpGetProxyForUrlEx(JNIEnv* km_env, jclass km_clazz, jlong hresolver, jlong pcwszurl, jlong pautoproxyoptions, jlong pcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxyForUrlEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hresolver, (void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pautoproxyoptions, (uint64_t)pcontext) : 0;
#else
    (void)hresolver;
    (void)pcwszurl;
    (void)pautoproxyoptions;
    (void)pcontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpGetProxyForUrlEx2(JNIEnv* km_env, jclass km_clazz, jlong hresolver, jlong pcwszurl, jlong pautoproxyoptions, jint cbinterfaceselectioncontext, jlong pinterfaceselectioncontext, jlong pcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxyForUrlEx2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hresolver, (void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pautoproxyoptions, (uint32_t)cbinterfaceselectioncontext, (void*)(uintptr_t)pinterfaceselectioncontext, (uint64_t)pcontext) : 0;
#else
    (void)hresolver;
    (void)pcwszurl;
    (void)pautoproxyoptions;
    (void)cbinterfaceselectioncontext;
    (void)pinterfaceselectioncontext;
    (void)pcontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpGetProxyResult(JNIEnv* km_env, jclass km_clazz, jlong hresolver, jlong pproxyresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxyResult");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hresolver, (void*)(uintptr_t)pproxyresult) : 0;
#else
    (void)hresolver;
    (void)pproxyresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpGetProxyResultEx(JNIEnv* km_env, jclass km_clazz, jlong hresolver, jlong pproxyresultex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxyResultEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hresolver, (void*)(uintptr_t)pproxyresultex) : 0;
#else
    (void)hresolver;
    (void)pproxyresultex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpGetProxySettingsEx(JNIEnv* km_env, jclass km_clazz, jlong hresolver, jint proxysettingstype, jlong pproxysettingsparam, jlong pcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxySettingsEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hresolver, (int32_t)proxysettingstype, (void*)(uintptr_t)pproxysettingsparam, (uint64_t)pcontext) : 0;
#else
    (void)hresolver;
    (void)proxysettingstype;
    (void)pproxysettingsparam;
    (void)pcontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpGetProxySettingsResultEx(JNIEnv* km_env, jclass km_clazz, jlong hresolver, jlong pproxysettingsex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxySettingsResultEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hresolver, (void*)(uintptr_t)pproxysettingsex) : 0;
#else
    (void)hresolver;
    (void)pproxysettingsex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpGetProxySettingsVersion(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong pdwproxysettingsversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpGetProxySettingsVersion");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)pdwproxysettingsversion) : 0;
#else
    (void)hsession;
    (void)pdwproxysettingsversion;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpOpen(JNIEnv* km_env, jclass km_clazz, jlong pszagentw, jint dwaccesstype, jlong pszproxyw, jlong pszproxybypassw, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpOpen");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszagentw, (uint32_t)dwaccesstype, (void*)(uintptr_t)pszproxyw, (void*)(uintptr_t)pszproxybypassw, (uint32_t)dwflags) : NULL;
#else
    (void)pszagentw;
    (void)dwaccesstype;
    (void)pszproxyw;
    (void)pszproxybypassw;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpOpenRequest(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong pwszverb, jlong pwszobjectname, jlong pwszversion, jlong pwszreferrer, jlong ppwszaccepttypes, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpOpenRequest");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)pwszverb, (void*)(uintptr_t)pwszobjectname, (void*)(uintptr_t)pwszversion, (void*)(uintptr_t)pwszreferrer, (void*)(uintptr_t)ppwszaccepttypes, (uint32_t)dwflags) : NULL;
#else
    (void)hconnect;
    (void)pwszverb;
    (void)pwszobjectname;
    (void)pwszversion;
    (void)pwszreferrer;
    (void)ppwszaccepttypes;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpQueryAuthSchemes(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpdwsupportedschemes, jlong lpdwfirstscheme, jlong pdwauthtarget) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpQueryAuthSchemes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpdwsupportedschemes, (void*)(uintptr_t)lpdwfirstscheme, (void*)(uintptr_t)pdwauthtarget) : -1;
#else
    (void)hrequest;
    (void)lpdwsupportedschemes;
    (void)lpdwfirstscheme;
    (void)pdwauthtarget;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpQueryConnectionGroup(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong pguidconnection, jlong ullflags, jlong ppresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpQueryConnectionGroup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)pguidconnection, (uint64_t)ullflags, (void*)(uintptr_t)ppresult) : 0;
#else
    (void)hinternet;
    (void)pguidconnection;
    (void)ullflags;
    (void)ppresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpQueryDataAvailable(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpdwnumberofbytesavailable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpQueryDataAvailable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpdwnumberofbytesavailable) : -1;
#else
    (void)hrequest;
    (void)lpdwnumberofbytesavailable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpQueryHeaders(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jint dwinfolevel, jlong pwszname, jlong lpbuffer, jlong lpdwbufferlength, jlong lpdwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpQueryHeaders");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (uint32_t)dwinfolevel, (void*)(uintptr_t)pwszname, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpdwindex) : -1;
#else
    (void)hrequest;
    (void)dwinfolevel;
    (void)pwszname;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    (void)lpdwindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpQueryHeadersEx(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jint dwinfolevel, jlong ullflags, jint uicodepage, jlong pdwindex, jlong pheadername, jlong pbuffer, jlong pdwbufferlength, jlong ppheaders, jlong pdwheaderscount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpQueryHeadersEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (uint32_t)dwinfolevel, (uint64_t)ullflags, (uint32_t)uicodepage, (void*)(uintptr_t)pdwindex, (void*)(uintptr_t)pheadername, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pdwbufferlength, (void*)(uintptr_t)ppheaders, (void*)(uintptr_t)pdwheaderscount) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpQueryOption(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jint dwoption, jlong lpbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpQueryOption");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (uint32_t)dwoption, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwbufferlength) : -1;
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpReadData(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpbuffer, jint dwnumberofbytestoread, jlong lpdwnumberofbytesread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpReadData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpbuffer, (uint32_t)dwnumberofbytestoread, (void*)(uintptr_t)lpdwnumberofbytesread) : -1;
#else
    (void)hrequest;
    (void)lpbuffer;
    (void)dwnumberofbytestoread;
    (void)lpdwnumberofbytesread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpReadDataEx(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpbuffer, jint dwnumberofbytestoread, jlong lpdwnumberofbytesread, jlong ullflags, jint cbproperty, jlong pvproperty) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpReadDataEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpbuffer, (uint32_t)dwnumberofbytestoread, (void*)(uintptr_t)lpdwnumberofbytesread, (uint64_t)ullflags, (uint32_t)cbproperty, (void*)(uintptr_t)pvproperty) : 0;
#else
    (void)hrequest;
    (void)lpbuffer;
    (void)dwnumberofbytestoread;
    (void)lpdwnumberofbytesread;
    (void)ullflags;
    (void)cbproperty;
    (void)pvproperty;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpReadProxySettings(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong pcwszconnectionname, jint ffallbacktodefaultsettings, jint fsetautodiscoverfordefaultsettings, jlong pdwsettingsversion, jlong pfdefaultsettingsarereturned, jlong pwinhttpproxysettings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpReadProxySettings");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)pcwszconnectionname, (int32_t)ffallbacktodefaultsettings, (int32_t)fsetautodiscoverfordefaultsettings, (void*)(uintptr_t)pdwsettingsversion, (void*)(uintptr_t)pfdefaultsettingsarereturned, (void*)(uintptr_t)pwinhttpproxysettings) : 0;
#else
    (void)hsession;
    (void)pcwszconnectionname;
    (void)ffallbacktodefaultsettings;
    (void)fsetautodiscoverfordefaultsettings;
    (void)pdwsettingsversion;
    (void)pfdefaultsettingsarereturned;
    (void)pwinhttpproxysettings;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpReceiveResponse(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpReceiveResponse");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)hrequest;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpRegisterProxyChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong ullflags, jlong pfncallback, jlong pvcontext, jlong hregistration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpRegisterProxyChangeNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)ullflags, (void*)(uintptr_t)pfncallback, (void*)(uintptr_t)pvcontext, (void*)(uintptr_t)hregistration) : 0;
#else
    (void)ullflags;
    (void)pfncallback;
    (void)pvcontext;
    (void)hregistration;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpResetAutoProxy(JNIEnv* km_env, jclass km_clazz, jlong hsession, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpResetAutoProxy");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (uint32_t)dwflags) : 0;
#else
    (void)hsession;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpSendRequest(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpszheaders, jint dwheaderslength, jlong lpoptional, jint dwoptionallength, jint dwtotallength, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpSendRequest");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpszheaders, (uint32_t)dwheaderslength, (void*)(uintptr_t)lpoptional, (uint32_t)dwoptionallength, (uint32_t)dwtotallength, (uint64_t)dwcontext) : -1;
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)lpoptional;
    (void)dwoptionallength;
    (void)dwtotallength;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpSetCredentials(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jint authtargets, jint authscheme, jlong pwszusername, jlong pwszpassword, jlong pauthparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpSetCredentials");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (uint32_t)authtargets, (uint32_t)authscheme, (void*)(uintptr_t)pwszusername, (void*)(uintptr_t)pwszpassword, (void*)(uintptr_t)pauthparams) : -1;
#else
    (void)hrequest;
    (void)authtargets;
    (void)authscheme;
    (void)pwszusername;
    (void)pwszpassword;
    (void)pauthparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpSetDefaultProxyConfiguration(JNIEnv* km_env, jclass km_clazz, jlong pproxyinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpSetDefaultProxyConfiguration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pproxyinfo) : -1;
#else
    (void)pproxyinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpSetOption(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jint dwoption, jlong lpbuffer, jint dwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpSetOption");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (uint32_t)dwoption, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbufferlength) : -1;
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)dwbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpSetProxySettingsPerUser(JNIEnv* km_env, jclass km_clazz, jint fproxysettingsperuser) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpSetProxySettingsPerUser");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fproxysettingsperuser) : 0;
#else
    (void)fproxysettingsperuser;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpSetStatusCallback(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lpfninternetcallback, jint dwnotificationflags, jlong dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpSetStatusCallback");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lpfninternetcallback, (uint32_t)dwnotificationflags, (uint64_t)dwreserved) : NULL;
#else
    (void)hinternet;
    (void)lpfninternetcallback;
    (void)dwnotificationflags;
    (void)dwreserved;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpSetTimeouts(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jint nresolvetimeout, jint nconnecttimeout, jint nsendtimeout, jint nreceivetimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpSetTimeouts");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (int32_t)nresolvetimeout, (int32_t)nconnecttimeout, (int32_t)nsendtimeout, (int32_t)nreceivetimeout) : -1;
#else
    (void)hinternet;
    (void)nresolvetimeout;
    (void)nconnecttimeout;
    (void)nsendtimeout;
    (void)nreceivetimeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpTimeFromSystemTime(JNIEnv* km_env, jclass km_clazz, jlong pst, jlong pwsztime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpTimeFromSystemTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pst, (void*)(uintptr_t)pwsztime) : -1;
#else
    (void)pst;
    (void)pwsztime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpTimeToSystemTime(JNIEnv* km_env, jclass km_clazz, jlong pwsztime, jlong pst) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpTimeToSystemTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwsztime, (void*)(uintptr_t)pst) : -1;
#else
    (void)pwsztime;
    (void)pst;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpUnregisterProxyChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong hregistration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpUnregisterProxyChangeNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hregistration) : 0;
#else
    (void)hregistration;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpWebSocketClose(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jshort usstatus, jlong pvreason, jint dwreasonlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWebSocketClose");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (uint16_t)usstatus, (void*)(uintptr_t)pvreason, (uint32_t)dwreasonlength) : 0;
#else
    (void)hwebsocket;
    (void)usstatus;
    (void)pvreason;
    (void)dwreasonlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpWebSocketCompleteUpgrade(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong pcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWebSocketCompleteUpgrade");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (uint64_t)pcontext) : NULL;
#else
    (void)hrequest;
    (void)pcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpWebSocketQueryCloseStatus(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jlong pusstatus, jlong pvreason, jint dwreasonlength, jlong pdwreasonlengthconsumed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWebSocketQueryCloseStatus");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (void*)(uintptr_t)pusstatus, (void*)(uintptr_t)pvreason, (uint32_t)dwreasonlength, (void*)(uintptr_t)pdwreasonlengthconsumed) : 0;
#else
    (void)hwebsocket;
    (void)pusstatus;
    (void)pvreason;
    (void)dwreasonlength;
    (void)pdwreasonlengthconsumed;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpWebSocketReceive(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jlong pvbuffer, jint dwbufferlength, jlong pdwbytesread, jlong pebuffertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWebSocketReceive");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (void*)(uintptr_t)pvbuffer, (uint32_t)dwbufferlength, (void*)(uintptr_t)pdwbytesread, (void*)(uintptr_t)pebuffertype) : 0;
#else
    (void)hwebsocket;
    (void)pvbuffer;
    (void)dwbufferlength;
    (void)pdwbytesread;
    (void)pebuffertype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpWebSocketSend(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jint ebuffertype, jlong pvbuffer, jint dwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWebSocketSend");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (int32_t)ebuffertype, (void*)(uintptr_t)pvbuffer, (uint32_t)dwbufferlength) : 0;
#else
    (void)hwebsocket;
    (void)ebuffertype;
    (void)pvbuffer;
    (void)dwbufferlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpWebSocketShutdown(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jshort usstatus, jlong pvreason, jint dwreasonlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWebSocketShutdown");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (uint16_t)usstatus, (void*)(uintptr_t)pvreason, (uint32_t)dwreasonlength) : 0;
#else
    (void)hwebsocket;
    (void)usstatus;
    (void)pvreason;
    (void)dwreasonlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpWriteData(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpbuffer, jint dwnumberofbytestowrite, jlong lpdwnumberofbyteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWriteData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpbuffer, (uint32_t)dwnumberofbytestowrite, (void*)(uintptr_t)lpdwnumberofbyteswritten) : -1;
#else
    (void)hrequest;
    (void)lpbuffer;
    (void)dwnumberofbytestowrite;
    (void)lpdwnumberofbyteswritten;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_winhttp_WindowsWin32NetworkingWinhttpJniBridge_windowssys_1windows_1win32_1networking_1winhttp_1winHttpWriteProxySettings(JNIEnv* km_env, jclass km_clazz, jlong hsession, jint fforceupdate, jlong pwinhttpproxysettings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhttp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHttpWriteProxySettings");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (int32_t)fforceupdate, (void*)(uintptr_t)pwinhttpproxysettings) : 0;
#else
    (void)hsession;
    (void)fforceupdate;
    (void)pwinhttpproxysettings;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

