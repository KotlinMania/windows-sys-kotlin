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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1applyGuestMemoryFix(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong virtualaddress, jlong fixbuffer, jint fixbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyGuestMemoryFix");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (uint64_t)virtualaddress, (void*)(uintptr_t)fixbuffer, (uint32_t)fixbuffersize) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualaddress;
    (void)fixbuffer;
    (void)fixbuffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1applyPendingSavedStateFileReplayLog(JNIEnv* km_env, jclass km_clazz, jlong vmrsfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyPendingSavedStateFileReplayLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmrsfile) : -1;
#else
    (void)vmrsfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1callStackUnwind(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong imageinfo, jint imageinfocount, jint framecount, jlong callstack) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallStackUnwind");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)imageinfo, (uint32_t)imageinfocount, (uint32_t)framecount, (void*)(uintptr_t)callstack) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)imageinfo;
    (void)imageinfocount;
    (void)framecount;
    (void)callstack;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1findSavedStateSymbolFieldInType(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong arg_2_typename, jlong fieldname, jlong offset, jlong found) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindSavedStateSymbolFieldInType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)arg_2_typename, (void*)(uintptr_t)fieldname, (void*)(uintptr_t)offset, (void*)(uintptr_t)found) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg_2_typename;
    (void)fieldname;
    (void)offset;
    (void)found;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1forceActiveVirtualTrustLevel(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jbyte virtualtrustlevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ForceActiveVirtualTrustLevel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (uint8_t)virtualtrustlevel) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualtrustlevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1forceArchitecture(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jint architecture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ForceArchitecture");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (int32_t)architecture) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)architecture;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1forceNestedHostMode(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jint hostmode, jlong oldmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ForceNestedHostMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (int32_t)hostmode, (void*)(uintptr_t)oldmode) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)hostmode;
    (void)oldmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1forcePagingMode(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jint pagingmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ForcePagingMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (int32_t)pagingmode) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)pagingmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1getActiveVirtualTrustLevel(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong virtualtrustlevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetActiveVirtualTrustLevel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)virtualtrustlevel) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualtrustlevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1getArchitecture(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong architecture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetArchitecture");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)architecture) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)architecture;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1getEnabledVirtualTrustLevels(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong virtualtrustlevels) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnabledVirtualTrustLevels");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)virtualtrustlevels) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualtrustlevels;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1getGuestEnabledVirtualTrustLevels(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong virtualtrustlevels) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGuestEnabledVirtualTrustLevels");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)virtualtrustlevels) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)virtualtrustlevels;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1getGuestOsInfo(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jbyte virtualtrustlevel, jlong guestosinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGuestOsInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint8_t)virtualtrustlevel, (void*)(uintptr_t)guestosinfo) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)virtualtrustlevel;
    (void)guestosinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1getGuestPhysicalMemoryChunks(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong memorychunkpagesize, jlong memorychunks, jlong memorychunkcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGuestPhysicalMemoryChunks");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)memorychunkpagesize, (void*)(uintptr_t)memorychunks, (void*)(uintptr_t)memorychunkcount) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)memorychunkpagesize;
    (void)memorychunks;
    (void)memorychunkcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1getGuestRawSavedMemorySize(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong guestrawsavedmemorysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGuestRawSavedMemorySize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)guestrawsavedmemorysize) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)guestrawsavedmemorysize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1getMemoryBlockCacheLimit(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong memoryblockcachelimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMemoryBlockCacheLimit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)memoryblockcachelimit) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)memoryblockcachelimit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1getNestedVirtualizationMode(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong enabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNestedVirtualizationMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)enabled) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)enabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1getPagingMode(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong pagingmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPagingMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)pagingmode) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)pagingmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1getRegisterValue(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jint registerid, jlong registervalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRegisterValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (uint32_t)registerid, (void*)(uintptr_t)registervalue) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)registerid;
    (void)registervalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1getSavedStateSymbolFieldInfo(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong arg_2_typename, jlong typefieldinfomap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSavedStateSymbolFieldInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)arg_2_typename, (void*)(uintptr_t)typefieldinfomap) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg_2_typename;
    (void)typefieldinfomap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1getSavedStateSymbolProviderHandle(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSavedStateSymbolProviderHandle");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle) : NULL;
#else
    (void)vmsavedstatedumphandle;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1getSavedStateSymbolTypeSize(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong arg_2_typename, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSavedStateSymbolTypeSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)arg_2_typename, (void*)(uintptr_t)size) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)arg_2_typename;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1getVpCount(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong vpcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVpCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)vpcount) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1guestPhysicalAddressToRawSavedMemoryOffset(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong physicaladdress, jlong rawsavedmemoryoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GuestPhysicalAddressToRawSavedMemoryOffset");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint64_t)physicaladdress, (void*)(uintptr_t)rawsavedmemoryoffset) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)physicaladdress;
    (void)rawsavedmemoryoffset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1guestVirtualAddressToPhysicalAddress(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong virtualaddress, jlong physicaladdress, jlong unmappedregionsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GuestVirtualAddressToPhysicalAddress");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (uint64_t)virtualaddress, (void*)(uintptr_t)physicaladdress, (void*)(uintptr_t)unmappedregionsize) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)virtualaddress;
    (void)physicaladdress;
    (void)unmappedregionsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1hdvCreateDeviceInstance(JNIEnv* km_env, jclass km_clazz, jlong devicehosthandle, jint devicetype, jlong deviceclassid, jlong deviceinstanceid, jlong deviceinterface, jlong devicecontext, jlong devicehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvCreateDeviceInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)devicehosthandle, (int32_t)devicetype, (void*)(uintptr_t)deviceclassid, (void*)(uintptr_t)deviceinstanceid, (void*)(uintptr_t)deviceinterface, (void*)(uintptr_t)devicecontext, (void*)(uintptr_t)devicehandle) : -1;
#else
    (void)devicehosthandle;
    (void)devicetype;
    (void)deviceclassid;
    (void)deviceinstanceid;
    (void)deviceinterface;
    (void)devicecontext;
    (void)devicehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1hdvCreateGuestMemoryAperture(JNIEnv* km_env, jclass km_clazz, jlong requestor, jlong guestphysicaladdress, jint bytecount, jint writeprotected, jlong mappedaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvCreateGuestMemoryAperture");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestor, (uint64_t)guestphysicaladdress, (uint32_t)bytecount, (int32_t)writeprotected, (void*)(uintptr_t)mappedaddress) : -1;
#else
    (void)requestor;
    (void)guestphysicaladdress;
    (void)bytecount;
    (void)writeprotected;
    (void)mappedaddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1hdvCreateSectionBackedMmioRange(JNIEnv* km_env, jclass km_clazz, jlong requestor, jint barindex, jlong offsetinpages, jlong lengthinpages, jint mappingflags, jlong sectionhandle, jlong sectionoffsetinpages) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, uint64_t, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvCreateSectionBackedMmioRange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestor, (int32_t)barindex, (uint64_t)offsetinpages, (uint64_t)lengthinpages, (int32_t)mappingflags, (void*)(uintptr_t)sectionhandle, (uint64_t)sectionoffsetinpages) : -1;
#else
    (void)requestor;
    (void)barindex;
    (void)offsetinpages;
    (void)lengthinpages;
    (void)mappingflags;
    (void)sectionhandle;
    (void)sectionoffsetinpages;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1hdvDeliverGuestInterrupt(JNIEnv* km_env, jclass km_clazz, jlong requestor, jlong msiaddress, jint msidata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvDeliverGuestInterrupt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestor, (uint64_t)msiaddress, (uint32_t)msidata) : -1;
#else
    (void)requestor;
    (void)msiaddress;
    (void)msidata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1hdvDestroyGuestMemoryAperture(JNIEnv* km_env, jclass km_clazz, jlong requestor, jlong mappedaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvDestroyGuestMemoryAperture");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestor, (void*)(uintptr_t)mappedaddress) : -1;
#else
    (void)requestor;
    (void)mappedaddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1hdvDestroySectionBackedMmioRange(JNIEnv* km_env, jclass km_clazz, jlong requestor, jint barindex, jlong offsetinpages) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvDestroySectionBackedMmioRange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestor, (int32_t)barindex, (uint64_t)offsetinpages) : -1;
#else
    (void)requestor;
    (void)barindex;
    (void)offsetinpages;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1hdvInitializeDeviceHost(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jlong devicehosthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvInitializeDeviceHost");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (void*)(uintptr_t)devicehosthandle) : -1;
#else
    (void)computesystem;
    (void)devicehosthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1hdvInitializeDeviceHostEx(JNIEnv* km_env, jclass km_clazz, jlong computesystem, jint flags, jlong devicehosthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvInitializeDeviceHostEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)computesystem, (int32_t)flags, (void*)(uintptr_t)devicehosthandle) : -1;
#else
    (void)computesystem;
    (void)flags;
    (void)devicehosthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1hdvReadGuestMemory(JNIEnv* km_env, jclass km_clazz, jlong requestor, jlong guestphysicaladdress, jint bytecount, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvReadGuestMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestor, (uint64_t)guestphysicaladdress, (uint32_t)bytecount, (void*)(uintptr_t)buffer) : -1;
#else
    (void)requestor;
    (void)guestphysicaladdress;
    (void)bytecount;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1hdvRegisterDoorbell(JNIEnv* km_env, jclass km_clazz, jlong requestor, jint barindex, jlong baroffset, jlong triggervalue, jlong flags, jlong doorbellevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvRegisterDoorbell");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestor, (int32_t)barindex, (uint64_t)baroffset, (uint64_t)triggervalue, (uint64_t)flags, (void*)(uintptr_t)doorbellevent) : -1;
#else
    (void)requestor;
    (void)barindex;
    (void)baroffset;
    (void)triggervalue;
    (void)flags;
    (void)doorbellevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1hdvTeardownDeviceHost(JNIEnv* km_env, jclass km_clazz, jlong devicehosthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvTeardownDeviceHost");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)devicehosthandle) : -1;
#else
    (void)devicehosthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1hdvUnregisterDoorbell(JNIEnv* km_env, jclass km_clazz, jlong requestor, jint barindex, jlong baroffset, jlong triggervalue, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvUnregisterDoorbell");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestor, (int32_t)barindex, (uint64_t)baroffset, (uint64_t)triggervalue, (uint64_t)flags) : -1;
#else
    (void)requestor;
    (void)barindex;
    (void)baroffset;
    (void)triggervalue;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1hdvWriteGuestMemory(JNIEnv* km_env, jclass km_clazz, jlong requestor, jlong guestphysicaladdress, jint bytecount, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmdevicehost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HdvWriteGuestMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestor, (uint64_t)guestphysicaladdress, (uint32_t)bytecount, (void*)(uintptr_t)buffer) : -1;
#else
    (void)requestor;
    (void)guestphysicaladdress;
    (void)bytecount;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1inKernelSpace(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong inkernelspace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InKernelSpace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)inkernelspace) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)inkernelspace;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1isActiveVirtualTrustLevelEnabled(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong activevirtualtrustlevelenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsActiveVirtualTrustLevelEnabled");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)activevirtualtrustlevelenabled) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)activevirtualtrustlevelenabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1isNestedVirtualizationEnabled(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong enabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsNestedVirtualizationEnabled");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)enabled) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)enabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1loadSavedStateFile(JNIEnv* km_env, jclass km_clazz, jlong vmrsfile, jlong vmsavedstatedumphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadSavedStateFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmrsfile, (void*)(uintptr_t)vmsavedstatedumphandle) : -1;
