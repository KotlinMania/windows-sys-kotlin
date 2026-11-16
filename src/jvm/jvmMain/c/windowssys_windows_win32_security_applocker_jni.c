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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_applocker_WindowsWin32SecurityApplockerJniBridge_windowssysWindowsWin32SecurityApplockerSaferCloseLevel(JNIEnv* km_env, jclass km_clazz, jlong hlevelhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferCloseLevel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlevelhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlevelhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_applocker_WindowsWin32SecurityApplockerJniBridge_windowssysWindowsWin32SecurityApplockerSaferComputeTokenFromLevel(JNIEnv* km_env, jclass km_clazz, jlong levelhandle, jlong inaccesstoken, jlong outaccesstoken, jint dwflags, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferComputeTokenFromLevel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)levelhandle, (void*)(uintptr_t)inaccesstoken, (void*)(uintptr_t)outaccesstoken, (uint32_t)dwflags, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)levelhandle;
    (void)inaccesstoken;
    (void)outaccesstoken;
    (void)dwflags;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_applocker_WindowsWin32SecurityApplockerJniBridge_windowssysWindowsWin32SecurityApplockerSaferCreateLevel(JNIEnv* km_env, jclass km_clazz, jint dwscopeid, jint dwlevelid, jint openflags, jlong plevelhandle, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferCreateLevel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwscopeid, (uint32_t)dwlevelid, (uint32_t)openflags, (void*)(uintptr_t)plevelhandle, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwscopeid;
    (void)dwlevelid;
    (void)openflags;
    (void)plevelhandle;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_applocker_WindowsWin32SecurityApplockerJniBridge_windowssysWindowsWin32SecurityApplockerSaferGetLevelInformation(JNIEnv* km_env, jclass km_clazz, jlong levelhandle, jint dwinfotype, jlong lpquerybuffer, jint dwinbuffersize, jlong lpdwoutbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferGetLevelInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)levelhandle, (int32_t)dwinfotype, (void*)(uintptr_t)lpquerybuffer, (uint32_t)dwinbuffersize, (void*)(uintptr_t)lpdwoutbuffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)levelhandle;
    (void)dwinfotype;
    (void)lpquerybuffer;
    (void)dwinbuffersize;
    (void)lpdwoutbuffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_applocker_WindowsWin32SecurityApplockerJniBridge_windowssysWindowsWin32SecurityApplockerSaferGetPolicyInformation(JNIEnv* km_env, jclass km_clazz, jint dwscopeid, jint saferpolicyinfoclass, jint infobuffersize, jlong infobuffer, jlong infobufferretsize, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferGetPolicyInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwscopeid, (int32_t)saferpolicyinfoclass, (uint32_t)infobuffersize, (void*)(uintptr_t)infobuffer, (void*)(uintptr_t)infobufferretsize, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwscopeid;
    (void)saferpolicyinfoclass;
    (void)infobuffersize;
    (void)infobuffer;
    (void)infobufferretsize;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_applocker_WindowsWin32SecurityApplockerJniBridge_windowssysWindowsWin32SecurityApplockerSaferIdentifyLevel(JNIEnv* km_env, jclass km_clazz, jint dwnumproperties, jlong pcodeproperties, jlong plevelhandle, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferIdentifyLevel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwnumproperties, (void*)(uintptr_t)pcodeproperties, (void*)(uintptr_t)plevelhandle, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwnumproperties;
    (void)pcodeproperties;
    (void)plevelhandle;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_applocker_WindowsWin32SecurityApplockerJniBridge_windowssysWindowsWin32SecurityApplockerSaferRecordEventLogEntry(JNIEnv* km_env, jclass km_clazz, jlong hlevel, jlong sztargetpath, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferRecordEventLogEntry");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlevel, (void*)(uintptr_t)sztargetpath, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlevel;
    (void)sztargetpath;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_applocker_WindowsWin32SecurityApplockerJniBridge_windowssysWindowsWin32SecurityApplockerSaferSetLevelInformation(JNIEnv* km_env, jclass km_clazz, jlong levelhandle, jint dwinfotype, jlong lpquerybuffer, jint dwinbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferSetLevelInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)levelhandle, (int32_t)dwinfotype, (void*)(uintptr_t)lpquerybuffer, (uint32_t)dwinbuffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)levelhandle;
    (void)dwinfotype;
    (void)lpquerybuffer;
    (void)dwinbuffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_applocker_WindowsWin32SecurityApplockerJniBridge_windowssysWindowsWin32SecurityApplockerSaferSetPolicyInformation(JNIEnv* km_env, jclass km_clazz, jint dwscopeid, jint saferpolicyinfoclass, jint infobuffersize, jlong infobuffer, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferSetPolicyInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwscopeid, (int32_t)saferpolicyinfoclass, (uint32_t)infobuffersize, (void*)(uintptr_t)infobuffer, (void*)(uintptr_t)lpreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwscopeid;
    (void)saferpolicyinfoclass;
    (void)infobuffersize;
    (void)infobuffer;
    (void)lpreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_applocker_WindowsWin32SecurityApplockerJniBridge_windowssysWindowsWin32SecurityApplockerSaferiIsExecutableFileType(JNIEnv* km_env, jclass km_clazz, jlong szfullpathname, jboolean bfromshellexecute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaferiIsExecutableFileType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfullpathname, (bool)bfromshellexecute);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szfullpathname;
    (void)bfromshellexecute;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

