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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmAddGroupMembershipEntry(JNIEnv* km_env, jclass km_clazz, jlong hprotocol, jint dwsourceaddr, jint dwsourcemask, jint dwgroupaddr, jint dwgroupmask, jint dwifindex, jint dwifnexthopipaddr, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmAddGroupMembershipEntry");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprotocol, (uint32_t)dwsourceaddr, (uint32_t)dwsourcemask, (uint32_t)dwgroupaddr, (uint32_t)dwgroupmask, (uint32_t)dwifindex, (uint32_t)dwifnexthopipaddr, (uint32_t)dwflags) : 0;
#else
    (void)hprotocol;
    (void)dwsourceaddr;
    (void)dwsourcemask;
    (void)dwgroupaddr;
    (void)dwgroupmask;
    (void)dwifindex;
    (void)dwifnexthopipaddr;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmDeRegisterMProtocol(JNIEnv* km_env, jclass km_clazz, jlong hprotocol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmDeRegisterMProtocol");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprotocol) : 0;
#else
    (void)hprotocol;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmDeleteGroupMembershipEntry(JNIEnv* km_env, jclass km_clazz, jlong hprotocol, jint dwsourceaddr, jint dwsourcemask, jint dwgroupaddr, jint dwgroupmask, jint dwifindex, jint dwifnexthopipaddr, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmDeleteGroupMembershipEntry");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprotocol, (uint32_t)dwsourceaddr, (uint32_t)dwsourcemask, (uint32_t)dwgroupaddr, (uint32_t)dwgroupmask, (uint32_t)dwifindex, (uint32_t)dwifnexthopipaddr, (uint32_t)dwflags) : 0;
#else
    (void)hprotocol;
    (void)dwsourceaddr;
    (void)dwsourcemask;
    (void)dwgroupaddr;
    (void)dwgroupmask;
    (void)dwifindex;
    (void)dwifnexthopipaddr;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmGetFirstMfe(JNIEnv* km_env, jclass km_clazz, jlong pdwbuffersize, jlong pbbuffer, jlong pdwnumentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetFirstMfe");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pbbuffer, (void*)(uintptr_t)pdwnumentries) : 0;
#else
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmGetFirstMfeStats(JNIEnv* km_env, jclass km_clazz, jlong pdwbuffersize, jlong pbbuffer, jlong pdwnumentries, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetFirstMfeStats");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pbbuffer, (void*)(uintptr_t)pdwnumentries, (uint32_t)dwflags) : 0;
#else
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmGetMfe(JNIEnv* km_env, jclass km_clazz, jlong pimm, jlong pdwbuffersize, jlong pbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetMfe");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pimm, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pbbuffer) : 0;
#else
    (void)pimm;
    (void)pdwbuffersize;
    (void)pbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmGetMfeStats(JNIEnv* km_env, jclass km_clazz, jlong pimm, jlong pdwbuffersize, jlong pbbuffer, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetMfeStats");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pimm, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pbbuffer, (uint32_t)dwflags) : 0;
#else
    (void)pimm;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmGetNextMfe(JNIEnv* km_env, jclass km_clazz, jlong pimmstart, jlong pdwbuffersize, jlong pbbuffer, jlong pdwnumentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetNextMfe");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pimmstart, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pbbuffer, (void*)(uintptr_t)pdwnumentries) : 0;
#else
    (void)pimmstart;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmGetNextMfeStats(JNIEnv* km_env, jclass km_clazz, jlong pimmstart, jlong pdwbuffersize, jlong pbbuffer, jlong pdwnumentries, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetNextMfeStats");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pimmstart, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pbbuffer, (void*)(uintptr_t)pdwnumentries, (uint32_t)dwflags) : 0;
#else
    (void)pimmstart;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmGetProtocolOnInterface(JNIEnv* km_env, jclass km_clazz, jint dwifindex, jint dwifnexthopaddr, jlong pdwifprotocolid, jlong pdwifcomponentid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetProtocolOnInterface");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwifindex, (uint32_t)dwifnexthopaddr, (void*)(uintptr_t)pdwifprotocolid, (void*)(uintptr_t)pdwifcomponentid) : 0;
#else
    (void)dwifindex;
    (void)dwifnexthopaddr;
    (void)pdwifprotocolid;
    (void)pdwifcomponentid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmGroupEnumerationEnd(JNIEnv* km_env, jclass km_clazz, jlong henum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGroupEnumerationEnd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henum) : 0;
#else
    (void)henum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmGroupEnumerationGetNext(JNIEnv* km_env, jclass km_clazz, jlong henum, jlong pdwbuffersize, jlong pbbuffer, jlong pdwnumentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGroupEnumerationGetNext");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henum, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pbbuffer, (void*)(uintptr_t)pdwnumentries) : 0;
#else
    (void)henum;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmGroupEnumerationStart(JNIEnv* km_env, jclass km_clazz, jlong hprotocol, jint metenumtype, jlong phenumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGroupEnumerationStart");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprotocol, (int32_t)metenumtype, (void*)(uintptr_t)phenumhandle) : 0;
#else
    (void)hprotocol;
    (void)metenumtype;
    (void)phenumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmRegisterMProtocol(JNIEnv* km_env, jclass km_clazz, jlong prpiinfo, jint dwprotocolid, jint dwcomponentid, jlong phprotocol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmRegisterMProtocol");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prpiinfo, (uint32_t)dwprotocolid, (uint32_t)dwcomponentid, (void*)(uintptr_t)phprotocol) : 0;
#else
    (void)prpiinfo;
    (void)dwprotocolid;
    (void)dwcomponentid;
    (void)phprotocol;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmReleaseInterfaceOwnership(JNIEnv* km_env, jclass km_clazz, jlong hprotocol, jint dwifindex, jint dwifnexthopaddr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmReleaseInterfaceOwnership");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprotocol, (uint32_t)dwifindex, (uint32_t)dwifnexthopaddr) : 0;
#else
    (void)hprotocol;
    (void)dwifindex;
    (void)dwifnexthopaddr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MgmTakeInterfaceOwnership(JNIEnv* km_env, jclass km_clazz, jlong hprotocol, jint dwifindex, jint dwifnexthopaddr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmTakeInterfaceOwnership");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprotocol, (uint32_t)dwifindex, (uint32_t)dwifnexthopaddr) : 0;
#else
    (void)hprotocol;
    (void)dwifindex;
    (void)dwifnexthopaddr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminBufferFree(JNIEnv* km_env, jclass km_clazz, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminBufferFree");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbuffer) : 0;
#else
    (void)pbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminConnectionClearStats(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hrasconnection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionClearStats");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hrasserver, (void*)(uintptr_t)hrasconnection) : 0;
#else
    (void)hrasserver;
    (void)hrasconnection;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminConnectionEnum(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jint dwlevel, jlong lplpbbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hrasserver, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer, (uint32_t)dwprefmaxlen, (void*)(uintptr_t)lpdwentriesread, (void*)(uintptr_t)lpdwtotalentries, (void*)(uintptr_t)lpdwresumehandle) : 0;
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminConnectionEnumEx(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong pobjectheader, jint dwpreferedmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong pprasconn, jlong lpdwresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionEnumEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hrasserver, (void*)(uintptr_t)pobjectheader, (uint32_t)dwpreferedmaxlen, (void*)(uintptr_t)lpdwentriesread, (void*)(uintptr_t)lpdwtotalentries, (void*)(uintptr_t)pprasconn, (void*)(uintptr_t)lpdwresumehandle) : 0;
#else
    (void)hrasserver;
    (void)pobjectheader;
    (void)dwpreferedmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)pprasconn;
    (void)lpdwresumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminConnectionGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jint dwlevel, jlong hrasconnection, jlong lplpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hrasserver, (uint32_t)dwlevel, (void*)(uintptr_t)hrasconnection, (void*)(uintptr_t)lplpbbuffer) : 0;
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)hrasconnection;
    (void)lplpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminConnectionGetInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hrasconnection, jlong prasconnection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionGetInfoEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hrasserver, (void*)(uintptr_t)hrasconnection, (void*)(uintptr_t)prasconnection) : 0;
#else
    (void)hrasserver;
    (void)hrasconnection;
    (void)prasconnection;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminConnectionRemoveQuarantine(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hrasconnection, jint fisipaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionRemoveQuarantine");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrasserver, (void*)(uintptr_t)hrasconnection, (int32_t)fisipaddress) : 0;
#else
    (void)hrasserver;
    (void)hrasconnection;
    (void)fisipaddress;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminDeregisterConnectionNotification(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong heventnotification) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminDeregisterConnectionNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)heventnotification) : 0;
#else
    (void)hmprserver;
    (void)heventnotification;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminDeviceEnum(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lplpbbuffer, jlong lpdwtotalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminDeviceEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer, (void*)(uintptr_t)lpdwtotalentries) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    (void)lpdwtotalentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminEstablishDomainRasServer(JNIEnv* km_env, jclass km_clazz, jlong pszdomain, jlong pszmachine, jint benable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminEstablishDomainRasServer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdomain, (void*)(uintptr_t)pszmachine, (int32_t)benable) : 0;
#else
    (void)pszdomain;
    (void)pszmachine;
    (void)benable;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminGetErrorString(JNIEnv* km_env, jclass km_clazz, jint dwerror, jlong lplpwserrorstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminGetErrorString");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwerror, (void*)(uintptr_t)lplpwserrorstring) : 0;
#else
    (void)dwerror;
    (void)lplpwserrorstring;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminGetPDCServer(JNIEnv* km_env, jclass km_clazz, jlong lpszdomain, jlong lpszserver, jlong lpszpdcserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminGetPDCServer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdomain, (void*)(uintptr_t)lpszserver, (void*)(uintptr_t)lpszpdcserver) : 0;
#else
    (void)lpszdomain;
    (void)lpszserver;
    (void)lpszpdcserver;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceConnect(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jlong hevent, jint fsynchronous) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceConnect");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (void*)(uintptr_t)hevent, (int32_t)fsynchronous) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)hevent;
    (void)fsynchronous;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceCreate(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lpbbuffer, jlong phinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceCreate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer, (void*)(uintptr_t)phinterface) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    (void)phinterface;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceDelete(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceDelete");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceDeviceGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwindex, jint dwlevel, jlong lplpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceDeviceGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwindex, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbuffer) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwindex;
    (void)dwlevel;
    (void)lplpbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceDeviceSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwindex, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceDeviceSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwindex, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwindex;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceDisconnect");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceEnum(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lplpbbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer, (uint32_t)dwprefmaxlen, (void*)(uintptr_t)lpdwentriesread, (void*)(uintptr_t)lpdwtotalentries, (void*)(uintptr_t)lpdwresumehandle) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceGetCredentials(JNIEnv* km_env, jclass km_clazz, jlong lpwsserver, jlong lpwsinterfacename, jlong lpwsusername, jlong lpwspassword, jlong lpwsdomainname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceGetCredentials");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpwsserver, (void*)(uintptr_t)lpwsinterfacename, (void*)(uintptr_t)lpwsusername, (void*)(uintptr_t)lpwspassword, (void*)(uintptr_t)lpwsdomainname) : 0;
#else
    (void)lpwsserver;
    (void)lpwsinterfacename;
    (void)lpwsusername;
    (void)lpwspassword;
    (void)lpwsdomainname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceGetCredentialsEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwlevel, jlong lplpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceGetCredentialsEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lplpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceGetCustomInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jlong pcustominfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceGetCustomInfoEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (void*)(uintptr_t)pcustominfo) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)pcustominfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceGetHandle(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong lpwsinterfacename, jlong phinterface, jint fincludeclientinterfaces) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceGetHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)lpwsinterfacename, (void*)(uintptr_t)phinterface, (int32_t)fincludeclientinterfaces) : 0;
#else
    (void)hmprserver;
    (void)lpwsinterfacename;
    (void)phinterface;
    (void)fincludeclientinterfaces;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwlevel, jlong lplpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lplpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceQueryUpdateResult(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwprotocolid, jlong lpdwupdateresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceQueryUpdateResult");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwprotocolid, (void*)(uintptr_t)lpdwupdateresult) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwprotocolid;
    (void)lpdwupdateresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceSetCredentials(JNIEnv* km_env, jclass km_clazz, jlong lpwsserver, jlong lpwsinterfacename, jlong lpwsusername, jlong lpwsdomainname, jlong lpwspassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceSetCredentials");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpwsserver, (void*)(uintptr_t)lpwsinterfacename, (void*)(uintptr_t)lpwsusername, (void*)(uintptr_t)lpwsdomainname, (void*)(uintptr_t)lpwspassword) : 0;
#else
    (void)lpwsserver;
    (void)lpwsinterfacename;
    (void)lpwsusername;
    (void)lpwsdomainname;
    (void)lpwspassword;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceSetCredentialsEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceSetCredentialsEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceSetCustomInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jlong pcustominfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceSetCustomInfoEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (void*)(uintptr_t)pcustominfo) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)pcustominfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceTransportAdd(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwtransportid, jlong pinterfaceinfo, jint dwinterfaceinfosize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceTransportAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwtransportid, (void*)(uintptr_t)pinterfaceinfo, (uint32_t)dwinterfaceinfosize) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceTransportGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwtransportid, jlong ppinterfaceinfo, jlong lpdwinterfaceinfosize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceTransportGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwtransportid, (void*)(uintptr_t)ppinterfaceinfo, (void*)(uintptr_t)lpdwinterfaceinfosize) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    (void)ppinterfaceinfo;
    (void)lpdwinterfaceinfosize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceTransportRemove(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwtransportid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceTransportRemove");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwtransportid) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceTransportSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwtransportid, jlong pinterfaceinfo, jint dwinterfaceinfosize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceTransportSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwtransportid, (void*)(uintptr_t)pinterfaceinfo, (uint32_t)dwinterfaceinfosize) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceUpdatePhonebookInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceUpdatePhonebookInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminInterfaceUpdateRoutes(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwprotocolid, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceUpdateRoutes");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwprotocolid, (void*)(uintptr_t)hevent) : 0;
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwprotocolid;
    (void)hevent;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminIsDomainRasServer(JNIEnv* km_env, jclass km_clazz, jlong pszdomain, jlong pszmachine, jlong pbisrasserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminIsDomainRasServer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdomain, (void*)(uintptr_t)pszmachine, (void*)(uintptr_t)pbisrasserver) : 0;
#else
    (void)pszdomain;
    (void)pszmachine;
    (void)pbisrasserver;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminIsServiceInitialized(JNIEnv* km_env, jclass km_clazz, jlong lpwsservername, jlong fisserviceinitialized) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminIsServiceInitialized");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpwsservername, (void*)(uintptr_t)fisserviceinitialized) : 0;
#else
    (void)lpwsservername;
    (void)fisserviceinitialized;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminIsServiceRunning(JNIEnv* km_env, jclass km_clazz, jlong lpwsservername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminIsServiceRunning");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpwsservername) : -1;
#else
    (void)lpwsservername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminMIBBufferFree(JNIEnv* km_env, jclass km_clazz, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBBufferFree");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbuffer) : 0;
#else
    (void)pbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminMIBEntryCreate(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwpid, jint dwroutingpid, jlong lpentry, jint dwentrysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntryCreate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmibserver, (uint32_t)dwpid, (uint32_t)dwroutingpid, (void*)(uintptr_t)lpentry, (uint32_t)dwentrysize) : 0;
#else
    (void)hmibserver;
    (void)dwpid;
    (void)dwroutingpid;
    (void)lpentry;
    (void)dwentrysize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminMIBEntryDelete(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwprotocolid, jint dwroutingpid, jlong lpentry, jint dwentrysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntryDelete");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmibserver, (uint32_t)dwprotocolid, (uint32_t)dwroutingpid, (void*)(uintptr_t)lpentry, (uint32_t)dwentrysize) : 0;
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpentry;
    (void)dwentrysize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminMIBEntryGet(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwprotocolid, jint dwroutingpid, jlong lpinentry, jint dwinentrysize, jlong lplpoutentry, jlong lpoutentrysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntryGet");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmibserver, (uint32_t)dwprotocolid, (uint32_t)dwroutingpid, (void*)(uintptr_t)lpinentry, (uint32_t)dwinentrysize, (void*)(uintptr_t)lplpoutentry, (void*)(uintptr_t)lpoutentrysize) : 0;
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpinentry;
    (void)dwinentrysize;
    (void)lplpoutentry;
    (void)lpoutentrysize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminMIBEntryGetFirst(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwprotocolid, jint dwroutingpid, jlong lpinentry, jint dwinentrysize, jlong lplpoutentry, jlong lpoutentrysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntryGetFirst");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmibserver, (uint32_t)dwprotocolid, (uint32_t)dwroutingpid, (void*)(uintptr_t)lpinentry, (uint32_t)dwinentrysize, (void*)(uintptr_t)lplpoutentry, (void*)(uintptr_t)lpoutentrysize) : 0;
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpinentry;
    (void)dwinentrysize;
    (void)lplpoutentry;
    (void)lpoutentrysize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminMIBEntryGetNext(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwprotocolid, jint dwroutingpid, jlong lpinentry, jint dwinentrysize, jlong lplpoutentry, jlong lpoutentrysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntryGetNext");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmibserver, (uint32_t)dwprotocolid, (uint32_t)dwroutingpid, (void*)(uintptr_t)lpinentry, (uint32_t)dwinentrysize, (void*)(uintptr_t)lplpoutentry, (void*)(uintptr_t)lpoutentrysize) : 0;
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpinentry;
    (void)dwinentrysize;
    (void)lplpoutentry;
    (void)lpoutentrysize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminMIBEntrySet(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwprotocolid, jint dwroutingpid, jlong lpentry, jint dwentrysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntrySet");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmibserver, (uint32_t)dwprotocolid, (uint32_t)dwroutingpid, (void*)(uintptr_t)lpentry, (uint32_t)dwentrysize) : 0;
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpentry;
    (void)dwentrysize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminMIBServerConnect(JNIEnv* km_env, jclass km_clazz, jlong lpwsservername, jlong phmibserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBServerConnect");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpwsservername, (void*)(uintptr_t)phmibserver) : 0;
#else
    (void)lpwsservername;
    (void)phmibserver;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminMIBServerDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hmibserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBServerDisconnect");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)hmibserver);
#else
    (void)hmibserver;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminPortClearStats(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminPortClearStats");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hrasserver, (void*)(uintptr_t)hport) : 0;
#else
    (void)hrasserver;
    (void)hport;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminPortDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminPortDisconnect");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hrasserver, (void*)(uintptr_t)hport) : 0;
#else
    (void)hrasserver;
    (void)hport;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminPortEnum(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jint dwlevel, jlong hrasconnection, jlong lplpbbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminPortEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hrasserver, (uint32_t)dwlevel, (void*)(uintptr_t)hrasconnection, (void*)(uintptr_t)lplpbbuffer, (uint32_t)dwprefmaxlen, (void*)(uintptr_t)lpdwentriesread, (void*)(uintptr_t)lpdwtotalentries, (void*)(uintptr_t)lpdwresumehandle) : 0;
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)hrasconnection;
    (void)lplpbbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminPortGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jint dwlevel, jlong hport, jlong lplpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminPortGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hrasserver, (uint32_t)dwlevel, (void*)(uintptr_t)hport, (void*)(uintptr_t)lplpbbuffer) : 0;
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)hport;
    (void)lplpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminPortReset(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminPortReset");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hrasserver, (void*)(uintptr_t)hport) : 0;
#else
    (void)hrasserver;
    (void)hport;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminRegisterConnectionNotification(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong heventnotification) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminRegisterConnectionNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)heventnotification) : 0;
#else
    (void)hmprserver;
    (void)heventnotification;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminSendUserMessage(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hconnection, jlong lpwszmessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminSendUserMessage");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hconnection, (void*)(uintptr_t)lpwszmessage) : 0;
#else
    (void)hmprserver;
    (void)hconnection;
    (void)lpwszmessage;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminServerConnect(JNIEnv* km_env, jclass km_clazz, jlong lpwsservername, jlong phmprserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerConnect");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpwsservername, (void*)(uintptr_t)phmprserver) : 0;
#else
    (void)lpwsservername;
    (void)phmprserver;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminServerDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hmprserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerDisconnect");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)hmprserver);
#else
    (void)hmprserver;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminServerGetCredentials(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lplpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerGetCredentials");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminServerGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lplpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminServerGetInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong pserverinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerGetInfoEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)pserverinfo) : 0;
#else
    (void)hmprserver;
    (void)pserverinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminServerSetCredentials(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerSetCredentials");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminServerSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminServerSetInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong pserverinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerSetInfoEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)pserverinfo) : 0;
#else
    (void)hmprserver;
    (void)pserverinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminTransportCreate(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwtransportid, jlong lpwstransportname, jlong pglobalinfo, jint dwglobalinfosize, jlong pclientinterfaceinfo, jint dwclientinterfaceinfosize, jlong lpwsdllpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminTransportCreate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (uint32_t)dwtransportid, (void*)(uintptr_t)lpwstransportname, (void*)(uintptr_t)pglobalinfo, (uint32_t)dwglobalinfosize, (void*)(uintptr_t)pclientinterfaceinfo, (uint32_t)dwclientinterfaceinfosize, (void*)(uintptr_t)lpwsdllpath) : 0;
#else
    (void)hmprserver;
    (void)dwtransportid;
    (void)lpwstransportname;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    (void)lpwsdllpath;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminTransportGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwtransportid, jlong ppglobalinfo, jlong lpdwglobalinfosize, jlong ppclientinterfaceinfo, jlong lpdwclientinterfaceinfosize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminTransportGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (uint32_t)dwtransportid, (void*)(uintptr_t)ppglobalinfo, (void*)(uintptr_t)lpdwglobalinfosize, (void*)(uintptr_t)ppclientinterfaceinfo, (void*)(uintptr_t)lpdwclientinterfaceinfosize) : 0;
#else
    (void)hmprserver;
    (void)dwtransportid;
    (void)ppglobalinfo;
    (void)lpdwglobalinfosize;
    (void)ppclientinterfaceinfo;
    (void)lpdwclientinterfaceinfosize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminTransportSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwtransportid, jlong pglobalinfo, jint dwglobalinfosize, jlong pclientinterfaceinfo, jint dwclientinterfaceinfosize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminTransportSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (uint32_t)dwtransportid, (void*)(uintptr_t)pglobalinfo, (uint32_t)dwglobalinfosize, (void*)(uintptr_t)pclientinterfaceinfo, (uint32_t)dwclientinterfaceinfosize) : 0;
#else
    (void)hmprserver;
    (void)dwtransportid;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminUpdateConnection(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hrasconnection, jlong prasupdateconnection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminUpdateConnection");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hrasserver, (void*)(uintptr_t)hrasconnection, (void*)(uintptr_t)prasupdateconnection) : 0;
#else
    (void)hrasserver;
    (void)hrasconnection;
    (void)prasupdateconnection;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminUserGetInfo(JNIEnv* km_env, jclass km_clazz, jlong lpszserver, jlong lpszuser, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminUserGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszserver, (void*)(uintptr_t)lpszuser, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer) : 0;
#else
    (void)lpszserver;
    (void)lpszuser;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprAdminUserSetInfo(JNIEnv* km_env, jclass km_clazz, jlong lpszserver, jlong lpszuser, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminUserSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszserver, (void*)(uintptr_t)lpszuser, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer) : 0;
#else
    (void)lpszserver;
    (void)lpszuser;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigBufferFree(JNIEnv* km_env, jclass km_clazz, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigBufferFree");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbuffer) : 0;
#else
    (void)pbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigFilterGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jint dwtransportid, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigFilterGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwlevel, (uint32_t)dwtransportid, (void*)(uintptr_t)lpbuffer) : 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)dwtransportid;
    (void)lpbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigFilterSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jint dwtransportid, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigFilterSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwlevel, (uint32_t)dwtransportid, (void*)(uintptr_t)lpbuffer) : 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)dwtransportid;
    (void)lpbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigGetFriendlyName(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong pszguidname, jlong pszbuffer, jint dwbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigGetFriendlyName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)pszguidname, (void*)(uintptr_t)pszbuffer, (uint32_t)dwbuffersize) : 0;
#else
    (void)hmprconfig;
    (void)pszguidname;
    (void)pszbuffer;
    (void)dwbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigGetGuidName(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong pszfriendlyname, jlong pszbuffer, jint dwbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigGetGuidName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)pszfriendlyname, (void*)(uintptr_t)pszbuffer, (uint32_t)dwbuffersize) : 0;
#else
    (void)hmprconfig;
    (void)pszfriendlyname;
    (void)pszbuffer;
    (void)dwbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigInterfaceCreate(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jlong lpbbuffer, jlong phrouterinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceCreate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer, (void*)(uintptr_t)phrouterinterface) : 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lpbbuffer;
    (void)phrouterinterface;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigInterfaceDelete(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceDelete");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigInterfaceEnum(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jlong lplpbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbuffer, (uint32_t)dwprefmaxlen, (void*)(uintptr_t)lpdwentriesread, (void*)(uintptr_t)lpdwtotalentries, (void*)(uintptr_t)lpdwresumehandle) : 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigInterfaceGetCustomInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jlong pcustominfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceGetCustomInfoEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (void*)(uintptr_t)pcustominfo) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)pcustominfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigInterfaceGetHandle(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong lpwsinterfacename, jlong phrouterinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceGetHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)lpwsinterfacename, (void*)(uintptr_t)phrouterinterface) : 0;
#else
    (void)hmprconfig;
    (void)lpwsinterfacename;
    (void)phrouterinterface;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigInterfaceGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jint dwlevel, jlong lplpbuffer, jlong lpdwbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbuffer, (void*)(uintptr_t)lpdwbuffersize) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)lpdwbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigInterfaceSetCustomInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jlong pcustominfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceSetCustomInfoEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (void*)(uintptr_t)pcustominfo) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)pcustominfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigInterfaceSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigInterfaceTransportAdd(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jint dwtransportid, jlong lpwstransportname, jlong pinterfaceinfo, jint dwinterfaceinfosize, jlong phrouteriftransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (uint32_t)dwtransportid, (void*)(uintptr_t)lpwstransportname, (void*)(uintptr_t)pinterfaceinfo, (uint32_t)dwinterfaceinfosize, (void*)(uintptr_t)phrouteriftransport) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwtransportid;
    (void)lpwstransportname;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    (void)phrouteriftransport;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigInterfaceTransportEnum(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jint dwlevel, jlong lplpbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbuffer, (uint32_t)dwprefmaxlen, (void*)(uintptr_t)lpdwentriesread, (void*)(uintptr_t)lpdwtotalentries, (void*)(uintptr_t)lpdwresumehandle) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigInterfaceTransportGetHandle(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jint dwtransportid, jlong phrouteriftransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportGetHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (uint32_t)dwtransportid, (void*)(uintptr_t)phrouteriftransport) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwtransportid;
    (void)phrouteriftransport;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigInterfaceTransportGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jlong hrouteriftransport, jlong ppinterfaceinfo, jlong lpdwinterfaceinfosize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (void*)(uintptr_t)hrouteriftransport, (void*)(uintptr_t)ppinterfaceinfo, (void*)(uintptr_t)lpdwinterfaceinfosize) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)hrouteriftransport;
    (void)ppinterfaceinfo;
    (void)lpdwinterfaceinfosize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigInterfaceTransportRemove(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jlong hrouteriftransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportRemove");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (void*)(uintptr_t)hrouteriftransport) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)hrouteriftransport;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigInterfaceTransportSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jlong hrouteriftransport, jlong pinterfaceinfo, jint dwinterfaceinfosize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (void*)(uintptr_t)hrouteriftransport, (void*)(uintptr_t)pinterfaceinfo, (uint32_t)dwinterfaceinfosize) : 0;
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)hrouteriftransport;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigServerBackup(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong lpwspath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerBackup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)lpwspath) : 0;
#else
    (void)hmprconfig;
    (void)lpwspath;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigServerConnect(JNIEnv* km_env, jclass km_clazz, jlong lpwsservername, jlong phmprconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerConnect");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpwsservername, (void*)(uintptr_t)phmprconfig) : 0;
#else
    (void)lpwsservername;
    (void)phmprconfig;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigServerDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerDisconnect");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hmprconfig);
#else
    (void)hmprconfig;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigServerGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jlong lplpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer) : 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lplpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigServerGetInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong pserverinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerGetInfoEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)pserverinfo) : 0;
#else
    (void)hmprconfig;
    (void)pserverinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigServerInstall(JNIEnv* km_env, jclass km_clazz, jint dwlevel, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerInstall");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwlevel, (void*)(uintptr_t)pbuffer) : 0;
#else
    (void)dwlevel;
    (void)pbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigServerRefresh(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerRefresh");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig) : 0;
#else
    (void)hmprconfig;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigServerRestore(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong lpwspath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerRestore");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)lpwspath) : 0;
#else
    (void)hmprconfig;
    (void)lpwspath;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigServerSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer) : 0;
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigServerSetInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong psetserverconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerSetInfoEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)psetserverconfig) : 0;
#else
    (void)hmprconfig;
    (void)psetserverconfig;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigTransportCreate(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwtransportid, jlong lpwstransportname, jlong pglobalinfo, jint dwglobalinfosize, jlong pclientinterfaceinfo, jint dwclientinterfaceinfosize, jlong lpwsdllpath, jlong phroutertransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportCreate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwtransportid, (void*)(uintptr_t)lpwstransportname, (void*)(uintptr_t)pglobalinfo, (uint32_t)dwglobalinfosize, (void*)(uintptr_t)pclientinterfaceinfo, (uint32_t)dwclientinterfaceinfosize, (void*)(uintptr_t)lpwsdllpath, (void*)(uintptr_t)phroutertransport) : 0;
#else
    (void)hmprconfig;
    (void)dwtransportid;
    (void)lpwstransportname;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    (void)lpwsdllpath;
    (void)phroutertransport;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigTransportDelete(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hroutertransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportDelete");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hroutertransport) : 0;
#else
    (void)hmprconfig;
    (void)hroutertransport;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigTransportEnum(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jlong lplpbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbuffer, (uint32_t)dwprefmaxlen, (void*)(uintptr_t)lpdwentriesread, (void*)(uintptr_t)lpdwtotalentries, (void*)(uintptr_t)lpdwresumehandle) : 0;
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigTransportGetHandle(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwtransportid, jlong phroutertransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportGetHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwtransportid, (void*)(uintptr_t)phroutertransport) : 0;
#else
    (void)hmprconfig;
    (void)dwtransportid;
    (void)phroutertransport;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigTransportGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hroutertransport, jlong ppglobalinfo, jlong lpdwglobalinfosize, jlong ppclientinterfaceinfo, jlong lpdwclientinterfaceinfosize, jlong lplpwsdllpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hroutertransport, (void*)(uintptr_t)ppglobalinfo, (void*)(uintptr_t)lpdwglobalinfosize, (void*)(uintptr_t)ppclientinterfaceinfo, (void*)(uintptr_t)lpdwclientinterfaceinfosize, (void*)(uintptr_t)lplpwsdllpath) : 0;
#else
    (void)hmprconfig;
    (void)hroutertransport;
    (void)ppglobalinfo;
    (void)lpdwglobalinfosize;
    (void)ppclientinterfaceinfo;
    (void)lpdwclientinterfaceinfosize;
    (void)lplpwsdllpath;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprConfigTransportSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hroutertransport, jlong pglobalinfo, jint dwglobalinfosize, jlong pclientinterfaceinfo, jint dwclientinterfaceinfosize, jlong lpwsdllpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hroutertransport, (void*)(uintptr_t)pglobalinfo, (uint32_t)dwglobalinfosize, (void*)(uintptr_t)pclientinterfaceinfo, (uint32_t)dwclientinterfaceinfosize, (void*)(uintptr_t)lpwsdllpath) : 0;