#else
    (void)vmrsfile;
    (void)vmsavedstatedumphandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1loadSavedStateFiles(JNIEnv* km_env, jclass km_clazz, jlong binfile, jlong vsvfile, jlong vmsavedstatedumphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadSavedStateFiles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binfile, (void*)(uintptr_t)vsvfile, (void*)(uintptr_t)vmsavedstatedumphandle) : -1;
#else
    (void)binfile;
    (void)vsvfile;
    (void)vmsavedstatedumphandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1loadSavedStateModuleSymbols(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong imagename, jlong modulename, jlong baseaddress, jint sizeofbase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadSavedStateModuleSymbols");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)imagename, (void*)(uintptr_t)modulename, (uint64_t)baseaddress, (uint32_t)sizeofbase) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)imagename;
    (void)modulename;
    (void)baseaddress;
    (void)sizeofbase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1loadSavedStateModuleSymbolsEx(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong imagename, jint imagetimestamp, jlong modulename, jlong baseaddress, jint sizeofbase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadSavedStateModuleSymbolsEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)imagename, (uint32_t)imagetimestamp, (void*)(uintptr_t)modulename, (uint64_t)baseaddress, (uint32_t)sizeofbase) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)imagename;
    (void)imagetimestamp;
    (void)modulename;
    (void)baseaddress;
    (void)sizeofbase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1loadSavedStateSymbolProvider(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong usersymbols, jint force) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadSavedStateSymbolProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)usersymbols, (int32_t)force) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)usersymbols;
    (void)force;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1locateSavedStateFiles(JNIEnv* km_env, jclass km_clazz, jlong vmname, jlong snapshotname, jlong binpath, jlong vsvpath, jlong vmrspath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocateSavedStateFiles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmname, (void*)(uintptr_t)snapshotname, (void*)(uintptr_t)binpath, (void*)(uintptr_t)vsvpath, (void*)(uintptr_t)vmrspath) : -1;
