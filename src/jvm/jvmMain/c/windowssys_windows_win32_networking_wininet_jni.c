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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheCheckManifest(JNIEnv* km_env, jclass km_clazz, jlong pwszmasterurl, jlong pwszmanifesturl, jlong pbmanifestdata, jint dwmanifestdatasize, jlong pbmanifestresponseheaders, jint dwmanifestresponseheaderssize, jlong pestate, jlong phnewappcache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheCheckManifest");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszmasterurl, (void*)(uintptr_t)pwszmanifesturl, (void*)(uintptr_t)pbmanifestdata, (uint32_t)dwmanifestdatasize, (void*)(uintptr_t)pbmanifestresponseheaders, (uint32_t)dwmanifestresponseheaderssize, (void*)(uintptr_t)pestate, (void*)(uintptr_t)phnewappcache) : 0;
#else
    (void)pwszmasterurl;
    (void)pwszmanifesturl;
    (void)pbmanifestdata;
    (void)dwmanifestdatasize;
    (void)pbmanifestresponseheaders;
    (void)dwmanifestresponseheaderssize;
    (void)pestate;
    (void)phnewappcache;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong happcache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheCloseHandle");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)happcache);
#else
    (void)happcache;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheCreateAndCommitFile(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pwszsourcefilepath, jlong pwszurl, jlong pbresponseheaders, jint dwresponseheaderssize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheCreateAndCommitFile");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pwszsourcefilepath, (void*)(uintptr_t)pwszurl, (void*)(uintptr_t)pbresponseheaders, (uint32_t)dwresponseheaderssize) : 0;
#else
    (void)happcache;
    (void)pwszsourcefilepath;
    (void)pwszurl;
    (void)pbresponseheaders;
    (void)dwresponseheaderssize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheDeleteGroup(JNIEnv* km_env, jclass km_clazz, jlong pwszmanifesturl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheDeleteGroup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszmanifesturl) : 0;
#else
    (void)pwszmanifesturl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheDeleteIEGroup(JNIEnv* km_env, jclass km_clazz, jlong pwszmanifesturl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheDeleteIEGroup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszmanifesturl) : 0;
#else
    (void)pwszmanifesturl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheDuplicateHandle(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong phduplicatedappcache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheDuplicateHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)phduplicatedappcache) : 0;
#else
    (void)happcache;
    (void)phduplicatedappcache;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheFinalize(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pbmanifestdata, jint dwmanifestdatasize, jlong pestate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheFinalize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pbmanifestdata, (uint32_t)dwmanifestdatasize, (void*)(uintptr_t)pestate) : 0;
#else
    (void)happcache;
    (void)pbmanifestdata;
    (void)dwmanifestdatasize;
    (void)pestate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheFreeDownloadList(JNIEnv* km_env, jclass km_clazz, jlong pdownloadlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheFreeDownloadList");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pdownloadlist);
#else
    (void)pdownloadlist;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheFreeGroupList(JNIEnv* km_env, jclass km_clazz, jlong pappcachegrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheFreeGroupList");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pappcachegrouplist);
#else
    (void)pappcachegrouplist;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheGetDownloadList(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pdownloadlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetDownloadList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pdownloadlist) : 0;
#else
    (void)happcache;
    (void)pdownloadlist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheGetFallbackUrl(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pwszurl, jlong ppwszfallbackurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetFallbackUrl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pwszurl, (void*)(uintptr_t)ppwszfallbackurl) : 0;
#else
    (void)happcache;
    (void)pwszurl;
    (void)ppwszfallbackurl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheGetGroupList(JNIEnv* km_env, jclass km_clazz, jlong pappcachegrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetGroupList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pappcachegrouplist) : 0;
#else
    (void)pappcachegrouplist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheGetIEGroupList(JNIEnv* km_env, jclass km_clazz, jlong pappcachegrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetIEGroupList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pappcachegrouplist) : 0;
#else
    (void)pappcachegrouplist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheGetInfo(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pappcacheinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pappcacheinfo) : 0;
#else
    (void)happcache;
    (void)pappcacheinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheGetManifestUrl(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong ppwszmanifesturl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetManifestUrl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)ppwszmanifesturl) : 0;
#else
    (void)happcache;
    (void)ppwszmanifesturl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1appCacheLookup(JNIEnv* km_env, jclass km_clazz, jlong pwszurl, jint dwflags, jlong phappcache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheLookup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszurl, (uint32_t)dwflags, (void*)(uintptr_t)phappcache) : 0;
#else
    (void)pwszurl;
    (void)dwflags;
    (void)phappcache;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1createMD5SSOHash(JNIEnv* km_env, jclass km_clazz, jlong pszchallengeinfo, jlong pwszrealm, jlong pwsztarget, jlong pbhexhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMD5SSOHash");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszchallengeinfo, (void*)(uintptr_t)pwszrealm, (void*)(uintptr_t)pwsztarget, (void*)(uintptr_t)pbhexhash) : -1;
#else
    (void)pszchallengeinfo;
    (void)pwszrealm;
    (void)pwsztarget;
    (void)pbhexhash;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1createUrlCacheContainerA(JNIEnv* km_env, jclass km_clazz, jlong name, jlong lpcacheprefix, jlong lpszcachepath, jint kbcachelimit, jint dwcontainertype, jint dwoptions, jlong pvbuffer, jlong cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheContainerA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)lpcacheprefix, (void*)(uintptr_t)lpszcachepath, (uint32_t)kbcachelimit, (uint32_t)dwcontainertype, (uint32_t)dwoptions, (void*)(uintptr_t)pvbuffer, (void*)(uintptr_t)cbbuffer) : -1;
#else
    (void)name;
    (void)lpcacheprefix;
    (void)lpszcachepath;
    (void)kbcachelimit;
    (void)dwcontainertype;
    (void)dwoptions;
    (void)pvbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1createUrlCacheContainerW(JNIEnv* km_env, jclass km_clazz, jlong name, jlong lpcacheprefix, jlong lpszcachepath, jint kbcachelimit, jint dwcontainertype, jint dwoptions, jlong pvbuffer, jlong cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheContainerW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)lpcacheprefix, (void*)(uintptr_t)lpszcachepath, (uint32_t)kbcachelimit, (uint32_t)dwcontainertype, (uint32_t)dwoptions, (void*)(uintptr_t)pvbuffer, (void*)(uintptr_t)cbbuffer) : -1;
#else
    (void)name;
    (void)lpcacheprefix;
    (void)lpszcachepath;
    (void)kbcachelimit;
    (void)dwcontainertype;
    (void)dwoptions;
    (void)pvbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1createUrlCacheEntryA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwexpectedfilesize, jlong lpszfileextension, jlong lpszfilename, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheEntryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwexpectedfilesize, (void*)(uintptr_t)lpszfileextension, (void*)(uintptr_t)lpszfilename, (uint32_t)dwreserved) : -1;
#else
    (void)lpszurlname;
    (void)dwexpectedfilesize;
    (void)lpszfileextension;
    (void)lpszfilename;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1createUrlCacheEntryExW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwexpectedfilesize, jlong lpszfileextension, jlong lpszfilename, jint dwreserved, jint fpreserveincomingfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheEntryExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwexpectedfilesize, (void*)(uintptr_t)lpszfileextension, (void*)(uintptr_t)lpszfilename, (uint32_t)dwreserved, (int32_t)fpreserveincomingfilename) : -1;
#else
    (void)lpszurlname;
    (void)dwexpectedfilesize;
    (void)lpszfileextension;
    (void)lpszfilename;
    (void)dwreserved;
    (void)fpreserveincomingfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1createUrlCacheEntryW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwexpectedfilesize, jlong lpszfileextension, jlong lpszfilename, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheEntryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwexpectedfilesize, (void*)(uintptr_t)lpszfileextension, (void*)(uintptr_t)lpszfilename, (uint32_t)dwreserved) : -1;