#else
    (void)hmprconfig;
    (void)hroutertransport;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    (void)lpwsdllpath;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprInfoBlockAdd(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jint dwinfotype, jint dwitemsize, jint dwitemcount, jlong lpitemdata, jlong lplpnewheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoBlockAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpheader, (uint32_t)dwinfotype, (uint32_t)dwitemsize, (uint32_t)dwitemcount, (void*)(uintptr_t)lpitemdata, (void*)(uintptr_t)lplpnewheader) : 0;
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)dwitemsize;
    (void)dwitemcount;
    (void)lpitemdata;
    (void)lplpnewheader;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprInfoBlockFind(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jint dwinfotype, jlong lpdwitemsize, jlong lpdwitemcount, jlong lplpitemdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoBlockFind");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpheader, (uint32_t)dwinfotype, (void*)(uintptr_t)lpdwitemsize, (void*)(uintptr_t)lpdwitemcount, (void*)(uintptr_t)lplpitemdata) : 0;
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)lpdwitemsize;
    (void)lpdwitemcount;
    (void)lplpitemdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprInfoBlockQuerySize(JNIEnv* km_env, jclass km_clazz, jlong lpheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoBlockQuerySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpheader) : 0;
#else
    (void)lpheader;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprInfoBlockRemove(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jint dwinfotype, jlong lplpnewheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoBlockRemove");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpheader, (uint32_t)dwinfotype, (void*)(uintptr_t)lplpnewheader) : 0;
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)lplpnewheader;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprInfoBlockSet(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jint dwinfotype, jint dwitemsize, jint dwitemcount, jlong lpitemdata, jlong lplpnewheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoBlockSet");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpheader, (uint32_t)dwinfotype, (uint32_t)dwitemsize, (uint32_t)dwitemcount, (void*)(uintptr_t)lpitemdata, (void*)(uintptr_t)lplpnewheader) : 0;
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)dwitemsize;
    (void)dwitemcount;
    (void)lpitemdata;
    (void)lplpnewheader;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprInfoCreate(JNIEnv* km_env, jclass km_clazz, jint dwversion, jlong lplpnewheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoCreate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwversion, (void*)(uintptr_t)lplpnewheader) : 0;