#else
    (void)vmname;
    (void)snapshotname;
    (void)binpath;
    (void)vsvpath;
    (void)vmrspath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1readGuestPhysicalAddress(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong physicaladdress, jlong buffer, jint buffersize, jlong bytesread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadGuestPhysicalAddress");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint64_t)physicaladdress, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesread) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)physicaladdress;
    (void)buffer;
    (void)buffersize;
    (void)bytesread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1readGuestRawSavedMemory(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong rawsavedmemoryoffset, jlong buffer, jint buffersize, jlong bytesread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadGuestRawSavedMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint64_t)rawsavedmemoryoffset, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bytesread) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)rawsavedmemoryoffset;
    (void)buffer;
    (void)buffersize;
    (void)bytesread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1readSavedStateGlobalVariable(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong globalname, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadSavedStateGlobalVariable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)globalname, (void*)(uintptr_t)buffer, (uint32_t)buffersize) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)globalname;
    (void)buffer;
    (void)buffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1releaseSavedStateFiles(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseSavedStateFiles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle) : -1;
#else
    (void)vmsavedstatedumphandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1releaseSavedStateSymbolProvider(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseSavedStateSymbolProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle) : -1;
#else
    (void)vmsavedstatedumphandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1resolveSavedStateGlobalVariableAddress(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong globalname, jlong virtualaddress, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResolveSavedStateGlobalVariableAddress");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (void*)(uintptr_t)globalname, (void*)(uintptr_t)virtualaddress, (void*)(uintptr_t)size) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)globalname;
    (void)virtualaddress;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1scanMemoryForDosImages(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jint vpid, jlong startaddress, jlong endaddress, jlong callbackcontext, jlong foundimagecallback, jlong standaloneaddress, jint standaloneaddresscount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScanMemoryForDosImages");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint32_t)vpid, (uint64_t)startaddress, (uint64_t)endaddress, (void*)(uintptr_t)callbackcontext, (void*)(uintptr_t)foundimagecallback, (void*)(uintptr_t)standaloneaddress, (uint32_t)standaloneaddresscount) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)vpid;
    (void)startaddress;
    (void)endaddress;
    (void)callbackcontext;
    (void)foundimagecallback;
    (void)standaloneaddress;
    (void)standaloneaddresscount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1setMemoryBlockCacheLimit(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong memoryblockcachelimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMemoryBlockCacheLimit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (uint64_t)memoryblockcachelimit) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)memoryblockcachelimit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1setSavedStateSymbolProviderDebugInfoCallback(JNIEnv* km_env, jclass km_clazz, jlong vmsavedstatedumphandle, jlong callback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vmsavedstatedumpprovider.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSavedStateSymbolProviderDebugInfoCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vmsavedstatedumphandle, (void*)(uintptr_t)callback) : -1;
#else
    (void)vmsavedstatedumphandle;
    (void)callback;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvAcceptPartitionMigration(JNIEnv* km_env, jclass km_clazz, jlong migrationhandle, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvAcceptPartitionMigration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)migrationhandle, (void*)(uintptr_t)partition) : -1;