#else
    (void)lpszurlname;
    (void)dwexpectedfilesize;
    (void)lpszfileextension;
    (void)lpszfilename;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1createUrlCacheGroup(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheGroup");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)dwflags;
    (void)lpreserved;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1deleteIE3Cache(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hinst, jlong lpszcmd, jint ncmdshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteIE3Cache");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hinst, (void*)(uintptr_t)lpszcmd, (int32_t)ncmdshow) : 0;
#else
    (void)hwnd;
    (void)hinst;
    (void)lpszcmd;
    (void)ncmdshow;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1deleteUrlCacheContainerA(JNIEnv* km_env, jclass km_clazz, jlong name, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheContainerA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (uint32_t)dwoptions) : -1;
#else
    (void)name;
    (void)dwoptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1deleteUrlCacheContainerW(JNIEnv* km_env, jclass km_clazz, jlong name, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheContainerW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (uint32_t)dwoptions) : -1;
#else
    (void)name;
    (void)dwoptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1deleteUrlCacheEntry(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheEntry");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname) : -1;
#else
    (void)lpszurlname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1deleteUrlCacheEntryA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheEntryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname) : -1;
#else
    (void)lpszurlname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1deleteUrlCacheEntryW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheEntryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname) : -1;
#else
    (void)lpszurlname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1deleteUrlCacheGroup(JNIEnv* km_env, jclass km_clazz, jlong groupid, jint dwflags, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheGroup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)groupid, (uint32_t)dwflags, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)groupid;
    (void)dwflags;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1deleteWpadCacheForNetworks(JNIEnv* km_env, jclass km_clazz, jint param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteWpadCacheForNetworks");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1detectAutoProxyUrl(JNIEnv* km_env, jclass km_clazz, jlong pszautoproxyurl, jint cchautoproxyurl, jint dwdetectflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DetectAutoProxyUrl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszautoproxyurl, (uint32_t)cchautoproxyurl, (uint32_t)dwdetectflags) : -1;
#else
    (void)pszautoproxyurl;
    (void)cchautoproxyurl;
    (void)dwdetectflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1doConnectoidsExist(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DoConnectoidsExist");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1exportCookieFileA(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jint fappend) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExportCookieFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfilename, (int32_t)fappend) : -1;
#else
    (void)szfilename;
    (void)fappend;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1exportCookieFileW(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jint fappend) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExportCookieFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfilename, (int32_t)fappend) : -1;
#else
    (void)szfilename;
    (void)fappend;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findCloseUrlCache(JNIEnv* km_env, jclass km_clazz, jlong henumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindCloseUrlCache");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henumhandle) : -1;
#else
    (void)henumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findFirstUrlCacheContainerA(JNIEnv* km_env, jclass km_clazz, jlong pdwmodified, jlong lpcontainerinfo, jlong lpcbcontainerinfo, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheContainerA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdwmodified, (void*)(uintptr_t)lpcontainerinfo, (void*)(uintptr_t)lpcbcontainerinfo, (uint32_t)dwoptions) : NULL;
#else
    (void)pdwmodified;
    (void)lpcontainerinfo;
    (void)lpcbcontainerinfo;
    (void)dwoptions;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findFirstUrlCacheContainerW(JNIEnv* km_env, jclass km_clazz, jlong pdwmodified, jlong lpcontainerinfo, jlong lpcbcontainerinfo, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheContainerW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdwmodified, (void*)(uintptr_t)lpcontainerinfo, (void*)(uintptr_t)lpcbcontainerinfo, (uint32_t)dwoptions) : NULL;
#else
    (void)pdwmodified;
    (void)lpcontainerinfo;
    (void)lpcbcontainerinfo;
    (void)dwoptions;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findFirstUrlCacheEntryA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlsearchpattern, jlong lpfirstcacheentryinfo, jlong lpcbcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheEntryA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlsearchpattern, (void*)(uintptr_t)lpfirstcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo) : NULL;
#else
    (void)lpszurlsearchpattern;
    (void)lpfirstcacheentryinfo;
    (void)lpcbcacheentryinfo;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findFirstUrlCacheEntryExA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlsearchpattern, jint dwflags, jint dwfilter, jlong groupid, jlong lpfirstcacheentryinfo, jlong lpcbcacheentryinfo, jlong lpgroupattributes, jlong lpcbgroupattributes, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheEntryExA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlsearchpattern, (uint32_t)dwflags, (uint32_t)dwfilter, (int64_t)groupid, (void*)(uintptr_t)lpfirstcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (void*)(uintptr_t)lpgroupattributes, (void*)(uintptr_t)lpcbgroupattributes, (void*)(uintptr_t)lpreserved) : NULL;
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
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findFirstUrlCacheEntryExW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlsearchpattern, jint dwflags, jint dwfilter, jlong groupid, jlong lpfirstcacheentryinfo, jlong lpcbcacheentryinfo, jlong lpgroupattributes, jlong lpcbgroupattributes, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheEntryExW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlsearchpattern, (uint32_t)dwflags, (uint32_t)dwfilter, (int64_t)groupid, (void*)(uintptr_t)lpfirstcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (void*)(uintptr_t)lpgroupattributes, (void*)(uintptr_t)lpcbgroupattributes, (void*)(uintptr_t)lpreserved) : NULL;
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
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findFirstUrlCacheEntryW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlsearchpattern, jlong lpfirstcacheentryinfo, jlong lpcbcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheEntryW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlsearchpattern, (void*)(uintptr_t)lpfirstcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo) : NULL;
#else
    (void)lpszurlsearchpattern;
    (void)lpfirstcacheentryinfo;
    (void)lpcbcacheentryinfo;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findFirstUrlCacheGroup(JNIEnv* km_env, jclass km_clazz, jint dwflags, jint dwfilter, jlong lpsearchcondition, jint dwsearchcondition, jlong lpgroupid, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheGroup");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (uint32_t)dwfilter, (void*)(uintptr_t)lpsearchcondition, (uint32_t)dwsearchcondition, (void*)(uintptr_t)lpgroupid, (void*)(uintptr_t)lpreserved) : NULL;
#else
    (void)dwflags;
    (void)dwfilter;
    (void)lpsearchcondition;
    (void)dwsearchcondition;
    (void)lpgroupid;
    (void)lpreserved;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findNextUrlCacheContainerA(JNIEnv* km_env, jclass km_clazz, jlong henumhandle, jlong lpcontainerinfo, jlong lpcbcontainerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheContainerA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henumhandle, (void*)(uintptr_t)lpcontainerinfo, (void*)(uintptr_t)lpcbcontainerinfo) : -1;
#else
    (void)henumhandle;
    (void)lpcontainerinfo;
    (void)lpcbcontainerinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findNextUrlCacheContainerW(JNIEnv* km_env, jclass km_clazz, jlong henumhandle, jlong lpcontainerinfo, jlong lpcbcontainerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheContainerW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henumhandle, (void*)(uintptr_t)lpcontainerinfo, (void*)(uintptr_t)lpcbcontainerinfo) : -1;
#else
    (void)henumhandle;
    (void)lpcontainerinfo;
    (void)lpcbcontainerinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findNextUrlCacheEntryA(JNIEnv* km_env, jclass km_clazz, jlong henumhandle, jlong lpnextcacheentryinfo, jlong lpcbcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheEntryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henumhandle, (void*)(uintptr_t)lpnextcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo) : -1;
#else
    (void)henumhandle;
    (void)lpnextcacheentryinfo;
    (void)lpcbcacheentryinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findNextUrlCacheEntryExA(JNIEnv* km_env, jclass km_clazz, jlong henumhandle, jlong lpnextcacheentryinfo, jlong lpcbcacheentryinfo, jlong lpgroupattributes, jlong lpcbgroupattributes, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheEntryExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henumhandle, (void*)(uintptr_t)lpnextcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (void*)(uintptr_t)lpgroupattributes, (void*)(uintptr_t)lpcbgroupattributes, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)henumhandle;
    (void)lpnextcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpgroupattributes;
    (void)lpcbgroupattributes;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findNextUrlCacheEntryExW(JNIEnv* km_env, jclass km_clazz, jlong henumhandle, jlong lpnextcacheentryinfo, jlong lpcbcacheentryinfo, jlong lpgroupattributes, jlong lpcbgroupattributes, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheEntryExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henumhandle, (void*)(uintptr_t)lpnextcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (void*)(uintptr_t)lpgroupattributes, (void*)(uintptr_t)lpcbgroupattributes, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)henumhandle;
    (void)lpnextcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpgroupattributes;
    (void)lpcbgroupattributes;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findNextUrlCacheEntryW(JNIEnv* km_env, jclass km_clazz, jlong henumhandle, jlong lpnextcacheentryinfo, jlong lpcbcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheEntryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henumhandle, (void*)(uintptr_t)lpnextcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo) : -1;
#else
    (void)henumhandle;
    (void)lpnextcacheentryinfo;
    (void)lpcbcacheentryinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findNextUrlCacheGroup(JNIEnv* km_env, jclass km_clazz, jlong hfind, jlong lpgroupid, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheGroup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfind, (void*)(uintptr_t)lpgroupid, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)hfind;
    (void)lpgroupid;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1findP3PPolicySymbol(JNIEnv* km_env, jclass km_clazz, jlong pszsymbol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindP3PPolicySymbol");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsymbol) : -1;
#else
    (void)pszsymbol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1freeUrlCacheSpaceA(JNIEnv* km_env, jclass km_clazz, jlong lpszcachepath, jint dwsize, jint dwfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeUrlCacheSpaceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszcachepath, (uint32_t)dwsize, (uint32_t)dwfilter) : -1;
#else
    (void)lpszcachepath;
    (void)dwsize;
    (void)dwfilter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1freeUrlCacheSpaceW(JNIEnv* km_env, jclass km_clazz, jlong lpszcachepath, jint dwsize, jint dwfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeUrlCacheSpaceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszcachepath, (uint32_t)dwsize, (uint32_t)dwfilter) : -1;
#else
    (void)lpszcachepath;
    (void)dwsize;
    (void)dwfilter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpCommandA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jint fexpectresponse, jint dwflags, jlong lpszcommand, jlong dwcontext, jlong phftpcommand) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpCommandA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (int32_t)fexpectresponse, (uint32_t)dwflags, (void*)(uintptr_t)lpszcommand, (uint64_t)dwcontext, (void*)(uintptr_t)phftpcommand) : -1;
#else
    (void)hconnect;
    (void)fexpectresponse;
    (void)dwflags;
    (void)lpszcommand;
    (void)dwcontext;
    (void)phftpcommand;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpCommandW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jint fexpectresponse, jint dwflags, jlong lpszcommand, jlong dwcontext, jlong phftpcommand) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpCommandW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (int32_t)fexpectresponse, (uint32_t)dwflags, (void*)(uintptr_t)lpszcommand, (uint64_t)dwcontext, (void*)(uintptr_t)phftpcommand) : -1;
#else
    (void)hconnect;
    (void)fexpectresponse;
    (void)dwflags;
    (void)lpszcommand;
    (void)dwcontext;
    (void)phftpcommand;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpCreateDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpCreateDirectoryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszdirectory) : -1;
#else
    (void)hconnect;
    (void)lpszdirectory;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpCreateDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpCreateDirectoryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszdirectory) : -1;
#else
    (void)hconnect;
    (void)lpszdirectory;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpDeleteFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpDeleteFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszfilename) : -1;
#else
    (void)hconnect;
    (void)lpszfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpDeleteFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpDeleteFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszfilename) : -1;
#else
    (void)hconnect;
    (void)lpszfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpFindFirstFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszsearchfile, jlong lpfindfiledata, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpFindFirstFileA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszsearchfile, (void*)(uintptr_t)lpfindfiledata, (uint32_t)dwflags, (uint64_t)dwcontext) : NULL;
#else
    (void)hconnect;
    (void)lpszsearchfile;
    (void)lpfindfiledata;
    (void)dwflags;
    (void)dwcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpFindFirstFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszsearchfile, jlong lpfindfiledata, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpFindFirstFileW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszsearchfile, (void*)(uintptr_t)lpfindfiledata, (uint32_t)dwflags, (uint64_t)dwcontext) : NULL;
#else
    (void)hconnect;
    (void)lpszsearchfile;
    (void)lpfindfiledata;
    (void)dwflags;
    (void)dwcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpGetCurrentDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszcurrentdirectory, jlong lpdwcurrentdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetCurrentDirectoryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszcurrentdirectory, (void*)(uintptr_t)lpdwcurrentdirectory) : -1;
#else
    (void)hconnect;
    (void)lpszcurrentdirectory;
    (void)lpdwcurrentdirectory;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpGetCurrentDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszcurrentdirectory, jlong lpdwcurrentdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetCurrentDirectoryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszcurrentdirectory, (void*)(uintptr_t)lpdwcurrentdirectory) : -1;
#else
    (void)hconnect;
    (void)lpszcurrentdirectory;
    (void)lpdwcurrentdirectory;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpGetFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszremotefile, jlong lpsznewfile, jint ffailifexists, jint dwflagsandattributes, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszremotefile, (void*)(uintptr_t)lpsznewfile, (int32_t)ffailifexists, (uint32_t)dwflagsandattributes, (uint32_t)dwflags, (uint64_t)dwcontext) : -1;
#else
    (void)hconnect;
    (void)lpszremotefile;
    (void)lpsznewfile;
    (void)ffailifexists;
    (void)dwflagsandattributes;
    (void)dwflags;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpGetFileEx(JNIEnv* km_env, jclass km_clazz, jlong hftpsession, jlong lpszremotefile, jlong lpsznewfile, jint ffailifexists, jint dwflagsandattributes, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hftpsession, (void*)(uintptr_t)lpszremotefile, (void*)(uintptr_t)lpsznewfile, (int32_t)ffailifexists, (uint32_t)dwflagsandattributes, (uint32_t)dwflags, (uint64_t)dwcontext) : -1;
#else
    (void)hftpsession;
    (void)lpszremotefile;
    (void)lpsznewfile;
    (void)ffailifexists;
    (void)dwflagsandattributes;
    (void)dwflags;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpGetFileSize(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpdwfilesizehigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetFileSize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpdwfilesizehigh) : 0;
#else
    (void)hfile;
    (void)lpdwfilesizehigh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpGetFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszremotefile, jlong lpsznewfile, jint ffailifexists, jint dwflagsandattributes, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszremotefile, (void*)(uintptr_t)lpsznewfile, (int32_t)ffailifexists, (uint32_t)dwflagsandattributes, (uint32_t)dwflags, (uint64_t)dwcontext) : -1;
#else
    (void)hconnect;
    (void)lpszremotefile;
    (void)lpsznewfile;
    (void)ffailifexists;
    (void)dwflagsandattributes;
    (void)dwflags;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpOpenFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszfilename, jint dwaccess, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpOpenFileA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszfilename, (uint32_t)dwaccess, (uint32_t)dwflags, (uint64_t)dwcontext) : NULL;
#else
    (void)hconnect;
    (void)lpszfilename;
    (void)dwaccess;
    (void)dwflags;
    (void)dwcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpOpenFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszfilename, jint dwaccess, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpOpenFileW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszfilename, (uint32_t)dwaccess, (uint32_t)dwflags, (uint64_t)dwcontext) : NULL;