#else
    (void)dwversion;
    (void)lplpnewheader;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprInfoDelete(JNIEnv* km_env, jclass km_clazz, jlong lpheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoDelete");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpheader) : 0;
#else
    (void)lpheader;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprInfoDuplicate(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jlong lplpnewheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoDuplicate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpheader, (void*)(uintptr_t)lplpnewheader) : 0;
#else
    (void)lpheader;
    (void)lplpnewheader;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1MprInfoRemoveAll(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jlong lplpnewheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoRemoveAll");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpheader, (void*)(uintptr_t)lplpnewheader) : 0;
#else
    (void)lpheader;
    (void)lplpnewheader;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasClearConnectionStatistics(JNIEnv* km_env, jclass km_clazz, jlong hrasconn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasClearConnectionStatistics");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrasconn) : 0;
#else
    (void)hrasconn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasClearLinkStatistics(JNIEnv* km_env, jclass km_clazz, jlong hrasconn, jint dwsubentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasClearLinkStatistics");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrasconn, (uint32_t)dwsubentry) : 0;
#else
    (void)hrasconn;
    (void)dwsubentry;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasConnectionNotificationA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasConnectionNotificationA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasConnectionNotificationW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasConnectionNotificationW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasCreatePhonebookEntryA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasCreatePhonebookEntryA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasCreatePhonebookEntryW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasCreatePhonebookEntryW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasDeleteEntryA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDeleteEntryA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasDeleteEntryW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDeleteEntryW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasDeleteSubEntryA(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jint dwsubentryid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDeleteSubEntryA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (uint32_t)dwsubentryid) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwsubentryid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasDeleteSubEntryW(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jint dwsubentryid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDeleteSubEntryW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (uint32_t)dwsubentryid) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwsubentryid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasDialA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDialA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (void*)(uintptr_t)param4, (void*)(uintptr_t)param5) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasDialDlgA(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpszphonenumber, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDialDlgA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszphonebook, (void*)(uintptr_t)lpszentry, (void*)(uintptr_t)lpszphonenumber, (void*)(uintptr_t)lpinfo) : -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpszphonenumber;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasDialDlgW(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpszphonenumber, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDialDlgW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszphonebook, (void*)(uintptr_t)lpszentry, (void*)(uintptr_t)lpszphonenumber, (void*)(uintptr_t)lpinfo) : -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpszphonenumber;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasDialW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDialW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (void*)(uintptr_t)param4, (void*)(uintptr_t)param5) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasEditPhonebookEntryA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEditPhonebookEntryA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasEditPhonebookEntryW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEditPhonebookEntryW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasEntryDlgA(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEntryDlgA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszphonebook, (void*)(uintptr_t)lpszentry, (void*)(uintptr_t)lpinfo) : -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasEntryDlgW(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEntryDlgW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszphonebook, (void*)(uintptr_t)lpszentry, (void*)(uintptr_t)lpinfo) : -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasEnumAutodialAddressesA(JNIEnv* km_env, jclass km_clazz, jlong lpprasautodialaddresses, jlong lpdwcbrasautodialaddresses, jlong lpdwcrasautodialaddresses) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumAutodialAddressesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpprasautodialaddresses, (void*)(uintptr_t)lpdwcbrasautodialaddresses, (void*)(uintptr_t)lpdwcrasautodialaddresses) : 0;
#else
    (void)lpprasautodialaddresses;
    (void)lpdwcbrasautodialaddresses;
    (void)lpdwcrasautodialaddresses;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasEnumAutodialAddressesW(JNIEnv* km_env, jclass km_clazz, jlong lpprasautodialaddresses, jlong lpdwcbrasautodialaddresses, jlong lpdwcrasautodialaddresses) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumAutodialAddressesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpprasautodialaddresses, (void*)(uintptr_t)lpdwcbrasautodialaddresses, (void*)(uintptr_t)lpdwcrasautodialaddresses) : 0;