#else
    (void)migrationhandle;
    (void)partition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvAdviseGpaRange(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong gparanges, jint gparangescount, jint advice, jlong advicebuffer, jint advicebuffersizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvAdviseGpaRange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (void*)(uintptr_t)gparanges, (uint32_t)gparangescount, (int32_t)advice, (void*)(uintptr_t)advicebuffer, (uint32_t)advicebuffersizeinbytes) : -1;
#else
    (void)partition;
    (void)gparanges;
    (void)gparangescount;
    (void)advice;
    (void)advicebuffer;
    (void)advicebuffersizeinbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvAllocateVpciResource(JNIEnv* km_env, jclass km_clazz, jlong providerid, jint flags, jlong resourcedescriptor, jint resourcedescriptorsizeinbytes, jlong vpciresource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvAllocateVpciResource");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)providerid, (int32_t)flags, (void*)(uintptr_t)resourcedescriptor, (uint32_t)resourcedescriptorsizeinbytes, (void*)(uintptr_t)vpciresource) : -1;
#else
    (void)providerid;
    (void)flags;
    (void)resourcedescriptor;
    (void)resourcedescriptorsizeinbytes;
    (void)vpciresource;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvCancelPartitionMigration(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCancelPartitionMigration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvCancelRunVirtualProcessor(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCancelRunVirtualProcessor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (uint32_t)flags) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvCompletePartitionMigration(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCompletePartitionMigration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvCreateNotificationPort(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong parameters, jlong eventhandle, jlong porthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreateNotificationPort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (void*)(uintptr_t)parameters, (void*)(uintptr_t)eventhandle, (void*)(uintptr_t)porthandle) : -1;
#else
    (void)partition;
    (void)parameters;
    (void)eventhandle;
    (void)porthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvCreatePartition(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreatePartition");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvCreateTrigger(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong parameters, jlong triggerhandle, jlong eventhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreateTrigger");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (void*)(uintptr_t)parameters, (void*)(uintptr_t)triggerhandle, (void*)(uintptr_t)eventhandle) : -1;
#else
    (void)partition;
    (void)parameters;
    (void)triggerhandle;
    (void)eventhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvCreateVirtualProcessor(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreateVirtualProcessor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (uint32_t)flags) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvCreateVirtualProcessor2(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong properties, jint propertycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreateVirtualProcessor2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)properties, (uint32_t)propertycount) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)properties;
    (void)propertycount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvCreateVpciDevice(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jlong vpciresource, jint flags, jlong notificationeventhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvCreateVpciDevice");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (void*)(uintptr_t)vpciresource, (int32_t)flags, (void*)(uintptr_t)notificationeventhandle) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)vpciresource;
    (void)flags;
    (void)notificationeventhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvDeleteNotificationPort(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong porthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvDeleteNotificationPort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (void*)(uintptr_t)porthandle) : -1;
#else
    (void)partition;
    (void)porthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvDeletePartition(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvDeletePartition");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvDeleteTrigger(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong triggerhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvDeleteTrigger");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (void*)(uintptr_t)triggerhandle) : -1;