#else
    (void)hconnect;
    (void)lpszfilename;
    (void)dwaccess;
    (void)dwflags;
    (void)dwcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpPutFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocalfile, jlong lpsznewremotefile, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpPutFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocalfile, (void*)(uintptr_t)lpsznewremotefile, (uint32_t)dwflags, (uint64_t)dwcontext) : -1;
#else
    (void)hconnect;
    (void)lpszlocalfile;
    (void)lpsznewremotefile;
    (void)dwflags;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpPutFileEx(JNIEnv* km_env, jclass km_clazz, jlong hftpsession, jlong lpszlocalfile, jlong lpsznewremotefile, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpPutFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hftpsession, (void*)(uintptr_t)lpszlocalfile, (void*)(uintptr_t)lpsznewremotefile, (uint32_t)dwflags, (uint64_t)dwcontext) : -1;
#else
    (void)hftpsession;
    (void)lpszlocalfile;
    (void)lpsznewremotefile;
    (void)dwflags;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpPutFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocalfile, jlong lpsznewremotefile, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpPutFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocalfile, (void*)(uintptr_t)lpsznewremotefile, (uint32_t)dwflags, (uint64_t)dwcontext) : -1;
#else
    (void)hconnect;
    (void)lpszlocalfile;
    (void)lpsznewremotefile;
    (void)dwflags;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpRemoveDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpRemoveDirectoryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszdirectory) : -1;
#else
    (void)hconnect;
    (void)lpszdirectory;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpRemoveDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpRemoveDirectoryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszdirectory) : -1;
#else
    (void)hconnect;
    (void)lpszdirectory;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpRenameFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszexisting, jlong lpsznew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpRenameFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszexisting, (void*)(uintptr_t)lpsznew) : -1;
#else
    (void)hconnect;
    (void)lpszexisting;
    (void)lpsznew;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpRenameFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszexisting, jlong lpsznew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpRenameFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszexisting, (void*)(uintptr_t)lpsznew) : -1;
#else
    (void)hconnect;
    (void)lpszexisting;
    (void)lpsznew;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpSetCurrentDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpSetCurrentDirectoryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszdirectory) : -1;
#else
    (void)hconnect;
    (void)lpszdirectory;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1ftpSetCurrentDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpSetCurrentDirectoryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszdirectory) : -1;
#else
    (void)hconnect;
    (void)lpszdirectory;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1getDiskInfoA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pdwclustersize, jlong pdlavail, jlong pdltotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDiskInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pdwclustersize, (void*)(uintptr_t)pdlavail, (void*)(uintptr_t)pdltotal) : -1;
#else
    (void)pszpath;
    (void)pdwclustersize;
    (void)pdlavail;
    (void)pdltotal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1getUrlCacheConfigInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpcacheconfiginfo, jlong lpcbcacheconfiginfo, jint dwfieldcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheConfigInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcacheconfiginfo, (void*)(uintptr_t)lpcbcacheconfiginfo, (uint32_t)dwfieldcontrol) : -1;
#else
    (void)lpcacheconfiginfo;
    (void)lpcbcacheconfiginfo;
    (void)dwfieldcontrol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1getUrlCacheConfigInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpcacheconfiginfo, jlong lpcbcacheconfiginfo, jint dwfieldcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheConfigInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcacheconfiginfo, (void*)(uintptr_t)lpcbcacheconfiginfo, (uint32_t)dwfieldcontrol) : -1;
#else
    (void)lpcacheconfiginfo;
    (void)lpcbcacheconfiginfo;
    (void)dwfieldcontrol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1getUrlCacheEntryBinaryBlob(JNIEnv* km_env, jclass km_clazz, jlong pwszurlname, jlong dwtype, jlong pftexpiretime, jlong pftaccesstime, jlong pftmodifiedtime, jlong ppbblob, jlong pcbblob) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheEntryBinaryBlob");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszurlname, (void*)(uintptr_t)dwtype, (void*)(uintptr_t)pftexpiretime, (void*)(uintptr_t)pftaccesstime, (void*)(uintptr_t)pftmodifiedtime, (void*)(uintptr_t)ppbblob, (void*)(uintptr_t)pcbblob) : 0;
#else
    (void)pwszurlname;
    (void)dwtype;
    (void)pftexpiretime;
    (void)pftaccesstime;
    (void)pftmodifiedtime;
    (void)ppbblob;
    (void)pcbblob;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1getUrlCacheEntryInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheEntryInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo) : -1;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1getUrlCacheEntryInfoExA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo, jlong lpszredirecturl, jlong lpcbredirecturl, jlong lpreserved, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheEntryInfoExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (void*)(uintptr_t)lpszredirecturl, (void*)(uintptr_t)lpcbredirecturl, (void*)(uintptr_t)lpreserved, (uint32_t)dwflags) : -1;
#else
    (void)lpszurl;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpszredirecturl;
    (void)lpcbredirecturl;
    (void)lpreserved;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1getUrlCacheEntryInfoExW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo, jlong lpszredirecturl, jlong lpcbredirecturl, jlong lpreserved, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheEntryInfoExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (void*)(uintptr_t)lpszredirecturl, (void*)(uintptr_t)lpcbredirecturl, (void*)(uintptr_t)lpreserved, (uint32_t)dwflags) : -1;
#else
    (void)lpszurl;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpszredirecturl;
    (void)lpcbredirecturl;
    (void)lpreserved;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1getUrlCacheEntryInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheEntryInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo) : -1;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1getUrlCacheGroupAttributeA(JNIEnv* km_env, jclass km_clazz, jlong gid, jint dwflags, jint dwattributes, jlong lpgroupinfo, jlong lpcbgroupinfo, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheGroupAttributeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)gid, (uint32_t)dwflags, (uint32_t)dwattributes, (void*)(uintptr_t)lpgroupinfo, (void*)(uintptr_t)lpcbgroupinfo, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)gid;
    (void)dwflags;
    (void)dwattributes;
    (void)lpgroupinfo;
    (void)lpcbgroupinfo;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1getUrlCacheGroupAttributeW(JNIEnv* km_env, jclass km_clazz, jlong gid, jint dwflags, jint dwattributes, jlong lpgroupinfo, jlong lpcbgroupinfo, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheGroupAttributeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)gid, (uint32_t)dwflags, (uint32_t)dwattributes, (void*)(uintptr_t)lpgroupinfo, (void*)(uintptr_t)lpcbgroupinfo, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)gid;
    (void)dwflags;
    (void)dwattributes;
    (void)lpgroupinfo;
    (void)lpcbgroupinfo;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1getUrlCacheHeaderData(JNIEnv* km_env, jclass km_clazz, jint nidx, jlong lpdwdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheHeaderData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nidx, (void*)(uintptr_t)lpdwdata) : -1;
#else
    (void)nidx;
    (void)lpdwdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1gopherCreateLocatorA(JNIEnv* km_env, jclass km_clazz, jlong lpszhost, jshort nserverport, jlong lpszdisplaystring, jlong lpszselectorstring, jint dwgophertype, jlong lpszlocator, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherCreateLocatorA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszhost, (uint16_t)nserverport, (void*)(uintptr_t)lpszdisplaystring, (void*)(uintptr_t)lpszselectorstring, (uint32_t)dwgophertype, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpdwbufferlength) : -1;
#else
    (void)lpszhost;
    (void)nserverport;
    (void)lpszdisplaystring;
    (void)lpszselectorstring;
    (void)dwgophertype;
    (void)lpszlocator;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1gopherCreateLocatorW(JNIEnv* km_env, jclass km_clazz, jlong lpszhost, jshort nserverport, jlong lpszdisplaystring, jlong lpszselectorstring, jint dwgophertype, jlong lpszlocator, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherCreateLocatorW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszhost, (uint16_t)nserverport, (void*)(uintptr_t)lpszdisplaystring, (void*)(uintptr_t)lpszselectorstring, (uint32_t)dwgophertype, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpdwbufferlength) : -1;
#else
    (void)lpszhost;
    (void)nserverport;
    (void)lpszdisplaystring;
    (void)lpszselectorstring;
    (void)dwgophertype;
    (void)lpszlocator;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1gopherFindFirstFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocator, jlong lpszsearchstring, jlong lpfinddata, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherFindFirstFileA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpszsearchstring, (void*)(uintptr_t)lpfinddata, (uint32_t)dwflags, (uint64_t)dwcontext) : NULL;
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszsearchstring;
    (void)lpfinddata;
    (void)dwflags;
    (void)dwcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1gopherFindFirstFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocator, jlong lpszsearchstring, jlong lpfinddata, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherFindFirstFileW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpszsearchstring, (void*)(uintptr_t)lpfinddata, (uint32_t)dwflags, (uint64_t)dwcontext) : NULL;
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszsearchstring;
    (void)lpfinddata;
    (void)dwflags;
    (void)dwcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1gopherGetAttributeA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocator, jlong lpszattributename, jlong lpbuffer, jint dwbufferlength, jlong lpdwcharactersreturned, jlong lpfnenumerator, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherGetAttributeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpszattributename, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbufferlength, (void*)(uintptr_t)lpdwcharactersreturned, (void*)(uintptr_t)lpfnenumerator, (uint64_t)dwcontext) : -1;
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszattributename;
    (void)lpbuffer;
    (void)dwbufferlength;
    (void)lpdwcharactersreturned;
    (void)lpfnenumerator;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1gopherGetAttributeW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocator, jlong lpszattributename, jlong lpbuffer, jint dwbufferlength, jlong lpdwcharactersreturned, jlong lpfnenumerator, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherGetAttributeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpszattributename, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbufferlength, (void*)(uintptr_t)lpdwcharactersreturned, (void*)(uintptr_t)lpfnenumerator, (uint64_t)dwcontext) : -1;
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszattributename;
    (void)lpbuffer;
    (void)dwbufferlength;
    (void)lpdwcharactersreturned;
    (void)lpfnenumerator;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1gopherGetLocatorTypeA(JNIEnv* km_env, jclass km_clazz, jlong lpszlocator, jlong lpdwgophertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherGetLocatorTypeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpdwgophertype) : -1;
#else
    (void)lpszlocator;
    (void)lpdwgophertype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1gopherGetLocatorTypeW(JNIEnv* km_env, jclass km_clazz, jlong lpszlocator, jlong lpdwgophertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherGetLocatorTypeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpdwgophertype) : -1;
#else
    (void)lpszlocator;
    (void)lpdwgophertype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1gopherOpenFileA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocator, jlong lpszview, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherOpenFileA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpszview, (uint32_t)dwflags, (uint64_t)dwcontext) : NULL;
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszview;
    (void)dwflags;
    (void)dwcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1gopherOpenFileW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszlocator, jlong lpszview, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherOpenFileW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszlocator, (void*)(uintptr_t)lpszview, (uint32_t)dwflags, (uint64_t)dwcontext) : NULL;
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszview;
    (void)dwflags;
    (void)dwcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpAddRequestHeadersA(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpszheaders, jint dwheaderslength, jint dwmodifiers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpAddRequestHeadersA");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpAddRequestHeadersW(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpszheaders, jint dwheaderslength, jint dwmodifiers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpAddRequestHeadersW");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpCheckDavComplianceA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcompliancetoken, jlong lpffound, jlong hwnd, jlong lpvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCheckDavComplianceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcompliancetoken, (void*)(uintptr_t)lpffound, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpvreserved) : -1;
