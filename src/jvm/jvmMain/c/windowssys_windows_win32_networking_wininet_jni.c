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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheCheckManifest(JNIEnv* km_env, jclass km_clazz, jlong pwszmasterurl, jlong pwszmanifesturl, jlong pbmanifestdata, jint dwmanifestdatasize, jlong pbmanifestresponseheaders, jint dwmanifestresponseheaderssize, jlong pestate, jlong phnewappcache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheCheckManifest");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszmasterurl, (void*)(uintptr_t)pwszmanifesturl, (void*)(uintptr_t)pbmanifestdata, (uint32_t)dwmanifestdatasize, (void*)(uintptr_t)pbmanifestresponseheaders, (uint32_t)dwmanifestresponseheaderssize, (void*)(uintptr_t)pestate, (void*)(uintptr_t)phnewappcache);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pwszmasterurl;
    (void)pwszmanifesturl;
    (void)pbmanifestdata;
    (void)dwmanifestdatasize;
    (void)pbmanifestresponseheaders;
    (void)dwmanifestresponseheaderssize;
    (void)pestate;
    (void)phnewappcache;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong happcache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheCloseHandle");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)happcache);
    } else {
        errno = ENOSYS;
    }
#else
    (void)happcache;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheCreateAndCommitFile(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pwszsourcefilepath, jlong pwszurl, jlong pbresponseheaders, jint dwresponseheaderssize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheCreateAndCommitFile");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pwszsourcefilepath, (void*)(uintptr_t)pwszurl, (void*)(uintptr_t)pbresponseheaders, (uint32_t)dwresponseheaderssize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)happcache;
    (void)pwszsourcefilepath;
    (void)pwszurl;
    (void)pbresponseheaders;
    (void)dwresponseheaderssize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheDeleteGroup(JNIEnv* km_env, jclass km_clazz, jlong pwszmanifesturl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheDeleteGroup");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszmanifesturl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pwszmanifesturl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheDeleteIEGroup(JNIEnv* km_env, jclass km_clazz, jlong pwszmanifesturl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheDeleteIEGroup");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszmanifesturl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pwszmanifesturl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheDuplicateHandle(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong phduplicatedappcache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheDuplicateHandle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)phduplicatedappcache);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)happcache;
    (void)phduplicatedappcache;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheFinalize(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pbmanifestdata, jint dwmanifestdatasize, jlong pestate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheFinalize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pbmanifestdata, (uint32_t)dwmanifestdatasize, (void*)(uintptr_t)pestate);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)happcache;
    (void)pbmanifestdata;
    (void)dwmanifestdatasize;
    (void)pestate;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheFreeDownloadList(JNIEnv* km_env, jclass km_clazz, jlong pdownloadlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheFreeDownloadList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pdownloadlist);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pdownloadlist;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheFreeGroupList(JNIEnv* km_env, jclass km_clazz, jlong pappcachegrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheFreeGroupList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pappcachegrouplist);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pappcachegrouplist;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheGetDownloadList(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pdownloadlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetDownloadList");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pdownloadlist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)happcache;
    (void)pdownloadlist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheGetFallbackUrl(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pwszurl, jlong ppwszfallbackurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetFallbackUrl");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pwszurl, (void*)(uintptr_t)ppwszfallbackurl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)happcache;
    (void)pwszurl;
    (void)ppwszfallbackurl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheGetGroupList(JNIEnv* km_env, jclass km_clazz, jlong pappcachegrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetGroupList");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pappcachegrouplist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pappcachegrouplist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheGetIEGroupList(JNIEnv* km_env, jclass km_clazz, jlong pappcachegrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetIEGroupList");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pappcachegrouplist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pappcachegrouplist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheGetInfo(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pappcacheinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pappcacheinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)happcache;
    (void)pappcacheinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheGetManifestUrl(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong ppwszmanifesturl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetManifestUrl");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)ppwszmanifesturl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)happcache;
    (void)ppwszmanifesturl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetAppCacheLookup(JNIEnv* km_env, jclass km_clazz, jlong pwszurl, jint dwflags, jlong phappcache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheLookup");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszurl, (uint32_t)dwflags, (void*)(uintptr_t)phappcache);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pwszurl;
    (void)dwflags;
    (void)phappcache;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetCreateMD5SSOHash(JNIEnv* km_env, jclass km_clazz, jlong pszchallengeinfo, jlong pwszrealm, jlong pwsztarget, jlong pbhexhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMD5SSOHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszchallengeinfo, (void*)(uintptr_t)pwszrealm, (void*)(uintptr_t)pwsztarget, (void*)(uintptr_t)pbhexhash);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszchallengeinfo;
    (void)pwszrealm;
    (void)pwsztarget;
    (void)pbhexhash;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerA(JNIEnv* km_env, jclass km_clazz, jlong name, jlong lpcacheprefix, jlong lpszcachepath, jint kbcachelimit, jint dwcontainertype, jint dwoptions, jlong pvbuffer, jlong cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheContainerA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)lpcacheprefix, (void*)(uintptr_t)lpszcachepath, (uint32_t)kbcachelimit, (uint32_t)dwcontainertype, (uint32_t)dwoptions, (void*)(uintptr_t)pvbuffer, (void*)(uintptr_t)cbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)name;
    (void)lpcacheprefix;
    (void)lpszcachepath;
    (void)kbcachelimit;
    (void)dwcontainertype;
    (void)dwoptions;
    (void)pvbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerW(JNIEnv* km_env, jclass km_clazz, jlong name, jlong lpcacheprefix, jlong lpszcachepath, jint kbcachelimit, jint dwcontainertype, jint dwoptions, jlong pvbuffer, jlong cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheContainerW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)lpcacheprefix, (void*)(uintptr_t)lpszcachepath, (uint32_t)kbcachelimit, (uint32_t)dwcontainertype, (uint32_t)dwoptions, (void*)(uintptr_t)pvbuffer, (void*)(uintptr_t)cbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)name;
    (void)lpcacheprefix;
    (void)lpszcachepath;
    (void)kbcachelimit;
    (void)dwcontainertype;
    (void)dwoptions;
    (void)pvbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwexpectedfilesize, jlong lpszfileextension, jlong lpszfilename, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheEntryA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwexpectedfilesize, (void*)(uintptr_t)lpszfileextension, (void*)(uintptr_t)lpszfilename, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)dwexpectedfilesize;
    (void)lpszfileextension;
    (void)lpszfilename;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryExW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwexpectedfilesize, jlong lpszfileextension, jlong lpszfilename, jint dwreserved, jint fpreserveincomingfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheEntryExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwexpectedfilesize, (void*)(uintptr_t)lpszfileextension, (void*)(uintptr_t)lpszfilename, (uint32_t)dwreserved, (int32_t)fpreserveincomingfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)dwexpectedfilesize;
    (void)lpszfileextension;
    (void)lpszfilename;
    (void)dwreserved;
    (void)fpreserveincomingfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwexpectedfilesize, jlong lpszfileextension, jlong lpszfilename, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheEntryW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwexpectedfilesize, (void*)(uintptr_t)lpszfileextension, (void*)(uintptr_t)lpszfilename, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)dwexpectedfilesize;
    (void)lpszfileextension;
    (void)lpszfilename;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetCreateUrlCacheGroup(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheGroup");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)lpreserved;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetDeleteIE3Cache(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hinst, jlong lpszcmd, jint ncmdshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteIE3Cache");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hinst, (void*)(uintptr_t)lpszcmd, (int32_t)ncmdshow);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwnd;
    (void)hinst;
    (void)lpszcmd;
    (void)ncmdshow;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerA(JNIEnv* km_env, jclass km_clazz, jlong name, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheContainerA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (uint32_t)dwoptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)name;
    (void)dwoptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerW(JNIEnv* km_env, jclass km_clazz, jlong name, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheContainerW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (uint32_t)dwoptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)name;
    (void)dwoptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntry(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheEntry");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheEntryA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheEntryW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetDeleteUrlCacheGroup(JNIEnv* km_env, jclass km_clazz, jlong groupid, jint dwflags, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheGroup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)groupid, (uint32_t)dwflags, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)groupid;
    (void)dwflags;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetDeleteWpadCacheForNetworks(JNIEnv* km_env, jclass km_clazz, jint param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteWpadCacheForNetworks");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetDetectAutoProxyUrl(JNIEnv* km_env, jclass km_clazz, jlong pszautoproxyurl, jint cchautoproxyurl, jint dwdetectflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DetectAutoProxyUrl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszautoproxyurl, (uint32_t)cchautoproxyurl, (uint32_t)dwdetectflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszautoproxyurl;
    (void)cchautoproxyurl;
    (void)dwdetectflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetDoConnectoidsExist(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DoConnectoidsExist");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetExportCookieFileA(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jint fappend) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExportCookieFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfilename, (int32_t)fappend);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szfilename;
    (void)fappend;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetExportCookieFileW(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jint fappend) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExportCookieFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfilename, (int32_t)fappend);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szfilename;
    (void)fappend;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindCloseUrlCache(JNIEnv* km_env, jclass km_clazz, jlong henumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindCloseUrlCache");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)henumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerA(JNIEnv* km_env, jclass km_clazz, jlong pdwmodified, jlong lpcontainerinfo, jlong lpcbcontainerinfo, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheContainerA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdwmodified, (void*)(uintptr_t)lpcontainerinfo, (void*)(uintptr_t)lpcbcontainerinfo, (uint32_t)dwoptions);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pdwmodified;
    (void)lpcontainerinfo;
    (void)lpcbcontainerinfo;
    (void)dwoptions;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerW(JNIEnv* km_env, jclass km_clazz, jlong pdwmodified, jlong lpcontainerinfo, jlong lpcbcontainerinfo, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheContainerW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdwmodified, (void*)(uintptr_t)lpcontainerinfo, (void*)(uintptr_t)lpcbcontainerinfo, (uint32_t)dwoptions);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pdwmodified;
    (void)lpcontainerinfo;
    (void)lpcbcontainerinfo;
    (void)dwoptions;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlsearchpattern, jlong lpfirstcacheentryinfo, jlong lpcbcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheEntryA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlsearchpattern, (void*)(uintptr_t)lpfirstcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszurlsearchpattern;
    (void)lpfirstcacheentryinfo;
    (void)lpcbcacheentryinfo;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlsearchpattern, jint dwflags, jint dwfilter, jlong groupid, jlong lpfirstcacheentryinfo, jlong lpcbcacheentryinfo, jlong lpgroupattributes, jlong lpcbgroupattributes, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheEntryExA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlsearchpattern, (uint32_t)dwflags, (uint32_t)dwfilter, (int64_t)groupid, (void*)(uintptr_t)lpfirstcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (void*)(uintptr_t)lpgroupattributes, (void*)(uintptr_t)lpcbgroupattributes, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszurlsearchpattern;
    (void)dwflags;
    (void)dwfilter;
    (void)groupid;
    (void)lpfirstcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpgroupattributes;
    (void)lpcbgroupattributes;
    (void)lpreserved;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlsearchpattern, jint dwflags, jint dwfilter, jlong groupid, jlong lpfirstcacheentryinfo, jlong lpcbcacheentryinfo, jlong lpgroupattributes, jlong lpcbgroupattributes, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheEntryExW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlsearchpattern, (uint32_t)dwflags, (uint32_t)dwfilter, (int64_t)groupid, (void*)(uintptr_t)lpfirstcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (void*)(uintptr_t)lpgroupattributes, (void*)(uintptr_t)lpcbgroupattributes, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszurlsearchpattern;
    (void)dwflags;
    (void)dwfilter;
    (void)groupid;
    (void)lpfirstcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpgroupattributes;
    (void)lpcbgroupattributes;
    (void)lpreserved;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlsearchpattern, jlong lpfirstcacheentryinfo, jlong lpcbcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheEntryW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlsearchpattern, (void*)(uintptr_t)lpfirstcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszurlsearchpattern;
    (void)lpfirstcacheentryinfo;
    (void)lpcbcacheentryinfo;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheGroup(JNIEnv* km_env, jclass km_clazz, jint dwflags, jint dwfilter, jlong lpsearchcondition, jint dwsearchcondition, jlong lpgroupid, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheGroup");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (uint32_t)dwfilter, (void*)(uintptr_t)lpsearchcondition, (uint32_t)dwsearchcondition, (void*)(uintptr_t)lpgroupid, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwflags;
    (void)dwfilter;
    (void)lpsearchcondition;
    (void)dwsearchcondition;
    (void)lpgroupid;
    (void)lpreserved;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerA(JNIEnv* km_env, jclass km_clazz, jlong henumhandle, jlong lpcontainerinfo, jlong lpcbcontainerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheContainerA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)henumhandle, (void*)(uintptr_t)lpcontainerinfo, (void*)(uintptr_t)lpcbcontainerinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henumhandle;
    (void)lpcontainerinfo;
    (void)lpcbcontainerinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerW(JNIEnv* km_env, jclass km_clazz, jlong henumhandle, jlong lpcontainerinfo, jlong lpcbcontainerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheContainerW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)henumhandle, (void*)(uintptr_t)lpcontainerinfo, (void*)(uintptr_t)lpcbcontainerinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henumhandle;
    (void)lpcontainerinfo;
    (void)lpcbcontainerinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryA(JNIEnv* km_env, jclass km_clazz, jlong henumhandle, jlong lpnextcacheentryinfo, jlong lpcbcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheEntryA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)henumhandle, (void*)(uintptr_t)lpnextcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henumhandle;
    (void)lpnextcacheentryinfo;
    (void)lpcbcacheentryinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExA(JNIEnv* km_env, jclass km_clazz, jlong henumhandle, jlong lpnextcacheentryinfo, jlong lpcbcacheentryinfo, jlong lpgroupattributes, jlong lpcbgroupattributes, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheEntryExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)henumhandle, (void*)(uintptr_t)lpnextcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (void*)(uintptr_t)lpgroupattributes, (void*)(uintptr_t)lpcbgroupattributes, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henumhandle;
    (void)lpnextcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpgroupattributes;
    (void)lpcbgroupattributes;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExW(JNIEnv* km_env, jclass km_clazz, jlong henumhandle, jlong lpnextcacheentryinfo, jlong lpcbcacheentryinfo, jlong lpgroupattributes, jlong lpcbgroupattributes, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheEntryExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)henumhandle, (void*)(uintptr_t)lpnextcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (void*)(uintptr_t)lpgroupattributes, (void*)(uintptr_t)lpcbgroupattributes, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henumhandle;
    (void)lpnextcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpgroupattributes;
    (void)lpcbgroupattributes;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryW(JNIEnv* km_env, jclass km_clazz, jlong henumhandle, jlong lpnextcacheentryinfo, jlong lpcbcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheEntryW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)henumhandle, (void*)(uintptr_t)lpnextcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henumhandle;
    (void)lpnextcacheentryinfo;
    (void)lpcbcacheentryinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindNextUrlCacheGroup(JNIEnv* km_env, jclass km_clazz, jlong hfind, jlong lpgroupid, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheGroup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfind, (void*)(uintptr_t)lpgroupid, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfind;
    (void)lpgroupid;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFindP3PPolicySymbol(JNIEnv* km_env, jclass km_clazz, jlong pszsymbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindP3PPolicySymbol");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszsymbol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszsymbol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceA(JNIEnv* km_env, jclass km_clazz, jlong lpszcachepath, jint dwsize, jint dwfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeUrlCacheSpaceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszcachepath, (uint32_t)dwsize, (uint32_t)dwfilter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszcachepath;
    (void)dwsize;
    (void)dwfilter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceW(JNIEnv* km_env, jclass km_clazz, jlong lpszcachepath, jint dwsize, jint dwfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeUrlCacheSpaceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszcachepath, (uint32_t)dwsize, (uint32_t)dwfilter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszcachepath;
    (void)dwsize;
    (void)dwfilter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpCommandA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jint fexpectresponse, jint dwflags, jlong lpszcommand, jlong dwcontext, jlong phftpcommand) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpCommandA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (int32_t)fexpectresponse, (uint32_t)dwflags, (void*)(uintptr_t)lpszcommand, (uint64_t)dwcontext, (void*)(uintptr_t)phftpcommand);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)fexpectresponse;
    (void)dwflags;
    (void)lpszcommand;
    (void)dwcontext;
    (void)phftpcommand;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpCommandW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jint fexpectresponse, jint dwflags, jlong lpszcommand, jlong dwcontext, jlong phftpcommand) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpCommandW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (int32_t)fexpectresponse, (uint32_t)dwflags, (void*)(uintptr_t)lpszcommand, (uint64_t)dwcontext, (void*)(uintptr_t)phftpcommand);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)fexpectresponse;
    (void)dwflags;
    (void)lpszcommand;
    (void)dwcontext;
    (void)phftpcommand;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpCreateDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpCreateDirectoryA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszdirectory);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszdirectory;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpCreateDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpCreateDirectoryW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszdirectory);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszdirectory;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpDeleteFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpDeleteFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpDeleteFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpDeleteFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpFindFirstFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszsearchfile, jlong lpfindfiledata, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpFindFirstFileA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszsearchfile, (void*)(uintptr_t)lpfindfiledata, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hconnect;
    (void)lpszsearchfile;
    (void)lpfindfiledata;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpFindFirstFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszsearchfile, jlong lpfindfiledata, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpFindFirstFileW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszsearchfile, (void*)(uintptr_t)lpfindfiledata, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hconnect;
    (void)lpszsearchfile;
    (void)lpfindfiledata;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszcurrentdirectory, jlong lpdwcurrentdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetCurrentDirectoryA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszcurrentdirectory, (void*)(uintptr_t)lpdwcurrentdirectory);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszcurrentdirectory;
    (void)lpdwcurrentdirectory;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszcurrentdirectory, jlong lpdwcurrentdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetCurrentDirectoryW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszcurrentdirectory, (void*)(uintptr_t)lpdwcurrentdirectory);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszcurrentdirectory;
    (void)lpdwcurrentdirectory;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpGetFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszremotefile, jlong lpsznewfile, jint ffailifexists, jint dwflagsandattributes, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszremotefile, (void*)(uintptr_t)lpsznewfile, (int32_t)ffailifexists, (uint32_t)dwflagsandattributes, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszremotefile;
    (void)lpsznewfile;
    (void)ffailifexists;
    (void)dwflagsandattributes;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpGetFileEx(JNIEnv* km_env, jclass km_clazz, jlong hftpsession, jlong lpszremotefile, jlong lpsznewfile, jint ffailifexists, jint dwflagsandattributes, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hftpsession, (void*)(uintptr_t)lpszremotefile, (void*)(uintptr_t)lpsznewfile, (int32_t)ffailifexists, (uint32_t)dwflagsandattributes, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hftpsession;
    (void)lpszremotefile;
    (void)lpsznewfile;
    (void)ffailifexists;
    (void)dwflagsandattributes;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpGetFileSize(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpdwfilesizehigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetFileSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpdwfilesizehigh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hfile;
    (void)lpdwfilesizehigh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpGetFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszremotefile, jlong lpsznewfile, jint ffailifexists, jint dwflagsandattributes, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszremotefile, (void*)(uintptr_t)lpsznewfile, (int32_t)ffailifexists, (uint32_t)dwflagsandattributes, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszremotefile;
    (void)lpsznewfile;
    (void)ffailifexists;
    (void)dwflagsandattributes;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpOpenFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszfilename, jint dwaccess, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpOpenFileA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszfilename, (uint32_t)dwaccess, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hconnect;
    (void)lpszfilename;
    (void)dwaccess;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpOpenFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszfilename, jint dwaccess, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpOpenFileW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszfilename, (uint32_t)dwaccess, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hconnect;
    (void)lpszfilename;
    (void)dwaccess;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpPutFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocalfile, jlong lpsznewremotefile, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpPutFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocalfile, (void*)(uintptr_t)lpsznewremotefile, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszlocalfile;
    (void)lpsznewremotefile;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpPutFileEx(JNIEnv* km_env, jclass km_clazz, jlong hftpsession, jlong lpszlocalfile, jlong lpsznewremotefile, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpPutFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hftpsession, (void*)(uintptr_t)lpszlocalfile, (void*)(uintptr_t)lpsznewremotefile, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hftpsession;
    (void)lpszlocalfile;
    (void)lpsznewremotefile;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpPutFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocalfile, jlong lpsznewremotefile, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpPutFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocalfile, (void*)(uintptr_t)lpsznewremotefile, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszlocalfile;
    (void)lpsznewremotefile;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpRemoveDirectoryA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszdirectory);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszdirectory;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpRemoveDirectoryW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszdirectory);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszdirectory;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpRenameFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszexisting, jlong lpsznew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpRenameFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszexisting, (void*)(uintptr_t)lpsznew);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszexisting;
    (void)lpsznew;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpRenameFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszexisting, jlong lpsznew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpRenameFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszexisting, (void*)(uintptr_t)lpsznew);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszexisting;
    (void)lpsznew;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpSetCurrentDirectoryA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszdirectory);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszdirectory;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpSetCurrentDirectoryW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszdirectory);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszdirectory;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGetDiskInfoA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pdwclustersize, jlong pdlavail, jlong pdltotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDiskInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pdwclustersize, (void*)(uintptr_t)pdlavail, (void*)(uintptr_t)pdltotal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpath;
    (void)pdwclustersize;
    (void)pdlavail;
    (void)pdltotal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpcacheconfiginfo, jlong lpcbcacheconfiginfo, jint dwfieldcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheConfigInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcacheconfiginfo, (void*)(uintptr_t)lpcbcacheconfiginfo, (uint32_t)dwfieldcontrol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcacheconfiginfo;
    (void)lpcbcacheconfiginfo;
    (void)dwfieldcontrol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpcacheconfiginfo, jlong lpcbcacheconfiginfo, jint dwfieldcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheConfigInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcacheconfiginfo, (void*)(uintptr_t)lpcbcacheconfiginfo, (uint32_t)dwfieldcontrol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcacheconfiginfo;
    (void)lpcbcacheconfiginfo;
    (void)dwfieldcontrol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryBinaryBlob(JNIEnv* km_env, jclass km_clazz, jlong pwszurlname, jlong dwtype, jlong pftexpiretime, jlong pftaccesstime, jlong pftmodifiedtime, jlong ppbblob, jlong pcbblob) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheEntryBinaryBlob");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszurlname, (void*)(uintptr_t)dwtype, (void*)(uintptr_t)pftexpiretime, (void*)(uintptr_t)pftaccesstime, (void*)(uintptr_t)pftmodifiedtime, (void*)(uintptr_t)ppbblob, (void*)(uintptr_t)pcbblob);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pwszurlname;
    (void)dwtype;
    (void)pftexpiretime;
    (void)pftaccesstime;
    (void)pftmodifiedtime;
    (void)ppbblob;
    (void)pcbblob;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheEntryInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo, jlong lpszredirecturl, jlong lpcbredirecturl, jlong lpreserved, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheEntryInfoExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (void*)(uintptr_t)lpszredirecturl, (void*)(uintptr_t)lpcbredirecturl, (void*)(uintptr_t)lpreserved, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpszredirecturl;
    (void)lpcbredirecturl;
    (void)lpreserved;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo, jlong lpszredirecturl, jlong lpcbredirecturl, jlong lpreserved, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheEntryInfoExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (void*)(uintptr_t)lpszredirecturl, (void*)(uintptr_t)lpcbredirecturl, (void*)(uintptr_t)lpreserved, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpszredirecturl;
    (void)lpcbredirecturl;
    (void)lpreserved;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheEntryInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeA(JNIEnv* km_env, jclass km_clazz, jlong gid, jint dwflags, jint dwattributes, jlong lpgroupinfo, jlong lpcbgroupinfo, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheGroupAttributeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)gid, (uint32_t)dwflags, (uint32_t)dwattributes, (void*)(uintptr_t)lpgroupinfo, (void*)(uintptr_t)lpcbgroupinfo, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)gid;
    (void)dwflags;
    (void)dwattributes;
    (void)lpgroupinfo;
    (void)lpcbgroupinfo;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeW(JNIEnv* km_env, jclass km_clazz, jlong gid, jint dwflags, jint dwattributes, jlong lpgroupinfo, jlong lpcbgroupinfo, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheGroupAttributeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)gid, (uint32_t)dwflags, (uint32_t)dwattributes, (void*)(uintptr_t)lpgroupinfo, (void*)(uintptr_t)lpcbgroupinfo, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)gid;
    (void)dwflags;
    (void)dwattributes;
    (void)lpgroupinfo;
    (void)lpcbgroupinfo;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGetUrlCacheHeaderData(JNIEnv* km_env, jclass km_clazz, jint nidx, jlong lpdwdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheHeaderData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)nidx, (void*)(uintptr_t)lpdwdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nidx;
    (void)lpdwdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGopherCreateLocatorA(JNIEnv* km_env, jclass km_clazz, jlong lpszhost, jshort nserverport, jlong lpszdisplaystring, jlong lpszselectorstring, jint dwgophertype, jlong lpszlocator, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherCreateLocatorA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszhost, (uint16_t)nserverport, (void*)(uintptr_t)lpszdisplaystring, (void*)(uintptr_t)lpszselectorstring, (uint32_t)dwgophertype, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpdwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszhost;
    (void)nserverport;
    (void)lpszdisplaystring;
    (void)lpszselectorstring;
    (void)dwgophertype;
    (void)lpszlocator;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGopherCreateLocatorW(JNIEnv* km_env, jclass km_clazz, jlong lpszhost, jshort nserverport, jlong lpszdisplaystring, jlong lpszselectorstring, jint dwgophertype, jlong lpszlocator, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherCreateLocatorW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszhost, (uint16_t)nserverport, (void*)(uintptr_t)lpszdisplaystring, (void*)(uintptr_t)lpszselectorstring, (uint32_t)dwgophertype, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpdwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszhost;
    (void)nserverport;
    (void)lpszdisplaystring;
    (void)lpszselectorstring;
    (void)dwgophertype;
    (void)lpszlocator;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGopherFindFirstFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocator, jlong lpszsearchstring, jlong lpfinddata, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherFindFirstFileA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpszsearchstring, (void*)(uintptr_t)lpfinddata, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszsearchstring;
    (void)lpfinddata;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGopherFindFirstFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocator, jlong lpszsearchstring, jlong lpfinddata, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherFindFirstFileW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpszsearchstring, (void*)(uintptr_t)lpfinddata, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszsearchstring;
    (void)lpfinddata;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGopherGetAttributeA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocator, jlong lpszattributename, jlong lpbuffer, jint dwbufferlength, jlong lpdwcharactersreturned, jlong lpfnenumerator, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherGetAttributeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpszattributename, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbufferlength, (void*)(uintptr_t)lpdwcharactersreturned, (void*)(uintptr_t)lpfnenumerator, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszattributename;
    (void)lpbuffer;
    (void)dwbufferlength;
    (void)lpdwcharactersreturned;
    (void)lpfnenumerator;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGopherGetAttributeW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocator, jlong lpszattributename, jlong lpbuffer, jint dwbufferlength, jlong lpdwcharactersreturned, jlong lpfnenumerator, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherGetAttributeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpszattributename, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbufferlength, (void*)(uintptr_t)lpdwcharactersreturned, (void*)(uintptr_t)lpfnenumerator, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszattributename;
    (void)lpbuffer;
    (void)dwbufferlength;
    (void)lpdwcharactersreturned;
    (void)lpfnenumerator;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeA(JNIEnv* km_env, jclass km_clazz, jlong lpszlocator, jlong lpdwgophertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherGetLocatorTypeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpdwgophertype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszlocator;
    (void)lpdwgophertype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeW(JNIEnv* km_env, jclass km_clazz, jlong lpszlocator, jlong lpdwgophertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherGetLocatorTypeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpdwgophertype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszlocator;
    (void)lpdwgophertype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGopherOpenFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocator, jlong lpszview, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherOpenFileA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpszview, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszview;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetGopherOpenFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocator, jlong lpszview, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherOpenFileW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpszview, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszview;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersA(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpszheaders, jint dwheaderslength, jint dwmodifiers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpAddRequestHeadersA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpszheaders, (uint32_t)dwheaderslength, (uint32_t)dwmodifiers);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)dwmodifiers;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersW(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpszheaders, jint dwheaderslength, jint dwmodifiers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpAddRequestHeadersW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpszheaders, (uint32_t)dwheaderslength, (uint32_t)dwmodifiers);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)dwmodifiers;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcompliancetoken, jlong lpffound, jlong hwnd, jlong lpvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCheckDavComplianceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcompliancetoken, (void*)(uintptr_t)lpffound, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)lpszcompliancetoken;
    (void)lpffound;
    (void)hwnd;
    (void)lpvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcompliancetoken, jlong lpffound, jlong hwnd, jlong lpvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCheckDavComplianceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcompliancetoken, (void*)(uintptr_t)lpffound, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)lpszcompliancetoken;
    (void)lpffound;
    (void)hwnd;
    (void)lpvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpCloseDependencyHandle(JNIEnv* km_env, jclass km_clazz, jlong hdependencyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCloseDependencyHandle");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hdependencyhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hdependencyhandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpDuplicateDependencyHandle(JNIEnv* km_env, jclass km_clazz, jlong hdependencyhandle, jlong phduplicateddependencyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpDuplicateDependencyHandle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdependencyhandle, (void*)(uintptr_t)phduplicateddependencyhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdependencyhandle;
    (void)phduplicateddependencyhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpEndRequestA(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpbuffersout, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpEndRequestA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpbuffersout, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrequest;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpEndRequestW(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpbuffersout, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpEndRequestW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpbuffersout, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrequest;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpGetServerCredentials(JNIEnv* km_env, jclass km_clazz, jlong pwszurl, jlong ppwszusername, jlong ppwszpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpGetServerCredentials");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszurl, (void*)(uintptr_t)ppwszusername, (void*)(uintptr_t)ppwszpassword);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pwszurl;
    (void)ppwszusername;
    (void)ppwszpassword;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpIndicatePageLoadComplete(JNIEnv* km_env, jclass km_clazz, jlong hdependencyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpIndicatePageLoadComplete");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdependencyhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdependencyhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpIsHostHstsEnabled(JNIEnv* km_env, jclass km_clazz, jlong pcwszurl, jlong pfishsts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpIsHostHstsEnabled");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pfishsts);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pcwszurl;
    (void)pfishsts;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpOpenDependencyHandle(JNIEnv* km_env, jclass km_clazz, jlong hrequesthandle, jint fbackground, jlong phdependencyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpOpenDependencyHandle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrequesthandle, (int32_t)fbackground, (void*)(uintptr_t)phdependencyhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrequesthandle;
    (void)fbackground;
    (void)phdependencyhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpOpenRequestA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszverb, jlong lpszobjectname, jlong lpszversion, jlong lpszreferrer, jlong lplpszaccepttypes, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpOpenRequestA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszverb, (void*)(uintptr_t)lpszobjectname, (void*)(uintptr_t)lpszversion, (void*)(uintptr_t)lpszreferrer, (void*)(uintptr_t)lplpszaccepttypes, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hconnect;
    (void)lpszverb;
    (void)lpszobjectname;
    (void)lpszversion;
    (void)lpszreferrer;
    (void)lplpszaccepttypes;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpOpenRequestW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszverb, jlong lpszobjectname, jlong lpszversion, jlong lpszreferrer, jlong lplpszaccepttypes, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpOpenRequestW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszverb, (void*)(uintptr_t)lpszobjectname, (void*)(uintptr_t)lpszversion, (void*)(uintptr_t)lpszreferrer, (void*)(uintptr_t)lplpszaccepttypes, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hconnect;
    (void)lpszverb;
    (void)lpszobjectname;
    (void)lpszversion;
    (void)lpszreferrer;
    (void)lplpszaccepttypes;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpPushClose(JNIEnv* km_env, jclass km_clazz, jlong hwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpPushClose");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hwait);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hwait;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpPushEnable(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong ptransportsetting, jlong phwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpPushEnable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)ptransportsetting, (void*)(uintptr_t)phwait);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrequest;
    (void)ptransportsetting;
    (void)phwait;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpPushWait(JNIEnv* km_env, jclass km_clazz, jlong hwait, jint etype, jlong pnotificationstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpPushWait");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwait, (int32_t)etype, (void*)(uintptr_t)pnotificationstatus);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwait;
    (void)etype;
    (void)pnotificationstatus;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpQueryInfoA(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jint dwinfolevel, jlong lpbuffer, jlong lpdwbufferlength, jlong lpdwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpQueryInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrequest, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpdwindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrequest;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    (void)lpdwindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpQueryInfoW(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jint dwinfolevel, jlong lpbuffer, jlong lpdwbufferlength, jlong lpdwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpQueryInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrequest, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpdwindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrequest;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    (void)lpdwindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpSendRequestA(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpszheaders, jint dwheaderslength, jlong lpoptional, jint dwoptionallength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendRequestA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpszheaders, (uint32_t)dwheaderslength, (void*)(uintptr_t)lpoptional, (uint32_t)dwoptionallength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)lpoptional;
    (void)dwoptionallength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpSendRequestExA(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpbuffersin, jlong lpbuffersout, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendRequestExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpbuffersin, (void*)(uintptr_t)lpbuffersout, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrequest;
    (void)lpbuffersin;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpSendRequestExW(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpbuffersin, jlong lpbuffersout, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendRequestExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpbuffersin, (void*)(uintptr_t)lpbuffersout, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrequest;
    (void)lpbuffersin;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpSendRequestW(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpszheaders, jint dwheaderslength, jlong lpoptional, jint dwoptionallength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendRequestW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpszheaders, (uint32_t)dwheaderslength, (void*)(uintptr_t)lpoptional, (uint32_t)dwoptionallength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)lpoptional;
    (void)dwoptionallength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpWebSocketClose(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jshort usstatus, jlong pvreason, jint dwreasonlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwebsocket, (uint16_t)usstatus, (void*)(uintptr_t)pvreason, (uint32_t)dwreasonlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwebsocket;
    (void)usstatus;
    (void)pvreason;
    (void)dwreasonlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpWebSocketCompleteUpgrade(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketCompleteUpgrade");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrequest, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hrequest;
    (void)dwcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpWebSocketQueryCloseStatus(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jlong pusstatus, jlong pvreason, jint dwreasonlength, jlong pdwreasonlengthconsumed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketQueryCloseStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwebsocket, (void*)(uintptr_t)pusstatus, (void*)(uintptr_t)pvreason, (uint32_t)dwreasonlength, (void*)(uintptr_t)pdwreasonlengthconsumed);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwebsocket;
    (void)pusstatus;
    (void)pvreason;
    (void)dwreasonlength;
    (void)pdwreasonlengthconsumed;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpWebSocketReceive(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jlong pvbuffer, jint dwbufferlength, jlong pdwbytesread, jlong pbuffertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketReceive");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwebsocket, (void*)(uintptr_t)pvbuffer, (uint32_t)dwbufferlength, (void*)(uintptr_t)pdwbytesread, (void*)(uintptr_t)pbuffertype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwebsocket;
    (void)pvbuffer;
    (void)dwbufferlength;
    (void)pdwbytesread;
    (void)pbuffertype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpWebSocketSend(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jint buffertype, jlong pvbuffer, jint dwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketSend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwebsocket, (int32_t)buffertype, (void*)(uintptr_t)pvbuffer, (uint32_t)dwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwebsocket;
    (void)buffertype;
    (void)pvbuffer;
    (void)dwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetHttpWebSocketShutdown(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jshort usstatus, jlong pvreason, jint dwreasonlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketShutdown");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwebsocket, (uint16_t)usstatus, (void*)(uintptr_t)pvreason, (uint32_t)dwreasonlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwebsocket;
    (void)usstatus;
    (void)pvreason;
    (void)dwreasonlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetImportCookieFileA(JNIEnv* km_env, jclass km_clazz, jlong szfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportCookieFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetImportCookieFileW(JNIEnv* km_env, jclass km_clazz, jlong szfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportCookieFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetIncrementUrlCacheHeaderData(JNIEnv* km_env, jclass km_clazz, jint nidx, jlong lpdwdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IncrementUrlCacheHeaderData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)nidx, (void*)(uintptr_t)lpdwdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nidx;
    (void)lpdwdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternalInternetGetCookie(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiedata, jlong lpdwdatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternalInternetGetCookie");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiedata, (void*)(uintptr_t)lpdwdatasize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszurl;
    (void)lpszcookiedata;
    (void)lpdwdatasize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetAlgIdToStringA(JNIEnv* km_env, jclass km_clazz, jint ai, jlong lpstr, jlong lpdwstrlength, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetAlgIdToStringA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ai, (void*)(uintptr_t)lpstr, (void*)(uintptr_t)lpdwstrlength, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ai;
    (void)lpstr;
    (void)lpdwstrlength;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetAlgIdToStringW(JNIEnv* km_env, jclass km_clazz, jint ai, jlong lpstr, jlong lpdwstrlength, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetAlgIdToStringW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ai, (void*)(uintptr_t)lpstr, (void*)(uintptr_t)lpdwstrlength, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ai;
    (void)lpstr;
    (void)lpdwstrlength;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetAttemptConnect(JNIEnv* km_env, jclass km_clazz, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetAttemptConnect");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwreserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetAutodial(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong hwndparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetAutodial");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)hwndparent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)hwndparent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetAutodialHangup(JNIEnv* km_env, jclass km_clazz, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetAutodialHangup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszbuffer, jlong lpdwbufferlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCanonicalizeUrlA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszbuffer, (void*)(uintptr_t)lpdwbufferlength, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszbuffer, jlong lpdwbufferlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCanonicalizeUrlW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszbuffer, (void*)(uintptr_t)lpdwbufferlength, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetCheckConnectionA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jint dwflags, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCheckConnectionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (uint32_t)dwflags, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)dwflags;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetCheckConnectionW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jint dwflags, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCheckConnectionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (uint32_t)dwflags, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)dwflags;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetClearAllPerSiteCookieDecisions(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetClearAllPerSiteCookieDecisions");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong hinternet) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCloseHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinternet;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetCombineUrlA(JNIEnv* km_env, jclass km_clazz, jlong lpszbaseurl, jlong lpszrelativeurl, jlong lpszbuffer, jlong lpdwbufferlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCombineUrlA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszbaseurl, (void*)(uintptr_t)lpszrelativeurl, (void*)(uintptr_t)lpszbuffer, (void*)(uintptr_t)lpdwbufferlength, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszbaseurl;
    (void)lpszrelativeurl;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetCombineUrlW(JNIEnv* km_env, jclass km_clazz, jlong lpszbaseurl, jlong lpszrelativeurl, jlong lpszbuffer, jlong lpdwbufferlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCombineUrlW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszbaseurl, (void*)(uintptr_t)lpszrelativeurl, (void*)(uintptr_t)lpszbuffer, (void*)(uintptr_t)lpdwbufferlength, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszbaseurl;
    (void)lpszrelativeurl;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossing(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong szurlprev, jlong szurlnew, jint bpost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConfirmZoneCrossing");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)szurlprev, (void*)(uintptr_t)szurlnew, (int32_t)bpost);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwnd;
    (void)szurlprev;
    (void)szurlnew;
    (void)bpost;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong szurlprev, jlong szurlnew, jint bpost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConfirmZoneCrossingA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)szurlprev, (void*)(uintptr_t)szurlnew, (int32_t)bpost);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwnd;
    (void)szurlprev;
    (void)szurlnew;
    (void)bpost;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong szurlprev, jlong szurlnew, jint bpost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConfirmZoneCrossingW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)szurlprev, (void*)(uintptr_t)szurlnew, (int32_t)bpost);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwnd;
    (void)szurlprev;
    (void)szurlnew;
    (void)bpost;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetConnectA(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lpszservername, jshort nserverport, jlong lpszusername, jlong lpszpassword, jint dwservice, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConnectA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lpszservername, (uint16_t)nserverport, (void*)(uintptr_t)lpszusername, (void*)(uintptr_t)lpszpassword, (uint32_t)dwservice, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hinternet;
    (void)lpszservername;
    (void)nserverport;
    (void)lpszusername;
    (void)lpszpassword;
    (void)dwservice;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetConnectW(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lpszservername, jshort nserverport, jlong lpszusername, jlong lpszpassword, jint dwservice, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConnectW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lpszservername, (uint16_t)nserverport, (void*)(uintptr_t)lpszusername, (void*)(uintptr_t)lpszpassword, (uint32_t)dwservice, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hinternet;
    (void)lpszservername;
    (void)nserverport;
    (void)lpszusername;
    (void)lpszpassword;
    (void)dwservice;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetConvertUrlFromWireToWideChar(JNIEnv* km_env, jclass km_clazz, jlong pcszurl, jint cchurl, jlong pcwszbaseurl, jint dwcodepagehost, jint dwcodepagepath, jint fencodepathextra, jint dwcodepageextra, jlong ppwszconvertedurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConvertUrlFromWireToWideChar");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcszurl, (uint32_t)cchurl, (void*)(uintptr_t)pcwszbaseurl, (uint32_t)dwcodepagehost, (uint32_t)dwcodepagepath, (int32_t)fencodepathextra, (uint32_t)dwcodepageextra, (void*)(uintptr_t)ppwszconvertedurl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pcszurl;
    (void)cchurl;
    (void)pcwszbaseurl;
    (void)dwcodepagehost;
    (void)dwcodepagepath;
    (void)fencodepathextra;
    (void)dwcodepageextra;
    (void)ppwszconvertedurl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetCrackUrlA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jint dwurllength, jint dwflags, jlong lpurlcomponents) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCrackUrlA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (uint32_t)dwurllength, (uint32_t)dwflags, (void*)(uintptr_t)lpurlcomponents);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)dwurllength;
    (void)dwflags;
    (void)lpurlcomponents;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetCrackUrlW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jint dwurllength, jint dwflags, jlong lpurlcomponents) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCrackUrlW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (uint32_t)dwurllength, (uint32_t)dwflags, (void*)(uintptr_t)lpurlcomponents);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)dwurllength;
    (void)dwflags;
    (void)lpurlcomponents;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetCreateUrlA(JNIEnv* km_env, jclass km_clazz, jlong lpurlcomponents, jint dwflags, jlong lpszurl, jlong lpdwurllength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCreateUrlA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpurlcomponents, (uint32_t)dwflags, (void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpdwurllength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpurlcomponents;
    (void)dwflags;
    (void)lpszurl;
    (void)lpdwurllength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetCreateUrlW(JNIEnv* km_env, jclass km_clazz, jlong lpurlcomponents, jint dwflags, jlong lpszurl, jlong lpdwurllength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCreateUrlW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpurlcomponents, (uint32_t)dwflags, (void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpdwurllength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpurlcomponents;
    (void)dwflags;
    (void)lpszurl;
    (void)lpdwurllength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetDial(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong lpszconnectoid, jint dwflags, jlong lpdwconnection, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetDial");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpszconnectoid, (uint32_t)dwflags, (void*)(uintptr_t)lpdwconnection, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)lpszconnectoid;
    (void)dwflags;
    (void)lpdwconnection;
    (void)dwreserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetDialA(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong lpszconnectoid, jint dwflags, jlong lpdwconnection, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetDialA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpszconnectoid, (uint32_t)dwflags, (void*)(uintptr_t)lpdwconnection, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)lpszconnectoid;
    (void)dwflags;
    (void)lpdwconnection;
    (void)dwreserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetDialW(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong lpszconnectoid, jint dwflags, jlong lpdwconnection, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetDialW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpszconnectoid, (uint32_t)dwflags, (void*)(uintptr_t)lpdwconnection, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)lpszconnectoid;
    (void)dwflags;
    (void)lpdwconnection;
    (void)dwreserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionA(JNIEnv* km_env, jclass km_clazz, jlong pszsitename, jlong pcsitenamesize, jlong pdwdecision, jint dwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetEnumPerSiteCookieDecisionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszsitename, (void*)(uintptr_t)pcsitenamesize, (void*)(uintptr_t)pdwdecision, (uint32_t)dwindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszsitename;
    (void)pcsitenamesize;
    (void)pdwdecision;
    (void)dwindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionW(JNIEnv* km_env, jclass km_clazz, jlong pszsitename, jlong pcsitenamesize, jlong pdwdecision, jint dwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetEnumPerSiteCookieDecisionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszsitename, (void*)(uintptr_t)pcsitenamesize, (void*)(uintptr_t)pdwdecision, (uint32_t)dwindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszsitename;
    (void)pcsitenamesize;
    (void)pdwdecision;
    (void)dwindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetErrorDlg(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hrequest, jint dwerror, jint dwflags, jlong lppvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetErrorDlg");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hrequest, (uint32_t)dwerror, (uint32_t)dwflags, (void*)(uintptr_t)lppvdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwnd;
    (void)hrequest;
    (void)dwerror;
    (void)dwflags;
    (void)lppvdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetFindNextFileA(JNIEnv* km_env, jclass km_clazz, jlong hfind, jlong lpvfinddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetFindNextFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfind, (void*)(uintptr_t)lpvfinddata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfind;
    (void)lpvfinddata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetFindNextFileW(JNIEnv* km_env, jclass km_clazz, jlong hfind, jlong lpvfinddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetFindNextFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfind, (void*)(uintptr_t)lpvfinddata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfind;
    (void)lpvfinddata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetFortezzaCommand(JNIEnv* km_env, jclass km_clazz, jint dwcommand, jlong hwnd, jlong dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetFortezzaCommand");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcommand, (void*)(uintptr_t)hwnd, (uint64_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcommand;
    (void)hwnd;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetFreeCookies(JNIEnv* km_env, jclass km_clazz, jlong pcookies, jint dwcookiecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetFreeCookies");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pcookies, (uint32_t)dwcookiecount);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pcookies;
    (void)dwcookiecount;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetFreeProxyInfoList(JNIEnv* km_env, jclass km_clazz, jlong pproxyinfolist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetFreeProxyInfoList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pproxyinfolist);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pproxyinfolist;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetConnectedState(JNIEnv* km_env, jclass km_clazz, jlong lpdwflags, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetConnectedState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdwflags, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdwflags;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateEx(JNIEnv* km_env, jclass km_clazz, jlong lpdwflags, jlong lpszconnectionname, jint dwnamelen, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetConnectedStateEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdwflags, (void*)(uintptr_t)lpszconnectionname, (uint32_t)dwnamelen, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdwflags;
    (void)lpszconnectionname;
    (void)dwnamelen;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExA(JNIEnv* km_env, jclass km_clazz, jlong lpdwflags, jlong lpszconnectionname, jint cchnamelen, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetConnectedStateExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdwflags, (void*)(uintptr_t)lpszconnectionname, (uint32_t)cchnamelen, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdwflags;
    (void)lpszconnectionname;
    (void)cchnamelen;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExW(JNIEnv* km_env, jclass km_clazz, jlong lpdwflags, jlong lpszconnectionname, jint cchnamelen, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetConnectedStateExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdwflags, (void*)(uintptr_t)lpszconnectionname, (uint32_t)cchnamelen, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdwflags;
    (void)lpszconnectionname;
    (void)cchnamelen;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetCookieA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata, jlong lpdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetCookieA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata, (void*)(uintptr_t)lpdwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)lpdwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetCookieEx2(JNIEnv* km_env, jclass km_clazz, jlong pcwszurl, jlong pcwszcookiename, jint dwflags, jlong ppcookies, jlong pdwcookiecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetCookieEx2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pcwszcookiename, (uint32_t)dwflags, (void*)(uintptr_t)ppcookies, (void*)(uintptr_t)pdwcookiecount);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pcwszurl;
    (void)pcwszcookiename;
    (void)dwflags;
    (void)ppcookies;
    (void)pdwcookiecount;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetCookieExA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata, jlong lpdwsize, jint dwflags, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetCookieExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata, (void*)(uintptr_t)lpdwsize, (uint32_t)dwflags, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)lpdwsize;
    (void)dwflags;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetCookieExW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata, jlong lpdwsize, jint dwflags, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetCookieExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata, (void*)(uintptr_t)lpdwsize, (uint32_t)dwflags, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)lpdwsize;
    (void)dwflags;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetCookieW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata, jlong lpdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetCookieW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata, (void*)(uintptr_t)lpdwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)lpdwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpdwerror, jlong lpszbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetLastResponseInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdwerror, (void*)(uintptr_t)lpszbuffer, (void*)(uintptr_t)lpdwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdwerror;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpdwerror, jlong lpszbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetLastResponseInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdwerror, (void*)(uintptr_t)lpszbuffer, (void*)(uintptr_t)lpdwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdwerror;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionA(JNIEnv* km_env, jclass km_clazz, jlong pchhostname, jlong presult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetPerSiteCookieDecisionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pchhostname, (void*)(uintptr_t)presult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pchhostname;
    (void)presult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionW(JNIEnv* km_env, jclass km_clazz, jlong pchhostname, jlong presult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetPerSiteCookieDecisionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pchhostname, (void*)(uintptr_t)presult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pchhostname;
    (void)presult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetProxyForUrl(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong pcwszurl, jlong pproxyinfolist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetProxyForUrl");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pproxyinfolist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hinternet;
    (void)pcwszurl;
    (void)pproxyinfolist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURL(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong ppcertchain, jlong pdwsecureflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetSecurityInfoByURL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)ppcertchain, (void*)(uintptr_t)pdwsecureflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)ppcertchain;
    (void)pdwsecureflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong ppcertchain, jlong pdwsecureflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetSecurityInfoByURLA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)ppcertchain, (void*)(uintptr_t)pdwsecureflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)ppcertchain;
    (void)pdwsecureflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong ppcertchain, jlong pdwsecureflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetSecurityInfoByURLW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)ppcertchain, (void*)(uintptr_t)pdwsecureflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)ppcertchain;
    (void)pdwsecureflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGoOnline(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong hwndparent, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGoOnline");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)hwndparent, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)hwndparent;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGoOnlineA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong hwndparent, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGoOnlineA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)hwndparent, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)hwndparent;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetGoOnlineW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong hwndparent, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGoOnlineW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)hwndparent, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)hwndparent;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetHangUp(JNIEnv* km_env, jclass km_clazz, jlong dwconnection, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetHangUp");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)dwconnection, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwconnection;
    (void)dwreserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetInitializeAutoProxyDll(JNIEnv* km_env, jclass km_clazz, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetInitializeAutoProxyDll");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetLockRequestFile(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lphlockrequestinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetLockRequestFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lphlockrequestinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinternet;
    (void)lphlockrequestinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetOpenA(JNIEnv* km_env, jclass km_clazz, jlong lpszagent, jint dwaccesstype, jlong lpszproxy, jlong lpszproxybypass, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetOpenA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszagent, (uint32_t)dwaccesstype, (void*)(uintptr_t)lpszproxy, (void*)(uintptr_t)lpszproxybypass, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszagent;
    (void)dwaccesstype;
    (void)lpszproxy;
    (void)lpszproxybypass;
    (void)dwflags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetOpenUrlA(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lpszurl, jlong lpszheaders, jint dwheaderslength, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetOpenUrlA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszheaders, (uint32_t)dwheaderslength, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hinternet;
    (void)lpszurl;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetOpenUrlW(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lpszurl, jlong lpszheaders, jint dwheaderslength, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetOpenUrlW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszheaders, (uint32_t)dwheaderslength, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hinternet;
    (void)lpszurl;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetOpenW(JNIEnv* km_env, jclass km_clazz, jlong lpszagent, jint dwaccesstype, jlong lpszproxy, jlong lpszproxybypass, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetOpenW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszagent, (uint32_t)dwaccesstype, (void*)(uintptr_t)lpszproxy, (void*)(uintptr_t)lpszproxybypass, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszagent;
    (void)dwaccesstype;
    (void)lpszproxy;
    (void)lpszproxybypass;
    (void)dwflags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetQueryDataAvailable(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpdwnumberofbytesavailable, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetQueryDataAvailable");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpdwnumberofbytesavailable, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfile;
    (void)lpdwnumberofbytesavailable;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetQueryFortezzaStatus(JNIEnv* km_env, jclass km_clazz, jlong pdwstatus, jlong dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetQueryFortezzaStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdwstatus, (uint64_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdwstatus;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetQueryOptionA(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jint dwoption, jlong lpbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetQueryOptionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet, (uint32_t)dwoption, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetQueryOptionW(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jint dwoption, jlong lpbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetQueryOptionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet, (uint32_t)dwoption, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetReadFile(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffer, jint dwnumberofbytestoread, jlong lpdwnumberofbytesread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetReadFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffer, (uint32_t)dwnumberofbytestoread, (void*)(uintptr_t)lpdwnumberofbytesread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfile;
    (void)lpbuffer;
    (void)dwnumberofbytestoread;
    (void)lpdwnumberofbytesread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetReadFileExA(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffersout, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetReadFileExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffersout, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfile;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetReadFileExW(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffersout, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetReadFileExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffersout, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfile;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringA(JNIEnv* km_env, jclass km_clazz, jint dwprotocol, jlong lpstr, jlong lpdwstrlength, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSecurityProtocolToStringA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwprotocol, (void*)(uintptr_t)lpstr, (void*)(uintptr_t)lpdwstrlength, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwprotocol;
    (void)lpstr;
    (void)lpdwstrlength;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringW(JNIEnv* km_env, jclass km_clazz, jint dwprotocol, jlong lpstr, jlong lpdwstrlength, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSecurityProtocolToStringW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwprotocol, (void*)(uintptr_t)lpstr, (void*)(uintptr_t)lpdwstrlength, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwprotocol;
    (void)lpstr;
    (void)lpdwstrlength;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetCookieA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetCookieA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetCookieEx2(JNIEnv* km_env, jclass km_clazz, jlong pcwszurl, jlong pcookie, jlong pcwszp3ppolicy, jint dwflags, jlong pdwcookiestate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetCookieEx2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pcookie, (void*)(uintptr_t)pcwszp3ppolicy, (uint32_t)dwflags, (void*)(uintptr_t)pdwcookiestate);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pcwszurl;
    (void)pcookie;
    (void)pcwszp3ppolicy;
    (void)dwflags;
    (void)pdwcookiestate;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetCookieExA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata, jint dwflags, jlong dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetCookieExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata, (uint32_t)dwflags, (uint64_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)dwflags;
    (void)dwreserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetCookieExW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata, jint dwflags, jlong dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetCookieExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata, (uint32_t)dwflags, (uint64_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)dwflags;
    (void)dwreserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetCookieW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetCookieW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetDialState(JNIEnv* km_env, jclass km_clazz, jlong lpszconnectoid, jint dwstate, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetDialState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszconnectoid, (uint32_t)dwstate, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszconnectoid;
    (void)dwstate;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetDialStateA(JNIEnv* km_env, jclass km_clazz, jlong lpszconnectoid, jint dwstate, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetDialStateA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszconnectoid, (uint32_t)dwstate, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszconnectoid;
    (void)dwstate;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetDialStateW(JNIEnv* km_env, jclass km_clazz, jlong lpszconnectoid, jint dwstate, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetDialStateW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszconnectoid, (uint32_t)dwstate, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszconnectoid;
    (void)dwstate;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetFilePointer(JNIEnv* km_env, jclass km_clazz, jlong hfile, jint ldistancetomove, jlong lpdistancetomovehigh, jint dwmovemethod, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetFilePointer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (int32_t)ldistancetomove, (void*)(uintptr_t)lpdistancetomovehigh, (uint32_t)dwmovemethod, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hfile;
    (void)ldistancetomove;
    (void)lpdistancetomovehigh;
    (void)dwmovemethod;
    (void)dwcontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetOptionA(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jint dwoption, jlong lpbuffer, jint dwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetOptionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet, (uint32_t)dwoption, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)dwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetOptionExA(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jint dwoption, jlong lpbuffer, jint dwbufferlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetOptionExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet, (uint32_t)dwoption, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbufferlength, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)dwbufferlength;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetOptionExW(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jint dwoption, jlong lpbuffer, jint dwbufferlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetOptionExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet, (uint32_t)dwoption, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbufferlength, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)dwbufferlength;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetOptionW(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jint dwoption, jlong lpbuffer, jint dwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetOptionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet, (uint32_t)dwoption, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)dwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionA(JNIEnv* km_env, jclass km_clazz, jlong pchhostname, jint dwdecision) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetPerSiteCookieDecisionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pchhostname, (uint32_t)dwdecision);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pchhostname;
    (void)dwdecision;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionW(JNIEnv* km_env, jclass km_clazz, jlong pchhostname, jint dwdecision) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetPerSiteCookieDecisionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pchhostname, (uint32_t)dwdecision);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pchhostname;
    (void)dwdecision;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetStatusCallback(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lpfninternetcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetStatusCallback");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lpfninternetcallback);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hinternet;
    (void)lpfninternetcallback;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetStatusCallbackA(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lpfninternetcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetStatusCallbackA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lpfninternetcallback);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hinternet;
    (void)lpfninternetcallback;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetSetStatusCallbackW(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lpfninternetcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetStatusCallbackW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lpfninternetcallback);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hinternet;
    (void)lpfninternetcallback;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURL(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong hwndparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetShowSecurityInfoByURL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)hwndparent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)hwndparent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong hwndparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetShowSecurityInfoByURLA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)hwndparent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)hwndparent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong hwndparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetShowSecurityInfoByURLW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)hwndparent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurl;
    (void)hwndparent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTime(JNIEnv* km_env, jclass km_clazz, jlong pst, jint dwrfc, jlong lpsztime, jint cbtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeFromSystemTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pst, (uint32_t)dwrfc, (void*)(uintptr_t)lpsztime, (uint32_t)cbtime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pst;
    (void)dwrfc;
    (void)lpsztime;
    (void)cbtime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeA(JNIEnv* km_env, jclass km_clazz, jlong pst, jint dwrfc, jlong lpsztime, jint cbtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeFromSystemTimeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pst, (uint32_t)dwrfc, (void*)(uintptr_t)lpsztime, (uint32_t)cbtime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pst;
    (void)dwrfc;
    (void)lpsztime;
    (void)cbtime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeW(JNIEnv* km_env, jclass km_clazz, jlong pst, jint dwrfc, jlong lpsztime, jint cbtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeFromSystemTimeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pst, (uint32_t)dwrfc, (void*)(uintptr_t)lpsztime, (uint32_t)cbtime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pst;
    (void)dwrfc;
    (void)lpsztime;
    (void)cbtime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTime(JNIEnv* km_env, jclass km_clazz, jlong lpsztime, jlong pst, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeToSystemTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsztime, (void*)(uintptr_t)pst, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsztime;
    (void)pst;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeA(JNIEnv* km_env, jclass km_clazz, jlong lpsztime, jlong pst, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeToSystemTimeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsztime, (void*)(uintptr_t)pst, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsztime;
    (void)pst;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeW(JNIEnv* km_env, jclass km_clazz, jlong lpsztime, jlong pst, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeToSystemTimeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsztime, (void*)(uintptr_t)pst, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsztime;
    (void)pst;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetUnlockRequestFile(JNIEnv* km_env, jclass km_clazz, jlong hlockrequestinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetUnlockRequestFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlockrequestinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlockrequestinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetWriteFile(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffer, jint dwnumberofbytestowrite, jlong lpdwnumberofbyteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetWriteFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffer, (uint32_t)dwnumberofbytestowrite, (void*)(uintptr_t)lpdwnumberofbyteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfile;
    (void)lpbuffer;
    (void)dwnumberofbytestowrite;
    (void)lpdwnumberofbyteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetWriteFileExA(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffersin, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetWriteFileExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffersin, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfile;
    (void)lpbuffersin;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetInternetWriteFileExW(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffersin, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetWriteFileExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffersin, (uint32_t)dwflags, (uint64_t)dwcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfile;
    (void)lpbuffersin;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainA(JNIEnv* km_env, jclass km_clazz, jlong pchdomain, jlong pchfulldomain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDomainLegalCookieDomainA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pchdomain, (void*)(uintptr_t)pchfulldomain);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pchdomain;
    (void)pchfulldomain;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainW(JNIEnv* km_env, jclass km_clazz, jlong pchdomain, jlong pchfulldomain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDomainLegalCookieDomainW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pchdomain, (void*)(uintptr_t)pchfulldomain);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pchdomain;
    (void)pchfulldomain;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetIsHostInProxyBypassList(JNIEnv* km_env, jclass km_clazz, jint tscheme, jlong lpszhost, jint cchhost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsHostInProxyBypassList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)tscheme, (void*)(uintptr_t)lpszhost, (uint32_t)cchhost);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tscheme;
    (void)lpszhost;
    (void)cchhost;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetIsProfilesEnabled(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProfilesEnabled");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwflags, jlong pftlastmodified) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsUrlCacheEntryExpiredA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwflags, (void*)(uintptr_t)pftlastmodified);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)dwflags;
    (void)pftlastmodified;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwflags, jlong pftlastmodified) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsUrlCacheEntryExpiredW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwflags, (void*)(uintptr_t)pftlastmodified);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)dwflags;
    (void)pftlastmodified;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetLoadUrlCacheContent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadUrlCacheContent");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetParseX509EncodedCertificateForListBoxEntry(JNIEnv* km_env, jclass km_clazz, jlong lpcert, jint cbcert, jlong lpszlistboxentry, jlong lpdwlistboxentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ParseX509EncodedCertificateForListBoxEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcert, (uint32_t)cbcert, (void*)(uintptr_t)lpszlistboxentry, (void*)(uintptr_t)lpdwlistboxentry);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpcert;
    (void)cbcert;
    (void)lpszlistboxentry;
    (void)lpdwlistboxentry;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetPerformOperationOverUrlCacheA(JNIEnv* km_env, jclass km_clazz, jlong pszurlsearchpattern, jint dwflags, jint dwfilter, jlong groupid, jlong preserved1, jlong pdwreserved2, jlong preserved3, jlong op, jlong poperatordata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerformOperationOverUrlCacheA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszurlsearchpattern, (uint32_t)dwflags, (uint32_t)dwfilter, (int64_t)groupid, (void*)(uintptr_t)preserved1, (void*)(uintptr_t)pdwreserved2, (void*)(uintptr_t)preserved3, (void*)(uintptr_t)op, (void*)(uintptr_t)poperatordata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszurlsearchpattern;
    (void)dwflags;
    (void)dwfilter;
    (void)groupid;
    (void)preserved1;
    (void)pdwreserved2;
    (void)preserved3;
    (void)op;
    (void)poperatordata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetPrivacyGetZonePreferenceW(JNIEnv* km_env, jclass km_clazz, jint dwzone, jint dwtype, jlong pdwtemplate, jlong pszbuffer, jlong pdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivacyGetZonePreferenceW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwzone, (uint32_t)dwtype, (void*)(uintptr_t)pdwtemplate, (void*)(uintptr_t)pszbuffer, (void*)(uintptr_t)pdwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwzone;
    (void)dwtype;
    (void)pdwtemplate;
    (void)pszbuffer;
    (void)pdwbufferlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetPrivacySetZonePreferenceW(JNIEnv* km_env, jclass km_clazz, jint dwzone, jint dwtype, jint dwtemplate, jlong pszpreference) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivacySetZonePreferenceW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwzone, (uint32_t)dwtype, (uint32_t)dwtemplate, (void*)(uintptr_t)pszpreference);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwzone;
    (void)dwtype;
    (void)dwtemplate;
    (void)pszpreference;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetReadGuidsForConnectedNetworks(JNIEnv* km_env, jclass km_clazz, jlong pcnetworks, jlong pppwsznetworkguids, jlong pppbstrnetworknames, jlong pppwszgwmacs, jlong pcgatewaymacs, jlong pdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadGuidsForConnectedNetworks");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcnetworks, (void*)(uintptr_t)pppwsznetworkguids, (void*)(uintptr_t)pppbstrnetworknames, (void*)(uintptr_t)pppwszgwmacs, (void*)(uintptr_t)pcgatewaymacs, (void*)(uintptr_t)pdwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcnetworks;
    (void)pppwsznetworkguids;
    (void)pppbstrnetworknames;
    (void)pppwszgwmacs;
    (void)pcgatewaymacs;
    (void)pdwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStream(JNIEnv* km_env, jclass km_clazz, jlong hurlcachestream, jint dwlocation, jlong lpbuffer, jlong lpdwlen, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadUrlCacheEntryStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hurlcachestream, (uint32_t)dwlocation, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwlen, (uint32_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hurlcachestream;
    (void)dwlocation;
    (void)lpbuffer;
    (void)lpdwlen;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStreamEx(JNIEnv* km_env, jclass km_clazz, jlong hurlcachestream, jlong qwlocation, jlong lpbuffer, jlong lpdwlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadUrlCacheEntryStreamEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hurlcachestream, (uint64_t)qwlocation, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hurlcachestream;
    (void)qwlocation;
    (void)lpbuffer;
    (void)lpdwlen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetRegisterUrlCacheNotification(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint umsg, jlong gid, jint dwopsfilter, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterUrlCacheNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)umsg, (int64_t)gid, (uint32_t)dwopsfilter, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)umsg;
    (void)gid;
    (void)dwopsfilter;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetResumeSuspendedDownload(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jint dwresultcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResumeSuspendedDownload");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrequest, (uint32_t)dwresultcode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrequest;
    (void)dwresultcode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RetrieveUrlCacheEntryFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RetrieveUrlCacheEntryFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo, jint frandomread, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RetrieveUrlCacheEntryStreamA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (int32_t)frandomread, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)frandomread;
    (void)dwreserved;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo, jint frandomread, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RetrieveUrlCacheEntryStreamW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (int32_t)frandomread, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)frandomread;
    (void)dwreserved;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetRunOnceUrlCache(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hinst, jlong lpszcmd, jint ncmdshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RunOnceUrlCache");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hinst, (void*)(uintptr_t)lpszcmd, (int32_t)ncmdshow);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwnd;
    (void)hinst;
    (void)lpszcmd;
    (void)ncmdshow;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpcacheconfiginfo, jint dwfieldcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheConfigInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcacheconfiginfo, (uint32_t)dwfieldcontrol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcacheconfiginfo;
    (void)dwfieldcontrol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpcacheconfiginfo, jint dwfieldcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheConfigInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcacheconfiginfo, (uint32_t)dwfieldcontrol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcacheconfiginfo;
    (void)dwfieldcontrol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroup(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwflags, jlong groupid, jlong pbgroupattributes, jint cbgroupattributes, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheEntryGroup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwflags, (int64_t)groupid, (void*)(uintptr_t)pbgroupattributes, (uint32_t)cbgroupattributes, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)dwflags;
    (void)groupid;
    (void)pbgroupattributes;
    (void)cbgroupattributes;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwflags, jlong groupid, jlong pbgroupattributes, jint cbgroupattributes, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheEntryGroupA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwflags, (int64_t)groupid, (void*)(uintptr_t)pbgroupattributes, (uint32_t)cbgroupattributes, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)dwflags;
    (void)groupid;
    (void)pbgroupattributes;
    (void)cbgroupattributes;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwflags, jlong groupid, jlong pbgroupattributes, jint cbgroupattributes, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheEntryGroupW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwflags, (int64_t)groupid, (void*)(uintptr_t)pbgroupattributes, (uint32_t)cbgroupattributes, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)dwflags;
    (void)groupid;
    (void)pbgroupattributes;
    (void)cbgroupattributes;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jint dwfieldcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheEntryInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (uint32_t)dwfieldcontrol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)dwfieldcontrol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jint dwfieldcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheEntryInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (uint32_t)dwfieldcontrol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)dwfieldcontrol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeA(JNIEnv* km_env, jclass km_clazz, jlong gid, jint dwflags, jint dwattributes, jlong lpgroupinfo, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheGroupAttributeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)gid, (uint32_t)dwflags, (uint32_t)dwattributes, (void*)(uintptr_t)lpgroupinfo, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)gid;
    (void)dwflags;
    (void)dwattributes;
    (void)lpgroupinfo;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeW(JNIEnv* km_env, jclass km_clazz, jlong gid, jint dwflags, jint dwattributes, jlong lpgroupinfo, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheGroupAttributeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)gid, (uint32_t)dwflags, (uint32_t)dwattributes, (void*)(uintptr_t)lpgroupinfo, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)gid;
    (void)dwflags;
    (void)dwattributes;
    (void)lpgroupinfo;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetSetUrlCacheHeaderData(JNIEnv* km_env, jclass km_clazz, jint nidx, jint dwdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheHeaderData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)nidx, (uint32_t)dwdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nidx;
    (void)dwdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetShowClientAuthCerts(JNIEnv* km_env, jclass km_clazz, jlong hwndparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowClientAuthCerts");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetShowSecurityInfo(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong psecurityinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowSecurityInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)psecurityinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)psecurityinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetShowX509EncodedCertificate(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong lpcert, jint cbcert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowX509EncodedCertificate");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpcert, (uint32_t)cbcert);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)lpcert;
    (void)cbcert;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFile(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockUrlCacheEntryFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockUrlCacheEntryFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockUrlCacheEntryFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszurlname;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryStream(JNIEnv* km_env, jclass km_clazz, jlong hurlcachestream, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockUrlCacheEntryStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hurlcachestream, (uint32_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hurlcachestream;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUpdateUrlCacheContentPath(JNIEnv* km_env, jclass km_clazz, jlong sznewpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateUrlCacheContentPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sznewpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sznewpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheCheckEntriesExist(JNIEnv* km_env, jclass km_clazz, jlong rgpwszurls, jint centries, jlong rgfexist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheCheckEntriesExist");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rgpwszurls, (uint32_t)centries, (void*)(uintptr_t)rgfexist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rgpwszurls;
    (void)centries;
    (void)rgfexist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheCloseEntryHandle(JNIEnv* km_env, jclass km_clazz, jlong hentryfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheCloseEntryHandle");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hentryfile);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hentryfile;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheContainerSetEntryMaximumAge(JNIEnv* km_env, jclass km_clazz, jlong pwszprefix, jint dwentrymaxage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheContainerSetEntryMaximumAge");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszprefix, (uint32_t)dwentrymaxage);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pwszprefix;
    (void)dwentrymaxage;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheCreateContainer(JNIEnv* km_env, jclass km_clazz, jlong pwszname, jlong pwszprefix, jlong pwszdirectory, jlong ulllimit, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheCreateContainer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszname, (void*)(uintptr_t)pwszprefix, (void*)(uintptr_t)pwszdirectory, (uint64_t)ulllimit, (uint32_t)dwoptions);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pwszname;
    (void)pwszprefix;
    (void)pwszdirectory;
    (void)ulllimit;
    (void)dwoptions;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheFindFirstEntry(JNIEnv* km_env, jclass km_clazz, jlong pwszprefix, jint dwflags, jint dwfilter, jlong groupid, jlong pcacheentryinfo, jlong phfind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheFindFirstEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszprefix, (uint32_t)dwflags, (uint32_t)dwfilter, (int64_t)groupid, (void*)(uintptr_t)pcacheentryinfo, (void*)(uintptr_t)phfind);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pwszprefix;
    (void)dwflags;
    (void)dwfilter;
    (void)groupid;
    (void)pcacheentryinfo;
    (void)phfind;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheFindNextEntry(JNIEnv* km_env, jclass km_clazz, jlong hfind, jlong pcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheFindNextEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfind, (void*)(uintptr_t)pcacheentryinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hfind;
    (void)pcacheentryinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheFreeEntryInfo(JNIEnv* km_env, jclass km_clazz, jlong pcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheFreeEntryInfo");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pcacheentryinfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pcacheentryinfo;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheFreeGlobalSpace(JNIEnv* km_env, jclass km_clazz, jlong ulltargetsize, jint dwfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheFreeGlobalSpace");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)ulltargetsize, (uint32_t)dwfilter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulltargetsize;
    (void)dwfilter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheGetContentPaths(JNIEnv* km_env, jclass km_clazz, jlong pppwszdirectories, jlong pcdirectories) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheGetContentPaths");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pppwszdirectories, (void*)(uintptr_t)pcdirectories);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pppwszdirectories;
    (void)pcdirectories;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheGetEntryInfo(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pcwszurl, jlong pcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheGetEntryInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pcacheentryinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)happcache;
    (void)pcwszurl;
    (void)pcacheentryinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalCacheSize(JNIEnv* km_env, jclass km_clazz, jint dwfilter, jlong pullsize, jlong pulllimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheGetGlobalCacheSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwfilter, (void*)(uintptr_t)pullsize, (void*)(uintptr_t)pulllimit);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwfilter;
    (void)pullsize;
    (void)pulllimit;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalLimit(JNIEnv* km_env, jclass km_clazz, jint limittype, jlong pulllimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheGetGlobalLimit");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)limittype, (void*)(uintptr_t)pulllimit);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)limittype;
    (void)pulllimit;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheReadEntryStream(JNIEnv* km_env, jclass km_clazz, jlong hurlcachestream, jlong ulllocation, jlong pbuffer, jint dwbufferlen, jlong pdwbufferlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheReadEntryStream");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hurlcachestream, (uint64_t)ulllocation, (void*)(uintptr_t)pbuffer, (uint32_t)dwbufferlen, (void*)(uintptr_t)pdwbufferlen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hurlcachestream;
    (void)ulllocation;
    (void)pbuffer;
    (void)dwbufferlen;
    (void)pdwbufferlen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheReloadSettings(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheReloadSettings");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryFile(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pcwszurl, jlong pcacheentryinfo, jlong phentryfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheRetrieveEntryFile");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pcacheentryinfo, (void*)(uintptr_t)phentryfile);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)happcache;
    (void)pcwszurl;
    (void)pcacheentryinfo;
    (void)phentryfile;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryStream(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pcwszurl, jint frandomread, jlong pcacheentryinfo, jlong phentrystream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheRetrieveEntryStream");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pcwszurl, (int32_t)frandomread, (void*)(uintptr_t)pcacheentryinfo, (void*)(uintptr_t)phentrystream);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)happcache;
    (void)pcwszurl;
    (void)frandomread;
    (void)pcacheentryinfo;
    (void)phentrystream;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheServer(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheServer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheSetGlobalLimit(JNIEnv* km_env, jclass km_clazz, jint limittype, jlong ulllimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheSetGlobalLimit");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)limittype, (uint64_t)ulllimit);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)limittype;
    (void)ulllimit;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssysWindowsWin32NetworkingWininetUrlCacheUpdateEntryExtraData(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pcwszurl, jlong pbextradata, jint cbextradata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheUpdateEntryExtraData");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pbextradata, (uint32_t)cbextradata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)happcache;
    (void)pcwszurl;
    (void)pbextradata;
    (void)cbextradata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