#else
    (void)partition;
    (void)triggerhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvDeleteVirtualProcessor(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvDeleteVirtualProcessor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex) : -1;
#else
    (void)partition;
    (void)vpindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvDeleteVpciDevice(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvDeleteVpciDevice");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvEmulatorCreateEmulator(JNIEnv* km_env, jclass km_clazz, jlong callbacks, jlong emulator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvEmulatorCreateEmulator");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbacks, (void*)(uintptr_t)emulator) : -1;
#else
    (void)callbacks;
    (void)emulator;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvEmulatorDestroyEmulator(JNIEnv* km_env, jclass km_clazz, jlong emulator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvEmulatorDestroyEmulator");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)emulator) : -1;
#else
    (void)emulator;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvEmulatorTryIoEmulation(JNIEnv* km_env, jclass km_clazz, jlong emulator, jlong context, jlong vpcontext, jlong ioinstructioncontext, jlong emulatorreturnstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvEmulatorTryIoEmulation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)emulator, (void*)(uintptr_t)context, (void*)(uintptr_t)vpcontext, (void*)(uintptr_t)ioinstructioncontext, (void*)(uintptr_t)emulatorreturnstatus) : -1;
#else
    (void)emulator;
    (void)context;
    (void)vpcontext;
    (void)ioinstructioncontext;
    (void)emulatorreturnstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvEmulatorTryMmioEmulation(JNIEnv* km_env, jclass km_clazz, jlong emulator, jlong context, jlong vpcontext, jlong mmioinstructioncontext, jlong emulatorreturnstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvemulation.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvEmulatorTryMmioEmulation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)emulator, (void*)(uintptr_t)context, (void*)(uintptr_t)vpcontext, (void*)(uintptr_t)mmioinstructioncontext, (void*)(uintptr_t)emulatorreturnstatus) : -1;