#else
    (void)lpszurl;
    (void)lpszcompliancetoken;
    (void)lpffound;
    (void)hwnd;
    (void)lpvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpCheckDavComplianceW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcompliancetoken, jlong lpffound, jlong hwnd, jlong lpvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCheckDavComplianceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcompliancetoken, (void*)(uintptr_t)lpffound, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpvreserved) : -1;
#else
    (void)lpszurl;
    (void)lpszcompliancetoken;
    (void)lpffound;
    (void)hwnd;
    (void)lpvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpCloseDependencyHandle(JNIEnv* km_env, jclass km_clazz, jlong hdependencyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCloseDependencyHandle");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hdependencyhandle);
#else
    (void)hdependencyhandle;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpDuplicateDependencyHandle(JNIEnv* km_env, jclass km_clazz, jlong hdependencyhandle, jlong phduplicateddependencyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpDuplicateDependencyHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdependencyhandle, (void*)(uintptr_t)phduplicateddependencyhandle) : 0;
#else
    (void)hdependencyhandle;
    (void)phduplicateddependencyhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpEndRequestA(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpbuffersout, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpEndRequestA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpbuffersout, (uint32_t)dwflags, (uint64_t)dwcontext) : -1;
#else
    (void)hrequest;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpEndRequestW(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpbuffersout, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpEndRequestW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpbuffersout, (uint32_t)dwflags, (uint64_t)dwcontext) : -1;
#else
    (void)hrequest;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpGetServerCredentials(JNIEnv* km_env, jclass km_clazz, jlong pwszurl, jlong ppwszusername, jlong ppwszpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpGetServerCredentials");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszurl, (void*)(uintptr_t)ppwszusername, (void*)(uintptr_t)ppwszpassword) : 0;
#else
    (void)pwszurl;
    (void)ppwszusername;
    (void)ppwszpassword;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpIndicatePageLoadComplete(JNIEnv* km_env, jclass km_clazz, jlong hdependencyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpIndicatePageLoadComplete");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdependencyhandle) : 0;
#else
    (void)hdependencyhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpIsHostHstsEnabled(JNIEnv* km_env, jclass km_clazz, jlong pcwszurl, jlong pfishsts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpIsHostHstsEnabled");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pfishsts) : 0;
#else
    (void)pcwszurl;
    (void)pfishsts;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpOpenDependencyHandle(JNIEnv* km_env, jclass km_clazz, jlong hrequesthandle, jint fbackground, jlong phdependencyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpOpenDependencyHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequesthandle, (int32_t)fbackground, (void*)(uintptr_t)phdependencyhandle) : 0;
#else
    (void)hrequesthandle;
    (void)fbackground;
    (void)phdependencyhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpOpenRequestA(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszverb, jlong lpszobjectname, jlong lpszversion, jlong lpszreferrer, jlong lplpszaccepttypes, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpOpenRequestA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszverb, (void*)(uintptr_t)lpszobjectname, (void*)(uintptr_t)lpszversion, (void*)(uintptr_t)lpszreferrer, (void*)(uintptr_t)lplpszaccepttypes, (uint32_t)dwflags, (uint64_t)dwcontext) : NULL;
#else
    (void)hconnect;
    (void)lpszverb;
    (void)lpszobjectname;
    (void)lpszversion;
    (void)lpszreferrer;
    (void)lplpszaccepttypes;
    (void)dwflags;
    (void)dwcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpOpenRequestW(JNIEnv* km_env, jclass km_clazz, jlong hconnect, jlong lpszverb, jlong lpszobjectname, jlong lpszversion, jlong lpszreferrer, jlong lplpszaccepttypes, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpOpenRequestW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hconnect, (void*)(uintptr_t)lpszverb, (void*)(uintptr_t)lpszobjectname, (void*)(uintptr_t)lpszversion, (void*)(uintptr_t)lpszreferrer, (void*)(uintptr_t)lplpszaccepttypes, (uint32_t)dwflags, (uint64_t)dwcontext) : NULL;
#else
    (void)hconnect;
    (void)lpszverb;
    (void)lpszobjectname;
    (void)lpszversion;
    (void)lpszreferrer;
    (void)lplpszaccepttypes;
    (void)dwflags;
    (void)dwcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpPushClose(JNIEnv* km_env, jclass km_clazz, jlong hwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpPushClose");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hwait);
#else
    (void)hwait;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpPushEnable(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong ptransportsetting, jlong phwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpPushEnable");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)ptransportsetting, (void*)(uintptr_t)phwait) : 0;
#else
    (void)hrequest;
    (void)ptransportsetting;
    (void)phwait;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpPushWait(JNIEnv* km_env, jclass km_clazz, jlong hwait, jint etype, jlong pnotificationstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpPushWait");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwait, (int32_t)etype, (void*)(uintptr_t)pnotificationstatus) : 0;
#else
    (void)hwait;
    (void)etype;
    (void)pnotificationstatus;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpQueryInfoA(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jint dwinfolevel, jlong lpbuffer, jlong lpdwbufferlength, jlong lpdwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpQueryInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpdwindex) : -1;
#else
    (void)hrequest;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    (void)lpdwindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpQueryInfoW(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jint dwinfolevel, jlong lpbuffer, jlong lpdwbufferlength, jlong lpdwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpQueryInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwbufferlength, (void*)(uintptr_t)lpdwindex) : -1;
#else
    (void)hrequest;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    (void)lpdwindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpSendRequestA(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpszheaders, jint dwheaderslength, jlong lpoptional, jint dwoptionallength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendRequestA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpszheaders, (uint32_t)dwheaderslength, (void*)(uintptr_t)lpoptional, (uint32_t)dwoptionallength) : -1;
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)lpoptional;
    (void)dwoptionallength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpSendRequestExA(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpbuffersin, jlong lpbuffersout, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendRequestExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpbuffersin, (void*)(uintptr_t)lpbuffersout, (uint32_t)dwflags, (uint64_t)dwcontext) : -1;
#else
    (void)hrequest;
    (void)lpbuffersin;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpSendRequestExW(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpbuffersin, jlong lpbuffersout, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendRequestExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpbuffersin, (void*)(uintptr_t)lpbuffersout, (uint32_t)dwflags, (uint64_t)dwcontext) : -1;
#else
    (void)hrequest;
    (void)lpbuffersin;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpSendRequestW(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong lpszheaders, jint dwheaderslength, jlong lpoptional, jint dwoptionallength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendRequestW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (void*)(uintptr_t)lpszheaders, (uint32_t)dwheaderslength, (void*)(uintptr_t)lpoptional, (uint32_t)dwoptionallength) : -1;
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)lpoptional;
    (void)dwoptionallength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpWebSocketClose(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jshort usstatus, jlong pvreason, jint dwreasonlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (uint16_t)usstatus, (void*)(uintptr_t)pvreason, (uint32_t)dwreasonlength) : -1;
#else
    (void)hwebsocket;
    (void)usstatus;
    (void)pvreason;
    (void)dwreasonlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpWebSocketCompleteUpgrade(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketCompleteUpgrade");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (uint64_t)dwcontext) : NULL;
#else
    (void)hrequest;
    (void)dwcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpWebSocketQueryCloseStatus(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jlong pusstatus, jlong pvreason, jint dwreasonlength, jlong pdwreasonlengthconsumed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketQueryCloseStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (void*)(uintptr_t)pusstatus, (void*)(uintptr_t)pvreason, (uint32_t)dwreasonlength, (void*)(uintptr_t)pdwreasonlengthconsumed) : -1;
#else
    (void)hwebsocket;
    (void)pusstatus;
    (void)pvreason;
    (void)dwreasonlength;
    (void)pdwreasonlengthconsumed;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpWebSocketReceive(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jlong pvbuffer, jint dwbufferlength, jlong pdwbytesread, jlong pbuffertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketReceive");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (void*)(uintptr_t)pvbuffer, (uint32_t)dwbufferlength, (void*)(uintptr_t)pdwbytesread, (void*)(uintptr_t)pbuffertype) : -1;
#else
    (void)hwebsocket;
    (void)pvbuffer;
    (void)dwbufferlength;
    (void)pdwbytesread;
    (void)pbuffertype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpWebSocketSend(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jint buffertype, jlong pvbuffer, jint dwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketSend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (int32_t)buffertype, (void*)(uintptr_t)pvbuffer, (uint32_t)dwbufferlength) : -1;
#else
    (void)hwebsocket;
    (void)buffertype;
    (void)pvbuffer;
    (void)dwbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1httpWebSocketShutdown(JNIEnv* km_env, jclass km_clazz, jlong hwebsocket, jshort usstatus, jlong pvreason, jint dwreasonlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketShutdown");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwebsocket, (uint16_t)usstatus, (void*)(uintptr_t)pvreason, (uint32_t)dwreasonlength) : -1;
#else
    (void)hwebsocket;
    (void)usstatus;
    (void)pvreason;
    (void)dwreasonlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1importCookieFileA(JNIEnv* km_env, jclass km_clazz, jlong szfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportCookieFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfilename) : -1;
#else
    (void)szfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1importCookieFileW(JNIEnv* km_env, jclass km_clazz, jlong szfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportCookieFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfilename) : -1;
#else
    (void)szfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1incrementUrlCacheHeaderData(JNIEnv* km_env, jclass km_clazz, jint nidx, jlong lpdwdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IncrementUrlCacheHeaderData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nidx, (void*)(uintptr_t)lpdwdata) : -1;
#else
    (void)nidx;
    (void)lpdwdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internalInternetGetCookie(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiedata, jlong lpdwdatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternalInternetGetCookie");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiedata, (void*)(uintptr_t)lpdwdatasize) : 0;
#else
    (void)lpszurl;
    (void)lpszcookiedata;
    (void)lpdwdatasize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetAlgIdToStringA(JNIEnv* km_env, jclass km_clazz, jint ai, jlong lpstr, jlong lpdwstrlength, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetAlgIdToStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ai, (void*)(uintptr_t)lpstr, (void*)(uintptr_t)lpdwstrlength, (uint32_t)dwreserved) : -1;
#else
    (void)ai;
    (void)lpstr;
    (void)lpdwstrlength;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetAlgIdToStringW(JNIEnv* km_env, jclass km_clazz, jint ai, jlong lpstr, jlong lpdwstrlength, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetAlgIdToStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ai, (void*)(uintptr_t)lpstr, (void*)(uintptr_t)lpdwstrlength, (uint32_t)dwreserved) : -1;
#else
    (void)ai;
    (void)lpstr;
    (void)lpdwstrlength;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetAttemptConnect(JNIEnv* km_env, jclass km_clazz, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetAttemptConnect");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwreserved) : 0;
#else
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetAutodial(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong hwndparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetAutodial");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)hwndparent) : -1;
#else
    (void)dwflags;
    (void)hwndparent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetAutodialHangup(JNIEnv* km_env, jclass km_clazz, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetAutodialHangup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwreserved) : -1;
#else
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetCanonicalizeUrlA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszbuffer, jlong lpdwbufferlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCanonicalizeUrlA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszbuffer, (void*)(uintptr_t)lpdwbufferlength, (uint32_t)dwflags) : -1;
#else
    (void)lpszurl;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetCanonicalizeUrlW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszbuffer, jlong lpdwbufferlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCanonicalizeUrlW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszbuffer, (void*)(uintptr_t)lpdwbufferlength, (uint32_t)dwflags) : -1;
#else
    (void)lpszurl;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetCheckConnectionA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jint dwflags, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCheckConnectionA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (uint32_t)dwflags, (uint32_t)dwreserved) : -1;
#else
    (void)lpszurl;
    (void)dwflags;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetCheckConnectionW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jint dwflags, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCheckConnectionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (uint32_t)dwflags, (uint32_t)dwreserved) : -1;
#else
    (void)lpszurl;
    (void)dwflags;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetClearAllPerSiteCookieDecisions(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetClearAllPerSiteCookieDecisions");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong hinternet) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCloseHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet) : -1;
#else
    (void)hinternet;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetCombineUrlA(JNIEnv* km_env, jclass km_clazz, jlong lpszbaseurl, jlong lpszrelativeurl, jlong lpszbuffer, jlong lpdwbufferlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCombineUrlA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszbaseurl, (void*)(uintptr_t)lpszrelativeurl, (void*)(uintptr_t)lpszbuffer, (void*)(uintptr_t)lpdwbufferlength, (uint32_t)dwflags) : -1;
#else
    (void)lpszbaseurl;
    (void)lpszrelativeurl;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetCombineUrlW(JNIEnv* km_env, jclass km_clazz, jlong lpszbaseurl, jlong lpszrelativeurl, jlong lpszbuffer, jlong lpdwbufferlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCombineUrlW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszbaseurl, (void*)(uintptr_t)lpszrelativeurl, (void*)(uintptr_t)lpszbuffer, (void*)(uintptr_t)lpdwbufferlength, (uint32_t)dwflags) : -1;
#else
    (void)lpszbaseurl;
    (void)lpszrelativeurl;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetConfirmZoneCrossing(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong szurlprev, jlong szurlnew, jint bpost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConfirmZoneCrossing");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)szurlprev, (void*)(uintptr_t)szurlnew, (int32_t)bpost) : 0;
#else
    (void)hwnd;
    (void)szurlprev;
    (void)szurlnew;
    (void)bpost;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetConfirmZoneCrossingA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong szurlprev, jlong szurlnew, jint bpost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConfirmZoneCrossingA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)szurlprev, (void*)(uintptr_t)szurlnew, (int32_t)bpost) : 0;
#else
    (void)hwnd;
    (void)szurlprev;
    (void)szurlnew;
    (void)bpost;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetConfirmZoneCrossingW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong szurlprev, jlong szurlnew, jint bpost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConfirmZoneCrossingW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)szurlprev, (void*)(uintptr_t)szurlnew, (int32_t)bpost) : 0;
#else
    (void)hwnd;
    (void)szurlprev;
    (void)szurlnew;
    (void)bpost;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetConnectA(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lpszservername, jshort nserverport, jlong lpszusername, jlong lpszpassword, jint dwservice, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConnectA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lpszservername, (uint16_t)nserverport, (void*)(uintptr_t)lpszusername, (void*)(uintptr_t)lpszpassword, (uint32_t)dwservice, (uint32_t)dwflags, (uint64_t)dwcontext) : NULL;
#else
    (void)hinternet;
    (void)lpszservername;
    (void)nserverport;
    (void)lpszusername;
    (void)lpszpassword;
    (void)dwservice;
    (void)dwflags;
    (void)dwcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetConnectW(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lpszservername, jshort nserverport, jlong lpszusername, jlong lpszpassword, jint dwservice, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConnectW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lpszservername, (uint16_t)nserverport, (void*)(uintptr_t)lpszusername, (void*)(uintptr_t)lpszpassword, (uint32_t)dwservice, (uint32_t)dwflags, (uint64_t)dwcontext) : NULL;
#else
    (void)hinternet;
    (void)lpszservername;
    (void)nserverport;
    (void)lpszusername;
    (void)lpszpassword;
    (void)dwservice;
    (void)dwflags;
    (void)dwcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetConvertUrlFromWireToWideChar(JNIEnv* km_env, jclass km_clazz, jlong pcszurl, jint cchurl, jlong pcwszbaseurl, jint dwcodepagehost, jint dwcodepagepath, jint fencodepathextra, jint dwcodepageextra, jlong ppwszconvertedurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConvertUrlFromWireToWideChar");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcszurl, (uint32_t)cchurl, (void*)(uintptr_t)pcwszbaseurl, (uint32_t)dwcodepagehost, (uint32_t)dwcodepagepath, (int32_t)fencodepathextra, (uint32_t)dwcodepageextra, (void*)(uintptr_t)ppwszconvertedurl) : 0;
#else
    (void)pcszurl;
    (void)cchurl;
    (void)pcwszbaseurl;
    (void)dwcodepagehost;
    (void)dwcodepagepath;
    (void)fencodepathextra;
    (void)dwcodepageextra;
    (void)ppwszconvertedurl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetCrackUrlA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jint dwurllength, jint dwflags, jlong lpurlcomponents) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCrackUrlA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (uint32_t)dwurllength, (uint32_t)dwflags, (void*)(uintptr_t)lpurlcomponents) : -1;
#else
    (void)lpszurl;
    (void)dwurllength;
    (void)dwflags;
    (void)lpurlcomponents;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetCrackUrlW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jint dwurllength, jint dwflags, jlong lpurlcomponents) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCrackUrlW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (uint32_t)dwurllength, (uint32_t)dwflags, (void*)(uintptr_t)lpurlcomponents) : -1;
#else
    (void)lpszurl;
    (void)dwurllength;
    (void)dwflags;
    (void)lpurlcomponents;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetCreateUrlA(JNIEnv* km_env, jclass km_clazz, jlong lpurlcomponents, jint dwflags, jlong lpszurl, jlong lpdwurllength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCreateUrlA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpurlcomponents, (uint32_t)dwflags, (void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpdwurllength) : -1;
#else
    (void)lpurlcomponents;
    (void)dwflags;
    (void)lpszurl;
    (void)lpdwurllength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetCreateUrlW(JNIEnv* km_env, jclass km_clazz, jlong lpurlcomponents, jint dwflags, jlong lpszurl, jlong lpdwurllength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCreateUrlW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpurlcomponents, (uint32_t)dwflags, (void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpdwurllength) : -1;
#else
    (void)lpurlcomponents;
    (void)dwflags;
    (void)lpszurl;
    (void)lpdwurllength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetDial(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong lpszconnectoid, jint dwflags, jlong lpdwconnection, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetDial");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpszconnectoid, (uint32_t)dwflags, (void*)(uintptr_t)lpdwconnection, (uint32_t)dwreserved) : 0;
#else
    (void)hwndparent;
    (void)lpszconnectoid;
    (void)dwflags;
    (void)lpdwconnection;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetDialA(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong lpszconnectoid, jint dwflags, jlong lpdwconnection, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetDialA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpszconnectoid, (uint32_t)dwflags, (void*)(uintptr_t)lpdwconnection, (uint32_t)dwreserved) : 0;
#else
    (void)hwndparent;
    (void)lpszconnectoid;
    (void)dwflags;
    (void)lpdwconnection;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetDialW(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong lpszconnectoid, jint dwflags, jlong lpdwconnection, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetDialW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpszconnectoid, (uint32_t)dwflags, (void*)(uintptr_t)lpdwconnection, (uint32_t)dwreserved) : 0;
#else
    (void)hwndparent;
    (void)lpszconnectoid;
    (void)dwflags;
    (void)lpdwconnection;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetEnumPerSiteCookieDecisionA(JNIEnv* km_env, jclass km_clazz, jlong pszsitename, jlong pcsitenamesize, jlong pdwdecision, jint dwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetEnumPerSiteCookieDecisionA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsitename, (void*)(uintptr_t)pcsitenamesize, (void*)(uintptr_t)pdwdecision, (uint32_t)dwindex) : -1;
#else
    (void)pszsitename;
    (void)pcsitenamesize;
    (void)pdwdecision;
    (void)dwindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetEnumPerSiteCookieDecisionW(JNIEnv* km_env, jclass km_clazz, jlong pszsitename, jlong pcsitenamesize, jlong pdwdecision, jint dwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetEnumPerSiteCookieDecisionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsitename, (void*)(uintptr_t)pcsitenamesize, (void*)(uintptr_t)pdwdecision, (uint32_t)dwindex) : -1;
#else
    (void)pszsitename;
    (void)pcsitenamesize;
    (void)pdwdecision;
    (void)dwindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetErrorDlg(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hrequest, jint dwerror, jint dwflags, jlong lppvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetErrorDlg");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hrequest, (uint32_t)dwerror, (uint32_t)dwflags, (void*)(uintptr_t)lppvdata) : 0;
#else
    (void)hwnd;
    (void)hrequest;
    (void)dwerror;
    (void)dwflags;
    (void)lppvdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetFindNextFileA(JNIEnv* km_env, jclass km_clazz, jlong hfind, jlong lpvfinddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetFindNextFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfind, (void*)(uintptr_t)lpvfinddata) : -1;
#else
    (void)hfind;
    (void)lpvfinddata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetFindNextFileW(JNIEnv* km_env, jclass km_clazz, jlong hfind, jlong lpvfinddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetFindNextFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfind, (void*)(uintptr_t)lpvfinddata) : -1;
#else
    (void)hfind;
    (void)lpvfinddata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetFortezzaCommand(JNIEnv* km_env, jclass km_clazz, jint dwcommand, jlong hwnd, jlong dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetFortezzaCommand");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwcommand, (void*)(uintptr_t)hwnd, (uint64_t)dwreserved) : -1;
#else
    (void)dwcommand;
    (void)hwnd;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetFreeCookies(JNIEnv* km_env, jclass km_clazz, jlong pcookies, jint dwcookiecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetFreeCookies");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pcookies, (uint32_t)dwcookiecount);
#else
    (void)pcookies;
    (void)dwcookiecount;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetFreeProxyInfoList(JNIEnv* km_env, jclass km_clazz, jlong pproxyinfolist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetFreeProxyInfoList");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pproxyinfolist);
#else
    (void)pproxyinfolist;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetConnectedState(JNIEnv* km_env, jclass km_clazz, jlong lpdwflags, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetConnectedState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwflags, (uint32_t)dwreserved) : -1;
#else
    (void)lpdwflags;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetConnectedStateEx(JNIEnv* km_env, jclass km_clazz, jlong lpdwflags, jlong lpszconnectionname, jint dwnamelen, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetConnectedStateEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwflags, (void*)(uintptr_t)lpszconnectionname, (uint32_t)dwnamelen, (uint32_t)dwreserved) : -1;
#else
    (void)lpdwflags;
    (void)lpszconnectionname;
    (void)dwnamelen;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetConnectedStateExA(JNIEnv* km_env, jclass km_clazz, jlong lpdwflags, jlong lpszconnectionname, jint cchnamelen, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetConnectedStateExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwflags, (void*)(uintptr_t)lpszconnectionname, (uint32_t)cchnamelen, (uint32_t)dwreserved) : -1;
#else
    (void)lpdwflags;
    (void)lpszconnectionname;
    (void)cchnamelen;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetConnectedStateExW(JNIEnv* km_env, jclass km_clazz, jlong lpdwflags, jlong lpszconnectionname, jint cchnamelen, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetConnectedStateExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwflags, (void*)(uintptr_t)lpszconnectionname, (uint32_t)cchnamelen, (uint32_t)dwreserved) : -1;
#else
    (void)lpdwflags;
    (void)lpszconnectionname;
    (void)cchnamelen;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetCookieA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata, jlong lpdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetCookieA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata, (void*)(uintptr_t)lpdwsize) : -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)lpdwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetCookieEx2(JNIEnv* km_env, jclass km_clazz, jlong pcwszurl, jlong pcwszcookiename, jint dwflags, jlong ppcookies, jlong pdwcookiecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetCookieEx2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pcwszcookiename, (uint32_t)dwflags, (void*)(uintptr_t)ppcookies, (void*)(uintptr_t)pdwcookiecount) : 0;
#else
    (void)pcwszurl;
    (void)pcwszcookiename;
    (void)dwflags;
    (void)ppcookies;
    (void)pdwcookiecount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetCookieExA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata, jlong lpdwsize, jint dwflags, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetCookieExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata, (void*)(uintptr_t)lpdwsize, (uint32_t)dwflags, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)lpdwsize;
    (void)dwflags;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetCookieExW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata, jlong lpdwsize, jint dwflags, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetCookieExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata, (void*)(uintptr_t)lpdwsize, (uint32_t)dwflags, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)lpdwsize;
    (void)dwflags;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetCookieW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata, jlong lpdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetCookieW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata, (void*)(uintptr_t)lpdwsize) : -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)lpdwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetLastResponseInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpdwerror, jlong lpszbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetLastResponseInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwerror, (void*)(uintptr_t)lpszbuffer, (void*)(uintptr_t)lpdwbufferlength) : -1;
#else
    (void)lpdwerror;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetLastResponseInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpdwerror, jlong lpszbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetLastResponseInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdwerror, (void*)(uintptr_t)lpszbuffer, (void*)(uintptr_t)lpdwbufferlength) : -1;
#else
    (void)lpdwerror;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetPerSiteCookieDecisionA(JNIEnv* km_env, jclass km_clazz, jlong pchhostname, jlong presult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetPerSiteCookieDecisionA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pchhostname, (void*)(uintptr_t)presult) : -1;
#else
    (void)pchhostname;
    (void)presult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetPerSiteCookieDecisionW(JNIEnv* km_env, jclass km_clazz, jlong pchhostname, jlong presult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetPerSiteCookieDecisionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pchhostname, (void*)(uintptr_t)presult) : -1;
#else
    (void)pchhostname;
    (void)presult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetProxyForUrl(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong pcwszurl, jlong pproxyinfolist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetProxyForUrl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pproxyinfolist) : 0;
#else
    (void)hinternet;
    (void)pcwszurl;
    (void)pproxyinfolist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetSecurityInfoByURL(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong ppcertchain, jlong pdwsecureflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetSecurityInfoByURL");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)ppcertchain, (void*)(uintptr_t)pdwsecureflags) : -1;
#else
    (void)lpszurl;
    (void)ppcertchain;
    (void)pdwsecureflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetSecurityInfoByURLA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong ppcertchain, jlong pdwsecureflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetSecurityInfoByURLA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)ppcertchain, (void*)(uintptr_t)pdwsecureflags) : -1;