#else
    (void)lpprasautodialaddresses;
    (void)lpdwcbrasautodialaddresses;
    (void)lpdwcrasautodialaddresses;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasEnumConnectionsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumConnectionsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasEnumConnectionsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumConnectionsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasEnumDevicesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumDevicesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasEnumDevicesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumDevicesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasEnumEntriesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumEntriesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasEnumEntriesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumEntriesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasFreeEapUserIdentityA(JNIEnv* km_env, jclass km_clazz, jlong praseapuseridentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasFreeEapUserIdentityA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)praseapuseridentity);
#else
    (void)praseapuseridentity;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasFreeEapUserIdentityW(JNIEnv* km_env, jclass km_clazz, jlong praseapuseridentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasFreeEapUserIdentityW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)praseapuseridentity);
#else
    (void)praseapuseridentity;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetAutodialAddressA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialAddressA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetAutodialAddressW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialAddressW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetAutodialEnableA(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialEnableA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetAutodialEnableW(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialEnableW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetAutodialParamA(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialParamA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetAutodialParamW(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialParamW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetConnectStatusA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetConnectStatusA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetConnectStatusW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetConnectStatusW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetConnectionStatistics(JNIEnv* km_env, jclass km_clazz, jlong hrasconn, jlong lpstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetConnectionStatistics");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrasconn, (void*)(uintptr_t)lpstatistics) : 0;
#else
    (void)hrasconn;
    (void)lpstatistics;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetCountryInfoA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCountryInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetCountryInfoW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCountryInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCredentialsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCredentialsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetCustomAuthDataA(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jlong pbcustomauthdata, jlong pdwsizeofcustomauthdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCustomAuthDataA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbcustomauthdata, (void*)(uintptr_t)pdwsizeofcustomauthdata) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)pdwsizeofcustomauthdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetCustomAuthDataW(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jlong pbcustomauthdata, jlong pdwsizeofcustomauthdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCustomAuthDataW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbcustomauthdata, (void*)(uintptr_t)pdwsizeofcustomauthdata) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)pdwsizeofcustomauthdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetEapUserDataA(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong pszphonebook, jlong pszentry, jlong pbeapdata, jlong pdwsizeofeapdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEapUserDataA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbeapdata, (void*)(uintptr_t)pdwsizeofeapdata) : 0;
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)pdwsizeofeapdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetEapUserDataW(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong pszphonebook, jlong pszentry, jlong pbeapdata, jlong pdwsizeofeapdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEapUserDataW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbeapdata, (void*)(uintptr_t)pdwsizeofeapdata) : 0;
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)pdwsizeofeapdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetEapUserIdentityA(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jint dwflags, jlong hwnd, jlong ppraseapuseridentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEapUserIdentityA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (uint32_t)dwflags, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)ppraseapuseridentity) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwflags;
    (void)hwnd;
    (void)ppraseapuseridentity;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetEapUserIdentityW(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jint dwflags, jlong hwnd, jlong ppraseapuseridentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEapUserIdentityW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (uint32_t)dwflags, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)ppraseapuseridentity) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwflags;
    (void)hwnd;
    (void)ppraseapuseridentity;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetEntryDialParamsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEntryDialParamsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetEntryDialParamsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEntryDialParamsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetEntryPropertiesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEntryPropertiesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4, (void*)(uintptr_t)param5) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetEntryPropertiesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEntryPropertiesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4, (void*)(uintptr_t)param5) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetErrorStringA(JNIEnv* km_env, jclass km_clazz, jint resourceid, jlong lpszstring, jint inbufsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetErrorStringA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)resourceid, (void*)(uintptr_t)lpszstring, (uint32_t)inbufsize) : 0;