#else
    (void)emulator;
    (void)context;
    (void)vpcontext;
    (void)mmioinstructioncontext;
    (void)emulatorreturnstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvGetCapability(JNIEnv* km_env, jclass km_clazz, jint capabilitycode, jlong capabilitybuffer, jint capabilitybuffersizeinbytes, jlong writtensizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetCapability");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)capabilitycode, (void*)(uintptr_t)capabilitybuffer, (uint32_t)capabilitybuffersizeinbytes, (void*)(uintptr_t)writtensizeinbytes) : -1;
#else
    (void)capabilitycode;
    (void)capabilitybuffer;
    (void)capabilitybuffersizeinbytes;
    (void)writtensizeinbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvGetInterruptTargetVpSet(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong destination, jint destinationmode, jlong targetvps, jint vpcount, jlong targetvpcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetInterruptTargetVpSet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)destination, (int32_t)destinationmode, (void*)(uintptr_t)targetvps, (uint32_t)vpcount, (void*)(uintptr_t)targetvpcount) : -1;
#else
    (void)partition;
    (void)destination;
    (void)destinationmode;
    (void)targetvps;
    (void)vpcount;
    (void)targetvpcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvGetPartitionCounters(JNIEnv* km_env, jclass km_clazz, jlong partition, jint counterset, jlong buffer, jint buffersizeinbytes, jlong byteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetPartitionCounters");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (int32_t)counterset, (void*)(uintptr_t)buffer, (uint32_t)buffersizeinbytes, (void*)(uintptr_t)byteswritten) : -1;
#else
    (void)partition;
    (void)counterset;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvGetPartitionProperty(JNIEnv* km_env, jclass km_clazz, jlong partition, jint propertycode, jlong propertybuffer, jint propertybuffersizeinbytes, jlong writtensizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetPartitionProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (int32_t)propertycode, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersizeinbytes, (void*)(uintptr_t)writtensizeinbytes) : -1;
#else
    (void)partition;
    (void)propertycode;
    (void)propertybuffer;
    (void)propertybuffersizeinbytes;
    (void)writtensizeinbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvGetVirtualProcessorCounters(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jint counterset, jlong buffer, jint buffersizeinbytes, jlong byteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorCounters");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (int32_t)counterset, (void*)(uintptr_t)buffer, (uint32_t)buffersizeinbytes, (void*)(uintptr_t)byteswritten) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)counterset;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvGetVirtualProcessorCpuidOutput(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jint eax, jint ecx, jlong cpuidoutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorCpuidOutput");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (uint32_t)eax, (uint32_t)ecx, (void*)(uintptr_t)cpuidoutput) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)eax;
    (void)ecx;
    (void)cpuidoutput;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvGetVirtualProcessorInterruptControllerState(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong state, jint statesize, jlong writtensize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorInterruptControllerState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)state, (uint32_t)statesize, (void*)(uintptr_t)writtensize) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    (void)writtensize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvGetVirtualProcessorInterruptControllerState2(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong state, jint statesize, jlong writtensize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorInterruptControllerState2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)state, (uint32_t)statesize, (void*)(uintptr_t)writtensize) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    (void)writtensize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvGetVirtualProcessorRegisters(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong registernames, jint registercount, jlong registervalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorRegisters");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)registernames, (uint32_t)registercount, (void*)(uintptr_t)registervalues) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)registernames;
    (void)registercount;
    (void)registervalues;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvGetVirtualProcessorState(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jint statetype, jlong buffer, jint buffersizeinbytes, jlong byteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (int32_t)statetype, (void*)(uintptr_t)buffer, (uint32_t)buffersizeinbytes, (void*)(uintptr_t)byteswritten) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)statetype;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvGetVirtualProcessorXsaveState(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong buffer, jint buffersizeinbytes, jlong byteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVirtualProcessorXsaveState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)buffer, (uint32_t)buffersizeinbytes, (void*)(uintptr_t)byteswritten) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)buffer;
    (void)buffersizeinbytes;
    (void)byteswritten;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvGetVpciDeviceInterruptTarget(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jint arg_2_index, jint multimessagenumber, jlong target, jint targetsizeinbytes, jlong byteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVpciDeviceInterruptTarget");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (uint32_t)arg_2_index, (uint32_t)multimessagenumber, (void*)(uintptr_t)target, (uint32_t)targetsizeinbytes, (void*)(uintptr_t)byteswritten) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_index;
    (void)multimessagenumber;
    (void)target;
    (void)targetsizeinbytes;
    (void)byteswritten;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvGetVpciDeviceNotification(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jlong notification, jint notificationsizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVpciDeviceNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (void*)(uintptr_t)notification, (uint32_t)notificationsizeinbytes) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)notification;
    (void)notificationsizeinbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvGetVpciDeviceProperty(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jint propertycode, jlong propertybuffer, jint propertybuffersizeinbytes, jlong writtensizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvGetVpciDeviceProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (int32_t)propertycode, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersizeinbytes, (void*)(uintptr_t)writtensizeinbytes) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)propertycode;
    (void)propertybuffer;
    (void)propertybuffersizeinbytes;
    (void)writtensizeinbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvMapGpaRange(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong sourceaddress, jlong guestaddress, jlong sizeinbytes, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvMapGpaRange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (void*)(uintptr_t)sourceaddress, (uint64_t)guestaddress, (uint64_t)sizeinbytes, (int32_t)flags) : -1;