#else
    (void)lpszurl;
    (void)ppcertchain;
    (void)pdwsecureflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGetSecurityInfoByURLW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong ppcertchain, jlong pdwsecureflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetSecurityInfoByURLW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)ppcertchain, (void*)(uintptr_t)pdwsecureflags) : -1;
#else
    (void)lpszurl;
    (void)ppcertchain;
    (void)pdwsecureflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGoOnline(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong hwndparent, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGoOnline");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)hwndparent, (uint32_t)dwflags) : -1;
#else
    (void)lpszurl;
    (void)hwndparent;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGoOnlineA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong hwndparent, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGoOnlineA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)hwndparent, (uint32_t)dwflags) : -1;
#else
    (void)lpszurl;
    (void)hwndparent;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetGoOnlineW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong hwndparent, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGoOnlineW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)hwndparent, (uint32_t)dwflags) : -1;
#else
    (void)lpszurl;
    (void)hwndparent;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetHangUp(JNIEnv* km_env, jclass km_clazz, jlong dwconnection, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetHangUp");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)dwconnection, (uint32_t)dwreserved) : 0;
#else
    (void)dwconnection;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetInitializeAutoProxyDll(JNIEnv* km_env, jclass km_clazz, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetInitializeAutoProxyDll");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwreserved) : -1;
#else
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetLockRequestFile(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lphlockrequestinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetLockRequestFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lphlockrequestinfo) : -1;
#else
    (void)hinternet;
    (void)lphlockrequestinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetOpenA(JNIEnv* km_env, jclass km_clazz, jlong lpszagent, jint dwaccesstype, jlong lpszproxy, jlong lpszproxybypass, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetOpenA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszagent, (uint32_t)dwaccesstype, (void*)(uintptr_t)lpszproxy, (void*)(uintptr_t)lpszproxybypass, (uint32_t)dwflags) : NULL;
#else
    (void)lpszagent;
    (void)dwaccesstype;
    (void)lpszproxy;
    (void)lpszproxybypass;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetOpenUrlA(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lpszurl, jlong lpszheaders, jint dwheaderslength, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetOpenUrlA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszheaders, (uint32_t)dwheaderslength, (uint32_t)dwflags, (uint64_t)dwcontext) : NULL;
#else
    (void)hinternet;
    (void)lpszurl;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)dwflags;
    (void)dwcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetOpenUrlW(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lpszurl, jlong lpszheaders, jint dwheaderslength, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetOpenUrlW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszheaders, (uint32_t)dwheaderslength, (uint32_t)dwflags, (uint64_t)dwcontext) : NULL;
#else
    (void)hinternet;
    (void)lpszurl;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)dwflags;
    (void)dwcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetOpenW(JNIEnv* km_env, jclass km_clazz, jlong lpszagent, jint dwaccesstype, jlong lpszproxy, jlong lpszproxybypass, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetOpenW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszagent, (uint32_t)dwaccesstype, (void*)(uintptr_t)lpszproxy, (void*)(uintptr_t)lpszproxybypass, (uint32_t)dwflags) : NULL;