#else
    (void)resourceid;
    (void)lpszstring;
    (void)inbufsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetErrorStringW(JNIEnv* km_env, jclass km_clazz, jint resourceid, jlong lpszstring, jint inbufsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetErrorStringW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)resourceid, (void*)(uintptr_t)lpszstring, (uint32_t)inbufsize) : 0;
#else
    (void)resourceid;
    (void)lpszstring;
    (void)inbufsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetLinkStatistics(JNIEnv* km_env, jclass km_clazz, jlong hrasconn, jint dwsubentry, jlong lpstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetLinkStatistics");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrasconn, (uint32_t)dwsubentry, (void*)(uintptr_t)lpstatistics) : 0;
#else
    (void)hrasconn;
    (void)dwsubentry;
    (void)lpstatistics;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetPCscf(JNIEnv* km_env, jclass km_clazz, jlong lpszpcscf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetPCscf");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszpcscf) : 0;
#else
    (void)lpszpcscf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetProjectionInfoA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetProjectionInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetProjectionInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hrasconn, jlong prasprojection, jlong lpdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetProjectionInfoEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrasconn, (void*)(uintptr_t)prasprojection, (void*)(uintptr_t)lpdwsize) : 0;
#else
    (void)hrasconn;
    (void)prasprojection;
    (void)lpdwsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetProjectionInfoW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetProjectionInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetSubEntryHandleA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetSubEntryHandleA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetSubEntryHandleW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetSubEntryHandleW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetSubEntryPropertiesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetSubEntryPropertiesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4, (void*)(uintptr_t)param5, (void*)(uintptr_t)param6) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasGetSubEntryPropertiesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetSubEntryPropertiesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4, (void*)(uintptr_t)param5, (void*)(uintptr_t)param6) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasHangUpA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasHangUpA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : 0;
