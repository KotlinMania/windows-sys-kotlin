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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmAddGroupMembershipEntry(JNIEnv* km_env, jclass km_clazz, jlong hprotocol, jint dwsourceaddr, jint dwsourcemask, jint dwgroupaddr, jint dwgroupmask, jint dwifindex, jint dwifnexthopipaddr, jint dwflags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmDeRegisterMProtocol(JNIEnv* km_env, jclass km_clazz, jlong hprotocol) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmDeleteGroupMembershipEntry(JNIEnv* km_env, jclass km_clazz, jlong hprotocol, jint dwsourceaddr, jint dwsourcemask, jint dwgroupaddr, jint dwgroupmask, jint dwifindex, jint dwifnexthopipaddr, jint dwflags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmGetFirstMfe(JNIEnv* km_env, jclass km_clazz, jlong pdwbuffersize, jlong pbbuffer, jlong pdwnumentries) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmGetFirstMfeStats(JNIEnv* km_env, jclass km_clazz, jlong pdwbuffersize, jlong pbbuffer, jlong pdwnumentries, jint dwflags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmGetMfe(JNIEnv* km_env, jclass km_clazz, jlong pimm, jlong pdwbuffersize, jlong pbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmGetMfeStats(JNIEnv* km_env, jclass km_clazz, jlong pimm, jlong pdwbuffersize, jlong pbbuffer, jint dwflags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmGetNextMfe(JNIEnv* km_env, jclass km_clazz, jlong pimmstart, jlong pdwbuffersize, jlong pbbuffer, jlong pdwnumentries) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmGetNextMfeStats(JNIEnv* km_env, jclass km_clazz, jlong pimmstart, jlong pdwbuffersize, jlong pbbuffer, jlong pdwnumentries, jint dwflags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmGetProtocolOnInterface(JNIEnv* km_env, jclass km_clazz, jint dwifindex, jint dwifnexthopaddr, jlong pdwifprotocolid, jlong pdwifcomponentid) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmGroupEnumerationEnd(JNIEnv* km_env, jclass km_clazz, jlong henum) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmGroupEnumerationGetNext(JNIEnv* km_env, jclass km_clazz, jlong henum, jlong pdwbuffersize, jlong pbbuffer, jlong pdwnumentries) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmGroupEnumerationStart(JNIEnv* km_env, jclass km_clazz, jlong hprotocol, jint metenumtype, jlong phenumhandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmRegisterMProtocol(JNIEnv* km_env, jclass km_clazz, jlong prpiinfo, jint dwprotocolid, jint dwcomponentid, jlong phprotocol) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmReleaseInterfaceOwnership(JNIEnv* km_env, jclass km_clazz, jlong hprotocol, jint dwifindex, jint dwifnexthopaddr) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mgmTakeInterfaceOwnership(JNIEnv* km_env, jclass km_clazz, jlong hprotocol, jint dwifindex, jint dwifnexthopaddr) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminBufferFree(JNIEnv* km_env, jclass km_clazz, jlong pbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminConnectionClearStats(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hrasconnection) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminConnectionEnum(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jint dwlevel, jlong lplpbbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminConnectionEnumEx(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong pobjectheader, jint dwpreferedmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong pprasconn, jlong lpdwresumehandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminConnectionGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jint dwlevel, jlong hrasconnection, jlong lplpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminConnectionGetInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hrasconnection, jlong prasconnection) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminConnectionRemoveQuarantine(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hrasconnection, jint fisipaddress) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminDeregisterConnectionNotification(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong heventnotification) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminDeviceEnum(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lplpbbuffer, jlong lpdwtotalentries) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminEstablishDomainRasServer(JNIEnv* km_env, jclass km_clazz, jlong pszdomain, jlong pszmachine, jint benable) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminGetErrorString(JNIEnv* km_env, jclass km_clazz, jint dwerror, jlong lplpwserrorstring) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminGetPDCServer(JNIEnv* km_env, jclass km_clazz, jlong lpszdomain, jlong lpszserver, jlong lpszpdcserver) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceConnect(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jlong hevent, jint fsynchronous) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceCreate(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lpbbuffer, jlong phinterface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceDelete(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceDeviceGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwindex, jint dwlevel, jlong lplpbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceDeviceSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwindex, jint dwlevel, jlong lpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceEnum(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lplpbbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceGetCredentials(JNIEnv* km_env, jclass km_clazz, jlong lpwsserver, jlong lpwsinterfacename, jlong lpwsusername, jlong lpwspassword, jlong lpwsdomainname) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceGetCredentialsEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwlevel, jlong lplpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceGetCustomInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jlong pcustominfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceGetHandle(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong lpwsinterfacename, jlong phinterface, jint fincludeclientinterfaces) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwlevel, jlong lplpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceQueryUpdateResult(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwprotocolid, jlong lpdwupdateresult) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceSetCredentials(JNIEnv* km_env, jclass km_clazz, jlong lpwsserver, jlong lpwsinterfacename, jlong lpwsusername, jlong lpwsdomainname, jlong lpwspassword) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceSetCredentialsEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwlevel, jlong lpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceSetCustomInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jlong pcustominfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwlevel, jlong lpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceTransportAdd(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwtransportid, jlong pinterfaceinfo, jint dwinterfaceinfosize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceTransportGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwtransportid, jlong ppinterfaceinfo, jlong lpdwinterfaceinfosize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceTransportRemove(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwtransportid) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceTransportSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwtransportid, jlong pinterfaceinfo, jint dwinterfaceinfosize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceUpdatePhonebookInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminInterfaceUpdateRoutes(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwprotocolid, jlong hevent) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminIsDomainRasServer(JNIEnv* km_env, jclass km_clazz, jlong pszdomain, jlong pszmachine, jlong pbisrasserver) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminIsServiceInitialized(JNIEnv* km_env, jclass km_clazz, jlong lpwsservername, jlong fisserviceinitialized) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminIsServiceRunning(JNIEnv* km_env, jclass km_clazz, jlong lpwsservername) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminMIBBufferFree(JNIEnv* km_env, jclass km_clazz, jlong pbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminMIBEntryCreate(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwpid, jint dwroutingpid, jlong lpentry, jint dwentrysize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminMIBEntryDelete(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwprotocolid, jint dwroutingpid, jlong lpentry, jint dwentrysize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminMIBEntryGet(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwprotocolid, jint dwroutingpid, jlong lpinentry, jint dwinentrysize, jlong lplpoutentry, jlong lpoutentrysize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminMIBEntryGetFirst(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwprotocolid, jint dwroutingpid, jlong lpinentry, jint dwinentrysize, jlong lplpoutentry, jlong lpoutentrysize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminMIBEntryGetNext(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwprotocolid, jint dwroutingpid, jlong lpinentry, jint dwinentrysize, jlong lplpoutentry, jlong lpoutentrysize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminMIBEntrySet(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwprotocolid, jint dwroutingpid, jlong lpentry, jint dwentrysize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminMIBServerConnect(JNIEnv* km_env, jclass km_clazz, jlong lpwsservername, jlong phmibserver) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminMIBServerDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hmibserver) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminPortClearStats(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hport) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminPortDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hport) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminPortEnum(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jint dwlevel, jlong hrasconnection, jlong lplpbbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminPortGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jint dwlevel, jlong hport, jlong lplpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminPortReset(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hport) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminRegisterConnectionNotification(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong heventnotification) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminSendUserMessage(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hconnection, jlong lpwszmessage) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminServerConnect(JNIEnv* km_env, jclass km_clazz, jlong lpwsservername, jlong phmprserver) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminServerDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hmprserver) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminServerGetCredentials(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lplpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminServerGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lplpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminServerGetInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong pserverinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminServerSetCredentials(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminServerSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminServerSetInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong pserverinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminTransportCreate(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwtransportid, jlong lpwstransportname, jlong pglobalinfo, jint dwglobalinfosize, jlong pclientinterfaceinfo, jint dwclientinterfaceinfosize, jlong lpwsdllpath) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminTransportGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwtransportid, jlong ppglobalinfo, jlong lpdwglobalinfosize, jlong ppclientinterfaceinfo, jlong lpdwclientinterfaceinfosize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminTransportSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwtransportid, jlong pglobalinfo, jint dwglobalinfosize, jlong pclientinterfaceinfo, jint dwclientinterfaceinfosize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminUpdateConnection(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hrasconnection, jlong prasupdateconnection) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminUserGetInfo(JNIEnv* km_env, jclass km_clazz, jlong lpszserver, jlong lpszuser, jint dwlevel, jlong lpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprAdminUserSetInfo(JNIEnv* km_env, jclass km_clazz, jlong lpszserver, jlong lpszuser, jint dwlevel, jlong lpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigBufferFree(JNIEnv* km_env, jclass km_clazz, jlong pbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigFilterGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jint dwtransportid, jlong lpbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigFilterSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jint dwtransportid, jlong lpbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigGetFriendlyName(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong pszguidname, jlong pszbuffer, jint dwbuffersize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigGetGuidName(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong pszfriendlyname, jlong pszbuffer, jint dwbuffersize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigInterfaceCreate(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jlong lpbbuffer, jlong phrouterinterface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigInterfaceDelete(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigInterfaceEnum(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jlong lplpbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigInterfaceGetCustomInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jlong pcustominfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigInterfaceGetHandle(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong lpwsinterfacename, jlong phrouterinterface) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigInterfaceGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jint dwlevel, jlong lplpbuffer, jlong lpdwbuffersize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigInterfaceSetCustomInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jlong pcustominfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigInterfaceSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jint dwlevel, jlong lpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigInterfaceTransportAdd(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jint dwtransportid, jlong lpwstransportname, jlong pinterfaceinfo, jint dwinterfaceinfosize, jlong phrouteriftransport) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigInterfaceTransportEnum(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jint dwlevel, jlong lplpbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigInterfaceTransportGetHandle(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jint dwtransportid, jlong phrouteriftransport) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigInterfaceTransportGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jlong hrouteriftransport, jlong ppinterfaceinfo, jlong lpdwinterfaceinfosize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigInterfaceTransportRemove(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jlong hrouteriftransport) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigInterfaceTransportSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jlong hrouteriftransport, jlong pinterfaceinfo, jint dwinterfaceinfosize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigServerBackup(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong lpwspath) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigServerConnect(JNIEnv* km_env, jclass km_clazz, jlong lpwsservername, jlong phmprconfig) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigServerDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigServerGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jlong lplpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigServerGetInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong pserverinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigServerInstall(JNIEnv* km_env, jclass km_clazz, jint dwlevel, jlong pbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigServerRefresh(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigServerRestore(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong lpwspath) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigServerSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lpbbuffer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigServerSetInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong psetserverconfig) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigTransportCreate(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwtransportid, jlong lpwstransportname, jlong pglobalinfo, jint dwglobalinfosize, jlong pclientinterfaceinfo, jint dwclientinterfaceinfosize, jlong lpwsdllpath, jlong phroutertransport) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigTransportDelete(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hroutertransport) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigTransportEnum(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jlong lplpbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigTransportGetHandle(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwtransportid, jlong phroutertransport) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigTransportGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hroutertransport, jlong ppglobalinfo, jlong lpdwglobalinfosize, jlong ppclientinterfaceinfo, jlong lpdwclientinterfaceinfosize, jlong lplpwsdllpath) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprConfigTransportSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hroutertransport, jlong pglobalinfo, jint dwglobalinfosize, jlong pclientinterfaceinfo, jint dwclientinterfaceinfosize, jlong lpwsdllpath) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprInfoBlockAdd(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jint dwinfotype, jint dwitemsize, jint dwitemcount, jlong lpitemdata, jlong lplpnewheader) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprInfoBlockFind(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jint dwinfotype, jlong lpdwitemsize, jlong lpdwitemcount, jlong lplpitemdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprInfoBlockQuerySize(JNIEnv* km_env, jclass km_clazz, jlong lpheader) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprInfoBlockRemove(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jint dwinfotype, jlong lplpnewheader) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprInfoBlockSet(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jint dwinfotype, jint dwitemsize, jint dwitemcount, jlong lpitemdata, jlong lplpnewheader) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprInfoCreate(JNIEnv* km_env, jclass km_clazz, jint dwversion, jlong lplpnewheader) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprInfoDelete(JNIEnv* km_env, jclass km_clazz, jlong lpheader) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprInfoDuplicate(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jlong lplpnewheader) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1mprInfoRemoveAll(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jlong lplpnewheader) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasClearConnectionStatistics(JNIEnv* km_env, jclass km_clazz, jlong hrasconn) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasClearLinkStatistics(JNIEnv* km_env, jclass km_clazz, jlong hrasconn, jint dwsubentry) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasConnectionNotificationA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasConnectionNotificationW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasCreatePhonebookEntryA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasCreatePhonebookEntryW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasDeleteEntryA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasDeleteEntryW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasDeleteSubEntryA(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jint dwsubentryid) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasDeleteSubEntryW(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jint dwsubentryid) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasDialA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasDialDlgA(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpszphonenumber, jlong lpinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasDialDlgW(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpszphonenumber, jlong lpinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasDialW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasEditPhonebookEntryA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasEditPhonebookEntryW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasEntryDlgA(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasEntryDlgW(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasEnumAutodialAddressesA(JNIEnv* km_env, jclass km_clazz, jlong lpprasautodialaddresses, jlong lpdwcbrasautodialaddresses, jlong lpdwcrasautodialaddresses) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasEnumAutodialAddressesW(JNIEnv* km_env, jclass km_clazz, jlong lpprasautodialaddresses, jlong lpdwcbrasautodialaddresses, jlong lpdwcrasautodialaddresses) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasEnumConnectionsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasEnumConnectionsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasEnumDevicesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasEnumDevicesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasEnumEntriesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasEnumEntriesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasFreeEapUserIdentityA(JNIEnv* km_env, jclass km_clazz, jlong praseapuseridentity) {
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasFreeEapUserIdentityW(JNIEnv* km_env, jclass km_clazz, jlong praseapuseridentity) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetAutodialAddressA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetAutodialAddressW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetAutodialEnableA(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetAutodialEnableW(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetAutodialParamA(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetAutodialParamW(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetConnectStatusA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetConnectStatusW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetConnectionStatistics(JNIEnv* km_env, jclass km_clazz, jlong hrasconn, jlong lpstatistics) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetCountryInfoA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetCountryInfoW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetCustomAuthDataA(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jlong pbcustomauthdata, jlong pdwsizeofcustomauthdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetCustomAuthDataW(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jlong pbcustomauthdata, jlong pdwsizeofcustomauthdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetEapUserDataA(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong pszphonebook, jlong pszentry, jlong pbeapdata, jlong pdwsizeofeapdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetEapUserDataW(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong pszphonebook, jlong pszentry, jlong pbeapdata, jlong pdwsizeofeapdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetEapUserIdentityA(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jint dwflags, jlong hwnd, jlong ppraseapuseridentity) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetEapUserIdentityW(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jint dwflags, jlong hwnd, jlong ppraseapuseridentity) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetEntryDialParamsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetEntryDialParamsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetEntryPropertiesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetEntryPropertiesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetErrorStringA(JNIEnv* km_env, jclass km_clazz, jint resourceid, jlong lpszstring, jint inbufsize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetErrorStringW(JNIEnv* km_env, jclass km_clazz, jint resourceid, jlong lpszstring, jint inbufsize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetLinkStatistics(JNIEnv* km_env, jclass km_clazz, jlong hrasconn, jint dwsubentry, jlong lpstatistics) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetPCscf(JNIEnv* km_env, jclass km_clazz, jlong lpszpcscf) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetProjectionInfoA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jlong param3) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetProjectionInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hrasconn, jlong prasprojection, jlong lpdwsize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetProjectionInfoW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jlong param3) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetSubEntryHandleA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetSubEntryHandleW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetSubEntryPropertiesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasGetSubEntryPropertiesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasHangUpA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasHangUpW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasInvokeEapUI(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jlong param3) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasPhonebookDlgA(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasPhonebookDlgW(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasRenameEntryA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasRenameEntryW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetAutodialAddressA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetAutodialAddressW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetAutodialEnableA(JNIEnv* km_env, jclass km_clazz, jint param0, jint param1) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetAutodialEnableW(JNIEnv* km_env, jclass km_clazz, jint param0, jint param1) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetAutodialParamA(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1, jint param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetAutodialParamW(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1, jint param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetCustomAuthDataA(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jlong pbcustomauthdata, jint dwsizeofcustomauthdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetCustomAuthDataW(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jlong pbcustomauthdata, jint dwsizeofcustomauthdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetEapUserDataA(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong pszphonebook, jlong pszentry, jlong pbeapdata, jint dwsizeofeapdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetEapUserDataW(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong pszphonebook, jlong pszentry, jlong pbeapdata, jint dwsizeofeapdata) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetEntryDialParamsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetEntryDialParamsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetEntryPropertiesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jint param5) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetEntryPropertiesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jint param5) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetSubEntryPropertiesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jint param6) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasSetSubEntryPropertiesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jint param6) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasUpdateConnection(JNIEnv* km_env, jclass km_clazz, jlong hrasconn, jlong lprasupdateconn) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasValidateEntryNameA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rasValidateEntryNameW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmAddNextHop(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthopinfo, jlong nexthophandle, jlong changeflags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmAddRouteToDest(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jlong destaddress, jlong routeinfo, jint timetolive, jlong routelisthandle, jint notifytype, jlong notifyhandle, jlong changeflags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmBlockMethods(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong targethandle, jbyte targettype, jint blockingflag) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmConvertNetAddressToIpv6AddressAndLength(JNIEnv* km_env, jclass km_clazz, jlong pnetaddress, jlong paddress, jlong plength, jint dwaddresssize) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmCreateDestEnum(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint targetviews, jint enumflags, jlong netaddress, jint protocolid, jlong rtmenumhandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmCreateNextHopEnum(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint enumflags, jlong netaddress, jlong rtmenumhandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmCreateRouteEnum(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jint targetviews, jint enumflags, jlong startdest, jint matchingflags, jlong criteriaroute, jint criteriainterface, jlong rtmenumhandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmCreateRouteList(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routelisthandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmCreateRouteListEnum(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routelisthandle, jlong rtmenumhandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmDeleteEnumHandle(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong enumhandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmDeleteNextHop(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthophandle, jlong nexthopinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmDeleteRouteList(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routelisthandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmDeleteRouteToDest(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jlong changeflags) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmDeregisterEntity(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmDeregisterFromChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmFindNextHop(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthopinfo, jlong nexthophandle, jlong nexthoppointer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetChangeStatus(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jlong desthandle, jlong changestatus) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetChangedDests(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jlong numdests, jlong changeddests) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetDestInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jint protocolid, jint targetviews, jlong destinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetEntityInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong entityhandle, jlong entityinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetEntityMethods(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong entityhandle, jlong nummethods, jlong exptmethods) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetEnumDests(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong enumhandle, jlong numdests, jlong destinfos) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetEnumNextHops(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong enumhandle, jlong numnexthops, jlong nexthophandles) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetEnumRoutes(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong enumhandle, jlong numroutes, jlong routehandles) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetExactMatchDestination(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong destaddress, jint protocolid, jint targetviews, jlong destinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetExactMatchRoute(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong destaddress, jint matchingflags, jlong routeinfo, jint interfaceindex, jint targetviews, jlong routehandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetLessSpecificDestination(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jint protocolid, jint targetviews, jlong destinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetListEnumRoutes(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong enumhandle, jlong numroutes, jlong routehandles) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetMostSpecificDestination(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong destaddress, jint protocolid, jint targetviews, jlong destinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetNextHopInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthophandle, jlong nexthopinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetNextHopPointer(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthophandle, jlong nexthoppointer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetOpaqueInformationPointer(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jlong opaqueinfopointer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetRegisteredEntities(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong numentities, jlong entityhandles, jlong entityinfos) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetRouteInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jlong routeinfo, jlong destaddress) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmGetRoutePointer(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jlong routepointer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmHoldDestination(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jint targetviews, jint holdtime) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmIgnoreChangedDests(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jint numdests, jlong changeddests) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmInsertInRouteList(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routelisthandle, jint numroutes, jlong routehandles) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmInvokeMethod(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong entityhandle, jlong input, jlong outputsize, jlong output) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmIsBestRoute(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jlong bestinviews) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmIsMarkedForChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jlong desthandle, jlong destmarked) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmLockDestination(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jint exclusive, jint lockdest) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmLockNextHop(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthophandle, jint exclusive, jint locknexthop, jlong nexthoppointer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmLockRoute(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jint exclusive, jint lockroute, jlong routepointer) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmMarkDestForChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jlong desthandle, jint markdest) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmReferenceHandles(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint numhandles, jlong rtmhandles) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmRegisterEntity(JNIEnv* km_env, jclass km_clazz, jlong rtmentityinfo, jlong exportmethods, jlong eventcallback, jint reserveopaquepointer, jlong rtmregprofile, jlong rtmreghandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmRegisterForChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint targetviews, jint notifyflags, jlong notifycontext, jlong notifyhandle) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmReleaseChangedDests(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jint numdests, jlong changeddests) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmReleaseDestInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong destinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmReleaseDests(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint numdests, jlong destinfos) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmReleaseEntities(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint numentities, jlong entityhandles) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmReleaseEntityInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong entityinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmReleaseNextHopInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthopinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmReleaseNextHops(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint numnexthops, jlong nexthophandles) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmReleaseRouteInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routeinfo) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmReleaseRoutes(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint numroutes, jlong routehandles) {
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssys_1windows_1win32_1networkmanagement_1rras_1rtmUpdateAndUnlockRoute(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jint timetolive, jlong routelisthandle, jint notifytype, jlong notifyhandle, jlong changeflags) {
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