#else
    (void)lpszagent;
    (void)dwaccesstype;
    (void)lpszproxy;
    (void)lpszproxybypass;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetQueryDataAvailable(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpdwnumberofbytesavailable, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetQueryDataAvailable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpdwnumberofbytesavailable, (uint32_t)dwflags, (uint64_t)dwcontext) : -1;
#else
    (void)hfile;
    (void)lpdwnumberofbytesavailable;
    (void)dwflags;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetQueryFortezzaStatus(JNIEnv* km_env, jclass km_clazz, jlong pdwstatus, jlong dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetQueryFortezzaStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdwstatus, (uint64_t)dwreserved) : -1;
#else
    (void)pdwstatus;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetQueryOptionA(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jint dwoption, jlong lpbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetQueryOptionA");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetQueryOptionW(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jint dwoption, jlong lpbuffer, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetQueryOptionW");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetReadFile(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffer, jint dwnumberofbytestoread, jlong lpdwnumberofbytesread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetReadFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffer, (uint32_t)dwnumberofbytestoread, (void*)(uintptr_t)lpdwnumberofbytesread) : -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)dwnumberofbytestoread;
    (void)lpdwnumberofbytesread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetReadFileExA(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffersout, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetReadFileExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffersout, (uint32_t)dwflags, (uint64_t)dwcontext) : -1;
#else
    (void)hfile;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetReadFileExW(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffersout, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetReadFileExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffersout, (uint32_t)dwflags, (uint64_t)dwcontext) : -1;
#else
    (void)hfile;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSecurityProtocolToStringA(JNIEnv* km_env, jclass km_clazz, jint dwprotocol, jlong lpstr, jlong lpdwstrlength, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSecurityProtocolToStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwprotocol, (void*)(uintptr_t)lpstr, (void*)(uintptr_t)lpdwstrlength, (uint32_t)dwreserved) : -1;
#else
    (void)dwprotocol;
    (void)lpstr;
    (void)lpdwstrlength;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSecurityProtocolToStringW(JNIEnv* km_env, jclass km_clazz, jint dwprotocol, jlong lpstr, jlong lpdwstrlength, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSecurityProtocolToStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwprotocol, (void*)(uintptr_t)lpstr, (void*)(uintptr_t)lpdwstrlength, (uint32_t)dwreserved) : -1;
#else
    (void)dwprotocol;
    (void)lpstr;
    (void)lpdwstrlength;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetCookieA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetCookieA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata) : -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetCookieEx2(JNIEnv* km_env, jclass km_clazz, jlong pcwszurl, jlong pcookie, jlong pcwszp3ppolicy, jint dwflags, jlong pdwcookiestate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetCookieEx2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pcookie, (void*)(uintptr_t)pcwszp3ppolicy, (uint32_t)dwflags, (void*)(uintptr_t)pdwcookiestate) : 0;
#else
    (void)pcwszurl;
    (void)pcookie;
    (void)pcwszp3ppolicy;
    (void)dwflags;
    (void)pdwcookiestate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetCookieExA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata, jint dwflags, jlong dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetCookieExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata, (uint32_t)dwflags, (uint64_t)dwreserved) : 0;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)dwflags;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetCookieExW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata, jint dwflags, jlong dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetCookieExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata, (uint32_t)dwflags, (uint64_t)dwreserved) : 0;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)dwflags;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetCookieW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong lpszcookiename, jlong lpszcookiedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetCookieW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)lpszcookiename, (void*)(uintptr_t)lpszcookiedata) : -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetDialState(JNIEnv* km_env, jclass km_clazz, jlong lpszconnectoid, jint dwstate, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetDialState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszconnectoid, (uint32_t)dwstate, (uint32_t)dwreserved) : -1;
#else
    (void)lpszconnectoid;
    (void)dwstate;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetDialStateA(JNIEnv* km_env, jclass km_clazz, jlong lpszconnectoid, jint dwstate, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetDialStateA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszconnectoid, (uint32_t)dwstate, (uint32_t)dwreserved) : -1;
#else
    (void)lpszconnectoid;
    (void)dwstate;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetDialStateW(JNIEnv* km_env, jclass km_clazz, jlong lpszconnectoid, jint dwstate, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetDialStateW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszconnectoid, (uint32_t)dwstate, (uint32_t)dwreserved) : -1;
#else
    (void)lpszconnectoid;
    (void)dwstate;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetFilePointer(JNIEnv* km_env, jclass km_clazz, jlong hfile, jint ldistancetomove, jlong lpdistancetomovehigh, jint dwmovemethod, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetFilePointer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (int32_t)ldistancetomove, (void*)(uintptr_t)lpdistancetomovehigh, (uint32_t)dwmovemethod, (uint64_t)dwcontext) : 0;
#else
    (void)hfile;
    (void)ldistancetomove;
    (void)lpdistancetomovehigh;
    (void)dwmovemethod;
    (void)dwcontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetOptionA(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jint dwoption, jlong lpbuffer, jint dwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetOptionA");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetOptionExA(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jint dwoption, jlong lpbuffer, jint dwbufferlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetOptionExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (uint32_t)dwoption, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbufferlength, (uint32_t)dwflags) : -1;
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)dwbufferlength;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetOptionExW(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jint dwoption, jlong lpbuffer, jint dwbufferlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetOptionExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (uint32_t)dwoption, (void*)(uintptr_t)lpbuffer, (uint32_t)dwbufferlength, (uint32_t)dwflags) : -1;
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)dwbufferlength;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetOptionW(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jint dwoption, jlong lpbuffer, jint dwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetOptionW");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetPerSiteCookieDecisionA(JNIEnv* km_env, jclass km_clazz, jlong pchhostname, jint dwdecision) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetPerSiteCookieDecisionA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pchhostname, (uint32_t)dwdecision) : -1;
#else
    (void)pchhostname;
    (void)dwdecision;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetPerSiteCookieDecisionW(JNIEnv* km_env, jclass km_clazz, jlong pchhostname, jint dwdecision) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetPerSiteCookieDecisionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pchhostname, (uint32_t)dwdecision) : -1;