#else
    (void)param0;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasHangUpW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasHangUpW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : 0;
#else
    (void)param0;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasInvokeEapUI(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasInvokeEapUI");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasPhonebookDlgA(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasPhonebookDlgA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszphonebook, (void*)(uintptr_t)lpszentry, (void*)(uintptr_t)lpinfo) : -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasPhonebookDlgW(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasPhonebookDlgW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszphonebook, (void*)(uintptr_t)lpszentry, (void*)(uintptr_t)lpinfo) : -1;
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasRenameEntryA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasRenameEntryA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasRenameEntryW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasRenameEntryW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetAutodialAddressA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialAddressA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (uint32_t)param4) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetAutodialAddressW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialAddressW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (uint32_t)param4) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetAutodialEnableA(JNIEnv* km_env, jclass km_clazz, jint param0, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialEnableA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)param0, (int32_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetAutodialEnableW(JNIEnv* km_env, jclass km_clazz, jint param0, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialEnableW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)param0, (int32_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetAutodialParamA(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialParamA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetAutodialParamW(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialParamW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetCredentialsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (int32_t)param3) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetCredentialsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (int32_t)param3) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetCustomAuthDataA(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jlong pbcustomauthdata, jint dwsizeofcustomauthdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetCustomAuthDataA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbcustomauthdata, (uint32_t)dwsizeofcustomauthdata) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)dwsizeofcustomauthdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetCustomAuthDataW(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jlong pbcustomauthdata, jint dwsizeofcustomauthdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetCustomAuthDataW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbcustomauthdata, (uint32_t)dwsizeofcustomauthdata) : 0;
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)dwsizeofcustomauthdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetEapUserDataA(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong pszphonebook, jlong pszentry, jlong pbeapdata, jint dwsizeofeapdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEapUserDataA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbeapdata, (uint32_t)dwsizeofeapdata) : 0;
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)dwsizeofeapdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetEapUserDataW(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong pszphonebook, jlong pszentry, jlong pbeapdata, jint dwsizeofeapdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEapUserDataW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbeapdata, (uint32_t)dwsizeofeapdata) : 0;
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)dwsizeofeapdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetEntryDialParamsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEntryDialParamsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (int32_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetEntryDialParamsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEntryDialParamsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (int32_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetEntryPropertiesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jint param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEntryPropertiesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (void*)(uintptr_t)param4, (uint32_t)param5) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetEntryPropertiesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jint param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEntryPropertiesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (void*)(uintptr_t)param4, (uint32_t)param5) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetSubEntryPropertiesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jint param6) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetSubEntryPropertiesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3, (uint32_t)param4, (void*)(uintptr_t)param5, (uint32_t)param6) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasSetSubEntryPropertiesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jint param6) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetSubEntryPropertiesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3, (uint32_t)param4, (void*)(uintptr_t)param5, (uint32_t)param6) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasUpdateConnection(JNIEnv* km_env, jclass km_clazz, jlong hrasconn, jlong lprasupdateconn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasUpdateConnection");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrasconn, (void*)(uintptr_t)lprasupdateconn) : 0;
#else
    (void)hrasconn;
    (void)lprasupdateconn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasValidateEntryNameA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasValidateEntryNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RasValidateEntryNameW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasValidateEntryNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : 0;
#else
    (void)param0;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmAddNextHop(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthopinfo, jlong nexthophandle, jlong changeflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmAddNextHop");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)nexthopinfo, (void*)(uintptr_t)nexthophandle, (void*)(uintptr_t)changeflags) : 0;
#else
    (void)rtmreghandle;
    (void)nexthopinfo;
    (void)nexthophandle;
    (void)changeflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmAddRouteToDest(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jlong destaddress, jlong routeinfo, jint timetolive, jlong routelisthandle, jint notifytype, jlong notifyhandle, jlong changeflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, int64_t, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmAddRouteToDest");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)routehandle, (void*)(uintptr_t)destaddress, (void*)(uintptr_t)routeinfo, (uint32_t)timetolive, (int64_t)routelisthandle, (uint32_t)notifytype, (int64_t)notifyhandle, (void*)(uintptr_t)changeflags) : 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)destaddress;
    (void)routeinfo;
    (void)timetolive;
    (void)routelisthandle;
    (void)notifytype;
    (void)notifyhandle;
    (void)changeflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmBlockMethods(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong targethandle, jbyte targettype, jint blockingflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint8_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmBlockMethods");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)targethandle, (uint8_t)targettype, (uint32_t)blockingflag) : 0;
#else
    (void)rtmreghandle;
    (void)targethandle;
    (void)targettype;
    (void)blockingflag;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmConvertNetAddressToIpv6AddressAndLength(JNIEnv* km_env, jclass km_clazz, jlong pnetaddress, jlong paddress, jlong plength, jint dwaddresssize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmConvertNetAddressToIpv6AddressAndLength");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pnetaddress, (void*)(uintptr_t)paddress, (void*)(uintptr_t)plength, (uint32_t)dwaddresssize) : 0;
#else
    (void)pnetaddress;
    (void)paddress;
    (void)plength;
    (void)dwaddresssize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmCreateDestEnum(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint targetviews, jint enumflags, jlong netaddress, jint protocolid, jlong rtmenumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmCreateDestEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (uint32_t)targetviews, (uint32_t)enumflags, (void*)(uintptr_t)netaddress, (uint32_t)protocolid, (void*)(uintptr_t)rtmenumhandle) : 0;
#else
    (void)rtmreghandle;
    (void)targetviews;
    (void)enumflags;
    (void)netaddress;
    (void)protocolid;
    (void)rtmenumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmCreateNextHopEnum(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint enumflags, jlong netaddress, jlong rtmenumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmCreateNextHopEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (uint32_t)enumflags, (void*)(uintptr_t)netaddress, (void*)(uintptr_t)rtmenumhandle) : 0;
#else
    (void)rtmreghandle;
    (void)enumflags;
    (void)netaddress;
    (void)rtmenumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmCreateRouteEnum(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jint targetviews, jint enumflags, jlong startdest, jint matchingflags, jlong criteriaroute, jint criteriainterface, jlong rtmenumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmCreateRouteEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)desthandle, (uint32_t)targetviews, (uint32_t)enumflags, (void*)(uintptr_t)startdest, (uint32_t)matchingflags, (void*)(uintptr_t)criteriaroute, (uint32_t)criteriainterface, (void*)(uintptr_t)rtmenumhandle) : 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)targetviews;
    (void)enumflags;
    (void)startdest;
    (void)matchingflags;
    (void)criteriaroute;
    (void)criteriainterface;
    (void)rtmenumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmCreateRouteList(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routelisthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmCreateRouteList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)routelisthandle) : 0;
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmCreateRouteListEnum(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routelisthandle, jlong rtmenumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmCreateRouteListEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)routelisthandle, (void*)(uintptr_t)rtmenumhandle) : 0;
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    (void)rtmenumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmDeleteEnumHandle(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeleteEnumHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)enumhandle) : 0;
#else
    (void)rtmreghandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmDeleteNextHop(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthophandle, jlong nexthopinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeleteNextHop");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)nexthophandle, (void*)(uintptr_t)nexthopinfo) : 0;
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)nexthopinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmDeleteRouteList(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routelisthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeleteRouteList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)routelisthandle) : 0;
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmDeleteRouteToDest(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jlong changeflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeleteRouteToDest");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)routehandle, (void*)(uintptr_t)changeflags) : 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)changeflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmDeregisterEntity(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeregisterEntity");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle) : 0;
#else
    (void)rtmreghandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmDeregisterFromChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeregisterFromChangeNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)notifyhandle) : 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmFindNextHop(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthopinfo, jlong nexthophandle, jlong nexthoppointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmFindNextHop");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)nexthopinfo, (void*)(uintptr_t)nexthophandle, (void*)(uintptr_t)nexthoppointer) : 0;
#else
    (void)rtmreghandle;
    (void)nexthopinfo;
    (void)nexthophandle;
    (void)nexthoppointer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetChangeStatus(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jlong desthandle, jlong changestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetChangeStatus");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)notifyhandle, (int64_t)desthandle, (void*)(uintptr_t)changestatus) : 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)desthandle;
    (void)changestatus;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetChangedDests(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jlong numdests, jlong changeddests) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetChangedDests");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)notifyhandle, (void*)(uintptr_t)numdests, (void*)(uintptr_t)changeddests) : 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)numdests;
    (void)changeddests;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetDestInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jint protocolid, jint targetviews, jlong destinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetDestInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)desthandle, (uint32_t)protocolid, (uint32_t)targetviews, (void*)(uintptr_t)destinfo) : 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetEntityInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong entityhandle, jlong entityinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetEntityInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)entityhandle, (void*)(uintptr_t)entityinfo) : 0;
