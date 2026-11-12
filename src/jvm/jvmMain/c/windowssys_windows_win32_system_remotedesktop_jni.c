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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopProcessIdToSessionId(JNIEnv* km_env, jclass km_clazz, jint dwprocessid, jlong psessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessIdToSessionId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwprocessid, (void*)(uintptr_t)psessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwprocessid;
    (void)psessionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSCloseServer(JNIEnv* km_env, jclass km_clazz, jlong hserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSCloseServer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hserver);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hserver;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionA(JNIEnv* km_env, jclass km_clazz, jint logonid, jint targetlogonid, jlong ppassword, jint bwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSConnectSessionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)logonid, (uint32_t)targetlogonid, (void*)(uintptr_t)ppassword, (int32_t)bwait);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)logonid;
    (void)targetlogonid;
    (void)ppassword;
    (void)bwait;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionW(JNIEnv* km_env, jclass km_clazz, jint logonid, jint targetlogonid, jlong ppassword, jint bwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSConnectSessionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)logonid, (uint32_t)targetlogonid, (void*)(uintptr_t)ppassword, (int32_t)bwait);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)logonid;
    (void)targetlogonid;
    (void)ppassword;
    (void)bwait;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerA(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong preserved, jint reserved, jlong plistenername, jlong pbuffer, jint flag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSCreateListenerA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)preserved, (uint32_t)reserved, (void*)(uintptr_t)plistenername, (void*)(uintptr_t)pbuffer, (uint32_t)flag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)pbuffer;
    (void)flag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerW(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong preserved, jint reserved, jlong plistenername, jlong pbuffer, jint flag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSCreateListenerW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)preserved, (uint32_t)reserved, (void*)(uintptr_t)plistenername, (void*)(uintptr_t)pbuffer, (uint32_t)flag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)pbuffer;
    (void)flag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSDisconnectSession(JNIEnv* km_env, jclass km_clazz, jlong hserver, jint sessionid, jint bwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSDisconnectSession");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (uint32_t)sessionid, (int32_t)bwait);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)sessionid;
    (void)bwait;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSEnableChildSessions(JNIEnv* km_env, jclass km_clazz, jint benable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnableChildSessions");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)benable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)benable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersA(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong preserved, jint reserved, jlong plisteners, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateListenersA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)preserved, (uint32_t)reserved, (void*)(uintptr_t)plisteners, (void*)(uintptr_t)pcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plisteners;
    (void)pcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersW(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong preserved, jint reserved, jlong plisteners, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateListenersW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)preserved, (uint32_t)reserved, (void*)(uintptr_t)plisteners, (void*)(uintptr_t)pcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plisteners;
    (void)pcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesA(JNIEnv* km_env, jclass km_clazz, jlong hserver, jint reserved, jint version, jlong ppprocessinfo, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateProcessesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (uint32_t)reserved, (uint32_t)version, (void*)(uintptr_t)ppprocessinfo, (void*)(uintptr_t)pcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)reserved;
    (void)version;
    (void)ppprocessinfo;
    (void)pcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExA(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong plevel, jint sessionid, jlong ppprocessinfo, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateProcessesExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)plevel, (uint32_t)sessionid, (void*)(uintptr_t)ppprocessinfo, (void*)(uintptr_t)pcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)plevel;
    (void)sessionid;
    (void)ppprocessinfo;
    (void)pcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExW(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong plevel, jint sessionid, jlong ppprocessinfo, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateProcessesExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)plevel, (uint32_t)sessionid, (void*)(uintptr_t)ppprocessinfo, (void*)(uintptr_t)pcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)plevel;
    (void)sessionid;
    (void)ppprocessinfo;
    (void)pcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesW(JNIEnv* km_env, jclass km_clazz, jlong hserver, jint reserved, jint version, jlong ppprocessinfo, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateProcessesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (uint32_t)reserved, (uint32_t)version, (void*)(uintptr_t)ppprocessinfo, (void*)(uintptr_t)pcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)reserved;
    (void)version;
    (void)ppprocessinfo;
    (void)pcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersA(JNIEnv* km_env, jclass km_clazz, jlong pdomainname, jint reserved, jint version, jlong ppserverinfo, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateServersA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdomainname, (uint32_t)reserved, (uint32_t)version, (void*)(uintptr_t)ppserverinfo, (void*)(uintptr_t)pcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdomainname;
    (void)reserved;
    (void)version;
    (void)ppserverinfo;
    (void)pcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersW(JNIEnv* km_env, jclass km_clazz, jlong pdomainname, jint reserved, jint version, jlong ppserverinfo, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateServersW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdomainname, (uint32_t)reserved, (uint32_t)version, (void*)(uintptr_t)ppserverinfo, (void*)(uintptr_t)pcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdomainname;
    (void)reserved;
    (void)version;
    (void)ppserverinfo;
    (void)pcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsA(JNIEnv* km_env, jclass km_clazz, jlong hserver, jint reserved, jint version, jlong ppsessioninfo, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateSessionsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (uint32_t)reserved, (uint32_t)version, (void*)(uintptr_t)ppsessioninfo, (void*)(uintptr_t)pcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)reserved;
    (void)version;
    (void)ppsessioninfo;
    (void)pcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExA(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong plevel, jint filter, jlong ppsessioninfo, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateSessionsExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)plevel, (uint32_t)filter, (void*)(uintptr_t)ppsessioninfo, (void*)(uintptr_t)pcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)plevel;
    (void)filter;
    (void)ppsessioninfo;
    (void)pcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExW(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong plevel, jint filter, jlong ppsessioninfo, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateSessionsExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)plevel, (uint32_t)filter, (void*)(uintptr_t)ppsessioninfo, (void*)(uintptr_t)pcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)plevel;
    (void)filter;
    (void)ppsessioninfo;
    (void)pcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsW(JNIEnv* km_env, jclass km_clazz, jlong hserver, jint reserved, jint version, jlong ppsessioninfo, jlong pcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSEnumerateSessionsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (uint32_t)reserved, (uint32_t)version, (void*)(uintptr_t)ppsessioninfo, (void*)(uintptr_t)pcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)reserved;
    (void)version;
    (void)ppsessioninfo;
    (void)pcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSFreeMemory(JNIEnv* km_env, jclass km_clazz, jlong pmemory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSFreeMemory");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pmemory);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pmemory;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExA(JNIEnv* km_env, jclass km_clazz, jint wtstypeclass, jlong pmemory, jint numberofentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSFreeMemoryExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)wtstypeclass, (void*)(uintptr_t)pmemory, (uint32_t)numberofentries);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wtstypeclass;
    (void)pmemory;
    (void)numberofentries;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExW(JNIEnv* km_env, jclass km_clazz, jint wtstypeclass, jlong pmemory, jint numberofentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSFreeMemoryExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)wtstypeclass, (void*)(uintptr_t)pmemory, (uint32_t)numberofentries);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wtstypeclass;
    (void)pmemory;
    (void)numberofentries;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSGetActiveConsoleSessionId(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSGetActiveConsoleSessionId");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSGetChildSessionId(JNIEnv* km_env, jclass km_clazz, jlong psessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSGetChildSessionId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psessionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityA(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong preserved, jint reserved, jlong plistenername, jint securityinformation, jlong psecuritydescriptor, jint nlength, jlong lpnlengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSGetListenerSecurityA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)preserved, (uint32_t)reserved, (void*)(uintptr_t)plistenername, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor, (uint32_t)nlength, (void*)(uintptr_t)lpnlengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)securityinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityW(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong preserved, jint reserved, jlong plistenername, jint securityinformation, jlong psecuritydescriptor, jint nlength, jlong lpnlengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSGetListenerSecurityW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)preserved, (uint32_t)reserved, (void*)(uintptr_t)plistenername, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor, (uint32_t)nlength, (void*)(uintptr_t)lpnlengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)securityinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSIsChildSessionsEnabled(JNIEnv* km_env, jclass km_clazz, jlong pbenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSIsChildSessionsEnabled");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbenabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbenabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSLogoffSession(JNIEnv* km_env, jclass km_clazz, jlong hserver, jint sessionid, jint bwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSLogoffSession");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (uint32_t)sessionid, (int32_t)bwait);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)sessionid;
    (void)bwait;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSOpenServerA(JNIEnv* km_env, jclass km_clazz, jlong pservername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSOpenServerA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pservername);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pservername;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExA(JNIEnv* km_env, jclass km_clazz, jlong pservername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSOpenServerExA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pservername);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pservername;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExW(JNIEnv* km_env, jclass km_clazz, jlong pservername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSOpenServerExW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pservername);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pservername;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSOpenServerW(JNIEnv* km_env, jclass km_clazz, jlong pservername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSOpenServerW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pservername);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pservername;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigA(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong preserved, jint reserved, jlong plistenername, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSQueryListenerConfigA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)preserved, (uint32_t)reserved, (void*)(uintptr_t)plistenername, (void*)(uintptr_t)pbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)pbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigW(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong preserved, jint reserved, jlong plistenername, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSQueryListenerConfigW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)preserved, (uint32_t)reserved, (void*)(uintptr_t)plistenername, (void*)(uintptr_t)pbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)pbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationA(JNIEnv* km_env, jclass km_clazz, jlong hserver, jint sessionid, jint wtsinfoclass, jlong ppbuffer, jlong pbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSQuerySessionInformationA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (uint32_t)sessionid, (int32_t)wtsinfoclass, (void*)(uintptr_t)ppbuffer, (void*)(uintptr_t)pbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)sessionid;
    (void)wtsinfoclass;
    (void)ppbuffer;
    (void)pbytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationW(JNIEnv* km_env, jclass km_clazz, jlong hserver, jint sessionid, jint wtsinfoclass, jlong ppbuffer, jlong pbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSQuerySessionInformationW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (uint32_t)sessionid, (int32_t)wtsinfoclass, (void*)(uintptr_t)ppbuffer, (void*)(uintptr_t)pbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)sessionid;
    (void)wtsinfoclass;
    (void)ppbuffer;
    (void)pbytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigA(JNIEnv* km_env, jclass km_clazz, jlong pservername, jlong pusername, jint wtsconfigclass, jlong ppbuffer, jlong pbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSQueryUserConfigA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pservername, (void*)(uintptr_t)pusername, (int32_t)wtsconfigclass, (void*)(uintptr_t)ppbuffer, (void*)(uintptr_t)pbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pservername;
    (void)pusername;
    (void)wtsconfigclass;
    (void)ppbuffer;
    (void)pbytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigW(JNIEnv* km_env, jclass km_clazz, jlong pservername, jlong pusername, jint wtsconfigclass, jlong ppbuffer, jlong pbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSQueryUserConfigW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pservername, (void*)(uintptr_t)pusername, (int32_t)wtsconfigclass, (void*)(uintptr_t)ppbuffer, (void*)(uintptr_t)pbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pservername;
    (void)pusername;
    (void)wtsconfigclass;
    (void)ppbuffer;
    (void)pbytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSQueryUserToken(JNIEnv* km_env, jclass km_clazz, jint sessionid, jlong phtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSQueryUserToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)sessionid, (void*)(uintptr_t)phtoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sessionid;
    (void)phtoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotification(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSRegisterSessionNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotificationEx(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong hwnd, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSRegisterSessionNotificationEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)hwnd, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)hwnd;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSSendMessageA(JNIEnv* km_env, jclass km_clazz, jlong hserver, jint sessionid, jlong ptitle, jint titlelength, jlong pmessage, jint messagelength, jint style, jint timeout, jlong presponse, jint bwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSSendMessageA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (uint32_t)sessionid, (void*)(uintptr_t)ptitle, (uint32_t)titlelength, (void*)(uintptr_t)pmessage, (uint32_t)messagelength, (uint32_t)style, (uint32_t)timeout, (void*)(uintptr_t)presponse, (int32_t)bwait);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)sessionid;
    (void)ptitle;
    (void)titlelength;
    (void)pmessage;
    (void)messagelength;
    (void)style;
    (void)timeout;
    (void)presponse;
    (void)bwait;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSSendMessageW(JNIEnv* km_env, jclass km_clazz, jlong hserver, jint sessionid, jlong ptitle, jint titlelength, jlong pmessage, jint messagelength, jint style, jint timeout, jlong presponse, jint bwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSSendMessageW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (uint32_t)sessionid, (void*)(uintptr_t)ptitle, (uint32_t)titlelength, (void*)(uintptr_t)pmessage, (uint32_t)messagelength, (uint32_t)style, (uint32_t)timeout, (void*)(uintptr_t)presponse, (int32_t)bwait);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)sessionid;
    (void)ptitle;
    (void)titlelength;
    (void)pmessage;
    (void)messagelength;
    (void)style;
    (void)timeout;
    (void)presponse;
    (void)bwait;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityA(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong preserved, jint reserved, jlong plistenername, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSSetListenerSecurityA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)preserved, (uint32_t)reserved, (void*)(uintptr_t)plistenername, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityW(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong preserved, jint reserved, jlong plistenername, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSSetListenerSecurityW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)preserved, (uint32_t)reserved, (void*)(uintptr_t)plistenername, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)preserved;
    (void)reserved;
    (void)plistenername;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSSetRenderHint(JNIEnv* km_env, jclass km_clazz, jlong prenderhintid, jlong hwndowner, jint renderhinttype, jint cbhintdatalength, jlong phintdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSSetRenderHint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prenderhintid, (void*)(uintptr_t)hwndowner, (uint32_t)renderhinttype, (uint32_t)cbhintdatalength, (void*)(uintptr_t)phintdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prenderhintid;
    (void)hwndowner;
    (void)renderhinttype;
    (void)cbhintdatalength;
    (void)phintdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigA(JNIEnv* km_env, jclass km_clazz, jlong pservername, jlong pusername, jint wtsconfigclass, jlong pbuffer, jint datalength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSSetUserConfigA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pservername, (void*)(uintptr_t)pusername, (int32_t)wtsconfigclass, (void*)(uintptr_t)pbuffer, (uint32_t)datalength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pservername;
    (void)pusername;
    (void)wtsconfigclass;
    (void)pbuffer;
    (void)datalength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigW(JNIEnv* km_env, jclass km_clazz, jlong pservername, jlong pusername, jint wtsconfigclass, jlong pbuffer, jint datalength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSSetUserConfigW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pservername, (void*)(uintptr_t)pusername, (int32_t)wtsconfigclass, (void*)(uintptr_t)pbuffer, (uint32_t)datalength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pservername;
    (void)pusername;
    (void)wtsconfigclass;
    (void)pbuffer;
    (void)datalength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSShutdownSystem(JNIEnv* km_env, jclass km_clazz, jlong hserver, jint shutdownflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSShutdownSystem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (uint32_t)shutdownflag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)shutdownflag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionA(JNIEnv* km_env, jclass km_clazz, jlong ptargetservername, jint targetlogonid, jbyte hotkeyvk, jshort hotkeymodifiers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSStartRemoteControlSessionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptargetservername, (uint32_t)targetlogonid, (uint8_t)hotkeyvk, (uint16_t)hotkeymodifiers);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptargetservername;
    (void)targetlogonid;
    (void)hotkeyvk;
    (void)hotkeymodifiers;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionW(JNIEnv* km_env, jclass km_clazz, jlong ptargetservername, jint targetlogonid, jbyte hotkeyvk, jshort hotkeymodifiers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSStartRemoteControlSessionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptargetservername, (uint32_t)targetlogonid, (uint8_t)hotkeyvk, (uint16_t)hotkeymodifiers);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptargetservername;
    (void)targetlogonid;
    (void)hotkeyvk;
    (void)hotkeymodifiers;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSStopRemoteControlSession(JNIEnv* km_env, jclass km_clazz, jint logonid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSStopRemoteControlSession");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)logonid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)logonid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSTerminateProcess(JNIEnv* km_env, jclass km_clazz, jlong hserver, jint processid, jint exitcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSTerminateProcess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (uint32_t)processid, (uint32_t)exitcode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)processid;
    (void)exitcode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotification(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSUnRegisterSessionNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotificationEx(JNIEnv* km_env, jclass km_clazz, jlong hserver, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSUnRegisterSessionNotificationEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (void*)(uintptr_t)hwnd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)hwnd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelClose(JNIEnv* km_env, jclass km_clazz, jlong hchannelhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hchannelhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hchannelhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpen(JNIEnv* km_env, jclass km_clazz, jlong hserver, jint sessionid, jlong pvirtualname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelOpen");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (uint32_t)sessionid, (void*)(uintptr_t)pvirtualname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hserver;
    (void)sessionid;
    (void)pvirtualname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpenEx(JNIEnv* km_env, jclass km_clazz, jint sessionid, jlong pvirtualname, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelOpenEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)sessionid, (void*)(uintptr_t)pvirtualname, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)sessionid;
    (void)pvirtualname;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeInput(JNIEnv* km_env, jclass km_clazz, jlong hchannelhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelPurgeInput");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hchannelhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hchannelhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeOutput(JNIEnv* km_env, jclass km_clazz, jlong hchannelhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelPurgeOutput");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hchannelhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hchannelhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelQuery(JNIEnv* km_env, jclass km_clazz, jlong hchannelhandle, jint param1, jlong ppbuffer, jlong pbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelQuery");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hchannelhandle, (int32_t)param1, (void*)(uintptr_t)ppbuffer, (void*)(uintptr_t)pbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hchannelhandle;
    (void)param1;
    (void)ppbuffer;
    (void)pbytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelRead(JNIEnv* km_env, jclass km_clazz, jlong hchannelhandle, jint timeout, jlong buffer, jint buffersize, jlong pbytesread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelRead");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hchannelhandle, (uint32_t)timeout, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)pbytesread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hchannelhandle;
    (void)timeout;
    (void)buffer;
    (void)buffersize;
    (void)pbytesread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelWrite(JNIEnv* km_env, jclass km_clazz, jlong hchannelhandle, jlong buffer, jint length, jlong pbyteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSVirtualChannelWrite");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hchannelhandle, (void*)(uintptr_t)buffer, (uint32_t)length, (void*)(uintptr_t)pbyteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hchannelhandle;
    (void)buffer;
    (void)length;
    (void)pbyteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotedesktop_WindowsWin32SystemRemotedesktopJniBridge_windowssysWindowsWin32SystemRemotedesktopWTSWaitSystemEvent(JNIEnv* km_env, jclass km_clazz, jlong hserver, jint eventmask, jlong peventflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wtsapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTSWaitSystemEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserver, (uint32_t)eventmask, (void*)(uintptr_t)peventflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hserver;
    (void)eventmask;
    (void)peventflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