#else
    (void)pchhostname;
    (void)dwdecision;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetStatusCallback(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lpfninternetcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetStatusCallback");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lpfninternetcallback) : NULL;
#else
    (void)hinternet;
    (void)lpfninternetcallback;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetStatusCallbackA(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lpfninternetcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetStatusCallbackA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lpfninternetcallback) : NULL;
#else
    (void)hinternet;
    (void)lpfninternetcallback;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetSetStatusCallbackW(JNIEnv* km_env, jclass km_clazz, jlong hinternet, jlong lpfninternetcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetStatusCallbackW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinternet, (void*)(uintptr_t)lpfninternetcallback) : NULL;
#else
    (void)hinternet;
    (void)lpfninternetcallback;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetShowSecurityInfoByURL(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong hwndparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetShowSecurityInfoByURL");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)hwndparent) : -1;
#else
    (void)lpszurl;
    (void)hwndparent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetShowSecurityInfoByURLA(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong hwndparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetShowSecurityInfoByURLA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)hwndparent) : -1;
#else
    (void)lpszurl;
    (void)hwndparent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetShowSecurityInfoByURLW(JNIEnv* km_env, jclass km_clazz, jlong lpszurl, jlong hwndparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetShowSecurityInfoByURLW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurl, (void*)(uintptr_t)hwndparent) : -1;
#else
    (void)lpszurl;
    (void)hwndparent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetTimeFromSystemTime(JNIEnv* km_env, jclass km_clazz, jlong pst, jint dwrfc, jlong lpsztime, jint cbtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeFromSystemTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pst, (uint32_t)dwrfc, (void*)(uintptr_t)lpsztime, (uint32_t)cbtime) : -1;
#else
    (void)pst;
    (void)dwrfc;
    (void)lpsztime;
    (void)cbtime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetTimeFromSystemTimeA(JNIEnv* km_env, jclass km_clazz, jlong pst, jint dwrfc, jlong lpsztime, jint cbtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeFromSystemTimeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pst, (uint32_t)dwrfc, (void*)(uintptr_t)lpsztime, (uint32_t)cbtime) : -1;
#else
    (void)pst;
    (void)dwrfc;
    (void)lpsztime;
    (void)cbtime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetTimeFromSystemTimeW(JNIEnv* km_env, jclass km_clazz, jlong pst, jint dwrfc, jlong lpsztime, jint cbtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeFromSystemTimeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pst, (uint32_t)dwrfc, (void*)(uintptr_t)lpsztime, (uint32_t)cbtime) : -1;
#else
    (void)pst;
    (void)dwrfc;
    (void)lpsztime;
    (void)cbtime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetTimeToSystemTime(JNIEnv* km_env, jclass km_clazz, jlong lpsztime, jlong pst, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeToSystemTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsztime, (void*)(uintptr_t)pst, (uint32_t)dwreserved) : -1;
#else
    (void)lpsztime;
    (void)pst;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetTimeToSystemTimeA(JNIEnv* km_env, jclass km_clazz, jlong lpsztime, jlong pst, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeToSystemTimeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsztime, (void*)(uintptr_t)pst, (uint32_t)dwreserved) : -1;
#else
    (void)lpsztime;
    (void)pst;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetTimeToSystemTimeW(JNIEnv* km_env, jclass km_clazz, jlong lpsztime, jlong pst, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeToSystemTimeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsztime, (void*)(uintptr_t)pst, (uint32_t)dwreserved) : -1;
#else
    (void)lpsztime;
    (void)pst;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetUnlockRequestFile(JNIEnv* km_env, jclass km_clazz, jlong hlockrequestinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetUnlockRequestFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlockrequestinfo) : -1;
#else
    (void)hlockrequestinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetWriteFile(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffer, jint dwnumberofbytestowrite, jlong lpdwnumberofbyteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetWriteFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffer, (uint32_t)dwnumberofbytestowrite, (void*)(uintptr_t)lpdwnumberofbyteswritten) : -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)dwnumberofbytestowrite;
    (void)lpdwnumberofbyteswritten;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetWriteFileExA(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffersin, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetWriteFileExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffersin, (uint32_t)dwflags, (uint64_t)dwcontext) : -1;
#else
    (void)hfile;
    (void)lpbuffersin;
    (void)dwflags;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1internetWriteFileExW(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffersin, jint dwflags, jlong dwcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetWriteFileExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffersin, (uint32_t)dwflags, (uint64_t)dwcontext) : -1;
#else
    (void)hfile;
    (void)lpbuffersin;
    (void)dwflags;
    (void)dwcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1isDomainLegalCookieDomainA(JNIEnv* km_env, jclass km_clazz, jlong pchdomain, jlong pchfulldomain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDomainLegalCookieDomainA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pchdomain, (void*)(uintptr_t)pchfulldomain) : -1;
#else
    (void)pchdomain;
    (void)pchfulldomain;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1isDomainLegalCookieDomainW(JNIEnv* km_env, jclass km_clazz, jlong pchdomain, jlong pchfulldomain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDomainLegalCookieDomainW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pchdomain, (void*)(uintptr_t)pchfulldomain) : -1;
#else
    (void)pchdomain;
    (void)pchfulldomain;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1isHostInProxyBypassList(JNIEnv* km_env, jclass km_clazz, jint tscheme, jlong lpszhost, jint cchhost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsHostInProxyBypassList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)tscheme, (void*)(uintptr_t)lpszhost, (uint32_t)cchhost) : -1;
#else
    (void)tscheme;
    (void)lpszhost;
    (void)cchhost;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1isProfilesEnabled(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProfilesEnabled");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1isUrlCacheEntryExpiredA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwflags, jlong pftlastmodified) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsUrlCacheEntryExpiredA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwflags, (void*)(uintptr_t)pftlastmodified) : -1;
#else
    (void)lpszurlname;
    (void)dwflags;
    (void)pftlastmodified;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1isUrlCacheEntryExpiredW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwflags, jlong pftlastmodified) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsUrlCacheEntryExpiredW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwflags, (void*)(uintptr_t)pftlastmodified) : -1;
#else
    (void)lpszurlname;
    (void)dwflags;
    (void)pftlastmodified;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1loadUrlCacheContent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadUrlCacheContent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1parseX509EncodedCertificateForListBoxEntry(JNIEnv* km_env, jclass km_clazz, jlong lpcert, jint cbcert, jlong lpszlistboxentry, jlong lpdwlistboxentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ParseX509EncodedCertificateForListBoxEntry");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcert, (uint32_t)cbcert, (void*)(uintptr_t)lpszlistboxentry, (void*)(uintptr_t)lpdwlistboxentry) : 0;
#else
    (void)lpcert;
    (void)cbcert;
    (void)lpszlistboxentry;
    (void)lpdwlistboxentry;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1performOperationOverUrlCacheA(JNIEnv* km_env, jclass km_clazz, jlong pszurlsearchpattern, jint dwflags, jint dwfilter, jlong groupid, jlong preserved1, jlong pdwreserved2, jlong preserved3, jlong op, jlong poperatordata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerformOperationOverUrlCacheA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurlsearchpattern, (uint32_t)dwflags, (uint32_t)dwfilter, (int64_t)groupid, (void*)(uintptr_t)preserved1, (void*)(uintptr_t)pdwreserved2, (void*)(uintptr_t)preserved3, (void*)(uintptr_t)op, (void*)(uintptr_t)poperatordata) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1privacyGetZonePreferenceW(JNIEnv* km_env, jclass km_clazz, jint dwzone, jint dwtype, jlong pdwtemplate, jlong pszbuffer, jlong pdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivacyGetZonePreferenceW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwzone, (uint32_t)dwtype, (void*)(uintptr_t)pdwtemplate, (void*)(uintptr_t)pszbuffer, (void*)(uintptr_t)pdwbufferlength) : 0;
#else
    (void)dwzone;
    (void)dwtype;
    (void)pdwtemplate;
    (void)pszbuffer;
    (void)pdwbufferlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1privacySetZonePreferenceW(JNIEnv* km_env, jclass km_clazz, jint dwzone, jint dwtype, jint dwtemplate, jlong pszpreference) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivacySetZonePreferenceW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwzone, (uint32_t)dwtype, (uint32_t)dwtemplate, (void*)(uintptr_t)pszpreference) : 0;
#else
    (void)dwzone;
    (void)dwtype;
    (void)dwtemplate;
    (void)pszpreference;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1readGuidsForConnectedNetworks(JNIEnv* km_env, jclass km_clazz, jlong pcnetworks, jlong pppwsznetworkguids, jlong pppbstrnetworknames, jlong pppwszgwmacs, jlong pcgatewaymacs, jlong pdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadGuidsForConnectedNetworks");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcnetworks, (void*)(uintptr_t)pppwsznetworkguids, (void*)(uintptr_t)pppbstrnetworknames, (void*)(uintptr_t)pppwszgwmacs, (void*)(uintptr_t)pcgatewaymacs, (void*)(uintptr_t)pdwflags) : -1;
#else
    (void)pcnetworks;
    (void)pppwsznetworkguids;
    (void)pppbstrnetworknames;
    (void)pppwszgwmacs;
    (void)pcgatewaymacs;
    (void)pdwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1readUrlCacheEntryStream(JNIEnv* km_env, jclass km_clazz, jlong hurlcachestream, jint dwlocation, jlong lpbuffer, jlong lpdwlen, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadUrlCacheEntryStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hurlcachestream, (uint32_t)dwlocation, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwlen, (uint32_t)reserved) : -1;
#else
    (void)hurlcachestream;
    (void)dwlocation;
    (void)lpbuffer;
    (void)lpdwlen;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1readUrlCacheEntryStreamEx(JNIEnv* km_env, jclass km_clazz, jlong hurlcachestream, jlong qwlocation, jlong lpbuffer, jlong lpdwlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadUrlCacheEntryStreamEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hurlcachestream, (uint64_t)qwlocation, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpdwlen) : -1;
#else
    (void)hurlcachestream;
    (void)qwlocation;
    (void)lpbuffer;
    (void)lpdwlen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1registerUrlCacheNotification(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint umsg, jlong gid, jint dwopsfilter, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterUrlCacheNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)umsg, (int64_t)gid, (uint32_t)dwopsfilter, (uint32_t)dwreserved) : -1;
#else
    (void)hwnd;
    (void)umsg;
    (void)gid;
    (void)dwopsfilter;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1resumeSuspendedDownload(JNIEnv* km_env, jclass km_clazz, jlong hrequest, jint dwresultcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResumeSuspendedDownload");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrequest, (uint32_t)dwresultcode) : -1;
#else
    (void)hrequest;
    (void)dwresultcode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1retrieveUrlCacheEntryFileA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RetrieveUrlCacheEntryFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (uint32_t)dwreserved) : -1;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1retrieveUrlCacheEntryFileW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RetrieveUrlCacheEntryFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (uint32_t)dwreserved) : -1;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1retrieveUrlCacheEntryStreamA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo, jint frandomread, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RetrieveUrlCacheEntryStreamA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (int32_t)frandomread, (uint32_t)dwreserved) : NULL;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)frandomread;
    (void)dwreserved;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1retrieveUrlCacheEntryStreamW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jlong lpcbcacheentryinfo, jint frandomread, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RetrieveUrlCacheEntryStreamW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (void*)(uintptr_t)lpcbcacheentryinfo, (int32_t)frandomread, (uint32_t)dwreserved) : NULL;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)frandomread;
    (void)dwreserved;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1runOnceUrlCache(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong hinst, jlong lpszcmd, jint ncmdshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RunOnceUrlCache");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)hinst, (void*)(uintptr_t)lpszcmd, (int32_t)ncmdshow) : 0;
#else
    (void)hwnd;
    (void)hinst;
    (void)lpszcmd;
    (void)ncmdshow;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1setUrlCacheConfigInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpcacheconfiginfo, jint dwfieldcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheConfigInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcacheconfiginfo, (uint32_t)dwfieldcontrol) : -1;