#else
    (void)rtmreghandle;
    (void)entityhandle;
    (void)entityinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetEntityMethods(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong entityhandle, jlong nummethods, jlong exptmethods) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetEntityMethods");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)entityhandle, (void*)(uintptr_t)nummethods, (void*)(uintptr_t)exptmethods) : 0;
#else
    (void)rtmreghandle;
    (void)entityhandle;
    (void)nummethods;
    (void)exptmethods;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetEnumDests(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong enumhandle, jlong numdests, jlong destinfos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetEnumDests");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)enumhandle, (void*)(uintptr_t)numdests, (void*)(uintptr_t)destinfos) : 0;
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numdests;
    (void)destinfos;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetEnumNextHops(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong enumhandle, jlong numnexthops, jlong nexthophandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetEnumNextHops");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)enumhandle, (void*)(uintptr_t)numnexthops, (void*)(uintptr_t)nexthophandles) : 0;
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numnexthops;
    (void)nexthophandles;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetEnumRoutes(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong enumhandle, jlong numroutes, jlong routehandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetEnumRoutes");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)enumhandle, (void*)(uintptr_t)numroutes, (void*)(uintptr_t)routehandles) : 0;
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numroutes;
    (void)routehandles;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetExactMatchDestination(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong destaddress, jint protocolid, jint targetviews, jlong destinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetExactMatchDestination");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)destaddress, (uint32_t)protocolid, (uint32_t)targetviews, (void*)(uintptr_t)destinfo) : 0;
#else
    (void)rtmreghandle;
    (void)destaddress;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetExactMatchRoute(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong destaddress, jint matchingflags, jlong routeinfo, jint interfaceindex, jint targetviews, jlong routehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetExactMatchRoute");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)destaddress, (uint32_t)matchingflags, (void*)(uintptr_t)routeinfo, (uint32_t)interfaceindex, (uint32_t)targetviews, (void*)(uintptr_t)routehandle) : 0;
#else
    (void)rtmreghandle;
    (void)destaddress;
    (void)matchingflags;
    (void)routeinfo;
    (void)interfaceindex;
    (void)targetviews;
    (void)routehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetLessSpecificDestination(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jint protocolid, jint targetviews, jlong destinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetLessSpecificDestination");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)desthandle, (uint32_t)protocolid, (uint32_t)targetviews, (void*)(uintptr_t)destinfo) : 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetListEnumRoutes(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong enumhandle, jlong numroutes, jlong routehandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetListEnumRoutes");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)enumhandle, (void*)(uintptr_t)numroutes, (void*)(uintptr_t)routehandles) : 0;
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numroutes;
    (void)routehandles;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetMostSpecificDestination(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong destaddress, jint protocolid, jint targetviews, jlong destinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetMostSpecificDestination");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)destaddress, (uint32_t)protocolid, (uint32_t)targetviews, (void*)(uintptr_t)destinfo) : 0;
#else
    (void)rtmreghandle;
    (void)destaddress;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetNextHopInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthophandle, jlong nexthopinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetNextHopInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)nexthophandle, (void*)(uintptr_t)nexthopinfo) : 0;
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)nexthopinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetNextHopPointer(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthophandle, jlong nexthoppointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetNextHopPointer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)nexthophandle, (void*)(uintptr_t)nexthoppointer) : 0;
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)nexthoppointer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetOpaqueInformationPointer(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jlong opaqueinfopointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetOpaqueInformationPointer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)desthandle, (void*)(uintptr_t)opaqueinfopointer) : 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)opaqueinfopointer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetRegisteredEntities(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong numentities, jlong entityhandles, jlong entityinfos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetRegisteredEntities");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)numentities, (void*)(uintptr_t)entityhandles, (void*)(uintptr_t)entityinfos) : 0;
#else
    (void)rtmreghandle;
    (void)numentities;
    (void)entityhandles;
    (void)entityinfos;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetRouteInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jlong routeinfo, jlong destaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetRouteInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)routehandle, (void*)(uintptr_t)routeinfo, (void*)(uintptr_t)destaddress) : 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)routeinfo;
    (void)destaddress;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmGetRoutePointer(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jlong routepointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetRoutePointer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)routehandle, (void*)(uintptr_t)routepointer) : 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)routepointer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmHoldDestination(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jint targetviews, jint holdtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmHoldDestination");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)desthandle, (uint32_t)targetviews, (uint32_t)holdtime) : 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)targetviews;
    (void)holdtime;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmIgnoreChangedDests(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jint numdests, jlong changeddests) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmIgnoreChangedDests");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)notifyhandle, (uint32_t)numdests, (void*)(uintptr_t)changeddests) : 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)numdests;
    (void)changeddests;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmInsertInRouteList(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routelisthandle, jint numroutes, jlong routehandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmInsertInRouteList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)routelisthandle, (uint32_t)numroutes, (void*)(uintptr_t)routehandles) : 0;
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    (void)numroutes;
    (void)routehandles;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmInvokeMethod(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong entityhandle, jlong input, jlong outputsize, jlong output) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmInvokeMethod");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)entityhandle, (void*)(uintptr_t)input, (void*)(uintptr_t)outputsize, (void*)(uintptr_t)output) : 0;
