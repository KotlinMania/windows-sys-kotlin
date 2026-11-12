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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorApplyGuestMemoryFix(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong virtualaddress, jlong fixbuffer, jint fixbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyGuestMemoryFix");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (uint64_t)virtualaddress, (void*)(uintptr_t)fixbuffer, (uint32_t)fixbuffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualaddress;
    (void)fixbuffer;
    (void)fixbuffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorApplyPendingSavedStateFileReplayLog(JNIEnv* km_env, jclass km_clazz, jlong vmrsfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPendingSavedStateFileReplayLog");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmrsfile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmrsfile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorCallStackUnwind(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong imageinfo, jint imageinfocount, jint framecount, jlong callstack) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallStackUnwind");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)imageinfo, (uint32_t)imageinfocount, (uint32_t)framecount, (void*)(uintptr_t)callstack);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)imageinfo;
    (void)imageinfocount;
    (void)framecount;
    (void)callstack;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorFindSavedStateSymbolFieldInType(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong arg2Typename, jlong fieldname, jlong offset, jlong found) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindSavedStateSymbolFieldInType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)arg2Typename, (void*)(uintptr_t)fieldname, (void*)(uintptr_t)offset, (void*)(uintptr_t)found);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg2Typename;
    (void)fieldname;
    (void)offset;
    (void)found;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorForceActiveVirtualTrustLevel(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jbyte virtualtrustlevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ForceActiveVirtualTrustLevel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (uint8_t)virtualtrustlevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualtrustlevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorForceArchitecture(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jint architecture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ForceArchitecture");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (int32_t)architecture);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)architecture;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorForceNestedHostMode(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jint hostmode, jlong oldmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ForceNestedHostMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (int32_t)hostmode, (void*)(uintptr_t)oldmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)hostmode;
    (void)oldmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorForcePagingMode(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jint pagingmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ForcePagingMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (int32_t)pagingmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)pagingmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGetActiveVirtualTrustLevel(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong virtualtrustlevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetActiveVirtualTrustLevel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)virtualtrustlevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualtrustlevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGetArchitecture(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong architecture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetArchitecture");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)architecture);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)architecture;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGetEnabledVirtualTrustLevels(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong virtualtrustlevels) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnabledVirtualTrustLevels");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)virtualtrustlevels);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualtrustlevels;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGetGuestEnabledVirtualTrustLevels(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong virtualtrustlevels) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGuestEnabledVirtualTrustLevels");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)virtualtrustlevels);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)virtualtrustlevels;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGetGuestOsInfo(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jbyte virtualtrustlevel, jlong guestosinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGuestOsInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint8_t)virtualtrustlevel, (void*)(uintptr_t)guestosinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)virtualtrustlevel;
    (void)guestosinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGetGuestPhysicalMemoryChunks(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong memorychunkpagesize, jlong memorychunks, jlong memorychunkcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGuestPhysicalMemoryChunks");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)memorychunkpagesize, (void*)(uintptr_t)memorychunks, (void*)(uintptr_t)memorychunkcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)memorychunkpagesize;
    (void)memorychunks;
    (void)memorychunkcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGetGuestRawSavedMemorySize(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong guestrawsavedmemorysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGuestRawSavedMemorySize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)guestrawsavedmemorysize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)guestrawsavedmemorysize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGetMemoryBlockCacheLimit(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong memoryblockcachelimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMemoryBlockCacheLimit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)memoryblockcachelimit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)memoryblockcachelimit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGetNestedVirtualizationMode(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong enabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNestedVirtualizationMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)enabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)enabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGetPagingMode(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong pagingmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPagingMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)pagingmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)pagingmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGetRegisterValue(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jint registerid, jlong registervalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRegisterValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (uint32_t)registerid, (void*)(uintptr_t)registervalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)registerid;
    (void)registervalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolFieldInfo(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong arg2Typename, jlong typefieldinfomap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSavedStateSymbolFieldInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)arg2Typename, (void*)(uintptr_t)typefieldinfomap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg2Typename;
    (void)typefieldinfomap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolProviderHandle(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSavedStateSymbolProviderHandle");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)vmsavedstatedumphandle;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolTypeSize(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong arg2Typename, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSavedStateSymbolTypeSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)arg2Typename, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg2Typename;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGetVpCount(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong vpcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVpCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)vpcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGuestPhysicalAddressToRawSavedMemoryOffset(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong physicaladdress, jlong rawsavedmemoryoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GuestPhysicalAddressToRawSavedMemoryOffset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint64_t)physicaladdress, (void*)(uintptr_t)rawsavedmemoryoffset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)physicaladdress;
    (void)rawsavedmemoryoffset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorGuestVirtualAddressToPhysicalAddress(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong virtualaddress, jlong physicaladdress, jlong unmappedregionsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GuestVirtualAddressToPhysicalAddress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (uint64_t)virtualaddress, (void*)(uintptr_t)physicaladdress, (void*)(uintptr_t)unmappedregionsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualaddress;
    (void)physicaladdress;
    (void)unmappedregionsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorHdvCreateDeviceInstance(JNIEnv* km_env, jclass km_clazz, jlong devicehosthandle, jint devicetype, jlong deviceclassid, jlong deviceinstanceid, jlong deviceinterface, jlong devicecontext, jlong devicehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvCreateDeviceInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)devicehosthandle, (int32_t)devicetype, (void*)(uintptr_t)deviceclassid, (void*)(uintptr_t)deviceinstanceid, (void*)(uintptr_t)deviceinterface, (void*)(uintptr_t)devicecontext, (void*)(uintptr_t)devicehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)devicehosthandle;
    (void)devicetype;
    (void)deviceclassid;
    (void)deviceinstanceid;
    (void)deviceinterface;
    (void)devicecontext;
    (void)devicehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorHdvCreateGuestMemoryAperture(JNIEnv* km_env, jclass km_clazz, jlong requestor, jlong guestphysicaladdress, jint bytecount, jint writeprotected, jlong mappedaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvCreateGuestMemoryAperture");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requestor, (uint64_t)guestphysicaladdress, (uint32_t)bytecount, (int32_t)writeprotected, (void*)(uintptr_t)mappedaddress);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)guestphysicaladdress;
    (void)bytecount;
    (void)writeprotected;
    (void)mappedaddress;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorHdvCreateSectionBackedMmioRange(JNIEnv* km_env, jclass km_clazz, jlong requestor, jint barindex, jlong offsetinpages, jlong lengthinpages, jint mappingflags, jlong sectionhandle, jlong sectionoffsetinpages) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, uint64_t, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvCreateSectionBackedMmioRange");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requestor, (int32_t)barindex, (uint64_t)offsetinpages, (uint64_t)lengthinpages, (int32_t)mappingflags, (void*)(uintptr_t)sectionhandle, (uint64_t)sectionoffsetinpages);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)barindex;
    (void)offsetinpages;
    (void)lengthinpages;
    (void)mappingflags;
    (void)sectionhandle;
    (void)sectionoffsetinpages;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorHdvDeliverGuestInterrupt(JNIEnv* km_env, jclass km_clazz, jlong requestor, jlong msiaddress, jint msidata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvDeliverGuestInterrupt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requestor, (uint64_t)msiaddress, (uint32_t)msidata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)msiaddress;
    (void)msidata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorHdvDestroyGuestMemoryAperture(JNIEnv* km_env, jclass km_clazz, jlong requestor, jlong mappedaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvDestroyGuestMemoryAperture");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requestor, (void*)(uintptr_t)mappedaddress);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)mappedaddress;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorHdvDestroySectionBackedMmioRange(JNIEnv* km_env, jclass km_clazz, jlong requestor, jint barindex, jlong offsetinpages) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvDestroySectionBackedMmioRange");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requestor, (int32_t)barindex, (uint64_t)offsetinpages);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)barindex;
    (void)offsetinpages;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHost(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong devicehosthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvInitializeDeviceHost");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)devicehosthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)devicehosthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHostEx(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jint flags, jlong devicehosthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvInitializeDeviceHostEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)computesystem, (int32_t)flags, (void*)(uintptr_t)devicehosthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)computesystem;
    (void)flags;
    (void)devicehosthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorHdvReadGuestMemory(JNIEnv* km_env, jclass km_clazz, jlong requestor, jlong guestphysicaladdress, jint bytecount, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvReadGuestMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requestor, (uint64_t)guestphysicaladdress, (uint32_t)bytecount, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)guestphysicaladdress;
    (void)bytecount;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorHdvRegisterDoorbell(JNIEnv* km_env, jclass km_clazz, jlong requestor, jint barindex, jlong baroffset, jlong triggervalue, jlong flags, jlong doorbellevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvRegisterDoorbell");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requestor, (int32_t)barindex, (uint64_t)baroffset, (uint64_t)triggervalue, (uint64_t)flags, (void*)(uintptr_t)doorbellevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)barindex;
    (void)baroffset;
    (void)triggervalue;
    (void)flags;
    (void)doorbellevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorHdvTeardownDeviceHost(JNIEnv* km_env, jclass km_clazz, jlong devicehosthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvTeardownDeviceHost");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)devicehosthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)devicehosthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorHdvUnregisterDoorbell(JNIEnv* km_env, jclass km_clazz, jlong requestor, jint barindex, jlong baroffset, jlong triggervalue, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvUnregisterDoorbell");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requestor, (int32_t)barindex, (uint64_t)baroffset, (uint64_t)triggervalue, (uint64_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)barindex;
    (void)baroffset;
    (void)triggervalue;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorHdvWriteGuestMemory(JNIEnv* km_env, jclass km_clazz, jlong requestor, jlong guestphysicaladdress, jint bytecount, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvWriteGuestMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requestor, (uint64_t)guestphysicaladdress, (uint32_t)bytecount, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)requestor;
    (void)guestphysicaladdress;
    (void)bytecount;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorInKernelSpace(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong inkernelspace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InKernelSpace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)inkernelspace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)inkernelspace;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorIsActiveVirtualTrustLevelEnabled(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong activevirtualtrustlevelenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsActiveVirtualTrustLevelEnabled");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)activevirtualtrustlevelenabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)activevirtualtrustlevelenabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorIsNestedVirtualizationEnabled(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong enabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsNestedVirtualizationEnabled");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)enabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)enabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorLoadSavedStateFile(JNIEnv* km_env, jclass km_clazz, jlong vmrsfile, jlong vmsavedstatedumphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadSavedStateFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmrsfile, (void*)(uintptr_t)vmsavedstatedumphandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmrsfile;
    (void)vmsavedstatedumphandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorLoadSavedStateFiles(JNIEnv* km_env, jclass km_clazz, jlong binfile, jlong vsvfile, jlong vmsavedstatedumphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadSavedStateFiles");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binfile, (void*)(uintptr_t)vsvfile, (void*)(uintptr_t)vmsavedstatedumphandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binfile;
    (void)vsvfile;
    (void)vmsavedstatedumphandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbols(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong imagename, jlong modulename, jlong baseaddress, jint sizeofbase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadSavedStateModuleSymbols");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)imagename, (void*)(uintptr_t)modulename, (uint64_t)baseaddress, (uint32_t)sizeofbase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)imagename;
    (void)modulename;
    (void)baseaddress;
    (void)sizeofbase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbolsEx(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong imagename, jint imagetimestamp, jlong modulename, jlong baseaddress, jint sizeofbase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadSavedStateModuleSymbolsEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)imagename, (uint32_t)imagetimestamp, (void*)(uintptr_t)modulename, (uint64_t)baseaddress, (uint32_t)sizeofbase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)imagename;
    (void)imagetimestamp;
    (void)modulename;
    (void)baseaddress;
    (void)sizeofbase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorLoadSavedStateSymbolProvider(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong usersymbols, jint force) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadSavedStateSymbolProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)usersymbols, (int32_t)force);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)usersymbols;
    (void)force;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorLocateSavedStateFiles(JNIEnv* km_env, jclass km_clazz, jlong vmname, jlong snapshotname, jlong binpath, jlong vsvpath, jlong vmrspath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocateSavedStateFiles");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmname, (void*)(uintptr_t)snapshotname, (void*)(uintptr_t)binpath, (void*)(uintptr_t)vsvpath, (void*)(uintptr_t)vmrspath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmname;
    (void)snapshotname;
    (void)binpath;
    (void)vsvpath;
    (void)vmrspath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorReadGuestPhysicalAddress(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong physicaladdress, jlong buffer, jint buffersize, jlong bytesread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadGuestPhysicalAddress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint64_t)physicaladdress, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)physicaladdress;
    (void)buffer;
    (void)buffersize;
    (void)bytesread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorReadGuestRawSavedMemory(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong rawsavedmemoryoffset, jlong buffer, jint buffersize, jlong bytesread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadGuestRawSavedMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint64_t)rawsavedmemoryoffset, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)rawsavedmemoryoffset;
    (void)buffer;
    (void)buffersize;
    (void)bytesread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorReadSavedStateGlobalVariable(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong globalname, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadSavedStateGlobalVariable");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)globalname, (void*)(uintptr_t)buffer, (uint32_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)globalname;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorReleaseSavedStateFiles(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseSavedStateFiles");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorReleaseSavedStateSymbolProvider(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseSavedStateSymbolProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorResolveSavedStateGlobalVariableAddress(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong globalname, jlong virtualaddress, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResolveSavedStateGlobalVariableAddress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)globalname, (void*)(uintptr_t)virtualaddress, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)globalname;
    (void)virtualaddress;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorScanMemoryForDosImages(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong startaddress, jlong endaddress, jlong callbackcontext, jlong foundimagecallback, jlong standaloneaddress, jint standaloneaddresscount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScanMemoryForDosImages");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (uint64_t)startaddress, (uint64_t)endaddress, (void*)(uintptr_t)callbackcontext, (void*)(uintptr_t)foundimagecallback, (void*)(uintptr_t)standaloneaddress, (uint32_t)standaloneaddresscount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)startaddress;
    (void)endaddress;
    (void)callbackcontext;
    (void)foundimagecallback;
    (void)standaloneaddress;
    (void)standaloneaddresscount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorSetMemoryBlockCacheLimit(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong memoryblockcachelimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMemoryBlockCacheLimit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint64_t)memoryblockcachelimit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)memoryblockcachelimit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorSetSavedStateSymbolProviderDebugInfoCallback(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSavedStateSymbolProviderDebugInfoCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)callback);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vmsavedstatedumphandle;
    (void)callback;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvAcceptPartitionMigration(JNIEnv* km_env, jclass km_clazz, jlong migrationhandle, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvAcceptPartitionMigration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)migrationhandle, (void*)(uintptr_t)partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)migrationhandle;
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvAdviseGpaRange(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong gparanges, jint gparangescount, jint advice, jlong advicebuffer, jint advicebuffersizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvAdviseGpaRange");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (void*)(uintptr_t)gparanges, (uint32_t)gparangescount, (int32_t)advice, (void*)(uintptr_t)advicebuffer, (uint32_t)advicebuffersizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)gparanges;
    (void)gparangescount;
    (void)advice;
    (void)advicebuffer;
    (void)advicebuffersizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvAllocateVpciResource(JNIEnv* km_env, jclass km_clazz, jlong providerid, jint flags, jlong resourcedescriptor, jint resourcedescriptorsizeinbytes, jlong vpciresource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvAllocateVpciResource");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)providerid, (int32_t)flags, (void*)(uintptr_t)resourcedescriptor, (uint32_t)resourcedescriptorsizeinbytes, (void*)(uintptr_t)vpciresource);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)providerid;
    (void)flags;
    (void)resourcedescriptor;
    (void)resourcedescriptorsizeinbytes;
    (void)vpciresource;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCancelPartitionMigration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCancelRunVirtualProcessor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCompletePartitionMigration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvCreateNotificationPort(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong parameters, jlong eventhandle, jlong porthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreateNotificationPort");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (void*)(uintptr_t)parameters, (void*)(uintptr_t)eventhandle, (void*)(uintptr_t)porthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)parameters;
    (void)eventhandle;
    (void)porthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvCreatePartition(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreatePartition");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvCreateTrigger(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong parameters, jlong triggerhandle, jlong eventhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreateTrigger");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (void*)(uintptr_t)parameters, (void*)(uintptr_t)triggerhandle, (void*)(uintptr_t)eventhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)parameters;
    (void)triggerhandle;
    (void)eventhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreateVirtualProcessor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor2(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong properties, jint propertycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreateVirtualProcessor2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)properties, (uint32_t)propertycount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)properties;
    (void)propertycount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvCreateVpciDevice(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jlong vpciresource, jint flags, jlong notificationeventhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreateVpciDevice");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (void*)(uintptr_t)vpciresource, (int32_t)flags, (void*)(uintptr_t)notificationeventhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)vpciresource;
    (void)flags;
    (void)notificationeventhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvDeleteNotificationPort(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong porthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvDeleteNotificationPort");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (void*)(uintptr_t)porthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)porthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvDeletePartition(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvDeletePartition");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvDeleteTrigger(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong triggerhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvDeleteTrigger");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (void*)(uintptr_t)triggerhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)triggerhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvDeleteVirtualProcessor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvDeleteVpciDevice");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvEmulatorCreateEmulator(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong emulator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvEmulatorCreateEmulator");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbacks, (void*)(uintptr_t)emulator);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbacks;
    (void)emulator;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvEmulatorDestroyEmulator(JNIEnv* km_env, jclass km_clazz, jlong emulator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvEmulatorDestroyEmulator");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)emulator);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)emulator;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvEmulatorTryIoEmulation(JNIEnv* km_env, jclass km_clazz, jlong emulator, jlong context, jlong vpcontext, jlong ioinstructioncontext, jlong emulatorreturnstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvEmulatorTryIoEmulation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)emulator, (void*)(uintptr_t)context, (void*)(uintptr_t)vpcontext, (void*)(uintptr_t)ioinstructioncontext, (void*)(uintptr_t)emulatorreturnstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)emulator;
    (void)context;
    (void)vpcontext;
    (void)ioinstructioncontext;
    (void)emulatorreturnstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvEmulatorTryMmioEmulation(JNIEnv* km_env, jclass km_clazz, jlong emulator, jlong context, jlong vpcontext, jlong mmioinstructioncontext, jlong emulatorreturnstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvEmulatorTryMmioEmulation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)emulator, (void*)(uintptr_t)context, (void*)(uintptr_t)vpcontext, (void*)(uintptr_t)mmioinstructioncontext, (void*)(uintptr_t)emulatorreturnstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)emulator;
    (void)context;
    (void)vpcontext;
    (void)mmioinstructioncontext;
    (void)emulatorreturnstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvGetCapability(JNIEnv* km_env, jclass km_clazz, jint capabilitycode, jlong capabilitybuffer, jint capabilitybuffersizeinbytes, jlong writtensizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetCapability");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)capabilitycode, (void*)(uintptr_t)capabilitybuffer, (uint32_t)capabilitybuffersizeinbytes, (void*)(uintptr_t)writtensizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)capabilitycode;
    (void)capabilitybuffer;
    (void)capabilitybuffersizeinbytes;
    (void)writtensizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvGetInterruptTargetVpSet(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong destination, jint destinationmode, jlong targetvps, jint vpcount, jlong targetvpcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetInterruptTargetVpSet");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)destination, (int32_t)destinationmode, (void*)(uintptr_t)targetvps, (uint32_t)vpcount, (void*)(uintptr_t)targetvpcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)destination;
    (void)destinationmode;
    (void)targetvps;
    (void)vpcount;
    (void)targetvpcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvGetPartitionCounters(JNIEnv* km_env, jclass km_clazz, jlong partition, jint counterset, jlong buffer, jint buffersizeinbytes, jlong byteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetPartitionCounters");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (int32_t)counterset, (void*)(uintptr_t)buffer, (uint32_t)buffersizeinbytes, (void*)(uintptr_t)byteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)counterset;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvGetPartitionProperty(JNIEnv* km_env, jclass km_clazz, jlong partition, jint propertycode, jlong propertybuffer, jint propertybuffersizeinbytes, jlong writtensizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetPartitionProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (int32_t)propertycode, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersizeinbytes, (void*)(uintptr_t)writtensizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)propertycode;
    (void)propertybuffer;
    (void)propertybuffersizeinbytes;
    (void)writtensizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCounters(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jint counterset, jlong buffer, jint buffersizeinbytes, jlong byteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorCounters");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (int32_t)counterset, (void*)(uintptr_t)buffer, (uint32_t)buffersizeinbytes, (void*)(uintptr_t)byteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)counterset;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCpuidOutput(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jint eax, jint ecx, jlong cpuidoutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorCpuidOutput");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (uint32_t)eax, (uint32_t)ecx, (void*)(uintptr_t)cpuidoutput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)eax;
    (void)ecx;
    (void)cpuidoutput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong state, jint statesize, jlong writtensize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorInterruptControllerState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)state, (uint32_t)statesize, (void*)(uintptr_t)writtensize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    (void)writtensize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState2(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong state, jint statesize, jlong writtensize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorInterruptControllerState2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)state, (uint32_t)statesize, (void*)(uintptr_t)writtensize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    (void)writtensize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorRegisters(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong registernames, jint registercount, jlong registervalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorRegisters");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)registernames, (uint32_t)registercount, (void*)(uintptr_t)registervalues);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)registernames;
    (void)registercount;
    (void)registervalues;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorState(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jint statetype, jlong buffer, jint buffersizeinbytes, jlong byteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (int32_t)statetype, (void*)(uintptr_t)buffer, (uint32_t)buffersizeinbytes, (void*)(uintptr_t)byteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)statetype;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorXsaveState(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong buffer, jint buffersizeinbytes, jlong byteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorXsaveState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)buffer, (uint32_t)buffersizeinbytes, (void*)(uintptr_t)byteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceInterruptTarget(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jint arg2Index, jint multimessagenumber, jlong target, jint targetsizeinbytes, jlong byteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVpciDeviceInterruptTarget");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (uint32_t)arg2Index, (uint32_t)multimessagenumber, (void*)(uintptr_t)target, (uint32_t)targetsizeinbytes, (void*)(uintptr_t)byteswritten);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg2Index;
    (void)multimessagenumber;
    (void)target;
    (void)targetsizeinbytes;
    (void)byteswritten;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceNotification(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jlong notification, jint notificationsizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVpciDeviceNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (void*)(uintptr_t)notification, (uint32_t)notificationsizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)notification;
    (void)notificationsizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceProperty(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jint propertycode, jlong propertybuffer, jint propertybuffersizeinbytes, jlong writtensizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVpciDeviceProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (int32_t)propertycode, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersizeinbytes, (void*)(uintptr_t)writtensizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)propertycode;
    (void)propertybuffer;
    (void)propertybuffersizeinbytes;
    (void)writtensizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvMapGpaRange(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong sourceaddress, jlong guestaddress, jlong sizeinbytes, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvMapGpaRange");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (void*)(uintptr_t)sourceaddress, (uint64_t)guestaddress, (uint64_t)sizeinbytes, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)sourceaddress;
    (void)guestaddress;
    (void)sizeinbytes;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvMapGpaRange2(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong process, jlong sourceaddress, jlong guestaddress, jlong sizeinbytes, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvMapGpaRange2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (void*)(uintptr_t)process, (void*)(uintptr_t)sourceaddress, (uint64_t)guestaddress, (uint64_t)sizeinbytes, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)process;
    (void)sourceaddress;
    (void)guestaddress;
    (void)sizeinbytes;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceInterrupt(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jint arg2Index, jint messagecount, jlong target, jlong msiaddress, jlong msidata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvMapVpciDeviceInterrupt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (uint32_t)arg2Index, (uint32_t)messagecount, (void*)(uintptr_t)target, (void*)(uintptr_t)msiaddress, (void*)(uintptr_t)msidata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg2Index;
    (void)messagecount;
    (void)target;
    (void)msiaddress;
    (void)msidata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceMmioRanges(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jlong mappingcount, jlong mappings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvMapVpciDeviceMmioRanges");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (void*)(uintptr_t)mappingcount, (void*)(uintptr_t)mappings);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)mappingcount;
    (void)mappings;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvPostVirtualProcessorSynicMessage(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jint sintindex, jlong message, jint messagesizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvPostVirtualProcessorSynicMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (uint32_t)sintindex, (void*)(uintptr_t)message, (uint32_t)messagesizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)sintindex;
    (void)message;
    (void)messagesizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvQueryGpaRangeDirtyBitmap(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong guestaddress, jlong rangesizeinbytes, jlong bitmap, jint bitmapsizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvQueryGpaRangeDirtyBitmap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)guestaddress, (uint64_t)rangesizeinbytes, (void*)(uintptr_t)bitmap, (uint32_t)bitmapsizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)guestaddress;
    (void)rangesizeinbytes;
    (void)bitmap;
    (void)bitmapsizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvReadVpciDeviceRegister(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jlong arg2Register, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvReadVpciDeviceRegister");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (void*)(uintptr_t)arg2Register, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg2Register;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvRegisterPartitionDoorbellEvent(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong matchdata, jlong eventhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvRegisterPartitionDoorbellEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (void*)(uintptr_t)matchdata, (void*)(uintptr_t)eventhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)matchdata;
    (void)eventhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvRequestInterrupt(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong interrupt, jint interruptcontrolsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvRequestInterrupt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (void*)(uintptr_t)interrupt, (uint32_t)interruptcontrolsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)interrupt;
    (void)interruptcontrolsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jlong msiaddress, jint msidata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvRequestVpciDeviceInterrupt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (uint64_t)msiaddress, (uint32_t)msidata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)msiaddress;
    (void)msidata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvResetPartition(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvResetPartition");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvResumePartitionTime(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvResumePartitionTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvRetargetVpciDeviceInterrupt(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jlong msiaddress, jint msidata, jlong target) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvRetargetVpciDeviceInterrupt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (uint64_t)msiaddress, (uint32_t)msidata, (void*)(uintptr_t)target);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)msiaddress;
    (void)msidata;
    (void)target;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvRunVirtualProcessor(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong exitcontext, jint exitcontextsizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvRunVirtualProcessor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)exitcontext, (uint32_t)exitcontextsizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)exitcontext;
    (void)exitcontextsizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvSetNotificationPortProperty(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong porthandle, jint propertycode, jlong propertyvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetNotificationPortProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (void*)(uintptr_t)porthandle, (int32_t)propertycode, (uint64_t)propertyvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)porthandle;
    (void)propertycode;
    (void)propertyvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvSetPartitionProperty(JNIEnv* km_env, jclass km_clazz, jlong partition, jint propertycode, jlong propertybuffer, jint propertybuffersizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetPartitionProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (int32_t)propertycode, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)propertycode;
    (void)propertybuffer;
    (void)propertybuffersizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong state, jint statesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVirtualProcessorInterruptControllerState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)state, (uint32_t)statesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState2(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong state, jint statesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVirtualProcessorInterruptControllerState2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)state, (uint32_t)statesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorRegisters(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong registernames, jint registercount, jlong registervalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVirtualProcessorRegisters");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)registernames, (uint32_t)registercount, (void*)(uintptr_t)registervalues);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)registernames;
    (void)registercount;
    (void)registervalues;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorState(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jint statetype, jlong buffer, jint buffersizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVirtualProcessorState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (int32_t)statetype, (void*)(uintptr_t)buffer, (uint32_t)buffersizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)statetype;
    (void)buffer;
    (void)buffersizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorXsaveState(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong buffer, jint buffersizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVirtualProcessorXsaveState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)buffer, (uint32_t)buffersizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)buffer;
    (void)buffersizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jint powerstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVpciDevicePowerState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (int32_t)powerstate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)powerstate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvSetupPartition(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetupPartition");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvStartPartitionMigration(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong migrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvStartPartitionMigration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (void*)(uintptr_t)migrationhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)migrationhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSuspendPartitionTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvTranslateGva(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong gva, jint translateflags, jlong translationresult, jlong gpa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvTranslateGva");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (uint64_t)gva, (int32_t)translateflags, (void*)(uintptr_t)translationresult, (void*)(uintptr_t)gpa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)vpindex;
    (void)gva;
    (void)translateflags;
    (void)translationresult;
    (void)gpa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong guestaddress, jlong sizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvUnmapGpaRange");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)guestaddress, (uint64_t)sizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)guestaddress;
    (void)sizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jint arg2Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvUnmapVpciDeviceInterrupt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (uint32_t)arg2Index);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg2Index;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvUnmapVpciDeviceMmioRanges");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvUnregisterPartitionDoorbellEvent(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong matchdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvUnregisterPartitionDoorbellEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (void*)(uintptr_t)matchdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)matchdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvUpdateTriggerParameters(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong parameters, jlong triggerhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvUpdateTriggerParameters");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (void*)(uintptr_t)parameters, (void*)(uintptr_t)triggerhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)parameters;
    (void)triggerhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssysWindowsWin32SystemHypervisorWHvWriteVpciDeviceRegister(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jlong arg2Register, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvWriteVpciDeviceRegister");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (void*)(uintptr_t)arg2Register, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg2Register;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