#else
    (void)lpcacheconfiginfo;
    (void)dwfieldcontrol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1setUrlCacheConfigInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpcacheconfiginfo, jint dwfieldcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheConfigInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcacheconfiginfo, (uint32_t)dwfieldcontrol) : -1;
#else
    (void)lpcacheconfiginfo;
    (void)dwfieldcontrol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1setUrlCacheEntryGroup(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwflags, jlong groupid, jlong pbgroupattributes, jint cbgroupattributes, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheEntryGroup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwflags, (int64_t)groupid, (void*)(uintptr_t)pbgroupattributes, (uint32_t)cbgroupattributes, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)lpszurlname;
    (void)dwflags;
    (void)groupid;
    (void)pbgroupattributes;
    (void)cbgroupattributes;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1setUrlCacheEntryGroupA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwflags, jlong groupid, jlong pbgroupattributes, jint cbgroupattributes, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheEntryGroupA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwflags, (int64_t)groupid, (void*)(uintptr_t)pbgroupattributes, (uint32_t)cbgroupattributes, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)lpszurlname;
    (void)dwflags;
    (void)groupid;
    (void)pbgroupattributes;
    (void)cbgroupattributes;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1setUrlCacheEntryGroupW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwflags, jlong groupid, jlong pbgroupattributes, jint cbgroupattributes, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheEntryGroupW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwflags, (int64_t)groupid, (void*)(uintptr_t)pbgroupattributes, (uint32_t)cbgroupattributes, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)lpszurlname;
    (void)dwflags;
    (void)groupid;
    (void)pbgroupattributes;
    (void)cbgroupattributes;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1setUrlCacheEntryInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jint dwfieldcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheEntryInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (uint32_t)dwfieldcontrol) : -1;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)dwfieldcontrol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1setUrlCacheEntryInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jlong lpcacheentryinfo, jint dwfieldcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheEntryInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (void*)(uintptr_t)lpcacheentryinfo, (uint32_t)dwfieldcontrol) : -1;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)dwfieldcontrol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1setUrlCacheGroupAttributeA(JNIEnv* km_env, jclass km_clazz, jlong gid, jint dwflags, jint dwattributes, jlong lpgroupinfo, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheGroupAttributeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)gid, (uint32_t)dwflags, (uint32_t)dwattributes, (void*)(uintptr_t)lpgroupinfo, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)gid;
    (void)dwflags;
    (void)dwattributes;
    (void)lpgroupinfo;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1setUrlCacheGroupAttributeW(JNIEnv* km_env, jclass km_clazz, jlong gid, jint dwflags, jint dwattributes, jlong lpgroupinfo, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheGroupAttributeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)gid, (uint32_t)dwflags, (uint32_t)dwattributes, (void*)(uintptr_t)lpgroupinfo, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)gid;
    (void)dwflags;
    (void)dwattributes;
    (void)lpgroupinfo;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1setUrlCacheHeaderData(JNIEnv* km_env, jclass km_clazz, jint nidx, jint dwdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheHeaderData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nidx, (uint32_t)dwdata) : -1;
#else
    (void)nidx;
    (void)dwdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1showClientAuthCerts(JNIEnv* km_env, jclass km_clazz, jlong hwndparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowClientAuthCerts");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent) : 0;
#else
    (void)hwndparent;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1showSecurityInfo(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong psecurityinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowSecurityInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)psecurityinfo) : 0;
#else
    (void)hwndparent;
    (void)psecurityinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1showX509EncodedCertificate(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong lpcert, jint cbcert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowX509EncodedCertificate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)lpcert, (uint32_t)cbcert) : 0;
#else
    (void)hwndparent;
    (void)lpcert;
    (void)cbcert;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1unlockUrlCacheEntryFile(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockUrlCacheEntryFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwreserved) : -1;
#else
    (void)lpszurlname;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1unlockUrlCacheEntryFileA(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockUrlCacheEntryFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwreserved) : -1;
#else
    (void)lpszurlname;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1unlockUrlCacheEntryFileW(JNIEnv* km_env, jclass km_clazz, jlong lpszurlname, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockUrlCacheEntryFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszurlname, (uint32_t)dwreserved) : -1;
#else
    (void)lpszurlname;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1unlockUrlCacheEntryStream(JNIEnv* km_env, jclass km_clazz, jlong hurlcachestream, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockUrlCacheEntryStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hurlcachestream, (uint32_t)reserved) : -1;
#else
    (void)hurlcachestream;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1updateUrlCacheContentPath(JNIEnv* km_env, jclass km_clazz, jlong sznewpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateUrlCacheContentPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sznewpath) : -1;
#else
    (void)sznewpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheCheckEntriesExist(JNIEnv* km_env, jclass km_clazz, jlong rgpwszurls, jint centries, jlong rgfexist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheCheckEntriesExist");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rgpwszurls, (uint32_t)centries, (void*)(uintptr_t)rgfexist) : 0;
#else
    (void)rgpwszurls;
    (void)centries;
    (void)rgfexist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheCloseEntryHandle(JNIEnv* km_env, jclass km_clazz, jlong hentryfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheCloseEntryHandle");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hentryfile);
#else
    (void)hentryfile;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheContainerSetEntryMaximumAge(JNIEnv* km_env, jclass km_clazz, jlong pwszprefix, jint dwentrymaxage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheContainerSetEntryMaximumAge");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszprefix, (uint32_t)dwentrymaxage) : 0;
#else
    (void)pwszprefix;
    (void)dwentrymaxage;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheCreateContainer(JNIEnv* km_env, jclass km_clazz, jlong pwszname, jlong pwszprefix, jlong pwszdirectory, jlong ulllimit, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheCreateContainer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszname, (void*)(uintptr_t)pwszprefix, (void*)(uintptr_t)pwszdirectory, (uint64_t)ulllimit, (uint32_t)dwoptions) : 0;
#else
    (void)pwszname;
    (void)pwszprefix;
    (void)pwszdirectory;
    (void)ulllimit;
    (void)dwoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheFindFirstEntry(JNIEnv* km_env, jclass km_clazz, jlong pwszprefix, jint dwflags, jint dwfilter, jlong groupid, jlong pcacheentryinfo, jlong phfind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheFindFirstEntry");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszprefix, (uint32_t)dwflags, (uint32_t)dwfilter, (int64_t)groupid, (void*)(uintptr_t)pcacheentryinfo, (void*)(uintptr_t)phfind) : 0;
#else
    (void)pwszprefix;
    (void)dwflags;
    (void)dwfilter;
    (void)groupid;
    (void)pcacheentryinfo;
    (void)phfind;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheFindNextEntry(JNIEnv* km_env, jclass km_clazz, jlong hfind, jlong pcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheFindNextEntry");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfind, (void*)(uintptr_t)pcacheentryinfo) : 0;
#else
    (void)hfind;
    (void)pcacheentryinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheFreeEntryInfo(JNIEnv* km_env, jclass km_clazz, jlong pcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheFreeEntryInfo");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pcacheentryinfo);
#else
    (void)pcacheentryinfo;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheFreeGlobalSpace(JNIEnv* km_env, jclass km_clazz, jlong ulltargetsize, jint dwfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheFreeGlobalSpace");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)ulltargetsize, (uint32_t)dwfilter) : 0;
#else
    (void)ulltargetsize;
    (void)dwfilter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheGetContentPaths(JNIEnv* km_env, jclass km_clazz, jlong pppwszdirectories, jlong pcdirectories) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheGetContentPaths");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pppwszdirectories, (void*)(uintptr_t)pcdirectories) : 0;
#else
    (void)pppwszdirectories;
    (void)pcdirectories;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheGetEntryInfo(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pcwszurl, jlong pcacheentryinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheGetEntryInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pcacheentryinfo) : 0;
#else
    (void)happcache;
    (void)pcwszurl;
    (void)pcacheentryinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheGetGlobalCacheSize(JNIEnv* km_env, jclass km_clazz, jint dwfilter, jlong pullsize, jlong pulllimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheGetGlobalCacheSize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwfilter, (void*)(uintptr_t)pullsize, (void*)(uintptr_t)pulllimit) : 0;
#else
    (void)dwfilter;
    (void)pullsize;
    (void)pulllimit;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheGetGlobalLimit(JNIEnv* km_env, jclass km_clazz, jint limittype, jlong pulllimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheGetGlobalLimit");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)limittype, (void*)(uintptr_t)pulllimit) : 0;
#else
    (void)limittype;
    (void)pulllimit;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheReadEntryStream(JNIEnv* km_env, jclass km_clazz, jlong hurlcachestream, jlong ulllocation, jlong pbuffer, jint dwbufferlen, jlong pdwbufferlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheReadEntryStream");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hurlcachestream, (uint64_t)ulllocation, (void*)(uintptr_t)pbuffer, (uint32_t)dwbufferlen, (void*)(uintptr_t)pdwbufferlen) : 0;
#else
    (void)hurlcachestream;
    (void)ulllocation;
    (void)pbuffer;
    (void)dwbufferlen;
    (void)pdwbufferlen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheReloadSettings(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheReloadSettings");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheRetrieveEntryFile(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pcwszurl, jlong pcacheentryinfo, jlong phentryfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheRetrieveEntryFile");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pcacheentryinfo, (void*)(uintptr_t)phentryfile) : 0;
#else
    (void)happcache;
    (void)pcwszurl;
    (void)pcacheentryinfo;
    (void)phentryfile;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheRetrieveEntryStream(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pcwszurl, jint frandomread, jlong pcacheentryinfo, jlong phentrystream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheRetrieveEntryStream");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pcwszurl, (int32_t)frandomread, (void*)(uintptr_t)pcacheentryinfo, (void*)(uintptr_t)phentrystream) : 0;
#else
    (void)happcache;
    (void)pcwszurl;
    (void)frandomread;
    (void)pcacheentryinfo;
    (void)phentrystream;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheServer(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheServer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheSetGlobalLimit(JNIEnv* km_env, jclass km_clazz, jint limittype, jlong ulllimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheSetGlobalLimit");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)limittype, (uint64_t)ulllimit) : 0;
#else
    (void)limittype;
    (void)ulllimit;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_wininet_WindowsWin32NetworkingWininetJniBridge_windowssys_1windows_1win32_1networking_1wininet_1urlCacheUpdateEntryExtraData(JNIEnv* km_env, jclass km_clazz, jlong happcache, jlong pcwszurl, jlong pbextradata, jint cbextradata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheUpdateEntryExtraData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)happcache, (void*)(uintptr_t)pcwszurl, (void*)(uintptr_t)pbextradata, (uint32_t)cbextradata) : 0;
#else
    (void)happcache;
    (void)pcwszurl;
    (void)pbextradata;
    (void)cbextradata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