#else
    (void)rtmreghandle;
    (void)entityhandle;
    (void)input;
    (void)outputsize;
    (void)output;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmIsBestRoute(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jlong bestinviews) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmIsBestRoute");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)routehandle, (void*)(uintptr_t)bestinviews) : 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)bestinviews;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmIsMarkedForChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jlong desthandle, jlong destmarked) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmIsMarkedForChangeNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)notifyhandle, (int64_t)desthandle, (void*)(uintptr_t)destmarked) : 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)desthandle;
    (void)destmarked;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmLockDestination(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jint exclusive, jint lockdest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmLockDestination");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)desthandle, (int32_t)exclusive, (int32_t)lockdest) : 0;
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)exclusive;
    (void)lockdest;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmLockNextHop(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthophandle, jint exclusive, jint locknexthop, jlong nexthoppointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmLockNextHop");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)nexthophandle, (int32_t)exclusive, (int32_t)locknexthop, (void*)(uintptr_t)nexthoppointer) : 0;
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)exclusive;
    (void)locknexthop;
    (void)nexthoppointer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmLockRoute(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jint exclusive, jint lockroute, jlong routepointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmLockRoute");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)routehandle, (int32_t)exclusive, (int32_t)lockroute, (void*)(uintptr_t)routepointer) : 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)exclusive;
    (void)lockroute;
    (void)routepointer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmMarkDestForChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jlong desthandle, jint markdest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmMarkDestForChangeNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)notifyhandle, (int64_t)desthandle, (int32_t)markdest) : 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)desthandle;
    (void)markdest;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmReferenceHandles(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint numhandles, jlong rtmhandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReferenceHandles");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (uint32_t)numhandles, (void*)(uintptr_t)rtmhandles) : 0;
#else
    (void)rtmreghandle;
    (void)numhandles;
    (void)rtmhandles;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmRegisterEntity(JNIEnv* km_env, jclass km_clazz, jlong rtmentityinfo, jlong exportmethods, jlong eventcallback, jint reserveopaquepointer, jlong rtmregprofile, jlong rtmreghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmRegisterEntity");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rtmentityinfo, (void*)(uintptr_t)exportmethods, (void*)(uintptr_t)eventcallback, (int32_t)reserveopaquepointer, (void*)(uintptr_t)rtmregprofile, (void*)(uintptr_t)rtmreghandle) : 0;
#else
    (void)rtmentityinfo;
    (void)exportmethods;
    (void)eventcallback;
    (void)reserveopaquepointer;
    (void)rtmregprofile;
    (void)rtmreghandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmRegisterForChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint targetviews, jint notifyflags, jlong notifycontext, jlong notifyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmRegisterForChangeNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (uint32_t)targetviews, (uint32_t)notifyflags, (void*)(uintptr_t)notifycontext, (void*)(uintptr_t)notifyhandle) : 0;
#else
    (void)rtmreghandle;
    (void)targetviews;
    (void)notifyflags;
    (void)notifycontext;
    (void)notifyhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmReleaseChangedDests(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jint numdests, jlong changeddests) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseChangedDests");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)notifyhandle, (uint32_t)numdests, (void*)(uintptr_t)changeddests) : 0;
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)numdests;
    (void)changeddests;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmReleaseDestInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong destinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseDestInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)destinfo) : 0;
#else
    (void)rtmreghandle;
    (void)destinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmReleaseDests(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint numdests, jlong destinfos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseDests");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (uint32_t)numdests, (void*)(uintptr_t)destinfos) : 0;
#else
    (void)rtmreghandle;
    (void)numdests;
    (void)destinfos;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmReleaseEntities(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint numentities, jlong entityhandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseEntities");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (uint32_t)numentities, (void*)(uintptr_t)entityhandles) : 0;
#else
    (void)rtmreghandle;
    (void)numentities;
    (void)entityhandles;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmReleaseEntityInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong entityinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseEntityInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)entityinfo) : 0;
#else
    (void)rtmreghandle;
    (void)entityinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmReleaseNextHopInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthopinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseNextHopInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)nexthopinfo) : 0;
#else
    (void)rtmreghandle;
    (void)nexthopinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmReleaseNextHops(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint numnexthops, jlong nexthophandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseNextHops");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (uint32_t)numnexthops, (void*)(uintptr_t)nexthophandles) : 0;
#else
    (void)rtmreghandle;
    (void)numnexthops;
    (void)nexthophandles;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmReleaseRouteInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routeinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseRouteInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)routeinfo) : 0;
#else
    (void)rtmreghandle;
    (void)routeinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmReleaseRoutes(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint numroutes, jlong routehandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseRoutes");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (uint32_t)numroutes, (void*)(uintptr_t)routehandles) : 0;
#else
    (void)rtmreghandle;
    (void)numroutes;
    (void)routehandles;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1RtmUpdateAndUnlockRoute(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jint timetolive, jlong routelisthandle, jint notifytype, jlong notifyhandle, jlong changeflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, int64_t, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmUpdateAndUnlockRoute");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)rtmreghandle, (int64_t)routehandle, (uint32_t)timetolive, (int64_t)routelisthandle, (uint32_t)notifytype, (int64_t)notifyhandle, (void*)(uintptr_t)changeflags) : 0;
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)timetolive;
    (void)routelisthandle;
    (void)notifytype;
    (void)notifyhandle;
    (void)changeflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