#else
    (void)partition;
    (void)sourceaddress;
    (void)guestaddress;
    (void)sizeinbytes;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvMapGpaRange2(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong process, jlong sourceaddress, jlong guestaddress, jlong sizeinbytes, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvMapGpaRange2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (void*)(uintptr_t)process, (void*)(uintptr_t)sourceaddress, (uint64_t)guestaddress, (uint64_t)sizeinbytes, (int32_t)flags) : -1;
#else
    (void)partition;
    (void)process;
    (void)sourceaddress;
    (void)guestaddress;
    (void)sizeinbytes;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvMapVpciDeviceInterrupt(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jint arg_2_index, jint messagecount, jlong target, jlong msiaddress, jlong msidata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvMapVpciDeviceInterrupt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (uint32_t)arg_2_index, (uint32_t)messagecount, (void*)(uintptr_t)target, (void*)(uintptr_t)msiaddress, (void*)(uintptr_t)msidata) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_index;
    (void)messagecount;
    (void)target;
    (void)msiaddress;
    (void)msidata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvMapVpciDeviceMmioRanges(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jlong mappingcount, jlong mappings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvMapVpciDeviceMmioRanges");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (void*)(uintptr_t)mappingcount, (void*)(uintptr_t)mappings) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)mappingcount;
    (void)mappings;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvPostVirtualProcessorSynicMessage(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jint sintindex, jlong message, jint messagesizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvPostVirtualProcessorSynicMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (uint32_t)sintindex, (void*)(uintptr_t)message, (uint32_t)messagesizeinbytes) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)sintindex;
    (void)message;
    (void)messagesizeinbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvQueryGpaRangeDirtyBitmap(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong guestaddress, jlong rangesizeinbytes, jlong bitmap, jint bitmapsizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvQueryGpaRangeDirtyBitmap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)guestaddress, (uint64_t)rangesizeinbytes, (void*)(uintptr_t)bitmap, (uint32_t)bitmapsizeinbytes) : -1;
#else
    (void)partition;
    (void)guestaddress;
    (void)rangesizeinbytes;
    (void)bitmap;
    (void)bitmapsizeinbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvReadVpciDeviceRegister(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jlong arg_2_register, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvReadVpciDeviceRegister");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (void*)(uintptr_t)arg_2_register, (void*)(uintptr_t)data) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_register;
    (void)data;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvRegisterPartitionDoorbellEvent(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong matchdata, jlong eventhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvRegisterPartitionDoorbellEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (void*)(uintptr_t)matchdata, (void*)(uintptr_t)eventhandle) : -1;
#else
    (void)partition;
    (void)matchdata;
    (void)eventhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvRequestInterrupt(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong interrupt, jint interruptcontrolsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvRequestInterrupt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (void*)(uintptr_t)interrupt, (uint32_t)interruptcontrolsize) : -1;
#else
    (void)partition;
    (void)interrupt;
    (void)interruptcontrolsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvRequestVpciDeviceInterrupt(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jlong msiaddress, jint msidata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvRequestVpciDeviceInterrupt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (uint64_t)msiaddress, (uint32_t)msidata) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)msiaddress;
    (void)msidata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvResetPartition(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvResetPartition");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvResumePartitionTime(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvResumePartitionTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvRetargetVpciDeviceInterrupt(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jlong msiaddress, jint msidata, jlong target) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvRetargetVpciDeviceInterrupt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (uint64_t)msiaddress, (uint32_t)msidata, (void*)(uintptr_t)target) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)msiaddress;
    (void)msidata;
    (void)target;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvRunVirtualProcessor(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong exitcontext, jint exitcontextsizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvRunVirtualProcessor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)exitcontext, (uint32_t)exitcontextsizeinbytes) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)exitcontext;
    (void)exitcontextsizeinbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvSetNotificationPortProperty(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong porthandle, jint propertycode, jlong propertyvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetNotificationPortProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (void*)(uintptr_t)porthandle, (int32_t)propertycode, (uint64_t)propertyvalue) : -1;
