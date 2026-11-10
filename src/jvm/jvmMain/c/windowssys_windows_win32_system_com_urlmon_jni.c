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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coGetClassObjectFromURL(JNIEnv* km_env, jclass km_clazz, jlong rclassid, jlong szcode, jint dwfileversionms, jint dwfileversionls, jlong sztype, jlong pbindctx, jint dwclscontext, jlong pvreserved, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetClassObjectFromURL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rclassid, (void*)(uintptr_t)szcode, (uint32_t)dwfileversionms, (uint32_t)dwfileversionls, (void*)(uintptr_t)sztype, (void*)(uintptr_t)pbindctx, (uint32_t)dwclscontext, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rclassid;
    (void)szcode;
    (void)dwfileversionms;
    (void)dwfileversionls;
    (void)sztype;
    (void)pbindctx;
    (void)dwclscontext;
    (void)pvreserved;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetCombineIUri(JNIEnv* km_env, jclass km_clazz, jlong pbaseuri, jlong prelativeuri, jint dwcombineflags, jlong ppcombineduri, jlong dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetCombineIUri");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbaseuri, (void*)(uintptr_t)prelativeuri, (uint32_t)dwcombineflags, (void*)(uintptr_t)ppcombineduri, (uint64_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbaseuri;
    (void)prelativeuri;
    (void)dwcombineflags;
    (void)ppcombineduri;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetCombineUrl(JNIEnv* km_env, jclass km_clazz, jlong pwzbaseurl, jlong pwzrelativeurl, jint dwcombineflags, jlong pszresult, jint cchresult, jlong pcchresult, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetCombineUrl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzbaseurl, (void*)(uintptr_t)pwzrelativeurl, (uint32_t)dwcombineflags, (void*)(uintptr_t)pszresult, (uint32_t)cchresult, (void*)(uintptr_t)pcchresult, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzbaseurl;
    (void)pwzrelativeurl;
    (void)dwcombineflags;
    (void)pszresult;
    (void)cchresult;
    (void)pcchresult;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetCombineUrlEx(JNIEnv* km_env, jclass km_clazz, jlong pbaseuri, jlong pwzrelativeurl, jint dwcombineflags, jlong ppcombineduri, jlong dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetCombineUrlEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbaseuri, (void*)(uintptr_t)pwzrelativeurl, (uint32_t)dwcombineflags, (void*)(uintptr_t)ppcombineduri, (uint64_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbaseuri;
    (void)pwzrelativeurl;
    (void)dwcombineflags;
    (void)ppcombineduri;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetCompareUrl(JNIEnv* km_env, jclass km_clazz, jlong pwzurl1, jlong pwzurl2, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetCompareUrl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzurl1, (void*)(uintptr_t)pwzurl2, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzurl1;
    (void)pwzurl2;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetCreateSecurityManager(JNIEnv* km_env, jclass km_clazz, jlong psp, jlong ppsm, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetCreateSecurityManager");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psp, (void*)(uintptr_t)ppsm, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psp;
    (void)ppsm;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetCreateZoneManager(JNIEnv* km_env, jclass km_clazz, jlong psp, jlong ppzm, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetCreateZoneManager");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psp, (void*)(uintptr_t)ppzm, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psp;
    (void)ppzm;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetGetProtocolFlags(JNIEnv* km_env, jclass km_clazz, jlong pwzurl, jlong pdwflags, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetGetProtocolFlags");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzurl, (void*)(uintptr_t)pdwflags, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzurl;
    (void)pdwflags;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetGetSecurityUrl(JNIEnv* km_env, jclass km_clazz, jlong pwszurl, jlong ppwszsecurl, jint psuaction, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetGetSecurityUrl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszurl, (void*)(uintptr_t)ppwszsecurl, (int32_t)psuaction, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszurl;
    (void)ppwszsecurl;
    (void)psuaction;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetGetSecurityUrlEx(JNIEnv* km_env, jclass km_clazz, jlong puri, jlong ppsecuri, jint psuaction, jlong dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetGetSecurityUrlEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)puri, (void*)(uintptr_t)ppsecuri, (int32_t)psuaction, (uint64_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)puri;
    (void)ppsecuri;
    (void)psuaction;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetGetSession(JNIEnv* km_env, jclass km_clazz, jint dwsessionmode, jlong ppiinternetsession, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetGetSession");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwsessionmode, (void*)(uintptr_t)ppiinternetsession, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwsessionmode;
    (void)ppiinternetsession;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetIsFeatureEnabled(JNIEnv* km_env, jclass km_clazz, jint featureentry, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetIsFeatureEnabled");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)featureentry, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)featureentry;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetIsFeatureEnabledForIUri(JNIEnv* km_env, jclass km_clazz, jint featureentry, jint dwflags, jlong piuri, jlong psecmgr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetIsFeatureEnabledForIUri");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)featureentry, (uint32_t)dwflags, (void*)(uintptr_t)piuri, (void*)(uintptr_t)psecmgr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)featureentry;
    (void)dwflags;
    (void)piuri;
    (void)psecmgr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetIsFeatureEnabledForUrl(JNIEnv* km_env, jclass km_clazz, jint featureentry, jint dwflags, jlong szurl, jlong psecmgr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetIsFeatureEnabledForUrl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)featureentry, (uint32_t)dwflags, (void*)(uintptr_t)szurl, (void*)(uintptr_t)psecmgr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)featureentry;
    (void)dwflags;
    (void)szurl;
    (void)psecmgr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetIsFeatureZoneElevationEnabled(JNIEnv* km_env, jclass km_clazz, jlong szfromurl, jlong sztourl, jlong psecmgr, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetIsFeatureZoneElevationEnabled");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfromurl, (void*)(uintptr_t)sztourl, (void*)(uintptr_t)psecmgr, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szfromurl;
    (void)sztourl;
    (void)psecmgr;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetParseIUri(JNIEnv* km_env, jclass km_clazz, jlong piuri, jint parseaction, jint dwflags, jlong pwzresult, jint cchresult, jlong pcchresult, jlong dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetParseIUri");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)piuri, (int32_t)parseaction, (uint32_t)dwflags, (void*)(uintptr_t)pwzresult, (uint32_t)cchresult, (void*)(uintptr_t)pcchresult, (uint64_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)piuri;
    (void)parseaction;
    (void)dwflags;
    (void)pwzresult;
    (void)cchresult;
    (void)pcchresult;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetParseUrl(JNIEnv* km_env, jclass km_clazz, jlong pwzurl, jint parseaction, jint dwflags, jlong pszresult, jint cchresult, jlong pcchresult, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetParseUrl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzurl, (int32_t)parseaction, (uint32_t)dwflags, (void*)(uintptr_t)pszresult, (uint32_t)cchresult, (void*)(uintptr_t)pcchresult, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzurl;
    (void)parseaction;
    (void)dwflags;
    (void)pszresult;
    (void)cchresult;
    (void)pcchresult;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetQueryInfo(JNIEnv* km_env, jclass km_clazz, jlong pwzurl, jint queryoptions, jint dwqueryflags, jlong pvbuffer, jint cbbuffer, jlong pcbbuffer, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetQueryInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwzurl, (int32_t)queryoptions, (uint32_t)dwqueryflags, (void*)(uintptr_t)pvbuffer, (uint32_t)cbbuffer, (void*)(uintptr_t)pcbbuffer, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwzurl;
    (void)queryoptions;
    (void)dwqueryflags;
    (void)pvbuffer;
    (void)cbbuffer;
    (void)pcbbuffer;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1coInternetSetFeatureEnabled(JNIEnv* km_env, jclass km_clazz, jint featureentry, jint dwflags, jint fenable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoInternetSetFeatureEnabled");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)featureentry, (uint32_t)dwflags, (int32_t)fenable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)featureentry;
    (void)dwflags;
    (void)fenable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1compareSecurityIds(JNIEnv* km_env, jclass km_clazz, jlong pbsecurityid1, jint dwlen1, jlong pbsecurityid2, jint dwlen2, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompareSecurityIds");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbsecurityid1, (uint32_t)dwlen1, (void*)(uintptr_t)pbsecurityid2, (uint32_t)dwlen2, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbsecurityid1;
    (void)dwlen1;
    (void)pbsecurityid2;
    (void)dwlen2;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1compatFlagsFromClsid(JNIEnv* km_env, jclass km_clazz, jlong pclsid, jlong pdwcompatflags, jlong pdwmiscstatusflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompatFlagsFromClsid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pclsid, (void*)(uintptr_t)pdwcompatflags, (void*)(uintptr_t)pdwmiscstatusflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pclsid;
    (void)pdwcompatflags;
    (void)pdwmiscstatusflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1copyBindInfo(JNIEnv* km_env, jclass km_clazz, jlong pcbisrc, jlong pbidest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyBindInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcbisrc, (void*)(uintptr_t)pbidest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcbisrc;
    (void)pbidest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1copyStgMedium(JNIEnv* km_env, jclass km_clazz, jlong pcstgmedsrc, jlong pstgmeddest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyStgMedium");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcstgmedsrc, (void*)(uintptr_t)pstgmeddest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcstgmedsrc;
    (void)pstgmeddest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1createAsyncBindCtx(JNIEnv* km_env, jclass km_clazz, jint reserved, jlong pbscb, jlong pefetc, jlong ppbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateAsyncBindCtx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)reserved, (void*)(uintptr_t)pbscb, (void*)(uintptr_t)pefetc, (void*)(uintptr_t)ppbc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reserved;
    (void)pbscb;
    (void)pefetc;
    (void)ppbc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1createAsyncBindCtxEx(JNIEnv* km_env, jclass km_clazz, jlong pbc, jint dwoptions, jlong pbscb, jlong penum, jlong ppbc, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateAsyncBindCtxEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbc, (uint32_t)dwoptions, (void*)(uintptr_t)pbscb, (void*)(uintptr_t)penum, (void*)(uintptr_t)ppbc, (uint32_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbc;
    (void)dwoptions;
    (void)pbscb;
    (void)penum;
    (void)ppbc;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1createFormatEnumerator(JNIEnv* km_env, jclass km_clazz, jint cfmtetc, jlong rgfmtetc, jlong ppenumfmtetc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFormatEnumerator");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)cfmtetc, (void*)(uintptr_t)rgfmtetc, (void*)(uintptr_t)ppenumfmtetc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cfmtetc;
    (void)rgfmtetc;
    (void)ppenumfmtetc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1createURLMoniker(JNIEnv* km_env, jclass km_clazz, jlong pmkctx, jlong szurl, jlong ppmk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateURLMoniker");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmkctx, (void*)(uintptr_t)szurl, (void*)(uintptr_t)ppmk);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmkctx;
    (void)szurl;
    (void)ppmk;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1createURLMonikerEx(JNIEnv* km_env, jclass km_clazz, jlong pmkctx, jlong szurl, jlong ppmk, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateURLMonikerEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmkctx, (void*)(uintptr_t)szurl, (void*)(uintptr_t)ppmk, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmkctx;
    (void)szurl;
    (void)ppmk;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1createURLMonikerEx2(JNIEnv* km_env, jclass km_clazz, jlong pmkctx, jlong puri, jlong ppmk, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateURLMonikerEx2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmkctx, (void*)(uintptr_t)puri, (void*)(uintptr_t)ppmk, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmkctx;
    (void)puri;
    (void)ppmk;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1faultInIEFeature(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pclassspec, jlong pquery, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaultInIEFeature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pclassspec, (void*)(uintptr_t)pquery, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)pclassspec;
    (void)pquery;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1findMediaType(JNIEnv* km_env, jclass km_clazz, jlong rgsztypes, jlong rgcftypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindMediaType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rgsztypes, (void*)(uintptr_t)rgcftypes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rgsztypes;
    (void)rgcftypes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1findMediaTypeClass(JNIEnv* km_env, jclass km_clazz, jlong pbc, jlong sztype, jlong pclsid, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindMediaTypeClass");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbc, (void*)(uintptr_t)sztype, (void*)(uintptr_t)pclsid, (uint32_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbc;
    (void)sztype;
    (void)pclsid;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1findMimeFromData(JNIEnv* km_env, jclass km_clazz, jlong pbc, jlong pwzurl, jlong pbuffer, jint cbsize, jlong pwzmimeproposed, jint dwmimeflags, jlong ppwzmimeout, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindMimeFromData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbc, (void*)(uintptr_t)pwzurl, (void*)(uintptr_t)pbuffer, (uint32_t)cbsize, (void*)(uintptr_t)pwzmimeproposed, (uint32_t)dwmimeflags, (void*)(uintptr_t)ppwzmimeout, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbc;
    (void)pwzurl;
    (void)pbuffer;
    (void)cbsize;
    (void)pwzmimeproposed;
    (void)dwmimeflags;
    (void)ppwzmimeout;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1getClassFileOrMime(JNIEnv* km_env, jclass km_clazz, jlong pbc, jlong szfilename, jlong pbuffer, jint cbsize, jlong szmime, jint dwreserved, jlong pclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassFileOrMime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbc, (void*)(uintptr_t)szfilename, (void*)(uintptr_t)pbuffer, (uint32_t)cbsize, (void*)(uintptr_t)szmime, (uint32_t)dwreserved, (void*)(uintptr_t)pclsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbc;
    (void)szfilename;
    (void)pbuffer;
    (void)cbsize;
    (void)szmime;
    (void)dwreserved;
    (void)pclsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1getClassURL(JNIEnv* km_env, jclass km_clazz, jlong szurl, jlong pclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassURL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szurl, (void*)(uintptr_t)pclsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szurl;
    (void)pclsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1getComponentIDFromCLSSPEC(JNIEnv* km_env, jclass km_clazz, jlong pclassspec, jlong ppszcomponentid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComponentIDFromCLSSPEC");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pclassspec, (void*)(uintptr_t)ppszcomponentid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pclassspec;
    (void)ppszcomponentid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1getSoftwareUpdateInfo(JNIEnv* km_env, jclass km_clazz, jlong szdistunit, jlong psdi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSoftwareUpdateInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdistunit, (void*)(uintptr_t)psdi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szdistunit;
    (void)psdi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1hlinkGoBack(JNIEnv* km_env, jclass km_clazz, jlong punk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkGoBack");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)punk);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punk;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1hlinkGoForward(JNIEnv* km_env, jclass km_clazz, jlong punk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkGoForward");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)punk);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punk;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1hlinkNavigateMoniker(JNIEnv* km_env, jclass km_clazz, jlong punk, jlong pmktarget) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkNavigateMoniker");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)punk, (void*)(uintptr_t)pmktarget);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punk;
    (void)pmktarget;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1hlinkNavigateString(JNIEnv* km_env, jclass km_clazz, jlong punk, jlong sztarget) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkNavigateString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)punk, (void*)(uintptr_t)sztarget);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punk;
    (void)sztarget;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1hlinkSimpleNavigateToMoniker(JNIEnv* km_env, jclass km_clazz, jlong pmktarget, jlong szlocation, jlong sztargetframename, jlong punk, jlong pbc, jlong param5, jint grfhlnf, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkSimpleNavigateToMoniker");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmktarget, (void*)(uintptr_t)szlocation, (void*)(uintptr_t)sztargetframename, (void*)(uintptr_t)punk, (void*)(uintptr_t)pbc, (void*)(uintptr_t)param5, (uint32_t)grfhlnf, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmktarget;
    (void)szlocation;
    (void)sztargetframename;
    (void)punk;
    (void)pbc;
    (void)param5;
    (void)grfhlnf;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1hlinkSimpleNavigateToString(JNIEnv* km_env, jclass km_clazz, jlong sztarget, jlong szlocation, jlong sztargetframename, jlong punk, jlong pbc, jlong param5, jint grfhlnf, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkSimpleNavigateToString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sztarget, (void*)(uintptr_t)szlocation, (void*)(uintptr_t)sztargetframename, (void*)(uintptr_t)punk, (void*)(uintptr_t)pbc, (void*)(uintptr_t)param5, (uint32_t)grfhlnf, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sztarget;
    (void)szlocation;
    (void)sztargetframename;
    (void)punk;
    (void)pbc;
    (void)param5;
    (void)grfhlnf;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1iEGetUserPrivateNamespaceName(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEGetUserPrivateNamespaceName");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1iEInstallScope(JNIEnv* km_env, jclass km_clazz, jlong pdwscope) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IEInstallScope");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdwscope);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdwscope;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1isAsyncMoniker(JNIEnv* km_env, jclass km_clazz, jlong pmk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsAsyncMoniker");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmk);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmk;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1isLoggingEnabledA(JNIEnv* km_env, jclass km_clazz, jlong pszurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsLoggingEnabledA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszurl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszurl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1isLoggingEnabledW(JNIEnv* km_env, jclass km_clazz, jlong pwszurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsLoggingEnabledW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszurl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszurl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1isValidURL(JNIEnv* km_env, jclass km_clazz, jlong pbc, jlong szurl, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidURL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbc, (void*)(uintptr_t)szurl, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbc;
    (void)szurl;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1mkParseDisplayNameEx(JNIEnv* km_env, jclass km_clazz, jlong pbc, jlong szdisplayname, jlong pcheaten, jlong ppmk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MkParseDisplayNameEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbc, (void*)(uintptr_t)szdisplayname, (void*)(uintptr_t)pcheaten, (void*)(uintptr_t)ppmk);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbc;
    (void)szdisplayname;
    (void)pcheaten;
    (void)ppmk;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1obtainUserAgentString(JNIEnv* km_env, jclass km_clazz, jint dwoption, jlong pszuaout, jlong cbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObtainUserAgentString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwoption, (void*)(uintptr_t)pszuaout, (void*)(uintptr_t)cbsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwoption;
    (void)pszuaout;
    (void)cbsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1registerBindStatusCallback(JNIEnv* km_env, jclass km_clazz, jlong pbc, jlong pbscb, jlong ppbscbprev, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterBindStatusCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbc, (void*)(uintptr_t)pbscb, (void*)(uintptr_t)ppbscbprev, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbc;
    (void)pbscb;
    (void)ppbscbprev;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1registerFormatEnumerator(JNIEnv* km_env, jclass km_clazz, jlong pbc, jlong pefetc, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterFormatEnumerator");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbc, (void*)(uintptr_t)pefetc, (uint32_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbc;
    (void)pefetc;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1registerMediaTypeClass(JNIEnv* km_env, jclass km_clazz, jlong pbc, jint ctypes, jlong rgsztypes, jlong rgclsid, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterMediaTypeClass");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbc, (uint32_t)ctypes, (void*)(uintptr_t)rgsztypes, (void*)(uintptr_t)rgclsid, (uint32_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbc;
    (void)ctypes;
    (void)rgsztypes;
    (void)rgclsid;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1registerMediaTypes(JNIEnv* km_env, jclass km_clazz, jint ctypes, jlong rgsztypes, jlong rgcftypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterMediaTypes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ctypes, (void*)(uintptr_t)rgsztypes, (void*)(uintptr_t)rgcftypes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ctypes;
    (void)rgsztypes;
    (void)rgcftypes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1releaseBindInfo(JNIEnv* km_env, jclass km_clazz, jlong pbindinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseBindInfo");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pbindinfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pbindinfo;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1revokeBindStatusCallback(JNIEnv* km_env, jclass km_clazz, jlong pbc, jlong pbscb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevokeBindStatusCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbc, (void*)(uintptr_t)pbscb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbc;
    (void)pbscb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1revokeFormatEnumerator(JNIEnv* km_env, jclass km_clazz, jlong pbc, jlong pefetc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevokeFormatEnumerator");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbc, (void*)(uintptr_t)pefetc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbc;
    (void)pefetc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1setAccessForIEAppContainer(JNIEnv* km_env, jclass km_clazz, jlong hobject, jint ieobjecttype, jint dwaccessmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAccessForIEAppContainer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hobject, (int32_t)ieobjecttype, (uint32_t)dwaccessmask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobject;
    (void)ieobjecttype;
    (void)dwaccessmask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1setSoftwareUpdateAdvertisementState(JNIEnv* km_env, jclass km_clazz, jlong szdistunit, jint dwadstate, jint dwadvertisedversionms, jint dwadvertisedversionls) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSoftwareUpdateAdvertisementState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdistunit, (uint32_t)dwadstate, (uint32_t)dwadvertisedversionms, (uint32_t)dwadvertisedversionls);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szdistunit;
    (void)dwadstate;
    (void)dwadvertisedversionms;
    (void)dwadvertisedversionls;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1uRLDownloadToCacheFileA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint cchfilename, jint param4, jlong param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLDownloadToCacheFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (uint32_t)cchfilename, (uint32_t)param4, (void*)(uintptr_t)param5);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)cchfilename;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1uRLDownloadToCacheFileW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint cchfilename, jint param4, jlong param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLDownloadToCacheFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (uint32_t)cchfilename, (uint32_t)param4, (void*)(uintptr_t)param5);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)cchfilename;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1uRLDownloadToFileA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLDownloadToFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (void*)(uintptr_t)param4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1uRLDownloadToFileW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLDownloadToFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (void*)(uintptr_t)param4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1uRLOpenBlockingStreamA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLOpenBlockingStreamA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (void*)(uintptr_t)param4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1uRLOpenBlockingStreamW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLOpenBlockingStreamW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (void*)(uintptr_t)param4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1uRLOpenPullStreamA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLOpenPullStreamA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1uRLOpenPullStreamW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLOpenPullStreamW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1uRLOpenStreamA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLOpenStreamA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1uRLOpenStreamW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "URLOpenStreamW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1urlMkGetSessionOption(JNIEnv* km_env, jclass km_clazz, jint dwoption, jlong pbuffer, jint dwbufferlength, jlong pdwbufferlengthout, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlMkGetSessionOption");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwoption, (void*)(uintptr_t)pbuffer, (uint32_t)dwbufferlength, (void*)(uintptr_t)pdwbufferlengthout, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwoption;
    (void)pbuffer;
    (void)dwbufferlength;
    (void)pdwbufferlengthout;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1urlMkSetSessionOption(JNIEnv* km_env, jclass km_clazz, jint dwoption, jlong pbuffer, jint dwbufferlength, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlMkSetSessionOption");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwoption, (void*)(uintptr_t)pbuffer, (uint32_t)dwbufferlength, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwoption;
    (void)pbuffer;
    (void)dwbufferlength;
    (void)dwreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_urlmon_WindowsWin32SystemComUrlmonJniBridge_windowssys_1windows_1win32_1system_1com_1urlmon_1writeHitLogging(JNIEnv* km_env, jclass km_clazz, jlong lplogginginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("urlmon.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteHitLogging");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lplogginginfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lplogginginfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