#else
    (void)partition;
    (void)porthandle;
    (void)propertycode;
    (void)propertyvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvSetPartitionProperty(JNIEnv* km_env, jclass km_clazz, jlong partition, jint propertycode, jlong propertybuffer, jint propertybuffersizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetPartitionProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (int32_t)propertycode, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersizeinbytes) : -1;
#else
    (void)partition;
    (void)propertycode;
    (void)propertybuffer;
    (void)propertybuffersizeinbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvSetVirtualProcessorInterruptControllerState(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong state, jint statesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVirtualProcessorInterruptControllerState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)state, (uint32_t)statesize) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvSetVirtualProcessorInterruptControllerState2(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong state, jint statesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVirtualProcessorInterruptControllerState2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)state, (uint32_t)statesize) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)state;
    (void)statesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvSetVirtualProcessorRegisters(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong registernames, jint registercount, jlong registervalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVirtualProcessorRegisters");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)registernames, (uint32_t)registercount, (void*)(uintptr_t)registervalues) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)registernames;
    (void)registercount;
    (void)registervalues;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvSetVirtualProcessorState(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jint statetype, jlong buffer, jint buffersizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVirtualProcessorState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (int32_t)statetype, (void*)(uintptr_t)buffer, (uint32_t)buffersizeinbytes) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)statetype;
    (void)buffer;
    (void)buffersizeinbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvSetVirtualProcessorXsaveState(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong buffer, jint buffersizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVirtualProcessorXsaveState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (void*)(uintptr_t)buffer, (uint32_t)buffersizeinbytes) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)buffer;
    (void)buffersizeinbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvSetVpciDevicePowerState(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jint powerstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetVpciDevicePowerState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (int32_t)powerstate) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)powerstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvSetupPartition(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSetupPartition");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvStartPartitionMigration(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong migrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvStartPartitionMigration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (void*)(uintptr_t)migrationhandle) : -1;
#else
    (void)partition;
    (void)migrationhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvSuspendPartitionTime(JNIEnv* km_env, jclass km_clazz, jlong partition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvSuspendPartitionTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition) : -1;
#else
    (void)partition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvTranslateGva(JNIEnv* km_env, jclass km_clazz, jlong partition, jint vpindex, jlong gva, jint translateflags, jlong translationresult, jlong gpa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvTranslateGva");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint32_t)vpindex, (uint64_t)gva, (int32_t)translateflags, (void*)(uintptr_t)translationresult, (void*)(uintptr_t)gpa) : -1;
#else
    (void)partition;
    (void)vpindex;
    (void)gva;
    (void)translateflags;
    (void)translationresult;
    (void)gpa;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvUnmapGpaRange(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong guestaddress, jlong sizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvUnmapGpaRange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)guestaddress, (uint64_t)sizeinbytes) : -1;
#else
    (void)partition;
    (void)guestaddress;
    (void)sizeinbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvUnmapVpciDeviceInterrupt(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jint arg_2_index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvUnmapVpciDeviceInterrupt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (uint32_t)arg_2_index) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_index;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvUnmapVpciDeviceMmioRanges(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvUnmapVpciDeviceMmioRanges");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvUnregisterPartitionDoorbellEvent(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong matchdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvUnregisterPartitionDoorbellEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (void*)(uintptr_t)matchdata) : -1;
#else
    (void)partition;
    (void)matchdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvUpdateTriggerParameters(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong parameters, jlong triggerhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvUpdateTriggerParameters");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (void*)(uintptr_t)parameters, (void*)(uintptr_t)triggerhandle) : -1;
#else
    (void)partition;
    (void)parameters;
    (void)triggerhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_hypervisor_WindowsWin32SystemHypervisorJniBridge_windowssys_1windows_1win32_1system_1hypervisor_1wHvWriteVpciDeviceRegister(JNIEnv* km_env, jclass km_clazz, jlong partition, jlong logicaldeviceid, jlong arg_2_register, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winhvplatform.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WHvWriteVpciDeviceRegister");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)partition, (uint64_t)logicaldeviceid, (void*)(uintptr_t)arg_2_register, (void*)(uintptr_t)data) : -1;
#else
    (void)partition;
    (void)logicaldeviceid;
    (void)arg_2_register;
    (void)data;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

